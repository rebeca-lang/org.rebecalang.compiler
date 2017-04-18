package org.rebecalang.compiler.propertycompiler;

import org.rebecalang.compiler.utils.CodeCompilationException;

public class PropertyCodeCompilationException extends CodeCompilationException {

	private static final long serialVersionUID = 1L;

	public PropertyCodeCompilationException(String message, int line, int column) {
		super(message, line, column);
	}

	public static PropertyCodeCompilationException clone(CodeCompilationException cce) {
		PropertyCodeCompilationException pcce = new PropertyCodeCompilationException(cce.getMessage(), 
				cce.getLine(), cce.getColumn());
		return pcce;
	}
	
}
