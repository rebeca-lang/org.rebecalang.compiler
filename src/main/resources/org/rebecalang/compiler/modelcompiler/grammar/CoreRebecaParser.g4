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
interfaceDeclaration returns [InterfaceDeclaration intd]
    :   annotation*
        INTERFACE IDENTIFIER (extendingInterface)?
        LBRACE (msgsrvSignature)* RBRACE
    ;

extendingInterface returns [OrdinaryPrimitiveType opt]
    : EXTENDS IDENTIFIER (COMMA IDENTIFIER)*
    ;

msgsrvSignature returns [OrdinaryPrimitiveType opt]
    : MSGSRV IDENTIFIER formalParameters SEMI
    ;

reactiveClassDeclaration returns [ReactiveClassDeclaration rcd]
    :   annotation*
        ABSTRACT? REACTIVECLASS IDENTIFIER (EXTENDS IDENTIFIER)? (implementingInterface)?
        LPAREN INTLITERAL RPAREN
        LBRACE
        (knownRebecsDecleration | stateVarsDecleration | constructorDeclaration
        | msgsrvDeclaration | synchMethodDeclaration)*
        RBRACE
    ;
implementingInterface returns [OrdinaryPrimitiveType opt]
    : IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)*
    ;
knownRebecsDecleration
    : KNOWNREBECS LBRACE (fieldDeclaration SEMI)* RBRACE
    ;
stateVarsDecleration
    : STATEVARS LBRACE (fieldDeclaration SEMI)* RBRACE
    ;
//////////////////////////////////
methodDeclaration returns [MethodDeclaration md]
	:   IDENTIFIER formalParameters (block | SEMI)
	;

constructorDeclaration returns [ConstructorDeclaration cd]
	:   annotation* methodDeclaration
	;
	
msgsrvDeclaration returns [MsgsrvDeclaration md]
    :
    	annotation* ABSTRACT? MSGSRV methodDeclaration
	;
	
synchMethodDeclaration returns [SynchMethodDeclaration smd]
	:   annotation* ABSTRACT? type methodDeclaration
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
    :   (annotation* caseSwitchGroup)+
		(defualtSwitchGroup)?
    ;
caseSwitchGroup returns [SwitchStatementGroup ssg]
    :   CASE expression COLON
		annotatedStatement*
    ;
defualtSwitchGroup returns [SwitchStatementGroup ssg]
    :   DEFAULT COLON
     	annotatedStatement*
    ;
annotatedStatement returns [Statement s]
    : annotation* statement
    ;

statementExpression returns [Statement se]
	:   expression
	;