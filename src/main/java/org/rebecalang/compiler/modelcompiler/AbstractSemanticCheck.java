package org.rebecalang.compiler.modelcompiler;

import java.util.Set;

import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public abstract class AbstractSemanticCheck {
	protected ExceptionContainer exceptionContainer;
	protected Set<CompilerFeature> compilerFeatures;
	protected AbstractSemanticCheckContainer defaultContainer;
	
	protected ScopeHandler scopeHandler;
	protected SymbolTable symbolTable;

	public Set<CompilerFeature> getCompilerFeatures() {
		return compilerFeatures;
	}
	public ExceptionContainer getExceptionContainer() {
		return exceptionContainer;
	}
	public ScopeHandler getScopeHandler() {
		return scopeHandler;
	}
	public AbstractSemanticCheckContainer getDefaultContainer() {
		return defaultContainer;
	}
	public SymbolTable getSymbolTable() {
		return symbolTable;
	}
	
	public void setCompilerFeatures(Set<CompilerFeature> compilerFeature) {
		this.compilerFeatures = compilerFeature;
	}
	public void setExceptionContainer(ExceptionContainer container) {
		this.exceptionContainer = container;
	}
	public void setScopeHandler(ScopeHandler scopeHandler) {
		this.scopeHandler = scopeHandler;
	}
	public void setDefaultContainer(
			AbstractSemanticCheckContainer defaultContainer) {
		this.defaultContainer = defaultContainer;
	}
	public void setSymbolTable(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
}
