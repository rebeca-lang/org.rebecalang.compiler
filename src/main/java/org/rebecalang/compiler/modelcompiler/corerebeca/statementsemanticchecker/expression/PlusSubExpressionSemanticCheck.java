package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.BinaryExpressionSemanticCheck.LValueState;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PlusSubExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	public PlusSubExpressionSemanticCheck(ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		PlusSubExpression pspExpression = (PlusSubExpression) expression;
		Pair<Type, Object> result = expressionSemanticCheckContainer.check(pspExpression.getValue());
		Type type = result.getFirst();
		
		if (!type.canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
			TypesUtilities.addTypeMismatchException(exceptionContainer, type, CoreRebecaTypeSystem.INT_TYPE, pspExpression);
		}
		if (BinaryExpressionSemanticCheck.isInLValueStyle(pspExpression.getValue(), scopeHandler) != LValueState.VARIABLE) {
			exceptionContainer.addException(
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