package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SemanticCheckerUtils;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class CastExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		CastExpression cExpression = (CastExpression) expression;
		Pair<Type, Object> expressionType = 
				((ExpressionSemanticCheckContainer)defaultContainer).check(cExpression.getExpression());
		try {
			Type castType = TypesUtilities.getInstance().getType(
					cExpression.getType());
			if (!TypesUtilities.getInstance().canTypeCastTo(
					expressionType.getFirst(), castType)) {
				CodeCompilationException cce = TypesUtilities
						.getTypeMismatchException(
								expressionType.getFirst(), castType);
				cce.setColumn(cExpression.getExpression().getCharacter());
				cce.setLine(cExpression.getExpression().getLineNumber());
				exceptionContainer.addException(cce);
			}
			cExpression.setType(castType);
			returnValue.setFirst(cExpression.getType());
			returnValue.setSecond(SemanticCheckerUtils.evaluateConstantTerm(
					"(" + TypesUtilities.getTypeName(returnValue
									.getFirst()) + ")",
					returnValue.getFirst(), expressionType.getSecond(),
					null));
		} catch (CodeCompilationException cce) {
			cExpression.setType(TypesUtilities.UNKNOWN_TYPE);
			returnValue.setFirst(cExpression.getType());
			cce.setColumn(cExpression.getCharacter());
			cce.setLine(cExpression.getLineNumber());
			exceptionContainer.addException(cce);
		}
		return returnValue;
	}


}
