package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class PlusSubExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		PlusSubExpression pspExpression = (PlusSubExpression) expression;
		Pair<Type, Object> result = ((ExpressionSemanticCheckContainer)defaultContainer).check(pspExpression.getValue());
		Type type = result.getFirst();
		
		if (!TypesUtilities.getInstance().canTypeUpCastTo(type,
				TypesUtilities.INT_TYPE)) {
			CodeCompilationException cce = TypesUtilities
					.getTypeMismatchException(type, TypesUtilities.INT_TYPE);
			cce.setColumn(pspExpression.getValue().getCharacter());
			cce.setLine(pspExpression.getValue().getLineNumber());
			exceptionContainer.addException(cce);
		}
		if (!BinaryExpressionSemanticCheck.isInLValueStyle(pspExpression.getValue(), scopeHandler)) {
			exceptionContainer.getExceptions().add(
					new CodeCompilationException(
							"Invalid argument to operation ++/--",
							pspExpression.getLineNumber(), pspExpression
									.getCharacter()));
		}
		pspExpression.setType(type);
		returnValue.setFirst(pspExpression.getType());
		return returnValue;
	}

}