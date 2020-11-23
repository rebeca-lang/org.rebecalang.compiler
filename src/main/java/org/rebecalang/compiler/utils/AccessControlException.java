package org.rebecalang.compiler.utils;

public class AccessControlException extends CodeCompilationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5579864038952637421L;

	public AccessControlException(String message, int line, int column) {
		super(message, line, column);
	}

}
