/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.js.core.parsing.ast;

import com.aptana.parsing.ast.IParseNode;

import beaver.Symbol;

public class JSCaseNode extends JSNode
{
	private Symbol _colon;

	/**
	 * JSCaseNode
	 * 
	 * @param children
	 */
	public JSCaseNode(JSNode expression, Symbol colon, JSNode... children)
	{
		this(colon);
		this.addChild(expression);
		for (JSNode child : children)
		{
			this.addChild(child);
		}
	}

	/**
	 * Used by ANTLR AST
	 * 
	 * @param colon
	 */
	public JSCaseNode(Symbol colon)
	{
		super(IJSNodeTypes.CASE);
		this._colon = colon;
	}

	/*
	 * (non-Javadoc)
	 * @see com.aptana.editor.js.parsing.ast.JSNode#accept(com.aptana.editor.js.parsing.ast.JSTreeWalker)
	 */
	@Override
	public void accept(JSTreeWalker walker)
	{
		walker.visit(this);
	}

	/**
	 * getColon
	 * 
	 * @return
	 */
	public Symbol getColon()
	{
		return this._colon;
	}

	/**
	 * getExpression
	 * 
	 * @return
	 */
	public IParseNode getExpression()
	{
		return this.getChild(0);
	}
}
