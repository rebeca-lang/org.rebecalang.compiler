package org.rebecalang.compiler.modelcompiler;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.TypesUtilities;

public abstract class AbstractCompilerFacade {

	protected Parser parser;
	protected ExceptionContainer exceptionContainer;
	protected RebecaModel rebecaModel;
	protected Set<CompilerFeature> compilerFeatures;
	protected ScopeHandler scopeHandler;
	protected SymbolTable symbolTable;

	public AbstractCompilerFacade(Class<? extends Parser> parserClass,
			CommonTokenStream tokens, Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		try {
			this.exceptionContainer = exceptionContainer;
			this.compilerFeatures = features;
			Constructor<? extends Parser> constructor = parserClass
					.getConstructor(TokenStream.class);
			parser = constructor.newInstance(tokens);
		} catch (InstantiationException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (IllegalAccessException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (SecurityException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (NoSuchMethodException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (IllegalArgumentException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (InvocationTargetException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		}
		parser.removeErrorListeners();
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer,
					Object offendingSymbol, int line, int charPositionInLine,
					String msg, RecognitionException e) {
				AbstractCompilerFacade.this.exceptionContainer.addException(new CodeCompilationException(msg, line,
						charPositionInLine));
			}
		});
		if (exceptionContainer == null)
			this.exceptionContainer = new ExceptionContainer();
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
	public abstract void semanticCheck(Set<CompilerFeature> features);

	/**
	 * This method should be implemented by the derived classes to show that how
	 * a RebecaModel should be extracted from a parser.
	 * 
	 * @param parser
	 *            The parser that the compiles a Rebeca file and generates its
	 *            corresponding RebecaModel object
	 * @return The generated RebecaModel
	 */
	protected final void compile() {
		try {
			//Method "parser.rebecaModel()" is called
			Method method = parser.getClass().getDeclaredMethod("rebecaModel", new Class[0]);
			Object rebecaModelObj = method.invoke(parser);

			//The result of calling the above method contains the Rebeca model which is stored in variable "r"
			Field field = rebecaModelObj.getClass().getDeclaredField("r");
			rebecaModel = (RebecaModel)field.get(rebecaModelObj);
			for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode().getReactiveClassDeclaration())
				TypesUtilities.getInstance().addReactiveClassType(rcd);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
			throw new RuntimeException("Illegal Rebeca parser class ");
		}
	}
	
	public RebecaModel getRebecaModel() {
		return rebecaModel;
	}
	
	public SymbolTable getSymbolTable() {
		return symbolTable;
	}
}