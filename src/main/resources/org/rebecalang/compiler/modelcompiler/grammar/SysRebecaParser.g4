parser grammar SysRebecaParser;

import CoreRebecaParser;

@parser::header {
	package org.rebecalang.compiler.compiler;
	
	import org.rebecalang.compiler.rebecaobjectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.compiler.TypesUtilities;
}

rebecaCode returns [RebecaCode rc]
    :   
    	{$rc = new RebecaCode();}
		(rd = recordDeclaration {$rc.getRecordDeclaration().add($rd.rd);})*
		(g = globalVariables {$rc.getGlobalVariables().addAll($g.fds);})?
		(e = environmentVariables {$rc.getEnvironmentVariables().addAll($e.fds);})
        (rcd = reactiveClassDeclaration {$rc.getReactiveClassDeclaration().add($rcd.rcd);})+
        md = mainDeclaration  {$rc.setMainDeclaration($md.md);}
    ;

/////////////////////////global variables for systemC
globalVariables returns [List<FieldDeclaration> fds]
	:	
		GLOBALVARIABLES
	/*
		'globalvariables' LBRACE
		{$g = new GlobalVariables();
		$g.setLineNumber($LBRACE.getLine());
		$g.setCharacter($LBRACE.getCharPositionInLine());
        }
		(l = localVariableDeclaration SEMI {$g.getLocalVariableDeclaration().add($l.l);})*
		RBRACE
		*/
	;

///////////////////////////
type returns [Type t]
	:
		{$t = new PrimitiveType();}
		(
			typeName = IDENTIFIER
			{$t = new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)$t).setName($typeName.text);
		 	 $t.setLineNumber($typeName.getLine());$t.setCharacter($typeName.getCharPositionInLine());}
		|	BITINT LT size = INTLITERAL GT 
			{$t = new BitIntType();((BitIntType)$t).setBitIntSize(Integer.parseInt($size.text));
		 	 $t.setLineNumber($size.getLine());$t.setCharacter($size.getCharPositionInLine());}
		)
		(ds = dimensions {PrimitiveType newpt = (PrimitiveType)$t; $t = new ArrayType(); ((ArrayType)$t).setPrimitiveType(newpt);
			((ArrayType)$t).getDimensions().addAll($ds.ds);})?
	;

    