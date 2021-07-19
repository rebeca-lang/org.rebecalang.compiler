parser grammar HybridRebecaParser;

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
      
        LPAREN queueSize = INTLITERAL {if(!$queueSize.getText().equals("<missing INTLITERAL>")) $pcd.setQueueSize(Integer.parseInt($queueSize.text));} RPAREN
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
		|	mgd = msgsrvDeclaration {$pcd.getMsgsrvs().add($mgd.md);}
		|	smd = synchMethodDeclaration {$pcd.getSynchMethods().add($smd.smd);}
		|   md = modeDeclaration {$pcd.getModeDeclarations().add($md.md);}
		)*
        RBRACE {$pcd.setEndLineNumber($RBRACE.getLine());$pcd.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;
modeDeclaration returns[ModeDeclaration md]
	:
	{$md = new ModeDeclaration(); 
	 GuardDeclaration gd = new GuardDeclaration(); $md.setGuardDeclaration(gd);
	 InvariantDeclaration id = new InvariantDeclaration(); $md.setInvariantDeclaration(id);}
	MODE modeName = IDENTIFIER 
	{	$md.setName($modeName.text); 
		$md.setLineNumber($MODE.getLine()); $md.setCharacter($MODE.getCharPositionInLine());
	}
	LBRACE
	INV LPAREN (e = expression {id.setCondition($e.e);}) RPAREN
		b = block {id.setBlock($b.bs);id.setCharacter($INV.getCharPositionInLine());id.setLineNumber($INV.getLine());}
	
	GUARD LPAREN (e2 = expression {gd.setCondition($e2.e);}) RPAREN
		b = block {gd.setBlock($b.bs);gd.setCharacter($GUARD.getCharPositionInLine());gd.setLineNumber($GUARD.getLine());}
	RBRACE
	;
    
    
primary returns [TermPrimary tp]
    :   
    id1 = IDENTIFIER {$tp = new TermPrimary(); $tp.setName($id1.text);
					  $tp.setLineNumber($id1.getLine()); $tp.setCharacter($id1.getCharPositionInLine());}
    (	lp = LPAREN 
    	{TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
    	 psp.setLineNumber($lp.getLine()); psp.setCharacter($lp.getCharPositionInLine());
    	 $tp.setParentSuffixPrimary(psp);}
		(el = expressionList {$tp.getParentSuffixPrimary().getArguments().addAll($el.el);})?
		RPAREN
    	(AFTER LPAREN ef = expression RPAREN {psp.setAfterExpression($ef.e);})?
    	(DEADLINE LPAREN ed = expression RPAREN {psp.setDeadlineExpression($ed.e);})?
    )?
	(LBRACKET e2 = expression RBRACKET {$tp.getIndices().add($e2.e);})* 
	(PRIME 
	  	{if (!($tp instanceof HybridTermPrimary)) $tp = HybridrebecaUtils.transformTermPrimaryToHybridTermPrimary($tp);
	  	 ((HybridTermPrimary)$tp).setDerivativeOrder(((HybridTermPrimary)$tp).getDerivativeOrder() + 1);})*
    ;    
    