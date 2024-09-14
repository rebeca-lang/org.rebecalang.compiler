package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public abstract class AbstractSemanticCheck {
	@Autowired
	protected ExceptionContainer exceptionContainer;
	
	@Autowired
	protected ScopeHandler scopeHandler;

	@Autowired
	protected SymbolTable symbolTable;

	public final static Object NO_VALUE = new NoValue();

	private static class NoValue implements Serializable {
		private static final long serialVersionUID = 1L;

		// Ensure singleton instance
		private Object readResolve() {
			return NO_VALUE;
		}
	}
}
