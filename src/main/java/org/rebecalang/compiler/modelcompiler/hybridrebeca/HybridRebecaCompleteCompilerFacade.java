package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler.HybridRebecaCompleteParser;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public class HybridRebecaCompleteCompilerFacade extends CoreRebecaCompilerFacade {

	public HybridRebecaCompleteCompilerFacade(CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(HybridRebecaCompleteParser.class, tokens, features, exceptionContainer);
	}
	
	public HybridRebecaCompleteCompilerFacade(Class<? extends Parser> parser, CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(parser, tokens, features, exceptionContainer);
	}
	
	
	protected void initialize() {
		super.initialize();
	}
}
