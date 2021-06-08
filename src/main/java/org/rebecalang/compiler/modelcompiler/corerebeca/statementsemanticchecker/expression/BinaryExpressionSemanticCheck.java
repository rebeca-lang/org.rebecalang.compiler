package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.VariableInScopeSpecifier;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.SemanticCheckerUtils;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
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
public class BinaryExpressionSemanticCheck extends
		AbstractExpressionSemanticCheck {

	@Autowired
	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;
	
	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		BinaryExpression bExpression = (BinaryExpression) expression;
		Pair<Type, Object> lType = 
				expressionSemanticCheckContainer.check(bExpression.getLeft());
		Pair<Type, Object> rType = 
				expressionSemanticCheckContainer.check(bExpression.getRight());
		try {
			bExpression.setType(
					SemanticCheckerUtils.getResultType(bExpression.getOperator(), lType
					.getFirst(), rType.getFirst()));
			returnValue.setFirst(bExpression.getType());
			Set<String> assignmentOperators = new HashSet<String>();
			assignmentOperators.addAll(Arrays.asList("=", "+=", "-=", "*=",
					"/=", "%=", "~=", "^=", "&=", "|=", "<<=", ">>="));
			LValueState lValueState = isInLValueStyle(bExpression.getLeft(), scopeHandler);
			if (assignmentOperators.contains(bExpression.getOperator())) {
				if (lValueState == LValueState.NONE_VARIABLE)
					exceptionContainer
							.getExceptions()
							.add(new CodeCompilationException(
									"The left-hand side of an assignment must be a variable",
									bExpression.getLineNumber(), bExpression
											.getCharacter()));
				if (lValueState == LValueState.CONSTANT)
					exceptionContainer
							.getExceptions()
							.add(new CodeCompilationException(
									"A constant variable cannot be in the left-hand side of an assignment",
									bExpression.getLineNumber(), bExpression
											.getCharacter()));
			}
			if (!assignmentOperators.contains(bExpression.getOperator())) {
				returnValue.setSecond(SemanticCheckerUtils.evaluateConstantTerm(
						bExpression.getOperator(), bExpression.getType(),
						lType.getSecond(), rType.getSecond()));
			}
		} catch (CodeCompilationException cce) {
			// Two types of two sides of binary operation are incompatible
			CodeCompilationException cce2 = SemanticCheckerUtils.createEvaluateExceptionMessage(
					bExpression.getLineNumber(), bExpression.getCharacter(),
					bExpression.getOperator(), lType.getFirst(),
					rType.getFirst());
			if (cce2 != null)
				exceptionContainer.getExceptions().add(cce2);
			bExpression.setType(lType.getFirst());
			returnValue.setFirst(bExpression.getType());
		}
		return returnValue;
	}

	public static LValueState isInLValueStyle(Expression expression, ScopeHandler scopeHandler) {
		if (!(expression instanceof PrimaryExpression))
			return LValueState.NONE_VARIABLE;
		if (expression instanceof TermPrimary) {
			TermPrimary tPrimary = (TermPrimary) expression;
			VariableInScopeSpecifier retreiveVariableFromScope;
			try {
				retreiveVariableFromScope = scopeHandler.retreiveVariableFromScope(tPrimary.getName());
				if(retreiveVariableFromScope.getLabel() == CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE || 
						retreiveVariableFromScope.getLabel() == CoreRebecaLabelUtility.KNOWNREBEC_VARIABLE ) {
					return LValueState.CONSTANT;
				}
			} catch (ScopeException e) {
				return LValueState.VARIABLE;
			}
		}
		PrimaryExpression pExpression = (PrimaryExpression) expression;
		while (pExpression instanceof DotPrimary) {
			pExpression = ((DotPrimary) pExpression).getRight();
		}

		return (((TermPrimary) pExpression).getParentSuffixPrimary() == null ? LValueState.VARIABLE : LValueState.NONE_VARIABLE);
	}

	enum LValueState {
		VARIABLE, CONSTANT, NONE_VARIABLE
	}
}
