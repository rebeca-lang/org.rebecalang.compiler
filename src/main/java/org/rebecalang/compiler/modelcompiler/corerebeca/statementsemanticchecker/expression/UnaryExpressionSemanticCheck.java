package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SemanticCheckerUtils;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
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
public class UnaryExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	public UnaryExpressionSemanticCheck(ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		
		UnaryExpression uExpression = (UnaryExpression) expression;
		Pair<Type, Object> type = 
				expressionSemanticCheckContainer.check(uExpression.getExpression());
		String operator = uExpression.getOperator();
		if (operator.equals("++") || operator.equals("--")) {
			if (!type.getFirst().canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
				TypesUtilities.addTypeMismatchException(exceptionContainer, type.getFirst(),
						CoreRebecaTypeSystem.INT_TYPE, uExpression);
			}
			if (BinaryExpressionSemanticCheck.isInLValueStyle(uExpression.getExpression(), scopeHandler) != LValueState.VARIABLE) {
				exceptionContainer.addException(
						new CodeCompilationException(
								"Invalid argument to operation ++/--",
								uExpression.getLineNumber(), uExpression
										.getCharacter()));
			}
		} else if (operator.equals("-")) {
			if (!type.getFirst().canTypeUpCastTo(CoreRebecaTypeSystem.DOUBLE_TYPE)) {
				TypesUtilities.addTypeMismatchException(exceptionContainer, type.getFirst(),
						CoreRebecaTypeSystem.INT_TYPE, uExpression);
			} else {
				if (type.getSecond() != null)
					returnValue.setSecond(SemanticCheckerUtils.evaluateConstantTerm("-", type
							.getFirst(), 0, type.getSecond()));
			}
		} else if (operator.equals("!")) {
			if (!type.getFirst().canTypeUpCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)) {
				TypesUtilities.addTypeMismatchException(exceptionContainer, type.getFirst(),
						CoreRebecaTypeSystem.BOOLEAN_TYPE, uExpression);
			} else {
				if (type.getSecond() != null)
					returnValue.setSecond(SemanticCheckerUtils.evaluateConstantTerm("!", type
							.getFirst(), type.getSecond(), null));
			}
		}
		uExpression.setType(type.getFirst());
		returnValue.setFirst(uExpression.getType());
		return returnValue;
	}

}
