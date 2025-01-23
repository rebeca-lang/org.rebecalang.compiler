// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/TimedRebecaPropertyComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Label;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;

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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TCTL=1, DEFINE=2, THEN=3, PROPERTY=4, ASSERTION=5, INTLITERAL=6, FLOATLITERAL=7, 
		DOUBLELITERAL=8, CHARLITERAL=9, STRINGLITERAL=10, WS=11, COMMENT=12, LINE_COMMENT=13, 
		INSTANCEOF=14, NEW=15, TRUE=16, FALSE=17, NULL=18, LPAREN=19, RPAREN=20, 
		LBRACE=21, RBRACE=22, LBRACKET=23, RBRACKET=24, SEMI=25, COMMA=26, DOT=27, 
		EQ=28, BANG=29, TILDA=30, QUES=31, COLON=32, EQEQ=33, AMPAMP=34, BARBAR=35, 
		PLUSPLUS=36, SUBSUB=37, PLUS=38, SUB=39, STAR=40, SLASH=41, AMP=42, BAR=43, 
		CARET=44, PERCENT=45, PLUSEQ=46, SUBEQ=47, STAREQ=48, SLASHEQ=49, AMPEQ=50, 
		BAREQ=51, CARETEQ=52, TILDAEQ=53, PERCENTEQ=54, MONKEYS_AT=55, BANGEQ=56, 
		GT=57, LT=58, LTLT=59, LTLTEQ=60, GTGT=61, GTGTEQ=62, IDENTIFIER=63;
	public static final int
		RULE_propertyDefinition = 0, RULE_assertionBlock = 1, RULE_tctlBlock = 2, 
		RULE_annotation = 3, RULE_type = 4, RULE_genericTypeParams = 5, RULE_dimensions = 6, 
		RULE_expression = 7, RULE_assignmentOperator = 8, RULE_multiplicativeOp = 9, 
		RULE_additiveOp = 10, RULE_relationalOp = 11, RULE_shiftOp = 12, RULE_equalityOp = 13, 
		RULE_unaryExpression = 14, RULE_coreExpression = 15, RULE_castExpression = 16, 
		RULE_primary = 17, RULE_expressionList = 18, RULE_literal = 19, RULE_propertyModel = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"propertyDefinition", "assertionBlock", "tctlBlock", "annotation", "type", 
			"genericTypeParams", "dimensions", "expression", "assignmentOperator", 
			"multiplicativeOp", "additiveOp", "relationalOp", "shiftOp", "equalityOp", 
			"unaryExpression", "coreExpression", "castExpression", "primary", "expressionList", 
			"literal", "propertyModel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TCTL'", "'define'", "'->'", "'property'", "'Assertion'", null, 
			null, null, null, null, null, null, null, "'instanceof'", "'new'", "'true'", 
			"'false'", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", "'=='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'~='", "'%='", 
			"'@'", "'!='", "'>'", "'<'", "'<<'", "'<<='", "'>>'", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TCTL", "DEFINE", "THEN", "PROPERTY", "ASSERTION", "INTLITERAL", 
			"FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "WS", 
			"COMMENT", "LINE_COMMENT", "INSTANCEOF", "NEW", "TRUE", "FALSE", "NULL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", 
			"COMMA", "DOT", "EQ", "BANG", "TILDA", "QUES", "COLON", "EQEQ", "AMPAMP", 
			"BARBAR", "PLUSPLUS", "SUBSUB", "PLUS", "SUB", "STAR", "SLASH", "AMP", 
			"BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", 
			"BAREQ", "CARETEQ", "TILDAEQ", "PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", 
			"LT", "LTLT", "LTLTEQ", "GTGT", "GTGTEQ", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TimedRebecaPropertyComplete.g4"; }

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
		public AssertionBlockContext assertionBlock() {
			return getRuleContext(AssertionBlockContext.class,0);
		}
		public TctlBlockContext tctlBlock() {
			return getRuleContext(TctlBlockContext.class,0);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSERTION) {
				{
				setState(42);
				assertionBlock();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TCTL) {
				{
				setState(45);
				tctlBlock();
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

	public static class AssertionBlockContext extends ParserRuleContext {
		public List<AssertionDefinition> assertions;
		public TerminalNode ASSERTION() { return getToken(TimedRebecaPropertyCompleteParser.ASSERTION, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaPropertyCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaPropertyCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaPropertyCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(TimedRebecaPropertyCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.SEMI, i);
		}
		public AssertionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterAssertionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitAssertionBlock(this);
		}
	}

	public final AssertionBlockContext assertionBlock() throws RecognitionException {
		AssertionBlockContext _localctx = new AssertionBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assertionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ASSERTION);
			setState(49);
			match(LBRACE);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(50);
				match(IDENTIFIER);
				setState(51);
				match(COLON);
				setState(52);
				expression(0);
				setState(53);
				match(SEMI);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(RBRACE);
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

	public static class TctlBlockContext extends ParserRuleContext {
		public List<TCTLDefinition> tctls;
		public TerminalNode TCTL() { return getToken(TimedRebecaPropertyCompleteParser.TCTL, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaPropertyCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaPropertyCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaPropertyCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(TimedRebecaPropertyCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.SEMI, i);
		}
		public TctlBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tctlBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterTctlBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitTctlBlock(this);
		}
	}

	public final TctlBlockContext tctlBlock() throws RecognitionException {
		TctlBlockContext _localctx = new TctlBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tctlBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TCTL);
			setState(63);
			match(LBRACE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(64);
				match(IDENTIFIER);
				setState(65);
				match(COLON);
				setState(66);
				expression(0);
				setState(67);
				match(SEMI);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(RBRACE);
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
		public TerminalNode MONKEYS_AT() { return getToken(TimedRebecaPropertyCompleteParser.MONKEYS_AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaPropertyCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaPropertyCompleteParser.RPAREN, 0); }
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
		enterRule(_localctx, 6, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(77);
			match(MONKEYS_AT);
			setState(78);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				match(LPAREN);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(81);
					((AnnotationContext)_localctx).exp = expression(0);
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(86);
				match(RPAREN);
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

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public Token typeName;
		public GenericTypeParamsContext gts;
		public DimensionsContext ds;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public GenericTypeParamsContext genericTypeParams() {
			return getRuleContext(GenericTypeParamsContext.class,0);
		}
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(91);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(96);
				((TypeContext)_localctx).ds = dimensions();
				OrdinaryPrimitiveType newpt = (OrdinaryPrimitiveType)_localctx.t; ((TypeContext)_localctx).t =  new ArrayType(); ((ArrayType)_localctx.t).setOrdinaryPrimitiveType(newpt); ((ArrayType)_localctx.t).getDimensions().addAll(((TypeContext)_localctx).ds.ds);
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

	public static class GenericTypeParamsContext extends ParserRuleContext {
		public List<Type> gts;
		public TypeContext t;
		public TerminalNode LT() { return getToken(TimedRebecaPropertyCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaPropertyCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaPropertyCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(103);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(105);
				match(COMMA);
				setState(106);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(GT);
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
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(TimedRebecaPropertyCompleteParser.INTLITERAL); }
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
		enterRule(_localctx, 12, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117);
					match(LBRACKET);
					setState(118);
					((DimensionsContext)_localctx).i = match(INTLITERAL);
					setState(119);
					match(RBRACKET);
					_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public ExpressionContext me1;
		public ExpressionContext ae1;
		public ExpressionContext se1;
		public ExpressionContext re1;
		public ExpressionContext ie1;
		public ExpressionContext ee1;
		public ExpressionContext ane1;
		public ExpressionContext ce1;
		public ExpressionContext be1;
		public ExpressionContext aae1;
		public ExpressionContext bbe1;
		public ExpressionContext cee1;
		public ExpressionContext ase1;
		public CoreExpressionContext ece;
		public UnaryExpressionContext ue;
		public MultiplicativeOpContext mo;
		public ExpressionContext me2;
		public AdditiveOpContext ado;
		public ExpressionContext ae2;
		public ShiftOpContext so;
		public ExpressionContext se2;
		public RelationalOpContext ro;
		public ExpressionContext re2;
		public EqualityOpContext eo;
		public ExpressionContext ee2;
		public Token AMP;
		public ExpressionContext ane2;
		public Token CARET;
		public ExpressionContext ce2;
		public Token BAR;
		public ExpressionContext be2;
		public Token AMPAMP;
		public ExpressionContext aae2;
		public Token BARBAR;
		public ExpressionContext bbe2;
		public ExpressionContext cee2;
		public ExpressionContext cee3;
		public AssignmentOperatorContext ao;
		public ExpressionContext ase2;
		public TypeContext t;
		public CoreExpressionContext coreExpression() {
			return getRuleContext(CoreExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicativeOpContext multiplicativeOp() {
			return getRuleContext(MultiplicativeOpContext.class,0);
		}
		public AdditiveOpContext additiveOp() {
			return getRuleContext(AdditiveOpContext.class,0);
		}
		public ShiftOpContext shiftOp() {
			return getRuleContext(ShiftOpContext.class,0);
		}
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public EqualityOpContext equalityOp() {
			return getRuleContext(EqualityOpContext.class,0);
		}
		public TerminalNode AMP() { return getToken(TimedRebecaPropertyCompleteParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(TimedRebecaPropertyCompleteParser.CARET, 0); }
		public TerminalNode BAR() { return getToken(TimedRebecaPropertyCompleteParser.BAR, 0); }
		public TerminalNode AMPAMP() { return getToken(TimedRebecaPropertyCompleteParser.AMPAMP, 0); }
		public TerminalNode BARBAR() { return getToken(TimedRebecaPropertyCompleteParser.BARBAR, 0); }
		public TerminalNode QUES() { return getToken(TimedRebecaPropertyCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaPropertyCompleteParser.COLON, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(TimedRebecaPropertyCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(126);
				((ExpressionContext)_localctx).ece = coreExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ece.e;
				}
				break;
			case 2:
				{
				setState(129);
				((ExpressionContext)_localctx).ue = unaryExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ue.e;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.me1 = _prevctx;
						_localctx.me1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(135);
						((ExpressionContext)_localctx).mo = multiplicativeOp();
						setState(136);
						((ExpressionContext)_localctx).me2 = expression(14);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator(((ExpressionContext)_localctx).mo.mo); e3.setLeft(((ExpressionContext)_localctx).me1.e); e3.setRight(((ExpressionContext)_localctx).me2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).me1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).me1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ae1 = _prevctx;
						_localctx.ae1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(140);
						((ExpressionContext)_localctx).ado = additiveOp();
						setState(141);
						((ExpressionContext)_localctx).ae2 = expression(13);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator(((ExpressionContext)_localctx).ado.ado); e3.setLeft(((ExpressionContext)_localctx).ae1.e); e3.setRight(((ExpressionContext)_localctx).ae2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).ae1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).ae1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.se1 = _prevctx;
						_localctx.se1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(145);
						((ExpressionContext)_localctx).so = shiftOp();
						setState(146);
						((ExpressionContext)_localctx).se2 = expression(12);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator(((ExpressionContext)_localctx).so.so); e3.setLeft(((ExpressionContext)_localctx).se1.e); e3.setRight(((ExpressionContext)_localctx).se2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).se1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).se1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.re1 = _prevctx;
						_localctx.re1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(150);
						((ExpressionContext)_localctx).ro = relationalOp();
						setState(151);
						((ExpressionContext)_localctx).re2 = expression(11);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator(((ExpressionContext)_localctx).ro.ro); e3.setLeft(((ExpressionContext)_localctx).re1.e); e3.setRight(((ExpressionContext)_localctx).re2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).re1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).re1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ee1 = _prevctx;
						_localctx.ee1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(155);
						((ExpressionContext)_localctx).eo = equalityOp();
						setState(156);
						((ExpressionContext)_localctx).ee2 = expression(9);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator(((ExpressionContext)_localctx).eo.eo); e3.setLeft(((ExpressionContext)_localctx).ee1.e); e3.setRight(((ExpressionContext)_localctx).ee2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).ee1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).ee1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ane1 = _prevctx;
						_localctx.ane1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(160);
						((ExpressionContext)_localctx).AMP = match(AMP);
						setState(161);
						((ExpressionContext)_localctx).ane2 = expression(8);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator((((ExpressionContext)_localctx).AMP!=null?((ExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(((ExpressionContext)_localctx).ane1.e); e3.setRight(((ExpressionContext)_localctx).ane2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).ane1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).ane1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ce1 = _prevctx;
						_localctx.ce1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						((ExpressionContext)_localctx).CARET = match(CARET);
						setState(166);
						((ExpressionContext)_localctx).ce2 = expression(7);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator((((ExpressionContext)_localctx).CARET!=null?((ExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(((ExpressionContext)_localctx).ce1.e); e3.setRight(((ExpressionContext)_localctx).ce2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).ce1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).ce1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.be1 = _prevctx;
						_localctx.be1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						((ExpressionContext)_localctx).BAR = match(BAR);
						setState(171);
						((ExpressionContext)_localctx).be2 = expression(6);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator((((ExpressionContext)_localctx).BAR!=null?((ExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(((ExpressionContext)_localctx).be1.e); e3.setRight(((ExpressionContext)_localctx).be2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).be1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).be1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.aae1 = _prevctx;
						_localctx.aae1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
						((ExpressionContext)_localctx).AMPAMP = match(AMPAMP);
						setState(176);
						((ExpressionContext)_localctx).aae2 = expression(5);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator((((ExpressionContext)_localctx).AMPAMP!=null?((ExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(((ExpressionContext)_localctx).aae1.e); e3.setRight(((ExpressionContext)_localctx).aae2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).aae1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).aae1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.bbe1 = _prevctx;
						_localctx.bbe1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(180);
						((ExpressionContext)_localctx).BARBAR = match(BARBAR);
						setState(181);
						((ExpressionContext)_localctx).bbe2 = expression(4);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator((((ExpressionContext)_localctx).BARBAR!=null?((ExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(((ExpressionContext)_localctx).bbe1.e); e3.setRight(((ExpressionContext)_localctx).bbe2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).bbe1.e.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).bbe1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.cee1 = _prevctx;
						_localctx.cee1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185);
						match(QUES);
						setState(186);
						((ExpressionContext)_localctx).cee2 = expression(0);
						setState(187);
						match(COLON);
						setState(188);
						((ExpressionContext)_localctx).cee3 = expression(3);
						 TernaryExpression e4 = new TernaryExpression(); e4.setCondition(((ExpressionContext)_localctx).cee1.e); e4.setLeft(((ExpressionContext)_localctx).cee2.e); e4.setRight(((ExpressionContext)_localctx).cee3.e);
						          			e4.setLineNumber(((ExpressionContext)_localctx).cee1.e.getLineNumber());e4.setCharacter(((ExpressionContext)_localctx).cee1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e4;
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ase1 = _prevctx;
						_localctx.ase1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(192);
						((ExpressionContext)_localctx).ao = assignmentOperator();
						setState(193);
						((ExpressionContext)_localctx).ase2 = expression(2);
						 BinaryExpression e3 = new BinaryExpression(); e3.setOperator(((ExpressionContext)_localctx).ao.ao); e3.setLeft(((ExpressionContext)_localctx).ase1.e); e3.setRight(((ExpressionContext)_localctx).ase2.e);
						          			e3.setLineNumber(((ExpressionContext)_localctx).ase1.e.getLineNumber());e3.setCharacter(((ExpressionContext)_localctx).ase1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ie1 = _prevctx;
						_localctx.ie1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						match(INSTANCEOF);
						setState(198);
						((ExpressionContext)_localctx).t = type();
						InstanceofExpression e3 = new InstanceofExpression(); e3.setValue(((ExpressionContext)_localctx).ie1.e); e3.setEvaluationType(((ExpressionContext)_localctx).t.t);
						                       e3.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE); e3.setLineNumber(((ExpressionContext)_localctx).t.t.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).t.t.getCharacter());
						                       ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					}
					} 
				}
				setState(205);
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
			unrollRecursionContexts(_parentctx);
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
		public TerminalNode EQ() { return getToken(TimedRebecaPropertyCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(TimedRebecaPropertyCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(TimedRebecaPropertyCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(TimedRebecaPropertyCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(TimedRebecaPropertyCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(TimedRebecaPropertyCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(TimedRebecaPropertyCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(TimedRebecaPropertyCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(TimedRebecaPropertyCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(TimedRebecaPropertyCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(TimedRebecaPropertyCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(TimedRebecaPropertyCompleteParser.GTGTEQ, 0); }
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
		enterRule(_localctx, 16, RULE_assignmentOperator);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(220);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(228);
				((AssignmentOperatorContext)_localctx).GTGTEQ = match(GTGTEQ);
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

	public static class MultiplicativeOpContext extends ParserRuleContext {
		public String mo;
		public Token STAR;
		public Token SLASH;
		public Token PERCENT;
		public TerminalNode STAR() { return getToken(TimedRebecaPropertyCompleteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(TimedRebecaPropertyCompleteParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(TimedRebecaPropertyCompleteParser.PERCENT, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitMultiplicativeOp(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicativeOp);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				((MultiplicativeOpContext)_localctx).STAR = match(STAR);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).STAR!=null?((MultiplicativeOpContext)_localctx).STAR.getText():null);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((MultiplicativeOpContext)_localctx).SLASH = match(SLASH);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).SLASH!=null?((MultiplicativeOpContext)_localctx).SLASH.getText():null);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				((MultiplicativeOpContext)_localctx).PERCENT = match(PERCENT);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).PERCENT!=null?((MultiplicativeOpContext)_localctx).PERCENT.getText():null);
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

	public static class AdditiveOpContext extends ParserRuleContext {
		public String ado;
		public Token PLUS;
		public Token SUB;
		public TerminalNode PLUS() { return getToken(TimedRebecaPropertyCompleteParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(TimedRebecaPropertyCompleteParser.SUB, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitAdditiveOp(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_additiveOp);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((AdditiveOpContext)_localctx).PLUS = match(PLUS);
				((AdditiveOpContext)_localctx).ado =  (((AdditiveOpContext)_localctx).PLUS!=null?((AdditiveOpContext)_localctx).PLUS.getText():null);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((AdditiveOpContext)_localctx).SUB = match(SUB);
				((AdditiveOpContext)_localctx).ado =  (((AdditiveOpContext)_localctx).SUB!=null?((AdditiveOpContext)_localctx).SUB.getText():null);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public Token LT;
		public Token EQ;
		public Token GT;
		public TerminalNode LT() { return getToken(TimedRebecaPropertyCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaPropertyCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaPropertyCompleteParser.GT, 0); }
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
		enterRule(_localctx, 22, RULE_relationalOp);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(247);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(250);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				((RelationalOpContext)_localctx).GT = match(GT);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public String so;
		public List<TerminalNode> LT() { return getTokens(TimedRebecaPropertyCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(TimedRebecaPropertyCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.GT, i);
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
		enterRule(_localctx, 24, RULE_shiftOp);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(LT);
				setState(259);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(GT);
				setState(262);
				match(GT);
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

	public static class EqualityOpContext extends ParserRuleContext {
		public String eo;
		public Token EQEQ;
		public Token BANGEQ;
		public TerminalNode EQEQ() { return getToken(TimedRebecaPropertyCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(TimedRebecaPropertyCompleteParser.BANGEQ, 0); }
		public EqualityOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterEqualityOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitEqualityOp(this);
		}
	}

	public final EqualityOpContext equalityOp() throws RecognitionException {
		EqualityOpContext _localctx = new EqualityOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equalityOp);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				((EqualityOpContext)_localctx).EQEQ = match(EQEQ);
				((EqualityOpContext)_localctx).eo =  (((EqualityOpContext)_localctx).EQEQ!=null?((EqualityOpContext)_localctx).EQEQ.getText():null);
				}
				break;
			case BANGEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				((EqualityOpContext)_localctx).BANGEQ = match(BANGEQ);
				((EqualityOpContext)_localctx).eo =  (((EqualityOpContext)_localctx).BANGEQ!=null?((EqualityOpContext)_localctx).BANGEQ.getText():null);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext ep;
		public Token SUB;
		public UnaryExpressionContext es;
		public Token PLUSPLUS;
		public UnaryExpressionContext epp;
		public Token SUBSUB;
		public UnaryExpressionContext ess;
		public Token TILDA;
		public UnaryExpressionContext et;
		public Token BANG;
		public UnaryExpressionContext eb;
		public CoreExpressionContext ece;
		public TerminalNode PLUS() { return getToken(TimedRebecaPropertyCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TimedRebecaPropertyCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaPropertyCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(TimedRebecaPropertyCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(TimedRebecaPropertyCompleteParser.BANG, 0); }
		public CoreExpressionContext coreExpression() {
			return getRuleContext(CoreExpressionContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_unaryExpression);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(PLUS);
				setState(273);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(277);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(281);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(285);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case TILDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				((UnaryExpressionContext)_localctx).TILDA = match(TILDA);
				setState(289);
				((UnaryExpressionContext)_localctx).et = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).TILDA!=null?((UnaryExpressionContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).et.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).et.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).et.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				((UnaryExpressionContext)_localctx).BANG = match(BANG);
				setState(293);
				((UnaryExpressionContext)_localctx).eb = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).BANG!=null?((UnaryExpressionContext)_localctx).BANG.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).eb.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).eb.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).eb.e.getCharacter());
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case QUES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				((UnaryExpressionContext)_localctx).ece = coreExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ece.e;
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

	public static class CoreExpressionContext extends ParserRuleContext {
		public Expression e;
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
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaPropertyCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaPropertyCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(TimedRebecaPropertyCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(TimedRebecaPropertyCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaPropertyCompleteParser.COLON, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TimedRebecaPropertyCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaPropertyCompleteParser.SUBSUB, 0); }
		public CoreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).enterCoreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaPropertyCompleteListener ) ((TimedRebecaPropertyCompleteListener)listener).exitCoreExpression(this);
		}
	}

	public final CoreExpressionContext coreExpression() throws RecognitionException {
		CoreExpressionContext _localctx = new CoreExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_coreExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(301);
				((CoreExpressionContext)_localctx).ec = castExpression();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ec.e;
				}
				break;
			case 2:
				{
				setState(304);
				match(LPAREN);
				setState(305);
				((CoreExpressionContext)_localctx).ep = expression(0);
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ep.e;
				setState(307);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(309);
				((CoreExpressionContext)_localctx).p = primary();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).p.tp;
				}
				break;
			case 4:
				{
				setState(312);
				((CoreExpressionContext)_localctx).l = literal();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).l.l;
				}
				break;
			case 5:
				{
				setState(315);
				((CoreExpressionContext)_localctx).QUES = match(QUES);
				setState(316);
				match(LPAREN);
				setState(317);
				((CoreExpressionContext)_localctx).el = expressionList();
				setState(318);
				match(RPAREN);
				((CoreExpressionContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((CoreExpressionContext)_localctx).el.el);
					    	_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).QUES.getCharPositionInLine());
				}
				break;
			case 6:
				{
				setState(321);
				match(NEW);
				setState(322);
				((CoreExpressionContext)_localctx).t = type();
				((CoreExpressionContext)_localctx).e =  new RebecInstantiationPrimary();
								_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((CoreExpressionContext)_localctx).t.t);
				setState(324);
				match(LPAREN);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << MONKEYS_AT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(325);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(330);
				match(RPAREN);
				setState(331);
				match(COLON);
				setState(332);
				match(LPAREN);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << MONKEYS_AT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(333);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(338);
				match(RPAREN);
				}
				break;
			}
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					((CoreExpressionContext)_localctx).DOT = match(DOT);
					setState(343);
					((CoreExpressionContext)_localctx).p2 = primary();

					        	DotPrimary de = new DotPrimary(); de.setLineNumber(((CoreExpressionContext)_localctx).DOT.getLine()); de.setCharacter(((CoreExpressionContext)_localctx).DOT.getCharPositionInLine());
					        	if (_localctx.e instanceof DotPrimary) {
					        		DotPrimary temp = (DotPrimary)_localctx.e;
					        		while(temp.getRight() instanceof DotPrimary)
					        			temp = (DotPrimary)temp.getRight();
					        		de.setLeft(temp.getRight());
					        		temp.setRight(de);
					        		de.setRight(((CoreExpressionContext)_localctx).p2.tp);
					        	} else {
					        		de.setLeft(_localctx.e); de.setRight(((CoreExpressionContext)_localctx).p2.tp);
						        	((CoreExpressionContext)_localctx).e =  de;
					        	}
					        	
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(351);
				((CoreExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((CoreExpressionContext)_localctx).e = pse;
				        		pse.setLineNumber(((CoreExpressionContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((CoreExpressionContext)_localctx).PLUSPLUS.getCharPositionInLine());
				}
				break;
			case 2:
				{
				setState(353);
				((CoreExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("--");((CoreExpressionContext)_localctx).e = pse;
				        		pse.setLineNumber(((CoreExpressionContext)_localctx).SUBSUB.getLine()); pse.setCharacter(((CoreExpressionContext)_localctx).SUBSUB.getCharPositionInLine());
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
		enterRule(_localctx, 32, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LPAREN);
			setState(358);
			((CastExpressionContext)_localctx).t = type();
			setState(359);
			match(RPAREN);
			setState(360);
			((CastExpressionContext)_localctx).e1 = expression(0);
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
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaPropertyCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaPropertyCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public TerminalNode LPAREN() { return getToken(TimedRebecaPropertyCompleteParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 34, RULE_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(365);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << MONKEYS_AT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(367);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(372);
				match(RPAREN);
				}
				break;
			}
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					match(LBRACKET);
					setState(376);
					((PrimaryContext)_localctx).e2 = expression(0);
					setState(377);
					match(RBRACKET);
					_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public AnnotationContext a;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaPropertyCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.COMMA, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
		enterRule(_localctx, 36, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(386);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			((ExpressionListContext)_localctx).e = expression(0);
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(396);
				match(COMMA);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(397);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				((ExpressionListContext)_localctx).e = expression(0);
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(412);
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
		public TerminalNode FLOATLITERAL() { return getToken(TimedRebecaPropertyCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(TimedRebecaPropertyCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(TimedRebecaPropertyCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(TimedRebecaPropertyCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(TimedRebecaPropertyCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TimedRebecaPropertyCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(TimedRebecaPropertyCompleteParser.NULL, 0); }
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
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(425);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(427);
				((LiteralContext)_localctx).NULL = match(NULL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("null");
				    	_localctx.l.setType(CoreRebecaTypeSystem.NULL_TYPE);
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
		public TerminalNode PROPERTY() { return getToken(TimedRebecaPropertyCompleteParser.PROPERTY, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaPropertyCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.LBRACE, i);
		}
		public PropertyDefinitionContext propertyDefinition() {
			return getRuleContext(PropertyDefinitionContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaPropertyCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.RBRACE, i);
		}
		public TerminalNode DEFINE() { return getToken(TimedRebecaPropertyCompleteParser.DEFINE, 0); }
		public List<TerminalNode> EQ() { return getTokens(TimedRebecaPropertyCompleteParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.EQ, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.SEMI, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaPropertyCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaPropertyCompleteParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 40, RULE_propertyModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PropertyModelContext)_localctx).pm =  new PropertyModel();
			setState(432);
			match(PROPERTY);
			setState(433);
			match(LBRACE);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(434);
				match(DEFINE);
				setState(435);
				match(LBRACE);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(436);
					((PropertyModelContext)_localctx).id = match(IDENTIFIER);
					setState(437);
					match(EQ);
					setState(438);
					((PropertyModelContext)_localctx).e = expression(0);

								Definition definition = new Definition();
								definition.setName((((PropertyModelContext)_localctx).id!=null?((PropertyModelContext)_localctx).id.getText():null));
								definition.setExpression(((PropertyModelContext)_localctx).e.e);
								_localctx.pm.getDefinitions().add(definition);
					setState(440);
					match(SEMI);
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447);
				match(RBRACE);
				}
			}

			setState(450);
			propertyDefinition(_localctx.pm);
			setState(451);
			match(RBRACE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u01c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\5\2\61\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5W\n\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\6\3\6"+
		"\3\6\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\b|\n\b\r\b\16\b}\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00cc\n\t\f\t\16\t\u00cf\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00e9\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f1\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u00f7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0103\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010b\n\16\3\17\3\17\3\17\3\17\5"+
		"\17\u0111\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u012e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u014b\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0153\n\21\3\21\3\21\5\21\u0157\n\21\3\21\3\21\3\21\3\21\7\21\u015d\n"+
		"\21\f\21\16\21\u0160\13\21\3\21\3\21\3\21\3\21\5\21\u0166\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0175"+
		"\n\23\3\23\5\23\u0178\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u017f\n\23\f"+
		"\23\16\23\u0182\13\23\3\24\3\24\3\24\3\24\7\24\u0188\n\24\f\24\16\24\u018b"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0193\n\24\f\24\16\24\u0196"+
		"\13\24\3\24\3\24\3\24\7\24\u019b\n\24\f\24\16\24\u019e\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01b0\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u01bd\n\26\f\26\16\26\u01c0\13\26\3\26\5\26\u01c3\n\26\3\26\3\26"+
		"\3\26\3\26\2\3\20\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2"+
		"\2\u01fc\2-\3\2\2\2\4\62\3\2\2\2\6@\3\2\2\2\bN\3\2\2\2\n[\3\2\2\2\fg\3"+
		"\2\2\2\16v\3\2\2\2\20\u0086\3\2\2\2\22\u00e8\3\2\2\2\24\u00f0\3\2\2\2"+
		"\26\u00f6\3\2\2\2\30\u0102\3\2\2\2\32\u010a\3\2\2\2\34\u0110\3\2\2\2\36"+
		"\u012d\3\2\2\2 \u0156\3\2\2\2\"\u0167\3\2\2\2$\u016d\3\2\2\2&\u0183\3"+
		"\2\2\2(\u01af\3\2\2\2*\u01b1\3\2\2\2,.\5\4\3\2-,\3\2\2\2-.\3\2\2\2.\60"+
		"\3\2\2\2/\61\5\6\4\2\60/\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\63\7\7"+
		"\2\2\63;\7\27\2\2\64\65\7A\2\2\65\66\7\"\2\2\66\67\5\20\t\2\678\7\33\2"+
		"\28:\3\2\2\29\64\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2"+
		"\2\2>?\7\30\2\2?\5\3\2\2\2@A\7\3\2\2AI\7\27\2\2BC\7A\2\2CD\7\"\2\2DE\5"+
		"\20\t\2EF\7\33\2\2FH\3\2\2\2GB\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J"+
		"L\3\2\2\2KI\3\2\2\2LM\7\30\2\2M\7\3\2\2\2NO\b\5\1\2OP\79\2\2PQ\7A\2\2"+
		"QY\b\5\1\2RV\7\25\2\2ST\5\20\t\2TU\b\5\1\2UW\3\2\2\2VS\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XZ\7\26\2\2YR\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[\\\7A\2\2\\`\b"+
		"\6\1\2]^\5\f\7\2^_\b\6\1\2_a\3\2\2\2`]\3\2\2\2`a\3\2\2\2ae\3\2\2\2bc\5"+
		"\16\b\2cd\b\6\1\2df\3\2\2\2eb\3\2\2\2ef\3\2\2\2f\13\3\2\2\2gh\7<\2\2h"+
		"i\b\7\1\2ij\5\n\6\2jq\b\7\1\2kl\7\34\2\2lm\5\n\6\2mn\b\7\1\2np\3\2\2\2"+
		"ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7;\2\2"+
		"u\r\3\2\2\2v{\b\b\1\2wx\7\31\2\2xy\7\b\2\2yz\7\32\2\2z|\b\b\1\2{w\3\2"+
		"\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177\u0080\b\t\1\2\u0080"+
		"\u0081\5 \21\2\u0081\u0082\b\t\1\2\u0082\u0087\3\2\2\2\u0083\u0084\5\36"+
		"\20\2\u0084\u0085\b\t\1\2\u0085\u0087\3\2\2\2\u0086\177\3\2\2\2\u0086"+
		"\u0083\3\2\2\2\u0087\u00cd\3\2\2\2\u0088\u0089\f\17\2\2\u0089\u008a\5"+
		"\24\13\2\u008a\u008b\5\20\t\20\u008b\u008c\b\t\1\2\u008c\u00cc\3\2\2\2"+
		"\u008d\u008e\f\16\2\2\u008e\u008f\5\26\f\2\u008f\u0090\5\20\t\17\u0090"+
		"\u0091\b\t\1\2\u0091\u00cc\3\2\2\2\u0092\u0093\f\r\2\2\u0093\u0094\5\32"+
		"\16\2\u0094\u0095\5\20\t\16\u0095\u0096\b\t\1\2\u0096\u00cc\3\2\2\2\u0097"+
		"\u0098\f\f\2\2\u0098\u0099\5\30\r\2\u0099\u009a\5\20\t\r\u009a\u009b\b"+
		"\t\1\2\u009b\u00cc\3\2\2\2\u009c\u009d\f\n\2\2\u009d\u009e\5\34\17\2\u009e"+
		"\u009f\5\20\t\13\u009f\u00a0\b\t\1\2\u00a0\u00cc\3\2\2\2\u00a1\u00a2\f"+
		"\t\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\5\20\t\n\u00a4\u00a5\b\t\1\2\u00a5"+
		"\u00cc\3\2\2\2\u00a6\u00a7\f\b\2\2\u00a7\u00a8\7.\2\2\u00a8\u00a9\5\20"+
		"\t\t\u00a9\u00aa\b\t\1\2\u00aa\u00cc\3\2\2\2\u00ab\u00ac\f\7\2\2\u00ac"+
		"\u00ad\7-\2\2\u00ad\u00ae\5\20\t\b\u00ae\u00af\b\t\1\2\u00af\u00cc\3\2"+
		"\2\2\u00b0\u00b1\f\6\2\2\u00b1\u00b2\7$\2\2\u00b2\u00b3\5\20\t\7\u00b3"+
		"\u00b4\b\t\1\2\u00b4\u00cc\3\2\2\2\u00b5\u00b6\f\5\2\2\u00b6\u00b7\7%"+
		"\2\2\u00b7\u00b8\5\20\t\6\u00b8\u00b9\b\t\1\2\u00b9\u00cc\3\2\2\2\u00ba"+
		"\u00bb\f\4\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7\""+
		"\2\2\u00be\u00bf\5\20\t\5\u00bf\u00c0\b\t\1\2\u00c0\u00cc\3\2\2\2\u00c1"+
		"\u00c2\f\3\2\2\u00c2\u00c3\5\22\n\2\u00c3\u00c4\5\20\t\4\u00c4\u00c5\b"+
		"\t\1\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\f\13\2\2\u00c7\u00c8\7\20\2\2\u00c8"+
		"\u00c9\5\n\6\2\u00c9\u00ca\b\t\1\2\u00ca\u00cc\3\2\2\2\u00cb\u0088\3\2"+
		"\2\2\u00cb\u008d\3\2\2\2\u00cb\u0092\3\2\2\2\u00cb\u0097\3\2\2\2\u00cb"+
		"\u009c\3\2\2\2\u00cb\u00a1\3\2\2\2\u00cb\u00a6\3\2\2\2\u00cb\u00ab\3\2"+
		"\2\2\u00cb\u00b0\3\2\2\2\u00cb\u00b5\3\2\2\2\u00cb\u00ba\3\2\2\2\u00cb"+
		"\u00c1\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\21\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1"+
		"\7\36\2\2\u00d1\u00e9\b\n\1\2\u00d2\u00d3\7\60\2\2\u00d3\u00e9\b\n\1\2"+
		"\u00d4\u00d5\7\61\2\2\u00d5\u00e9\b\n\1\2\u00d6\u00d7\7\62\2\2\u00d7\u00e9"+
		"\b\n\1\2\u00d8\u00d9\7\63\2\2\u00d9\u00e9\b\n\1\2\u00da\u00db\7\64\2\2"+
		"\u00db\u00e9\b\n\1\2\u00dc\u00dd\7\65\2\2\u00dd\u00e9\b\n\1\2\u00de\u00df"+
		"\7\66\2\2\u00df\u00e9\b\n\1\2\u00e0\u00e1\7\67\2\2\u00e1\u00e9\b\n\1\2"+
		"\u00e2\u00e3\78\2\2\u00e3\u00e9\b\n\1\2\u00e4\u00e5\7>\2\2\u00e5\u00e9"+
		"\b\n\1\2\u00e6\u00e7\7@\2\2\u00e7\u00e9\b\n\1\2\u00e8\u00d0\3\2\2\2\u00e8"+
		"\u00d2\3\2\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00d6\3\2\2\2\u00e8\u00d8\3\2"+
		"\2\2\u00e8\u00da\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8"+
		"\u00e0\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\23\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\u00f1\b\13\1\2\u00ec\u00ed"+
		"\7+\2\2\u00ed\u00f1\b\13\1\2\u00ee\u00ef\7/\2\2\u00ef\u00f1\b\13\1\2\u00f0"+
		"\u00ea\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\25\3\2\2"+
		"\2\u00f2\u00f3\7(\2\2\u00f3\u00f7\b\f\1\2\u00f4\u00f5\7)\2\2\u00f5\u00f7"+
		"\b\f\1\2\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\27\3\2\2\2\u00f8"+
		"\u00f9\7<\2\2\u00f9\u00fa\7\36\2\2\u00fa\u0103\b\r\1\2\u00fb\u00fc\7;"+
		"\2\2\u00fc\u00fd\7\36\2\2\u00fd\u0103\b\r\1\2\u00fe\u00ff\7<\2\2\u00ff"+
		"\u0103\b\r\1\2\u0100\u0101\7;\2\2\u0101\u0103\b\r\1\2\u0102\u00f8\3\2"+
		"\2\2\u0102\u00fb\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\31\3\2\2\2\u0104\u0105\7<\2\2\u0105\u0106\7<\2\2\u0106\u010b\b\16\1\2"+
		"\u0107\u0108\7;\2\2\u0108\u0109\7;\2\2\u0109\u010b\b\16\1\2\u010a\u0104"+
		"\3\2\2\2\u010a\u0107\3\2\2\2\u010b\33\3\2\2\2\u010c\u010d\7#\2\2\u010d"+
		"\u0111\b\17\1\2\u010e\u010f\7:\2\2\u010f\u0111\b\17\1\2\u0110\u010c\3"+
		"\2\2\2\u0110\u010e\3\2\2\2\u0111\35\3\2\2\2\u0112\u0113\7(\2\2\u0113\u0114"+
		"\5\36\20\2\u0114\u0115\b\20\1\2\u0115\u012e\3\2\2\2\u0116\u0117\7)\2\2"+
		"\u0117\u0118\5\36\20\2\u0118\u0119\b\20\1\2\u0119\u012e\3\2\2\2\u011a"+
		"\u011b\7&\2\2\u011b\u011c\5\36\20\2\u011c\u011d\b\20\1\2\u011d\u012e\3"+
		"\2\2\2\u011e\u011f\7\'\2\2\u011f\u0120\5\36\20\2\u0120\u0121\b\20\1\2"+
		"\u0121\u012e\3\2\2\2\u0122\u0123\7 \2\2\u0123\u0124\5\36\20\2\u0124\u0125"+
		"\b\20\1\2\u0125\u012e\3\2\2\2\u0126\u0127\7\37\2\2\u0127\u0128\5\36\20"+
		"\2\u0128\u0129\b\20\1\2\u0129\u012e\3\2\2\2\u012a\u012b\5 \21\2\u012b"+
		"\u012c\b\20\1\2\u012c\u012e\3\2\2\2\u012d\u0112\3\2\2\2\u012d\u0116\3"+
		"\2\2\2\u012d\u011a\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0122\3\2\2\2\u012d"+
		"\u0126\3\2\2\2\u012d\u012a\3\2\2\2\u012e\37\3\2\2\2\u012f\u0130\5\"\22"+
		"\2\u0130\u0131\b\21\1\2\u0131\u0157\3\2\2\2\u0132\u0133\7\25\2\2\u0133"+
		"\u0134\5\20\t\2\u0134\u0135\b\21\1\2\u0135\u0136\7\26\2\2\u0136\u0157"+
		"\3\2\2\2\u0137\u0138\5$\23\2\u0138\u0139\b\21\1\2\u0139\u0157\3\2\2\2"+
		"\u013a\u013b\5(\25\2\u013b\u013c\b\21\1\2\u013c\u0157\3\2\2\2\u013d\u013e"+
		"\7!\2\2\u013e\u013f\7\25\2\2\u013f\u0140\5&\24\2\u0140\u0141\7\26\2\2"+
		"\u0141\u0142\b\21\1\2\u0142\u0157\3\2\2\2\u0143\u0144\7\21\2\2\u0144\u0145"+
		"\5\n\6\2\u0145\u0146\b\21\1\2\u0146\u014a\7\25\2\2\u0147\u0148\5&\24\2"+
		"\u0148\u0149\b\21\1\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\26\2\2\u014d\u014e\7\"\2\2"+
		"\u014e\u0152\7\25\2\2\u014f\u0150\5&\24\2\u0150\u0151\b\21\1\2\u0151\u0153"+
		"\3\2\2\2\u0152\u014f\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\7\26\2\2\u0155\u0157\3\2\2\2\u0156\u012f\3\2\2\2\u0156\u0132\3"+
		"\2\2\2\u0156\u0137\3\2\2\2\u0156\u013a\3\2\2\2\u0156\u013d\3\2\2\2\u0156"+
		"\u0143\3\2\2\2\u0157\u015e\3\2\2\2\u0158\u0159\7\35\2\2\u0159\u015a\5"+
		"$\23\2\u015a\u015b\b\21\1\2\u015b\u015d\3\2\2\2\u015c\u0158\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0165\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7&\2\2\u0162\u0166\b\21\1\2\u0163"+
		"\u0164\7\'\2\2\u0164\u0166\b\21\1\2\u0165\u0161\3\2\2\2\u0165\u0163\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166!\3\2\2\2\u0167\u0168\7\25\2\2\u0168\u0169"+
		"\5\n\6\2\u0169\u016a\7\26\2\2\u016a\u016b\5\20\t\2\u016b\u016c\b\22\1"+
		"\2\u016c#\3\2\2\2\u016d\u016e\7A\2\2\u016e\u0177\b\23\1\2\u016f\u0170"+
		"\7\25\2\2\u0170\u0174\b\23\1\2\u0171\u0172\5&\24\2\u0172\u0173\b\23\1"+
		"\2\u0173\u0175\3\2\2\2\u0174\u0171\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0178\7\26\2\2\u0177\u016f\3\2\2\2\u0177\u0178\3\2\2\2"+
		"\u0178\u0180\3\2\2\2\u0179\u017a\7\31\2\2\u017a\u017b\5\20\t\2\u017b\u017c"+
		"\7\32\2\2\u017c\u017d\b\23\1\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2\2\2"+
		"\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181%\3"+
		"\2\2\2\u0182\u0180\3\2\2\2\u0183\u0189\b\24\1\2\u0184\u0185\5\b\5\2\u0185"+
		"\u0186\b\24\1\2\u0186\u0188\3\2\2\2\u0187\u0184\3\2\2\2\u0188\u018b\3"+
		"\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018d\5\20\t\2\u018d\u019c\b\24\1\2\u018e\u0194\7"+
		"\34\2\2\u018f\u0190\5\b\5\2\u0190\u0191\b\24\1\2\u0191\u0193\3\2\2\2\u0192"+
		"\u018f\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\5\20\t\2\u0198"+
		"\u0199\b\24\1\2\u0199\u019b\3\2\2\2\u019a\u018e\3\2\2\2\u019b\u019e\3"+
		"\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\'\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019f\u01a0\7\b\2\2\u01a0\u01b0\b\25\1\2\u01a1\u01a2\7\t\2\2"+
		"\u01a2\u01b0\b\25\1\2\u01a3\u01a4\7\n\2\2\u01a4\u01b0\b\25\1\2\u01a5\u01a6"+
		"\7\13\2\2\u01a6\u01b0\b\25\1\2\u01a7\u01a8\7\f\2\2\u01a8\u01b0\b\25\1"+
		"\2\u01a9\u01aa\7\22\2\2\u01aa\u01b0\b\25\1\2\u01ab\u01ac\7\23\2\2\u01ac"+
		"\u01b0\b\25\1\2\u01ad\u01ae\7\24\2\2\u01ae\u01b0\b\25\1\2\u01af\u019f"+
		"\3\2\2\2\u01af\u01a1\3\2\2\2\u01af\u01a3\3\2\2\2\u01af\u01a5\3\2\2\2\u01af"+
		"\u01a7\3\2\2\2\u01af\u01a9\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01b0)\3\2\2\2\u01b1\u01b2\b\26\1\2\u01b2\u01b3\7\6\2\2\u01b3\u01c2"+
		"\7\27\2\2\u01b4\u01b5\7\4\2\2\u01b5\u01be\7\27\2\2\u01b6\u01b7\7A\2\2"+
		"\u01b7\u01b8\7\36\2\2\u01b8\u01b9\5\20\t\2\u01b9\u01ba\b\26\1\2\u01ba"+
		"\u01bb\7\33\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bd\u01c0\3"+
		"\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c1\u01c3\7\30\2\2\u01c2\u01b4\3\2\2\2\u01c2\u01c3\3"+
		"\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5\2\2\2\u01c5\u01c6\7\30\2\2\u01c6"+
		"+\3\2\2\2$-\60;IVY`eq}\u0086\u00cb\u00cd\u00e8\u00f0\u00f6\u0102\u010a"+
		"\u0110\u012d\u014a\u0152\u0156\u015e\u0165\u0174\u0177\u0180\u0189\u0194"+
		"\u019c\u01af\u01be\u01c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}