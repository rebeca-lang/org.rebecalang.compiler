package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ContextConfiguration(classes = CompilerConfig.class) 
@SpringJUnitConfig
public class AccessControlTest {
	
	public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/modelcompiler/"; 

	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	@Test
	public void GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_AccessToConstructorTHEN_TwoErrors() {
		File model = new File(MODEL_FILES_BASE + "accesscontrol/InvalidAccessToConstructor.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new SymbolTableException("The method A() is not visible for the type A", 6, 7));
		expectedExceptionContainer.addException(new SymbolTableException("The method f() is not visible for the type A", 15, 4));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_AccessToLocalMethodOfOtherActorTHEN_OneError() {
		File model = new File(MODEL_FILES_BASE + "accesscontrol/InvalidAccessToSynchMethod.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);
		expectedExceptionContainer.addException(new SymbolTableException("The method f() is not visible for the type A", 12, 4));

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_AccessToLocalMethodOfParentActorTHEN_NoError() {
		File model = new File(MODEL_FILES_BASE + "accesscontrol/ValidAccessToParentSynchMethod.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	
	@Test
	public void GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_ValidAccessToMsgsrvsTHEN_NoError() {
		File model = new File(MODEL_FILES_BASE + "accesscontrol/ValidAccessToMsgsrvs.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);

		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
	}
	



	@Test
	public void GIVEN_ManyTests_WHEN_AllAreCorrect_THEN_NoError() {
		GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_AccessToLocalMethodOfOtherActorTHEN_OneError();
		GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_AccessToConstructorTHEN_TwoErrors();
		GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_ValidAccessToMsgsrvsTHEN_NoError();
	}
}
