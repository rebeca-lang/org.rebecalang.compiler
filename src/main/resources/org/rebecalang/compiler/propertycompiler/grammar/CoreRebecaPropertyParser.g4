parser grammar CoreRebecaPropertyParser;

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
	(LTL LBRACE
		(id=IDENTIFIER COLON ltle = expression {
			LTLDefinition ltlDefinition = new LTLDefinition();
			ltlDefinition.setName($id.text);
			ltlDefinition.setExpression($ltle.e);
			$pm.getLTLDefinitions().add(ltlDefinition);} SEMI)*
	RBRACE)?
	;
