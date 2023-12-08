package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MsgsrvDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.WhileStatement;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ContextConfiguration(classes = CompilerConfig.class) 
@SpringJUnitConfig
public class FeatureAnnotationTest {

	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/modelcompiler/featureannotation/"; 

	@Test
	public void GIVEN_ModelWithTwoReactiveclasses_WHEN_OneHasUndefinedFeatureAndWrongTypeFeature_THEN_Error() {
		File model = new File(MODEL_FILES_BASE + "ErrorInTypeAndDefinition.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new CodeCompilationException("Feature expression must be evaluated to a boolean value", 9, 11));

		Assertions.assertEquals(expectedExceptionContainer, expectedExceptionContainer);
		
	}

	@Test
	public void GIVEN_ModelWithTwoReactiveclasses_WHEN_OneDoesNotSatisfyFeature_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "IncludeOneReactiveClass.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		Assertions.assertEquals(1, 
				compileRebecaFile.getFirst().getRebecaCode().getReactiveClassDeclaration().size());
		
	}

	@Test
	public void GIVEN_ModelWithSomeMsgsrvsAndAConstructorAndASynchMethod_WHEN_SomeDoNotSatisfyFeature_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "IncludeSomeMethods.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		
		ReactiveClassDeclaration rcd = compileRebecaFile.getFirst().getRebecaCode().getReactiveClassDeclaration().get(0);
		Assertions.assertEquals(2, rcd.getMsgsrvs().size());
		Assertions.assertEquals(1, rcd.getSynchMethods().size());
		Assertions.assertEquals(rcd.getConstructors().get(0).getFormalParameters().size(), 0);
	}
	
	@Test
	public void GIVEN_ModelWithOneMsgsrvsAndSomeNotNestedStatements_WHEN_SomeDoNotSatisfyFeature_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "OneMsgsrvNoNestedStatement.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		
		MsgsrvDeclaration md = compileRebecaFile.getFirst().getRebecaCode().
				getReactiveClassDeclaration().get(0).getMsgsrvs().get(0);
		Assertions.assertEquals(2, md.getBlock().getStatements().size());
	}

	@Test
	public void GIVEN_ModelWithOneMsgsrvsAndSomeNestedStatements_WHEN_SomeDoNotSatisfyFeature_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "OneMsgsrvNestedStatement.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel, SymbolTable> compileRebecaFile = 
				compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
		
		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		
		ReactiveClassDeclaration rcd = compileRebecaFile.getFirst().getRebecaCode().getReactiveClassDeclaration().get(0);
		MsgsrvDeclaration md = rcd.getMsgsrvs().get(0);
		WhileStatement whileStatement = (WhileStatement) md.getBlock().getStatements().get(0);
		ForStatement forStatement = (ForStatement) ((BlockStatement)whileStatement.getStatement()).getStatements().get(0);
		Assertions.assertEquals(2, ((BlockStatement)forStatement.getStatement()).getStatements().size());
		
	}
	
	@Test
	public void GIVEN_ModelWithStatevars_WHEN_SomeDoNotSatisfyFeature_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "Statevars.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		
		ReactiveClassDeclaration rcd = compileRebecaFile.getFirst().getRebecaCode().
				getReactiveClassDeclaration().get(0);
		Assertions.assertEquals(1, rcd.getStatevars().size());
		Assertions.assertEquals(1, rcd.getKnownRebecs().size());
	}

	@Test
	public void GIVEN_ModelWithMain_WHEN_SomeInstancesDoNotSatisfyFeature_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "main.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		
		MainDeclaration mainDeclaration = compileRebecaFile.getFirst().getRebecaCode().getMainDeclaration();
		Assertions.assertEquals(2, mainDeclaration.getMainRebecDefinition().size());
	}

	@Test
	public void GIVEN_ModelWithInterface_WHEN_SomeInstancesDoNotSatisfyFeature_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "interface.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		
	}
	
	@Test
	public void GIVEN_ModelWithFeaturevar_WHEN_FeatureUsedInExpressions_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "FeatureVariableInLogic.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
		
	}

}
