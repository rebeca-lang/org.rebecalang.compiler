package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RecognitionException;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.ProbabilisticRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.ProbabilisticTimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RebecaModelCompiler {

	@Autowired
	private ExceptionContainer exceptionContainer;
	@Autowired
	protected SymbolTable symbolTable;

	@Autowired
	@Qualifier("CORE_REBECA")
	protected CoreRebecaCompleteCompilerFacade coreRebecaCompilerFacade;

	@Autowired
	@Qualifier("TIMED_REBECA")
	protected TimedRebecaCompleteCompilerFacade timedRebecaCompilerFacade;

	@Autowired
	@Qualifier("PROBABILISTIC_REBECA")
	protected ProbabilisticRebecaCompleteCompilerFacade probabilisticRebecaCompilerFacade;

	@Autowired
	@Qualifier("PROBABILISTIC_TIMED_REBECA")
	protected ProbabilisticTimedRebecaCompleteCompilerFacade probabilisticTimedRebecaCompilerFacade;

	@Autowired
	@Qualifier("HYBRID_REBECA")
	protected HybridRebecaCompleteCompilerFacade hybridRebecaCompilerFacade;

	private AbstractCompilerFacade getAppropriateCompilerFacade(Set<CompilerExtension> extension,
			CoreVersion coreVersion, CharStream input) throws CodeCompilationException {

		if (extension.contains(CompilerExtension.TIMED_REBECA) || extension.contains(CompilerExtension.PROBABILISTIC_REBECA)
				|| extension.contains(CompilerExtension.HYBRID_REBECA)) {
			if (coreVersion == CoreVersion.CORE_2_0)
				throw createFeaturesIncompatibilityMessage(extension, coreVersion);
		}

		if (extension.contains(CompilerExtension.PROBABILISTIC_REBECA)
				&& extension.contains(CompilerExtension.TIMED_REBECA)) {
			return probabilisticTimedRebecaCompilerFacade;
		} else if (extension.contains(CompilerExtension.PROBABILISTIC_REBECA)) {
			return probabilisticRebecaCompilerFacade;
		} else if (extension.contains(CompilerExtension.TIMED_REBECA)) {
			return timedRebecaCompilerFacade;
		} else if (extension.contains(CompilerExtension.HYBRID_REBECA)) {
			return hybridRebecaCompilerFacade;
		} else
			return coreRebecaCompilerFacade;
	}

	public static CodeCompilationException createFeaturesIncompatibilityMessage(Set<CompilerExtension> features,
			CoreVersion coreVersion) {
		String retValue = "Incompatible feature set [";
		for (CompilerExtension feature : features) {
			retValue += feature.name() + ", ";
		}
		return new CodeCompilationException(retValue + coreVersion + "]", 0, 0);
	}

	public Pair<RebecaModel, SymbolTable> compileRebecaFile(File rebecaFile, Set<CompilerExtension> extention,
			CoreVersion coreVersion) {
		return compileRebecaFile(rebecaFile, extention, coreVersion, true);
	}

	public Pair<RebecaModel, SymbolTable> compileRebecaFile(File rebecaFile, Set<CompilerExtension> extention,
			CoreVersion coreVersion, boolean performSemanticCheck) {
		exceptionContainer.clear();

		try {
			CharStream input = CharStreams.fromStream(new FileInputStream(rebecaFile));
			AbstractCompilerFacade compilerFacade = getAppropriateCompilerFacade(extention, coreVersion, input);
			compilerFacade.compile(input, coreVersion);
			if (exceptionContainer.exceptionsIsEmpty() && performSemanticCheck) {
				compilerFacade.semanticCheck();
			}
			return new Pair<RebecaModel, SymbolTable>(compilerFacade.getRebecaModel(), symbolTable);
		} catch (RecognitionException e) {
			exceptionContainer.addException(e);
		} catch (Exception e) {
			if (exceptionContainer.getExceptions().size() == 0)
				exceptionContainer.addException(e);
		}
		return null;
	}

	public void generateXMLFromRebecaFiles(File rebecaFile, File destinationXMLFile, Set<CompilerExtension> features)
			throws ExceptionContainer {
	}

	public ExceptionContainer getExceptionContainer() {
		return exceptionContainer;
	}
}
