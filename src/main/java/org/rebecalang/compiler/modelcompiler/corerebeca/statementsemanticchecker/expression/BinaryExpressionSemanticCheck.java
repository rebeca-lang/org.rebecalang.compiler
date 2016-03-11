package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.VariableInScopeSpecifier;
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

public class BinaryExpressionSemanticCheck extends
		AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		BinaryExpression bExpression = (BinaryExpression) expression;
		Pair<Type, Object> lType = 
				((ExpressionSemanticCheckContainer)defaultContainer).check(bExpression.getLeft());
		Pair<Type, Object> rType = 
				((ExpressionSemanticCheckContainer)defaultContainer).check(bExpression.getRight());
		try {
			bExpression.setType(
					SemanticCheckerUtils.getResultType(bExpression.getOperator(), lType
					.getFirst(), rType.getFirst()));
			returnValue.setFirst(bExpression.getType());
			Set<String> assignmentOperators = new HashSet<String>();
			assignmentOperators.addAll(Arrays.asList("=", "+=", "-=", "*=",
					"/=", "%=", "~=", "^=", "&=", "|=", "<<=", ">>="));
			if (assignmentOperators.contains(bExpression.getOperator())
					&& !isInLValueStyle(bExpression.getLeft(), scopeHandler)) {
				exceptionContainer
						.getExceptions()
						.add(new CodeCompilationException(
								"The left-hand side of an assignment must be a variable",
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
			CodeCompilationException cce2 = SemanticCheckerUtils.createEvaluateExceptionMessage2(
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

	public static boolean isInLValueStyle(Expression expression, ScopeHandler scopeHandler) {
		if (!(expression instanceof PrimaryExpression))
			return false;
		if (expression instanceof TermPrimary) {
			TermPrimary tPrimary = (TermPrimary) expression;
			VariableInScopeSpecifier retreiveVariableFromScope;
			try {
				retreiveVariableFromScope = scopeHandler.retreiveVariableFromScope(tPrimary.getName());
				if(retreiveVariableFromScope.getLabel() == CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE) {
					return false;
				}
			} catch (ScopeException e) {
				e.printStackTrace();
			}
		}
		PrimaryExpression pExpression = (PrimaryExpression) expression;
		while (pExpression instanceof DotPrimary) {
			pExpression = ((DotPrimary) pExpression).getRight();
		}

		return ((TermPrimary) pExpression).getParentSuffixPrimary() == null;
	}

}
