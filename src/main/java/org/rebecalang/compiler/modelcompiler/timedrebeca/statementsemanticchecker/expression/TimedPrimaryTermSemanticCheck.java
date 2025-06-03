package org.rebecalang.compiler.modelcompiler.timedrebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TimedPrimaryTermSemanticCheck extends 
		PrimaryTermExpressionSemanticCheck {

	
	@Autowired
	public TimedPrimaryTermSemanticCheck(@Qualifier("TIMED_REBECA") AbstractTypeSystem typeSystem, 
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		super(typeSystem, expressionSemanticCheckContainer);
	}
	
	public Pair<Type, Object> check(Expression expression,
			Type baseType) {
		TermPrimary termPrimary = (TermPrimary) expression;
		Pair<Type, Object> retValue = super.check(termPrimary, baseType);
		if (termPrimary.getParentSuffixPrimary() != null) {
			Expression afterExpression = ((TimedRebecaParentSuffixPrimary)termPrimary.getParentSuffixPrimary())
					.getAfterExpression();
			if (afterExpression != null) {
				if (retValue.getFirst() != CoreRebecaTypeSystem.MSGSRV_TYPE) {
					exceptionContainer
							.addException(new CodeCompilationException(
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
				if (retValue.getFirst() != CoreRebecaTypeSystem.MSGSRV_TYPE) {
					exceptionContainer
							.addException(new CodeCompilationException(
									"Only message server can be followed by \"deadline\" specifier",
									deadlineExpression.getLineNumber(),
									deadlineExpression.getCharacter()));

				} else {
					checkAfterAndDeadline(deadlineExpression);
				}
			}
			if(termPrimary.getName().equals("delay") && afterExpression == null &&
					deadlineExpression == null && 
					termPrimary.getParentSuffixPrimary().getArguments().size() == 1) {
				if(termPrimary.getParentSuffixPrimary().getArguments().get(0).getType().canTypeCastTo(CoreRebecaTypeSystem.INT_TYPE))
					termPrimary.setLabel(TimedRebecaLabelUtility.DELAY);
			}
		}

		return retValue;		

	}
	
	private void checkAfterAndDeadline(Expression expression) {
//		if (!compilerFeatures.contains(CompilerFeature.TIMED_REBECA)) {
//			exceptionContainer
//					.getExceptions()
//					.add(new CodeCompilationException(
//							"Only Timed Rebeca supports \"after/deadline\" quantifiers",
//							expression.getLineNumber(), expression
//									.getCharacter()));
//		}
		if (!expressionSemanticCheckContainer.check(expression)
				.getFirst().canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
			exceptionContainer.addException(
					new CodeCompilationException(
							"Only convertible int values are permitted here",
							expression.getLineNumber(), expression
									.getCharacter()));
		}
	}
	
}
