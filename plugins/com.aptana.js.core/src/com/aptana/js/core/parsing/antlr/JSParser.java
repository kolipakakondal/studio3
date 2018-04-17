// Generated from /Users/cwilliams/repos/studio3/plugins/com.aptana.js.core/parsing/JS.g4 by ANTLR 4.7
package com.aptana.js.core.parsing.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, RegularExpressionLiteral=3, LineTerminator=4, OpenBracket=5, 
		CloseBracket=6, OpenParen=7, CloseParen=8, OpenBrace=9, CloseBrace=10, 
		SemiColon=11, Comma=12, Arrow=13, Assign=14, QuestionMark=15, Colon=16, 
		Ellipsis=17, Dot=18, PlusPlus=19, MinusMinus=20, Plus=21, Minus=22, BitNot=23, 
		Not=24, Multiply=25, Divide=26, Modulus=27, RightShiftArithmetic=28, LeftShiftArithmetic=29, 
		RightShiftLogical=30, LessThan=31, MoreThan=32, LessThanEquals=33, GreaterThanEquals=34, 
		Equals=35, NotEquals=36, IdentityEquals=37, IdentityNotEquals=38, BitAnd=39, 
		BitXOr=40, BitOr=41, And=42, Or=43, MultiplyAssign=44, DivideAssign=45, 
		ModulusAssign=46, PlusAssign=47, MinusAssign=48, LeftShiftArithmeticAssign=49, 
		RightShiftArithmeticAssign=50, RightShiftLogicalAssign=51, BitAndAssign=52, 
		BitXorAssign=53, BitOrAssign=54, NullLiteral=55, BooleanLiteral=56, DecimalLiteral=57, 
		HexIntegerLiteral=58, OctalIntegerLiteral=59, BinaryIntegerLiteral=60, 
		Break=61, Do=62, Instanceof=63, Typeof=64, Case=65, Else=66, New=67, Var=68, 
		Catch=69, Finally=70, Return=71, Void=72, Continue=73, For=74, Switch=75, 
		While=76, Debugger=77, Function=78, This=79, With=80, Default=81, If=82, 
		Throw=83, Delete=84, In=85, Try=86, Export=87, Class=88, Extends=89, Const=90, 
		Super=91, Yield=92, Import=93, Static=94, Let=95, Enum=96, Await=97, Implements=98, 
		Private=99, Public=100, Interface=101, Package=102, Protected=103, Identifier=104, 
		StringLiteral=105, WhiteSpaces=106, MultiLineComment=107, SingleLineComment=108, 
		UnexpectedCharacter=109, NoSubstitutionTemplate=110, TemplateHead=111, 
		TemplateMiddle=112, TemplateTail=113;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_hoistableDeclaration = 3, 
		RULE_breakableStatement = 4, RULE_blockStatement = 5, RULE_block = 6, 
		RULE_statementList = 7, RULE_statementListItem = 8, RULE_lexicalDeclaration = 9, 
		RULE_letOrConst = 10, RULE_bindingList = 11, RULE_lexicalBinding = 12, 
		RULE_variableStatement = 13, RULE_variableDeclarationList = 14, RULE_variableDeclaration = 15, 
		RULE_bindingPattern = 16, RULE_objectBindingPattern = 17, RULE_arrayBindingPattern = 18, 
		RULE_bindingPropertyList = 19, RULE_bindingElementList = 20, RULE_bindingElisionElement = 21, 
		RULE_bindingProperty = 22, RULE_bindingElement = 23, RULE_singleNameBinding = 24, 
		RULE_bindingRestElement = 25, RULE_initializer = 26, RULE_emptyStatement = 27, 
		RULE_expressionStatement = 28, RULE_ifStatement = 29, RULE_iterationStatement = 30, 
		RULE_variableDeclarationStatement = 31, RULE_varForDeclaration = 32, RULE_forDeclaration = 33, 
		RULE_forBinding = 34, RULE_continueStatement = 35, RULE_breakStatement = 36, 
		RULE_returnStatement = 37, RULE_withStatement = 38, RULE_switchStatement = 39, 
		RULE_caseBlock = 40, RULE_caseClauses = 41, RULE_caseClause = 42, RULE_defaultClause = 43, 
		RULE_labelledStatement = 44, RULE_labelledItem = 45, RULE_throwStatement = 46, 
		RULE_tryStatement = 47, RULE_catchProduction = 48, RULE_finallyProduction = 49, 
		RULE_catchParameter = 50, RULE_debuggerStatement = 51, RULE_functionDeclaration = 52, 
		RULE_strictFormalParameters = 53, RULE_formalParameters = 54, RULE_formalParameterList = 55, 
		RULE_formalsList = 56, RULE_functionRestParameter = 57, RULE_formalParameter = 58, 
		RULE_functionBody = 59, RULE_functionStatementList = 60, RULE_arrowFunction = 61, 
		RULE_arrowParameters = 62, RULE_conciseBody = 63, RULE_coverParenthesizedExpressionAndArrowParameterList = 64, 
		RULE_methodDefinition = 65, RULE_propertySetParameterList = 66, RULE_generatorMethod = 67, 
		RULE_generatorDeclaration = 68, RULE_generatorExpression = 69, RULE_generatorBody = 70, 
		RULE_classDeclaration = 71, RULE_classExpression = 72, RULE_classTail = 73, 
		RULE_classHeritage = 74, RULE_classBody = 75, RULE_classElementList = 76, 
		RULE_classElement = 77, RULE_arrayLiteral = 78, RULE_elementList = 79, 
		RULE_elision = 80, RULE_spreadElement = 81, RULE_objectLiteral = 82, RULE_propertyDefinitionList = 83, 
		RULE_propertyDefinition = 84, RULE_propertyName = 85, RULE_literalPropertyName = 86, 
		RULE_computedPropertyName = 87, RULE_coverInitializedName = 88, RULE_arguments = 89, 
		RULE_argumentList = 90, RULE_expressionSequence = 91, RULE_singleExpression = 92, 
		RULE_script = 93, RULE_scriptBody = 94, RULE_module = 95, RULE_moduleBody = 96, 
		RULE_moduleItemList = 97, RULE_moduleItem = 98, RULE_importDeclaration = 99, 
		RULE_importClause = 100, RULE_importedDefaultBinding = 101, RULE_nameSpaceImport = 102, 
		RULE_namedImports = 103, RULE_fromClause = 104, RULE_importsList = 105, 
		RULE_importSpecifier = 106, RULE_moduleSpecifier = 107, RULE_importedBinding = 108, 
		RULE_exportDeclaration = 109, RULE_exportClause = 110, RULE_exportsList = 111, 
		RULE_exportSpecifier = 112, RULE_assignmentOperator = 113, RULE_literal = 114, 
		RULE_numericLiteral = 115, RULE_identifierName = 116, RULE_identifierReference = 117, 
		RULE_bindingIdentifier = 118, RULE_labelIdentifier = 119, RULE_reservedWord = 120, 
		RULE_keyword = 121, RULE_futureReservedWord = 122, RULE_eos = 123, RULE_eof = 124, 
		RULE_templateLiteral = 125, RULE_templateSpans = 126, RULE_templateMiddleList = 127;
	public static final String[] ruleNames = {
		"program", "statement", "declaration", "hoistableDeclaration", "breakableStatement", 
		"blockStatement", "block", "statementList", "statementListItem", "lexicalDeclaration", 
		"letOrConst", "bindingList", "lexicalBinding", "variableStatement", "variableDeclarationList", 
		"variableDeclaration", "bindingPattern", "objectBindingPattern", "arrayBindingPattern", 
		"bindingPropertyList", "bindingElementList", "bindingElisionElement", 
		"bindingProperty", "bindingElement", "singleNameBinding", "bindingRestElement", 
		"initializer", "emptyStatement", "expressionStatement", "ifStatement", 
		"iterationStatement", "variableDeclarationStatement", "varForDeclaration", 
		"forDeclaration", "forBinding", "continueStatement", "breakStatement", 
		"returnStatement", "withStatement", "switchStatement", "caseBlock", "caseClauses", 
		"caseClause", "defaultClause", "labelledStatement", "labelledItem", "throwStatement", 
		"tryStatement", "catchProduction", "finallyProduction", "catchParameter", 
		"debuggerStatement", "functionDeclaration", "strictFormalParameters", 
		"formalParameters", "formalParameterList", "formalsList", "functionRestParameter", 
		"formalParameter", "functionBody", "functionStatementList", "arrowFunction", 
		"arrowParameters", "conciseBody", "coverParenthesizedExpressionAndArrowParameterList", 
		"methodDefinition", "propertySetParameterList", "generatorMethod", "generatorDeclaration", 
		"generatorExpression", "generatorBody", "classDeclaration", "classExpression", 
		"classTail", "classHeritage", "classBody", "classElementList", "classElement", 
		"arrayLiteral", "elementList", "elision", "spreadElement", "objectLiteral", 
		"propertyDefinitionList", "propertyDefinition", "propertyName", "literalPropertyName", 
		"computedPropertyName", "coverInitializedName", "arguments", "argumentList", 
		"expressionSequence", "singleExpression", "script", "scriptBody", "module", 
		"moduleBody", "moduleItemList", "moduleItem", "importDeclaration", "importClause", 
		"importedDefaultBinding", "nameSpaceImport", "namedImports", "fromClause", 
		"importsList", "importSpecifier", "moduleSpecifier", "importedBinding", 
		"exportDeclaration", "exportClause", "exportsList", "exportSpecifier", 
		"assignmentOperator", "literal", "numericLiteral", "identifierName", "identifierReference", 
		"bindingIdentifier", "labelIdentifier", "reservedWord", "keyword", "futureReservedWord", 
		"eos", "eof", "templateLiteral", "templateSpans", "templateMiddleList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'as'", "'from'", null, null, "'['", "']'", "'('", "')'", "'{'", 
		"'}'", "';'", "','", "'=>'", "'='", "'?'", "':'", "'...'", "'.'", "'++'", 
		"'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'>>'", "'<<'", 
		"'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", 
		"'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", 
		"'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'null'", null, null, 
		null, null, null, "'break'", "'do'", "'instanceof'", "'typeof'", "'case'", 
		"'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", 
		"'continue'", "'for'", "'switch'", "'while'", "'debugger'", "'function'", 
		"'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", 
		"'try'", "'export'", "'class'", "'extends'", "'const'", "'super'", "'yield'", 
		"'import'", "'static'", "'let'", "'enum'", "'await'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "RegularExpressionLiteral", "LineTerminator", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Arrow", "Assign", "QuestionMark", "Colon", "Ellipsis", 
		"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
		"Divide", "Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
		"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
		"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "Break", "Do", "Instanceof", 
		"Typeof", "Case", "Else", "New", "Var", "Catch", "Finally", "Return", 
		"Void", "Continue", "For", "Switch", "While", "Debugger", "Function", 
		"This", "With", "Default", "If", "Throw", "Delete", "In", "Try", "Export", 
		"Class", "Extends", "Const", "Super", "Yield", "Import", "Static", "Let", 
		"Enum", "Await", "Implements", "Private", "Public", "Interface", "Package", 
		"Protected", "Identifier", "StringLiteral", "WhiteSpaces", "MultiLineComment", 
		"SingleLineComment", "UnexpectedCharacter", "NoSubstitutionTemplate", 
		"TemplateHead", "TemplateMiddle", "TemplateTail"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  
	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token of the given {@code type} exists on the
	     * {@code HIDDEN} channel.
	     *
	     * @param type
	     *         the type of the token on the {@code HIDDEN} channel
	     *         to check.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token of the given {@code type} exists on the
	     * {@code HIDDEN} channel.
	     */
	    private boolean here(final int type) {

	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);

	        // Check if the token resides on the HIDDEN channel and if it's of the
	        // provided type.
	        return (ahead.getChannel() == Lexer.HIDDEN) && (ahead.getType() == type);
	    }

	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     */
	    private boolean lineTerminatorAhead() {

	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        if (possibleIndexEosToken < 0) {
	            return false;
	        }
	        Token ahead = _input.get(possibleIndexEosToken);

	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // We're only interested in tokens on the HIDDEN channel.
	            return false;
	        }

	        if (ahead.getType() == LineTerminator) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.getType() == WhiteSpaces) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        String text = ahead.getText();
	        int type = ahead.getType();

	        // Check if the token is, or contains a line terminator.
	        return (type == MultiLineComment && (text.contains("\r") || text.contains("\n"))) ||
	                (type == LineTerminator);
	    }                                

	public JSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JSParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			module();
			setState(257);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BreakableStatementContext breakableStatement() {
			return getRuleContext(BreakableStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				breakableStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(268);
				withStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(269);
				labelledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(270);
				throwStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(271);
				tryStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(272);
				debuggerStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public HoistableDeclarationContext hoistableDeclaration() {
			return getRuleContext(HoistableDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public LexicalDeclarationContext lexicalDeclaration() {
			return getRuleContext(LexicalDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				hoistableDeclaration();
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				classDeclaration();
				}
				break;
			case Const:
			case Let:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				lexicalDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HoistableDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public GeneratorDeclarationContext generatorDeclaration() {
			return getRuleContext(GeneratorDeclarationContext.class,0);
		}
		public HoistableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hoistableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterHoistableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitHoistableDeclaration(this);
		}
	}

	public final HoistableDeclarationContext hoistableDeclaration() throws RecognitionException {
		HoistableDeclarationContext _localctx = new HoistableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hoistableDeclaration);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				generatorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakableStatementContext extends ParserRuleContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BreakableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBreakableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBreakableStatement(this);
		}
	}

	public final BreakableStatementContext breakableStatement() throws RecognitionException {
		BreakableStatementContext _localctx = new BreakableStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_breakableStatement);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Do:
			case For:
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				iterationStatement();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(OpenBrace);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(291);
				statementList();
				}
				break;
			}
			setState(294);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementListItemContext> statementListItem() {
			return getRuleContexts(StatementListItemContext.class);
		}
		public StatementListItemContext statementListItem(int i) {
			return getRuleContext(StatementListItemContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(296);
					statementListItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitStatementListItem(this);
		}
	}

	public final StatementListItemContext statementListItem() throws RecognitionException {
		StatementListItemContext _localctx = new StatementListItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementListItem);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexicalDeclarationContext extends ParserRuleContext {
		public LetOrConstContext letOrConst() {
			return getRuleContext(LetOrConstContext.class,0);
		}
		public BindingListContext bindingList() {
			return getRuleContext(BindingListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public LexicalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexicalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLexicalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLexicalDeclaration(this);
		}
	}

	public final LexicalDeclarationContext lexicalDeclaration() throws RecognitionException {
		LexicalDeclarationContext _localctx = new LexicalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lexicalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			letOrConst();
			setState(306);
			bindingList();
			setState(307);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetOrConstContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(JSParser.Let, 0); }
		public TerminalNode Const() { return getToken(JSParser.Const, 0); }
		public LetOrConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letOrConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLetOrConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLetOrConst(this);
		}
	}

	public final LetOrConstContext letOrConst() throws RecognitionException {
		LetOrConstContext _localctx = new LetOrConstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letOrConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Let) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingListContext extends ParserRuleContext {
		public List<LexicalBindingContext> lexicalBinding() {
			return getRuleContexts(LexicalBindingContext.class);
		}
		public LexicalBindingContext lexicalBinding(int i) {
			return getRuleContext(LexicalBindingContext.class,i);
		}
		public BindingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingList(this);
		}
	}

	public final BindingListContext bindingList() throws RecognitionException {
		BindingListContext _localctx = new BindingListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bindingList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			lexicalBinding();
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(Comma);
					setState(313);
					lexicalBinding();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexicalBindingContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public LexicalBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexicalBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLexicalBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLexicalBinding(this);
		}
	}

	public final LexicalBindingContext lexicalBinding() throws RecognitionException {
		LexicalBindingContext _localctx = new LexicalBindingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lexicalBinding);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				bindingIdentifier();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(320);
					initializer();
					}
					break;
				}
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				bindingPattern();
				setState(324);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			variableDeclarationStatement();
			setState(329);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			variableDeclaration();
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					match(Comma);
					setState(333);
					variableDeclaration();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				bindingIdentifier();
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(340);
					initializer();
					}
					break;
				}
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				bindingPattern();
				setState(344);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingPatternContext extends ParserRuleContext {
		public ObjectBindingPatternContext objectBindingPattern() {
			return getRuleContext(ObjectBindingPatternContext.class,0);
		}
		public ArrayBindingPatternContext arrayBindingPattern() {
			return getRuleContext(ArrayBindingPatternContext.class,0);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingPattern(this);
		}
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bindingPattern);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				objectBindingPattern();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				arrayBindingPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectBindingPatternContext extends ParserRuleContext {
		public BindingPropertyListContext bindingPropertyList() {
			return getRuleContext(BindingPropertyListContext.class,0);
		}
		public ObjectBindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterObjectBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitObjectBindingPattern(this);
		}
	}

	public final ObjectBindingPatternContext objectBindingPattern() throws RecognitionException {
		ObjectBindingPatternContext _localctx = new ObjectBindingPatternContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objectBindingPattern);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(OpenBrace);
				setState(353);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(OpenBrace);
				setState(355);
				bindingPropertyList();
				setState(356);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(OpenBrace);
				setState(359);
				bindingPropertyList();
				setState(360);
				match(Comma);
				setState(361);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayBindingPatternContext extends ParserRuleContext {
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public BindingRestElementContext bindingRestElement() {
			return getRuleContext(BindingRestElementContext.class,0);
		}
		public BindingElementListContext bindingElementList() {
			return getRuleContext(BindingElementListContext.class,0);
		}
		public ArrayBindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArrayBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArrayBindingPattern(this);
		}
	}

	public final ArrayBindingPatternContext arrayBindingPattern() throws RecognitionException {
		ArrayBindingPatternContext _localctx = new ArrayBindingPatternContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayBindingPattern);
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(OpenBracket);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(366);
					elision();
					}
				}

				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(369);
					bindingRestElement();
					}
				}

				setState(372);
				match(CloseBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(OpenBracket);
				setState(374);
				bindingElementList();
				setState(375);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(OpenBracket);
				setState(378);
				bindingElementList();
				setState(379);
				match(Comma);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(380);
					elision();
					}
				}

				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(383);
					bindingRestElement();
					}
				}

				setState(386);
				match(CloseBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingPropertyListContext extends ParserRuleContext {
		public List<BindingPropertyContext> bindingProperty() {
			return getRuleContexts(BindingPropertyContext.class);
		}
		public BindingPropertyContext bindingProperty(int i) {
			return getRuleContext(BindingPropertyContext.class,i);
		}
		public BindingPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingPropertyList(this);
		}
	}

	public final BindingPropertyListContext bindingPropertyList() throws RecognitionException {
		BindingPropertyListContext _localctx = new BindingPropertyListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bindingPropertyList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			bindingProperty();
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					match(Comma);
					setState(392);
					bindingProperty();
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingElementListContext extends ParserRuleContext {
		public List<BindingElisionElementContext> bindingElisionElement() {
			return getRuleContexts(BindingElisionElementContext.class);
		}
		public BindingElisionElementContext bindingElisionElement(int i) {
			return getRuleContext(BindingElisionElementContext.class,i);
		}
		public BindingElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingElementList(this);
		}
	}

	public final BindingElementListContext bindingElementList() throws RecognitionException {
		BindingElementListContext _localctx = new BindingElementListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bindingElementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			bindingElisionElement();
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					match(Comma);
					setState(400);
					bindingElisionElement();
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingElisionElementContext extends ParserRuleContext {
		public BindingElementContext bindingElement() {
			return getRuleContext(BindingElementContext.class,0);
		}
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public BindingElisionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingElisionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingElisionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingElisionElement(this);
		}
	}

	public final BindingElisionElementContext bindingElisionElement() throws RecognitionException {
		BindingElisionElementContext _localctx = new BindingElisionElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bindingElisionElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(406);
				elision();
				}
			}

			setState(409);
			bindingElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingPropertyContext extends ParserRuleContext {
		public SingleNameBindingContext singleNameBinding() {
			return getRuleContext(SingleNameBindingContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public BindingElementContext bindingElement() {
			return getRuleContext(BindingElementContext.class,0);
		}
		public BindingPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingProperty(this);
		}
	}

	public final BindingPropertyContext bindingProperty() throws RecognitionException {
		BindingPropertyContext _localctx = new BindingPropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bindingProperty);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				singleNameBinding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				propertyName();
				setState(413);
				match(Colon);
				setState(414);
				bindingElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingElementContext extends ParserRuleContext {
		public SingleNameBindingContext singleNameBinding() {
			return getRuleContext(SingleNameBindingContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public BindingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingElement(this);
		}
	}

	public final BindingElementContext bindingElement() throws RecognitionException {
		BindingElementContext _localctx = new BindingElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bindingElement);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				singleNameBinding();
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				bindingPattern();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(420);
					initializer();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleNameBindingContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public SingleNameBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleNameBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterSingleNameBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitSingleNameBinding(this);
		}
	}

	public final SingleNameBindingContext singleNameBinding() throws RecognitionException {
		SingleNameBindingContext _localctx = new SingleNameBindingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_singleNameBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			bindingIdentifier();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(426);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingRestElementContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public BindingRestElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingRestElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingRestElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingRestElement(this);
		}
	}

	public final BindingRestElementContext bindingRestElement() throws RecognitionException {
		BindingRestElementContext _localctx = new BindingRestElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bindingRestElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(Ellipsis);
			setState(430);
			bindingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Assign);
			setState(433);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JSParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			if (!((_input.LA(1) != OpenBrace) && (_input.LA(1) != Function) && (_input.LA(1) != Class) && ((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true))) throw new FailedPredicateException(this, "(_input.LA(1) != OpenBrace) && (_input.LA(1) != Function) && (_input.LA(1) != Class) && ((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true)");
			setState(438);
			expressionSequence();
			setState(439);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JSParser.If, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(JSParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(If);
			setState(442);
			match(OpenParen);
			setState(443);
			expressionSequence();
			setState(444);
			match(CloseParen);
			setState(445);
			statement();
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(446);
				match(Else);
				setState(447);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLexicalOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLexicalOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForLexicalOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForLexicalOfStatement(this);
		}
	}
	public static class ForVarOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public VarForDeclarationContext varForDeclaration() {
			return getRuleContext(VarForDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForVarOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForVarOfStatement(this);
		}
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public VarForDeclarationContext varForDeclaration() {
			return getRuleContext(VarForDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(JSParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForVarInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForVarInStatement(this);
		}
	}
	public static class ForLexicalInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(JSParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLexicalInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForLexicalInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForLexicalInStatement(this);
		}
	}
	public static class ForLoopStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForLoopStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForLoopStatement(this);
		}
	}
	public static class ForVarLoopStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarLoopStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForVarLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForVarLoopStatement(this);
		}
	}
	public static class ForLexicalLoopStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public LexicalDeclarationContext lexicalDeclaration() {
			return getRuleContext(LexicalDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForLexicalLoopStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForLexicalLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForLexicalLoopStatement(this);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(JSParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitWhileStatement(this);
		}
	}
	public static class DoWhileStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(JSParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(JSParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoWhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitDoWhileStatement(this);
		}
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(JSParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForInStatement(this);
		}
	}
	public static class ForOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForOfStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_iterationStatement);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(Do);
				setState(451);
				statement();
				setState(452);
				match(While);
				setState(453);
				match(OpenParen);
				setState(454);
				expressionSequence();
				setState(455);
				match(CloseParen);
				setState(456);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(While);
				setState(459);
				match(OpenParen);
				setState(460);
				expressionSequence();
				setState(461);
				match(CloseParen);
				setState(462);
				statement();
				}
				break;
			case 3:
				_localctx = new ForLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(For);
				setState(465);
				match(OpenParen);
				setState(466);
				if (!(((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true))) throw new FailedPredicateException(this, "((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true)");
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
					{
					setState(467);
					expressionSequence();
					}
				}

				setState(470);
				match(SemiColon);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
					{
					setState(471);
					expressionSequence();
					}
				}

				setState(474);
				match(SemiColon);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
					{
					setState(475);
					expressionSequence();
					}
				}

				setState(478);
				match(CloseParen);
				setState(479);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				match(For);
				setState(481);
				match(OpenParen);
				setState(482);
				variableDeclarationStatement();
				setState(483);
				match(SemiColon);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
					{
					setState(484);
					expressionSequence();
					}
				}

				setState(487);
				match(SemiColon);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
					{
					setState(488);
					expressionSequence();
					}
				}

				setState(491);
				match(CloseParen);
				setState(492);
				statement();
				}
				break;
			case 5:
				_localctx = new ForLexicalLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(For);
				setState(495);
				match(OpenParen);
				setState(496);
				lexicalDeclaration();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
					{
					setState(497);
					expressionSequence();
					}
				}

				setState(500);
				match(SemiColon);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
					{
					setState(501);
					expressionSequence();
					}
				}

				setState(504);
				match(CloseParen);
				setState(505);
				statement();
				}
				break;
			case 6:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
				match(For);
				setState(508);
				match(OpenParen);
				setState(509);
				if (!(((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true))) throw new FailedPredicateException(this, "((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true)");
				setState(510);
				singleExpression(0);
				setState(511);
				match(In);
				setState(512);
				expressionSequence();
				setState(513);
				match(CloseParen);
				setState(514);
				statement();
				}
				break;
			case 7:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(516);
				match(For);
				setState(517);
				match(OpenParen);
				setState(518);
				varForDeclaration();
				setState(519);
				match(In);
				setState(520);
				expressionSequence();
				setState(521);
				match(CloseParen);
				setState(522);
				statement();
				}
				break;
			case 8:
				_localctx = new ForLexicalInStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(524);
				match(For);
				setState(525);
				match(OpenParen);
				setState(526);
				forDeclaration();
				setState(527);
				match(In);
				setState(528);
				expressionSequence();
				setState(529);
				match(CloseParen);
				setState(530);
				statement();
				}
				break;
			case 9:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(532);
				match(For);
				setState(533);
				match(OpenParen);
				setState(534);
				if (!((_input.LA(1) != Let))) throw new FailedPredicateException(this, "(_input.LA(1) != Let)");
				setState(535);
				singleExpression(0);
				setState(536);
				if (!(_input.LT(1).getText().equals("of"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"of\")");
				setState(537);
				match(Identifier);
				setState(538);
				singleExpression(0);
				setState(539);
				match(CloseParen);
				setState(540);
				statement();
				}
				break;
			case 10:
				_localctx = new ForVarOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(542);
				match(For);
				setState(543);
				match(OpenParen);
				setState(544);
				varForDeclaration();
				setState(545);
				if (!(_input.LT(1).getText().equals("of"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"of\")");
				setState(546);
				match(Identifier);
				setState(547);
				singleExpression(0);
				setState(548);
				match(CloseParen);
				setState(549);
				statement();
				}
				break;
			case 11:
				_localctx = new ForLexicalOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(551);
				match(For);
				setState(552);
				match(OpenParen);
				setState(553);
				forDeclaration();
				setState(554);
				if (!(_input.LT(1).getText().equals("of"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"of\")");
				setState(555);
				match(Identifier);
				setState(556);
				singleExpression(0);
				setState(557);
				match(CloseParen);
				setState(558);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(JSParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(Var);
			setState(563);
			variableDeclarationList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarForDeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(JSParser.Var, 0); }
		public ForBindingContext forBinding() {
			return getRuleContext(ForBindingContext.class,0);
		}
		public VarForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterVarForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitVarForDeclaration(this);
		}
	}

	public final VarForDeclarationContext varForDeclaration() throws RecognitionException {
		VarForDeclarationContext _localctx = new VarForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_varForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(Var);
			setState(566);
			forBinding();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public LetOrConstContext letOrConst() {
			return getRuleContext(LetOrConstContext.class,0);
		}
		public ForBindingContext forBinding() {
			return getRuleContext(ForBindingContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForDeclaration(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			letOrConst();
			setState(569);
			forBinding();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBindingContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public ForBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterForBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitForBinding(this);
		}
	}

	public final ForBindingContext forBinding() throws RecognitionException {
		ForBindingContext _localctx = new ForBindingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forBinding);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				bindingIdentifier();
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				bindingPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(JSParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(Continue);
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(576);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(577);
				match(Identifier);
				}
				break;
			}
			setState(580);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(JSParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(Break);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(583);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(584);
				match(Identifier);
				}
				break;
			}
			setState(587);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JSParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(Return);
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(590);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(591);
				expressionSequence();
				}
				break;
			}
			setState(594);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(JSParser.With, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitWithStatement(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(With);
			setState(597);
			match(OpenParen);
			setState(598);
			expressionSequence();
			setState(599);
			match(CloseParen);
			setState(600);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(JSParser.Switch, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(Switch);
			setState(603);
			match(OpenParen);
			setState(604);
			expressionSequence();
			setState(605);
			match(CloseParen);
			setState(606);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCaseBlock(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(OpenBrace);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(609);
				caseClauses();
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(612);
				defaultClause();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(613);
					caseClauses();
					}
				}

				}
			}

			setState(618);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCaseClauses(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(620);
				caseClause();
				}
				}
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(JSParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(Case);
			setState(626);
			expressionSequence();
			setState(627);
			match(Colon);
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(628);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(JSParser.Default, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitDefaultClause(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(Default);
			setState(632);
			match(Colon);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(633);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public LabelledItemContext labelledItem() {
			return getRuleContext(LabelledItemContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLabelledStatement(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(Identifier);
			setState(637);
			match(Colon);
			setState(638);
			labelledItem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public LabelledItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLabelledItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLabelledItem(this);
		}
	}

	public final LabelledItemContext labelledItem() throws RecognitionException {
		LabelledItemContext _localctx = new LabelledItemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_labelledItem);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(JSParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(Throw);
			setState(645);
			if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
			setState(646);
			expressionSequence();
			setState(647);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(JSParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tryStatement);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(Try);
				setState(650);
				block();
				setState(651);
				catchProduction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(Try);
				setState(654);
				block();
				setState(655);
				finallyProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				match(Try);
				setState(658);
				block();
				setState(659);
				catchProduction();
				setState(660);
				finallyProduction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(JSParser.Catch, 0); }
		public CatchParameterContext catchParameter() {
			return getRuleContext(CatchParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCatchProduction(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(Catch);
			setState(665);
			match(OpenParen);
			setState(666);
			catchParameter();
			setState(667);
			match(CloseParen);
			setState(668);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(JSParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFinallyProduction(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(Finally);
			setState(671);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchParameterContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public CatchParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCatchParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCatchParameter(this);
		}
	}

	public final CatchParameterContext catchParameter() throws RecognitionException {
		CatchParameterContext _localctx = new CatchParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_catchParameter);
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				bindingIdentifier();
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				bindingPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(JSParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitDebuggerStatement(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(Debugger);
			setState(678);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(JSParser.Function, 0); }
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(Function);
			setState(681);
			bindingIdentifier();
			setState(682);
			match(OpenParen);
			setState(683);
			formalParameters();
			setState(684);
			match(CloseParen);
			setState(685);
			match(OpenBrace);
			setState(686);
			functionBody();
			setState(687);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictFormalParametersContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public StrictFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterStrictFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitStrictFormalParameters(this);
		}
	}

	public final StrictFormalParametersContext strictFormalParameters() throws RecognitionException {
		StrictFormalParametersContext _localctx = new StrictFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_strictFormalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			formalParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_formalParameters);
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CloseParen:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OpenBracket:
			case OpenBrace:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				formalParameterList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FunctionRestParameterContext functionRestParameter() {
			return getRuleContext(FunctionRestParameterContext.class,0);
		}
		public FormalsListContext formalsList() {
			return getRuleContext(FormalsListContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_formalParameterList);
		int _la;
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				functionRestParameter();
				}
				break;
			case OpenBracket:
			case OpenBrace:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				formalsList();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(697);
					match(Comma);
					setState(698);
					functionRestParameter();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalsListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFormalsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFormalsList(this);
		}
	}

	public final FormalsListContext formalsList() throws RecognitionException {
		FormalsListContext _localctx = new FormalsListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_formalsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			formalParameter();
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(704);
					match(Comma);
					setState(705);
					formalParameter();
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionRestParameterContext extends ParserRuleContext {
		public BindingRestElementContext bindingRestElement() {
			return getRuleContext(BindingRestElementContext.class,0);
		}
		public FunctionRestParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionRestParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFunctionRestParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFunctionRestParameter(this);
		}
	}

	public final FunctionRestParameterContext functionRestParameter() throws RecognitionException {
		FunctionRestParameterContext _localctx = new FunctionRestParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functionRestParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			bindingRestElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public BindingElementContext bindingElement() {
			return getRuleContext(BindingElementContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			bindingElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public FunctionStatementListContext functionStatementList() {
			return getRuleContext(FunctionStatementListContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			functionStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStatementListContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public FunctionStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFunctionStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFunctionStatementList(this);
		}
	}

	public final FunctionStatementListContext functionStatementList() throws RecognitionException {
		FunctionStatementListContext _localctx = new FunctionStatementListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionStatementList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(717);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowParametersContext arrowParameters() {
			return getRuleContext(ArrowParametersContext.class,0);
		}
		public ConciseBodyContext conciseBody() {
			return getRuleContext(ConciseBodyContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArrowFunction(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			arrowParameters();
			setState(721);
			if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
			setState(722);
			match(Arrow);
			setState(723);
			conciseBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowParametersContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public CoverParenthesizedExpressionAndArrowParameterListContext coverParenthesizedExpressionAndArrowParameterList() {
			return getRuleContext(CoverParenthesizedExpressionAndArrowParameterListContext.class,0);
		}
		public ArrowParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArrowParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArrowParameters(this);
		}
	}

	public final ArrowParametersContext arrowParameters() throws RecognitionException {
		ArrowParametersContext _localctx = new ArrowParametersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arrowParameters);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				bindingIdentifier();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				coverParenthesizedExpressionAndArrowParameterList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConciseBodyContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ConciseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conciseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterConciseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitConciseBody(this);
		}
	}

	public final ConciseBodyContext conciseBody() throws RecognitionException {
		ConciseBodyContext _localctx = new ConciseBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_conciseBody);
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				if (!((_input.LA(1) != OpenBrace))) throw new FailedPredicateException(this, "(_input.LA(1) != OpenBrace)");
				setState(730);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(OpenBrace);
				setState(732);
				functionBody();
				setState(733);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverParenthesizedExpressionAndArrowParameterListContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public BindingRestElementContext bindingRestElement() {
			return getRuleContext(BindingRestElementContext.class,0);
		}
		public CoverParenthesizedExpressionAndArrowParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverParenthesizedExpressionAndArrowParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCoverParenthesizedExpressionAndArrowParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCoverParenthesizedExpressionAndArrowParameterList(this);
		}
	}

	public final CoverParenthesizedExpressionAndArrowParameterListContext coverParenthesizedExpressionAndArrowParameterList() throws RecognitionException {
		CoverParenthesizedExpressionAndArrowParameterListContext _localctx = new CoverParenthesizedExpressionAndArrowParameterListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_coverParenthesizedExpressionAndArrowParameterList);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				match(OpenParen);
				setState(738);
				expressionSequence();
				setState(739);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(OpenParen);
				setState(742);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				match(OpenParen);
				setState(744);
				bindingRestElement();
				setState(745);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				match(OpenParen);
				setState(748);
				expressionSequence();
				setState(749);
				match(Comma);
				setState(750);
				bindingRestElement();
				setState(751);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public StrictFormalParametersContext strictFormalParameters() {
			return getRuleContext(StrictFormalParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public GeneratorMethodContext generatorMethod() {
			return getRuleContext(GeneratorMethodContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public PropertySetParameterListContext propertySetParameterList() {
			return getRuleContext(PropertySetParameterListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitMethodDefinition(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_methodDefinition);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				propertyName();
				setState(756);
				match(OpenParen);
				setState(757);
				strictFormalParameters();
				setState(758);
				match(CloseParen);
				setState(759);
				match(OpenBrace);
				setState(760);
				functionBody();
				setState(761);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				generatorMethod();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				if (!(_input.LT(1).getText().equals("get"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"get\")");
				setState(765);
				match(Identifier);
				setState(766);
				propertyName();
				setState(767);
				match(OpenParen);
				setState(768);
				match(CloseParen);
				setState(769);
				match(OpenBrace);
				setState(770);
				functionBody();
				setState(771);
				match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				if (!(_input.LT(1).getText().equals("set"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"set\")");
				setState(774);
				match(Identifier);
				setState(775);
				propertyName();
				setState(776);
				match(OpenParen);
				setState(777);
				propertySetParameterList();
				setState(778);
				match(CloseParen);
				setState(779);
				match(OpenBrace);
				setState(780);
				functionBody();
				setState(781);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPropertySetParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPropertySetParameterList(this);
		}
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			formalParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorMethodContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public StrictFormalParametersContext strictFormalParameters() {
			return getRuleContext(StrictFormalParametersContext.class,0);
		}
		public GeneratorBodyContext generatorBody() {
			return getRuleContext(GeneratorBodyContext.class,0);
		}
		public GeneratorMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterGeneratorMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitGeneratorMethod(this);
		}
	}

	public final GeneratorMethodContext generatorMethod() throws RecognitionException {
		GeneratorMethodContext _localctx = new GeneratorMethodContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_generatorMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(Multiply);
			setState(788);
			propertyName();
			setState(789);
			match(OpenParen);
			setState(790);
			strictFormalParameters();
			setState(791);
			match(CloseParen);
			setState(792);
			match(OpenBrace);
			setState(793);
			generatorBody();
			setState(794);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(JSParser.Function, 0); }
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public GeneratorBodyContext generatorBody() {
			return getRuleContext(GeneratorBodyContext.class,0);
		}
		public GeneratorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterGeneratorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitGeneratorDeclaration(this);
		}
	}

	public final GeneratorDeclarationContext generatorDeclaration() throws RecognitionException {
		GeneratorDeclarationContext _localctx = new GeneratorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_generatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(Function);
			setState(797);
			match(Multiply);
			setState(798);
			bindingIdentifier();
			setState(799);
			match(OpenParen);
			setState(800);
			formalParameters();
			setState(801);
			match(CloseParen);
			setState(802);
			match(OpenBrace);
			setState(803);
			generatorBody();
			setState(804);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorExpressionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(JSParser.Function, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public GeneratorBodyContext generatorBody() {
			return getRuleContext(GeneratorBodyContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public GeneratorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterGeneratorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitGeneratorExpression(this);
		}
	}

	public final GeneratorExpressionContext generatorExpression() throws RecognitionException {
		GeneratorExpressionContext _localctx = new GeneratorExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_generatorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(Function);
			setState(807);
			match(Multiply);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(808);
				bindingIdentifier();
				}
			}

			setState(811);
			match(OpenParen);
			setState(812);
			formalParameters();
			setState(813);
			match(CloseParen);
			setState(814);
			match(OpenBrace);
			setState(815);
			generatorBody();
			setState(816);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorBodyContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public GeneratorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterGeneratorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitGeneratorBody(this);
		}
	}

	public final GeneratorBodyContext generatorBody() throws RecognitionException {
		GeneratorBodyContext _localctx = new GeneratorBodyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_generatorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JSParser.Class, 0); }
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(Class);
			setState(821);
			bindingIdentifier();
			setState(822);
			classTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassExpressionContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JSParser.Class, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ClassExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassExpression(this);
		}
	}

	public final ClassExpressionContext classExpression() throws RecognitionException {
		ClassExpressionContext _localctx = new ClassExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_classExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(Class);
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(825);
				bindingIdentifier();
				}
			}

			setState(828);
			classTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTailContext extends ParserRuleContext {
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassTail(this);
		}
	}

	public final ClassTailContext classTail() throws RecognitionException {
		ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_classTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(830);
				classHeritage();
				}
			}

			setState(833);
			match(OpenBrace);
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(834);
				classBody();
				}
				break;
			}
			setState(837);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeritageContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(JSParser.Extends, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ClassHeritageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeritage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassHeritage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassHeritage(this);
		}
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_classHeritage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(Extends);
			setState(840);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassElementListContext classElementList() {
			return getRuleContext(ClassElementListContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			classElementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassElementListContext extends ParserRuleContext {
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassElementList(this);
		}
	}

	public final ClassElementListContext classElementList() throws RecognitionException {
		ClassElementListContext _localctx = new ClassElementListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_classElementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(845); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(844);
					classElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(847); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassElementContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public TerminalNode Static() { return getToken(JSParser.Static, 0); }
		public TerminalNode SemiColon() { return getToken(JSParser.SemiColon, 0); }
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassElement(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_classElement);
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				methodDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				match(Static);
				setState(851);
				methodDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arrayLiteral);
		int _la;
		try {
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(OpenBracket);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(856);
					elision();
					}
				}

				setState(859);
				match(CloseBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(OpenBracket);
				setState(861);
				elementList(0);
				setState(862);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				match(OpenBracket);
				setState(865);
				elementList(0);
				setState(866);
				match(Comma);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(867);
					elision();
					}
				}

				setState(870);
				match(CloseBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public SpreadElementContext spreadElement() {
			return getRuleContext(SpreadElementContext.class,0);
		}
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		return elementList(0);
	}

	private ElementListContext elementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElementListContext _localctx = new ElementListContext(_ctx, _parentState);
		ElementListContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_elementList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(875);
					elision();
					}
				}

				setState(878);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(879);
					elision();
					}
				}

				setState(882);
				spreadElement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(897);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new ElementListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_elementList);
						setState(885);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(886);
						match(Comma);
						setState(888);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(887);
							elision();
							}
						}

						setState(890);
						singleExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ElementListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_elementList);
						setState(891);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(892);
						match(Comma);
						setState(894);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(893);
							elision();
							}
						}

						setState(896);
						spreadElement();
						}
						break;
					}
					} 
				}
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElisionContext extends ParserRuleContext {
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterElision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitElision(this);
		}
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(902);
				match(Comma);
				}
				}
				setState(905); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpreadElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public SpreadElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterSpreadElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitSpreadElement(this);
		}
	}

	public final SpreadElementContext spreadElement() throws RecognitionException {
		SpreadElementContext _localctx = new SpreadElementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_spreadElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(Ellipsis);
			setState(908);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public PropertyDefinitionListContext propertyDefinitionList() {
			return getRuleContext(PropertyDefinitionListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_objectLiteral);
		int _la;
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				match(OpenBrace);
				setState(911);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(OpenBrace);
				setState(913);
				propertyDefinitionList();
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(914);
					match(Comma);
					}
				}

				setState(917);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDefinitionListContext extends ParserRuleContext {
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
		public PropertyDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPropertyDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPropertyDefinitionList(this);
		}
	}

	public final PropertyDefinitionListContext propertyDefinitionList() throws RecognitionException {
		PropertyDefinitionListContext _localctx = new PropertyDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_propertyDefinitionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			propertyDefinition();
			setState(926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(922);
					match(Comma);
					setState(923);
					propertyDefinition();
					}
					} 
				}
				setState(928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDefinitionContext extends ParserRuleContext {
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public CoverInitializedNameContext coverInitializedName() {
			return getRuleContext(CoverInitializedNameContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPropertyDefinition(this);
		}
	}

	public final PropertyDefinitionContext propertyDefinition() throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_propertyDefinition);
		try {
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				identifierReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				coverInitializedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(931);
				propertyName();
				setState(932);
				match(Colon);
				setState(933);
				singleExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(935);
				methodDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public LiteralPropertyNameContext literalPropertyName() {
			return getRuleContext(LiteralPropertyNameContext.class,0);
		}
		public ComputedPropertyNameContext computedPropertyName() {
			return getRuleContext(ComputedPropertyNameContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_propertyName);
		try {
			setState(940);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Export:
			case Class:
			case Extends:
			case Const:
			case Super:
			case Yield:
			case Import:
			case Enum:
			case Await:
			case Implements:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				literalPropertyName();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				computedPropertyName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralPropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralPropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalPropertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLiteralPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLiteralPropertyName(this);
		}
	}

	public final LiteralPropertyNameContext literalPropertyName() throws RecognitionException {
		LiteralPropertyNameContext _localctx = new LiteralPropertyNameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_literalPropertyName);
		try {
			setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Export:
			case Class:
			case Extends:
			case Const:
			case Super:
			case Yield:
			case Import:
			case Enum:
			case Await:
			case Implements:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComputedPropertyNameContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ComputedPropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedPropertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterComputedPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitComputedPropertyName(this);
		}
	}

	public final ComputedPropertyNameContext computedPropertyName() throws RecognitionException {
		ComputedPropertyNameContext _localctx = new ComputedPropertyNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_computedPropertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(OpenBracket);
			setState(948);
			singleExpression(0);
			setState(949);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverInitializedNameContext extends ParserRuleContext {
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public CoverInitializedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverInitializedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCoverInitializedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCoverInitializedName(this);
		}
	}

	public final CoverInitializedNameContext coverInitializedName() throws RecognitionException {
		CoverInitializedNameContext _localctx = new CoverInitializedNameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_coverInitializedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			identifierReference();
			setState(952);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(OpenParen);
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (NoSubstitutionTemplate - 64)) | (1L << (TemplateHead - 64)))) != 0)) {
				{
				setState(955);
				argumentList();
				}
			}

			setState(958);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SpreadElementContext> spreadElement() {
			return getRuleContexts(SpreadElementContext.class);
		}
		public SpreadElementContext spreadElement(int i) {
			return getRuleContext(SpreadElementContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				{
				setState(960);
				spreadElement();
				}
				break;
			case RegularExpressionLiteral:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case PlusPlus:
			case MinusMinus:
			case Plus:
			case Minus:
			case BitNot:
			case Not:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case Typeof:
			case New:
			case Void:
			case Function:
			case This:
			case Delete:
			case Class:
			case Super:
			case Yield:
			case Identifier:
			case StringLiteral:
			case NoSubstitutionTemplate:
			case TemplateHead:
				{
				setState(961);
				singleExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(964);
				match(Comma);
				setState(967);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Ellipsis:
					{
					setState(965);
					spreadElement();
					}
					break;
				case RegularExpressionLiteral:
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case BitNot:
				case Not:
				case NullLiteral:
				case BooleanLiteral:
				case DecimalLiteral:
				case HexIntegerLiteral:
				case OctalIntegerLiteral:
				case BinaryIntegerLiteral:
				case Typeof:
				case New:
				case Void:
				case Function:
				case This:
				case Delete:
				case Class:
				case Super:
				case Yield:
				case Identifier:
				case StringLiteral:
				case NoSubstitutionTemplate:
				case TemplateHead:
					{
					setState(966);
					singleExpression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			singleExpression(0);
			setState(979);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(975);
					match(Comma);
					setState(976);
					singleExpression(0);
					}
					} 
				}
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitTernaryExpression(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLogicalAndExpression(this);
		}
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPreIncrementExpression(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitObjectLiteralExpression(this);
		}
	}
	public static class SuperMemberIndexExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(JSParser.Super, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public SuperMemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterSuperMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitSuperMemberIndexExpression(this);
		}
	}
	public static class NewTargetExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(JSParser.New, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public NewTargetExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterNewTargetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitNewTargetExpression(this);
		}
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(JSParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitInExpression(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLogicalOrExpression(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitNotExpression(this);
		}
	}
	public static class GeneratorExpressionExpressionContext extends SingleExpressionContext {
		public GeneratorExpressionContext generatorExpression() {
			return getRuleContext(GeneratorExpressionContext.class,0);
		}
		public GeneratorExpressionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterGeneratorExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitGeneratorExpressionExpression(this);
		}
	}
	public static class SuperMemberDotExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(JSParser.Super, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public SuperMemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterSuperMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitSuperMemberDotExpression(this);
		}
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPreDecreaseExpression(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArgumentsExpression(this);
		}
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(JSParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitThisExpression(this);
		}
	}
	public static class RegularExpressionLiteralExpressionContext extends SingleExpressionContext {
		public TerminalNode RegularExpressionLiteral() { return getToken(JSParser.RegularExpressionLiteral, 0); }
		public RegularExpressionLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterRegularExpressionLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitRegularExpressionLiteralExpression(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode Function() { return getToken(JSParser.Function, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFunctionExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitAssignmentExpression(this);
		}
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPostDecreaseExpression(this);
		}
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(JSParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitTypeofExpression(this);
		}
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(JSParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitInstanceofExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(JSParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitDeleteExpression(this);
		}
	}
	public static class ArrowFunctionExpressionContext extends SingleExpressionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArrowFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArrowFunctionExpression(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitEqualityExpression(this);
		}
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBitXOrExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBitShiftExpression(this);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitRelationalExpression(this);
		}
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitPostIncrementExpression(this);
		}
	}
	public static class ClassExpressionExpressionContext extends SingleExpressionContext {
		public ClassExpressionContext classExpression() {
			return getRuleContext(ClassExpressionContext.class,0);
		}
		public ClassExpressionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterClassExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitClassExpressionExpression(this);
		}
	}
	public static class YieldExpressionContext extends SingleExpressionContext {
		public TerminalNode Yield() { return getToken(JSParser.Yield, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public YieldExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitYieldExpression(this);
		}
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBitNotExpression(this);
		}
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(JSParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitNewExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLiteralExpression(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitArrayLiteralExpression(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitMemberDotExpression(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitMemberIndexExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBitAndExpression(this);
		}
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBitOrExpression(this);
		}
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitAssignmentOperatorExpression(this);
		}
	}
	public static class SuperCallExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(JSParser.Super, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperCallExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterSuperCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitSuperCallExpression(this);
		}
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(JSParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitVoidExpression(this);
		}
	}
	public static class CallTemplateLiteralExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public CallTemplateLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterCallTemplateLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitCallTemplateLiteralExpression(this);
		}
	}
	public static class TemplateLiteralExpressionContext extends SingleExpressionContext {
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public TemplateLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterTemplateLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitTemplateLiteralExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(983);
				match(Function);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(984);
					bindingIdentifier();
					}
				}

				setState(987);
				match(OpenParen);
				setState(988);
				formalParameters();
				setState(989);
				match(CloseParen);
				setState(990);
				match(OpenBrace);
				setState(991);
				functionBody();
				setState(992);
				match(CloseBrace);
				}
				break;
			case 2:
				{
				_localctx = new SuperMemberIndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(994);
				match(Super);
				setState(995);
				match(OpenBracket);
				setState(996);
				expressionSequence();
				setState(997);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				_localctx = new SuperMemberDotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(999);
				match(Super);
				setState(1000);
				match(Dot);
				setState(1001);
				identifierName();
				}
				break;
			case 4:
				{
				_localctx = new SuperCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1002);
				match(Super);
				setState(1003);
				arguments();
				}
				break;
			case 5:
				{
				_localctx = new NewTargetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1004);
				match(New);
				setState(1005);
				match(Dot);
				setState(1006);
				if (!(_input.LT(1).getText().equals("target"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"target\")");
				setState(1007);
				match(Identifier);
				}
				break;
			case 6:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1008);
				match(New);
				setState(1009);
				singleExpression(0);
				setState(1011);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(1010);
					arguments();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1013);
				match(Delete);
				setState(1014);
				singleExpression(36);
				}
				break;
			case 8:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1015);
				match(Void);
				setState(1016);
				singleExpression(35);
				}
				break;
			case 9:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1017);
				match(Typeof);
				setState(1018);
				singleExpression(34);
				}
				break;
			case 10:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1019);
				match(PlusPlus);
				setState(1020);
				singleExpression(33);
				}
				break;
			case 11:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1021);
				match(MinusMinus);
				setState(1022);
				singleExpression(32);
				}
				break;
			case 12:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1023);
				match(Plus);
				setState(1024);
				singleExpression(31);
				}
				break;
			case 13:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1025);
				match(Minus);
				setState(1026);
				singleExpression(30);
				}
				break;
			case 14:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1027);
				match(BitNot);
				setState(1028);
				singleExpression(29);
				}
				break;
			case 15:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1029);
				match(Not);
				setState(1030);
				singleExpression(28);
				}
				break;
			case 16:
				{
				_localctx = new YieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1031);
				match(Yield);
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(1032);
					if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
					setState(1034);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Multiply) {
						{
						setState(1033);
						match(Multiply);
						}
					}

					setState(1036);
					singleExpression(0);
					}
					break;
				}
				}
				break;
			case 17:
				{
				_localctx = new ArrowFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1039);
				arrowFunction();
				}
				break;
			case 18:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1040);
				match(This);
				}
				break;
			case 19:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1041);
				match(Identifier);
				}
				break;
			case 20:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1042);
				literal();
				}
				break;
			case 21:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1043);
				arrayLiteral();
				}
				break;
			case 22:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1044);
				objectLiteral();
				}
				break;
			case 23:
				{
				_localctx = new ClassExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1045);
				classExpression();
				}
				break;
			case 24:
				{
				_localctx = new GeneratorExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1046);
				generatorExpression();
				}
				break;
			case 25:
				{
				_localctx = new RegularExpressionLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1047);
				match(RegularExpressionLiteral);
				}
				break;
			case 26:
				{
				_localctx = new TemplateLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1048);
				templateLiteral();
				}
				break;
			case 27:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1049);
				match(OpenParen);
				setState(1050);
				expressionSequence();
				setState(1051);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1055);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1056);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1057);
						singleExpression(28);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1058);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1059);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1060);
						singleExpression(27);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1061);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1062);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1063);
						singleExpression(26);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1064);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1065);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1066);
						singleExpression(25);
						}
						break;
					case 5:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1067);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1068);
						match(Instanceof);
						setState(1069);
						singleExpression(24);
						}
						break;
					case 6:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1070);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1071);
						match(In);
						setState(1072);
						singleExpression(23);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1073);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1074);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1075);
						singleExpression(22);
						}
						break;
					case 8:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1076);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1077);
						match(BitAnd);
						setState(1078);
						singleExpression(21);
						}
						break;
					case 9:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1079);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1080);
						match(BitXOr);
						setState(1081);
						singleExpression(20);
						}
						break;
					case 10:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1082);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1083);
						match(BitOr);
						setState(1084);
						singleExpression(19);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1085);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1086);
						match(And);
						setState(1087);
						singleExpression(18);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1088);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1089);
						match(Or);
						setState(1090);
						singleExpression(17);
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1091);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1092);
						match(QuestionMark);
						setState(1093);
						singleExpression(0);
						setState(1094);
						match(Colon);
						setState(1095);
						singleExpression(16);
						}
						break;
					case 14:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1097);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1098);
						match(Assign);
						setState(1099);
						singleExpression(13);
						}
						break;
					case 15:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1100);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1101);
						assignmentOperator();
						setState(1102);
						singleExpression(12);
						}
						break;
					case 16:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1104);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(1105);
						match(OpenBracket);
						setState(1106);
						expressionSequence();
						setState(1107);
						match(CloseBracket);
						}
						break;
					case 17:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1109);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(1110);
						match(Dot);
						setState(1111);
						identifierName();
						}
						break;
					case 18:
						{
						_localctx = new CallTemplateLiteralExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1112);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(1113);
						templateLiteral();
						}
						break;
					case 19:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1114);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1115);
						arguments();
						}
						break;
					case 20:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1116);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1117);
						if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
						setState(1118);
						match(PlusPlus);
						}
						break;
					case 21:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1119);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1120);
						if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
						setState(1121);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(1126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public ScriptBodyContext scriptBody() {
			return getRuleContext(ScriptBodyContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1127);
				scriptBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptBodyContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ScriptBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterScriptBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitScriptBody(this);
		}
	}

	public final ScriptBodyContext scriptBody() throws RecognitionException {
		ScriptBodyContext _localctx = new ScriptBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_scriptBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(1132);
				moduleBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public ModuleItemListContext moduleItemList() {
			return getRuleContext(ModuleItemListContext.class,0);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitModuleBody(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_moduleBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			moduleItemList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleItemListContext extends ParserRuleContext {
		public List<ModuleItemContext> moduleItem() {
			return getRuleContexts(ModuleItemContext.class);
		}
		public ModuleItemContext moduleItem(int i) {
			return getRuleContext(ModuleItemContext.class,i);
		}
		public ModuleItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterModuleItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitModuleItemList(this);
		}
	}

	public final ModuleItemListContext moduleItemList() throws RecognitionException {
		ModuleItemListContext _localctx = new ModuleItemListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_moduleItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1137);
					moduleItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1140); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleItemContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ExportDeclarationContext exportDeclaration() {
			return getRuleContext(ExportDeclarationContext.class,0);
		}
		public StatementListItemContext statementListItem() {
			return getRuleContext(StatementListItemContext.class,0);
		}
		public ModuleItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterModuleItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitModuleItem(this);
		}
	}

	public final ModuleItemContext moduleItem() throws RecognitionException {
		ModuleItemContext _localctx = new ModuleItemContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_moduleItem);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				importDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1143);
				exportDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1144);
				statementListItem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(JSParser.Import, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ModuleSpecifierContext moduleSpecifier() {
			return getRuleContext(ModuleSpecifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_importDeclaration);
		try {
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(Import);
				setState(1148);
				importClause();
				setState(1149);
				fromClause();
				setState(1150);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				match(Import);
				setState(1153);
				moduleSpecifier();
				setState(1154);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportClauseContext extends ParserRuleContext {
		public ImportedDefaultBindingContext importedDefaultBinding() {
			return getRuleContext(ImportedDefaultBindingContext.class,0);
		}
		public NameSpaceImportContext nameSpaceImport() {
			return getRuleContext(NameSpaceImportContext.class,0);
		}
		public NamedImportsContext namedImports() {
			return getRuleContext(NamedImportsContext.class,0);
		}
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterImportClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitImportClause(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_importClause);
		try {
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				importedDefaultBinding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				nameSpaceImport();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
				namedImports();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1161);
				importedDefaultBinding();
				setState(1162);
				match(Comma);
				setState(1163);
				nameSpaceImport();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1165);
				importedDefaultBinding();
				setState(1166);
				match(Comma);
				setState(1167);
				namedImports();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportedDefaultBindingContext extends ParserRuleContext {
		public ImportedBindingContext importedBinding() {
			return getRuleContext(ImportedBindingContext.class,0);
		}
		public ImportedDefaultBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedDefaultBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterImportedDefaultBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitImportedDefaultBinding(this);
		}
	}

	public final ImportedDefaultBindingContext importedDefaultBinding() throws RecognitionException {
		ImportedDefaultBindingContext _localctx = new ImportedDefaultBindingContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_importedDefaultBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			importedBinding();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameSpaceImportContext extends ParserRuleContext {
		public ImportedBindingContext importedBinding() {
			return getRuleContext(ImportedBindingContext.class,0);
		}
		public NameSpaceImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSpaceImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterNameSpaceImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitNameSpaceImport(this);
		}
	}

	public final NameSpaceImportContext nameSpaceImport() throws RecognitionException {
		NameSpaceImportContext _localctx = new NameSpaceImportContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_nameSpaceImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(Multiply);
			setState(1174);
			match(T__0);
			setState(1175);
			importedBinding();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedImportsContext extends ParserRuleContext {
		public ImportsListContext importsList() {
			return getRuleContext(ImportsListContext.class,0);
		}
		public NamedImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterNamedImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitNamedImports(this);
		}
	}

	public final NamedImportsContext namedImports() throws RecognitionException {
		NamedImportsContext _localctx = new NamedImportsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_namedImports);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				match(OpenBrace);
				setState(1178);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(OpenBrace);
				setState(1180);
				importsList();
				setState(1181);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1183);
				match(OpenBrace);
				setState(1184);
				importsList();
				setState(1185);
				match(Comma);
				setState(1186);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public ModuleSpecifierContext moduleSpecifier() {
			return getRuleContext(ModuleSpecifierContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(T__1);
			setState(1191);
			moduleSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsListContext extends ParserRuleContext {
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public ImportsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterImportsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitImportsList(this);
		}
	}

	public final ImportsListContext importsList() throws RecognitionException {
		ImportsListContext _localctx = new ImportsListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_importsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			importSpecifier();
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1194);
					match(Comma);
					setState(1195);
					importSpecifier();
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSpecifierContext extends ParserRuleContext {
		public ImportedBindingContext importedBinding() {
			return getRuleContext(ImportedBindingContext.class,0);
		}
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitImportSpecifier(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_importSpecifier);
		try {
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				importedBinding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				identifierName();
				setState(1203);
				match(T__0);
				setState(1204);
				importedBinding();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleSpecifierContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public ModuleSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterModuleSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitModuleSpecifier(this);
		}
	}

	public final ModuleSpecifierContext moduleSpecifier() throws RecognitionException {
		ModuleSpecifierContext _localctx = new ModuleSpecifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_moduleSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportedBindingContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ImportedBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterImportedBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitImportedBinding(this);
		}
	}

	public final ImportedBindingContext importedBinding() throws RecognitionException {
		ImportedBindingContext _localctx = new ImportedBindingContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_importedBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			bindingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportDeclarationContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(JSParser.Export, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ExportClauseContext exportClause() {
			return getRuleContext(ExportClauseContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Default() { return getToken(JSParser.Default, 0); }
		public HoistableDeclarationContext hoistableDeclaration() {
			return getRuleContext(HoistableDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitExportDeclaration(this);
		}
	}

	public final ExportDeclarationContext exportDeclaration() throws RecognitionException {
		ExportDeclarationContext _localctx = new ExportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_exportDeclaration);
		try {
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212);
				match(Export);
				setState(1213);
				match(Multiply);
				setState(1214);
				fromClause();
				setState(1215);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				match(Export);
				setState(1218);
				exportClause();
				setState(1219);
				fromClause();
				setState(1220);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222);
				match(Export);
				setState(1223);
				exportClause();
				setState(1224);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1226);
				match(Export);
				setState(1227);
				variableStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1228);
				match(Export);
				setState(1229);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1230);
				match(Export);
				setState(1231);
				match(Default);
				setState(1232);
				hoistableDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1233);
				match(Export);
				setState(1234);
				match(Default);
				setState(1235);
				classDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1236);
				match(Export);
				setState(1237);
				match(Default);
				setState(1238);
				if (!((_input.LA(1) != Function) && (_input.LA(1) != Class))) throw new FailedPredicateException(this, "(_input.LA(1) != Function) && (_input.LA(1) != Class)");
				setState(1239);
				singleExpression(0);
				setState(1240);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportClauseContext extends ParserRuleContext {
		public ExportsListContext exportsList() {
			return getRuleContext(ExportsListContext.class,0);
		}
		public ExportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterExportClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitExportClause(this);
		}
	}

	public final ExportClauseContext exportClause() throws RecognitionException {
		ExportClauseContext _localctx = new ExportClauseContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_exportClause);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				match(OpenBrace);
				setState(1245);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				match(OpenBrace);
				setState(1247);
				exportsList();
				setState(1248);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1250);
				match(OpenBrace);
				setState(1251);
				exportsList();
				setState(1252);
				match(Comma);
				setState(1253);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportsListContext extends ParserRuleContext {
		public List<ExportSpecifierContext> exportSpecifier() {
			return getRuleContexts(ExportSpecifierContext.class);
		}
		public ExportSpecifierContext exportSpecifier(int i) {
			return getRuleContext(ExportSpecifierContext.class,i);
		}
		public ExportsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterExportsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitExportsList(this);
		}
	}

	public final ExportsListContext exportsList() throws RecognitionException {
		ExportsListContext _localctx = new ExportsListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_exportsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			exportSpecifier();
			setState(1262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1258);
					match(Comma);
					setState(1259);
					exportSpecifier();
					}
					} 
				}
				setState(1264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportSpecifierContext extends ParserRuleContext {
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public ExportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterExportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitExportSpecifier(this);
		}
	}

	public final ExportSpecifierContext exportSpecifier() throws RecognitionException {
		ExportSpecifierContext _localctx = new ExportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_exportSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			identifierName();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1266);
				match(T__0);
				setState(1267);
				identifierName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(JSParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JSParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_literal);
		int _la;
		try {
			setState(1274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				_la = _input.LA(1);
				if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (NullLiteral - 55)) | (1L << (BooleanLiteral - 55)) | (1L << (StringLiteral - 55)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(JSParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(JSParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(JSParser.OctalIntegerLiteral, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(JSParser.BinaryIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << BinaryIntegerLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitIdentifierName(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_identifierName);
		try {
			setState(1280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				match(Identifier);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Export:
			case Class:
			case Extends:
			case Const:
			case Super:
			case Yield:
			case Import:
			case Enum:
			case Await:
			case Implements:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
				reservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierReferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public IdentifierReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterIdentifierReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitIdentifierReference(this);
		}
	}

	public final IdentifierReferenceContext identifierReference() throws RecognitionException {
		IdentifierReferenceContext _localctx = new IdentifierReferenceContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_identifierReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public BindingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterBindingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitBindingIdentifier(this);
		}
	}

	public final BindingIdentifierContext bindingIdentifier() throws RecognitionException {
		BindingIdentifierContext _localctx = new BindingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_bindingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public LabelIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterLabelIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitLabelIdentifier(this);
		}
	}

	public final LabelIdentifierContext labelIdentifier() throws RecognitionException {
		LabelIdentifierContext _localctx = new LabelIdentifierContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_labelIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FutureReservedWordContext futureReservedWord() {
			return getRuleContext(FutureReservedWordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(JSParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JSParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_reservedWord);
		int _la;
		try {
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Export:
			case Class:
			case Extends:
			case Const:
			case Super:
			case Yield:
			case Import:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				keyword();
				}
				break;
			case Enum:
			case Await:
			case Implements:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				futureReservedWord();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1290);
				_la = _input.LA(1);
				if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(JSParser.Break, 0); }
		public TerminalNode Do() { return getToken(JSParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(JSParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(JSParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(JSParser.Case, 0); }
		public TerminalNode Else() { return getToken(JSParser.Else, 0); }
		public TerminalNode New() { return getToken(JSParser.New, 0); }
		public TerminalNode Var() { return getToken(JSParser.Var, 0); }
		public TerminalNode Catch() { return getToken(JSParser.Catch, 0); }
		public TerminalNode Export() { return getToken(JSParser.Export, 0); }
		public TerminalNode Const() { return getToken(JSParser.Const, 0); }
		public TerminalNode Finally() { return getToken(JSParser.Finally, 0); }
		public TerminalNode Super() { return getToken(JSParser.Super, 0); }
		public TerminalNode Return() { return getToken(JSParser.Return, 0); }
		public TerminalNode Void() { return getToken(JSParser.Void, 0); }
		public TerminalNode Class() { return getToken(JSParser.Class, 0); }
		public TerminalNode Extends() { return getToken(JSParser.Extends, 0); }
		public TerminalNode Continue() { return getToken(JSParser.Continue, 0); }
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public TerminalNode Switch() { return getToken(JSParser.Switch, 0); }
		public TerminalNode Yield() { return getToken(JSParser.Yield, 0); }
		public TerminalNode While() { return getToken(JSParser.While, 0); }
		public TerminalNode Debugger() { return getToken(JSParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(JSParser.Function, 0); }
		public TerminalNode This() { return getToken(JSParser.This, 0); }
		public TerminalNode With() { return getToken(JSParser.With, 0); }
		public TerminalNode Default() { return getToken(JSParser.Default, 0); }
		public TerminalNode If() { return getToken(JSParser.If, 0); }
		public TerminalNode Throw() { return getToken(JSParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(JSParser.Delete, 0); }
		public TerminalNode In() { return getToken(JSParser.In, 0); }
		public TerminalNode Import() { return getToken(JSParser.Import, 0); }
		public TerminalNode Try() { return getToken(JSParser.Try, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (Break - 61)) | (1L << (Do - 61)) | (1L << (Instanceof - 61)) | (1L << (Typeof - 61)) | (1L << (Case - 61)) | (1L << (Else - 61)) | (1L << (New - 61)) | (1L << (Var - 61)) | (1L << (Catch - 61)) | (1L << (Finally - 61)) | (1L << (Return - 61)) | (1L << (Void - 61)) | (1L << (Continue - 61)) | (1L << (For - 61)) | (1L << (Switch - 61)) | (1L << (While - 61)) | (1L << (Debugger - 61)) | (1L << (Function - 61)) | (1L << (This - 61)) | (1L << (With - 61)) | (1L << (Default - 61)) | (1L << (If - 61)) | (1L << (Throw - 61)) | (1L << (Delete - 61)) | (1L << (In - 61)) | (1L << (Try - 61)) | (1L << (Export - 61)) | (1L << (Class - 61)) | (1L << (Extends - 61)) | (1L << (Const - 61)) | (1L << (Super - 61)) | (1L << (Yield - 61)) | (1L << (Import - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FutureReservedWordContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(JSParser.Enum, 0); }
		public TerminalNode Await() { return getToken(JSParser.Await, 0); }
		public TerminalNode Implements() { return getToken(JSParser.Implements, 0); }
		public TerminalNode Private() { return getToken(JSParser.Private, 0); }
		public TerminalNode Public() { return getToken(JSParser.Public, 0); }
		public TerminalNode Interface() { return getToken(JSParser.Interface, 0); }
		public TerminalNode Package() { return getToken(JSParser.Package, 0); }
		public TerminalNode Protected() { return getToken(JSParser.Protected, 0); }
		public FutureReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futureReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterFutureReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitFutureReservedWord(this);
		}
	}

	public final FutureReservedWordContext futureReservedWord() throws RecognitionException {
		FutureReservedWordContext _localctx = new FutureReservedWordContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_futureReservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Enum - 96)) | (1L << (Await - 96)) | (1L << (Implements - 96)) | (1L << (Private - 96)) | (1L << (Public - 96)) | (1L << (Interface - 96)) | (1L << (Package - 96)) | (1L << (Protected - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JSParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(JSParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_eos);
		try {
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1299);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1300);
				if (!(_input.LT(1).getType() == CloseBrace)) throw new FailedPredicateException(this, "_input.LT(1).getType() == CloseBrace");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JSParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitEof(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateLiteralContext extends ParserRuleContext {
		public TerminalNode NoSubstitutionTemplate() { return getToken(JSParser.NoSubstitutionTemplate, 0); }
		public TerminalNode TemplateHead() { return getToken(JSParser.TemplateHead, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TemplateSpansContext templateSpans() {
			return getRuleContext(TemplateSpansContext.class,0);
		}
		public TemplateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterTemplateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitTemplateLiteral(this);
		}
	}

	public final TemplateLiteralContext templateLiteral() throws RecognitionException {
		TemplateLiteralContext _localctx = new TemplateLiteralContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_templateLiteral);
		try {
			setState(1310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NoSubstitutionTemplate:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				match(NoSubstitutionTemplate);
				}
				break;
			case TemplateHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(TemplateHead);
				setState(1307);
				expressionSequence();
				setState(1308);
				templateSpans();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateSpansContext extends ParserRuleContext {
		public TerminalNode TemplateTail() { return getToken(JSParser.TemplateTail, 0); }
		public TemplateMiddleListContext templateMiddleList() {
			return getRuleContext(TemplateMiddleListContext.class,0);
		}
		public TemplateSpansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateSpans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterTemplateSpans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitTemplateSpans(this);
		}
	}

	public final TemplateSpansContext templateSpans() throws RecognitionException {
		TemplateSpansContext _localctx = new TemplateSpansContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_templateSpans);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateTail:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				match(TemplateTail);
				}
				break;
			case TemplateMiddle:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				templateMiddleList(0);
				setState(1314);
				match(TemplateTail);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateMiddleListContext extends ParserRuleContext {
		public TerminalNode TemplateMiddle() { return getToken(JSParser.TemplateMiddle, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TemplateMiddleListContext templateMiddleList() {
			return getRuleContext(TemplateMiddleListContext.class,0);
		}
		public TemplateMiddleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateMiddleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).enterTemplateMiddleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSListener ) ((JSListener)listener).exitTemplateMiddleList(this);
		}
	}

	public final TemplateMiddleListContext templateMiddleList() throws RecognitionException {
		return templateMiddleList(0);
	}

	private TemplateMiddleListContext templateMiddleList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateMiddleListContext _localctx = new TemplateMiddleListContext(_ctx, _parentState);
		TemplateMiddleListContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_templateMiddleList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1319);
			match(TemplateMiddle);
			setState(1320);
			expressionSequence();
			}
			_ctx.stop = _input.LT(-1);
			setState(1327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateMiddleListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateMiddleList);
					setState(1322);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1323);
					match(TemplateMiddle);
					setState(1324);
					expressionSequence();
					}
					} 
				}
				setState(1329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 30:
			return iterationStatement_sempred((IterationStatementContext)_localctx, predIndex);
		case 35:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 36:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 37:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 46:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 61:
			return arrowFunction_sempred((ArrowFunctionContext)_localctx, predIndex);
		case 63:
			return conciseBody_sempred((ConciseBodyContext)_localctx, predIndex);
		case 65:
			return methodDefinition_sempred((MethodDefinitionContext)_localctx, predIndex);
		case 79:
			return elementList_sempred((ElementListContext)_localctx, predIndex);
		case 92:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 109:
			return exportDeclaration_sempred((ExportDeclarationContext)_localctx, predIndex);
		case 123:
			return eos_sempred((EosContext)_localctx, predIndex);
		case 127:
			return templateMiddleList_sempred((TemplateMiddleListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (_input.LA(1) != OpenBrace) && (_input.LA(1) != Function) && (_input.LA(1) != Class) && ((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true);
		}
		return true;
	}
	private boolean iterationStatement_sempred(IterationStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return ((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true);
		case 2:
			return ((_input.LA(1) == Let) ? _input.LA(2) != OpenBracket : true);
		case 3:
			return (_input.LA(1) != Let);
		case 4:
			return _input.LT(1).getText().equals("of");
		case 5:
			return _input.LT(1).getText().equals("of");
		case 6:
			return _input.LT(1).getText().equals("of");
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean arrowFunction_sempred(ArrowFunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean conciseBody_sempred(ConciseBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return (_input.LA(1) != OpenBrace);
		}
		return true;
	}
	private boolean methodDefinition_sempred(MethodDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return _input.LT(1).getText().equals("get");
		case 14:
			return _input.LT(1).getText().equals("set");
		}
		return true;
	}
	private boolean elementList_sempred(ElementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return _input.LT(1).getText().equals("target");
		case 18:
			return !here(LineTerminator);
		case 19:
			return precpred(_ctx, 27);
		case 20:
			return precpred(_ctx, 26);
		case 21:
			return precpred(_ctx, 25);
		case 22:
			return precpred(_ctx, 24);
		case 23:
			return precpred(_ctx, 23);
		case 24:
			return precpred(_ctx, 22);
		case 25:
			return precpred(_ctx, 21);
		case 26:
			return precpred(_ctx, 20);
		case 27:
			return precpred(_ctx, 19);
		case 28:
			return precpred(_ctx, 18);
		case 29:
			return precpred(_ctx, 17);
		case 30:
			return precpred(_ctx, 16);
		case 31:
			return precpred(_ctx, 15);
		case 32:
			return precpred(_ctx, 12);
		case 33:
			return precpred(_ctx, 11);
		case 34:
			return precpred(_ctx, 47);
		case 35:
			return precpred(_ctx, 46);
		case 36:
			return precpred(_ctx, 45);
		case 37:
			return precpred(_ctx, 41);
		case 38:
			return precpred(_ctx, 38);
		case 39:
			return !here(LineTerminator);
		case 40:
			return precpred(_ctx, 37);
		case 41:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean exportDeclaration_sempred(ExportDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return (_input.LA(1) != Function) && (_input.LA(1) != Class);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return lineTerminatorAhead();
		case 44:
			return _input.LT(1).getType() == CloseBrace;
		}
		return true;
	}
	private boolean templateMiddleList_sempred(TemplateMiddleListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u0535\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u0114\n\3\3\4\3\4\3\4\5\4\u0119\n\4\3\5\3\5\5\5\u011d"+
		"\n\5\3\6\3\6\5\6\u0121\n\6\3\7\3\7\3\b\3\b\5\b\u0127\n\b\3\b\3\b\3\t\6"+
		"\t\u012c\n\t\r\t\16\t\u012d\3\n\3\n\5\n\u0132\n\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\7\r\u013d\n\r\f\r\16\r\u0140\13\r\3\16\3\16\5\16"+
		"\u0144\n\16\3\16\3\16\3\16\5\16\u0149\n\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\7\20\u0151\n\20\f\20\16\20\u0154\13\20\3\21\3\21\5\21\u0158\n\21\3"+
		"\21\3\21\3\21\5\21\u015d\n\21\3\22\3\22\5\22\u0161\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016e\n\23\3\24\3\24\5\24"+
		"\u0172\n\24\3\24\5\24\u0175\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u0180\n\24\3\24\5\24\u0183\n\24\3\24\3\24\5\24\u0187\n\24"+
		"\3\25\3\25\3\25\7\25\u018c\n\25\f\25\16\25\u018f\13\25\3\26\3\26\3\26"+
		"\7\26\u0194\n\26\f\26\16\26\u0197\13\26\3\27\5\27\u019a\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u01a3\n\30\3\31\3\31\3\31\5\31\u01a8\n"+
		"\31\5\31\u01aa\n\31\3\32\3\32\5\32\u01ae\n\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u01c3\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u01d7\n \3 \3 \5 \u01db\n \3 \3 \5 \u01df\n \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u01e8\n \3 \3 \5 \u01ec\n \3 \3 \3 \3 \3 \3 \3 \5 \u01f5\n \3 \3"+
		" \5 \u01f9\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0233\n \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3$\3$\5$\u0240\n$\3%\3%\3%\5%\u0245\n%\3%\3%\3&\3&\3&"+
		"\5&\u024c\n&\3&\3&\3\'\3\'\3\'\5\'\u0253\n\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3*\3*\5*\u0265\n*\3*\3*\5*\u0269\n*\5*\u026b\n*\3"+
		"*\3*\3+\6+\u0270\n+\r+\16+\u0271\3,\3,\3,\3,\5,\u0278\n,\3-\3-\3-\5-\u027d"+
		"\n-\3.\3.\3.\3.\3/\3/\5/\u0285\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0299\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\5\64\u02a6\n\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\58\u02b8\n8\39\39\39\39\59\u02be\n9\59\u02c0\n9\3:\3:\3:\7:\u02c5"+
		"\n:\f:\16:\u02c8\13:\3;\3;\3<\3<\3=\3=\3>\5>\u02d1\n>\3?\3?\3?\3?\3?\3"+
		"@\3@\5@\u02da\n@\3A\3A\3A\3A\3A\3A\5A\u02e2\nA\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u02f4\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0312\nC\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\5"+
		"G\u032c\nG\3G\3G\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\3I\3J\3J\5J\u033d\nJ\3"+
		"J\3J\3K\5K\u0342\nK\3K\3K\5K\u0346\nK\3K\3K\3L\3L\3L\3M\3M\3N\6N\u0350"+
		"\nN\rN\16N\u0351\3O\3O\3O\3O\5O\u0358\nO\3P\3P\5P\u035c\nP\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\5P\u0367\nP\3P\3P\5P\u036b\nP\3Q\3Q\5Q\u036f\nQ\3Q\3"+
		"Q\5Q\u0373\nQ\3Q\5Q\u0376\nQ\3Q\3Q\3Q\5Q\u037b\nQ\3Q\3Q\3Q\3Q\5Q\u0381"+
		"\nQ\3Q\7Q\u0384\nQ\fQ\16Q\u0387\13Q\3R\6R\u038a\nR\rR\16R\u038b\3S\3S"+
		"\3S\3T\3T\3T\3T\3T\5T\u0396\nT\3T\3T\5T\u039a\nT\3U\3U\3U\7U\u039f\nU"+
		"\fU\16U\u03a2\13U\3V\3V\3V\3V\3V\3V\3V\5V\u03ab\nV\3W\3W\5W\u03af\nW\3"+
		"X\3X\3X\5X\u03b4\nX\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\5[\u03bf\n[\3[\3[\3\\\3"+
		"\\\5\\\u03c5\n\\\3\\\3\\\3\\\5\\\u03ca\n\\\7\\\u03cc\n\\\f\\\16\\\u03cf"+
		"\13\\\3]\3]\3]\7]\u03d4\n]\f]\16]\u03d7\13]\3^\3^\3^\5^\u03dc\n^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5"+
		"^\u03f6\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\5^\u040d\n^\3^\5^\u0410\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\5^\u0420\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\7^\u0465\n^\f^\16^\u0468\13^\3_\5_\u046b\n_\3`\3`\3a\5a\u0470"+
		"\na\3b\3b\3c\6c\u0475\nc\rc\16c\u0476\3d\3d\3d\5d\u047c\nd\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3e\5e\u0487\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0494"+
		"\nf\3g\3g\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u04a7\ni\3j"+
		"\3j\3j\3k\3k\3k\7k\u04af\nk\fk\16k\u04b2\13k\3l\3l\3l\3l\3l\5l\u04b9\n"+
		"l\3m\3m\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u04dd\no\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\3p\3p\3p\5p\u04ea\np\3q\3q\3q\7q\u04ef\nq\fq\16q\u04f2\13q\3r\3r\3r"+
		"\5r\u04f7\nr\3s\3s\3t\3t\5t\u04fd\nt\3u\3u\3v\3v\5v\u0503\nv\3w\3w\3x"+
		"\3x\3y\3y\3z\3z\3z\5z\u050e\nz\3{\3{\3|\3|\3}\3}\3}\3}\5}\u0518\n}\3~"+
		"\3~\3\177\3\177\3\177\3\177\3\177\5\177\u0521\n\177\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\5\u0080\u0527\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\7\u0081\u0530\n\u0081\f\u0081\16\u0081\u0533\13"+
		"\u0081\3\u0081\2\5\u00a0\u00ba\u0100\u0082\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\2\16\4\2\\\\aa\3\2\33\35\3\2\27\30\3\2"+
		"\36 \3\2!$\3\2%(\3\2.8\4\29:kk\3\2;>\3\29:\3\2?_\3\2bi\2\u0582\2\u0102"+
		"\3\2\2\2\4\u0113\3\2\2\2\6\u0118\3\2\2\2\b\u011c\3\2\2\2\n\u0120\3\2\2"+
		"\2\f\u0122\3\2\2\2\16\u0124\3\2\2\2\20\u012b\3\2\2\2\22\u0131\3\2\2\2"+
		"\24\u0133\3\2\2\2\26\u0137\3\2\2\2\30\u0139\3\2\2\2\32\u0148\3\2\2\2\34"+
		"\u014a\3\2\2\2\36\u014d\3\2\2\2 \u015c\3\2\2\2\"\u0160\3\2\2\2$\u016d"+
		"\3\2\2\2&\u0186\3\2\2\2(\u0188\3\2\2\2*\u0190\3\2\2\2,\u0199\3\2\2\2."+
		"\u01a2\3\2\2\2\60\u01a9\3\2\2\2\62\u01ab\3\2\2\2\64\u01af\3\2\2\2\66\u01b2"+
		"\3\2\2\28\u01b5\3\2\2\2:\u01b7\3\2\2\2<\u01bb\3\2\2\2>\u0232\3\2\2\2@"+
		"\u0234\3\2\2\2B\u0237\3\2\2\2D\u023a\3\2\2\2F\u023f\3\2\2\2H\u0241\3\2"+
		"\2\2J\u0248\3\2\2\2L\u024f\3\2\2\2N\u0256\3\2\2\2P\u025c\3\2\2\2R\u0262"+
		"\3\2\2\2T\u026f\3\2\2\2V\u0273\3\2\2\2X\u0279\3\2\2\2Z\u027e\3\2\2\2\\"+
		"\u0284\3\2\2\2^\u0286\3\2\2\2`\u0298\3\2\2\2b\u029a\3\2\2\2d\u02a0\3\2"+
		"\2\2f\u02a5\3\2\2\2h\u02a7\3\2\2\2j\u02aa\3\2\2\2l\u02b3\3\2\2\2n\u02b7"+
		"\3\2\2\2p\u02bf\3\2\2\2r\u02c1\3\2\2\2t\u02c9\3\2\2\2v\u02cb\3\2\2\2x"+
		"\u02cd\3\2\2\2z\u02d0\3\2\2\2|\u02d2\3\2\2\2~\u02d9\3\2\2\2\u0080\u02e1"+
		"\3\2\2\2\u0082\u02f3\3\2\2\2\u0084\u0311\3\2\2\2\u0086\u0313\3\2\2\2\u0088"+
		"\u0315\3\2\2\2\u008a\u031e\3\2\2\2\u008c\u0328\3\2\2\2\u008e\u0334\3\2"+
		"\2\2\u0090\u0336\3\2\2\2\u0092\u033a\3\2\2\2\u0094\u0341\3\2\2\2\u0096"+
		"\u0349\3\2\2\2\u0098\u034c\3\2\2\2\u009a\u034f\3\2\2\2\u009c\u0357\3\2"+
		"\2\2\u009e\u036a\3\2\2\2\u00a0\u0375\3\2\2\2\u00a2\u0389\3\2\2\2\u00a4"+
		"\u038d\3\2\2\2\u00a6\u0399\3\2\2\2\u00a8\u039b\3\2\2\2\u00aa\u03aa\3\2"+
		"\2\2\u00ac\u03ae\3\2\2\2\u00ae\u03b3\3\2\2\2\u00b0\u03b5\3\2\2\2\u00b2"+
		"\u03b9\3\2\2\2\u00b4\u03bc\3\2\2\2\u00b6\u03c4\3\2\2\2\u00b8\u03d0\3\2"+
		"\2\2\u00ba\u041f\3\2\2\2\u00bc\u046a\3\2\2\2\u00be\u046c\3\2\2\2\u00c0"+
		"\u046f\3\2\2\2\u00c2\u0471\3\2\2\2\u00c4\u0474\3\2\2\2\u00c6\u047b\3\2"+
		"\2\2\u00c8\u0486\3\2\2\2\u00ca\u0493\3\2\2\2\u00cc\u0495\3\2\2\2\u00ce"+
		"\u0497\3\2\2\2\u00d0\u04a6\3\2\2\2\u00d2\u04a8\3\2\2\2\u00d4\u04ab\3\2"+
		"\2\2\u00d6\u04b8\3\2\2\2\u00d8\u04ba\3\2\2\2\u00da\u04bc\3\2\2\2\u00dc"+
		"\u04dc\3\2\2\2\u00de\u04e9\3\2\2\2\u00e0\u04eb\3\2\2\2\u00e2\u04f3\3\2"+
		"\2\2\u00e4\u04f8\3\2\2\2\u00e6\u04fc\3\2\2\2\u00e8\u04fe\3\2\2\2\u00ea"+
		"\u0502\3\2\2\2\u00ec\u0504\3\2\2\2\u00ee\u0506\3\2\2\2\u00f0\u0508\3\2"+
		"\2\2\u00f2\u050d\3\2\2\2\u00f4\u050f\3\2\2\2\u00f6\u0511\3\2\2\2\u00f8"+
		"\u0517\3\2\2\2\u00fa\u0519\3\2\2\2\u00fc\u0520\3\2\2\2\u00fe\u0526\3\2"+
		"\2\2\u0100\u0528\3\2\2\2\u0102\u0103\5\u00c0a\2\u0103\u0104\7\2\2\3\u0104"+
		"\3\3\2\2\2\u0105\u0114\5\f\7\2\u0106\u0114\5\34\17\2\u0107\u0114\58\35"+
		"\2\u0108\u0114\5:\36\2\u0109\u0114\5<\37\2\u010a\u0114\5\n\6\2\u010b\u0114"+
		"\5H%\2\u010c\u0114\5J&\2\u010d\u0114\5L\'\2\u010e\u0114\5N(\2\u010f\u0114"+
		"\5Z.\2\u0110\u0114\5^\60\2\u0111\u0114\5`\61\2\u0112\u0114\5h\65\2\u0113"+
		"\u0105\3\2\2\2\u0113\u0106\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u0108\3\2"+
		"\2\2\u0113\u0109\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010b\3\2\2\2\u0113"+
		"\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2"+
		"\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\5\3\2\2\2\u0115\u0119\5\b\5\2\u0116\u0119\5\u0090I\2\u0117\u0119\5\24"+
		"\13\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\7\3\2\2\2\u011a\u011d\5j\66\2\u011b\u011d\5\u008aF\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\t\3\2\2\2\u011e\u0121\5> \2\u011f\u0121"+
		"\5P)\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\13\3\2\2\2\u0122"+
		"\u0123\5\16\b\2\u0123\r\3\2\2\2\u0124\u0126\7\13\2\2\u0125\u0127\5\20"+
		"\t\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\7\f\2\2\u0129\17\3\2\2\2\u012a\u012c\5\22\n\2\u012b\u012a\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\21"+
		"\3\2\2\2\u012f\u0132\5\4\3\2\u0130\u0132\5\6\4\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\23\3\2\2\2\u0133\u0134\5\26\f\2\u0134\u0135\5\30"+
		"\r\2\u0135\u0136\5\u00f8}\2\u0136\25\3\2\2\2\u0137\u0138\t\2\2\2\u0138"+
		"\27\3\2\2\2\u0139\u013e\5\32\16\2\u013a\u013b\7\16\2\2\u013b\u013d\5\32"+
		"\16\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\31\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5\u00ee"+
		"x\2\u0142\u0144\5\66\34\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0149\3\2\2\2\u0145\u0146\5\"\22\2\u0146\u0147\5\66\34\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0145\3\2\2\2\u0149\33\3\2\2\2\u014a"+
		"\u014b\5@!\2\u014b\u014c\5\u00f8}\2\u014c\35\3\2\2\2\u014d\u0152\5 \21"+
		"\2\u014e\u014f\7\16\2\2\u014f\u0151\5 \21\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\37\3\2\2"+
		"\2\u0154\u0152\3\2\2\2\u0155\u0157\5\u00eex\2\u0156\u0158\5\66\34\2\u0157"+
		"\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015d\3\2\2\2\u0159\u015a\5\""+
		"\22\2\u015a\u015b\5\66\34\2\u015b\u015d\3\2\2\2\u015c\u0155\3\2\2\2\u015c"+
		"\u0159\3\2\2\2\u015d!\3\2\2\2\u015e\u0161\5$\23\2\u015f\u0161\5&\24\2"+
		"\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161#\3\2\2\2\u0162\u0163\7"+
		"\13\2\2\u0163\u016e\7\f\2\2\u0164\u0165\7\13\2\2\u0165\u0166\5(\25\2\u0166"+
		"\u0167\7\f\2\2\u0167\u016e\3\2\2\2\u0168\u0169\7\13\2\2\u0169\u016a\5"+
		"(\25\2\u016a\u016b\7\16\2\2\u016b\u016c\7\f\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u0162\3\2\2\2\u016d\u0164\3\2\2\2\u016d\u0168\3\2\2\2\u016e%\3\2\2\2"+
		"\u016f\u0171\7\7\2\2\u0170\u0172\5\u00a2R\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0175\5\64\33\2\u0174\u0173\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0187\7\b\2\2\u0177"+
		"\u0178\7\7\2\2\u0178\u0179\5*\26\2\u0179\u017a\7\b\2\2\u017a\u0187\3\2"+
		"\2\2\u017b\u017c\7\7\2\2\u017c\u017d\5*\26\2\u017d\u017f\7\16\2\2\u017e"+
		"\u0180\5\u00a2R\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182"+
		"\3\2\2\2\u0181\u0183\5\64\33\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\u0185\7\b\2\2\u0185\u0187\3\2\2\2\u0186\u016f"+
		"\3\2\2\2\u0186\u0177\3\2\2\2\u0186\u017b\3\2\2\2\u0187\'\3\2\2\2\u0188"+
		"\u018d\5.\30\2\u0189\u018a\7\16\2\2\u018a\u018c\5.\30\2\u018b\u0189\3"+
		"\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		")\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0195\5,\27\2\u0191\u0192\7\16\2\2"+
		"\u0192\u0194\5,\27\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196+\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u019a\5\u00a2R\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\5\60\31\2\u019c-\3\2\2\2\u019d\u01a3\5\62\32\2\u019e"+
		"\u019f\5\u00acW\2\u019f\u01a0\7\22\2\2\u01a0\u01a1\5\60\31\2\u01a1\u01a3"+
		"\3\2\2\2\u01a2\u019d\3\2\2\2\u01a2\u019e\3\2\2\2\u01a3/\3\2\2\2\u01a4"+
		"\u01aa\5\62\32\2\u01a5\u01a7\5\"\22\2\u01a6\u01a8\5\66\34\2\u01a7\u01a6"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9"+
		"\u01a5\3\2\2\2\u01aa\61\3\2\2\2\u01ab\u01ad\5\u00eex\2\u01ac\u01ae\5\66"+
		"\34\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\63\3\2\2\2\u01af\u01b0"+
		"\7\23\2\2\u01b0\u01b1\5\u00eex\2\u01b1\65\3\2\2\2\u01b2\u01b3\7\20\2\2"+
		"\u01b3\u01b4\5\u00ba^\2\u01b4\67\3\2\2\2\u01b5\u01b6\7\r\2\2\u01b69\3"+
		"\2\2\2\u01b7\u01b8\6\36\2\2\u01b8\u01b9\5\u00b8]\2\u01b9\u01ba\5\u00f8"+
		"}\2\u01ba;\3\2\2\2\u01bb\u01bc\7T\2\2\u01bc\u01bd\7\t\2\2\u01bd\u01be"+
		"\5\u00b8]\2\u01be\u01bf\7\n\2\2\u01bf\u01c2\5\4\3\2\u01c0\u01c1\7D\2\2"+
		"\u01c1\u01c3\5\4\3\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3=\3"+
		"\2\2\2\u01c4\u01c5\7@\2\2\u01c5\u01c6\5\4\3\2\u01c6\u01c7\7N\2\2\u01c7"+
		"\u01c8\7\t\2\2\u01c8\u01c9\5\u00b8]\2\u01c9\u01ca\7\n\2\2\u01ca\u01cb"+
		"\5\u00f8}\2\u01cb\u0233\3\2\2\2\u01cc\u01cd\7N\2\2\u01cd\u01ce\7\t\2\2"+
		"\u01ce\u01cf\5\u00b8]\2\u01cf\u01d0\7\n\2\2\u01d0\u01d1\5\4\3\2\u01d1"+
		"\u0233\3\2\2\2\u01d2\u01d3\7L\2\2\u01d3\u01d4\7\t\2\2\u01d4\u01d6\6 \3"+
		"\2\u01d5\u01d7\5\u00b8]\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01da\7\r\2\2\u01d9\u01db\5\u00b8]\2\u01da\u01d9"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\7\r\2\2\u01dd"+
		"\u01df\5\u00b8]\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\7\n\2\2\u01e1\u0233\5\4\3\2\u01e2\u01e3\7L\2\2\u01e3"+
		"\u01e4\7\t\2\2\u01e4\u01e5\5@!\2\u01e5\u01e7\7\r\2\2\u01e6\u01e8\5\u00b8"+
		"]\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\7\r\2\2\u01ea\u01ec\5\u00b8]\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\n\2\2\u01ee\u01ef\5\4\3\2\u01ef"+
		"\u0233\3\2\2\2\u01f0\u01f1\7L\2\2\u01f1\u01f2\7\t\2\2\u01f2\u01f4\5\24"+
		"\13\2\u01f3\u01f5\5\u00b8]\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f8\7\r\2\2\u01f7\u01f9\5\u00b8]\2\u01f8\u01f7"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\7\n\2\2\u01fb"+
		"\u01fc\5\4\3\2\u01fc\u0233\3\2\2\2\u01fd\u01fe\7L\2\2\u01fe\u01ff\7\t"+
		"\2\2\u01ff\u0200\6 \4\2\u0200\u0201\5\u00ba^\2\u0201\u0202\7W\2\2\u0202"+
		"\u0203\5\u00b8]\2\u0203\u0204\7\n\2\2\u0204\u0205\5\4\3\2\u0205\u0233"+
		"\3\2\2\2\u0206\u0207\7L\2\2\u0207\u0208\7\t\2\2\u0208\u0209\5B\"\2\u0209"+
		"\u020a\7W\2\2\u020a\u020b\5\u00b8]\2\u020b\u020c\7\n\2\2\u020c\u020d\5"+
		"\4\3\2\u020d\u0233\3\2\2\2\u020e\u020f\7L\2\2\u020f\u0210\7\t\2\2\u0210"+
		"\u0211\5D#\2\u0211\u0212\7W\2\2\u0212\u0213\5\u00b8]\2\u0213\u0214\7\n"+
		"\2\2\u0214\u0215\5\4\3\2\u0215\u0233\3\2\2\2\u0216\u0217\7L\2\2\u0217"+
		"\u0218\7\t\2\2\u0218\u0219\6 \5\2\u0219\u021a\5\u00ba^\2\u021a\u021b\6"+
		" \6\2\u021b\u021c\7j\2\2\u021c\u021d\5\u00ba^\2\u021d\u021e\7\n\2\2\u021e"+
		"\u021f\5\4\3\2\u021f\u0233\3\2\2\2\u0220\u0221\7L\2\2\u0221\u0222\7\t"+
		"\2\2\u0222\u0223\5B\"\2\u0223\u0224\6 \7\2\u0224\u0225\7j\2\2\u0225\u0226"+
		"\5\u00ba^\2\u0226\u0227\7\n\2\2\u0227\u0228\5\4\3\2\u0228\u0233\3\2\2"+
		"\2\u0229\u022a\7L\2\2\u022a\u022b\7\t\2\2\u022b\u022c\5D#\2\u022c\u022d"+
		"\6 \b\2\u022d\u022e\7j\2\2\u022e\u022f\5\u00ba^\2\u022f\u0230\7\n\2\2"+
		"\u0230\u0231\5\4\3\2\u0231\u0233\3\2\2\2\u0232\u01c4\3\2\2\2\u0232\u01cc"+
		"\3\2\2\2\u0232\u01d2\3\2\2\2\u0232\u01e2\3\2\2\2\u0232\u01f0\3\2\2\2\u0232"+
		"\u01fd\3\2\2\2\u0232\u0206\3\2\2\2\u0232\u020e\3\2\2\2\u0232\u0216\3\2"+
		"\2\2\u0232\u0220\3\2\2\2\u0232\u0229\3\2\2\2\u0233?\3\2\2\2\u0234\u0235"+
		"\7F\2\2\u0235\u0236\5\36\20\2\u0236A\3\2\2\2\u0237\u0238\7F\2\2\u0238"+
		"\u0239\5F$\2\u0239C\3\2\2\2\u023a\u023b\5\26\f\2\u023b\u023c\5F$\2\u023c"+
		"E\3\2\2\2\u023d\u0240\5\u00eex\2\u023e\u0240\5\"\22\2\u023f\u023d\3\2"+
		"\2\2\u023f\u023e\3\2\2\2\u0240G\3\2\2\2\u0241\u0244\7K\2\2\u0242\u0243"+
		"\6%\t\2\u0243\u0245\7j\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\5\u00f8}\2\u0247I\3\2\2\2\u0248\u024b\7?\2"+
		"\2\u0249\u024a\6&\n\2\u024a\u024c\7j\2\2\u024b\u0249\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5\u00f8}\2\u024eK\3\2\2\2\u024f"+
		"\u0252\7I\2\2\u0250\u0251\6\'\13\2\u0251\u0253\5\u00b8]\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\5\u00f8}"+
		"\2\u0255M\3\2\2\2\u0256\u0257\7R\2\2\u0257\u0258\7\t\2\2\u0258\u0259\5"+
		"\u00b8]\2\u0259\u025a\7\n\2\2\u025a\u025b\5\4\3\2\u025bO\3\2\2\2\u025c"+
		"\u025d\7M\2\2\u025d\u025e\7\t\2\2\u025e\u025f\5\u00b8]\2\u025f\u0260\7"+
		"\n\2\2\u0260\u0261\5R*\2\u0261Q\3\2\2\2\u0262\u0264\7\13\2\2\u0263\u0265"+
		"\5T+\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u026a\3\2\2\2\u0266"+
		"\u0268\5X-\2\u0267\u0269\5T+\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2"+
		"\u0269\u026b\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c\u026d\7\f\2\2\u026dS\3\2\2\2\u026e\u0270\5V,\2\u026f\u026e"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"U\3\2\2\2\u0273\u0274\7C\2\2\u0274\u0275\5\u00b8]\2\u0275\u0277\7\22\2"+
		"\2\u0276\u0278\5\20\t\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"W\3\2\2\2\u0279\u027a\7S\2\2\u027a\u027c\7\22\2\2\u027b\u027d\5\20\t\2"+
		"\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027dY\3\2\2\2\u027e\u027f\7"+
		"j\2\2\u027f\u0280\7\22\2\2\u0280\u0281\5\\/\2\u0281[\3\2\2\2\u0282\u0285"+
		"\5\4\3\2\u0283\u0285\5j\66\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285"+
		"]\3\2\2\2\u0286\u0287\7U\2\2\u0287\u0288\6\60\f\2\u0288\u0289\5\u00b8"+
		"]\2\u0289\u028a\5\u00f8}\2\u028a_\3\2\2\2\u028b\u028c\7X\2\2\u028c\u028d"+
		"\5\16\b\2\u028d\u028e\5b\62\2\u028e\u0299\3\2\2\2\u028f\u0290\7X\2\2\u0290"+
		"\u0291\5\16\b\2\u0291\u0292\5d\63\2\u0292\u0299\3\2\2\2\u0293\u0294\7"+
		"X\2\2\u0294\u0295\5\16\b\2\u0295\u0296\5b\62\2\u0296\u0297\5d\63\2\u0297"+
		"\u0299\3\2\2\2\u0298\u028b\3\2\2\2\u0298\u028f\3\2\2\2\u0298\u0293\3\2"+
		"\2\2\u0299a\3\2\2\2\u029a\u029b\7G\2\2\u029b\u029c\7\t\2\2\u029c\u029d"+
		"\5f\64\2\u029d\u029e\7\n\2\2\u029e\u029f\5\16\b\2\u029fc\3\2\2\2\u02a0"+
		"\u02a1\7H\2\2\u02a1\u02a2\5\16\b\2\u02a2e\3\2\2\2\u02a3\u02a6\5\u00ee"+
		"x\2\u02a4\u02a6\5\"\22\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6"+
		"g\3\2\2\2\u02a7\u02a8\7O\2\2\u02a8\u02a9\5\u00f8}\2\u02a9i\3\2\2\2\u02aa"+
		"\u02ab\7P\2\2\u02ab\u02ac\5\u00eex\2\u02ac\u02ad\7\t\2\2\u02ad\u02ae\5"+
		"n8\2\u02ae\u02af\7\n\2\2\u02af\u02b0\7\13\2\2\u02b0\u02b1\5x=\2\u02b1"+
		"\u02b2\7\f\2\2\u02b2k\3\2\2\2\u02b3\u02b4\5n8\2\u02b4m\3\2\2\2\u02b5\u02b8"+
		"\3\2\2\2\u02b6\u02b8\5p9\2\u02b7\u02b5\3\2\2\2\u02b7\u02b6\3\2\2\2\u02b8"+
		"o\3\2\2\2\u02b9\u02c0\5t;\2\u02ba\u02bd\5r:\2\u02bb\u02bc\7\16\2\2\u02bc"+
		"\u02be\5t;\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3\2\2"+
		"\2\u02bf\u02b9\3\2\2\2\u02bf\u02ba\3\2\2\2\u02c0q\3\2\2\2\u02c1\u02c6"+
		"\5v<\2\u02c2\u02c3\7\16\2\2\u02c3\u02c5\5v<\2\u02c4\u02c2\3\2\2\2\u02c5"+
		"\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7s\3\2\2\2"+
		"\u02c8\u02c6\3\2\2\2\u02c9\u02ca\5\64\33\2\u02cau\3\2\2\2\u02cb\u02cc"+
		"\5\60\31\2\u02ccw\3\2\2\2\u02cd\u02ce\5z>\2\u02cey\3\2\2\2\u02cf\u02d1"+
		"\5\20\t\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1{\3\2\2\2\u02d2"+
		"\u02d3\5~@\2\u02d3\u02d4\6?\r\2\u02d4\u02d5\7\17\2\2\u02d5\u02d6\5\u0080"+
		"A\2\u02d6}\3\2\2\2\u02d7\u02da\5\u00eex\2\u02d8\u02da\5\u0082B\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da\177\3\2\2\2\u02db\u02dc\6A\16"+
		"\2\u02dc\u02e2\5\u00ba^\2\u02dd\u02de\7\13\2\2\u02de\u02df\5x=\2\u02df"+
		"\u02e0\7\f\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02db\3\2\2\2\u02e1\u02dd\3\2"+
		"\2\2\u02e2\u0081\3\2\2\2\u02e3\u02e4\7\t\2\2\u02e4\u02e5\5\u00b8]\2\u02e5"+
		"\u02e6\7\n\2\2\u02e6\u02f4\3\2\2\2\u02e7\u02e8\7\t\2\2\u02e8\u02f4\7\n"+
		"\2\2\u02e9\u02ea\7\t\2\2\u02ea\u02eb\5\64\33\2\u02eb\u02ec\7\n\2\2\u02ec"+
		"\u02f4\3\2\2\2\u02ed\u02ee\7\t\2\2\u02ee\u02ef\5\u00b8]\2\u02ef\u02f0"+
		"\7\16\2\2\u02f0\u02f1\5\64\33\2\u02f1\u02f2\7\n\2\2\u02f2\u02f4\3\2\2"+
		"\2\u02f3\u02e3\3\2\2\2\u02f3\u02e7\3\2\2\2\u02f3\u02e9\3\2\2\2\u02f3\u02ed"+
		"\3\2\2\2\u02f4\u0083\3\2\2\2\u02f5\u02f6\5\u00acW\2\u02f6\u02f7\7\t\2"+
		"\2\u02f7\u02f8\5l\67\2\u02f8\u02f9\7\n\2\2\u02f9\u02fa\7\13\2\2\u02fa"+
		"\u02fb\5x=\2\u02fb\u02fc\7\f\2\2\u02fc\u0312\3\2\2\2\u02fd\u0312\5\u0088"+
		"E\2\u02fe\u02ff\6C\17\2\u02ff\u0300\7j\2\2\u0300\u0301\5\u00acW\2\u0301"+
		"\u0302\7\t\2\2\u0302\u0303\7\n\2\2\u0303\u0304\7\13\2\2\u0304\u0305\5"+
		"x=\2\u0305\u0306\7\f\2\2\u0306\u0312\3\2\2\2\u0307\u0308\6C\20\2\u0308"+
		"\u0309\7j\2\2\u0309\u030a\5\u00acW\2\u030a\u030b\7\t\2\2\u030b\u030c\5"+
		"\u0086D\2\u030c\u030d\7\n\2\2\u030d\u030e\7\13\2\2\u030e\u030f\5x=\2\u030f"+
		"\u0310\7\f\2\2\u0310\u0312\3\2\2\2\u0311\u02f5\3\2\2\2\u0311\u02fd\3\2"+
		"\2\2\u0311\u02fe\3\2\2\2\u0311\u0307\3\2\2\2\u0312\u0085\3\2\2\2\u0313"+
		"\u0314\5v<\2\u0314\u0087\3\2\2\2\u0315\u0316\7\33\2\2\u0316\u0317\5\u00ac"+
		"W\2\u0317\u0318\7\t\2\2\u0318\u0319\5l\67\2\u0319\u031a\7\n\2\2\u031a"+
		"\u031b\7\13\2\2\u031b\u031c\5\u008eH\2\u031c\u031d\7\f\2\2\u031d\u0089"+
		"\3\2\2\2\u031e\u031f\7P\2\2\u031f\u0320\7\33\2\2\u0320\u0321\5\u00eex"+
		"\2\u0321\u0322\7\t\2\2\u0322\u0323\5n8\2\u0323\u0324\7\n\2\2\u0324\u0325"+
		"\7\13\2\2\u0325\u0326\5\u008eH\2\u0326\u0327\7\f\2\2\u0327\u008b\3\2\2"+
		"\2\u0328\u0329\7P\2\2\u0329\u032b\7\33\2\2\u032a\u032c\5\u00eex\2\u032b"+
		"\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\7\t"+
		"\2\2\u032e\u032f\5n8\2\u032f\u0330\7\n\2\2\u0330\u0331\7\13\2\2\u0331"+
		"\u0332\5\u008eH\2\u0332\u0333\7\f\2\2\u0333\u008d\3\2\2\2\u0334\u0335"+
		"\5x=\2\u0335\u008f\3\2\2\2\u0336\u0337\7Z\2\2\u0337\u0338\5\u00eex\2\u0338"+
		"\u0339\5\u0094K\2\u0339\u0091\3\2\2\2\u033a\u033c\7Z\2\2\u033b\u033d\5"+
		"\u00eex\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2"+
		"\u033e\u033f\5\u0094K\2\u033f\u0093\3\2\2\2\u0340\u0342\5\u0096L\2\u0341"+
		"\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\7\13"+
		"\2\2\u0344\u0346\5\u0098M\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u0348\7\f\2\2\u0348\u0095\3\2\2\2\u0349\u034a\7["+
		"\2\2\u034a\u034b\5\u00ba^\2\u034b\u0097\3\2\2\2\u034c\u034d\5\u009aN\2"+
		"\u034d\u0099\3\2\2\2\u034e\u0350\5\u009cO\2\u034f\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u009b\3\2"+
		"\2\2\u0353\u0358\5\u0084C\2\u0354\u0355\7`\2\2\u0355\u0358\5\u0084C\2"+
		"\u0356\u0358\7\r\2\2\u0357\u0353\3\2\2\2\u0357\u0354\3\2\2\2\u0357\u0356"+
		"\3\2\2\2\u0358\u009d\3\2\2\2\u0359\u035b\7\7\2\2\u035a\u035c\5\u00a2R"+
		"\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u036b"+
		"\7\b\2\2\u035e\u035f\7\7\2\2\u035f\u0360\5\u00a0Q\2\u0360\u0361\7\b\2"+
		"\2\u0361\u036b\3\2\2\2\u0362\u0363\7\7\2\2\u0363\u0364\5\u00a0Q\2\u0364"+
		"\u0366\7\16\2\2\u0365\u0367\5\u00a2R\2\u0366\u0365\3\2\2\2\u0366\u0367"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\7\b\2\2\u0369\u036b\3\2\2\2\u036a"+
		"\u0359\3\2\2\2\u036a\u035e\3\2\2\2\u036a\u0362\3\2\2\2\u036b\u009f\3\2"+
		"\2\2\u036c\u036e\bQ\1\2\u036d\u036f\5\u00a2R\2\u036e\u036d\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0376\5\u00ba^\2\u0371\u0373"+
		"\5\u00a2R\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2"+
		"\2\u0374\u0376\5\u00a4S\2\u0375\u036c\3\2\2\2\u0375\u0372\3\2\2\2\u0376"+
		"\u0385\3\2\2\2\u0377\u0378\f\4\2\2\u0378\u037a\7\16\2\2\u0379\u037b\5"+
		"\u00a2R\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\3\2\2\2"+
		"\u037c\u0384\5\u00ba^\2\u037d\u037e\f\3\2\2\u037e\u0380\7\16\2\2\u037f"+
		"\u0381\5\u00a2R\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382"+
		"\3\2\2\2\u0382\u0384\5\u00a4S\2\u0383\u0377\3\2\2\2\u0383\u037d\3\2\2"+
		"\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u00a1"+
		"\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u038a\7\16\2\2\u0389\u0388\3\2\2\2"+
		"\u038a\u038b\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u00a3"+
		"\3\2\2\2\u038d\u038e\7\23\2\2\u038e\u038f\5\u00ba^\2\u038f\u00a5\3\2\2"+
		"\2\u0390\u0391\7\13\2\2\u0391\u039a\7\f\2\2\u0392\u0393\7\13\2\2\u0393"+
		"\u0395\5\u00a8U\2\u0394\u0396\7\16\2\2\u0395\u0394\3\2\2\2\u0395\u0396"+
		"\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\7\f\2\2\u0398\u039a\3\2\2\2\u0399"+
		"\u0390\3\2\2\2\u0399\u0392\3\2\2\2\u039a\u00a7\3\2\2\2\u039b\u03a0\5\u00aa"+
		"V\2\u039c\u039d\7\16\2\2\u039d\u039f\5\u00aaV\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u00a9\3\2"+
		"\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03ab\5\u00ecw\2\u03a4\u03ab\5\u00b2Z\2"+
		"\u03a5\u03a6\5\u00acW\2\u03a6\u03a7\7\22\2\2\u03a7\u03a8\5\u00ba^\2\u03a8"+
		"\u03ab\3\2\2\2\u03a9\u03ab\5\u0084C\2\u03aa\u03a3\3\2\2\2\u03aa\u03a4"+
		"\3\2\2\2\u03aa\u03a5\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u00ab\3\2\2\2\u03ac"+
		"\u03af\5\u00aeX\2\u03ad\u03af\5\u00b0Y\2\u03ae\u03ac\3\2\2\2\u03ae\u03ad"+
		"\3\2\2\2\u03af\u00ad\3\2\2\2\u03b0\u03b4\5\u00eav\2\u03b1\u03b4\7k\2\2"+
		"\u03b2\u03b4\5\u00e8u\2\u03b3\u03b0\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b2\3\2\2\2\u03b4\u00af\3\2\2\2\u03b5\u03b6\7\7\2\2\u03b6\u03b7\5\u00ba"+
		"^\2\u03b7\u03b8\7\b\2\2\u03b8\u00b1\3\2\2\2\u03b9\u03ba\5\u00ecw\2\u03ba"+
		"\u03bb\5\66\34\2\u03bb\u00b3\3\2\2\2\u03bc\u03be\7\t\2\2\u03bd\u03bf\5"+
		"\u00b6\\\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2"+
		"\u03c0\u03c1\7\n\2\2\u03c1\u00b5\3\2\2\2\u03c2\u03c5\5\u00a4S\2\u03c3"+
		"\u03c5\5\u00ba^\2\u03c4\u03c2\3\2\2\2\u03c4\u03c3\3\2\2\2\u03c5\u03cd"+
		"\3\2\2\2\u03c6\u03c9\7\16\2\2\u03c7\u03ca\5\u00a4S\2\u03c8\u03ca\5\u00ba"+
		"^\2\u03c9\u03c7\3\2\2\2\u03c9\u03c8\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb"+
		"\u03c6\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2"+
		"\2\2\u03ce\u00b7\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d5\5\u00ba^\2\u03d1"+
		"\u03d2\7\16\2\2\u03d2\u03d4\5\u00ba^\2\u03d3\u03d1\3\2\2\2\u03d4\u03d7"+
		"\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u00b9\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d8\u03d9\b^\1\2\u03d9\u03db\7P\2\2\u03da\u03dc\5\u00ee"+
		"x\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u03de\7\t\2\2\u03de\u03df\5n8\2\u03df\u03e0\7\n\2\2\u03e0\u03e1\7\13"+
		"\2\2\u03e1\u03e2\5x=\2\u03e2\u03e3\7\f\2\2\u03e3\u0420\3\2\2\2\u03e4\u03e5"+
		"\7]\2\2\u03e5\u03e6\7\7\2\2\u03e6\u03e7\5\u00b8]\2\u03e7\u03e8\7\b\2\2"+
		"\u03e8\u0420\3\2\2\2\u03e9\u03ea\7]\2\2\u03ea\u03eb\7\24\2\2\u03eb\u0420"+
		"\5\u00eav\2\u03ec\u03ed\7]\2\2\u03ed\u0420\5\u00b4[\2\u03ee\u03ef\7E\2"+
		"\2\u03ef\u03f0\7\24\2\2\u03f0\u03f1\6^\23\2\u03f1\u0420\7j\2\2\u03f2\u03f3"+
		"\7E\2\2\u03f3\u03f5\5\u00ba^\2\u03f4\u03f6\5\u00b4[\2\u03f5\u03f4\3\2"+
		"\2\2\u03f5\u03f6\3\2\2\2\u03f6\u0420\3\2\2\2\u03f7\u03f8\7V\2\2\u03f8"+
		"\u0420\5\u00ba^&\u03f9\u03fa\7J\2\2\u03fa\u0420\5\u00ba^%\u03fb\u03fc"+
		"\7B\2\2\u03fc\u0420\5\u00ba^$\u03fd\u03fe\7\25\2\2\u03fe\u0420\5\u00ba"+
		"^#\u03ff\u0400\7\26\2\2\u0400\u0420\5\u00ba^\"\u0401\u0402\7\27\2\2\u0402"+
		"\u0420\5\u00ba^!\u0403\u0404\7\30\2\2\u0404\u0420\5\u00ba^ \u0405\u0406"+
		"\7\31\2\2\u0406\u0420\5\u00ba^\37\u0407\u0408\7\32\2\2\u0408\u0420\5\u00ba"+
		"^\36\u0409\u040f\7^\2\2\u040a\u040c\6^\24\2\u040b\u040d\7\33\2\2\u040c"+
		"\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\5\u00ba"+
		"^\2\u040f\u040a\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0420\3\2\2\2\u0411"+
		"\u0420\5|?\2\u0412\u0420\7Q\2\2\u0413\u0420\7j\2\2\u0414\u0420\5\u00e6"+
		"t\2\u0415\u0420\5\u009eP\2\u0416\u0420\5\u00a6T\2\u0417\u0420\5\u0092"+
		"J\2\u0418\u0420\5\u008cG\2\u0419\u0420\7\5\2\2\u041a\u0420\5\u00fc\177"+
		"\2\u041b\u041c\7\t\2\2\u041c\u041d\5\u00b8]\2\u041d\u041e\7\n\2\2\u041e"+
		"\u0420\3\2\2\2\u041f\u03d8\3\2\2\2\u041f\u03e4\3\2\2\2\u041f\u03e9\3\2"+
		"\2\2\u041f\u03ec\3\2\2\2\u041f\u03ee\3\2\2\2\u041f\u03f2\3\2\2\2\u041f"+
		"\u03f7\3\2\2\2\u041f\u03f9\3\2\2\2\u041f\u03fb\3\2\2\2\u041f\u03fd\3\2"+
		"\2\2\u041f\u03ff\3\2\2\2\u041f\u0401\3\2\2\2\u041f\u0403\3\2\2\2\u041f"+
		"\u0405\3\2\2\2\u041f\u0407\3\2\2\2\u041f\u0409\3\2\2\2\u041f\u0411\3\2"+
		"\2\2\u041f\u0412\3\2\2\2\u041f\u0413\3\2\2\2\u041f\u0414\3\2\2\2\u041f"+
		"\u0415\3\2\2\2\u041f\u0416\3\2\2\2\u041f\u0417\3\2\2\2\u041f\u0418\3\2"+
		"\2\2\u041f\u0419\3\2\2\2\u041f\u041a\3\2\2\2\u041f\u041b\3\2\2\2\u0420"+
		"\u0466\3\2\2\2\u0421\u0422\f\35\2\2\u0422\u0423\t\3\2\2\u0423\u0465\5"+
		"\u00ba^\36\u0424\u0425\f\34\2\2\u0425\u0426\t\4\2\2\u0426\u0465\5\u00ba"+
		"^\35\u0427\u0428\f\33\2\2\u0428\u0429\t\5\2\2\u0429\u0465\5\u00ba^\34"+
		"\u042a\u042b\f\32\2\2\u042b\u042c\t\6\2\2\u042c\u0465\5\u00ba^\33\u042d"+
		"\u042e\f\31\2\2\u042e\u042f\7A\2\2\u042f\u0465\5\u00ba^\32\u0430\u0431"+
		"\f\30\2\2\u0431\u0432\7W\2\2\u0432\u0465\5\u00ba^\31\u0433\u0434\f\27"+
		"\2\2\u0434\u0435\t\7\2\2\u0435\u0465\5\u00ba^\30\u0436\u0437\f\26\2\2"+
		"\u0437\u0438\7)\2\2\u0438\u0465\5\u00ba^\27\u0439\u043a\f\25\2\2\u043a"+
		"\u043b\7*\2\2\u043b\u0465\5\u00ba^\26\u043c\u043d\f\24\2\2\u043d\u043e"+
		"\7+\2\2\u043e\u0465\5\u00ba^\25\u043f\u0440\f\23\2\2\u0440\u0441\7,\2"+
		"\2\u0441\u0465\5\u00ba^\24\u0442\u0443\f\22\2\2\u0443\u0444\7-\2\2\u0444"+
		"\u0465\5\u00ba^\23\u0445\u0446\f\21\2\2\u0446\u0447\7\21\2\2\u0447\u0448"+
		"\5\u00ba^\2\u0448\u0449\7\22\2\2\u0449\u044a\5\u00ba^\22\u044a\u0465\3"+
		"\2\2\2\u044b\u044c\f\16\2\2\u044c\u044d\7\20\2\2\u044d\u0465\5\u00ba^"+
		"\17\u044e\u044f\f\r\2\2\u044f\u0450\5\u00e4s\2\u0450\u0451\5\u00ba^\16"+
		"\u0451\u0465\3\2\2\2\u0452\u0453\f\61\2\2\u0453\u0454\7\7\2\2\u0454\u0455"+
		"\5\u00b8]\2\u0455\u0456\7\b\2\2\u0456\u0465\3\2\2\2\u0457\u0458\f\60\2"+
		"\2\u0458\u0459\7\24\2\2\u0459\u0465\5\u00eav\2\u045a\u045b\f/\2\2\u045b"+
		"\u0465\5\u00fc\177\2\u045c\u045d\f+\2\2\u045d\u0465\5\u00b4[\2\u045e\u045f"+
		"\f(\2\2\u045f\u0460\6^)\2\u0460\u0465\7\25\2\2\u0461\u0462\f\'\2\2\u0462"+
		"\u0463\6^+\2\u0463\u0465\7\26\2\2\u0464\u0421\3\2\2\2\u0464\u0424\3\2"+
		"\2\2\u0464\u0427\3\2\2\2\u0464\u042a\3\2\2\2\u0464\u042d\3\2\2\2\u0464"+
		"\u0430\3\2\2\2\u0464\u0433\3\2\2\2\u0464\u0436\3\2\2\2\u0464\u0439\3\2"+
		"\2\2\u0464\u043c\3\2\2\2\u0464\u043f\3\2\2\2\u0464\u0442\3\2\2\2\u0464"+
		"\u0445\3\2\2\2\u0464\u044b\3\2\2\2\u0464\u044e\3\2\2\2\u0464\u0452\3\2"+
		"\2\2\u0464\u0457\3\2\2\2\u0464\u045a\3\2\2\2\u0464\u045c\3\2\2\2\u0464"+
		"\u045e\3\2\2\2\u0464\u0461\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2"+
		"\2\2\u0466\u0467\3\2\2\2\u0467\u00bb\3\2\2\2\u0468\u0466\3\2\2\2\u0469"+
		"\u046b\5\u00be`\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u00bd"+
		"\3\2\2\2\u046c\u046d\5\20\t\2\u046d\u00bf\3\2\2\2\u046e\u0470\5\u00c2"+
		"b\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u00c1\3\2\2\2\u0471"+
		"\u0472\5\u00c4c\2\u0472\u00c3\3\2\2\2\u0473\u0475\5\u00c6d\2\u0474\u0473"+
		"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u00c5\3\2\2\2\u0478\u047c\5\u00c8e\2\u0479\u047c\5\u00dco\2\u047a\u047c"+
		"\5\22\n\2\u047b\u0478\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047a\3\2\2\2"+
		"\u047c\u00c7\3\2\2\2\u047d\u047e\7_\2\2\u047e\u047f\5\u00caf\2\u047f\u0480"+
		"\5\u00d2j\2\u0480\u0481\5\u00f8}\2\u0481\u0487\3\2\2\2\u0482\u0483\7_"+
		"\2\2\u0483\u0484\5\u00d8m\2\u0484\u0485\5\u00f8}\2\u0485\u0487\3\2\2\2"+
		"\u0486\u047d\3\2\2\2\u0486\u0482\3\2\2\2\u0487\u00c9\3\2\2\2\u0488\u0494"+
		"\5\u00ccg\2\u0489\u0494\5\u00ceh\2\u048a\u0494\5\u00d0i\2\u048b\u048c"+
		"\5\u00ccg\2\u048c\u048d\7\16\2\2\u048d\u048e\5\u00ceh\2\u048e\u0494\3"+
		"\2\2\2\u048f\u0490\5\u00ccg\2\u0490\u0491\7\16\2\2\u0491\u0492\5\u00d0"+
		"i\2\u0492\u0494\3\2\2\2\u0493\u0488\3\2\2\2\u0493\u0489\3\2\2\2\u0493"+
		"\u048a\3\2\2\2\u0493\u048b\3\2\2\2\u0493\u048f\3\2\2\2\u0494\u00cb\3\2"+
		"\2\2\u0495\u0496\5\u00dan\2\u0496\u00cd\3\2\2\2\u0497\u0498\7\33\2\2\u0498"+
		"\u0499\7\3\2\2\u0499\u049a\5\u00dan\2\u049a\u00cf\3\2\2\2\u049b\u049c"+
		"\7\13\2\2\u049c\u04a7\7\f\2\2\u049d\u049e\7\13\2\2\u049e\u049f\5\u00d4"+
		"k\2\u049f\u04a0\7\f\2\2\u04a0\u04a7\3\2\2\2\u04a1\u04a2\7\13\2\2\u04a2"+
		"\u04a3\5\u00d4k\2\u04a3\u04a4\7\16\2\2\u04a4\u04a5\7\f\2\2\u04a5\u04a7"+
		"\3\2\2\2\u04a6\u049b\3\2\2\2\u04a6\u049d\3\2\2\2\u04a6\u04a1\3\2\2\2\u04a7"+
		"\u00d1\3\2\2\2\u04a8\u04a9\7\4\2\2\u04a9\u04aa\5\u00d8m\2\u04aa\u00d3"+
		"\3\2\2\2\u04ab\u04b0\5\u00d6l\2\u04ac\u04ad\7\16\2\2\u04ad\u04af\5\u00d6"+
		"l\2\u04ae\u04ac\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u00d5\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b9\5\u00da"+
		"n\2\u04b4\u04b5\5\u00eav\2\u04b5\u04b6\7\3\2\2\u04b6\u04b7\5\u00dan\2"+
		"\u04b7\u04b9\3\2\2\2\u04b8\u04b3\3\2\2\2\u04b8\u04b4\3\2\2\2\u04b9\u00d7"+
		"\3\2\2\2\u04ba\u04bb\7k\2\2\u04bb\u00d9\3\2\2\2\u04bc\u04bd\5\u00eex\2"+
		"\u04bd\u00db\3\2\2\2\u04be\u04bf\7Y\2\2\u04bf\u04c0\7\33\2\2\u04c0\u04c1"+
		"\5\u00d2j\2\u04c1\u04c2\7\r\2\2\u04c2\u04dd\3\2\2\2\u04c3\u04c4\7Y\2\2"+
		"\u04c4\u04c5\5\u00dep\2\u04c5\u04c6\5\u00d2j\2\u04c6\u04c7\7\r\2\2\u04c7"+
		"\u04dd\3\2\2\2\u04c8\u04c9\7Y\2\2\u04c9\u04ca\5\u00dep\2\u04ca\u04cb\7"+
		"\r\2\2\u04cb\u04dd\3\2\2\2\u04cc\u04cd\7Y\2\2\u04cd\u04dd\5\34\17\2\u04ce"+
		"\u04cf\7Y\2\2\u04cf\u04dd\5\6\4\2\u04d0\u04d1\7Y\2\2\u04d1\u04d2\7S\2"+
		"\2\u04d2\u04dd\5\b\5\2\u04d3\u04d4\7Y\2\2\u04d4\u04d5\7S\2\2\u04d5\u04dd"+
		"\5\u0090I\2\u04d6\u04d7\7Y\2\2\u04d7\u04d8\7S\2\2\u04d8\u04d9\6o,\2\u04d9"+
		"\u04da\5\u00ba^\2\u04da\u04db\7\r\2\2\u04db\u04dd\3\2\2\2\u04dc\u04be"+
		"\3\2\2\2\u04dc\u04c3\3\2\2\2\u04dc\u04c8\3\2\2\2\u04dc\u04cc\3\2\2\2\u04dc"+
		"\u04ce\3\2\2\2\u04dc\u04d0\3\2\2\2\u04dc\u04d3\3\2\2\2\u04dc\u04d6\3\2"+
		"\2\2\u04dd\u00dd\3\2\2\2\u04de\u04df\7\13\2\2\u04df\u04ea\7\f\2\2\u04e0"+
		"\u04e1\7\13\2\2\u04e1\u04e2\5\u00e0q\2\u04e2\u04e3\7\f\2\2\u04e3\u04ea"+
		"\3\2\2\2\u04e4\u04e5\7\13\2\2\u04e5\u04e6\5\u00e0q\2\u04e6\u04e7\7\16"+
		"\2\2\u04e7\u04e8\7\f\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04de\3\2\2\2\u04e9"+
		"\u04e0\3\2\2\2\u04e9\u04e4\3\2\2\2\u04ea\u00df\3\2\2\2\u04eb\u04f0\5\u00e2"+
		"r\2\u04ec\u04ed\7\16\2\2\u04ed\u04ef\5\u00e2r\2\u04ee\u04ec\3\2\2\2\u04ef"+
		"\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u00e1\3\2"+
		"\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f6\5\u00eav\2\u04f4\u04f5\7\3\2\2\u04f5"+
		"\u04f7\5\u00eav\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u00e3"+
		"\3\2\2\2\u04f8\u04f9\t\b\2\2\u04f9\u00e5\3\2\2\2\u04fa\u04fd\t\t\2\2\u04fb"+
		"\u04fd\5\u00e8u\2\u04fc\u04fa\3\2\2\2\u04fc\u04fb\3\2\2\2\u04fd\u00e7"+
		"\3\2\2\2\u04fe\u04ff\t\n\2\2\u04ff\u00e9\3\2\2\2\u0500\u0503\7j\2\2\u0501"+
		"\u0503\5\u00f2z\2\u0502\u0500\3\2\2\2\u0502\u0501\3\2\2\2\u0503\u00eb"+
		"\3\2\2\2\u0504\u0505\7j\2\2\u0505\u00ed\3\2\2\2\u0506\u0507\7j\2\2\u0507"+
		"\u00ef\3\2\2\2\u0508\u0509\7j\2\2\u0509\u00f1\3\2\2\2\u050a\u050e\5\u00f4"+
		"{\2\u050b\u050e\5\u00f6|\2\u050c\u050e\t\13\2\2\u050d\u050a\3\2\2\2\u050d"+
		"\u050b\3\2\2\2\u050d\u050c\3\2\2\2\u050e\u00f3\3\2\2\2\u050f\u0510\t\f"+
		"\2\2\u0510\u00f5\3\2\2\2\u0511\u0512\t\r\2\2\u0512\u00f7\3\2\2\2\u0513"+
		"\u0518\7\r\2\2\u0514\u0518\7\2\2\3\u0515\u0518\6}-\2\u0516\u0518\6}.\2"+
		"\u0517\u0513\3\2\2\2\u0517\u0514\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0516"+
		"\3\2\2\2\u0518\u00f9\3\2\2\2\u0519\u051a\7\2\2\3\u051a\u00fb\3\2\2\2\u051b"+
		"\u0521\7p\2\2\u051c\u051d\7q\2\2\u051d\u051e\5\u00b8]\2\u051e\u051f\5"+
		"\u00fe\u0080\2\u051f\u0521\3\2\2\2\u0520\u051b\3\2\2\2\u0520\u051c\3\2"+
		"\2\2\u0521\u00fd\3\2\2\2\u0522\u0527\7s\2\2\u0523\u0524\5\u0100\u0081"+
		"\2\u0524\u0525\7s\2\2\u0525\u0527\3\2\2\2\u0526\u0522\3\2\2\2\u0526\u0523"+
		"\3\2\2\2\u0527\u00ff\3\2\2\2\u0528\u0529\b\u0081\1\2\u0529\u052a\7r\2"+
		"\2\u052a\u052b\5\u00b8]\2\u052b\u0531\3\2\2\2\u052c\u052d\f\3\2\2\u052d"+
		"\u052e\7r\2\2\u052e\u0530\5\u00b8]\2\u052f\u052c\3\2\2\2\u0530\u0533\3"+
		"\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0101\3\2\2\2\u0533"+
		"\u0531\3\2\2\2s\u0113\u0118\u011c\u0120\u0126\u012d\u0131\u013e\u0143"+
		"\u0148\u0152\u0157\u015c\u0160\u016d\u0171\u0174\u017f\u0182\u0186\u018d"+
		"\u0195\u0199\u01a2\u01a7\u01a9\u01ad\u01c2\u01d6\u01da\u01de\u01e7\u01eb"+
		"\u01f4\u01f8\u0232\u023f\u0244\u024b\u0252\u0264\u0268\u026a\u0271\u0277"+
		"\u027c\u0284\u0298\u02a5\u02b7\u02bd\u02bf\u02c6\u02d0\u02d9\u02e1\u02f3"+
		"\u0311\u032b\u033c\u0341\u0345\u0351\u0357\u035b\u0366\u036a\u036e\u0372"+
		"\u0375\u037a\u0380\u0383\u0385\u038b\u0395\u0399\u03a0\u03aa\u03ae\u03b3"+
		"\u03be\u03c4\u03c9\u03cd\u03d5\u03db\u03f5\u040c\u040f\u041f\u0464\u0466"+
		"\u046a\u046f\u0476\u047b\u0486\u0493\u04a6\u04b0\u04b8\u04dc\u04e9\u04f0"+
		"\u04f6\u04fc\u0502\u050d\u0517\u0520\u0526\u0531";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}