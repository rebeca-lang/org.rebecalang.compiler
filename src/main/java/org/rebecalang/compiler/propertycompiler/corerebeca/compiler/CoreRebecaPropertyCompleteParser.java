// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.0

	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.*;
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
public class CoreRebecaPropertyCompleteParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFINE=1, LTL=2, CTL=3, THEN=4, PROPERTY=5, INTLITERAL=6, FLOATLITERAL=7, 
		DOUBLELITERAL=8, CHARLITERAL=9, STRINGLITERAL=10, WS=11, COMMENT=12, LINE_COMMENT=13, 
		TRUE=14, FALSE=15, NULL=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, 
		LBRACKET=21, RBRACKET=22, SEMI=23, COMMA=24, DOT=25, EQ=26, BANG=27, TILDA=28, 
		QUES=29, COLON=30, EQEQ=31, AMPAMP=32, BARBAR=33, PLUSPLUS=34, SUBSUB=35, 
		PLUS=36, SUB=37, STAR=38, SLASH=39, AMP=40, BAR=41, CARET=42, PERCENT=43, 
		PLUSEQ=44, SUBEQ=45, STAREQ=46, SLASHEQ=47, AMPEQ=48, BAREQ=49, CARETEQ=50, 
		TILDAEQ=51, PERCENTEQ=52, MONKEYS_AT=53, BANGEQ=54, GT=55, LT=56, LTLT=57, 
		LTLTEQ=58, GTGT=59, GTGTEQ=60, IDENTIFIER=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'define'", "'LTL'", "'CTL'", "'->'", "'property'", "INTLITERAL", 
		"FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "WS", 
		"COMMENT", "LINE_COMMENT", "'true'", "'false'", "'null'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'!'", "'~'", 
		"'?'", "':'", "'=='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", 
		"'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'~='", "'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", "'<<='", 
		"'>>'", "'>>='", "IDENTIFIER"
	};
	public static final int
		RULE_conditionalOrExpression = 0, RULE_propertyModel = 1, RULE_type = 2, 
		RULE_dimensions = 3, RULE_expression = 4, RULE_assignmentOperator = 5, 
		RULE_conditionalExpression = 6, RULE_conditionalAndExpression = 7, RULE_inclusiveOrExpression = 8, 
		RULE_exclusiveOrExpression = 9, RULE_andExpression = 10, RULE_equalityExpression = 11, 
		RULE_instanceOfExpression = 12, RULE_relationalExpression = 13, RULE_relationalOp = 14, 
		RULE_shiftExpression = 15, RULE_shiftOp = 16, RULE_additiveExpression = 17, 
		RULE_multiplicativeExpression = 18, RULE_unaryExpression = 19, RULE_unaryExpressionNotPlusMinus = 20, 
		RULE_castExpression = 21, RULE_primary = 22, RULE_expressionList = 23, 
		RULE_literal = 24;
	public static final String[] ruleNames = {
		"conditionalOrExpression", "propertyModel", "type", "dimensions", "expression", 
		"assignmentOperator", "conditionalExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"instanceOfExpression", "relationalExpression", "relationalOp", "shiftExpression", 
		"shiftOp", "additiveExpression", "multiplicativeExpression", "unaryExpression", 
		"unaryExpressionNotPlusMinus", "castExpression", "primary", "expressionList", 
		"literal"
	};

	@Override
	public String getGrammarFileName() { return "CoreRebecaPropertyComplete.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoreRebecaPropertyCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalAndExpressionContext e1;
		public Token BARBAR;
		public Token THEN;
		public ConditionalAndExpressionContext e2;
		public TerminalNode THEN(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.THEN, i);
		}
		public List<TerminalNode> BARBAR() { return getTokens(CoreRebecaPropertyCompleteParser.BARBAR); }
		public TerminalNode BARBAR(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.BARBAR, i);
		}
		public List<TerminalNode> THEN() { return getTokens(CoreRebecaPropertyCompleteParser.THEN); }
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50); ((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression();
					setState(57);
					switch (_input.LA(1)) {
					case BARBAR:
						{
						setState(53); ((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
						e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null));
						}
						break;
					case THEN:
						{
						setState(55); ((ConditionalOrExpressionContext)_localctx).THEN = match(THEN);
						e3.setOperator((((ConditionalOrExpressionContext)_localctx).THEN!=null?((ConditionalOrExpressionContext)_localctx).THEN.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(59); ((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					e3.setLeft(((ConditionalOrExpressionContext)_localctx).e1.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(((ConditionalOrExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((ConditionalOrExpressionContext)_localctx).e1.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class PropertyModelContext extends ParserRuleContext {
		public PropertyModel pm;
		public Token id;
		public ExpressionContext e;
		public ExpressionContext ltle;
		public ExpressionContext ctle;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> COLON() { return getTokens(CoreRebecaPropertyCompleteParser.COLON); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACE(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LBRACE, i);
		}
		public TerminalNode LTL() { return getToken(CoreRebecaPropertyCompleteParser.LTL, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CoreRebecaPropertyCompleteParser.RBRACE); }
		public TerminalNode PROPERTY() { return getToken(CoreRebecaPropertyCompleteParser.PROPERTY, 0); }
		public TerminalNode EQ(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.EQ, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaPropertyCompleteParser.IDENTIFIER); }
		public List<TerminalNode> LBRACE() { return getTokens(CoreRebecaPropertyCompleteParser.LBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> EQ() { return getTokens(CoreRebecaPropertyCompleteParser.EQ); }
		public TerminalNode DEFINE() { return getToken(CoreRebecaPropertyCompleteParser.DEFINE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode COLON(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.COLON, i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.SEMI, i);
		}
		public TerminalNode CTL() { return getToken(CoreRebecaPropertyCompleteParser.CTL, 0); }
		public PropertyModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterPropertyModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitPropertyModel(this);
		}
	}

	public final PropertyModelContext propertyModel() throws RecognitionException {
		PropertyModelContext _localctx = new PropertyModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_propertyModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PropertyModelContext)_localctx).pm =  new PropertyModel();
			setState(68); match(PROPERTY);
			setState(69); match(LBRACE);
			setState(84);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(70); match(DEFINE);
				setState(71); match(LBRACE);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(72); ((PropertyModelContext)_localctx).id = match(IDENTIFIER);
					setState(73); match(EQ);
					setState(74); ((PropertyModelContext)_localctx).e = expression();

								Definition definition = new Definition();
								definition.setName((((PropertyModelContext)_localctx).id!=null?((PropertyModelContext)_localctx).id.getText():null));
								definition.setExpression(((PropertyModelContext)_localctx).e.e);
								_localctx.pm.getDefinitions().add(definition);
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

			setState(100);
			_la = _input.LA(1);
			if (_la==LTL) {
				{
				setState(86); match(LTL);
				setState(87); match(LBRACE);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(88); ((PropertyModelContext)_localctx).id = match(IDENTIFIER);
					setState(89); match(COLON);
					setState(90); ((PropertyModelContext)_localctx).ltle = expression();

								LTLDefinition ltlDefinition = new LTLDefinition();
								ltlDefinition.setName((((PropertyModelContext)_localctx).id!=null?((PropertyModelContext)_localctx).id.getText():null));
								ltlDefinition.setExpression(((PropertyModelContext)_localctx).ltle.e);
								_localctx.pm.getLTLDefinitions().add(ltlDefinition);
					setState(92); match(SEMI);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99); match(RBRACE);
				}
			}

			setState(116);
			_la = _input.LA(1);
			if (_la==CTL) {
				{
				setState(102); match(CTL);
				setState(103); match(LBRACE);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(104); ((PropertyModelContext)_localctx).id = match(IDENTIFIER);
					setState(105); match(COLON);
					setState(106); ((PropertyModelContext)_localctx).ctle = expression();

								CTLDefinition ctlDefinition = new CTLDefinition();
								ctlDefinition.setName((((PropertyModelContext)_localctx).id!=null?((PropertyModelContext)_localctx).id.getText():null));
								ctlDefinition.setExpression(((PropertyModelContext)_localctx).ctle.e);
								_localctx.pm.getCTLDefinitions().add(ctlDefinition);
					setState(108); match(SEMI);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115); match(RBRACE);
				}
			}

			setState(118); match(RBRACE);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitType(this);
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
			setState(121); ((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(126);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(123); ((TypeContext)_localctx).ds = dimensions();
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
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.INTLITERAL, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.RBRACKET); }
		public List<TerminalNode> INTLITERAL() { return getTokens(CoreRebecaPropertyCompleteParser.INTLITERAL); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitDimensions(this);
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
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129); match(LBRACKET);
				setState(130); ((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(131); match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(135); 
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); ((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(139); ((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(140); ((ExpressionContext)_localctx).e2 = expression();
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
		public TerminalNode SUBEQ() { return getToken(CoreRebecaPropertyCompleteParser.SUBEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(CoreRebecaPropertyCompleteParser.TILDAEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(CoreRebecaPropertyCompleteParser.CARETEQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(CoreRebecaPropertyCompleteParser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(CoreRebecaPropertyCompleteParser.PERCENTEQ, 0); }
		public TerminalNode BAREQ() { return getToken(CoreRebecaPropertyCompleteParser.BAREQ, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaPropertyCompleteParser.EQ, 0); }
		public TerminalNode AMPEQ() { return getToken(CoreRebecaPropertyCompleteParser.AMPEQ, 0); }
		public TerminalNode STAREQ() { return getToken(CoreRebecaPropertyCompleteParser.STAREQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(CoreRebecaPropertyCompleteParser.PLUSEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(CoreRebecaPropertyCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(CoreRebecaPropertyCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentOperator);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); ((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); ((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); ((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(151); ((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(153); ((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(155); ((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(157); ((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(159); ((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(161); ((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(163); ((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(165); ((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(167); ((AssignmentOperatorContext)_localctx).GTGTEQ = match(GTGTEQ);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaPropertyCompleteParser.COLON, 0); }
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUES() { return getToken(CoreRebecaPropertyCompleteParser.QUES, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); ((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(173); match(QUES);
				setState(174); ((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(175); match(COLON);
				setState(176); ((ConditionalExpressionContext)_localctx).e3 = conditionalExpression();
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public Expression e;
		public InclusiveOrExpressionContext e1;
		public Token AMPAMP;
		public InclusiveOrExpressionContext e2;
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public List<TerminalNode> AMPAMP() { return getTokens(CoreRebecaPropertyCompleteParser.AMPAMP); }
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public TerminalNode AMPAMP(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181); ((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(183); ((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(184); ((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(((ConditionalAndExpressionContext)_localctx).e1.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(((ConditionalAndExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((ConditionalAndExpressionContext)_localctx).e1.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(191);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ExclusiveOrExpressionContext e1;
		public Token BAR;
		public ExclusiveOrExpressionContext e2;
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public TerminalNode BAR(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.BAR, i);
		}
		public List<TerminalNode> BAR() { return getTokens(CoreRebecaPropertyCompleteParser.BAR); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192); ((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(194); ((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(195); ((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(((InclusiveOrExpressionContext)_localctx).e1.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(((InclusiveOrExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((InclusiveOrExpressionContext)_localctx).e1.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(202);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public AndExpressionContext e1;
		public Token CARET;
		public AndExpressionContext e2;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public TerminalNode CARET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.CARET, i);
		}
		public List<TerminalNode> CARET() { return getTokens(CoreRebecaPropertyCompleteParser.CARET); }
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203); ((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(205); ((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(206); ((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(((ExclusiveOrExpressionContext)_localctx).e1.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(((ExclusiveOrExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((ExclusiveOrExpressionContext)_localctx).e1.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(213);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression e;
		public EqualityExpressionContext e1;
		public Token AMP;
		public EqualityExpressionContext e2;
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public TerminalNode AMP(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.AMP, i);
		}
		public List<TerminalNode> AMP() { return getTokens(CoreRebecaPropertyCompleteParser.AMP); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214); ((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(216); ((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(217); ((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(((AndExpressionContext)_localctx).e1.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(((AndExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((AndExpressionContext)_localctx).e1.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<TerminalNode> BANGEQ() { return getTokens(CoreRebecaPropertyCompleteParser.BANGEQ); }
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public TerminalNode EQEQ(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.EQEQ, i);
		}
		public TerminalNode BANGEQ(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.BANGEQ, i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(CoreRebecaPropertyCompleteParser.EQEQ); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225); ((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
					setState(232);
					switch (_input.LA(1)) {
					case EQEQ:
						{
						setState(228); ((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
						((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
						}
						break;
					case BANGEQ:
						{
						setState(230); ((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
						((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(234); ((EqualityExpressionContext)_localctx).e2 = instanceOfExpression();
					((BinaryExpression)_localctx.e).setRight(((EqualityExpressionContext)_localctx).e2.e);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); ((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
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
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245); ((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(247); ((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(248); ((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(((RelationalExpressionContext)_localctx).e1.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(((RelationalExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((RelationalExpressionContext)_localctx).e1.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(255);
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
		public TerminalNode GT() { return getToken(CoreRebecaPropertyCompleteParser.GT, 0); }
		public TerminalNode LT() { return getToken(CoreRebecaPropertyCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaPropertyCompleteParser.EQ, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationalOp);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); ((RelationalOpContext)_localctx).LT = match(LT);
				setState(257); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); ((RelationalOpContext)_localctx).GT = match(GT);
				setState(260); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262); ((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264); ((RelationalOpContext)_localctx).GT = match(GT);
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
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268); ((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(270); ((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(271); ((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(((ShiftExpressionContext)_localctx).e1.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(((ShiftExpressionContext)_localctx).e1.e.getLineNumber()); e3.setCharacter(((ShiftExpressionContext)_localctx).e1.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(278);
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
		public List<TerminalNode> GT() { return getTokens(CoreRebecaPropertyCompleteParser.GT); }
		public List<TerminalNode> LT() { return getTokens(CoreRebecaPropertyCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LT, i);
		}
		public TerminalNode GT(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shiftOp);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(LT);
				setState(280); match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(GT);
				setState(283); match(GT);
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
		public List<TerminalNode> SUB() { return getTokens(CoreRebecaPropertyCompleteParser.SUB); }
		public List<TerminalNode> PLUS() { return getTokens(CoreRebecaPropertyCompleteParser.PLUS); }
		public TerminalNode SUB(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.SUB, i);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.PLUS, i);
		}
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287); ((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					((AdditiveExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((AdditiveExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((AdditiveExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((AdditiveExpressionContext)_localctx).e1.e.getCharacter());
					setState(294);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(290); ((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						((BinaryExpression)_localctx.e).setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(292); ((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						((BinaryExpression)_localctx.e).setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(296); ((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					((BinaryExpression)_localctx.e).setRight(((AdditiveExpressionContext)_localctx).e2.e);
					}
					} 
				}
				setState(303);
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
		public List<TerminalNode> SLASH() { return getTokens(CoreRebecaPropertyCompleteParser.SLASH); }
		public List<TerminalNode> STAR() { return getTokens(CoreRebecaPropertyCompleteParser.STAR); }
		public TerminalNode PERCENT(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.PERCENT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CoreRebecaPropertyCompleteParser.PERCENT); }
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public TerminalNode SLASH(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.SLASH, i);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public TerminalNode STAR(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.STAR, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304); ((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					((MultiplicativeExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((MultiplicativeExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((MultiplicativeExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((MultiplicativeExpressionContext)_localctx).e1.e.getCharacter());
					setState(313);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(307); ((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						((BinaryExpression)_localctx.e).setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(309); ((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						((BinaryExpression)_localctx.e).setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(311); ((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						((BinaryExpression)_localctx.e).setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(315); ((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					((BinaryExpression)_localctx.e).setRight(((MultiplicativeExpressionContext)_localctx).e2.e);
					}
					} 
				}
				setState(322);
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
		public TerminalNode SUB() { return getToken(CoreRebecaPropertyCompleteParser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(CoreRebecaPropertyCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TerminalNode SUBSUB() { return getToken(CoreRebecaPropertyCompleteParser.SUBSUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(342);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); match(PLUS);
				setState(324); ((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); ((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(328); ((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(331); ((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(332); ((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(335); ((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(336); ((UnaryExpressionContext)_localctx).ess = unaryExpression();
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
				enterOuterAlt(_localctx, 5);
				{
				setState(339); ((UnaryExpressionContext)_localctx).eu = unaryExpressionNotPlusMinus();
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
		public Token DOT;
		public PrimaryContext p2;
		public Token PLUSPLUS;
		public Token SUBSUB;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaPropertyCompleteParser.RPAREN, 0); }
		public TerminalNode DOT(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.DOT, i);
		}
		public TerminalNode TILDA() { return getToken(CoreRebecaPropertyCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SUBSUB() { return getToken(CoreRebecaPropertyCompleteParser.SUBSUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public TerminalNode BANG() { return getToken(CoreRebecaPropertyCompleteParser.BANG, 0); }
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public List<TerminalNode> DOT() { return getTokens(CoreRebecaPropertyCompleteParser.DOT); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaPropertyCompleteParser.LPAREN, 0); }
		public TerminalNode QUES() { return getToken(CoreRebecaPropertyCompleteParser.QUES, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExpressionNotPlusMinus);
		try {
			int _alt;
			setState(389);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(344); ((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(345); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(348); ((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(349); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
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
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(352); ((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;

				case 2:
					{
					setState(355); match(LPAREN);
					setState(356); ((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(358); match(RPAREN);
					}
					break;

				case 3:
					{
					setState(360); ((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;

				case 4:
					{
					setState(363); ((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;

				case 5:
					{
					setState(366); ((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(367); match(LPAREN);
					setState(368); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(369); match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(374); ((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(375); ((UnaryExpressionNotPlusMinusContext)_localctx).p2 = primary();

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
					setState(382);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(387);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(383); ((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;

				case 2:
					{
					setState(385); ((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB = match(SUBSUB);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaPropertyCompleteParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaPropertyCompleteParser.LPAREN, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(LPAREN);
			setState(392); ((CastExpressionContext)_localctx).t = type();
			setState(393); match(RPAREN);
			setState(394); ((CastExpressionContext)_localctx).e1 = expression();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaPropertyCompleteParser.RPAREN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.RBRACKET); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaPropertyCompleteParser.LPAREN, 0); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); ((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(407);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(399); ((PrimaryContext)_localctx).lp = match(LPAREN);
				ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(404);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(401); ((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(406); match(RPAREN);
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(409); match(LBRACKET);
				setState(410); ((PrimaryContext)_localctx).e2 = expression();
				setState(411); match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(418);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaPropertyCompleteParser.COMMA); }
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>();
			setState(420); ((ExpressionListContext)_localctx).e = expression();
			_localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(422); match(COMMA);
				setState(423); ((ExpressionListContext)_localctx).e = expression();
				_localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(430);
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
		public TerminalNode INTLITERAL() { return getToken(CoreRebecaPropertyCompleteParser.INTLITERAL, 0); }
		public TerminalNode FALSE() { return getToken(CoreRebecaPropertyCompleteParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(CoreRebecaPropertyCompleteParser.TRUE, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(CoreRebecaPropertyCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(CoreRebecaPropertyCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode NULL() { return getToken(CoreRebecaPropertyCompleteParser.NULL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(CoreRebecaPropertyCompleteParser.CHARLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(CoreRebecaPropertyCompleteParser.DOUBLELITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(447);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(431); ((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(TypesUtilities.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(433); ((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(435); ((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(437); ((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(439); ((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(441); ((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(443); ((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(445); ((LiteralContext)_localctx).NULL = match(NULL);
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

	public static final String _serializedATN =
		"\2\3?\u01c4\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2<\n\2\3"+
		"\2\3\2\3\2\7\2A\n\2\f\2\16\2D\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3Q\n\3\f\3\16\3T\13\3\3\3\5\3W\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3\3\3\5\3g\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\3\5\3w\n\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\3\5\3\5\6\5\u0088\n\5\r\5\16\5\u0089"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0092\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b6\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u00be\n\t\f\t\16\t\u00c1\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c9"+
		"\n\n\f\n\16\n\u00cc\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d4\n\13"+
		"\f\13\16\13\u00d7\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00df\n\f\f\f\16\f"+
		"\u00e2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00eb\n\r\3\r\3\r\3\r\7\r"+
		"\u00f0\n\r\f\r\16\r\u00f3\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00fe\n\17\f\17\16\17\u0101\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u010d\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0115\n\21\f\21\16\21\u0118\13\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0120\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0129\n\23\3"+
		"\23\3\23\3\23\7\23\u012e\n\23\f\23\16\23\u0131\13\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u013c\n\24\3\24\3\24\3\24\7\24\u0141"+
		"\n\24\f\24\16\24\u0144\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0159\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0177\n\26\3\26\3\26\3\26\3\26\7\26\u017d\n\26\f\26\16\26\u0180"+
		"\13\26\3\26\3\26\3\26\3\26\5\26\u0186\n\26\5\26\u0188\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0197\n\30"+
		"\3\30\5\30\u019a\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u01a1\n\30\f\30\16"+
		"\30\u01a4\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01ad\n\31\f\31"+
		"\16\31\u01b0\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c2\n\32\3\32\2\33\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\u01ea\2\64\3\2\2\2\4E\3\2"+
		"\2\2\6z\3\2\2\2\b\u0082\3\2\2\2\n\u008b\3\2\2\2\f\u00ab\3\2\2\2\16\u00ad"+
		"\3\2\2\2\20\u00b7\3\2\2\2\22\u00c2\3\2\2\2\24\u00cd\3\2\2\2\26\u00d8\3"+
		"\2\2\2\30\u00e3\3\2\2\2\32\u00f4\3\2\2\2\34\u00f7\3\2\2\2\36\u010c\3\2"+
		"\2\2 \u010e\3\2\2\2\"\u011f\3\2\2\2$\u0121\3\2\2\2&\u0132\3\2\2\2(\u0158"+
		"\3\2\2\2*\u0187\3\2\2\2,\u0189\3\2\2\2.\u018f\3\2\2\2\60\u01a5\3\2\2\2"+
		"\62\u01c1\3\2\2\2\64\65\5\20\t\2\65B\b\2\1\2\66;\b\2\1\2\678\7#\2\28<"+
		"\b\2\1\29:\7\6\2\2:<\b\2\1\2;\67\3\2\2\2;9\3\2\2\2<=\3\2\2\2=>\5\20\t"+
		"\2>?\b\2\1\2?A\3\2\2\2@\66\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\3\3"+
		"\2\2\2DB\3\2\2\2EF\b\3\1\2FG\7\7\2\2GV\7\25\2\2HI\7\3\2\2IR\7\25\2\2J"+
		"K\7?\2\2KL\7\34\2\2LM\5\n\6\2MN\b\3\1\2NO\7\31\2\2OQ\3\2\2\2PJ\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UW\7\26\2\2VH\3\2\2"+
		"\2VW\3\2\2\2Wf\3\2\2\2XY\7\4\2\2Yb\7\25\2\2Z[\7?\2\2[\\\7 \2\2\\]\5\n"+
		"\6\2]^\b\3\1\2^_\7\31\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2ce\3\2\2\2db\3\2\2\2eg\7\26\2\2fX\3\2\2\2fg\3\2\2\2gv\3\2\2\2hi"+
		"\7\5\2\2ir\7\25\2\2jk\7?\2\2kl\7 \2\2lm\5\n\6\2mn\b\3\1\2no\7\31\2\2o"+
		"q\3\2\2\2pj\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2"+
		"uw\7\26\2\2vh\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\26\2\2y\5\3\2\2\2z{\b\4"+
		"\1\2{|\7?\2\2|\u0080\b\4\1\2}~\5\b\5\2~\177\b\4\1\2\177\u0081\3\2\2\2"+
		"\u0080}\3\2\2\2\u0080\u0081\3\2\2\2\u0081\7\3\2\2\2\u0082\u0087\b\5\1"+
		"\2\u0083\u0084\7\27\2\2\u0084\u0085\7\b\2\2\u0085\u0086\7\30\2\2\u0086"+
		"\u0088\b\5\1\2\u0087\u0083\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\t\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u0091"+
		"\b\6\1\2\u008d\u008e\5\f\7\2\u008e\u008f\5\n\6\2\u008f\u0090\b\6\1\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0092\3\2\2\2\u0092\13\3\2\2"+
		"\2\u0093\u0094\7\34\2\2\u0094\u00ac\b\7\1\2\u0095\u0096\7.\2\2\u0096\u00ac"+
		"\b\7\1\2\u0097\u0098\7/\2\2\u0098\u00ac\b\7\1\2\u0099\u009a\7\60\2\2\u009a"+
		"\u00ac\b\7\1\2\u009b\u009c\7\61\2\2\u009c\u00ac\b\7\1\2\u009d\u009e\7"+
		"\62\2\2\u009e\u00ac\b\7\1\2\u009f\u00a0\7\63\2\2\u00a0\u00ac\b\7\1\2\u00a1"+
		"\u00a2\7\64\2\2\u00a2\u00ac\b\7\1\2\u00a3\u00a4\7\65\2\2\u00a4\u00ac\b"+
		"\7\1\2\u00a5\u00a6\7\66\2\2\u00a6\u00ac\b\7\1\2\u00a7\u00a8\7<\2\2\u00a8"+
		"\u00ac\b\7\1\2\u00a9\u00aa\7>\2\2\u00aa\u00ac\b\7\1\2\u00ab\u0093\3\2"+
		"\2\2\u00ab\u0095\3\2\2\2\u00ab\u0097\3\2\2\2\u00ab\u0099\3\2\2\2\u00ab"+
		"\u009b\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a1\3\2"+
		"\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ae\5\2\2\2\u00ae\u00b5\b\b\1\2"+
		"\u00af\u00b0\7\37\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\7 \2\2\u00b2\u00b3"+
		"\5\16\b\2\u00b3\u00b4\b\b\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00af\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\17\3\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00bf"+
		"\b\t\1\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\b\t\1\2"+
		"\u00bc\u00be\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\5\24\13\2\u00c3\u00ca\b\n\1\2\u00c4\u00c5\7+\2\2\u00c5\u00c6\5"+
		"\24\13\2\u00c6\u00c7\b\n\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\23\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00d5\b\13\1\2\u00cf"+
		"\u00d0\7,\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\b\13\1\2\u00d2\u00d4\3"+
		"\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\30\r"+
		"\2\u00d9\u00e0\b\f\1\2\u00da\u00db\7*\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd"+
		"\b\f\1\2\u00dd\u00df\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e0\3\2\2"+
		"\2\u00e3\u00e4\5\32\16\2\u00e4\u00f1\b\r\1\2\u00e5\u00ea\b\r\1\2\u00e6"+
		"\u00e7\7!\2\2\u00e7\u00eb\b\r\1\2\u00e8\u00e9\78\2\2\u00e9\u00eb\b\r\1"+
		"\2\u00ea\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\5\32\16\2\u00ed\u00ee\b\r\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00e5\3\2\2\2"+
		"\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\31"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\5\34\17\2\u00f5\u00f6\b\16\1"+
		"\2\u00f6\33\3\2\2\2\u00f7\u00f8\5 \21\2\u00f8\u00ff\b\17\1\2\u00f9\u00fa"+
		"\5\36\20\2\u00fa\u00fb\5 \21\2\u00fb\u00fc\b\17\1\2\u00fc\u00fe\3\2\2"+
		"\2\u00fd\u00f9\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\35\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7:\2\2\u0103"+
		"\u0104\7\34\2\2\u0104\u010d\b\20\1\2\u0105\u0106\79\2\2\u0106\u0107\7"+
		"\34\2\2\u0107\u010d\b\20\1\2\u0108\u0109\7:\2\2\u0109\u010d\b\20\1\2\u010a"+
		"\u010b\79\2\2\u010b\u010d\b\20\1\2\u010c\u0102\3\2\2\2\u010c\u0105\3\2"+
		"\2\2\u010c\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010d\37\3\2\2\2\u010e\u010f"+
		"\5$\23\2\u010f\u0116\b\21\1\2\u0110\u0111\5\"\22\2\u0111\u0112\5$\23\2"+
		"\u0112\u0113\b\21\1\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117!\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\7:\2\2\u011a\u011b\7:\2\2\u011b\u0120\b\22"+
		"\1\2\u011c\u011d\79\2\2\u011d\u011e\79\2\2\u011e\u0120\b\22\1\2\u011f"+
		"\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120#\3\2\2\2\u0121\u0122\5&\24\2"+
		"\u0122\u012f\b\23\1\2\u0123\u0128\b\23\1\2\u0124\u0125\7&\2\2\u0125\u0129"+
		"\b\23\1\2\u0126\u0127\7\'\2\2\u0127\u0129\b\23\1\2\u0128\u0124\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5&\24\2\u012b\u012c"+
		"\b\23\1\2\u012c\u012e\3\2\2\2\u012d\u0123\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130%\3\2\2\2\u0131\u012f\3"+
		"\2\2\2\u0132\u0133\5(\25\2\u0133\u0142\b\24\1\2\u0134\u013b\b\24\1\2\u0135"+
		"\u0136\7(\2\2\u0136\u013c\b\24\1\2\u0137\u0138\7)\2\2\u0138\u013c\b\24"+
		"\1\2\u0139\u013a\7-\2\2\u013a\u013c\b\24\1\2\u013b\u0135\3\2\2\2\u013b"+
		"\u0137\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\5("+
		"\25\2\u013e\u013f\b\24\1\2\u013f\u0141\3\2\2\2\u0140\u0134\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\'\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0145\u0146\7&\2\2\u0146\u0147\5(\25\2\u0147\u0148"+
		"\b\25\1\2\u0148\u0159\3\2\2\2\u0149\u014a\7\'\2\2\u014a\u014b\5(\25\2"+
		"\u014b\u014c\b\25\1\2\u014c\u0159\3\2\2\2\u014d\u014e\7$\2\2\u014e\u014f"+
		"\5(\25\2\u014f\u0150\b\25\1\2\u0150\u0159\3\2\2\2\u0151\u0152\7%\2\2\u0152"+
		"\u0153\5(\25\2\u0153\u0154\b\25\1\2\u0154\u0159\3\2\2\2\u0155\u0156\5"+
		"*\26\2\u0156\u0157\b\25\1\2\u0157\u0159\3\2\2\2\u0158\u0145\3\2\2\2\u0158"+
		"\u0149\3\2\2\2\u0158\u014d\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0155\3\2"+
		"\2\2\u0159)\3\2\2\2\u015a\u015b\7\36\2\2\u015b\u015c\5(\25\2\u015c\u015d"+
		"\b\26\1\2\u015d\u0188\3\2\2\2\u015e\u015f\7\35\2\2\u015f\u0160\5(\25\2"+
		"\u0160\u0161\b\26\1\2\u0161\u0188\3\2\2\2\u0162\u0163\5,\27\2\u0163\u0164"+
		"\b\26\1\2\u0164\u0177\3\2\2\2\u0165\u0166\7\23\2\2\u0166\u0167\5\n\6\2"+
		"\u0167\u0168\b\26\1\2\u0168\u0169\7\24\2\2\u0169\u0177\3\2\2\2\u016a\u016b"+
		"\5.\30\2\u016b\u016c\b\26\1\2\u016c\u0177\3\2\2\2\u016d\u016e\5\62\32"+
		"\2\u016e\u016f\b\26\1\2\u016f\u0177\3\2\2\2\u0170\u0171\7\37\2\2\u0171"+
		"\u0172\7\23\2\2\u0172\u0173\5\60\31\2\u0173\u0174\7\24\2\2\u0174\u0175"+
		"\b\26\1\2\u0175\u0177\3\2\2\2\u0176\u0162\3\2\2\2\u0176\u0165\3\2\2\2"+
		"\u0176\u016a\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0170\3\2\2\2\u0177\u017e"+
		"\3\2\2\2\u0178\u0179\7\33\2\2\u0179\u017a\5.\30\2\u017a\u017b\b\26\1\2"+
		"\u017b\u017d\3\2\2\2\u017c\u0178\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0185\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\7$\2\2\u0182\u0186\b\26\1\2\u0183\u0184\7%\2\2\u0184\u0186\b\26"+
		"\1\2\u0185\u0181\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u015a\3\2\2\2\u0187\u015e\3\2\2\2\u0187\u0176\3\2"+
		"\2\2\u0188+\3\2\2\2\u0189\u018a\7\23\2\2\u018a\u018b\5\6\4\2\u018b\u018c"+
		"\7\24\2\2\u018c\u018d\5\n\6\2\u018d\u018e\b\27\1\2\u018e-\3\2\2\2\u018f"+
		"\u0190\7?\2\2\u0190\u0199\b\30\1\2\u0191\u0192\7\23\2\2\u0192\u0196\b"+
		"\30\1\2\u0193\u0194\5\60\31\2\u0194\u0195\b\30\1\2\u0195\u0197\3\2\2\2"+
		"\u0196\u0193\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a"+
		"\7\24\2\2\u0199\u0191\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01a2\3\2\2\2"+
		"\u019b\u019c\7\27\2\2\u019c\u019d\5\n\6\2\u019d\u019e\7\30\2\2\u019e\u019f"+
		"\b\30\1\2\u019f\u01a1\3\2\2\2\u01a0\u019b\3\2\2\2\u01a1\u01a4\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3/\3\2\2\2\u01a4\u01a2\3"+
		"\2\2\2\u01a5\u01a6\b\31\1\2\u01a6\u01a7\5\n\6\2\u01a7\u01ae\b\31\1\2\u01a8"+
		"\u01a9\7\32\2\2\u01a9\u01aa\5\n\6\2\u01aa\u01ab\b\31\1\2\u01ab\u01ad\3"+
		"\2\2\2\u01ac\u01a8\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\61\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\b\2"+
		"\2\u01b2\u01c2\b\32\1\2\u01b3\u01b4\7\t\2\2\u01b4\u01c2\b\32\1\2\u01b5"+
		"\u01b6\7\n\2\2\u01b6\u01c2\b\32\1\2\u01b7\u01b8\7\13\2\2\u01b8\u01c2\b"+
		"\32\1\2\u01b9\u01ba\7\f\2\2\u01ba\u01c2\b\32\1\2\u01bb\u01bc\7\20\2\2"+
		"\u01bc\u01c2\b\32\1\2\u01bd\u01be\7\21\2\2\u01be\u01c2\b\32\1\2\u01bf"+
		"\u01c0\7\22\2\2\u01c0\u01c2\b\32\1\2\u01c1\u01b1\3\2\2\2\u01c1\u01b3\3"+
		"\2\2\2\u01c1\u01b5\3\2\2\2\u01c1\u01b7\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1"+
		"\u01bb\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\63\3\2\2"+
		"\2\';BRVbfrv\u0080\u0089\u0091\u00ab\u00b5\u00bf\u00ca\u00d5\u00e0\u00ea"+
		"\u00f1\u00ff\u010c\u0116\u011f\u0128\u012f\u013b\u0142\u0158\u0176\u017e"+
		"\u0185\u0187\u0196\u0199\u01a2\u01ae\u01c1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}