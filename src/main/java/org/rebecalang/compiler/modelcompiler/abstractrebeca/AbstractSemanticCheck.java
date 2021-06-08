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
	
//	protected Set<CompilerFeature> compilerFeatures;
	
//	@Autowired
//	protected AbstractSemanticCheckContainer statementSemanticCheckContainer;
//	
//	@Autowired
//	protected AbstractSemanticCheckContainer expressionSemanticCheckContainer;
	
	@Autowired
	protected ScopeHandler scopeHandler;
	@Autowired
	protected SymbolTable symbolTable;

//	public Set<CompilerFeature> getCompilerFeatures() {
//		return compilerFeatures;
//	}
//	public ExceptionContainer getExceptionContainer() {
//		return exceptionContainer;
//	}
//	public ScopeHandler getScopeHandler() {
//		return scopeHandler;
//	}
//	public AbstractSemanticCheckContainer getDefaultContainer() {
//		return defaultContainer;
//	}
//	public SymbolTable getSymbolTable() {
//		return symbolTable;
//	}
	
//	public void setCompilerFeatures(Set<CompilerFeature> compilerFeature) {
//		this.compilerFeatures = compilerFeature;
//	}
//	public void setExceptionContainer(ExceptionContainer container) {
//		this.exceptionContainer = container;
//	}
//	public void setScopeHandler(ScopeHandler scopeHandler) {
//		this.scopeHandler = scopeHandler;
//	}
//	public void setDefaultContainer(
//			AbstractSemanticCheckContainer defaultContainer) {
//		this.defaultContainer = defaultContainer;
//	}
//	public void setSymbolTable(SymbolTable symbolTable) {
//		this.symbolTable = symbolTable;
//	}
	
}
