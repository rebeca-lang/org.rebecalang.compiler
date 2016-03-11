package org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.expression;

import java.text.DecimalFormat;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticAlternativeValue;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.statement.PALTStatementSemanticCheck;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ProbabilisticExpressionSemanticCheck extends
		AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		ProbabilisticExpression probabilisticExpression = (ProbabilisticExpression) expression;
		NonDetExpression nonDetExpression = new NonDetExpression();
		nonDetExpression.setCharacter(probabilisticExpression.getCharacter());
		nonDetExpression.setLineNumber(probabilisticExpression.getLineNumber());

		double probs = 0;
		// Create nonDeterministic expression from the values in probabilistic
		// expression and
		// check the probabilities of different choices.
		for (ProbabilisticAlternativeValue value : probabilisticExpression
				.getChoices()) {
			nonDetExpression.getChoices().add(value.getValue());
			Pair<Type, Object> evaluate = ((ExpressionSemanticCheckContainer)defaultContainer).check(
					value.getProbability());
			if (evaluate.getSecond() != null) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(
						evaluate.getFirst(),
						TypesUtilities.DOUBLE_TYPE)) {
					CodeCompilationException rce = TypesUtilities
							.getTypeMismatchException(evaluate.getFirst(),
									TypesUtilities.DOUBLE_TYPE);
					rce.setLine(probabilisticExpression.getLineNumber());
					rce.setColumn(probabilisticExpression.getCharacter());
					exceptionContainer.addException(rce);
				} else {
					probs += ((Number) evaluate.getSecond()).doubleValue();
				}
			} else {
				CodeCompilationException cce = new CodeCompilationException(
						"Probabilities in probabilistic expressions must be constant expressions",
						probabilisticExpression.getLineNumber(),
						probabilisticExpression.getCharacter());
				exceptionContainer.addException(cce);
			}
		}
		if (!PALTStatementSemanticCheck.probIsOne(probs)) {
			String formatter = "0.";
			for (int cnt = 0; cnt < Math
					.log10(PALTStatementSemanticCheck.PROB_ACCURACY); cnt++)
				formatter += "0";
			CodeCompilationException cce = new CodeCompilationException(
					"The summations of probabilities in probabilistic expression must be 1.000 instead of "
							+ new DecimalFormat(formatter).format(probs),
					probabilisticExpression.getLineNumber(),
					probabilisticExpression.getCharacter());
			exceptionContainer.addException(cce);
		}

		returnValue = ((ExpressionSemanticCheckContainer)defaultContainer).check(nonDetExpression);
		probabilisticExpression.setType(returnValue.getFirst());

		return returnValue;
	}

}
