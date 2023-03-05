package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Annotation;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractCompilerFacade {

	@Autowired	
	protected ExceptionContainer exceptionContainer;
	@Autowired	
	protected ScopeHandler scopeHandler;
	@Autowired	
	protected SymbolTable symbolTable;
	
	protected TypeSystemInitializer typeSystemInitializer;
	
	protected SymbolTableInitializer symbolTableInitializer;
	
	protected RebecaModel rebecaModel;
	
	protected CoreVersion coreVersion;

	public abstract Parser getParser(CharStream input);
	
	@Autowired
	public AbstractCompilerFacade(TypeSystemInitializer typeSystemInitializer, SymbolTableInitializer symbolTableInitializer) {
		this.typeSystemInitializer = typeSystemInitializer;
		this.symbolTableInitializer = symbolTableInitializer;
	}
	/**
	 * Semantic check of each type Rebeca model should be implemented by the
	 * corresponding derived class.
	 * 
	 * @param features
	 *            The features which the semantic check should be done under its
	 *            content assumptions.
	 * @throws ExceptionContainer Collection of semantic exceptions and warnings.
	 */
	public void semanticCheck() {
		scopeHandler.clear();
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.RESERVED_WORD);
		addVariablesOfRebecaExtensionToScope();
	}

	/**
	 * This method should be implemented by the derived classes to show that how
	 * a RebecaModel should be extracted from a parser.
	 * @param input 
	 * 
	 * @param parser
	 *            The parser that the compiles a Rebeca file and generates its
	 *            corresponding RebecaModel object
	 * @return The generated RebecaModel
	 */
	
	public final void compile(CharStream input, CoreVersion coreVersion) {
		this.coreVersion = coreVersion;
		
		try {
			Parser parser = getParser(input);
			parser.removeErrorListeners();
			parser.addErrorListener(new BaseErrorListener() {
				@Override
				public void syntaxError(Recognizer<?, ?> recognizer,
						Object offendingSymbol, int line, int charPositionInLine,
						String msg, RecognitionException e) {
					exceptionContainer.addException(new CodeCompilationException(msg, line,
							charPositionInLine));
				}
			});

			//Method "parser.rebecaModel()" is called
			Method method = parser.getClass().getDeclaredMethod("rebecaModel", new Class[0]);
			Object rebecaModelObj = method.invoke(parser);

			//The result of calling the above method contains the Rebeca model which is stored in variable "r"
			Field field = rebecaModelObj.getClass().getDeclaredField("r");
			this.rebecaModel = (RebecaModel)field.get(rebecaModelObj);
			
			typeSystemInitializer.fillTypeSystem(rebecaModel);
			
			symbolTableInitializer.fillSymbolTable(rebecaModel, coreVersion);
			
			addMethodsOfRebecaExtensionToSymbolTable();
			
			initializeStatementSemanticCheckContainer();

			initializeExpressionSemanticCheckContainer();
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
			throw new RuntimeException("Illegal Rebeca parser class ");
		}
	}

	protected abstract void initializeStatementSemanticCheckContainer();

	protected abstract void initializeExpressionSemanticCheckContainer();

	protected abstract void addMethodsOfRebecaExtensionToSymbolTable();

	protected abstract void addVariablesOfRebecaExtensionToScope();
	
	protected boolean annotationIsSatisfied(List<Annotation> annotations) {
		if(annotations == null)
			return true;
		if(annotations.isEmpty())
			return true;
		return true;
	}

	public RebecaModel getRebecaModel() {
		return rebecaModel;
	}

}