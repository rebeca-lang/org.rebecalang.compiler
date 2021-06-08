package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TernaryExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Autowired
	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		TernaryExpression tExpression = (TernaryExpression) expression;
		Pair<Type, Object> lType = 
				expressionSemanticCheckContainer.check(tExpression.getLeft());
		Pair<Type, Object> rType = 
				expressionSemanticCheckContainer.check(tExpression.getRight());
		Pair<Type, Object> cType = 
				expressionSemanticCheckContainer.check(tExpression.getCondition());
		
		// The ternary operator condition should be boolean expression
		if (!cType.getFirst().canTypeUpCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)) {
			TypesUtilities.addTypeMismatchException(exceptionContainer, cType.getFirst(),
							CoreRebecaTypeSystem.BOOLEAN_TYPE, tExpression);
		}
		// The type of left expression of ternary operator should be the
		// same as the type of the right expression
		if (rType.getFirst().canTypeUpCastTo(lType.getFirst())) {
			tExpression.setType(lType.getFirst());
		} else if (lType.getFirst().canTypeUpCastTo(rType.getFirst())) {
			tExpression.setType(rType.getFirst());
		} else {
			TypesUtilities.addTypeMismatchException(exceptionContainer, rType.getFirst(),
					lType.getFirst(), tExpression);
		}
		
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
