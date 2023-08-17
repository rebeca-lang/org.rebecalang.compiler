package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ContextConfiguration(classes = CompilerConfig.class) 
@SpringJUnitConfig
public class ModelStructureTest {
	
	public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/modelcompiler/"; 

	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	@Test
	public void GIVEN_CorrectCoreRebecaModelWithInitialMethod_WHEN_CoreIs2_0_THEN_1Error() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelWithInitialMethod.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_0);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new SymbolTableException("The method initial() is undefined for the type B", 25, 3));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_CoreRebecaModelWithDifferentExpressions_WHEN_CoreIs2_1_THEN_1Error() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelAllExpressions.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new ScopeException("\"c\" undeclared", 20, 2));
		expectedExceptionContainer.addException(new CodeCompilationException("Direct sending to \"self\" is allowed in constructors", 22, 2));
		expectedExceptionContainer.addException(new CodeCompilationException("Only message servers are allowed to have non-deterministic expression", 24, 10));
		expectedExceptionContainer.addException(new CodeCompilationException("Non-deterministic terms must be constant expressions", 24, 12));
		expectedExceptionContainer.addException(new ScopeException("\"c\" undeclared", 24, 17));
		expectedExceptionContainer.addException(new CodeCompilationException("Rebeca core 2.2 and upper support dynamic actor creation", 28, 17));
		expectedExceptionContainer.addException(new ScopeException("\"currentMessageArrival\" undeclared", 32, 17));
		expectedExceptionContainer.addException(new SymbolTableException("The method delay(int) is undefined", 37, 2));
		expectedExceptionContainer.addException(new ScopeException("Redeclaration of \"int a\", it has already been declared in line 32 column 7", 40, 11));
		expectedExceptionContainer.addException(new ScopeException("Redeclaration of \"int b\", it has already been declared in line 34 column 12", 40, 19));
		expectedExceptionContainer.addException(new CodeCompilationException("Duplicate case value \"5\"", 43, 15));

		
		
		
		expectedExceptionContainer.addException(new SymbolTableException("The method f() is undefined", 44, 5));
		expectedExceptionContainer.addException(
				new CodeCompilationException("There is no meta data for type String", 45, 7));
		expectedExceptionContainer.addException(
				new CodeCompilationException("Type mismatch: cannot convert from double to int", 49, 13));
		expectedExceptionContainer.addException(
				new CodeCompilationException("Non-deterministic terms must be constant expressions", 49, 15));
		expectedExceptionContainer.addException(
				new SymbolTableException("The method sib(double, Test1) is undefined for the type Test1", 59, 16));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_CoreRebecaModelWithCompilerError_WHEN_CoreIs2_1_THEN_1Error() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelWithCompilerError.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new CodeCompilationException("Unknown type C", 4, 2));
		expectedExceptionContainer.addException(new CodeCompilationException(
				"The A knownrebecs type binding of (B, C) is not applicable for the arguments (unknown)", 12, 3));
		expectedExceptionContainer.addException(new ScopeException("\"b\" undeclared", 12, 5));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_SchedularTimedRebecaModel_WHEN_CoreIs2_1_THEN_4Errors() {
		File model = new File(MODEL_FILES_BASE + "SchedularV3.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
		
		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new CodeCompilationException("Unknown type turn", 268, 28));
		expectedExceptionContainer.addException(new CodeCompilationException("Unknown type turn", 350, 39));
		expectedExceptionContainer.addException(new CodeCompilationException("Type mismatch: cannot convert from int to boolean", 49, 14));
		expectedExceptionContainer.addException(new CodeCompilationException("The operator + is undefined for the argument type(s) Timer, byte", 47, 13));
		
		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_WSANTimedRebecaModel_WEHN_CoreIs2_1_THEN_NoError() {
		File model = new File(MODEL_FILES_BASE + "TinyOSPV6-TDMA.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
		exceptionContainer.print(System.out);
		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
	}	
	
	@Test
	public void GIVEN_TimedRebecaModelWithPriority_WHEN_CoreIs2_1_THEN_2Errors() {
		File model = new File(MODEL_FILES_BASE + "TimedRebecaPriority.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
		
		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new CodeCompilationException("Conflict between local and global priority definitions", 22, 2));
		expectedExceptionContainer.addException(new CodeCompilationException("Value of priority must be an integer expression", 30, 2));
		
		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}

	@Test
	public void GIVEN_TimedRebecaModelWithTypesAndMethods_WHEN_CoreIs2_1_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "TimedRebecaTypesAndMethods.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
		
		Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());
	}
	
	@Test
	public void GIVEN_ProbabilisticRebecaModelWithStatements_WHEN_CoreIs2_1_THEN_NoErrors() {
		File model = new File(MODEL_FILES_BASE + "ProbabilisticRebecaStatementsAndExpressions.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.PROBABILISTIC_REBECA);

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
		
		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new CodeCompilationException("The summations of probabilities in probabilistic expression must be 1.000 instead of 0.750", 11, 11));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_CoreRebecaModelWithInheritance_WHEN_CoreIs2_3_THEN_NoError() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaWithInheritance.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);
		
		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_CoreRebecaModelWithInheritanceAndAbstractClass_WHEN_CoreIs2_3_THEN_1Error() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaWithInheritanceError.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);
		
		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new CodeCompilationException("Reactiveclass A2 should be defined as abstract", 8, 14));
		expectedExceptionContainer.addException(new CodeCompilationException("Cannot instantiate from abstract reactiveclass A", 22, 3));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}

	@Test
	public void GIVEN_CoreRebecaModelWithInterface_WHEN_CoreIs2_3_THEN_NoError() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelWithInterface.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();

		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);
		
		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
//		expectedExceptionContainer.addException(new CodeCompilationException("Reactiveclass A2 should be defined as abstract", 8, 14));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	


	@Test
	public void GIVEN_ManyTests_WHEN_AllAreCorrect_THEN_NoError() {
		GIVEN_CoreRebecaModelWithDifferentExpressions_WHEN_CoreIs2_1_THEN_1Error();
		GIVEN_CorrectCoreRebecaModelWithInitialMethod_WHEN_CoreIs2_0_THEN_1Error();
		GIVEN_ProbabilisticRebecaModelWithStatements_WHEN_CoreIs2_1_THEN_NoErrors();
		GIVEN_SchedularTimedRebecaModel_WHEN_CoreIs2_1_THEN_4Errors();
		GIVEN_TimedRebecaModelWithPriority_WHEN_CoreIs2_1_THEN_2Errors();
		GIVEN_TimedRebecaModelWithTypesAndMethods_WHEN_CoreIs2_1_THEN_NoErrors();
		GIVEN_WSANTimedRebecaModel_WEHN_CoreIs2_1_THEN_NoError();
		GIVEN_CoreRebecaModelWithCompilerError_WHEN_CoreIs2_1_THEN_1Error();
		GIVEN_CoreRebecaModelWithInheritance_WHEN_CoreIs2_3_THEN_NoError();
		GIVEN_CoreRebecaModelWithInheritanceAndAbstractClass_WHEN_CoreIs2_3_THEN_1Error();
	}
}
