package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.FileUtils;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ContextConfiguration(classes = CompilerConfig.class) 
@SpringJUnitConfig
public class ArraysTest {
	

	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	@Test
	public void GIVEN_RebecaModelWithTwoReactiveclasses_WHEN_AccessToConstructorTHEN_TwoErrors() throws IOException {
		String rebecaModel = 
				"""
					reactiveclass Foo(3) {
						knownrebecs {}
						statevars{int[3] t;}
						Foo() {
							self.foo(t[2]);
						}
						msgsrv foo(int i) {
						}
					}
					main {}				
				""";
		File rebecaFile = FileUtils.createTempFile(rebecaModel);
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		Pair<RebecaModel, SymbolTable> compiled = compiler.compileRebecaFile(rebecaFile, extension, CoreVersion.CORE_2_3);

		ExceptionContainer expectedExceptionContainer = new ExceptionContainer();
		expectedExceptionContainer.setCorrespondingResource(rebecaFile);		
		Assertions.assertEquals(expectedExceptionContainer, exceptionContainer);
		
		ReactiveClassDeclaration foo = compiled.getFirst().getRebecaCode().getReactiveClassDeclaration().get(0);
		DotPrimary sendMessage = (DotPrimary) foo.getConstructors().get(0).getBlock().getStatements().get(0);
		TermPrimary argument = (TermPrimary) ((TermPrimary)sendMessage.getRight()).getParentSuffixPrimary().getArguments().get(0);
		Assertions.assertEquals(CoreRebecaTypeSystem.INT_TYPE, argument.getType());
	}
	
}
