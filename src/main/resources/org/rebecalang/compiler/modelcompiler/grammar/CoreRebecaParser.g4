parser grammar RebecaParser;

import CoreRebecaExpressionParser;

rebecaModel returns [RebecaModel r]
    :   {$r = new RebecaModel();
        } 
        (p = packageDeclaration {$r.setPackageDeclaration($p.p);}
        )?
        (i = importDeclaration {$r.getImportDeclaration().add($i.i);}
        )*
        (t1 = rebecaCode {$r.setRebecaCode($t1.rc);}
        )
    ;

packageDeclaration returns [PackageDeclaration p]
    :   
    	PACKAGE
    	/*{$p = new PackageDeclaration();}
        'package' id1 = IDENTIFIER {$p.setPath($id1.text);$p.setLineNumber($id1.getLine());$p.setCharacter($id1.getCharPositionInLine());}
        (DOT id2 = IDENTIFIER  {$p.setPath($p.getPath()+"."+$id2.text);}
        )* 
        SEMI
        */
    ;

importDeclaration returns [ImportDeclaration i]
    :   
    	IMPORT
    	/*
    	{$i = new ImportDeclaration();}
        'import'
        id = IDENTIFIER DOT '*' {$i.setPath($id.text+".*");$i.setLineNumber($id.getLine());$i.setCharacter($id.getCharPositionInLine());}
        SEMI
    |   {$i = new ImportDeclaration();}
        'import'
        id1 = IDENTIFIER  {$i.setPath($id1.text);$i.setLineNumber($id.getLine());$i.setCharacter($id.getCharPositionInLine());}
        (DOT id2 = IDENTIFIER  {$i.setPath($i.getPath()+"."+$id2.text);}
        )+
        (DOT '*' {$i.setPath($i.getPath()+".*");}
        )?
        SEMI
        */
    ;

rebecaCode returns [RebecaCode rc]
    :   
    	{$rc = new RebecaCode();}
		(rd = recordDeclaration {$rc.getRecordDeclaration().add($rd.rd);})*
		(e = environmentVariables {$rc.getEnvironmentVariables().addAll($e.fds);})
        (
        	rcd = reactiveClassDeclaration {$rc.getReactiveClassDeclaration().add($rcd.rcd);}
        	|
        	intd = interfaceDeclaration {$rc.getInterfaceDeclaration().add($intd.intd);}
    	)+
        md = mainDeclaration  {$rc.setMainDeclaration($md.md);}
    ;

/////////////////////////record
recordDeclaration returns [RecordDeclaration rd]
	:
		RECORD
/*		'record' id = IDENTIFIER LBRACE
		{$r = new RecordDeclaration();
		$r.setName($id.text);
		$r.setLineNumber($LBRACE.getLine());
		$r.setCharacter($LBRACE.getCharPositionInLine());
		}
		(rc = recordContent  SEMI
		{$r.getRecordContent().add($rc.r);})*
		RBRACE
	;
	
recordContent returns [RecordContent r]
	:
		 t = type id = IDENTIFIER
		{$r = new RecordContent();
		$r.setType($t.t); $r.setName($id.text);
		$r.setLineNumber($id.getLine()); $r.setCharacter($id.getCharPositionInLine());}
		(COMMA id2 = IDENTIFIER{$r.setName($r.getName()+","+$id2.text);})*
*/		
	;
	

/////////////////////////
mainDeclaration returns [MainDeclaration md]
	: 	
		{$md = new MainDeclaration();}
		MAIN {$md.setLineNumber($MAIN.getLine());$md.setCharacter($MAIN.getCharPositionInLine());}
		LBRACE
		(mrd = mainRebecDefinition{$md.getMainRebecDefinition().add($mrd.mrd);})*
		RBRACE {$md.setEndLineNumber($RBRACE.getLine());$md.setEndCharacter($RBRACE.getCharPositionInLine());}
	;

mainRebecDefinition returns [MainRebecDefinition mrd]
	:	
		{$mrd = new MainRebecDefinition();}
		t = type rebecName = IDENTIFIER {$mrd.setType($t.t);$mrd.setName($rebecName.text);
			$mrd.setLineNumber($rebecName.getLine()); $mrd.setCharacter($rebecName.getCharPositionInLine());}
		LPAREN (el = expressionList {$mrd.getBindings().addAll($el.el);})? RPAREN 
		COLON
		LPAREN (el = expressionList {$mrd.getArguments().addAll($el.el);})? RPAREN 
		SEMI
	;

////////////////////////////// 
environmentVariables returns [List<FieldDeclaration> fds]
	: 	
		{$fds = new ArrayList<FieldDeclaration>();}
		(ENV fd = fieldDeclaration {$fds.add($fd.fd);} SEMI)*
	;

////////////////////////////// 
fieldDeclaration returns [FieldDeclaration fd]
    :   
    	{$fd = new FieldDeclaration();}
    	(an = annotation {$fd.getAnnotations().add($an.an);})*
    	t = type vds = variableDeclarators {$fd.setType($t.t); $fd.getVariableDeclarators().addAll($vds.vds);
    		$fd.setCharacter($t.t.getCharacter()); $fd.setLineNumber($t.t.getLineNumber());}
    ;
variableDeclarators returns [List<VariableDeclarator> vds]
    :   
    	{$vds = new LinkedList<VariableDeclarator>();}
    	vd = variableDeclarator {$vds.add($vd.vd);} (COMMA vd = variableDeclarator {$vds.add($vd.vd);})*
    ;

variableDeclarator returns [VariableDeclarator vd]
    :   
    	{$vd = new VariableDeclarator();}
    	name = IDENTIFIER {$vd.setVariableName($name.text); $vd.setLineNumber($name.getLine());$vd.setCharacter($name.getCharPositionInLine());} 
    	(EQ vi = variableInitializer {$vd.setVariableInitializer($vi.vi);})?
    ;

variableInitializer returns [VariableInitializer vi]
    :   
    	ai = arrayInitializer {$vi = $ai.avi;}
    |   e = expression {if($e.e != null) {
    						$vi = new OrdinaryVariableInitializer();
    						((OrdinaryVariableInitializer)$vi).setValue($e.e);
    						$vi.setLineNumber($e.e.getLineNumber());
    						$vi.setCharacter($e.e.getCharacter());
    					}
    					}
    ;

arrayInitializer returns [ArrayVariableInitializer avi]
    :   
    	{$avi = new ArrayVariableInitializer();}
    	LBRACE (vi = variableInitializer 
    		{$avi.setCharacter($LBRACE.getCharPositionInLine()); $avi.setLineNumber($LBRACE.getLine());
    		$avi.getValues().add($vi.vi);} 
    		(COMMA vi = variableInitializer {$avi.getValues().add($vi.vi);})* )? 
    	RBRACE
    ;

/////////////////////////////////////	
interfaceDeclaration returns[InterfaceDeclaration intd]
    :   
    	{$intd = new InterfaceDeclaration();}
    	(an = annotation {$intd.getAnnotations().add($an.an);})*
        INTERFACE interfaceName = IDENTIFIER 
        	{	$intd.setName($interfaceName.text); 
        		$intd.setLineNumber($interfaceName.getLine()); $intd.setCharacter($interfaceName.getCharPositionInLine());
        	}
        (EXTENDS extendingInterfaceName = IDENTIFIER
        	{
        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
        		opt.setName($extendingInterfaceName.text);
        		opt.setLineNumber($extendingInterfaceName.getLine());
        		opt.setCharacter($extendingInterfaceName.getCharPositionInLine());
        		$intd.getExtends().add(opt);
        	}
        	(COMMA extendingInterfaceName = IDENTIFIER
        		{
	        		opt = new OrdinaryPrimitiveType();
	        		opt.setName($extendingInterfaceName.text);
	        		opt.setLineNumber($extendingInterfaceName.getLine());
	        		opt.setCharacter($extendingInterfaceName.getCharPositionInLine());
	        		$intd.getExtends().add(opt);
        		}
        	)* )?
        LBRACE

		( {MethodDeclaration md;}
			(
				MSGSRV {md = new MsgsrvDeclaration(); md.setAbstract(true); $intd.getMsgsrvs().add((MsgsrvDeclaration)md);} 
			)
			name = IDENTIFIER {md.setName($name.text); md.setLineNumber($name.getLine());md.setCharacter($name.getCharPositionInLine());}
			fps = formalParameters {md.getFormalParameters().addAll($fps.fps);} SEMI
		)*
        RBRACE {$intd.setEndLineNumber($RBRACE.getLine());$intd.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;
    
reactiveClassDeclaration returns[ReactiveClassDeclaration rcd]
    :   
    	{$rcd = new ReactiveClassDeclaration();}
    	(an = annotation {$rcd.getAnnotations().add($an.an);})*
        (ABSTRACT {$rcd.setAbstract(true);})? REACTIVECLASS reactiveClassName = IDENTIFIER 
        	{	$rcd.setName($reactiveClassName.text); 
        		$rcd.setLineNumber($reactiveClassName.getLine()); $rcd.setCharacter($reactiveClassName.getCharPositionInLine());
        	}
        (EXTENDS extendingReactiveClassName = IDENTIFIER 
        	{
        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
        		opt.setName($extendingReactiveClassName.text);
        		opt.setLineNumber($extendingReactiveClassName.getLine());
        		opt.setCharacter($extendingReactiveClassName.getCharPositionInLine());
        		$rcd.setExtends(opt);
        	}
        )?
        (IMPLEMENTS implementingInterfaceName = IDENTIFIER
        	{
        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
        		opt.setName($implementingInterfaceName.text);
        		opt.setLineNumber($implementingInterfaceName.getLine());
        		opt.setCharacter($implementingInterfaceName.getCharPositionInLine());
        		$rcd.getImplements().add(opt);
        	}
        	(COMMA implementingInterfaceName = IDENTIFIER
        		{
	        		opt = new OrdinaryPrimitiveType();
	        		opt.setName($implementingInterfaceName.text);
	        		opt.setLineNumber($implementingInterfaceName.getLine());
	        		opt.setCharacter($implementingInterfaceName.getCharPositionInLine());
	        		$rcd.getImplements().add(opt);
        		}
        	)* )?
        LPAREN queueSize = INTLITERAL {if(!$queueSize.getText().equals("<missing INTLITERAL>")) $rcd.setQueueSize(Integer.parseInt($queueSize.text));} RPAREN
        LBRACE

        (KNOWNREBECS
		LBRACE
			(fd = fieldDeclaration {$rcd.getKnownRebecs().add($fd.fd);} SEMI)*
		RBRACE)?

        (STATEVARS
		LBRACE
			(fd = fieldDeclaration {$rcd.getStatevars().add($fd.fd);} SEMI)*
		RBRACE)?

		(	cd = constructorDeclaration {$rcd.getConstructors().add($cd.cd);}
		|	md = msgsrvDeclaration {$rcd.getMsgsrvs().add($md.md);}
		|	smd = synchMethodDeclaration {$rcd.getSynchMethods().add($smd.smd);}
		)*
        RBRACE {$rcd.setEndLineNumber($RBRACE.getLine());$rcd.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;
	
//////////////////////////////////
methodDeclaration [MethodDeclaration md]
	:
		name = IDENTIFIER {$md.setName($name.text); $md.setLineNumber($name.getLine());$md.setCharacter($name.getCharPositionInLine());}
		fps = formalParameters {$md.getFormalParameters().addAll($fps.fps);}
		(
			b = block {$md.setBlock($b.bs);$md.setEndLineNumber($b.bs.getEndLineNumber());$md.setEndCharacter($b.bs.getEndCharacter());}
			|
			SEMI
		)
	;

constructorDeclaration returns [ConstructorDeclaration cd]
	:
		{$cd = new ConstructorDeclaration();}
		methodDeclaration[{$cd}]
	;
	
	
msgsrvDeclaration returns [MsgsrvDeclaration md]
    :
		{$md = new MsgsrvDeclaration();}
		(ABSTRACT {$md.setAbstract(true);})? MSGSRV
		methodDeclaration[{$md}]
	;
	
synchMethodDeclaration returns [SynchMethodDeclaration smd]
	:
        {$smd = new SynchMethodDeclaration();}
        (ABSTRACT {$smd.setAbstract(true);})? t = type {$smd.setReturnType($t.t);}
		methodDeclaration[{$smd}]
	;

formalParameters returns [List<FormalParameterDeclaration> fps]
    :   
    	{$fps = new ArrayList<FormalParameterDeclaration>();}
    	LPAREN
        (fpds = formalParametersDeclaration {$fps.addAll($fpds.fpds);})?
        RPAREN
    ;

formalParametersDeclaration returns [List<FormalParameterDeclaration> fpds]
    :	
    	{$fpds = new ArrayList<FormalParameterDeclaration>();}
        fpd = formalParameterDeclaration {$fpds.add($fpd.fpd);}
        (COMMA fpd = formalParameterDeclaration {$fpds.add($fpd.fpd);})*
    ;

formalParameterDeclaration returns [FormalParameterDeclaration fpd]
    :   
    	t = type name = IDENTIFIER
        {
            $fpd = new FormalParameterDeclaration();
			$fpd.setLineNumber($name.getLine());
			$fpd.setCharacter($name.getCharPositionInLine());
            $fpd.setName($name.text);
            $fpd.setType($t.t);
        }
    ;

///////////////////////

block returns [BlockStatement bs]
    :   {$bs = new BlockStatement();}
        LBRACE {$bs.setLineNumber($LBRACE.getLine());$bs.setCharacter($LBRACE.getCharPositionInLine());}
        (s = statement {$bs.getStatements().add ($s.s);})*
        RBRACE {$bs.setEndLineNumber($RBRACE.getLine());$bs.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;

statement returns [Statement s]
	:
		fd = fieldDeclaration {$s = $fd.fd;} SEMI
    |	b = block {$s = $b.bs;}
    |   IF {$s = new ConditionalStatement(); $s.setLineNumber($IF.getLine());$s.setCharacter($IF.getCharPositionInLine());}
    	LPAREN e = expression RPAREN st = statement
    	{((ConditionalStatement)$s).setCondition($e.e); ((ConditionalStatement)$s).setStatement($st.s);}
		(ELSE est = statement {((ConditionalStatement)$s).setElseStatement($est.s);})?
    |   WHILE {$s = new WhileStatement(); $s.setLineNumber($WHILE.getLine());$s.setCharacter($WHILE.getCharPositionInLine());} 
    	LPAREN e = expression RPAREN st = statement {((WhileStatement)$s).setCondition($e.e); ((WhileStatement)$s).setStatement($st.s);}
    |   FOR {$s = new ForStatement(); $s.setLineNumber($FOR.getLine());$s.setCharacter($FOR.getCharPositionInLine());} 
    	LPAREN (fi = forInit {((ForStatement)$s).setForInitializer($fi.fi);})? SEMI 
    	(e = expression {((ForStatement)$s).setCondition($e.e);})? SEMI 
    	(el = expressionList {((ForStatement)$s).getForIncrement().addAll($el.el); })? 
    	RPAREN st = statement {((ForStatement)$s).setStatement($st.s);}
    |   SWITCH LPAREN e = expression RPAREN LBRACE sb = switchBlock RBRACE
    	{$s = $sb.ss; ((SwitchStatement)$s).setExpression($e.e); $s.setLineNumber($SWITCH.getLine()); $s.setCharacter($SWITCH.getCharPositionInLine());}
    |   RETURN e = expression? SEMI
    	{$s = new ReturnStatement(); ((ReturnStatement)$s).setExpression($e.e); $s.setLineNumber($RETURN.getLine());$s.setCharacter($RETURN.getCharPositionInLine());}
    |   BREAK SEMI
    	{$s = new BreakStatement(); $s.setLineNumber($BREAK.getLine());$s.setCharacter($BREAK.getCharPositionInLine());}
    |   CONTINUE SEMI
    	{$s = new BreakStatement(); $s.setLineNumber($CONTINUE.getLine());$s.setCharacter($CONTINUE.getCharPositionInLine());}
    |   SEMI {$s = new Statement();}
    |   se = statementExpression {$s = $se.se;} SEMI
	;

forInit returns [ForInitializer fi]
    :   
		fd = fieldDeclaration {$fi = new ForInitializer(); $fi.setFieldDeclaration($fd.fd); }
    |   el = expressionList {$fi = new ForInitializer(); $fi.getExpressions().addAll($el.el);}
    ;

switchBlock returns [SwitchStatement ss]
    :   
    	{$ss = new SwitchStatement();}
    	(
    		{$ss.getSwitchStatementGroups().add(new SwitchStatementGroup());}
    		(
    			CASE e = expression {
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setExpression($e.e);
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setLineNumber($e.e.getLineNumber());
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setCharacter($e.e.getCharacter());
    			}  
    		|
    			DEFAULT
    			{
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setLineNumber($DEFAULT.getCharPositionInLine());
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setCharacter($DEFAULT.getLine());
    			}
    		)
    		COLON
			(st = statement {$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).getStatements().add($st.s);})*
		)*
    ;

statementExpression returns [Statement se]
	:
		e = expression {$se = $e.e;}
	;
