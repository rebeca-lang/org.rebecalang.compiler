parser grammar RebecaParser;

import CoreRebecaExpressionParser;

rebecaModel returns [RebecaModel r]
    :   (packageDeclaration)?
        (importDeclaration)*
        rebecaCode
    ;

packageDeclaration returns [PackageDeclaration p]
    :   PACKAGE
    ;

importDeclaration returns [ImportDeclaration i]
    :   IMPORT
    ;

rebecaCode returns [RebecaCode rc]
    :
		(recordDeclaration)*
		((ENV fieldDeclaration SEMI) | (FEATUREVAR IDENTIFIER SEMI))*
        (reactiveClassDeclaration | interfaceDeclaration)+
        mainDeclaration
    ;

/////////////////////////record
recordDeclaration returns [RecordDeclaration rd]
	:   RECORD
	

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
    	(an = annotation {$mrd.getAnnotations().add($an.an);})*
		t = type rebecName = IDENTIFIER {$mrd.setType($t.t);$mrd.setName($rebecName.text);
			$mrd.setLineNumber($rebecName.getLine()); $mrd.setCharacter($rebecName.getCharPositionInLine());}
		LPAREN (el = expressionList {$mrd.getBindings().addAll($el.el);})? RPAREN 
		COLON
		LPAREN (el = expressionList {$mrd.getArguments().addAll($el.el);})? RPAREN 
		SEMI
	;

////////////////////////////// 
fieldDeclaration returns [FieldDeclaration fd]
    :   (annotation)* type variableDeclarators
    ;

variableDeclarators returns [List<VariableDeclarator> vds]
    :   variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator returns [VariableDeclarator vd]
    :   IDENTIFIER (EQ variableInitializer)?
    ;

variableInitializer returns [VariableInitializer vi]
    :   arrayInitializer | expression
    ;

arrayInitializer returns [ArrayVariableInitializer avi]
    :   LBRACE (variableInitializer (COMMA variableInitializer)* )? RBRACE
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

		( {MethodDeclaration md = new MsgsrvDeclaration();md.setAbstract(true); $intd.getMsgsrvs().add((MsgsrvDeclaration)md);}
			(an = annotation {md.getAnnotations().add($an.an);})*
			MSGSRV name = IDENTIFIER {md.setName($name.text); md.setLineNumber($name.getLine());md.setCharacter($name.getCharPositionInLine());}
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

        (
        	(KNOWNREBECS
			LBRACE
				(fd = fieldDeclaration {$rcd.getKnownRebecs().add($fd.fd);} SEMI)*
			RBRACE)
		|
        	(STATEVARS
			LBRACE
				(fd = fieldDeclaration {$rcd.getStatevars().add($fd.fd);} SEMI)*
			RBRACE)
		|	cd = constructorDeclaration {$rcd.getConstructors().add($cd.cd);}
		|	md = msgsrvDeclaration {$rcd.getMsgsrvs().add($md.md);}
		|	smd = synchMethodDeclaration {$rcd.getSynchMethods().add($smd.smd);}
		)*
        RBRACE {$rcd.setEndLineNumber($RBRACE.getLine());$rcd.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;
	
//////////////////////////////////
methodDeclaration [MethodDeclaration md]
	:   IDENTIFIER formalParameters
	    (block | SEMI)
	;

constructorDeclaration returns [ConstructorDeclaration cd]
	:   (annotation)* methodDeclaration[{$cd}]
	;
	
	
msgsrvDeclaration returns [MsgsrvDeclaration md]
    :
		{$md = new MsgsrvDeclaration();}
    	(an = annotation {$md.getAnnotations().add($an.an);})*
		(ABSTRACT {$md.setAbstract(true);})? MSGSRV
		methodDeclaration[{$md}]
	;
	
synchMethodDeclaration returns [SynchMethodDeclaration smd]
	:
        {$smd = new SynchMethodDeclaration();}
    	(an = annotation {$smd.getAnnotations().add($an.an);})*
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
    	(
    		{ArrayList<Annotation> anns = new ArrayList<Annotation>();}
    		(an = annotation {anns.add($an.an);})*
        	s = statement {$bs.getStatements().add ($s.s); $s.s.getAnnotations().addAll(anns);}
        )*
        RBRACE {$bs.setEndLineNumber($RBRACE.getLine());$bs.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;

statement returns [Statement s]
	:
        se = statementExpression {$s = $se.se;} SEMI
	|	fd = fieldDeclaration {$s = $fd.fd;} SEMI
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
    |   RETURN {$s = new ReturnStatement();} 
    	(e = expression {((ReturnStatement)$s).setExpression($e.e);})? SEMI
    	{$s.setLineNumber($RETURN.getLine());
    	 $s.setCharacter($RETURN.getCharPositionInLine());}
    |   BREAK SEMI
    	{$s = new BreakStatement(); $s.setLineNumber($BREAK.getLine());$s.setCharacter($BREAK.getCharPositionInLine());}
    |   CONTINUE SEMI
    	{$s = new ContinueStatement(); $s.setLineNumber($CONTINUE.getLine());$s.setCharacter($CONTINUE.getCharPositionInLine());}
    |   SEMI {$s = new Statement();}
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
    		{
    			$ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
    		}
	    	(an = annotation {anns.add($an.an);})*
			CASE e = expression COLON  
			{
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setExpression($e.e);
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setLineNumber($e.e.getLineNumber());
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setCharacter($e.e.getCharacter());
				$ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
			}
			(
				(an = annotation {anns.add($an.an);})*
				st = statement 
				{
					$st.s.getAnnotations().addAll(anns);
					$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1)
						.getStatements().add($st.s);
				}
			)*
		)+
		(	
			DEFAULT COLON
    		{
    			$ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setLineNumber($DEFAULT.getCharPositionInLine());
    			$ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).setCharacter($DEFAULT.getLine());
				$ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
			}
			(
				(an = annotation {anns.add($an.an);})*
				st = statement {$st.s.getAnnotations().addAll(anns); $ss.getSwitchStatementGroups().get($ss.getSwitchStatementGroups().size() - 1).getStatements().add($st.s);}
			)*
		)?
    ;

statementExpression returns [Statement se]
	:
		e = expression {$se = $e.e;}
	;
