grammar TimedRebecaPropertyComplete;
    
import TimedRebecaPropertyLexer, TimedRebecaPropertyParser, GeneralPropertyLexer, GeneralPropertyParser, CoreRebecaExpressionLexer;

@lexer::header {
	package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Label;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
}