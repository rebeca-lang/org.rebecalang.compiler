package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.utils.CodeCompilationException;

public class SymbolTableException extends CodeCompilationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7916931572331266891L;

	public SymbolTableException(String message, int line, int column) {
		super(message, line, column);
	}

}
