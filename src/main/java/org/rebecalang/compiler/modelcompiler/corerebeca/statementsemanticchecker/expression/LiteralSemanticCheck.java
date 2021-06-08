package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.SemanticCheckerUtils;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.stereotype.Component;

@Component
public class LiteralSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		Literal lExpression = (Literal) expression;
		if (lExpression.getType() == CoreRebecaTypeSystem.DOUBLE_TYPE) {
			try {
				double value = Double.parseDouble(lExpression
						.getLiteralValue());
				returnValue.setSecond(value);
			} catch (NumberFormatException nfe) {
				exceptionContainer.getExceptions().add(
						SemanticCheckerUtils.getOutofRangeException(
								lExpression.getLiteralValue(),
								CoreRebecaTypeSystem.DOUBLE_TYPE,
								lExpression.getLineNumber(),
								lExpression.getCharacter()));
			}
		} else if (lExpression.getType() == CoreRebecaTypeSystem.FLOAT_TYPE) {
			try {
				float value = Float.parseFloat(lExpression
						.getLiteralValue());
				returnValue.setSecond(value);
			} catch (NumberFormatException nfe) {
				exceptionContainer.getExceptions().add(
						SemanticCheckerUtils.getOutofRangeException(
								lExpression.getLiteralValue(),
								CoreRebecaTypeSystem.FLOAT_TYPE,
								lExpression.getLineNumber(),
								lExpression.getCharacter()));
			}
		} else if (lExpression.getType() == CoreRebecaTypeSystem.BOOLEAN_TYPE) {
			try {
				boolean value = Boolean.parseBoolean(lExpression
						.getLiteralValue());
				returnValue.setSecond(value);
			} catch (NumberFormatException nfe) {
				exceptionContainer.getExceptions().add(
						SemanticCheckerUtils.getOutofRangeException(
								lExpression.getLiteralValue(),
								CoreRebecaTypeSystem.BOOLEAN_TYPE,
								lExpression.getLineNumber(),
								lExpression.getCharacter()));
			}
		} else if (lExpression.getType().canTypeCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
				try {
					int value = Integer.parseInt(lExpression.getLiteralValue());
					if (Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE) {
						lExpression.setType(CoreRebecaTypeSystem.BYTE_TYPE);
						returnValue.setSecond((byte) value);
					} else if (Short.MIN_VALUE <= value
							&& value <= Short.MAX_VALUE) {
						lExpression.setType(CoreRebecaTypeSystem.SHORT_TYPE);
						returnValue.setSecond((short) value);
					} else if (Integer.MIN_VALUE <= value
							&& value <= Integer.MAX_VALUE) {
						lExpression.setType(CoreRebecaTypeSystem.INT_TYPE);
						returnValue.setSecond(value);
					}
				} catch (NumberFormatException nfe) {
					exceptionContainer.getExceptions().add(
							SemanticCheckerUtils.getOutofRangeException(
									lExpression.getLiteralValue(),
									CoreRebecaTypeSystem.INT_TYPE,
									lExpression.getLineNumber(),
									lExpression.getCharacter()));
				}
			}
		returnValue.setFirst(lExpression.getType());
		return returnValue;
	}
}