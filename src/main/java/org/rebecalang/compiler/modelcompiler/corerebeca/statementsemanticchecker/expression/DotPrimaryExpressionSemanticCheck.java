package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DotPrimaryExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Autowired
	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		DotPrimary dotPrimary = (DotPrimary) expression;

		Expression leftTerm = dotPrimary.getLeft();
		Type leftTermType = expressionSemanticCheckContainer.check(leftTerm, baseType).getFirst();

		PrimaryExpression rightTerm = dotPrimary.getRight();
		
		Type rightTermType = expressionSemanticCheckContainer.check(rightTerm, leftTermType).getFirst();
		expression.setType(rightTermType);
		
		if (leftTermType.canTypeCastTo(CoreRebecaTypeSystem.REACTIVE_CLASS_TYPE)
				&& scopeHandler.isInScopeOf(CoreRebecaLabelUtility.CONSTRUCTOR)) {
			if (!(leftTerm instanceof TermPrimary)) {
				exceptionContainer.addException(new CodeCompilationException(
						"Direct sending to \"self\" is allowed in constructors",
					leftTerm.getLineNumber(), leftTerm.getCharacter()));
			} else if (!((TermPrimary)leftTerm).getName().equals("self")) {
				exceptionContainer.addException(new CodeCompilationException(
						"Direct sending to \"self\" is allowed in constructors",
					leftTerm.getLineNumber(), leftTerm.getCharacter()));
			}
			
		}

		returnValue.setFirst(expression.getType());
		return returnValue;
	}

}
