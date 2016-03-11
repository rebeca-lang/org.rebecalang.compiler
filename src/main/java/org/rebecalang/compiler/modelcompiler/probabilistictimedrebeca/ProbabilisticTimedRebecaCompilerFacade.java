package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.expression.ProbabilisticExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.statement.PALTStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler.ProbabilisticTimedRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public class ProbabilisticTimedRebecaCompilerFacade extends
		TimedRebecaCompleteCompilerFacade {

	public ProbabilisticTimedRebecaCompilerFacade(
			CommonTokenStream tokens, Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(ProbabilisticTimedRebecaCompleteParser.class, tokens, features, exceptionContainer);

		statementSemanticCheckContainer.registerTranslator(PAltStatement.class, new PALTStatementSemanticCheck());
		statementSemanticCheckContainer.getExpressionSemanticCheckContainer().
			registerTranslator(ProbabilisticExpression.class, new ProbabilisticExpressionSemanticCheck());
	}

}