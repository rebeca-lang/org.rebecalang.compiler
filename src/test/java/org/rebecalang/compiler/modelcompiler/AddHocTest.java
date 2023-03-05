package org.rebecalang.compiler.modelcompiler;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
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
	@Disabled
	public void test() {
//		File model = new File(MODEL_FILES_BASE + "LBE.rebeca");
//		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
//
//		compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);
//		
//		ExceptionContainer expected = new ExceptionContainer();
//		expected.setCorrespondingResource(model);
		
//		expected.add(new CodeCompilationException("The summations of probabilities in probabilistic expression must be 1.000 instead of 0.750", 11, 11));

//		Assertions.assertEquals(expected, exceptionContainer);
		
		ExpressionParser parser = new SpelExpressionParser();        
        Expression exp = parser.parseExpression("6 == 7");
//        Boolean value = exp.getValue(Boolean.class);
//        System.out.println(value);
        Integer value = exp.getValue(Integer.class);
	    System.out.println(value*2);
	}

}