package org.rebecalang.compiler.modelcompiler.timedrebeca;

import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.ExpressionResolver;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class TimedRebecaScopeHandler extends ScopeHandler {

	public TimedRebecaScopeHandler(RebecaModel rebecaModel,
			ExpressionResolver expressionResolver,
			Set<CompilerFeature> compilerFeature, ExceptionContainer container) {
		super(rebecaModel, expressionResolver, compilerFeature, container);

		reservedVariables.put("now", new Pair<Type, Category>(
				TypesUtilities.INT_TYPE,
				TimedRebecaCategoriesUtilities.TIMED_VARIABLE));
		reservedVariables.put("currentMessageArrival",
				new Pair<Type, Category>(TypesUtilities.INT_TYPE,
						TimedRebecaCategoriesUtilities.TIMED_VARIABLE));
		reservedVariables.put("currentMessageDeadline",
				new Pair<Type, Category>(TypesUtilities.INT_TYPE,
						TimedRebecaCategoriesUtilities.TIMED_VARIABLE));
		reservedVariables.put("currentMessageWaitingTime",
				new Pair<Type, Category>(TypesUtilities.INT_TYPE,
						TimedRebecaCategoriesUtilities.TIMED_VARIABLE));
	}
}
