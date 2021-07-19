parser grammar TimedRebecaPropertyParser;

import CoreRebecaExpressionParser, GeneralPropertyParser;


propertyDefinition [PropertyModel pm]
	:
	(ASSERTION LBRACE
		(id=IDENTIFIER COLON assertione = expression {
			AssertionDefinition assertionDefinition = new AssertionDefinition();
			assertionDefinition.setName($id.text);
			assertionDefinition.setExpression($assertione.e);
			$pm.getAssertionDefinitions().add(assertionDefinition);} SEMI)*
	RBRACE)?
	(TCTL LBRACE
		(id=IDENTIFIER COLON tctle = expression {
			TCTLDefinition tctlDefinition = new TCTLDefinition();
			tctlDefinition.setName($id.text);
			tctlDefinition.setExpression($tctle.e);
			$pm.getTCTLDefinitions().add(tctlDefinition);} SEMI)*
	RBRACE)?
	;
