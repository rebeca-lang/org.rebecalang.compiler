package org.rebecalang.compiler.modelcompiler.timedrebeca;

import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaExpressionResolver;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class TimedRebecaExpressionResolver extends CoreRebecaExpressionResolver {

	protected Pair<Pair<Type, Category>, Object> evaluatePrimaryTermExpression(Type baseType,
			TermPrimary termPrimary, ScopeHandler scopeHandler,
			Set<CompilerFeature> compilerFeatures, ExceptionContainer container) {

		Pair<Pair<Type, Category>, Object> retValue = super.evaluatePrimaryTermExpression(
				baseType, termPrimary, scopeHandler, compilerFeatures,
				container);
		if (termPrimary.getParentSuffixPrimary() != null) {
			Expression afterExpression = ((TimedRebecaParentSuffixPrimary)termPrimary.getParentSuffixPrimary())
					.getAfterExpression();
			if (afterExpression != null) {
				if (retValue.getFirst().getFirst() != TypesUtilities.MSGSRV_TYPE) {
					container
							.getExceptions()
							.add(new CodeCompilationException(
									"Only message server can be followed by \"after\" specifier",
									afterExpression.getLineNumber(),
									afterExpression.getCharacter()));

				} else {
					checkAfterAndDeadline(afterExpression, scopeHandler,
							compilerFeatures, container);
				}
			}
			Expression deadlineExpression = ((TimedRebecaParentSuffixPrimary)termPrimary.getParentSuffixPrimary())
					.getDeadlineExpression();
			if (deadlineExpression != null) {
				if (retValue.getFirst().getFirst() != TypesUtilities.MSGSRV_TYPE) {
					container
							.getExceptions()
							.add(new CodeCompilationException(
									"Only message server can be followed by \"deadline\" specifier",
									deadlineExpression.getLineNumber(),
									deadlineExpression.getCharacter()));

				} else {
					checkAfterAndDeadline(deadlineExpression, scopeHandler,
							compilerFeatures, container);
				}
			}

		}

		return retValue;
	}

	private void checkAfterAndDeadline(Expression expression,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeatures,
			ExceptionContainer container) {
		if (!compilerFeatures.contains(CompilerFeature.TIMED_REBECA)) {
			container
					.getExceptions()
					.add(new CodeCompilationException(
							"Only Timed Rebeca supports \"after/deadline\" specifiers",
							expression.getLineNumber(), expression
									.getCharacter()));
		}
		if (!TypesUtilities.getInstance().canTypeUpCastTo(
				evaluate(expression, scopeHandler, compilerFeatures, container)
						.getFirst().getFirst(), TypesUtilities.INT_TYPE)) {
			container.getExceptions().add(
					new CodeCompilationException(
							"Only convertible int values are permitted here",
							expression.getLineNumber(), expression
									.getCharacter()));
		}
	}
}