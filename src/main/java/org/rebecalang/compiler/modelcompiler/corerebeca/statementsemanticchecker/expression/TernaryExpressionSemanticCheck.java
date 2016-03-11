package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class TernaryExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		TernaryExpression tExpression = (TernaryExpression) expression;
		Pair<Type, Object> lType = 
				((ExpressionSemanticCheckContainer)defaultContainer).check(tExpression.getLeft());
		Pair<Type, Object> rType = 
				((ExpressionSemanticCheckContainer)defaultContainer).check(tExpression.getRight());
		Pair<Type, Object> cType = 
				((ExpressionSemanticCheckContainer)defaultContainer).check(tExpression.getCondition());
		
		// The ternary operator condition should be boolean expression
		if (!TypesUtilities.getInstance().canTypeUpCastTo(
				cType.getFirst(), TypesUtilities.BOOLEAN_TYPE)) {
			CodeCompilationException cce = TypesUtilities
					.getTypeMismatchException(cType.getFirst(),
							TypesUtilities.BOOLEAN_TYPE);
			cce.setLine(tExpression.getCondition().getLineNumber());
			cce.setColumn(tExpression.getCondition().getCharacter());
			exceptionContainer.addException(cce);
		}
		// The type of left expression of ternary operator should be the
		// same as the type of the right expression
		if (!TypesUtilities.getInstance().canTypeUpCastTo(
				lType.getFirst(), rType.getFirst())) {
			CodeCompilationException cce = TypesUtilities
					.getTypeMismatchException(rType.getFirst(),
							lType.getFirst());
			cce.setLine(tExpression.getLeft().getLineNumber());
			cce.setColumn(tExpression.getLeft().getCharacter());
			exceptionContainer.addException(cce);
		}
		tExpression.setType(lType.getFirst());
		returnValue.setFirst(tExpression.getType());
		if (cType.getSecond() != null) {
			if (lType.getSecond() != null && rType.getSecond() != null)
				if (((Boolean) cType.getSecond()).booleanValue()) {
					returnValue.setSecond(lType.getSecond());
				} else {
					returnValue.setSecond(rType.getSecond());
				}
		}
		return returnValue;
	}

}
