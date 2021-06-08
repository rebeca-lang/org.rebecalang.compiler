package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.utils.CodeCompilationException;

public class ScopeException extends CodeCompilationException {

	private static final long serialVersionUID = 1L;

	public ScopeException(String message, int line, int column) {
		super(message, line, column);
	}

}
