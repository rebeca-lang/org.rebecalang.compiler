package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SemanticCheckerUtils;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;

public class NondetExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		NonDetExpression ndExpression = (NonDetExpression) expression;
		// The type of the first element of the non-det expression is set as
		// the first candidate for the result type
		Type type = null;
		for (Expression ndTermExpression : ndExpression.getChoices()) {
			Pair<Type, Object> ndTerm = 
					((ExpressionSemanticCheckContainer)defaultContainer).check(ndTermExpression);
			try {
				// The type is set to the biggest type in comparison to the
				// new choices
				type = (type == null ? ndTerm.getFirst() : 
					SemanticCheckerUtils.getCommonSuperType(type,
								ndTerm.getFirst()));
				if (ndTerm.getSecond() == null) {
					CodeCompilationException cce = new CodeCompilationException(
							"Non-deterministic terms must be constant expressions",
							0, 0);
					throw cce;
				}
			} catch (CodeCompilationException cce) {
				cce.setColumn(ndTermExpression.getCharacter());
				cce.setLine(ndTermExpression.getLineNumber());
				exceptionContainer.addException(cce);
			}
		}
		ndExpression.setType(type);
		returnValue.setFirst(ndExpression.getType());
		if (ndExpression.getChoices().size() < 2) {
			CodeCompilationException cce = new CodeCompilationException(
					"Non-deterministic expression must have at least two different choices",
					ndExpression.getLineNumber(), ndExpression
							.getCharacter());
			exceptionContainer.addException(cce);
		}
		if (!scopeHandler.isInScopeOf(CoreRebecaLabelUtility.MSGSRV)) {
			CodeCompilationException cce = new CodeCompilationException(
					"Only message servers are allowed to have non-deterministic expression",
					ndExpression.getLineNumber(), ndExpression
							.getCharacter());
			exceptionContainer.addException(cce);
		}
		return returnValue;
	}

}
