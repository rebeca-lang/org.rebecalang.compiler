parser grammar HybridRebecaParser;

//import CoreRebecaParser;

rebecaCode returns [HybridRebecaCode rc]
    :   
    	{$rc = new HybridRebecaCode();}
		(rd = recordDeclaration {$rc.getRecordDeclaration().add($rd.rd);})*
		(e = environmentVariables {$rc.getEnvironmentVariables().addAll($e.fds);})
        (
        	rcd = reactiveClassDeclaration {$rc.getReactiveClassDeclaration().add($rcd.rcd);}
        	|
        	intd = interfaceDeclaration {$rc.getInterfaceDeclaration().add($intd.intd);}
        	|
        	pcd = physicalClassDeclaration {$rc.getPhysicalClassDeclaration().add($pcd.pcd);}
    	)+
        md = mainDeclaration  {$rc.setMainDeclaration($md.md);}
    ;
    
physicalClassDeclaration returns[PhysicalClassDeclaration pcd]
    :   
    	{$pcd = new PhysicalClassDeclaration();}
    	(an = annotation {$pcd.getAnnotations().add($an.an);})*
        PHYSICALCLASS physicalClassName = IDENTIFIER 
        	{	$pcd.setName($physicalClassName.text); 
        		$pcd.setLineNumber($physicalClassName.getLine()); $pcd.setCharacter($physicalClassName.getCharPositionInLine());
        	}
      
        LBRACE

        (KNOWNREBECS
		LBRACE
			(fd = fieldDeclaration {$pcd.getKnownRebecs().add($fd.fd);} SEMI)*
		RBRACE)?

        (STATEVARS
		LBRACE
			(fd = fieldDeclaration {$pcd.getStatevars().add($fd.fd);} SEMI)*
		RBRACE)?

		(	cd = constructorDeclaration {$pcd.getConstructors().add($cd.cd);}
		|	smd = synchMethodDeclaration {$pcd.getSynchMethods().add($smd.smd);}
		|   modeDeclaration
		)*
        RBRACE {$pcd.setEndLineNumber($RBRACE.getLine());$pcd.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;
modeDeclaration 
	:
	MODE IDENTIFIER LBRACE
	INV (expression) LBRACE
		expression*
	RBRACE
	GUARD (expression) LBRACE
		expression*
	RBRACE
	RBRACE
	;
    
primary returns [TermPrimary tp]
    :   
    id1 = IDENTIFIER {$tp = new TermPrimary(); $tp.setName($id1.text);
					  $tp.setLineNumber($id1.getLine()); $tp.setCharacter($id1.getCharPositionInLine());}
    (	lp = LPAREN 
    	{ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
    	 psp.setLineNumber($lp.getLine()); psp.setCharacter($lp.getCharPositionInLine());
    	 $tp.setParentSuffixPrimary(psp);}
		(el = expressionList {$tp.getParentSuffixPrimary().getArguments().addAll($el.el);})?
		RPAREN
    )?
	(LBRACKET e2 = expression RBRACKET {$tp.getIndices().add($e2.e);})* (PRIME)?
    ;    
    