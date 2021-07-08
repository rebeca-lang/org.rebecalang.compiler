package org.rebecalang.compiler.propertycompiler.timedrebeca.expressionsemanticchecker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("TCTL_PROPERTY_PRIMARY")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PropertyPrimaryTermExpressionSemanticCheck extends PrimaryTermExpressionSemanticCheck  {

	@Autowired
	protected ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	public PropertyPrimaryTermExpressionSemanticCheck(AbstractTypeSystem typeSystem) {
		super(typeSystem);
	}

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Set<String> tctlModalities = new HashSet<String>(Arrays.asList("EU", "AU", "AG", "AF"));
		int size = exceptionContainer.getExceptions().size();
		Pair<Type, Object>returnVal = super.check(expression, baseType);
		if (returnVal.getFirst() == AbstractTypeSystem.UNKNOWN_TYPE || 
				size != exceptionContainer.getExceptions().size())
			return returnVal;
		
		TermPrimary termPrimary = (TermPrimary) expression;
		String termName = termPrimary.getName();

		if (termPrimary.getParentSuffixPrimary() != null) {
			CodeCompilationException codeCompilationException = 
					new CodeCompilationException(
					"The first parameter of " + termName + " must be in form of "
							+ "'time ~ c' where 'c' is a compile time evaluatable integer expression and "
							+ "'~' is one of '<', '<=', '>', '>=', and '=='.", 
							termPrimary.getLineNumber(), 
							termPrimary.getCharacter());
			if (tctlModalities.contains(termName)) {
				Expression timeConstraint = termPrimary.getParentSuffixPrimary().getArguments().get(0);
				if (!(timeConstraint instanceof BinaryExpression)) {
					exceptionContainer.addException(codeCompilationException);
				} else if (!(((BinaryExpression)timeConstraint).getLeft() instanceof TermPrimary)) {
					exceptionContainer.addException(codeCompilationException);
				} else if (!((TermPrimary)((BinaryExpression)timeConstraint).getLeft()).getName().equals("time")) {
					exceptionContainer.addException(codeCompilationException);
				} else if (!((BinaryExpression)timeConstraint).getRight().getType().
						canTypeCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
					exceptionContainer.addException(codeCompilationException);
				} else {
					Expression right = ((BinaryExpression)termPrimary.getParentSuffixPrimary().getArguments().get(0)).getRight();
					Pair<Type, Object> timeConstraintValue = expressionSemanticCheckContainer.check(right, null);
					Set<String> operators = new HashSet<String>(Arrays.asList("<", "<=", ">", ">=", "=="));
					if (!operators.contains(((BinaryExpression)timeConstraint).getOperator()) ||
							timeConstraintValue.getSecond() == null) {
						exceptionContainer.addException(codeCompilationException);
					}
					Literal timeConstraintLiteral = new Literal();
					timeConstraintLiteral.setType(CoreRebecaTypeSystem.INT_TYPE);
					timeConstraintLiteral.setLiteralValue(timeConstraintValue.getSecond().toString());
					((BinaryExpression)termPrimary.getParentSuffixPrimary().getArguments().get(0)).setRight(timeConstraintLiteral);
				}
			}
		}
		return returnVal;
	}
	
}
