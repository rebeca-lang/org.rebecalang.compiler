package org.rebecalang.compiler.modelcompiler.probabilisticrebeca;

import java.text.DecimalFormat;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaStatementObserver;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatementGroup;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ProbabilisticRebecaStatementObserver extends
		CoreRebecaStatementObserver {

	public static int PROB_ACCURACY = 1000;
	
	public static boolean probIsOne(double probability) {
		return ((int)(probability * PROB_ACCURACY) == PROB_ACCURACY);
	}

	public ProbabilisticRebecaStatementObserver() {
		super(new ProbabilisticRebecaExpressionResolver());
	}

	@Override
	public void resolveStatement(Statement statement,
			Category category, ScopeHandler scopeHandler,
			Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		if (statement instanceof PAltStatement) {
			checkPAltStatement((PAltStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else {
			super.resolveStatement(statement, category, scopeHandler, compilerFeature,
					container);
		}
	}

	private void checkPAltStatement(PAltStatement pAltStatement, Category category,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		scopeHandler.pushActivationRecord(TypesUtilities.SWITCH_STATEMENT_TYPE);

		double probs = 0;
		for (PAltStatementGroup pasg : pAltStatement.getPAltStatementGroups()) {
			Expression switchLabel = pasg.getExpression();
			Pair<Pair<Type, Category>, Object> evaluate = expressionResolver.evaluate(
					switchLabel, scopeHandler, compilerFeature, container);
			if (evaluate.getSecond() != null) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(
						evaluate.getFirst().getFirst(), TypesUtilities.DOUBLE_TYPE)) {
					CodeCompilationException rce = TypesUtilities
							.getTypeMismatchException(evaluate.getFirst().getFirst(),
									TypesUtilities.DOUBLE_TYPE);
					rce.setLine(switchLabel.getLineNumber());
					rce.setColumn(switchLabel.getCharacter());
					container.addException(rce);
				} else {
					probs += ((Number) evaluate.getSecond()).doubleValue();
				}
			} else {
				CodeCompilationException cce = new CodeCompilationException(
						"Probobabilistic expressions must be constant expressions",
						switchLabel.getLineNumber(), switchLabel.getCharacter());
				container.addException(cce);
			}
			scopeHandler.pushActivationRecord();
			for (Statement statement : pasg.getStatements())
				resolveStatement(statement, category, scopeHandler, compilerFeature,
						container);
			scopeHandler.popActivationRecord();
		}
		if (!probIsOne(probs)) {
			String formatter = "0.";
			for (int cnt = 0; cnt < Math.log10(PROB_ACCURACY); cnt++)
				formatter += "0";
			CodeCompilationException cce = new CodeCompilationException(
					"The summations of probabilities in pAlt options should be 1.000 instead of "
							+ new DecimalFormat(formatter).format(probs),
					pAltStatement.getLineNumber(), pAltStatement.getCharacter());
			container.addException(cce);
		}
		scopeHandler.popActivationRecord();
	}

}
