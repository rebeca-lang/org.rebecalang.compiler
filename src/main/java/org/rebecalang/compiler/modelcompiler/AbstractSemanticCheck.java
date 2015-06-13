package org.rebecalang.compiler.modelcompiler;

import java.util.Set;

import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public abstract class AbstractSemanticCheck {

	protected ExceptionContainer container;
	protected Set<CompilerFeature> compilerFeature;

	public AbstractSemanticCheck(Set<CompilerFeature> compilerFeature) {
		this.container = new ExceptionContainer();
		this.compilerFeature = compilerFeature;
	}

	public abstract void doSemanticCheck() throws ExceptionContainer;
}