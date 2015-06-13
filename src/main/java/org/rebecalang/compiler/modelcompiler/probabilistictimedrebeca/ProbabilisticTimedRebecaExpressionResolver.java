package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca;

import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.ProbabilisticRebecaExpressionResolver;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaExpressionResolver;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;

public class ProbabilisticTimedRebecaExpressionResolver extends
		TimedRebecaExpressionResolver {
	
	public Pair<Pair<Type, Category>, Object> subEvaluator(Expression expression,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeatures,
			ExceptionContainer container) {
		if (expression instanceof ProbabilisticExpression) {
			ProbabilisticRebecaExpressionResolver resolver = new ProbabilisticRebecaExpressionResolver();
			resolver.setContainerType(this.containerType);
			return resolver.subEvaluator(expression, scopeHandler, compilerFeatures, container);
		} else {
			return super.subEvaluator(expression, scopeHandler, compilerFeatures, container);
		}
	}
}
