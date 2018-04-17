package com.aptana.js.core.parsing.antlr;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ParseInfo;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.IterativeParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.aptana.core.build.IProblem;
import com.aptana.js.core.IJSConstants;
import com.aptana.js.core.parsing.antlr.JSParser.ProgramContext;
import com.aptana.js.core.parsing.antlr.ast.JSASTWalker;
import com.aptana.js.core.parsing.ast.JSParseRootNode;
import com.aptana.parsing.IParseState;
import com.aptana.parsing.IParser;
import com.aptana.parsing.ParseResult;
import com.aptana.parsing.WorkingParseResult;
import com.aptana.parsing.ast.ParseError;

public class JSWrappingParser implements IParser
{
	private static final boolean PROFILE = false;
	private static final boolean USE_TWO_PASS = false;

	@Override
	public synchronized ParseResult parse(IParseState parseState) throws java.lang.Exception
	{
		WorkingParseResult working = new WorkingParseResult();
		parse(parseState, working);
		return working.getImmutableResult();
	}

	private void parse(IParseState parseState, final WorkingParseResult working)
	{

		String source = parseState.getSource();
		CharStream stream = CharStreams.fromString(source);
		// FIXME We cannot use an unbuffered char stream, because Token.getText() is called too often to be able to replace this.
		// This means we basically have two copies of the source in memory now, which is BADDDDDDD!
		// stream = new UnbufferedCharStream(new StringReader(source));

		JSLexer lexer = new JSLexer(stream);
		lexer.setTokenFactory(new PoolingTokenFactory());
		TokenStream input = new FilteringMaxCapacityTokenStream(lexer);
		JSParser parser = new JSParser(input);
		parser.addErrorListener(new ErrorListener(working));
		parser.setTrimParseTree(true);

		// TODO We can attach our AST conversion listener to fire during parse here, and then we may be able to get away
		// with using an unbuffered CharStream since the token text values should be in the current interval
		// BUT, right now the way it's written, it assumes we run post-parse so that future tokens would be available,
		// i.e. the assignment operator in an AssignmentExpression
		// we'd have to modify it to create the node empty and set the tokens in exit
		// JSASTWalker astWalker = new JSASTWalker();
		// parser.addParseListener(astWalker);

		// FIXME This is still much slower than the beaver parser. How can we speed it up? For one, we should get the
		// faster SLL mode working on all our unit tests!
		ProgramContext pc = null;
		if (PROFILE)
		{
			parser.setProfile(true);
			parser.addErrorListener(new DiagnosticErrorListener());
			parser.addErrorListener(new ConsoleErrorListener());
		}

		if (USE_TWO_PASS)
		{
			// This is the fastest settings. We're supposed to fall back to DefaultErrorStrategy and LL if this fails!
			// (i.e. a ParseCancellationException)
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			parser.setErrorHandler(new BailErrorStrategy());
		}
		else
		{
			// Use a custom extension of DefaultErrorStrategy that knows the most common cases, like missing semicolons?

			// TODO We had written some custom error recovery code for our JS parser before. Can we replicate that here?
			// See JS.grammar#379-440
			// - try inserting ";"
			// - try inserting ");"
			// - try inserting empty identifier and ";" after: '.', 'new', or '='
			// - try inserting empty identifier after: '.', 'new', or '='
			// - try inserting empty identifier after '('
			// - try inserting empty identifier ':' after: '.'
			// - try inserting "{}" after: ')'
			// - seems to try and recover from trailing commas (inside parens)
			// - try inserting empty identifier if current token is (i.e. before) '}'
			// - try inserting ':' and empty identifier if current token is (i.e. before) '}'
			parser.setErrorHandler(new DefaultErrorStrategy());
		}
		try
		{
			pc = parser.program();
		}
		catch (ParseCancellationException e)
		{
			if (USE_TWO_PASS)
			{
				parser.getInterpreter().setPredictionMode(PredictionMode.LL);
				parser.setErrorHandler(new DefaultErrorStrategy());
				pc = parser.program();
			}
		}

		// Call when we can do listener during parse rather than post-parse!
		// JSParseRootNode rootNode = astWalker.getRootNode();
		JSParseRootNode rootNode = convertAST(pc);
		if (PROFILE)
		{
			recordParseInfo(parser);
		}
		working.setParseResult(rootNode);
	}

	private void recordParseInfo(JSParser parser)
	{
		ParseInfo pi = parser.getParseInfo();
		System.out.println("DFA size: " + pi.getDFASize()); //$NON-NLS-1$
		System.out.println("ATN lookahead ops: " + pi.getTotalATNLookaheadOps()); //$NON-NLS-1$
		System.out.println("LLATN lookahead ops: " + pi.getTotalLLATNLookaheadOps()); //$NON-NLS-1$
		System.out.println("LL lookahead ops: " + pi.getTotalLLLookaheadOps()); //$NON-NLS-1$
		System.out.println("SLLATN lookahead ops: " + pi.getTotalSLLATNLookaheadOps()); //$NON-NLS-1$
		System.out.println("SLL lookahead ops: " + pi.getTotalSLLLookaheadOps()); //$NON-NLS-1$
		System.out.println("Total time in prediction: " + pi.getTotalTimeInPrediction()); //$NON-NLS-1$
		System.out.println("LL Decisions: " + pi.getLLDecisions()); //$NON-NLS-1$
	}

	private JSParseRootNode convertAST(ProgramContext pc)
	{
		ParseTreeWalker walker = new IterativeParseTreeWalker();
		JSASTWalker listener = new JSASTWalker();
		walker.walk(listener, pc);
		return listener.getRootNode();
	}

	private final class ErrorListener extends BaseErrorListener
	{
		private final WorkingParseResult working;

		private ErrorListener(WorkingParseResult working)
		{
			super();
			this.working = working;
		}

		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e)
		{
			// FIXME Convert the arg1 object here into a Symbol?
			working.addError(new ParseError(IJSConstants.CONTENT_TYPE_JS, line, msg, IProblem.Severity.WARNING));
		}
	}
}
