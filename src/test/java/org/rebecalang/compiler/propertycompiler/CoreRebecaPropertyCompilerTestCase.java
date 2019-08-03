package org.rebecalang.compiler.propertycompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;
import org.rebecalang.compiler.modelcompiler.RebecaCompiler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.propertycompiler.corerebeca.CoreRebecaPropertyCompiler;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.Pair;

public class CoreRebecaPropertyCompilerTestCase {

	public final static String PROPERTY_PATH = "src/test/resources/org/rebecalang/compiler/propertycompiler";
	public final static String MODEL_PATH = "src/test/resources/org/rebecalang/compiler/modelcompiler";
	// @Test
	public void test1() {
		try {

			Set<CompilerFeature> compilerFeatures = new HashSet<CompilerFeature>();
			compilerFeatures.add(CompilerFeature.CORE_2_1);

			RebecaCompiler rebecaCompiler = new RebecaCompiler();
			Pair<RebecaModel, SymbolTable> compilationResult = rebecaCompiler
					.compileRebecaFile(new File(MODEL_PATH + "/phils.rebeca"), compilerFeatures);

			if (rebecaCompiler.getExceptionContainer().getExceptions().isEmpty()) {
				CoreRebecaPropertyCompiler propertyHandler = new CoreRebecaPropertyCompiler();
				PropertyModel propertyModel = propertyHandler.compilePropertyModel(compilationResult.getFirst(),
						compilationResult.getSecond(), new File(PROPERTY_PATH + "/phils.property"), compilerFeatures);
				if (!propertyHandler.getExceptionContainer().getExceptions().isEmpty())
					propertyHandler.getExceptionContainer().print(System.out);

				System.out.println(propertyModel.getDefinitions().size());
			} else {
				rebecaCompiler.getExceptionContainer().print(System.out);
			}
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testHybrid() {
		try {

			Set<CompilerFeature> compilerFeatures = new HashSet<CompilerFeature>();
			compilerFeatures.add(CompilerFeature.CORE_2_3);
			compilerFeatures.add(CompilerFeature.HYBRID_REBECA);

			RebecaCompiler rebecaCompiler = new RebecaCompiler();
			Pair<RebecaModel, SymbolTable> compilationResult = rebecaCompiler
					.compileRebecaFile(new File(MODEL_PATH + "/VendingMachine.rebeca"), compilerFeatures);

			if (!rebecaCompiler.getExceptionContainer().getExceptions().isEmpty()) {
				rebecaCompiler.getExceptionContainer().print(System.out);
			} else {
				RebecaModel first = compilationResult.getFirst();
				System.out.println(first.getRebecaCode().getReactiveClassDeclaration().size());				
			}
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CoreRebecaPropertyCompilerTestCase c = new CoreRebecaPropertyCompilerTestCase();
		c.test1();
	}
}
