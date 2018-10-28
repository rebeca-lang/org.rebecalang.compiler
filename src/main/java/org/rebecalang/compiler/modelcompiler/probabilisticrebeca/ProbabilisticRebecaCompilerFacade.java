package org.rebecalang.compiler.modelcompiler.probabilisticrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.expression.ProbabilisticExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.statement.PALTStatementSemanticCheck;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public class ProbabilisticRebecaCompilerFacade extends
		CoreRebecaCompilerFacade {

	public ProbabilisticRebecaCompilerFacade(
			CommonTokenStream tokens, Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(ProbabilisticRebecaCompleteParser.class, tokens, features, exceptionContainer);
		
		statementSemanticCheckContainer.registerSemanticsChecker(PAltStatement.class, new PALTStatementSemanticCheck());
		statementSemanticCheckContainer.getExpressionSemanticCheckContainer().
			registerTranslator(ProbabilisticExpression.class, new ProbabilisticExpressionSemanticCheck());
	}

}
