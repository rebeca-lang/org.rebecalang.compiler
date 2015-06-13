package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler.ProbabilisticTimedRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public class ProbabilisticTimedRebecaCompleteCompilerFacade extends
		TimedRebecaCompleteCompilerFacade {

	public ProbabilisticTimedRebecaCompleteCompilerFacade(
			CommonTokenStream tokens, Set<CompilerFeature> features) throws ExceptionContainer {
		super(ProbabilisticTimedRebecaCompleteParser.class, tokens, features);
	}

	@Override
	public RebecaModel getRebecaModel(Parser parser) {
		return ((ProbabilisticTimedRebecaCompleteParser) parser).rebecaModel().r;
	}
	
	@Override
	public void semanticCheck(Set<CompilerFeature> features) {
		semanticCheck(features, new ProbabilisticTimedRebecaStatementObserver());
	}

}