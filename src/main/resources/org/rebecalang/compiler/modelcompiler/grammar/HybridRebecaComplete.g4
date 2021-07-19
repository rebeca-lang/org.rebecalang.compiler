grammar HybridRebecaComplete;

import HybridRebecaLexer, HybridRebecaParser, TimedRebecaParser, TimedRebecaLexer, CoreRebecaLexer, CoreRebecaParser;

@lexer::header {
	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridrebecaUtils;
	
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
}
