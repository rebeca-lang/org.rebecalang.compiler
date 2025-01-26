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
	;

/////////////////////////
mainDeclaration returns [MainDeclaration md]
	:   MAIN LBRACE mainRebecDefinition* RBRACE
	;

mainRebecDefinition returns [MainRebecDefinition mrd]
	:	annotation* type IDENTIFIER
		LPAREN bindingsExpressionList? RPAREN COLON LPAREN argumentsExpressionList? RPAREN SEMI
	;
bindingsExpressionList
    : expressionList
    ;

argumentsExpressionList
    : expressionList
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
    :   LPAREN (formalParametersDeclaration)? RPAREN
    ;

formalParametersDeclaration returns [List<FormalParameterDeclaration> fpds]
    :   formalParameterDeclaration (COMMA formalParameterDeclaration)*
    ;

formalParameterDeclaration returns [FormalParameterDeclaration fpd]
    :   type IDENTIFIER
    ;

///////////////////////

block returns [BlockStatement bs]
    :   LBRACE annotatedStatement* RBRACE
    ;

annotatedStatement returns [Statement s]
    : annotation* statement
    ;

statement returns [Statement s]
	:
		fieldDeclaration SEMI
	|	block
    |   IF LPAREN expression RPAREN statement (ELSE statement)?
    |   WHILE LPAREN expression RPAREN statement
    |   FOR LPAREN forInit? SEMI expression? SEMI expressionList? RPAREN statement
    |   SWITCH LPAREN expression RPAREN LBRACE switchBlock RBRACE
    |   RETURN expression? SEMI
    |   BREAK SEMI
    |   CONTINUE SEMI
    |   SEMI
    |   statementExpression SEMI
	;

forInit returns [ForInitializer fi]
    :   fieldDeclaration | expressionList
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
	:   expression
	;
