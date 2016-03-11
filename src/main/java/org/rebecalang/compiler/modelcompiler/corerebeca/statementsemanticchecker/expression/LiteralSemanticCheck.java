package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.SemanticCheckerUtils;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class LiteralSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		Literal lExpression = (Literal) expression;
		if (lExpression.getType() == TypesUtilities.INT_TYPE) {
			try {
				int value = Integer.parseInt(lExpression.getLiteralValue());
				if (Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE) {
					lExpression.setType(TypesUtilities.BYTE_TYPE);
					returnValue.setSecond((byte) value);
				} else if (Short.MIN_VALUE <= value
						&& value <= Short.MAX_VALUE) {
					lExpression.setType(TypesUtilities.SHORT_TYPE);
					returnValue.setSecond((short) value);
				} else if (Integer.MIN_VALUE <= value
						&& value <= Integer.MAX_VALUE) {
					lExpression.setType(TypesUtilities.INT_TYPE);
					returnValue.setSecond(value);
				}
			} catch (NumberFormatException nfe) {
				exceptionContainer.getExceptions().add(
						SemanticCheckerUtils.getOutofRangeException(
								lExpression.getLiteralValue(),
								TypesUtilities.INT_TYPE,
								lExpression.getLineNumber(),
								lExpression.getCharacter()));
			}
		} else if (lExpression.getType() == TypesUtilities.DOUBLE_TYPE) {
			try {
				double value = Double.parseDouble(lExpression
						.getLiteralValue());
				returnValue.setSecond(value);
			} catch (NumberFormatException nfe) {
				exceptionContainer.getExceptions().add(
						SemanticCheckerUtils.getOutofRangeException(
								lExpression.getLiteralValue(),
								TypesUtilities.DOUBLE_TYPE,
								lExpression.getLineNumber(),
								lExpression.getCharacter()));
			}
		} else if (lExpression.getType() == TypesUtilities.FLOAT_TYPE) {
			try {
				float value = Float.parseFloat(lExpression
						.getLiteralValue());
				returnValue.setSecond(value);
			} catch (NumberFormatException nfe) {
				exceptionContainer.getExceptions().add(
						SemanticCheckerUtils.getOutofRangeException(
								lExpression.getLiteralValue(),
								TypesUtilities.FLOAT_TYPE,
								lExpression.getLineNumber(),
								lExpression.getCharacter()));
			}
		} else if (lExpression.getType() == TypesUtilities.BOOLEAN_TYPE) {
			try {
				boolean value = Boolean.parseBoolean(lExpression
						.getLiteralValue());
				returnValue.setSecond(value);
			} catch (NumberFormatException nfe) {
				exceptionContainer.getExceptions().add(
						SemanticCheckerUtils.getOutofRangeException(
								lExpression.getLiteralValue(),
								TypesUtilities.BOOLEAN_TYPE,
								lExpression.getLineNumber(),
								lExpression.getCharacter()));
			}
		}
		returnValue.setFirst(lExpression.getType());
		return returnValue;
	}

}