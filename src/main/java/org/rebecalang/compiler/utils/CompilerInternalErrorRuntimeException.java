package org.rebecalang.compiler.utils;

public class CompilerInternalErrorRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CompilerInternalErrorRuntimeException() {
	}
	
	public CompilerInternalErrorRuntimeException(String message) {
		super(message);
	}
	
	public CompilerInternalErrorRuntimeException(Exception e) {
		super(e);
	}
}
