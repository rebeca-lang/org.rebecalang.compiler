package org.rebecalang.compiler.propertycompiler;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RecognitionException;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.propertycompiler.corerebeca.CoreRebecaPropertyCompiler;
import org.rebecalang.compiler.propertycompiler.generalrebeca.GeneralPropertyCompiler;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.propertycompiler.timedrebeca.TimedRebecaPropertyCompiler;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PropertyCompiler {

	@Autowired
	private ExceptionContainer exceptionContainer;
	@Autowired	
	protected SymbolTable symbolTable;
	
	@Autowired
	@Qualifier("CORE_REBECA")
	protected CoreRebecaPropertyCompiler coreRebecaPropertyCompiler;

	@Autowired
	@Qualifier("TIMED_REBECA")
	protected TimedRebecaPropertyCompiler timedRebecaPropertyCompiler;

	private GeneralPropertyCompiler getAppropriatePropertyCompilerFacade(
			Set<CompilerExtension> extension, CharStream input)
			throws CodeCompilationException {
		
		if (extension.contains(CompilerExtension.TIMED_REBECA)) {
			return timedRebecaPropertyCompiler;
		} else
			return coreRebecaPropertyCompiler; 
	}

	public PropertyModel compilePropertyFile(File propertyFile, RebecaModel rebecaModel,
			Set<CompilerExtension> extention) {
		return compilePropertyFile (propertyFile, rebecaModel, extention, true);
	}
	
	public PropertyModel compilePropertyFile(File propertyFile, RebecaModel rebecaModel,
			Set<CompilerExtension> extention, boolean performSemanticCheck) {
		exceptionContainer.clear();

		try {
			CharStream input = CharStreams.fromStream(new FileInputStream(propertyFile));
			GeneralPropertyCompiler propertyCompiler = getAppropriatePropertyCompilerFacade(extention, input);
			propertyCompiler.compile(input, rebecaModel);
			if (exceptionContainer.exceptionsIsEmpty() && performSemanticCheck) {
				propertyCompiler.semanticCheck();
			}
			return propertyCompiler.getPropertyModel();
		} catch (RecognitionException e) {
			exceptionContainer.addException(e);
		} catch (Exception e) {
			if (exceptionContainer.getExceptions().size() == 0)
				exceptionContainer.addException(e);
		}
		return null;
	}
}