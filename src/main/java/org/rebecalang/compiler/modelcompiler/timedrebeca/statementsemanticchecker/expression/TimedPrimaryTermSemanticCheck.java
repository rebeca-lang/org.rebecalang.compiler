package org.rebecalang.compiler.modelcompiler.timedrebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class TimedPrimaryTermSemanticCheck extends 
		org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck {

	public Pair<Type, Object> check(Expression expression,
			Type baseType) {
		TermPrimary termPrimary = (TermPrimary) expression;
		Pair<Type, Object> retValue = super.check(termPrimary, baseType);
		if (termPrimary.getParentSuffixPrimary() != null) {
			Expression afterExpression = ((TimedRebecaParentSuffixPrimary)termPrimary.getParentSuffixPrimary())
					.getAfterExpression();
			if (afterExpression != null) {
				if (retValue.getFirst() != TypesUtilities.MSGSRV_TYPE) {
					exceptionContainer
							.getExceptions()
							.add(new CodeCompilationException(
									"Only message server can be followed by \"after\" specifier",
									afterExpression.getLineNumber(),
									afterExpression.getCharacter()));

				} else {
					checkAfterAndDeadline(afterExpression);
				}
			}
			Expression deadlineExpression = ((TimedRebecaParentSuffixPrimary)termPrimary.getParentSuffixPrimary())
					.getDeadlineExpression();
			if (deadlineExpression != null) {
				if (retValue.getFirst() != TypesUtilities.MSGSRV_TYPE) {
					exceptionContainer
							.getExceptions()
							.add(new CodeCompilationException(
									"Only message server can be followed by \"deadline\" specifier",
									deadlineExpression.getLineNumber(),
									deadlineExpression.getCharacter()));

				} else {
					checkAfterAndDeadline(deadlineExpression);
				}
			}

		}

		return retValue;		

	}
	
	private void checkAfterAndDeadline(Expression expression) {
		if (!compilerFeatures.contains(CompilerFeature.TIMED_REBECA)) {
			exceptionContainer
					.getExceptions()
					.add(new CodeCompilationException(
							"Only Timed Rebeca supports \"after/deadline\" quantifiers",
							expression.getLineNumber(), expression
									.getCharacter()));
		}
		if (!TypesUtilities.getInstance().canTypeUpCastTo(
				((ExpressionSemanticCheckContainer)defaultContainer).check(expression)
						.getFirst(), TypesUtilities.INT_TYPE)) {
			exceptionContainer.getExceptions().add(
					new CodeCompilationException(
							"Only convertible int values are permitted here",
							expression.getLineNumber(), expression
									.getCharacter()));
		}
	}
	
}
