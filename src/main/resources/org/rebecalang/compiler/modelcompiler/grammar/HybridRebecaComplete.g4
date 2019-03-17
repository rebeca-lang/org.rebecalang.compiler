grammar HybridRebecaComplete;

import HybridRebecaLexer, HybridRebecaParser, CoreRebecaLexer, CoreRebecaParser;

@lexer::header {
	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;
}
    
    