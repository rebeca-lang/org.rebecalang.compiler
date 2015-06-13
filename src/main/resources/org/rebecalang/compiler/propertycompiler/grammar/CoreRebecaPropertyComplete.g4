grammar CoreRebecaPropertyComplete;
    
import CoreRebecaPropertyLexer, CoreRebecaPropertyParser;

@lexer::header {
	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;
}