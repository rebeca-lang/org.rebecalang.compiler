package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import java.util.ArrayList;

import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableInitializer;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FieldDeclarationStatementSemanticCheck extends AbstractStatementSemanticCheck {

	AbstractTypeSystem typeSystem;

	StatementSemanticCheckContainer statementSemanticCheckContainer;

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	public FieldDeclarationStatementSemanticCheck(AbstractTypeSystem typeSystem,
			StatementSemanticCheckContainer statementSemanticCheckContainer,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		super();
		this.typeSystem = typeSystem;
		this.statementSemanticCheckContainer = statementSemanticCheckContainer;
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}


	@Override
	public void check(Statement statement) throws CompilerInternalErrorRuntimeException {
		Type fieldsType = AbstractTypeSystem.UNKNOWN_TYPE;
		FieldDeclaration fieldDeclaration = (FieldDeclaration) statement;
		try {
			fieldDeclaration.setType(typeSystem.getType(fieldDeclaration.getType()));
			fieldsType = fieldDeclaration.getType();
		} catch (CodeCompilationException e) {
			e.setColumn(fieldDeclaration.getCharacter());
			e.setLine(fieldDeclaration.getLineNumber());
			exceptionContainer.addException(e);
		}
		for (VariableDeclarator vd : fieldDeclaration.getVariableDeclarators()) {
			try {
				Label label = CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE;
				if (scopeHandler.isInScopeOf(CoreRebecaLabelUtility.CONSTRUCTOR) ||
						scopeHandler.isInScopeOf(CoreRebecaLabelUtility.MSGSRV) ||
						scopeHandler.isInScopeOf(CoreRebecaLabelUtility.SYNCH_METHOD))
					label = CoreRebecaLabelUtility.LOCAL_VARIABLE;
				else if (scopeHandler.isInScopeOf(CoreRebecaLabelUtility.REACTIVE_CLASS))
					label = CoreRebecaLabelUtility.STATE_VARIABLE;
				scopeHandler.addVariableToCurrentScope(vd.getVariableName(),
						fieldsType, label, 
						vd.getLineNumber(), vd.getCharacter());
				checkVariableInitializationType(
						fieldsType,
						vd.getVariableInitializer());
			} catch (ScopeException se) {
				se.setColumn(vd.getCharacter());
				se.setLine(vd.getLineNumber());
				exceptionContainer.addException(se);
			} catch (ExceptionContainer ec) {
				exceptionContainer.addAll(ec);
			}
		}
	}
	
	public void checkVariableInitializationType(Type type,
			VariableInitializer variableInitializer) throws ExceptionContainer {
		if (variableInitializer == null)
			return;
		if (variableInitializer instanceof ArrayVariableInitializer) {
			ArrayVariableInitializer original = (ArrayVariableInitializer) variableInitializer;

			if (!(type instanceof ArrayType)) {
				ArrayType temp = TypesUtilities.createDummyType((OrdinaryPrimitiveType) type, original
						.getValues().size());
				TypesUtilities.addTypeMismatchException(exceptionContainer, type, temp, 
						variableInitializer.getCharacter(), variableInitializer.getLineNumber());
				return;
			}

			ArrayType retType = getArrayVariableInitializerType(original);
			variableInitializer.setType(retType);

			if (!retType.canTypeUpCastTo(type)) {
				TypesUtilities.addTypeMismatchException(exceptionContainer, retType, type, 
						variableInitializer.getCharacter(), variableInitializer.getLineNumber());
				return;
			}

		} else if (variableInitializer instanceof OrdinaryVariableInitializer) {
			Type retType = expressionSemanticCheckContainer.check(
							((OrdinaryVariableInitializer) variableInitializer)
									.getValue()).getFirst();
			variableInitializer.setType(retType);
			if (!retType.canTypeUpCastTo(type)) {
				TypesUtilities.addTypeMismatchException(exceptionContainer, retType, type, 
						variableInitializer.getCharacter(), variableInitializer.getLineNumber());
				return;
			}
		} else {
			throw new CompilerInternalErrorRuntimeException(
					"Unknown vairable initializer type " + variableInitializer);
		}
		return;
	}
	
	private ArrayType getArrayVariableInitializerType(ArrayVariableInitializer avi){

		ArrayList<Type> innerTypes = new ArrayList<Type>();
		for (VariableInitializer innerValue : avi.getValues()) {
			Type innerType = null;
			if (innerValue instanceof OrdinaryVariableInitializer) {
				Pair<Type, Object> result = expressionSemanticCheckContainer.check(
						((OrdinaryVariableInitializer) innerValue).getValue());
				if (result.getFirst() instanceof ArrayType) {
					TypesUtilities.addTypeMismatchException(exceptionContainer, 
							result.getFirst(), ((ArrayType) result.getFirst()).getOrdinaryPrimitiveType(), 
							innerValue.getCharacter(), innerValue.getLineNumber());
					return null;
				}
				innerType = result.getFirst();
			} else if (innerValue instanceof ArrayVariableInitializer) {
				innerType = getArrayVariableInitializerType(
						(ArrayVariableInitializer) innerValue);
			} else {
				throw new CompilerInternalErrorRuntimeException("Unknown type "
						+ innerValue);
			}
			innerTypes.add(innerType);
		}
		Type superType = innerTypes.get(0);
		for (int cnt = 1; cnt < innerTypes.size(); cnt++) {
			if (!innerTypes.get(cnt).canTypeUpCastTo(superType)) {
				if (!superType.canTypeUpCastTo(innerTypes.get(cnt))) {
					TypesUtilities.addTypeMismatchException(exceptionContainer, 
							innerTypes.get(cnt), innerTypes.get(0), 
							avi.getCharacter(), avi.getLineNumber());
//							"Type mismatch among elements of array initializer. "
					return null;
				} else {
					superType = innerTypes.get(cnt);
				}
			}
		}

		ArrayType retValue = new ArrayType();
		retValue.getDimensions().add(avi.getValues().size());
		if (superType instanceof ArrayType) {
			retValue.setOrdinaryPrimitiveType(((ArrayType) superType)
					.getOrdinaryPrimitiveType());
			retValue.getDimensions().addAll(
					((ArrayType) superType).getDimensions());
		} else {
			retValue.setOrdinaryPrimitiveType((OrdinaryPrimitiveType) superType);
		}
		return retValue;
	}
}