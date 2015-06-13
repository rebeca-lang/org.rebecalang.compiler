package org.rebecalang.compiler.modelcompiler.probabilisticrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.AbstractCompilerFacade;
import org.rebecalang.compiler.modelcompiler.AbstractSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public class ProbabilisticRebecaCompleteCompilerFacade extends
		AbstractCompilerFacade {

	public ProbabilisticRebecaCompleteCompilerFacade(
			CommonTokenStream tokens, Set<CompilerFeature> features) throws ExceptionContainer {
		super(ProbabilisticRebecaCompleteParser.class, tokens, features);
	}

	@Override
	public RebecaModel getRebecaModel(Parser parser) {
		return ((ProbabilisticRebecaCompleteParser) parser).rebecaModel().r;
	}

	@Override
	public void semanticCheck(Set<CompilerFeature> features) {
		try {
			ProbabilisticRebecaStatementObserver observer = new ProbabilisticRebecaStatementObserver();
			ScopeHandler scopeHandler = new ScopeHandler(rebecaModel,
					observer.getExpressionResolver(), features, container);
			AbstractSemanticCheck semanticCheck = new CoreRebecaSemanticCheck(features,
					observer, scopeHandler, rebecaModel);
			semanticCheck.doSemanticCheck();
		} catch (ExceptionContainer e) {
			container.addAll(e);
		}
	}

}
