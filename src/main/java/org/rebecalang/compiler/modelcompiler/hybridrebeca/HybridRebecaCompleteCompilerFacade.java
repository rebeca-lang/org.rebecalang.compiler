package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import java.util.HashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.SymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.TypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler.HybridRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler.HybridRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler.HybridRebecaListener;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.HybridRebecaCode;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.HybridTermPrimary;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.ModeDeclaration;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.PhysicalClassDeclaration;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.statementsemanticchecker.expression.HybridPrimaryTermSemanticCheck;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("HYBRID_REBECA")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HybridRebecaCompleteCompilerFacade extends CoreRebecaCompleteCompilerFacade {

	public HybridRebecaCompleteCompilerFacade(
			@Qualifier("HYBRID_REBECA") TypeSystemInitializer typeSystemInitializer,
			@Qualifier("HYBRID_REBECA") SymbolTableInitializer symbolTableInitializer) {
		super(typeSystemInitializer, symbolTableInitializer);
	}


	@Autowired
	private ApplicationContext appContext;

	public final static Label PHYSICAL_SYSTEM_MODE_LABEL = new Label();
	static {
		PHYSICAL_SYSTEM_MODE_LABEL.setName("PhysicalSystemModeLabel");
	}

	protected void initializeExpressionSemanticCheckContainer() {
		super.initializeExpressionSemanticCheckContainer();
		expressionSemanticCheckContainer.registerSemanticsChecker(HybridTermPrimary.class, 
				appContext.getBean(HybridPrimaryTermSemanticCheck.class,
						typeSystem,
						expressionSemanticCheckContainer));
	}
	
	protected HashMap<String, ReactiveClassDeclaration> getAllClasses() {
		HashMap<String,ReactiveClassDeclaration> allClasses = super.getAllClasses();
		for(PhysicalClassDeclaration physicalClassDeclaration : ((HybridRebecaCode)rebecaModel.getRebecaCode()).getPhysicalClassDeclaration())
			allClasses.put(physicalClassDeclaration.getName(), physicalClassDeclaration);
		return allClasses;
	}
	
	protected void addVariablesOfRebecaExtensionToScope() {
		super.addEnvironmentVariablesToScope();
		try {
			scopeHandler.addVariableToCurrentScope("none",
					HybridRebecaTypeSystem.PHYSICAL_SYSTEM_MODE_TYPE, PHYSICAL_SYSTEM_MODE_LABEL, 
					0, 0);
		} catch (ScopeException e1) {
			e1.printStackTrace();
		}
		
		for(PhysicalClassDeclaration physicalClassDeclaration : ((HybridRebecaCode)rebecaModel.getRebecaCode()).getPhysicalClassDeclaration()) {
			for(ModeDeclaration modeDeclarations : physicalClassDeclaration.getModeDeclarations()) {
				try {
					scopeHandler.addVariableToCurrentScope(modeDeclarations.getName(),
							HybridRebecaTypeSystem.PHYSICAL_SYSTEM_MODE_TYPE, PHYSICAL_SYSTEM_MODE_LABEL, 
							modeDeclarations.getLineNumber(), modeDeclarations.getCharacter());
				} catch (ScopeException e) {
					exceptionContainer.addException(e);
				}
			}
		}
	}
	
	protected void semanticCheckReactiveClassDeclarations() {
		super.semanticCheckReactiveClassDeclarations();
		
		for (PhysicalClassDeclaration fcd : ((HybridRebecaCode)rebecaModel.getRebecaCode())
				.getPhysicalClassDeclaration()) {

			scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.REACTIVE_CLASS);

			addIntraReactiveClassVariablesToScope(fcd);
			
			semanticCheckForConstructorsOfReactiveClassDeclaration(fcd);

			semanticCheckForSynchMethodsOfReactiveClassDeclaration(fcd);

			semanticCheckForMessageServersOfReactiveClassDeclaration(fcd);

			semanticCheckForModesOfPhysicalClassDeclaration(fcd);
			
			scopeHandler.popScopeRecord();
		}
	}

	private void semanticCheckForModesOfPhysicalClassDeclaration(PhysicalClassDeclaration fcd) {
		for (ModeDeclaration md : fcd.getModeDeclarations()) {
			scopeHandler.pushScopeRecord(null);
			Pair<Type,Object> check = expressionSemanticCheckContainer.check(md.getGuardDeclaration().getCondition());
			if(check.getFirst() != CoreRebecaTypeSystem.BOOLEAN_TYPE) {
				CodeCompilationException rce = new CodeCompilationException(
						"Conditional expression of guards should be boolean",
						md.getGuardDeclaration().getCondition().getLineNumber(), 
						md.getGuardDeclaration().getCondition().getCharacter());
				exceptionContainer.addException(rce);
			}
			statementSemanticCheckContainer.check(md.getGuardDeclaration().getBlock());
			scopeHandler.popScopeRecord();

			scopeHandler.pushScopeRecord(HybridRebecaLabelUtility.INVARIANT_BLOCK);
			check = expressionSemanticCheckContainer.check(md.getInvariantDeclaration().getCondition());
			if(check.getFirst() != CoreRebecaTypeSystem.BOOLEAN_TYPE) {
				CodeCompilationException rce = new CodeCompilationException(
						"Conditional expression of invariants should be boolean",
						md.getInvariantDeclaration().getCondition().getLineNumber(), 
						md.getInvariantDeclaration().getCondition().getCharacter());
				exceptionContainer.addException(rce);

			}
			statementSemanticCheckContainer.check(md.getInvariantDeclaration().getBlock());
			scopeHandler.popScopeRecord();
		}
		
	}

	@Autowired
	public void setTypeSystem(@Qualifier("HYBRID_REBECA") AbstractTypeSystem typeSystem) {
		this.typeSystem = typeSystem;
	}

	@Override
	public Parser getParser(CharStream input) {
		HybridRebecaCompleteLexer lexer = new HybridRebecaCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new HybridRebecaCompleteParser(tokens);
	}
	@Override
	public void attachListener(Parser parser) {
		HybridRebecaListener listener = new HybridRebecaListener();
		parser.addParseListener(listener);
	}
}
