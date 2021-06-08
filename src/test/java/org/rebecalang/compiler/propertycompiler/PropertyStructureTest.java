package org.rebecalang.compiler.propertycompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.modelcompiler.RebecaCompiler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ContextConfiguration(classes = CompilerConfig.class) 
@SpringJUnitConfig
public class PropertyStructureTest {
	
	public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/modelcompiler/"; 
	public static final String PROPERTY_FILES_BASE = "src/test/resources/org/rebecalang/compiler/propertycompiler/"; 

	@Autowired
	RebecaCompiler modelCompiler;

	@Autowired
	public ExceptionContainer exceptionContainer;
	
	@Autowired PropertyCompiler propertyCompiler;

	@Test
	public void GIVEN_CorrectCoreRebecaModelAndPropertyFile_WHEN_CoreIs2_1_THEN_noError() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelWithInitialMethod.rebeca");
		Set<CompilerFeature> extension = new HashSet<CompilerFeature>();
		Pair<RebecaModel, SymbolTable> modelCompilatioResult = modelCompiler.compileRebecaFile(model, extension, CompilerFeature.CORE_2_1);
		
		File property = new File(PROPERTY_FILES_BASE + "CoreRebecaModelWithInitialMethod.property");
		propertyCompiler.compilePropertyFile(property, modelCompilatioResult.getFirst(), extension);
		
		Set<CodeCompilationException> expected = new HashSet<CodeCompilationException>();
		
		Assertions.assertEquals(expected, exceptionContainer.getExceptions());
	}
	
	@Test
	public void GIVEN_CorrectGeneralCoreRebecaModelAndPropertyFile_WHEN_CoreIs2_1_THEN_noError() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelWithInitialMethod.rebeca");
		Set<CompilerFeature> extension = new HashSet<CompilerFeature>();
		Pair<RebecaModel, SymbolTable> modelCompilatioResult = modelCompiler.compileRebecaFile(model, extension, CompilerFeature.CORE_2_1);
		
		File property = new File(PROPERTY_FILES_BASE + "GeneralCoreRebecaModelWithInitialMethod.property");
		propertyCompiler.compilePropertyFile(property, modelCompilatioResult.getFirst(), extension);
		
		Set<CodeCompilationException> expected = new HashSet<CodeCompilationException>();
		
		Assertions.assertEquals(expected, exceptionContainer.getExceptions());
	}
	
	@Test
	public void GIVEN_DinningPhilosopfersModelWithProperty_WHEN_CoreIs2_0_THEN_NoError() {
		File model = new File(PROPERTY_FILES_BASE + "DiningPhilosophers.rebeca");
		Set<CompilerFeature> extension = new HashSet<CompilerFeature>();
		Pair<RebecaModel, SymbolTable> modelCompilatioResult = modelCompiler.compileRebecaFile(model, extension, CompilerFeature.CORE_2_0);
		
		File property = new File(PROPERTY_FILES_BASE + "DiningPhilosophers.property");
		propertyCompiler.compilePropertyFile(property, modelCompilatioResult.getFirst(), extension);
		
		Set<CodeCompilationException> expected = new HashSet<CodeCompilationException>();
		
		Assertions.assertEquals(expected, exceptionContainer.getExceptions());
	}
	
	@Test
	public void GIVEN_ESANModelWithProperty_WHEN_CoreIs2_1_THEN_NoError() {
		File model = new File(MODEL_FILES_BASE + "TinyOSPV6-TDMA.rebeca");
		Set<CompilerFeature> extension = new HashSet<CompilerFeature>();
		extension.add(CompilerFeature.TIMED_REBECA);

		Pair<RebecaModel, SymbolTable> modelCompilatioResult = modelCompiler.compileRebecaFile(model, extension, CompilerFeature.CORE_2_1);

		File property = new File(PROPERTY_FILES_BASE + "TinyOSPV6.property");
		propertyCompiler.compilePropertyFile(property, modelCompilatioResult.getFirst(), extension);
		
		Set<CodeCompilationException> expected = new HashSet<CodeCompilationException>();
		
		Assertions.assertEquals(expected, exceptionContainer.getExceptions());
	}
	
 }
