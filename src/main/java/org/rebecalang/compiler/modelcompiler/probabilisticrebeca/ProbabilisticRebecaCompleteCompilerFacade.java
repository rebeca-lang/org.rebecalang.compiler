package org.rebecalang.compiler.modelcompiler.probabilisticrebeca;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.SymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.TypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.expression.ProbabilisticExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.statementsemanticchecker.statement.PALTStatementSemanticCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PROBABILISTIC_REBECA")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProbabilisticRebecaCompleteCompilerFacade extends
		CoreRebecaCompleteCompilerFacade {

	public ProbabilisticRebecaCompleteCompilerFacade(@Qualifier("PROBABILISTIC_REBECA") TypeSystemInitializer typeSystemInitializer,
			@Qualifier("PROBABILISTIC_REBECA") SymbolTableInitializer symbolTableInitializer) {
		super(typeSystemInitializer, symbolTableInitializer);
	}

	@Autowired
	private ApplicationContext appContext;

	@Override
	protected void initializeExpressionSemanticCheckContainer() {
		super.initializeExpressionSemanticCheckContainer();
		expressionSemanticCheckContainer.
			registerSemanticsChecker(ProbabilisticExpression.class, 
					appContext.getBean(ProbabilisticExpressionSemanticCheck.class));
	}

	@Override
	protected void initializeStatementSemanticCheckContainer() {
		super.initializeStatementSemanticCheckContainer();
		statementSemanticCheckContainer.registerSemanticsChecker(PAltStatement.class, 
				appContext.getBean(PALTStatementSemanticCheck.class));
	}

	@Override
	public Parser getParser(CharStream input) {
		ProbabilisticRebecaCompleteLexer lexer = new ProbabilisticRebecaCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new ProbabilisticRebecaCompleteParser(tokens);
	}

}
