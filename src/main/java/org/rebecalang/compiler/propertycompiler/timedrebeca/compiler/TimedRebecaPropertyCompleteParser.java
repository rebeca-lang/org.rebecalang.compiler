// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/TimedRebecaPropertyComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Annotation;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Label;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimedRebecaPropertyCompleteParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TCTL=1, DEFINE=2, THEN=3, PROPERTY=4, ASSERTION=5, INTLITERAL=6, FLOATLITERAL=7, 
		DOUBLELITERAL=8, CHARLITERAL=9, STRINGLITERAL=10, WS=11, COMMENT=12, LINE_COMMENT=13, 
		TRUE=14, FALSE=15, NULL=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, 
		LBRACKET=21, RBRACKET=22, SEMI=23, COMMA=24, DOT=25, EQ=26, BANG=27, TILDA=28, 
		QUES=29, COLON=30, EQEQ=31, AMPAMP=32, BARBAR=33, PLUSPLUS=34, SUBSUB=35, 
		PLUS=36, SUB=37, STAR=38, SLASH=39, AMP=40, BAR=41, CARET=42, PERCENT=43, 
		PLUSEQ=44, SUBEQ=45, STAREQ=46, SLASHEQ=47, AMPEQ=48, BAREQ=49, CARETEQ=50, 
		TILDAEQ=51, PERCENTEQ=52, MONKEYS_AT=53, BANGEQ=54, GT=55, LT=56, LTLT=57, 
		LTLTEQ=58, GTGT=59, GTGTEQ=60, IDENTIFIER=61, INSTANCEOF=62, NEW=63;
	public static final String[] tokenNames = {
		"<INVALID>", "'TCTL'", "'define'", "'->'", "'property'", "'Assertion'", 
		"INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", 
		"WS", "COMMENT", "LINE_COMMENT", "'true'", "'false'", "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'~='", "'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", 
		"'<<='", "'>>'", "'>>='", "IDENTIFIER", "INSTANCEOF", "NEW"
	};
	public static final int
		RULE_propertyDefinition = 0, RULE_annotation = 1, RULE_type = 2, RULE_dimensions = 3, 
		RULE_expression = 4, RULE_assignmentOperator = 5, RULE_conditionalExpression = 6, 
		RULE_conditionalOrExpression = 7, RULE_conditionalAndExpression = 8, RULE_inclusiveOrExpression = 9, 
		RULE_exclusiveOrExpression = 10, RULE_andExpression = 11, RULE_equalityExpression = 12, 
		RULE_instanceOfExpression = 13, RULE_relationalExpression = 14, RULE_relationalOp = 15, 
		RULE_shiftExpression = 16, RULE_shiftOp = 17, RULE_additiveExpression = 18, 
		RULE_multiplicativeExpression = 19, RULE_unaryExpression = 20, RULE_unaryExpressionNotPlusMinus = 21, 
		RULE_castExpression = 22, RULE_primary = 23, RULE_expressionList = 24, 
		RULE_literal = 25, RULE_propertyModel = 26;
	public static final String[] ruleNames = {
		"propertyDefinition", "annotation", "type", "dimensions", "expression", 
		"assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
		"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "primary", 
		"expressionList", "literal", "propertyModel"
	};

	@Override
	public String getGrammarFileName() { return "TimedRebecaPropertyComplete.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TimedRebecaPropertyCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PropertyDefinitionContext extends ParserRuleContext {
		public PropertyModel pm;
		public Token id;
		public ExpressionContext assertione;
		public ExpressionContext tctle;
		public TerminalNode ASSERTION() { return getToken(TimedRebecaPropertyCompleteParser.ASSERTION, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaPropertyCompleteParser.LBRACE); }
		public List<TerminalNode> COLON() { return getTokens(TimedRebecaPropertyCompleteParser.COLON); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.SEMI, i);
		}
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LBRACE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaPropertyCompleteParser.RBRACE); }
		public TerminalNode TCTL() { return getToken(TimedRebecaPropertyCompleteParser.TCTL, 0); }
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode COLON(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.COLON, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaPropertyCompleteParser.IDENTIFIER); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState, PropertyModel pm) {
			super(parent, invokingState);
			this.pm = pm;
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitPropertyDefinition(this);
		}
	}

	public final PropertyDefinitionContext propertyDefinition(PropertyModel pm) throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState(), pm);
		enterRule(_localctx, 0, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if (_la==ASSERTION) {
				{
				setState(54); match(ASSERTION);
				setState(55); match(LBRACE);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(56); ((PropertyDefinitionContext)_localctx).id = match(IDENTIFIER);
					setState(57); match(COLON);
					setState(58); ((PropertyDefinitionContext)_localctx).assertione = expression();

								AssertionDefinition assertionDefinition = new AssertionDefinition();
								assertionDefinition.setName((((PropertyDefinitionContext)_localctx).id!=null?((PropertyDefinitionContext)_localctx).id.getText():null));
								assertionDefinition.setExpression(((PropertyDefinitionContext)_localctx).assertione.e);
								_localctx.pm.getAssertionDefinitions().add(assertionDefinition);
					setState(60); match(SEMI);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67); match(RBRACE);
				}
			}

			setState(84);
			_la = _input.LA(1);
			if (_la==TCTL) {
				{
				setState(70); match(TCTL);
				setState(71); match(LBRACE);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(72); ((PropertyDefinitionContext)_localctx).id = match(IDENTIFIER);
					setState(73); match(COLON);
					setState(74); ((PropertyDefinitionContext)_localctx).tctle = expression();

								TCTLDefinition tctlDefinition = new TCTLDefinition();
								tctlDefinition.setName((((PropertyDefinitionContext)_localctx).id!=null?((PropertyDefinitionContext)_localctx).id.getText():null));
								tctlDefinition.setExpression(((PropertyDefinitionContext)_localctx).tctle.e);
								_localctx.pm.getTCTLDefinitions().add(tctlDefinition);
					setState(76); match(SEMI);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83); match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public Annotation an;
		public Token annotationName;
		public ExpressionContext exp;
		public TerminalNode LPAREN() { return getToken(TimedRebecaPropertyCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaPropertyCompleteParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(87); match(MONKEYS_AT);
			setState(88); ((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			setState(97);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(90); match(LPAREN);
				setState(94);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << IDENTIFIER) | (1L << NEW))) != 0)) {
					{
					setState(91); ((AnnotationContext)_localctx).exp = expression();
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(96); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public Token typeName;
		public DimensionsContext ds;
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypeContext)_localctx).t =  new PrimitiveType();
			setState(100); ((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(105);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(102); ((TypeContext)_localctx).ds = dimensions();
				PrimitiveType newpt = (PrimitiveType)_localctx.t; ((TypeContext)_localctx).t =  new ArrayType(); ((ArrayType)_localctx.t).setPrimitiveType(newpt); ((ArrayType)_localctx.t).getDimensions().addAll(((TypeContext)_localctx).ds.ds);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionsContext extends ParserRuleContext {
		public List<Integer> ds;
		public Token i;
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(TimedRebecaPropertyCompleteParser.INTLITERAL); }
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.INTLITERAL, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108); match(LBRACKET);
				setState(109); ((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(110); match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalExpressionContext e1;
		public AssignmentOperatorContext ao;
		public ExpressionContext e2;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); ((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(118); ((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(119); ((ExpressionContext)_localctx).e2 = expression();
				BinaryExpression e3 = new BinaryExpression();
							e3.setOperator(((ExpressionContext)_localctx).ao.ao); e3.setLeft(((ExpressionContext)_localctx).e1.e); e3.setRight(((ExpressionContext)_localctx).e2.e);
							e3.setLineNumber(((ExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((ExpressionContext)_localctx).e1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3;
							
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public String ao;
		public Token EQ;
		public Token PLUSEQ;
		public Token SUBEQ;
		public Token STAREQ;
		public Token SLASHEQ;
		public Token AMPEQ;
		public Token BAREQ;
		public Token CARETEQ;
		public Token TILDAEQ;
		public Token PERCENTEQ;
		public Token LTLTEQ;
		public Token GTGTEQ;
		public TerminalNode PERCENTEQ() { return getToken(TimedRebecaPropertyCompleteParser.PERCENTEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(TimedRebecaPropertyCompleteParser.SUBEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(TimedRebecaPropertyCompleteParser.TILDAEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(TimedRebecaPropertyCompleteParser.GTGTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(TimedRebecaPropertyCompleteParser.LTLTEQ, 0); }
		public TerminalNode BAREQ() { return getToken(TimedRebecaPropertyCompleteParser.BAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(TimedRebecaPropertyCompleteParser.SLASHEQ, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaPropertyCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(TimedRebecaPropertyCompleteParser.PLUSEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(TimedRebecaPropertyCompleteParser.AMPEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(TimedRebecaPropertyCompleteParser.CARETEQ, 0); }
		public TerminalNode STAREQ() { return getToken(TimedRebecaPropertyCompleteParser.STAREQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentOperator);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); ((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); ((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); ((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); ((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(132); ((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(134); ((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(136); ((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(138); ((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(140); ((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(142); ((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(144); ((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(146); ((AssignmentOperatorContext)_localctx).GTGTEQ = match(GTGTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).GTGTEQ!=null?((AssignmentOperatorContext)_localctx).GTGTEQ.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalOrExpressionContext e1;
		public ExpressionContext e2;
		public ConditionalExpressionContext e3;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaPropertyCompleteParser.COLON, 0); }
		public TerminalNode QUES() { return getToken(TimedRebecaPropertyCompleteParser.QUES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); ((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(152); match(QUES);
				setState(153); ((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(154); match(COLON);
				setState(155); ((ConditionalExpressionContext)_localctx).e3 = conditionalExpression();
				TernaryExpression e4 = new TernaryExpression();
							e4.setCondition(((ConditionalExpressionContext)_localctx).e1.e); e4.setLeft(((ConditionalExpressionContext)_localctx).e2.e); e4.setRight(((ConditionalExpressionContext)_localctx).e3.e);
							e4.setLineNumber(((ConditionalExpressionContext)_localctx).e1.e.getLineNumber());e4.setCharacter(((ConditionalExpressionContext)_localctx).e1.e.getCharacter()); ((ConditionalExpressionContext)_localctx).e =  e4;
							
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalAndExpressionContext e1;
		public Token BARBAR;
		public ConditionalAndExpressionContext e2;
		public List<TerminalNode> BARBAR() { return getTokens(TimedRebecaPropertyCompleteParser.BARBAR); }
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public TerminalNode BARBAR(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.BARBAR, i);
		}
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); ((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(162); ((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
					setState(163); ((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public Expression e;
		public InclusiveOrExpressionContext e1;
		public Token AMPAMP;
		public InclusiveOrExpressionContext e2;
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public List<TerminalNode> AMPAMP() { return getTokens(TimedRebecaPropertyCompleteParser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.AMPAMP, i);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171); ((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(173); ((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(174); ((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ExclusiveOrExpressionContext e1;
		public Token BAR;
		public ExclusiveOrExpressionContext e2;
		public List<TerminalNode> BAR() { return getTokens(TimedRebecaPropertyCompleteParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.BAR, i);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182); ((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(184); ((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(185); ((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public AndExpressionContext e1;
		public Token CARET;
		public AndExpressionContext e2;
		public TerminalNode CARET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.CARET, i);
		}
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(TimedRebecaPropertyCompleteParser.CARET); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193); ((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(195); ((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(196); ((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression e;
		public EqualityExpressionContext e1;
		public Token AMP;
		public EqualityExpressionContext e2;
		public List<TerminalNode> AMP() { return getTokens(TimedRebecaPropertyCompleteParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.AMP, i);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204); ((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(206); ((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(207); ((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression e;
		public InstanceOfExpressionContext e1;
		public Token EQEQ;
		public Token BANGEQ;
		public InstanceOfExpressionContext e2;
		public TerminalNode EQEQ() { return getToken(TimedRebecaPropertyCompleteParser.EQEQ, 0); }
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public TerminalNode BANGEQ() { return getToken(TimedRebecaPropertyCompleteParser.BANGEQ, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); ((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
				setState(222);
				switch (_input.LA(1)) {
				case EQEQ:
					{
					setState(218); ((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
					}
					break;
				case BANGEQ:
					{
					setState(220); ((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224); ((EqualityExpressionContext)_localctx).e2 = instanceOfExpression();
				((BinaryExpression)_localctx.e).setRight(((EqualityExpressionContext)_localctx).e2.e);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public Expression e;
		public RelationalExpressionContext e1;
		public TypeContext t;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(TimedRebecaPropertyCompleteParser.INSTANCEOF, 0); }
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); ((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(231); match(INSTANCEOF);
				setState(232); ((InstanceOfExpressionContext)_localctx).t = type();
				((InstanceOfExpressionContext)_localctx).e =  new InstanceofExpression(); 
				        					((InstanceofExpression)_localctx.e).setValue(((InstanceOfExpressionContext)_localctx).e1.e); 
				        					((InstanceofExpression)_localctx.e).setEvaluationType(((InstanceOfExpressionContext)_localctx).t.t);
				        					_localctx.e.setType(TypesUtilities.BOOLEAN_TYPE);
				        					_localctx.e.setLineNumber(((InstanceOfExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((InstanceOfExpressionContext)_localctx).t.t.getCharacter());
				        					
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression e;
		public ShiftExpressionContext e1;
		public RelationalOpContext ro;
		public ShiftExpressionContext e2;
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237); ((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(239); ((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(240); ((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(_localctx.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public Token LT;
		public Token EQ;
		public Token GT;
		public TerminalNode LT() { return getToken(TimedRebecaPropertyCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaPropertyCompleteParser.GT, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaPropertyCompleteParser.EQ, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationalOp);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); ((RelationalOpContext)_localctx).LT = match(LT);
				setState(249); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); ((RelationalOpContext)_localctx).GT = match(GT);
				setState(252); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254); ((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256); ((RelationalOpContext)_localctx).GT = match(GT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public Expression e;
		public AdditiveExpressionContext e1;
		public ShiftOpContext so;
		public AdditiveExpressionContext e2;
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260); ((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(262); ((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(263); ((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(_localctx.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOpContext extends ParserRuleContext {
		public String so;
		public List<TerminalNode> LT() { return getTokens(TimedRebecaPropertyCompleteParser.LT); }
		public List<TerminalNode> GT() { return getTokens(TimedRebecaPropertyCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.GT, i);
		}
		public TerminalNode LT(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shiftOp);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(LT);
				setState(272); match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); match(GT);
				setState(275); match(GT);
				((ShiftOpContext)_localctx).so =  ">>";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression e;
		public MultiplicativeExpressionContext e1;
		public Token PLUS;
		public Token SUB;
		public MultiplicativeExpressionContext e2;
		public List<TerminalNode> SUB() { return getTokens(TimedRebecaPropertyCompleteParser.SUB); }
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public List<TerminalNode> PLUS() { return getTokens(TimedRebecaPropertyCompleteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.PLUS, i);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public TerminalNode SUB(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279); ((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(286);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(282); ((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						e3.setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(284); ((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						e3.setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(288); ((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					e3.setRight(((AdditiveExpressionContext)_localctx).e2.e); ((AdditiveExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext e1;
		public Token STAR;
		public Token SLASH;
		public Token PERCENT;
		public UnaryExpressionContext e2;
		public TerminalNode STAR(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.STAR, i);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public List<TerminalNode> SLASH() { return getTokens(TimedRebecaPropertyCompleteParser.SLASH); }
		public TerminalNode PERCENT(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.PERCENT, i);
		}
		public List<TerminalNode> STAR() { return getTokens(TimedRebecaPropertyCompleteParser.STAR); }
		public TerminalNode SLASH(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(TimedRebecaPropertyCompleteParser.PERCENT); }
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296); ((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(305);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(299); ((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(301); ((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(303); ((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(307); ((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					e3.setRight(((MultiplicativeExpressionContext)_localctx).e2.e); ((MultiplicativeExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext ep;
		public Token SUB;
		public UnaryExpressionContext es;
		public Token PLUSPLUS;
		public UnaryExpressionContext epp;
		public Token SUBSUB;
		public UnaryExpressionContext ess;
		public UnaryExpressionNotPlusMinusContext eu;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUB() { return getToken(TimedRebecaPropertyCompleteParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TimedRebecaPropertyCompleteParser.PLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaPropertyCompleteParser.SUBSUB, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExpression);
		try {
			setState(334);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); match(PLUS);
				setState(316); ((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); ((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(320); ((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(323); ((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(324); ((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(327); ((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(328); ((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case BANG:
			case TILDA:
			case QUES:
			case IDENTIFIER:
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(331); ((UnaryExpressionContext)_localctx).eu = unaryExpressionNotPlusMinus();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).eu.e;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public Expression e;
		public Token TILDA;
		public UnaryExpressionContext e1;
		public Token BANG;
		public CastExpressionContext ec;
		public ExpressionContext ep;
		public PrimaryContext p;
		public LiteralContext l;
		public Token QUES;
		public ExpressionListContext el;
		public TypeContext t;
		public Token DOT;
		public PrimaryContext p2;
		public Token PLUSPLUS;
		public Token SUBSUB;
		public TerminalNode TILDA() { return getToken(TimedRebecaPropertyCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaPropertyCompleteParser.COLON, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaPropertyCompleteParser.RPAREN); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaPropertyCompleteParser.SUBSUB, 0); }
		public TerminalNode QUES() { return getToken(TimedRebecaPropertyCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(TimedRebecaPropertyCompleteParser.NEW, 0); }
		public TerminalNode DOT(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.DOT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TimedRebecaPropertyCompleteParser.DOT); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RPAREN, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaPropertyCompleteParser.LPAREN); }
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LPAREN, i);
		}
		public TerminalNode BANG() { return getToken(TimedRebecaPropertyCompleteParser.BANG, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			int _alt;
			setState(400);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(336); ((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(337); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(340); ((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(341); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).BANG!=null?((UnaryExpressionNotPlusMinusContext)_localctx).BANG.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case QUES:
			case IDENTIFIER:
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(344); ((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;

				case 2:
					{
					setState(347); match(LPAREN);
					setState(348); ((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(350); match(RPAREN);
					}
					break;

				case 3:
					{
					setState(352); ((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;

				case 4:
					{
					setState(355); ((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;

				case 5:
					{
					setState(358); ((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(359); match(LPAREN);
					setState(360); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(361); match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;

				case 6:
					{
					setState(364); match(NEW);
					setState(365); ((UnaryExpressionNotPlusMinusContext)_localctx).t = type();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new RebecInstantiationPrimary();
									_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((UnaryExpressionNotPlusMinusContext)_localctx).t.t);
					setState(367); match(LPAREN);
					setState(371);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << IDENTIFIER) | (1L << NEW))) != 0)) {
						{
						setState(368); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(373); match(RPAREN);
					setState(374); match(COLON);
					setState(375); match(LPAREN);
					setState(379);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << IDENTIFIER) | (1L << NEW))) != 0)) {
						{
						setState(376); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(381); match(RPAREN);
					}
					break;
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(385); ((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(386); ((UnaryExpressionNotPlusMinusContext)_localctx).p2 = primary();

						        	DotPrimary de = new DotPrimary(); de.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).DOT.getLine()); de.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).DOT.getCharPositionInLine());
						        	if (_localctx.e instanceof DotPrimary) {
						        		DotPrimary temp = (DotPrimary)_localctx.e;
						        		while(temp.getRight() instanceof DotPrimary)
						        			temp = (DotPrimary)temp.getRight();
						        		de.setLeft(temp.getRight());
						        		temp.setRight(de);
						        		de.setRight(((UnaryExpressionNotPlusMinusContext)_localctx).p2.tp);
						        	} else {
						        		de.setLeft(_localctx.e); de.setRight(((UnaryExpressionNotPlusMinusContext)_localctx).p2.tp);
							        	((UnaryExpressionNotPlusMinusContext)_localctx).e =  de;
						        	}
						        	
						}
						} 
					}
					setState(393);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(398);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(394); ((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;

				case 2:
					{
					setState(396); ((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB = match(SUBSUB);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("--");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB.getCharPositionInLine());
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public Expression e;
		public TypeContext t;
		public ExpressionContext e1;
		public TerminalNode LPAREN() { return getToken(TimedRebecaPropertyCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaPropertyCompleteParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(LPAREN);
			setState(403); ((CastExpressionContext)_localctx).t = type();
			setState(404); match(RPAREN);
			setState(405); ((CastExpressionContext)_localctx).e1 = expression();
			((CastExpressionContext)_localctx).e =  new CastExpression();
			    	((CastExpression)_localctx.e).setExpression(((CastExpressionContext)_localctx).e1.e); ((CastExpression)_localctx.e).setType(((CastExpressionContext)_localctx).t.t);
					_localctx.e.setLineNumber(((CastExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((CastExpressionContext)_localctx).e1.e.getCharacter());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public Token id1;
		public Token lp;
		public ExpressionListContext el;
		public ExpressionContext e2;
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TimedRebecaPropertyCompleteParser.LPAREN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TimedRebecaPropertyCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); ((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(418);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(410); ((PrimaryContext)_localctx).lp = match(LPAREN);
				ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(415);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << IDENTIFIER) | (1L << NEW))) != 0)) {
					{
					setState(412); ((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(417); match(RPAREN);
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(420); match(LBRACKET);
				setState(421); ((PrimaryContext)_localctx).e2 = expression();
				setState(422); match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> el;
		public ExpressionContext e;
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaPropertyCompleteParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>();
			setState(431); ((ExpressionListContext)_localctx).e = expression();
			_localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(433); match(COMMA);
				setState(434); ((ExpressionListContext)_localctx).e = expression();
				_localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Literal l;
		public Token INTLITERAL;
		public Token FLOATLITERAL;
		public Token DOUBLELITERAL;
		public Token CHARLITERAL;
		public Token STRINGLITERAL;
		public Token TRUE;
		public Token FALSE;
		public Token NULL;
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaPropertyCompleteParser.INTLITERAL, 0); }
		public TerminalNode NULL() { return getToken(TimedRebecaPropertyCompleteParser.NULL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(TimedRebecaPropertyCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode FALSE() { return getToken(TimedRebecaPropertyCompleteParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(TimedRebecaPropertyCompleteParser.TRUE, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(TimedRebecaPropertyCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(TimedRebecaPropertyCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(TimedRebecaPropertyCompleteParser.CHARLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(458);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(442); ((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(TypesUtilities.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); ((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(446); ((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(448); ((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(450); ((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(452); ((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(454); ((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(456); ((LiteralContext)_localctx).NULL = match(NULL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("null");
				    	_localctx.l.setType(TypesUtilities.NULL_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).NULL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).NULL.getCharPositionInLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyModelContext extends ParserRuleContext {
		public PropertyModel pm;
		public Token id;
		public ExpressionContext e;
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaPropertyCompleteParser.LBRACE); }
		public TerminalNode EQ(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.EQ, i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.SEMI, i);
		}
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LBRACE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PROPERTY() { return getToken(TimedRebecaPropertyCompleteParser.PROPERTY, 0); }
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaPropertyCompleteParser.RBRACE); }
		public TerminalNode DEFINE() { return getToken(TimedRebecaPropertyCompleteParser.DEFINE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, i);
		}
		public PropertyDefinitionContext propertyDefinition() {
			return getRuleContext(PropertyDefinitionContext.class,0);
		}
		public List<TerminalNode> EQ() { return getTokens(TimedRebecaPropertyCompleteParser.EQ); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaPropertyCompleteParser.IDENTIFIER); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PropertyModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterPropertyModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitPropertyModel(this);
		}
	}

	public final PropertyModelContext propertyModel() throws RecognitionException {
		PropertyModelContext _localctx = new PropertyModelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_propertyModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PropertyModelContext)_localctx).pm =  new PropertyModel();
			setState(461); match(PROPERTY);
			setState(462); match(LBRACE);
			setState(477);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(463); match(DEFINE);
				setState(464); match(LBRACE);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(465); ((PropertyModelContext)_localctx).id = match(IDENTIFIER);
					setState(466); match(EQ);
					setState(467); ((PropertyModelContext)_localctx).e = expression();

								Definition definition = new Definition();
								definition.setName((((PropertyModelContext)_localctx).id!=null?((PropertyModelContext)_localctx).id.getText():null));
								definition.setExpression(((PropertyModelContext)_localctx).e.e);
								_localctx.pm.getDefinitions().add(definition);
					setState(469); match(SEMI);
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476); match(RBRACE);
				}
			}

			setState(479); propertyDefinition(_localctx.pm);
			setState(480); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u01e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2A\n"+
		"\2\f\2\16\2D\13\2\3\2\5\2G\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2Q\n"+
		"\2\f\2\16\2T\13\2\3\2\5\2W\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n"+
		"\3\3\3\5\3d\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\6"+
		"\5s\n\5\r\5\16\5t\3\6\3\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0097\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00b4\n\n\f\n\16\n\u00b7\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00ca\n\f\f\f\16\f\u00cd\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d5\n\r\f"+
		"\r\16\r\u00d8\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e1\n\16"+
		"\3\16\3\16\3\16\5\16\u00e6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ee"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0105\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010d\n\22\f\22\16\22\u0110\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0118\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0121\n\24\3\24\3\24\3\24\7\24\u0126\n\24\f\24\16\24\u0129"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0134\n\25\3"+
		"\25\3\25\3\25\7\25\u0139\n\25\f\25\16\25\u013c\13\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0151\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0176"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017e\n\27\3\27\3\27\5\27\u0182"+
		"\n\27\3\27\3\27\3\27\3\27\7\27\u0188\n\27\f\27\16\27\u018b\13\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0191\n\27\5\27\u0193\n\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01a2\n\31\3\31\5\31"+
		"\u01a5\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u01ac\n\31\f\31\16\31\u01af"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01b8\n\32\f\32\16\32\u01bb"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01cd\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u01da\n\34\f\34\16\34\u01dd\13\34\3\34\5\34\u01e0"+
		"\n\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\2\u020e\2F\3\2\2\2\4X\3\2\2\2\6e\3\2\2\2\bm\3"+
		"\2\2\2\nv\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u00a2\3\2\2\2\22"+
		"\u00ad\3\2\2\2\24\u00b8\3\2\2\2\26\u00c3\3\2\2\2\30\u00ce\3\2\2\2\32\u00d9"+
		"\3\2\2\2\34\u00e7\3\2\2\2\36\u00ef\3\2\2\2 \u0104\3\2\2\2\"\u0106\3\2"+
		"\2\2$\u0117\3\2\2\2&\u0119\3\2\2\2(\u012a\3\2\2\2*\u0150\3\2\2\2,\u0192"+
		"\3\2\2\2.\u0194\3\2\2\2\60\u019a\3\2\2\2\62\u01b0\3\2\2\2\64\u01cc\3\2"+
		"\2\2\66\u01ce\3\2\2\289\7\7\2\29B\7\25\2\2:;\7?\2\2;<\7 \2\2<=\5\n\6\2"+
		"=>\b\2\1\2>?\7\31\2\2?A\3\2\2\2@:\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2CE\3\2\2\2DB\3\2\2\2EG\7\26\2\2F8\3\2\2\2FG\3\2\2\2GV\3\2\2\2HI\7\3"+
		"\2\2IR\7\25\2\2JK\7?\2\2KL\7 \2\2LM\5\n\6\2MN\b\2\1\2NO\7\31\2\2OQ\3\2"+
		"\2\2PJ\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UW\7\26"+
		"\2\2VH\3\2\2\2VW\3\2\2\2W\3\3\2\2\2XY\b\3\1\2YZ\7\67\2\2Z[\7?\2\2[c\b"+
		"\3\1\2\\`\7\23\2\2]^\5\n\6\2^_\b\3\1\2_a\3\2\2\2`]\3\2\2\2`a\3\2\2\2a"+
		"b\3\2\2\2bd\7\24\2\2c\\\3\2\2\2cd\3\2\2\2d\5\3\2\2\2ef\b\4\1\2fg\7?\2"+
		"\2gk\b\4\1\2hi\5\b\5\2ij\b\4\1\2jl\3\2\2\2kh\3\2\2\2kl\3\2\2\2l\7\3\2"+
		"\2\2mr\b\5\1\2no\7\27\2\2op\7\b\2\2pq\7\30\2\2qs\b\5\1\2rn\3\2\2\2st\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vw\5\16\b\2w|\b\6\1\2xy\5\f\7\2y"+
		"z\5\n\6\2z{\b\6\1\2{}\3\2\2\2|x\3\2\2\2|}\3\2\2\2}\13\3\2\2\2~\177\7\34"+
		"\2\2\177\u0097\b\7\1\2\u0080\u0081\7.\2\2\u0081\u0097\b\7\1\2\u0082\u0083"+
		"\7/\2\2\u0083\u0097\b\7\1\2\u0084\u0085\7\60\2\2\u0085\u0097\b\7\1\2\u0086"+
		"\u0087\7\61\2\2\u0087\u0097\b\7\1\2\u0088\u0089\7\62\2\2\u0089\u0097\b"+
		"\7\1\2\u008a\u008b\7\63\2\2\u008b\u0097\b\7\1\2\u008c\u008d\7\64\2\2\u008d"+
		"\u0097\b\7\1\2\u008e\u008f\7\65\2\2\u008f\u0097\b\7\1\2\u0090\u0091\7"+
		"\66\2\2\u0091\u0097\b\7\1\2\u0092\u0093\7<\2\2\u0093\u0097\b\7\1\2\u0094"+
		"\u0095\7>\2\2\u0095\u0097\b\7\1\2\u0096~\3\2\2\2\u0096\u0080\3\2\2\2\u0096"+
		"\u0082\3\2\2\2\u0096\u0084\3\2\2\2\u0096\u0086\3\2\2\2\u0096\u0088\3\2"+
		"\2\2\u0096\u008a\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u008e\3\2\2\2\u0096"+
		"\u0090\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097\r\3\2\2\2"+
		"\u0098\u0099\5\20\t\2\u0099\u00a0\b\b\1\2\u009a\u009b\7\37\2\2\u009b\u009c"+
		"\5\n\6\2\u009c\u009d\7 \2\2\u009d\u009e\5\16\b\2\u009e\u009f\b\b\1\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2"+
		"\2\u00a2\u00a3\5\22\n\2\u00a3\u00aa\b\t\1\2\u00a4\u00a5\7#\2\2\u00a5\u00a6"+
		"\5\22\n\2\u00a6\u00a7\b\t\1\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\21"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00b5\b\n\1\2"+
		"\u00af\u00b0\7\"\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\b\n\1\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5\26\f"+
		"\2\u00b9\u00c0\b\13\1\2\u00ba\u00bb\7+\2\2\u00bb\u00bc\5\26\f\2\u00bc"+
		"\u00bd\b\13\1\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\25\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00cb\b\f\1\2\u00c5\u00c6\7"+
		",\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\b\f\1\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c5\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\27\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\32\16\2\u00cf"+
		"\u00d6\b\r\1\2\u00d0\u00d1\7*\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\b"+
		"\r\1\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00d6\3\2\2"+
		"\2\u00d9\u00da\5\34\17\2\u00da\u00e5\b\16\1\2\u00db\u00e0\b\16\1\2\u00dc"+
		"\u00dd\7!\2\2\u00dd\u00e1\b\16\1\2\u00de\u00df\78\2\2\u00df\u00e1\b\16"+
		"\1\2\u00e0\u00dc\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\5\34\17\2\u00e3\u00e4\b\16\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00db"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00e8\5\36\20\2\u00e8"+
		"\u00ed\b\17\1\2\u00e9\u00ea\7@\2\2\u00ea\u00eb\5\6\4\2\u00eb\u00ec\b\17"+
		"\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00f0\5\"\22\2\u00f0\u00f7\b\20\1\2\u00f1\u00f2\5 \21"+
		"\2\u00f2\u00f3\5\"\22\2\u00f3\u00f4\b\20\1\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\37\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7:\2\2\u00fb\u00fc"+
		"\7\34\2\2\u00fc\u0105\b\21\1\2\u00fd\u00fe\79\2\2\u00fe\u00ff\7\34\2\2"+
		"\u00ff\u0105\b\21\1\2\u0100\u0101\7:\2\2\u0101\u0105\b\21\1\2\u0102\u0103"+
		"\79\2\2\u0103\u0105\b\21\1\2\u0104\u00fa\3\2\2\2\u0104\u00fd\3\2\2\2\u0104"+
		"\u0100\3\2\2\2\u0104\u0102\3\2\2\2\u0105!\3\2\2\2\u0106\u0107\5&\24\2"+
		"\u0107\u010e\b\22\1\2\u0108\u0109\5$\23\2\u0109\u010a\5&\24\2\u010a\u010b"+
		"\b\22\1\2\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010d\u0110\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f#\3\2\2\2\u0110\u010e\3"+
		"\2\2\2\u0111\u0112\7:\2\2\u0112\u0113\7:\2\2\u0113\u0118\b\23\1\2\u0114"+
		"\u0115\79\2\2\u0115\u0116\79\2\2\u0116\u0118\b\23\1\2\u0117\u0111\3\2"+
		"\2\2\u0117\u0114\3\2\2\2\u0118%\3\2\2\2\u0119\u011a\5(\25\2\u011a\u0127"+
		"\b\24\1\2\u011b\u0120\b\24\1\2\u011c\u011d\7&\2\2\u011d\u0121\b\24\1\2"+
		"\u011e\u011f\7\'\2\2\u011f\u0121\b\24\1\2\u0120\u011c\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\5(\25\2\u0123\u0124\b\24\1\2"+
		"\u0124\u0126\3\2\2\2\u0125\u011b\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\'\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012b\5*\26\2\u012b\u013a\b\25\1\2\u012c\u0133\b\25\1\2\u012d\u012e\7"+
		"(\2\2\u012e\u0134\b\25\1\2\u012f\u0130\7)\2\2\u0130\u0134\b\25\1\2\u0131"+
		"\u0132\7-\2\2\u0132\u0134\b\25\1\2\u0133\u012d\3\2\2\2\u0133\u012f\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5*\26\2\u0136"+
		"\u0137\b\25\1\2\u0137\u0139\3\2\2\2\u0138\u012c\3\2\2\2\u0139\u013c\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b)\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u013e\7&\2\2\u013e\u013f\5*\26\2\u013f\u0140\b\26\1\2\u0140"+
		"\u0151\3\2\2\2\u0141\u0142\7\'\2\2\u0142\u0143\5*\26\2\u0143\u0144\b\26"+
		"\1\2\u0144\u0151\3\2\2\2\u0145\u0146\7$\2\2\u0146\u0147\5*\26\2\u0147"+
		"\u0148\b\26\1\2\u0148\u0151\3\2\2\2\u0149\u014a\7%\2\2\u014a\u014b\5*"+
		"\26\2\u014b\u014c\b\26\1\2\u014c\u0151\3\2\2\2\u014d\u014e\5,\27\2\u014e"+
		"\u014f\b\26\1\2\u014f\u0151\3\2\2\2\u0150\u013d\3\2\2\2\u0150\u0141\3"+
		"\2\2\2\u0150\u0145\3\2\2\2\u0150\u0149\3\2\2\2\u0150\u014d\3\2\2\2\u0151"+
		"+\3\2\2\2\u0152\u0153\7\36\2\2\u0153\u0154\5*\26\2\u0154\u0155\b\27\1"+
		"\2\u0155\u0193\3\2\2\2\u0156\u0157\7\35\2\2\u0157\u0158\5*\26\2\u0158"+
		"\u0159\b\27\1\2\u0159\u0193\3\2\2\2\u015a\u015b\5.\30\2\u015b\u015c\b"+
		"\27\1\2\u015c\u0182\3\2\2\2\u015d\u015e\7\23\2\2\u015e\u015f\5\n\6\2\u015f"+
		"\u0160\b\27\1\2\u0160\u0161\7\24\2\2\u0161\u0182\3\2\2\2\u0162\u0163\5"+
		"\60\31\2\u0163\u0164\b\27\1\2\u0164\u0182\3\2\2\2\u0165\u0166\5\64\33"+
		"\2\u0166\u0167\b\27\1\2\u0167\u0182\3\2\2\2\u0168\u0169\7\37\2\2\u0169"+
		"\u016a\7\23\2\2\u016a\u016b\5\62\32\2\u016b\u016c\7\24\2\2\u016c\u016d"+
		"\b\27\1\2\u016d\u0182\3\2\2\2\u016e\u016f\7A\2\2\u016f\u0170\5\6\4\2\u0170"+
		"\u0171\b\27\1\2\u0171\u0175\7\23\2\2\u0172\u0173\5\62\32\2\u0173\u0174"+
		"\b\27\1\2\u0174\u0176\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0177\3\2\2\2\u0177\u0178\7\24\2\2\u0178\u0179\7 \2\2\u0179\u017d"+
		"\7\23\2\2\u017a\u017b\5\62\32\2\u017b\u017c\b\27\1\2\u017c\u017e\3\2\2"+
		"\2\u017d\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
		"\7\24\2\2\u0180\u0182\3\2\2\2\u0181\u015a\3\2\2\2\u0181\u015d\3\2\2\2"+
		"\u0181\u0162\3\2\2\2\u0181\u0165\3\2\2\2\u0181\u0168\3\2\2\2\u0181\u016e"+
		"\3\2\2\2\u0182\u0189\3\2\2\2\u0183\u0184\7\33\2\2\u0184\u0185\5\60\31"+
		"\2\u0185\u0186\b\27\1\2\u0186\u0188\3\2\2\2\u0187\u0183\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0190\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7$\2\2\u018d\u0191\b\27\1\2\u018e"+
		"\u018f\7%\2\2\u018f\u0191\b\27\1\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0152\3\2\2\2\u0192"+
		"\u0156\3\2\2\2\u0192\u0181\3\2\2\2\u0193-\3\2\2\2\u0194\u0195\7\23\2\2"+
		"\u0195\u0196\5\6\4\2\u0196\u0197\7\24\2\2\u0197\u0198\5\n\6\2\u0198\u0199"+
		"\b\30\1\2\u0199/\3\2\2\2\u019a\u019b\7?\2\2\u019b\u01a4\b\31\1\2\u019c"+
		"\u019d\7\23\2\2\u019d\u01a1\b\31\1\2\u019e\u019f\5\62\32\2\u019f\u01a0"+
		"\b\31\1\2\u01a0\u01a2\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1\u01a2\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a5\7\24\2\2\u01a4\u019c\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01ad\3\2\2\2\u01a6\u01a7\7\27\2\2\u01a7\u01a8\5\n\6\2"+
		"\u01a8\u01a9\7\30\2\2\u01a9\u01aa\b\31\1\2\u01aa\u01ac\3\2\2\2\u01ab\u01a6"+
		"\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\61\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\b\32\1\2\u01b1\u01b2\5\n\6"+
		"\2\u01b2\u01b9\b\32\1\2\u01b3\u01b4\7\32\2\2\u01b4\u01b5\5\n\6\2\u01b5"+
		"\u01b6\b\32\1\2\u01b6\u01b8\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8\u01bb\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\63\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bd\7\b\2\2\u01bd\u01cd\b\33\1\2\u01be\u01bf\7"+
		"\t\2\2\u01bf\u01cd\b\33\1\2\u01c0\u01c1\7\n\2\2\u01c1\u01cd\b\33\1\2\u01c2"+
		"\u01c3\7\13\2\2\u01c3\u01cd\b\33\1\2\u01c4\u01c5\7\f\2\2\u01c5\u01cd\b"+
		"\33\1\2\u01c6\u01c7\7\20\2\2\u01c7\u01cd\b\33\1\2\u01c8\u01c9\7\21\2\2"+
		"\u01c9\u01cd\b\33\1\2\u01ca\u01cb\7\22\2\2\u01cb\u01cd\b\33\1\2\u01cc"+
		"\u01bc\3\2\2\2\u01cc\u01be\3\2\2\2\u01cc\u01c0\3\2\2\2\u01cc\u01c2\3\2"+
		"\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\65\3\2\2\2\u01ce\u01cf\b\34\1\2\u01cf\u01d0\7\6\2"+
		"\2\u01d0\u01df\7\25\2\2\u01d1\u01d2\7\4\2\2\u01d2\u01db\7\25\2\2\u01d3"+
		"\u01d4\7?\2\2\u01d4\u01d5\7\34\2\2\u01d5\u01d6\5\n\6\2\u01d6\u01d7\b\34"+
		"\1\2\u01d7\u01d8\7\31\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d3\3\2\2\2\u01da"+
		"\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01de\u01e0\7\26\2\2\u01df\u01d1\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5\2\2\2\u01e2\u01e3\7\26"+
		"\2\2\u01e3\67\3\2\2\2+BFRV`ckt|\u0096\u00a0\u00aa\u00b5\u00c0\u00cb\u00d6"+
		"\u00e0\u00e5\u00ed\u00f7\u0104\u010e\u0117\u0120\u0127\u0133\u013a\u0150"+
		"\u0175\u017d\u0181\u0189\u0190\u0192\u01a1\u01a4\u01ad\u01b9\u01cc\u01db"+
		"\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}