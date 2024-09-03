package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ContextConfiguration(classes = CompilerConfig.class) 
@SpringJUnitConfig
public class AddHocTest {
	
	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/adhoc/"; 

	@Test
//	@Disabled
	public void test() {
		File model = new File(MODEL_FILES_BASE + "VarSensorImmediate.rebeca");
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		extension.add(CompilerExtension.TIMED_REBECA);
		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_3);
		
		RebecaModel rebecaModel = compileRebecaFile.getFirst();
		rebecaModel.getRebecaCode();
		
		ExceptionContainer expected = new ExceptionContainer();
		expected.setCorrespondingResource(model);
		
//		expected.add(new CodeCompilationException("The summations of probabilities in probabilistic expression must be 1.000 instead of 0.750", 11, 11));

		Assertions.assertEquals(expected, exceptionContainer);
		
	}
	
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(RebecaModel.class.getPackage().getName());
		System.out.println(jaxbContext);

	}

}