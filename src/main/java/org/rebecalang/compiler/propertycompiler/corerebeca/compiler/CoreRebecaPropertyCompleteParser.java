// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.*;
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
public class CoreRebecaPropertyCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LTL=1, DEFINE=2, THEN=3, PROPERTY=4, ASSERTION=5, INTLITERAL=6, FLOATLITERAL=7, 
		DOUBLELITERAL=8, CHARLITERAL=9, STRINGLITERAL=10, WS=11, COMMENT=12, LINE_COMMENT=13, 
		INSTANCEOF=14, NEW=15, TRUE=16, FALSE=17, NULL=18, LPAREN=19, RPAREN=20, 
		LBRACE=21, RBRACE=22, LBRACKET=23, RBRACKET=24, SEMI=25, COMMA=26, DOT=27, 
		EQ=28, BANG=29, TILDA=30, QUES=31, COLON=32, EQEQ=33, AMPAMP=34, BARBAR=35, 
		PLUSPLUS=36, SUBSUB=37, PLUS=38, SUB=39, STAR=40, SLASH=41, AMP=42, BAR=43, 
		CARET=44, PERCENT=45, PLUSEQ=46, SUBEQ=47, STAREQ=48, SLASHEQ=49, AMPEQ=50, 
		BAREQ=51, CARETEQ=52, TILDAEQ=53, PERCENTEQ=54, MONKEYS_AT=55, BANGEQ=56, 
		GT=57, LT=58, LTLT=59, LTLTEQ=60, GTGT=61, GTGTEQ=62, IDENTIFIER=63;
	public static final int
		RULE_propertyDefinition = 0, RULE_annotation = 1, RULE_type = 2, RULE_genericTypeParams = 3, 
		RULE_dimensions = 4, RULE_expression = 5, RULE_assignmentOperator = 6, 
		RULE_multiplicativeOp = 7, RULE_additiveOp = 8, RULE_relationalOp = 9, 
		RULE_shiftOp = 10, RULE_equalityOp = 11, RULE_unaryExpression = 12, RULE_coreExpression = 13, 
		RULE_castExpression = 14, RULE_primary = 15, RULE_expressionList = 16, 
		RULE_literal = 17, RULE_propertyModel = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"propertyDefinition", "annotation", "type", "genericTypeParams", "dimensions", 
			"expression", "assignmentOperator", "multiplicativeOp", "additiveOp", 
			"relationalOp", "shiftOp", "equalityOp", "unaryExpression", "coreExpression", 
			"castExpression", "primary", "expressionList", "literal", "propertyModel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'LTL'", "'define'", "'->'", "'property'", "'Assertion'", null, 
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
			null, "LTL", "DEFINE", "THEN", "PROPERTY", "ASSERTION", "INTLITERAL", 
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
	public String getGrammarFileName() { return "CoreRebecaPropertyComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoreRebecaPropertyCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PropertyDefinitionContext extends ParserRuleContext {
		public PropertyModel pm;
		public Token id;
		public ExpressionContext assertione;
		public ExpressionContext ltle;
		public TerminalNode ASSERTION() { return getToken(CoreRebecaPropertyCompleteParser.ASSERTION, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(CoreRebecaPropertyCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CoreRebecaPropertyCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RBRACE, i);
		}
		public TerminalNode LTL() { return getToken(CoreRebecaPropertyCompleteParser.LTL, 0); }
		public List<TerminalNode> COLON() { return getTokens(CoreRebecaPropertyCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.COLON, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.SEMI, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaPropertyCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState, PropertyModel pm) {
			super(parent, invokingState);
			this.pm = pm;
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitPropertyDefinition(this);
		}
	}

	public final PropertyDefinitionContext propertyDefinition(PropertyModel pm) throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState(), pm);
		enterRule(_localctx, 0, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSERTION) {
				{
				setState(38);
				match(ASSERTION);
				setState(39);
				match(LBRACE);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(40);
					((PropertyDefinitionContext)_localctx).id = match(IDENTIFIER);
					setState(41);
					match(COLON);
					setState(42);
					((PropertyDefinitionContext)_localctx).assertione = expression(0);

								AssertionDefinition assertionDefinition = new AssertionDefinition();
								assertionDefinition.setName((((PropertyDefinitionContext)_localctx).id!=null?((PropertyDefinitionContext)_localctx).id.getText():null));
								assertionDefinition.setExpression(((PropertyDefinitionContext)_localctx).assertione.e);
								_localctx.pm.getAssertionDefinitions().add(assertionDefinition);
					setState(44);
					match(SEMI);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(RBRACE);
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LTL) {
				{
				setState(54);
				match(LTL);
				setState(55);
				match(LBRACE);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(56);
					((PropertyDefinitionContext)_localctx).id = match(IDENTIFIER);
					setState(57);
					match(COLON);
					setState(58);
					((PropertyDefinitionContext)_localctx).ltle = expression(0);

								LTLDefinition ltlDefinition = new LTLDefinition();
								ltlDefinition.setName((((PropertyDefinitionContext)_localctx).id!=null?((PropertyDefinitionContext)_localctx).id.getText():null));
								ltlDefinition.setExpression(((PropertyDefinitionContext)_localctx).ltle.e);
								_localctx.pm.getLTLDefinitions().add(ltlDefinition);
					setState(60);
					match(SEMI);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(RBRACE);
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
		public TerminalNode MONKEYS_AT() { return getToken(CoreRebecaPropertyCompleteParser.MONKEYS_AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaPropertyCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaPropertyCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitAnnotation(this);
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
			setState(71);
			match(MONKEYS_AT);
			setState(72);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(74);
				match(LPAREN);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(75);
					((AnnotationContext)_localctx).exp = expression(0);
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(80);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(85);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(90);
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
		public TerminalNode LT() { return getToken(CoreRebecaPropertyCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaPropertyCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaPropertyCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(97);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(CoreRebecaPropertyCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.INTLITERAL, i);
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
		enterRule(_localctx, 8, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111);
					match(LBRACKET);
					setState(112);
					((DimensionsContext)_localctx).i = match(INTLITERAL);
					setState(113);
					match(RBRACKET);
					_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
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
		public TerminalNode AMP() { return getToken(CoreRebecaPropertyCompleteParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(CoreRebecaPropertyCompleteParser.CARET, 0); }
		public TerminalNode BAR() { return getToken(CoreRebecaPropertyCompleteParser.BAR, 0); }
		public TerminalNode AMPAMP() { return getToken(CoreRebecaPropertyCompleteParser.AMPAMP, 0); }
		public TerminalNode BARBAR() { return getToken(CoreRebecaPropertyCompleteParser.BARBAR, 0); }
		public TerminalNode QUES() { return getToken(CoreRebecaPropertyCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(CoreRebecaPropertyCompleteParser.COLON, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(CoreRebecaPropertyCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(120);
				((ExpressionContext)_localctx).ece = coreExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ece.e;
				}
				break;
			case 2:
				{
				setState(123);
				((ExpressionContext)_localctx).ue = unaryExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ue.e;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.me1 = _prevctx;
						_localctx.me1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(129);
						((ExpressionContext)_localctx).mo = multiplicativeOp();
						setState(130);
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
						setState(133);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(134);
						((ExpressionContext)_localctx).ado = additiveOp();
						setState(135);
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
						setState(138);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(139);
						((ExpressionContext)_localctx).so = shiftOp();
						setState(140);
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
						setState(143);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(144);
						((ExpressionContext)_localctx).ro = relationalOp();
						setState(145);
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
						setState(148);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(149);
						((ExpressionContext)_localctx).eo = equalityOp();
						setState(150);
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
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
						((ExpressionContext)_localctx).AMP = match(AMP);
						setState(155);
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
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						((ExpressionContext)_localctx).CARET = match(CARET);
						setState(160);
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
						setState(163);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(164);
						((ExpressionContext)_localctx).BAR = match(BAR);
						setState(165);
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
						setState(168);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(169);
						((ExpressionContext)_localctx).AMPAMP = match(AMPAMP);
						setState(170);
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
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						((ExpressionContext)_localctx).BARBAR = match(BARBAR);
						setState(175);
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
						setState(178);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(179);
						match(QUES);
						setState(180);
						((ExpressionContext)_localctx).cee2 = expression(0);
						setState(181);
						match(COLON);
						setState(182);
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
						setState(185);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(186);
						((ExpressionContext)_localctx).ao = assignmentOperator();
						setState(187);
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
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
						match(INSTANCEOF);
						setState(192);
						((ExpressionContext)_localctx).t = type();
						InstanceofExpression e3 = new InstanceofExpression(); e3.setValue(((ExpressionContext)_localctx).ie1.e); e3.setEvaluationType(((ExpressionContext)_localctx).t.t);
						                       e3.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE); e3.setLineNumber(((ExpressionContext)_localctx).t.t.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).t.t.getCharacter());
						                       ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					}
					} 
				}
				setState(199);
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
		public TerminalNode EQ() { return getToken(CoreRebecaPropertyCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(CoreRebecaPropertyCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(CoreRebecaPropertyCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(CoreRebecaPropertyCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(CoreRebecaPropertyCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(CoreRebecaPropertyCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(CoreRebecaPropertyCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(CoreRebecaPropertyCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(CoreRebecaPropertyCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(CoreRebecaPropertyCompleteParser.PERCENTEQ, 0); }
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
		enterRule(_localctx, 12, RULE_assignmentOperator);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(220);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(222);
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
		public TerminalNode STAR() { return getToken(CoreRebecaPropertyCompleteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CoreRebecaPropertyCompleteParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(CoreRebecaPropertyCompleteParser.PERCENT, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitMultiplicativeOp(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiplicativeOp);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((MultiplicativeOpContext)_localctx).STAR = match(STAR);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).STAR!=null?((MultiplicativeOpContext)_localctx).STAR.getText():null);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				((MultiplicativeOpContext)_localctx).SLASH = match(SLASH);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).SLASH!=null?((MultiplicativeOpContext)_localctx).SLASH.getText():null);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
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
		public TerminalNode PLUS() { return getToken(CoreRebecaPropertyCompleteParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(CoreRebecaPropertyCompleteParser.SUB, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitAdditiveOp(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_additiveOp);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((AdditiveOpContext)_localctx).PLUS = match(PLUS);
				((AdditiveOpContext)_localctx).ado =  (((AdditiveOpContext)_localctx).PLUS!=null?((AdditiveOpContext)_localctx).PLUS.getText():null);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
		public TerminalNode LT() { return getToken(CoreRebecaPropertyCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaPropertyCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaPropertyCompleteParser.GT, 0); }
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
		enterRule(_localctx, 18, RULE_relationalOp);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(241);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(244);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
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
		public List<TerminalNode> LT() { return getTokens(CoreRebecaPropertyCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CoreRebecaPropertyCompleteParser.GT); }
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
		enterRule(_localctx, 20, RULE_shiftOp);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(LT);
				setState(253);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(GT);
				setState(256);
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
		public TerminalNode EQEQ() { return getToken(CoreRebecaPropertyCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(CoreRebecaPropertyCompleteParser.BANGEQ, 0); }
		public EqualityOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterEqualityOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitEqualityOp(this);
		}
	}

	public final EqualityOpContext equalityOp() throws RecognitionException {
		EqualityOpContext _localctx = new EqualityOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_equalityOp);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((EqualityOpContext)_localctx).EQEQ = match(EQEQ);
				((EqualityOpContext)_localctx).eo =  (((EqualityOpContext)_localctx).EQEQ!=null?((EqualityOpContext)_localctx).EQEQ.getText():null);
				}
				break;
			case BANGEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
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
		public TerminalNode PLUS() { return getToken(CoreRebecaPropertyCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CoreRebecaPropertyCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaPropertyCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(CoreRebecaPropertyCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(CoreRebecaPropertyCompleteParser.BANG, 0); }
		public CoreExpressionContext coreExpression() {
			return getRuleContext(CoreExpressionContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_unaryExpression);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(PLUS);
				setState(267);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(271);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(275);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(279);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case TILDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				((UnaryExpressionContext)_localctx).TILDA = match(TILDA);
				setState(283);
				((UnaryExpressionContext)_localctx).et = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).TILDA!=null?((UnaryExpressionContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).et.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).et.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).et.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				((UnaryExpressionContext)_localctx).BANG = match(BANG);
				setState(287);
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
				setState(290);
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
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaPropertyCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaPropertyCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(CoreRebecaPropertyCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(CoreRebecaPropertyCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(CoreRebecaPropertyCompleteParser.COLON, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(CoreRebecaPropertyCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaPropertyCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaPropertyCompleteParser.SUBSUB, 0); }
		public CoreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterCoreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitCoreExpression(this);
		}
	}

	public final CoreExpressionContext coreExpression() throws RecognitionException {
		CoreExpressionContext _localctx = new CoreExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_coreExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(295);
				((CoreExpressionContext)_localctx).ec = castExpression();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ec.e;
				}
				break;
			case 2:
				{
				setState(298);
				match(LPAREN);
				setState(299);
				((CoreExpressionContext)_localctx).ep = expression(0);
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ep.e;
				setState(301);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(303);
				((CoreExpressionContext)_localctx).p = primary();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).p.tp;
				}
				break;
			case 4:
				{
				setState(306);
				((CoreExpressionContext)_localctx).l = literal();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).l.l;
				}
				break;
			case 5:
				{
				setState(309);
				((CoreExpressionContext)_localctx).QUES = match(QUES);
				setState(310);
				match(LPAREN);
				setState(311);
				((CoreExpressionContext)_localctx).el = expressionList();
				setState(312);
				match(RPAREN);
				((CoreExpressionContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((CoreExpressionContext)_localctx).el.el);
					    	_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).QUES.getCharPositionInLine());
				}
				break;
			case 6:
				{
				setState(315);
				match(NEW);
				setState(316);
				((CoreExpressionContext)_localctx).t = type();
				((CoreExpressionContext)_localctx).e =  new RebecInstantiationPrimary();
								_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((CoreExpressionContext)_localctx).t.t);
				setState(318);
				match(LPAREN);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << MONKEYS_AT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(319);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(324);
				match(RPAREN);
				setState(325);
				match(COLON);
				setState(326);
				match(LPAREN);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << MONKEYS_AT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(327);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(332);
				match(RPAREN);
				}
				break;
			}
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					((CoreExpressionContext)_localctx).DOT = match(DOT);
					setState(337);
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
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(345);
				((CoreExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((CoreExpressionContext)_localctx).e = pse;
				        		pse.setLineNumber(((CoreExpressionContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((CoreExpressionContext)_localctx).PLUSPLUS.getCharPositionInLine());
				}
				break;
			case 2:
				{
				setState(347);
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
		public TerminalNode LPAREN() { return getToken(CoreRebecaPropertyCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaPropertyCompleteParser.RPAREN, 0); }
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
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LPAREN);
			setState(352);
			((CastExpressionContext)_localctx).t = type();
			setState(353);
			match(RPAREN);
			setState(354);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaPropertyCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaPropertyCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RBRACKET, i);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaPropertyCompleteParser.LPAREN, 0); }
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
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(359);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB) | (1L << MONKEYS_AT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(361);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(366);
				match(RPAREN);
				}
				break;
			}
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					match(LBRACKET);
					setState(370);
					((PrimaryContext)_localctx).e2 = expression(0);
					setState(371);
					match(RBRACKET);
					_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
					}
					} 
				}
				setState(378);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaPropertyCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.COMMA, i);
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
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(380);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			((ExpressionListContext)_localctx).e = expression(0);
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(391);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				((ExpressionListContext)_localctx).e = expression(0);
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(406);
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
		public TerminalNode FLOATLITERAL() { return getToken(CoreRebecaPropertyCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(CoreRebecaPropertyCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(CoreRebecaPropertyCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(CoreRebecaPropertyCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CoreRebecaPropertyCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoreRebecaPropertyCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(CoreRebecaPropertyCompleteParser.NULL, 0); }
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
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(421);
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
		public TerminalNode PROPERTY() { return getToken(CoreRebecaPropertyCompleteParser.PROPERTY, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(CoreRebecaPropertyCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.LBRACE, i);
		}
		public PropertyDefinitionContext propertyDefinition() {
			return getRuleContext(PropertyDefinitionContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CoreRebecaPropertyCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.RBRACE, i);
		}
		public TerminalNode DEFINE() { return getToken(CoreRebecaPropertyCompleteParser.DEFINE, 0); }
		public List<TerminalNode> EQ() { return getTokens(CoreRebecaPropertyCompleteParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.EQ, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaPropertyCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.SEMI, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaPropertyCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaPropertyCompleteParser.IDENTIFIER, i);
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
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).enterPropertyModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaPropertyCompleteListener ) ((CoreRebecaPropertyCompleteListener)listener).exitPropertyModel(this);
		}
	}

	public final PropertyModelContext propertyModel() throws RecognitionException {
		PropertyModelContext _localctx = new PropertyModelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_propertyModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PropertyModelContext)_localctx).pm =  new PropertyModel();
			setState(426);
			match(PROPERTY);
			setState(427);
			match(LBRACE);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(428);
				match(DEFINE);
				setState(429);
				match(LBRACE);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(430);
					((PropertyModelContext)_localctx).id = match(IDENTIFIER);
					setState(431);
					match(EQ);
					setState(432);
					((PropertyModelContext)_localctx).e = expression(0);

								Definition definition = new Definition();
								definition.setName((((PropertyModelContext)_localctx).id!=null?((PropertyModelContext)_localctx).id.getText():null));
								definition.setExpression(((PropertyModelContext)_localctx).e.e);
								_localctx.pm.getDefinitions().add(definition);
					setState(434);
					match(SEMI);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				match(RBRACE);
				}
			}

			setState(444);
			propertyDefinition(_localctx.pm);
			setState(445);
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
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\61\n\2\f\2\16"+
		"\2\64\13\2\3\2\5\2\67\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2A\n\2\f\2"+
		"\16\2D\13\2\3\2\5\2G\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\3"+
		"\5\3T\n\3\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\6\6v\n\6\r\6\16\6w\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c6\n\7\f"+
		"\7\16\7\u00c9\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e3\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00eb\n\t\3\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fd\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0105\n\f\3\r\3\r\3\r\3\r\5\r\u010b\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0128\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0145\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014d\n\17\3\17\3\17\5\17\u0151\n"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0157\n\17\f\17\16\17\u015a\13\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0160\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u016f\n\21\3\21\5\21\u0172\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0179\n\21\f\21\16\21\u017c\13\21\3\22\3\22\3"+
		"\22\3\22\7\22\u0182\n\22\f\22\16\22\u0185\13\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u018d\n\22\f\22\16\22\u0190\13\22\3\22\3\22\3\22\7\22\u0195"+
		"\n\22\f\22\16\22\u0198\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01aa\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01b7\n\24\f\24\16\24\u01ba"+
		"\13\24\3\24\5\24\u01bd\n\24\3\24\3\24\3\24\3\24\2\3\f\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\2\2\u01f8\2\66\3\2\2\2\4H\3\2\2\2\6U\3"+
		"\2\2\2\ba\3\2\2\2\np\3\2\2\2\f\u0080\3\2\2\2\16\u00e2\3\2\2\2\20\u00ea"+
		"\3\2\2\2\22\u00f0\3\2\2\2\24\u00fc\3\2\2\2\26\u0104\3\2\2\2\30\u010a\3"+
		"\2\2\2\32\u0127\3\2\2\2\34\u0150\3\2\2\2\36\u0161\3\2\2\2 \u0167\3\2\2"+
		"\2\"\u017d\3\2\2\2$\u01a9\3\2\2\2&\u01ab\3\2\2\2()\7\7\2\2)\62\7\27\2"+
		"\2*+\7A\2\2+,\7\"\2\2,-\5\f\7\2-.\b\2\1\2./\7\33\2\2/\61\3\2\2\2\60*\3"+
		"\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3"+
		"\2\2\2\65\67\7\30\2\2\66(\3\2\2\2\66\67\3\2\2\2\67F\3\2\2\289\7\3\2\2"+
		"9B\7\27\2\2:;\7A\2\2;<\7\"\2\2<=\5\f\7\2=>\b\2\1\2>?\7\33\2\2?A\3\2\2"+
		"\2@:\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EG\7\30"+
		"\2\2F8\3\2\2\2FG\3\2\2\2G\3\3\2\2\2HI\b\3\1\2IJ\79\2\2JK\7A\2\2KS\b\3"+
		"\1\2LP\7\25\2\2MN\5\f\7\2NO\b\3\1\2OQ\3\2\2\2PM\3\2\2\2PQ\3\2\2\2QR\3"+
		"\2\2\2RT\7\26\2\2SL\3\2\2\2ST\3\2\2\2T\5\3\2\2\2UV\7A\2\2VZ\b\4\1\2WX"+
		"\5\b\5\2XY\b\4\1\2Y[\3\2\2\2ZW\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\]\5\n\6\2"+
		"]^\b\4\1\2^`\3\2\2\2_\\\3\2\2\2_`\3\2\2\2`\7\3\2\2\2ab\7<\2\2bc\b\5\1"+
		"\2cd\5\6\4\2dk\b\5\1\2ef\7\34\2\2fg\5\6\4\2gh\b\5\1\2hj\3\2\2\2ie\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7;\2\2o\t\3\2"+
		"\2\2pu\b\6\1\2qr\7\31\2\2rs\7\b\2\2st\7\32\2\2tv\b\6\1\2uq\3\2\2\2vw\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2x\13\3\2\2\2yz\b\7\1\2z{\5\34\17\2{|\b\7\1\2"+
		"|\u0081\3\2\2\2}~\5\32\16\2~\177\b\7\1\2\177\u0081\3\2\2\2\u0080y\3\2"+
		"\2\2\u0080}\3\2\2\2\u0081\u00c7\3\2\2\2\u0082\u0083\f\17\2\2\u0083\u0084"+
		"\5\20\t\2\u0084\u0085\5\f\7\20\u0085\u0086\b\7\1\2\u0086\u00c6\3\2\2\2"+
		"\u0087\u0088\f\16\2\2\u0088\u0089\5\22\n\2\u0089\u008a\5\f\7\17\u008a"+
		"\u008b\b\7\1\2\u008b\u00c6\3\2\2\2\u008c\u008d\f\r\2\2\u008d\u008e\5\26"+
		"\f\2\u008e\u008f\5\f\7\16\u008f\u0090\b\7\1\2\u0090\u00c6\3\2\2\2\u0091"+
		"\u0092\f\f\2\2\u0092\u0093\5\24\13\2\u0093\u0094\5\f\7\r\u0094\u0095\b"+
		"\7\1\2\u0095\u00c6\3\2\2\2\u0096\u0097\f\n\2\2\u0097\u0098\5\30\r\2\u0098"+
		"\u0099\5\f\7\13\u0099\u009a\b\7\1\2\u009a\u00c6\3\2\2\2\u009b\u009c\f"+
		"\t\2\2\u009c\u009d\7,\2\2\u009d\u009e\5\f\7\n\u009e\u009f\b\7\1\2\u009f"+
		"\u00c6\3\2\2\2\u00a0\u00a1\f\b\2\2\u00a1\u00a2\7.\2\2\u00a2\u00a3\5\f"+
		"\7\t\u00a3\u00a4\b\7\1\2\u00a4\u00c6\3\2\2\2\u00a5\u00a6\f\7\2\2\u00a6"+
		"\u00a7\7-\2\2\u00a7\u00a8\5\f\7\b\u00a8\u00a9\b\7\1\2\u00a9\u00c6\3\2"+
		"\2\2\u00aa\u00ab\f\6\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\5\f\7\7\u00ad"+
		"\u00ae\b\7\1\2\u00ae\u00c6\3\2\2\2\u00af\u00b0\f\5\2\2\u00b0\u00b1\7%"+
		"\2\2\u00b1\u00b2\5\f\7\6\u00b2\u00b3\b\7\1\2\u00b3\u00c6\3\2\2\2\u00b4"+
		"\u00b5\f\4\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7\""+
		"\2\2\u00b8\u00b9\5\f\7\5\u00b9\u00ba\b\7\1\2\u00ba\u00c6\3\2\2\2\u00bb"+
		"\u00bc\f\3\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\5\f\7\4\u00be\u00bf\b"+
		"\7\1\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\f\13\2\2\u00c1\u00c2\7\20\2\2\u00c2"+
		"\u00c3\5\6\4\2\u00c3\u00c4\b\7\1\2\u00c4\u00c6\3\2\2\2\u00c5\u0082\3\2"+
		"\2\2\u00c5\u0087\3\2\2\2\u00c5\u008c\3\2\2\2\u00c5\u0091\3\2\2\2\u00c5"+
		"\u0096\3\2\2\2\u00c5\u009b\3\2\2\2\u00c5\u00a0\3\2\2\2\u00c5\u00a5\3\2"+
		"\2\2\u00c5\u00aa\3\2\2\2\u00c5\u00af\3\2\2\2\u00c5\u00b4\3\2\2\2\u00c5"+
		"\u00bb\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\r\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb"+
		"\7\36\2\2\u00cb\u00e3\b\b\1\2\u00cc\u00cd\7\60\2\2\u00cd\u00e3\b\b\1\2"+
		"\u00ce\u00cf\7\61\2\2\u00cf\u00e3\b\b\1\2\u00d0\u00d1\7\62\2\2\u00d1\u00e3"+
		"\b\b\1\2\u00d2\u00d3\7\63\2\2\u00d3\u00e3\b\b\1\2\u00d4\u00d5\7\64\2\2"+
		"\u00d5\u00e3\b\b\1\2\u00d6\u00d7\7\65\2\2\u00d7\u00e3\b\b\1\2\u00d8\u00d9"+
		"\7\66\2\2\u00d9\u00e3\b\b\1\2\u00da\u00db\7\67\2\2\u00db\u00e3\b\b\1\2"+
		"\u00dc\u00dd\78\2\2\u00dd\u00e3\b\b\1\2\u00de\u00df\7>\2\2\u00df\u00e3"+
		"\b\b\1\2\u00e0\u00e1\7@\2\2\u00e1\u00e3\b\b\1\2\u00e2\u00ca\3\2\2\2\u00e2"+
		"\u00cc\3\2\2\2\u00e2\u00ce\3\2\2\2\u00e2\u00d0\3\2\2\2\u00e2\u00d2\3\2"+
		"\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\17\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5\u00eb\b\t\1\2\u00e6\u00e7"+
		"\7+\2\2\u00e7\u00eb\b\t\1\2\u00e8\u00e9\7/\2\2\u00e9\u00eb\b\t\1\2\u00ea"+
		"\u00e4\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\21\3\2\2"+
		"\2\u00ec\u00ed\7(\2\2\u00ed\u00f1\b\n\1\2\u00ee\u00ef\7)\2\2\u00ef\u00f1"+
		"\b\n\1\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\23\3\2\2\2\u00f2"+
		"\u00f3\7<\2\2\u00f3\u00f4\7\36\2\2\u00f4\u00fd\b\13\1\2\u00f5\u00f6\7"+
		";\2\2\u00f6\u00f7\7\36\2\2\u00f7\u00fd\b\13\1\2\u00f8\u00f9\7<\2\2\u00f9"+
		"\u00fd\b\13\1\2\u00fa\u00fb\7;\2\2\u00fb\u00fd\b\13\1\2\u00fc\u00f2\3"+
		"\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\25\3\2\2\2\u00fe\u00ff\7<\2\2\u00ff\u0100\7<\2\2\u0100\u0105\b\f\1\2"+
		"\u0101\u0102\7;\2\2\u0102\u0103\7;\2\2\u0103\u0105\b\f\1\2\u0104\u00fe"+
		"\3\2\2\2\u0104\u0101\3\2\2\2\u0105\27\3\2\2\2\u0106\u0107\7#\2\2\u0107"+
		"\u010b\b\r\1\2\u0108\u0109\7:\2\2\u0109\u010b\b\r\1\2\u010a\u0106\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\31\3\2\2\2\u010c\u010d\7(\2\2\u010d\u010e"+
		"\5\32\16\2\u010e\u010f\b\16\1\2\u010f\u0128\3\2\2\2\u0110\u0111\7)\2\2"+
		"\u0111\u0112\5\32\16\2\u0112\u0113\b\16\1\2\u0113\u0128\3\2\2\2\u0114"+
		"\u0115\7&\2\2\u0115\u0116\5\32\16\2\u0116\u0117\b\16\1\2\u0117\u0128\3"+
		"\2\2\2\u0118\u0119\7\'\2\2\u0119\u011a\5\32\16\2\u011a\u011b\b\16\1\2"+
		"\u011b\u0128\3\2\2\2\u011c\u011d\7 \2\2\u011d\u011e\5\32\16\2\u011e\u011f"+
		"\b\16\1\2\u011f\u0128\3\2\2\2\u0120\u0121\7\37\2\2\u0121\u0122\5\32\16"+
		"\2\u0122\u0123\b\16\1\2\u0123\u0128\3\2\2\2\u0124\u0125\5\34\17\2\u0125"+
		"\u0126\b\16\1\2\u0126\u0128\3\2\2\2\u0127\u010c\3\2\2\2\u0127\u0110\3"+
		"\2\2\2\u0127\u0114\3\2\2\2\u0127\u0118\3\2\2\2\u0127\u011c\3\2\2\2\u0127"+
		"\u0120\3\2\2\2\u0127\u0124\3\2\2\2\u0128\33\3\2\2\2\u0129\u012a\5\36\20"+
		"\2\u012a\u012b\b\17\1\2\u012b\u0151\3\2\2\2\u012c\u012d\7\25\2\2\u012d"+
		"\u012e\5\f\7\2\u012e\u012f\b\17\1\2\u012f\u0130\7\26\2\2\u0130\u0151\3"+
		"\2\2\2\u0131\u0132\5 \21\2\u0132\u0133\b\17\1\2\u0133\u0151\3\2\2\2\u0134"+
		"\u0135\5$\23\2\u0135\u0136\b\17\1\2\u0136\u0151\3\2\2\2\u0137\u0138\7"+
		"!\2\2\u0138\u0139\7\25\2\2\u0139\u013a\5\"\22\2\u013a\u013b\7\26\2\2\u013b"+
		"\u013c\b\17\1\2\u013c\u0151\3\2\2\2\u013d\u013e\7\21\2\2\u013e\u013f\5"+
		"\6\4\2\u013f\u0140\b\17\1\2\u0140\u0144\7\25\2\2\u0141\u0142\5\"\22\2"+
		"\u0142\u0143\b\17\1\2\u0143\u0145\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\26\2\2\u0147\u0148\7\"\2\2"+
		"\u0148\u014c\7\25\2\2\u0149\u014a\5\"\22\2\u014a\u014b\b\17\1\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\7\26\2\2\u014f\u0151\3\2\2\2\u0150\u0129\3\2\2\2\u0150"+
		"\u012c\3\2\2\2\u0150\u0131\3\2\2\2\u0150\u0134\3\2\2\2\u0150\u0137\3\2"+
		"\2\2\u0150\u013d\3\2\2\2\u0151\u0158\3\2\2\2\u0152\u0153\7\35\2\2\u0153"+
		"\u0154\5 \21\2\u0154\u0155\b\17\1\2\u0155\u0157\3\2\2\2\u0156\u0152\3"+
		"\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015f\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7&\2\2\u015c\u0160\b\17"+
		"\1\2\u015d\u015e\7\'\2\2\u015e\u0160\b\17\1\2\u015f\u015b\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\35\3\2\2\2\u0161\u0162\7\25\2"+
		"\2\u0162\u0163\5\6\4\2\u0163\u0164\7\26\2\2\u0164\u0165\5\f\7\2\u0165"+
		"\u0166\b\20\1\2\u0166\37\3\2\2\2\u0167\u0168\7A\2\2\u0168\u0171\b\21\1"+
		"\2\u0169\u016a\7\25\2\2\u016a\u016e\b\21\1\2\u016b\u016c\5\"\22\2\u016c"+
		"\u016d\b\21\1\2\u016d\u016f\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\7\26\2\2\u0171\u0169\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u017a\3\2\2\2\u0173\u0174\7\31\2\2\u0174\u0175\5"+
		"\f\7\2\u0175\u0176\7\32\2\2\u0176\u0177\b\21\1\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0173\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b!\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0183\b\22\1\2\u017e\u017f"+
		"\5\4\3\2\u017f\u0180\b\22\1\2\u0180\u0182\3\2\2\2\u0181\u017e\3\2\2\2"+
		"\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5\f\7\2\u0187\u0196\b\22\1\2"+
		"\u0188\u018e\7\34\2\2\u0189\u018a\5\4\3\2\u018a\u018b\b\22\1\2\u018b\u018d"+
		"\3\2\2\2\u018c\u0189\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\5\f"+
		"\7\2\u0192\u0193\b\22\1\2\u0193\u0195\3\2\2\2\u0194\u0188\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197#\3\2\2\2"+
		"\u0198\u0196\3\2\2\2\u0199\u019a\7\b\2\2\u019a\u01aa\b\23\1\2\u019b\u019c"+
		"\7\t\2\2\u019c\u01aa\b\23\1\2\u019d\u019e\7\n\2\2\u019e\u01aa\b\23\1\2"+
		"\u019f\u01a0\7\13\2\2\u01a0\u01aa\b\23\1\2\u01a1\u01a2\7\f\2\2\u01a2\u01aa"+
		"\b\23\1\2\u01a3\u01a4\7\22\2\2\u01a4\u01aa\b\23\1\2\u01a5\u01a6\7\23\2"+
		"\2\u01a6\u01aa\b\23\1\2\u01a7\u01a8\7\24\2\2\u01a8\u01aa\b\23\1\2\u01a9"+
		"\u0199\3\2\2\2\u01a9\u019b\3\2\2\2\u01a9\u019d\3\2\2\2\u01a9\u019f\3\2"+
		"\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa%\3\2\2\2\u01ab\u01ac\b\24\1\2\u01ac\u01ad\7\6\2\2"+
		"\u01ad\u01bc\7\27\2\2\u01ae\u01af\7\4\2\2\u01af\u01b8\7\27\2\2\u01b0\u01b1"+
		"\7A\2\2\u01b1\u01b2\7\36\2\2\u01b2\u01b3\5\f\7\2\u01b3\u01b4\b\24\1\2"+
		"\u01b4\u01b5\7\33\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bd\7\30\2\2\u01bc\u01ae\3\2\2\2\u01bc\u01bd\3"+
		"\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5\2\2\2\u01bf\u01c0\7\30\2\2\u01c0"+
		"\'\3\2\2\2$\62\66BFPSZ_kw\u0080\u00c5\u00c7\u00e2\u00ea\u00f0\u00fc\u0104"+
		"\u010a\u0127\u0144\u014c\u0150\u0158\u015f\u016e\u0171\u017a\u0183\u018e"+
		"\u0196\u01a9\u01b8\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}