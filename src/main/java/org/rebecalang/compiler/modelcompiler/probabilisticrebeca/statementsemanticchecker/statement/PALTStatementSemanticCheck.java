package org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.statement;

import java.text.DecimalFormat;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatementGroup;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PALTStatementSemanticCheck extends AbstractStatementSemanticCheck {

	public static int PROB_ACCURACY = 1000;
	
	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;
	
	StatementSemanticCheckContainer statementSemanticCheckContainer;

	@Autowired
	public PALTStatementSemanticCheck(StatementSemanticCheckContainer statementSemanticCheckContainer,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
		this.statementSemanticCheckContainer = statementSemanticCheckContainer;
	}

	public static boolean probIsOne(double probability) {
		return ((int)(probability * PROB_ACCURACY) == PROB_ACCURACY);
	}

	
	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.SWITCH_STATEMENT);
		PAltStatement pAltStatement = (PAltStatement) statement;
		double probs = 0;
		for (PAltStatementGroup pasg : pAltStatement.getPAltStatementGroups()) {
			Expression switchLabel = pasg.getExpression();
			Pair<Type, Object> evaluate = expressionSemanticCheckContainer.check(switchLabel);
			if (evaluate.getSecond() != null) {
				if (!evaluate.getFirst().canTypeUpCastTo(CoreRebecaTypeSystem.DOUBLE_TYPE)) {
					TypesUtilities.addTypeMismatchException(exceptionContainer, evaluate.getFirst(),
							CoreRebecaTypeSystem.DOUBLE_TYPE, switchLabel);
				} else {
					probs += ((Number) evaluate.getSecond()).doubleValue();
				}
			} else {
				CodeCompilationException cce = new CodeCompilationException(
						"Probobabilistic expressions must be constant expressions",
						switchLabel.getLineNumber(), switchLabel.getCharacter());
				exceptionContainer.addException(cce);
			}

			for (Statement stat : pasg.getStatements())
				statementSemanticCheckContainer.check(stat);
		}
		if (!probIsOne(probs)) {
			String formatter = "0.";
			for (int cnt = 0; cnt < Math.log10(PROB_ACCURACY); cnt++)
				formatter += "0";
			CodeCompilationException cce = new CodeCompilationException(
					"The summations of probabilities in pAlt options should be 1.000 instead of "
							+ new DecimalFormat(formatter).format(probs),
					pAltStatement.getLineNumber(), pAltStatement.getCharacter());
			exceptionContainer.addException(cce);
		}
		scopeHandler.popScopeRecord();		
	}

}
