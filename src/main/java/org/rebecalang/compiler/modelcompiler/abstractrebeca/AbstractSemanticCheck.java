package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractSemanticCheck {
	@Autowired
	protected ExceptionContainer exceptionContainer;
	
	@Autowired
	protected ScopeHandler scopeHandler;

	@Autowired
	protected SymbolTable symbolTable;

}
