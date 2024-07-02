package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
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
public class InheritanceTest {
	
	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/modelcompiler/inheritance/"; 

	@Test
	public void CoreRebecaModelWithVariableRedefinition() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelWithVariableRedefinition.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);
		
		RebecaModel rebecaModel = compileRebecaFile.getFirst();
		rebecaModel.getRebecaCode();
		
		ExceptionContainer expected = new ExceptionContainer();
		expected.setCorrespondingResource(model);
		
		Assertions.assertEquals(expected, exceptionContainer);
		
	}

	@Test
	public void test() {
		File model = new File(MODEL_FILES_BASE + "LookupInheritedMethod.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
		
		RebecaModel rebecaModel = compileRebecaFile.getFirst();
		rebecaModel.getRebecaCode();
		
		ExceptionContainer expected = new ExceptionContainer();
		expected.setCorrespondingResource(model);
		
		expected.addException(new CodeCompilationException("Reactiveclass A should be defined as abstract", 9, 14));
		expected.addException(new CodeCompilationException("Reactiveclass B should be defined as abstract", 16, 14));
		expected.addException(new SymbolTableException("The method m5() is undefined for the type A", 12, 7));

		Assertions.assertEquals(expected, exceptionContainer);
		
	}

	@Test
	public void test2() {
		File model = new File(MODEL_FILES_BASE + "CoreRebecaModelWithAbstract.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
//		extension.add(CompilerExtension.TIMED_REBECA);

		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);
		
		RebecaModel rebecaModel = compileRebecaFile.getFirst();
		rebecaModel.getRebecaCode();
		
		ExceptionContainer expected = new ExceptionContainer();
		expected.setCorrespondingResource(model);
		
		Assertions.assertEquals(expected, exceptionContainer);
		
	}
	
}