package org.rebecalang.compiler.modelcompiler;

import java.util.HashMap;
import java.util.Stack;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.stereotype.Component;

@Component
public class ScopeHandler {
	
	public final static String RETURN_VALUE_KEY_IN_SCOPE = "$return$";

//	@Autowired
//	AbstractTypeSystem typeSystem;
	
	private Stack<Pair<Label, HashMap<String, VariableInScopeSpecifier>>> scopeStack;

	public ScopeHandler() {
		this.clear();
	}
	
	public void clear() {
		scopeStack = new Stack<Pair<Label, HashMap<String, VariableInScopeSpecifier>>>();
	}
	
	public void pushScopeRecord(Label label){
		scopeStack.push(new Pair<Label, HashMap<String, VariableInScopeSpecifier>>(
				label, new HashMap<String, VariableInScopeSpecifier>()));
	}
	
	public void popScopeRecord() {
		scopeStack.pop();
	}

	public void popScopeRecordToLabel(Label label) {
		Label stackLabel = null; 
		while(stackLabel != label) {
			stackLabel = scopeStack.pop().getFirst();
		}
		
	}


	public void addVariableToCurrentScope(String variableName, Type type, Label label, 
			int lineNumber, int column) throws ScopeException {
		addVariableToCurrentScope(variableName, type, label, null, lineNumber, column);
	}
		
	public void addVariableToCurrentScope(String variableName, Type type, Label label, Object precompilationValue, 
			int lineNumber, int column) throws ScopeException {
		HashMap<String, VariableInScopeSpecifier> ar = 
				scopeStack.peek().getSecond();
		if (!ar.containsKey(variableName)) {
			VariableInScopeSpecifier data;
			data = new VariableInScopeSpecifier(variableName, type, label, precompilationValue, 
					lineNumber, column);
			ar.put(variableName, data);
			return;
		}
		String exceptionMessage;
		VariableInScopeSpecifier variableInfo = retreiveVariableFromScope(variableName);
		if (variableInfo.getLabel() == CoreRebecaLabelUtility.RESERVED_WORD) {
			exceptionMessage = variableName + " is a reserved word";
		} else {
			exceptionMessage = "Redeclaration of \""
					+ type.getTypeName() + " " + variableName
					+ "\", it has already been declared in line "
					+ variableInfo.getLineNumber() + " column "
					+ variableInfo.getColumn();
		}
		throw new ScopeException(exceptionMessage, lineNumber, column);
	}

	public VariableInScopeSpecifier retreiveVariableFromScope(
			String variableName) throws ScopeException {
		for (int cnt = scopeStack.size() - 1; cnt >= 0; cnt--) {
			HashMap<String, VariableInScopeSpecifier> ar = scopeStack
					.get(cnt).getSecond();
			if (ar.containsKey(variableName))
				return ar.get(variableName);
		}
		throw new ScopeException("\"" + variableName + "\" undeclared", 0, 0);
	}


	public boolean isInScopeOf(Label label) {
		for (Pair<Label, HashMap<String, VariableInScopeSpecifier>> ar : scopeStack) {
			if (ar.getFirst() == label)
				return true;
		}
		return false;
	}
		
	public class VariableInScopeSpecifier {
		private String name;
		private Type type;
		private Label label;
		private Object precompilationValue;
		private int lineNumber;
		private int column;
		
		
		public VariableInScopeSpecifier(String name, Type type, Label label,
				Object precompilationValue, int lineNumber, int column) {
			super();
			this.name = name;
			this.type = type;
			this.label = label;
			this.precompilationValue = precompilationValue;
			this.lineNumber = lineNumber;
			this.column = column;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Label getLabel() {
			return label;
		}
		public void setLabel(Label label) {
			this.label = label;
		}
		public Object getPrecompilationValue() {
			return precompilationValue;
		}
		public void setPrecompilationValue(Object precompilationValue) {
			this.precompilationValue = precompilationValue;
		}
		public int getLineNumber() {
			return lineNumber;
		}
		public void setLineNumber(int lineNumber) {
			this.lineNumber = lineNumber;
		}
		public int getColumn() {
			return column;
		}
		public void setColumn(int column) {
			this.column = column;
		}
		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
		
		
	}

	public void updateVaribaleInCurrentScope(String variableName, Type type,
			Label label, int lineNumber, int column) {
		VariableInScopeSpecifier info = null;
		try {
			info = retreiveVariableFromScope(variableName);
			info.setColumn(column);
			info.setLineNumber(lineNumber);
			info.setLabel(label);
			info.setType(type);
		} catch (ScopeException se) {
			se.printStackTrace();
		}
	}

	public VariableInScopeSpecifier removeVariable(String variableName) throws ScopeException {
		for (int cnt = scopeStack.size() - 1; cnt >= 0; cnt--) {
			HashMap<String, VariableInScopeSpecifier> ar = scopeStack
					.get(cnt).getSecond();
			if (ar.containsKey(variableName))
				return ar.remove(variableName);
		}
		throw new ScopeException("\"" + variableName + "\" undeclared", 0, 0);
	}

}
