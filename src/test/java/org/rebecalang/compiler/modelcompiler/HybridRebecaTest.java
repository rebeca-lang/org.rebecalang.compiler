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
public class HybridRebecaTest {

	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/modelcompiler/hybridrebeca/"; 

	@Test
	public void GIVEN_BasicHybridRebecaModel_WHEN_ModelIsCorrect_THEN_NoError() {
		File model = new File(MODEL_FILES_BASE + "Heater.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.HYBRID_REBECA);
		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(model);

		Assertions.assertEquals(exceptionContainer, expectedExceptionContainer);
		
	}
}
