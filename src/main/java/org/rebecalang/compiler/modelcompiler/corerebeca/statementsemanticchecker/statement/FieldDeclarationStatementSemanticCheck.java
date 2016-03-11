package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import java.util.ArrayList;

import org.rebecalang.compiler.modelcompiler.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableInitializer;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class FieldDeclarationStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Override
	public void check(Statement statement) throws CompilerInternalErrorRuntimeException {
		FieldDeclaration fieldDeclaration = (FieldDeclaration) statement;
		try {
			fieldDeclaration.setType(TypesUtilities.getInstance().getType(fieldDeclaration.getType()));
		} catch (CodeCompilationException e) {
			e.printStackTrace();
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
				scopeHandler.addVaribaleToCurrentScope(vd.getVariableName(),
						fieldDeclaration.getType(), label, 
						vd.getLineNumber(), vd.getCharacter());
				checkVariableInitializationType(
						fieldDeclaration.getType(),
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
				ArrayType temp = TypesUtilities.createDummyType((PrimitiveType) type, original
						.getValues().size());
				CodeCompilationException typeMismatchException = TypesUtilities.getTypeMismatchException(
						type, temp);
				typeMismatchException.setColumn(variableInitializer
						.getCharacter());
				typeMismatchException.setLine(variableInitializer
						.getLineNumber());
				exceptionContainer.addException(typeMismatchException);
				return;
			}

			ArrayType retType = getArrayVariableInitializerType(original);
			variableInitializer.setType(retType);

			if (!TypesUtilities.getInstance().canTypeUpCastTo(retType, type)) {
				CodeCompilationException cce = TypesUtilities.getTypeMismatchException(
						retType, type);
				cce.setColumn(variableInitializer.getCharacter());
				cce.setLine(variableInitializer.getLineNumber());
				exceptionContainer.addException(cce);
				return;
			}

		} else if (variableInitializer instanceof OrdinaryVariableInitializer) {
			Type retType = expressionSemanticCheckContainer.check(
							((OrdinaryVariableInitializer) variableInitializer)
									.getValue()).getFirst();
			variableInitializer.setType(retType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(retType, type)) {
				CodeCompilationException cce = TypesUtilities.getTypeMismatchException(
						retType, type);
				cce.setColumn(variableInitializer.getCharacter());
				cce.setLine(variableInitializer.getLineNumber());
				exceptionContainer.addException(cce);
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
					exceptionContainer
							.addException(TypesUtilities.getTypeMismatchException(result
									.getFirst(),
									((ArrayType) result.getFirst())
											.getPrimitiveType()));
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
			if (!TypesUtilities.getInstance().canTypeUpCastTo(innerTypes.get(cnt), superType)) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(superType, innerTypes.get(cnt))) {
					CodeCompilationException cce = TypesUtilities.getTypeMismatchException(
							innerTypes.get(cnt), innerTypes.get(0));
					cce.setLine(avi.getLineNumber());
					cce.setColumn(avi.getCharacter());
					exceptionContainer.addException(new CodeCompilationException(
							"Type mismatch among elements of array initializer. "
									+ cce.getMessage(), cce.getLine(), cce
									.getColumn()));
					return null;
				} else {
					superType = innerTypes.get(cnt);
				}
			}
		}

		ArrayType retValue = new ArrayType();
		retValue.getDimensions().add(avi.getValues().size());
		if (superType instanceof ArrayType) {
			retValue.setPrimitiveType(((ArrayType) superType)
					.getPrimitiveType());
			retValue.getDimensions().addAll(
					((ArrayType) superType).getDimensions());
		} else {
			retValue.setPrimitiveType((PrimitiveType) superType);
		}
		return retValue;
	}
}