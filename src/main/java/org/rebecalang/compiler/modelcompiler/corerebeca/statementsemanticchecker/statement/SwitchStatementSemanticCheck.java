package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import java.util.HashSet;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatementGroup;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class SwitchStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Override
	public void check(Statement statement) throws CompilerInternalErrorRuntimeException {
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.SWITCH_STATEMENT);

		SwitchStatement switchStatement = (SwitchStatement) statement;
		
		Pair<Type, Object> result = expressionSemanticCheckContainer.check(switchStatement.getExpression());
		Type switchExpressionType = result.getFirst();
		if (switchExpressionType != null) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(
					switchExpressionType, TypesUtilities.INT_TYPE)) {
				CodeCompilationException rce = new CodeCompilationException(
						"Cannot switch on a value of type "
								+ TypesUtilities
										.getTypeName(switchExpressionType)
								+ ". Only convertible int values are permitted",
						switchStatement.getLineNumber(), switchStatement
								.getCharacter());
				exceptionContainer.addException(rce);
			} else {
				Set<Integer> caseOptions = new HashSet<Integer>();
				boolean hasDefault = false;
				for (SwitchStatementGroup sbsg : switchStatement
						.getSwitchStatementGroups()) {
					if (sbsg.getExpression() != null) {
						Expression switchLabel = sbsg.getExpression();
						Pair<Type, Object> evaluate = expressionSemanticCheckContainer.check(switchLabel);
						if (evaluate.getSecond() != null) {
							if (!TypesUtilities.getInstance().canTypeUpCastTo(
									evaluate.getFirst(),
									TypesUtilities.INT_TYPE)) {
								TypesUtilities.addTypeMismatchException(exceptionContainer, evaluate.getFirst(),
										TypesUtilities.INT_TYPE, 
										switchLabel.getCharacter(), switchLabel.getLineNumber());

							} else {
								if (caseOptions.contains(((Number) evaluate
										.getSecond()).intValue())) {
									CodeCompilationException rce = new CodeCompilationException(
											"Duplicate case value \""
													+ ((Number) evaluate.getSecond()).intValue()
													+ "\"",
											switchLabel.getLineNumber(),
											switchLabel.getCharacter());
									exceptionContainer.addException(rce);
								} else
									caseOptions.add(((Number) evaluate
											.getSecond()).intValue());
							}
						} else {
							CodeCompilationException cce = new CodeCompilationException(
									"Case expressions must be constant expressions",
									switchLabel.getLineNumber(), switchLabel
											.getCharacter());
							exceptionContainer.addException(cce);
						}
					} else {
						if (hasDefault) {
							exceptionContainer
									.addException(new CodeCompilationException(
											"The default case is already defined",
											sbsg.getLineNumber(), sbsg
													.getCharacter()));
						}
						hasDefault = true;
					}
					for (Statement stat : sbsg.getStatements())
						((StatementSemanticCheckContainer)defaultContainer).check(stat);
				}
			}
		}
		scopeHandler.popScopeRecord();
	}


}
