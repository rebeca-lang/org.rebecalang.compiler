package org.rebecalang.compiler.modelcompiler.probabilisticrebeca;

import java.text.DecimalFormat;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaExpressionResolver;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticAlternativeValue;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ProbabilisticRebecaExpressionResolver extends CoreRebecaExpressionResolver {

	public Pair<Pair<Type, Category>, Object> subEvaluator(Expression expression,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeatures,
			ExceptionContainer container) {
		if (!(expression instanceof ProbabilisticExpression)) {
			return super.subEvaluator(expression, scopeHandler, compilerFeatures, container);
		}
		Pair<Pair<Type, Category>, Object> returnValue = new Pair<Pair<Type, Category>, Object>();
		ProbabilisticExpression probabilisticExpression = (ProbabilisticExpression) expression;
		NonDetExpression nonDetExpression = new NonDetExpression();
		nonDetExpression.setCharacter(probabilisticExpression.getCharacter());
		nonDetExpression.setLineNumber(probabilisticExpression.getLineNumber());

		double probs = 0;
		//Create nonDeterministic expression from the values in probabilistic expression and
		// check the probabilities of different choices.
		for (ProbabilisticAlternativeValue value : probabilisticExpression.getChoices()) {
			nonDetExpression.getChoices().add(value.getValue());
			Pair<Pair<Type, Category>, Object> evaluate = evaluate(
					value.getProbability(), scopeHandler, compilerFeatures, container);
			if (evaluate.getSecond() != null) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(
						evaluate.getFirst().getFirst(), TypesUtilities.DOUBLE_TYPE)) {
					CodeCompilationException rce = TypesUtilities
							.getTypeMismatchException(evaluate.getFirst().getFirst(),
									TypesUtilities.DOUBLE_TYPE);
					rce.setLine(probabilisticExpression.getLineNumber());
					rce.setColumn(probabilisticExpression.getCharacter());
					container.addException(rce);
				} else {
					probs += ((Number) evaluate.getSecond()).doubleValue();
				}
			} else {
				CodeCompilationException cce = new CodeCompilationException(
						"Probabilities in probabilistic expressions must be constant expressions",
						probabilisticExpression.getLineNumber(), probabilisticExpression.getCharacter());
				container.addException(cce);
			}
		}
		if (!ProbabilisticRebecaStatementObserver.probIsOne(probs)) {
			String formatter = "0.";
			for (int cnt = 0; cnt < Math.log10(ProbabilisticRebecaStatementObserver.PROB_ACCURACY); cnt++)
				formatter += "0";
			CodeCompilationException cce = new CodeCompilationException(
					"The summations of probabilities in probabilistic expression must be 1.000 instead of "
							+ new DecimalFormat(formatter).format(probs),
					probabilisticExpression.getLineNumber(), probabilisticExpression.getCharacter());
			container.addException(cce);
		}
		
		returnValue = evaluate(nonDetExpression, scopeHandler, compilerFeatures, container);
		probabilisticExpression.setType(returnValue.getFirst().getFirst());
		
		return returnValue;
	}
}