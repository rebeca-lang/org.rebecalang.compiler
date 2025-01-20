// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/HybridRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridrebecaUtils;
	
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
public class HybridRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODE=1, PHYSICALCLASS=2, INV=3, GUARD=4, PRIORITIES=5, PRIME=6, AFTER=7, 
		DEADLINE=8, INTLITERAL=9, FLOATLITERAL=10, DOUBLELITERAL=11, CHARLITERAL=12, 
		STRINGLITERAL=13, WS=14, COMMENT=15, LINE_COMMENT=16, BREAK=17, CASE=18, 
		CLASS=19, CONTINUE=20, DEFAULT=21, ELSE=22, FOR=23, GOTO=24, IF=25, IMPORT=26, 
		NEW=27, PACKAGE=28, PRIVATE=29, PROTECTED=30, PUBLIC=31, RECORD=32, RETURN=33, 
		SWITCH=34, WHILE=35, ENV=36, FEATUREVAR=37, INSTANCEOF=38, REACTIVECLASS=39, 
		INTERFACE=40, ABSTRACT=41, EXTENDS=42, IMPLEMENTS=43, MSGSRV=44, MAIN=45, 
		STATEVARS=46, KNOWNREBECS=47, THIS=48, TRUE=49, FALSE=50, NULL=51, LPAREN=52, 
		RPAREN=53, LBRACE=54, RBRACE=55, LBRACKET=56, RBRACKET=57, SEMI=58, COMMA=59, 
		DOT=60, EQ=61, BANG=62, TILDA=63, QUES=64, COLON=65, EQEQ=66, AMPAMP=67, 
		BARBAR=68, PLUSPLUS=69, SUBSUB=70, SUPER=71, PLUS=72, SUB=73, STAR=74, 
		SLASH=75, AMP=76, BAR=77, CARET=78, PERCENT=79, PLUSEQ=80, SUBEQ=81, STAREQ=82, 
		SLASHEQ=83, AMPEQ=84, BAREQ=85, CARETEQ=86, TILDAEQ=87, PERCENTEQ=88, 
		MONKEYS_AT=89, BANGEQ=90, GT=91, LT=92, LTLT=93, LTLTEQ=94, GTGT=95, GTGTEQ=96, 
		IDENTIFIER=97;
	public static final int
		RULE_rebecaCode = 0, RULE_physicalClassDeclaration = 1, RULE_modeDeclaration = 2, 
		RULE_primary = 3, RULE_after = 4, RULE_deadline = 5, RULE_rebecaModel = 6, 
		RULE_packageDeclaration = 7, RULE_importDeclaration = 8, RULE_recordDeclaration = 9, 
		RULE_mainDeclaration = 10, RULE_mainRebecDefinition = 11, RULE_fieldDeclaration = 12, 
		RULE_variableDeclarators = 13, RULE_variableDeclarator = 14, RULE_variableInitializer = 15, 
		RULE_arrayInitializer = 16, RULE_interfaceDeclaration = 17, RULE_reactiveClassDeclaration = 18, 
		RULE_methodDeclaration = 19, RULE_constructorDeclaration = 20, RULE_msgsrvDeclaration = 21, 
		RULE_synchMethodDeclaration = 22, RULE_formalParameters = 23, RULE_formalParametersDeclaration = 24, 
		RULE_formalParameterDeclaration = 25, RULE_block = 26, RULE_statement = 27, 
		RULE_forInit = 28, RULE_switchBlock = 29, RULE_statementExpression = 30, 
		RULE_annotation = 31, RULE_type = 32, RULE_genericTypeParams = 33, RULE_dimensions = 34, 
		RULE_expression = 35, RULE_assignmentOperator = 36, RULE_multiplicativeOp = 37, 
		RULE_additiveOp = 38, RULE_relationalOp = 39, RULE_shiftOp = 40, RULE_equalityOp = 41, 
		RULE_unaryExpression = 42, RULE_coreExpression = 43, RULE_castExpression = 44, 
		RULE_expressionList = 45, RULE_literal = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"rebecaCode", "physicalClassDeclaration", "modeDeclaration", "primary", 
			"after", "deadline", "rebecaModel", "packageDeclaration", "importDeclaration", 
			"recordDeclaration", "mainDeclaration", "mainRebecDefinition", "fieldDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableInitializer", "arrayInitializer", 
			"interfaceDeclaration", "reactiveClassDeclaration", "methodDeclaration", 
			"constructorDeclaration", "msgsrvDeclaration", "synchMethodDeclaration", 
			"formalParameters", "formalParametersDeclaration", "formalParameterDeclaration", 
			"block", "statement", "forInit", "switchBlock", "statementExpression", 
			"annotation", "type", "genericTypeParams", "dimensions", "expression", 
			"assignmentOperator", "multiplicativeOp", "additiveOp", "relationalOp", 
			"shiftOp", "equalityOp", "unaryExpression", "coreExpression", "castExpression", 
			"expressionList", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mode'", "'physicalclass'", "'inv'", "'guard'", "'priorities'", 
			"'''", "'after'", "'deadline'", null, null, null, null, null, null, null, 
			null, "'break'", "'case'", "'class'", "'continue'", "'default'", "'else'", 
			"'for'", "'goto'", "'if'", "'import'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'record'", "'return'", "'switch'", "'while'", 
			"'env'", "'featurevar'", "'instanceof'", "'reactiveclass'", "'interface'", 
			"'abstract'", "'extends'", "'implements'", "'msgsrv'", "'main'", "'statevars'", 
			"'knownrebecs'", "'this'", "'true'", "'false'", "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'!'", "'~'", 
			"'?'", "':'", "'=='", "'&&'", "'||'", "'++'", "'--'", "'super'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'~='", "'%='", "'@'", "'!='", "'>'", 
			"'<'", "'<<'", "'<<='", "'>>'", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODE", "PHYSICALCLASS", "INV", "GUARD", "PRIORITIES", "PRIME", 
			"AFTER", "DEADLINE", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", 
			"STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "BREAK", "CASE", "CLASS", 
			"CONTINUE", "DEFAULT", "ELSE", "FOR", "GOTO", "IF", "IMPORT", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", "RETURN", "SWITCH", 
			"WHILE", "ENV", "FEATUREVAR", "INSTANCEOF", "REACTIVECLASS", "INTERFACE", 
			"ABSTRACT", "EXTENDS", "IMPLEMENTS", "MSGSRV", "MAIN", "STATEVARS", "KNOWNREBECS", 
			"THIS", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "EQ", "BANG", "TILDA", 
			"QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "SUPER", 
			"PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", 
			"SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "TILDAEQ", 
			"PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", "LT", "LTLT", "LTLTEQ", "GTGT", 
			"GTGTEQ", "IDENTIFIER"
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
	public String getGrammarFileName() { return "HybridRebecaComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HybridRebecaCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RebecaCodeContext extends ParserRuleContext {
		public HybridRebecaCode rc;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<RecordDeclarationContext> recordDeclaration() {
			return getRuleContexts(RecordDeclarationContext.class);
		}
		public RecordDeclarationContext recordDeclaration(int i) {
			return getRuleContext(RecordDeclarationContext.class,i);
		}
		public List<ReactiveClassDeclarationContext> reactiveClassDeclaration() {
			return getRuleContexts(ReactiveClassDeclarationContext.class);
		}
		public ReactiveClassDeclarationContext reactiveClassDeclaration(int i) {
			return getRuleContext(ReactiveClassDeclarationContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public List<PhysicalClassDeclarationContext> physicalClassDeclaration() {
			return getRuleContexts(PhysicalClassDeclarationContext.class);
		}
		public PhysicalClassDeclarationContext physicalClassDeclaration(int i) {
			return getRuleContext(PhysicalClassDeclarationContext.class,i);
		}
		public List<TerminalNode> ENV() { return getTokens(HybridRebecaCompleteParser.ENV); }
		public TerminalNode ENV(int i) {
			return getToken(HybridRebecaCompleteParser.ENV, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public List<TerminalNode> FEATUREVAR() { return getTokens(HybridRebecaCompleteParser.FEATUREVAR); }
		public TerminalNode FEATUREVAR(int i) {
			return getToken(HybridRebecaCompleteParser.FEATUREVAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public RebecaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRebecaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRebecaCode(this);
		}
	}

	public final RebecaCodeContext rebecaCode() throws RecognitionException {
		RebecaCodeContext _localctx = new RebecaCodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(94);
				recordDeclaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(100);
					match(ENV);
					setState(101);
					fieldDeclaration();
					setState(102);
					match(SEMI);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(104);
					match(FEATUREVAR);
					setState(105);
					match(IDENTIFIER);
					setState(106);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(112);
					reactiveClassDeclaration();
					}
					break;
				case 2:
					{
					setState(113);
					interfaceDeclaration();
					}
					break;
				case 3:
					{
					setState(114);
					physicalClassDeclaration();
					}
					break;
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PHYSICALCLASS) | (1L << REACTIVECLASS) | (1L << INTERFACE) | (1L << ABSTRACT))) != 0) || _la==MONKEYS_AT );
			setState(119);
			mainDeclaration();
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

	public static class PhysicalClassDeclarationContext extends ParserRuleContext {
		public PhysicalClassDeclaration pcd;
		public TerminalNode PHYSICALCLASS() { return getToken(HybridRebecaCompleteParser.PHYSICALCLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode INTLITERAL() { return getToken(HybridRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(HybridRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HybridRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACE, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode KNOWNREBECS() { return getToken(HybridRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode STATEVARS() { return getToken(HybridRebecaCompleteParser.STATEVARS, 0); }
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MsgsrvDeclarationContext> msgsrvDeclaration() {
			return getRuleContexts(MsgsrvDeclarationContext.class);
		}
		public MsgsrvDeclarationContext msgsrvDeclaration(int i) {
			return getRuleContext(MsgsrvDeclarationContext.class,i);
		}
		public List<SynchMethodDeclarationContext> synchMethodDeclaration() {
			return getRuleContexts(SynchMethodDeclarationContext.class);
		}
		public SynchMethodDeclarationContext synchMethodDeclaration(int i) {
			return getRuleContext(SynchMethodDeclarationContext.class,i);
		}
		public List<ModeDeclarationContext> modeDeclaration() {
			return getRuleContexts(ModeDeclarationContext.class);
		}
		public ModeDeclarationContext modeDeclaration(int i) {
			return getRuleContext(ModeDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public PhysicalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physicalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterPhysicalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitPhysicalClassDeclaration(this);
		}
	}

	public final PhysicalClassDeclarationContext physicalClassDeclaration() throws RecognitionException {
		PhysicalClassDeclarationContext _localctx = new PhysicalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_physicalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(121);
				annotation();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(PHYSICALCLASS);
			setState(128);
			match(IDENTIFIER);
			setState(129);
			match(LPAREN);
			setState(130);
			match(INTLITERAL);
			setState(131);
			match(RPAREN);
			setState(132);
			match(LBRACE);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(133);
				match(KNOWNREBECS);
				setState(134);
				match(LBRACE);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(135);
					fieldDeclaration();
					setState(136);
					match(SEMI);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(RBRACE);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(146);
				match(STATEVARS);
				setState(147);
				match(LBRACE);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(148);
					fieldDeclaration();
					setState(149);
					match(SEMI);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(RBRACE);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODE) | (1L << ABSTRACT) | (1L << MSGSRV))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(159);
					constructorDeclaration();
					}
					break;
				case 2:
					{
					setState(160);
					msgsrvDeclaration();
					}
					break;
				case 3:
					{
					setState(161);
					synchMethodDeclaration();
					}
					break;
				case 4:
					{
					setState(162);
					modeDeclaration();
					}
					break;
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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

	public static class ModeDeclarationContext extends ParserRuleContext {
		public ModeDeclaration md;
		public TerminalNode MODE() { return getToken(HybridRebecaCompleteParser.MODE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode INV() { return getToken(HybridRebecaCompleteParser.INV, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode GUARD() { return getToken(HybridRebecaCompleteParser.GUARD, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public ModeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterModeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitModeDeclaration(this);
		}
	}

	public final ModeDeclarationContext modeDeclaration() throws RecognitionException {
		ModeDeclarationContext _localctx = new ModeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(MODE);
			setState(171);
			match(IDENTIFIER);
			setState(172);
			match(LBRACE);
			setState(173);
			match(INV);
			setState(174);
			match(LPAREN);
			setState(175);
			expression(0);
			setState(176);
			match(RPAREN);
			setState(177);
			block();
			setState(178);
			match(GUARD);
			setState(179);
			match(LPAREN);
			setState(180);
			expression(0);
			setState(181);
			match(RPAREN);
			setState(182);
			block();
			setState(183);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(HybridRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HybridRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> PRIME() { return getTokens(HybridRebecaCompleteParser.PRIME); }
		public TerminalNode PRIME(int i) {
			return getToken(HybridRebecaCompleteParser.PRIME, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public AfterContext after() {
			return getRuleContext(AfterContext.class,0);
		}
		public DeadlineContext deadline() {
			return getRuleContext(DeadlineContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IDENTIFIER);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(186);
				match(LPAREN);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(187);
					expressionList();
					}
				}

				setState(190);
				match(RPAREN);
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(191);
					after();
					}
					break;
				}
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(194);
					deadline();
					}
					break;
				}
				}
				break;
			}
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(LBRACKET);
					setState(200);
					expression(0);
					setState(201);
					match(RBRACKET);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(PRIME);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class AfterContext extends ParserRuleContext {
		public Expression e;
		public TerminalNode AFTER() { return getToken(HybridRebecaCompleteParser.AFTER, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public AfterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_after; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAfter(this);
		}
	}

	public final AfterContext after() throws RecognitionException {
		AfterContext _localctx = new AfterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_after);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(AFTER);
			setState(215);
			match(LPAREN);
			setState(216);
			expression(0);
			setState(217);
			match(RPAREN);
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

	public static class DeadlineContext extends ParserRuleContext {
		public Expression e;
		public TerminalNode DEADLINE() { return getToken(HybridRebecaCompleteParser.DEADLINE, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public DeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deadline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterDeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitDeadline(this);
		}
	}

	public final DeadlineContext deadline() throws RecognitionException {
		DeadlineContext _localctx = new DeadlineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(DEADLINE);
			setState(220);
			match(LPAREN);
			setState(221);
			expression(0);
			setState(222);
			match(RPAREN);
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

	public static class RebecaModelContext extends ParserRuleContext {
		public RebecaModel r;
		public PackageDeclarationContext p;
		public ImportDeclarationContext i;
		public RebecaCodeContext t1;
		public RebecaCodeContext rebecaCode() {
			return getRuleContext(RebecaCodeContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public RebecaModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRebecaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRebecaModel(this);
		}
	}

	public final RebecaModelContext rebecaModel() throws RecognitionException {
		RebecaModelContext _localctx = new RebecaModelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(225);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(230);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(238);
			((RebecaModelContext)_localctx).t1 = rebecaCode();
			_localctx.r.setRebecaCode(((RebecaModelContext)_localctx).t1.rc);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageDeclaration p;
		public TerminalNode PACKAGE() { return getToken(HybridRebecaCompleteParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PACKAGE);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclaration i;
		public TerminalNode IMPORT() { return getToken(HybridRebecaCompleteParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IMPORT);
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

	public static class RecordDeclarationContext extends ParserRuleContext {
		public RecordDeclaration rd;
		public TerminalNode RECORD() { return getToken(HybridRebecaCompleteParser.RECORD, 0); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(RECORD);
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

	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration md;
		public Token MAIN;
		public MainRebecDefinitionContext mrd;
		public Token RBRACE;
		public TerminalNode MAIN() { return getToken(HybridRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<MainRebecDefinitionContext> mainRebecDefinition() {
			return getRuleContexts(MainRebecDefinitionContext.class);
		}
		public MainRebecDefinitionContext mainRebecDefinition(int i) {
			return getRuleContext(MainRebecDefinitionContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(248);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(250);
			match(LBRACE);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(251);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			((MainDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.md.setEndLineNumber(((MainDeclarationContext)_localctx).RBRACE.getLine());_localctx.md.setEndCharacter(((MainDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class MainRebecDefinitionContext extends ParserRuleContext {
		public MainRebecDefinition mrd;
		public AnnotationContext an;
		public TypeContext t;
		public Token rebecName;
		public ExpressionListContext el;
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(HybridRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public MainRebecDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRebecDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMainRebecDefinition(this);
		}
	}

	public final MainRebecDefinitionContext mainRebecDefinition() throws RecognitionException {
		MainRebecDefinitionContext _localctx = new MainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(263);
				((MainRebecDefinitionContext)_localctx).an = annotation();
				_localctx.mrd.getAnnotations().add(((MainRebecDefinitionContext)_localctx).an.an);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(272);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(274);
			match(LPAREN);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(275);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(280);
			match(RPAREN);
			setState(281);
			match(COLON);
			setState(282);
			match(LPAREN);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(283);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(288);
			match(RPAREN);
			setState(289);
			match(SEMI);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclaration fd;
		public AnnotationContext an;
		public TypeContext t;
		public VariableDeclaratorsContext vds;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(292);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			((FieldDeclarationContext)_localctx).t = type();
			setState(301);
			((FieldDeclarationContext)_localctx).vds = variableDeclarators();
			_localctx.fd.setType(((FieldDeclarationContext)_localctx).t.t);
					 _localctx.fd.getVariableDeclarators().addAll(((FieldDeclarationContext)_localctx).vds.vds);
			    	 _localctx.fd.setCharacter(((FieldDeclarationContext)_localctx).t.t.getCharacter());
					 _localctx.fd.setLineNumber(((FieldDeclarationContext)_localctx).t.t.getLineNumber());
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclarator> vds;
		public VariableDeclaratorContext vd;
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(305);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(307);
				match(COMMA);
				setState(308);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(315);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclarator vd;
		public Token name;
		public VariableInitializerContext vi;
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(HybridRebecaCompleteParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(317);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(319);
				match(EQ);
				setState(320);
				((VariableDeclaratorContext)_localctx).vi = variableInitializer();
				_localctx.vd.setVariableInitializer(((VariableDeclaratorContext)_localctx).vi.vi);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializer vi;
		public ArrayInitializerContext ai;
		public ExpressionContext e;
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableInitializer);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				((VariableInitializerContext)_localctx).ai = arrayInitializer();
				((VariableInitializerContext)_localctx).vi =  ((VariableInitializerContext)_localctx).ai.avi;
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
			case BANG:
			case TILDA:
			case QUES:
			case PLUSPLUS:
			case SUBSUB:
			case PLUS:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				((VariableInitializerContext)_localctx).e = expression(0);
				if(((VariableInitializerContext)_localctx).e.e != null) {
				    						((VariableInitializerContext)_localctx).vi =  new OrdinaryVariableInitializer();
				    						((OrdinaryVariableInitializer)_localctx.vi).setValue(((VariableInitializerContext)_localctx).e.e);
				    						_localctx.vi.setLineNumber(((VariableInitializerContext)_localctx).e.e.getLineNumber());
				    						_localctx.vi.setCharacter(((VariableInitializerContext)_localctx).e.e.getCharacter());
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayVariableInitializer avi;
		public Token LBRACE;
		public VariableInitializerContext vi;
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(334);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(335);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(348);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclaration intd;
		public AnnotationContext an;
		public Token interfaceName;
		public Token extendingInterfaceName;
		public Token name;
		public FormalParametersContext fps;
		public Token RBRACE;
		public TerminalNode INTERFACE() { return getToken(HybridRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(HybridRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> MSGSRV() { return getTokens(HybridRebecaCompleteParser.MSGSRV); }
		public TerminalNode MSGSRV(int i) {
			return getToken(HybridRebecaCompleteParser.MSGSRV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<FormalParametersContext> formalParameters() {
			return getRuleContexts(FormalParametersContext.class);
		}
		public FormalParametersContext formalParameters(int i) {
			return getRuleContext(FormalParametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(351);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(INTERFACE);
			setState(360);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(362);
				match(EXTENDS);
				setState(363);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(365);
					match(COMMA);
					setState(366);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(375);
			match(LBRACE);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==MONKEYS_AT) {
				{
				{
				MethodDeclaration md = new MsgsrvDeclaration();md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(377);
					((InterfaceDeclarationContext)_localctx).an = annotation();
					md.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				match(MSGSRV);
				setState(386);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(388);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(390);
				match(SEMI);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			((InterfaceDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.intd.setEndLineNumber(((InterfaceDeclarationContext)_localctx).RBRACE.getLine());_localctx.intd.setEndCharacter(((InterfaceDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class ReactiveClassDeclarationContext extends ParserRuleContext {
		public ReactiveClassDeclaration rcd;
		public AnnotationContext an;
		public Token reactiveClassName;
		public Token extendingReactiveClassName;
		public Token implementingInterfaceName;
		public Token queueSize;
		public FieldDeclarationContext fd;
		public Token RBRACE;
		public ConstructorDeclarationContext cd;
		public MsgsrvDeclarationContext md;
		public SynchMethodDeclarationContext smd;
		public TerminalNode REACTIVECLASS() { return getToken(HybridRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(HybridRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HybridRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode INTLITERAL() { return getToken(HybridRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(HybridRebecaCompleteParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(HybridRebecaCompleteParser.IMPLEMENTS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MsgsrvDeclarationContext> msgsrvDeclaration() {
			return getRuleContexts(MsgsrvDeclarationContext.class);
		}
		public MsgsrvDeclarationContext msgsrvDeclaration(int i) {
			return getRuleContext(MsgsrvDeclarationContext.class,i);
		}
		public List<SynchMethodDeclarationContext> synchMethodDeclaration() {
			return getRuleContexts(SynchMethodDeclarationContext.class);
		}
		public SynchMethodDeclarationContext synchMethodDeclaration(int i) {
			return getRuleContext(SynchMethodDeclarationContext.class,i);
		}
		public List<TerminalNode> KNOWNREBECS() { return getTokens(HybridRebecaCompleteParser.KNOWNREBECS); }
		public TerminalNode KNOWNREBECS(int i) {
			return getToken(HybridRebecaCompleteParser.KNOWNREBECS, i);
		}
		public List<TerminalNode> STATEVARS() { return getTokens(HybridRebecaCompleteParser.STATEVARS); }
		public TerminalNode STATEVARS(int i) {
			return getToken(HybridRebecaCompleteParser.STATEVARS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ReactiveClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactiveClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(401);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(409);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(413);
			match(REACTIVECLASS);
			setState(414);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(416);
				match(EXTENDS);
				setState(417);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(421);
				match(IMPLEMENTS);
				setState(422);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(424);
					match(COMMA);
					setState(425);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(434);
			match(LPAREN);
			setState(435);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(437);
			match(RPAREN);
			setState(438);
			match(LBRACE);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (ABSTRACT - 41)) | (1L << (MSGSRV - 41)) | (1L << (STATEVARS - 41)) | (1L << (KNOWNREBECS - 41)) | (1L << (MONKEYS_AT - 41)) | (1L << (IDENTIFIER - 41)))) != 0)) {
				{
				setState(472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					{
					setState(439);
					match(KNOWNREBECS);
					setState(440);
					match(LBRACE);
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(441);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(443);
						match(SEMI);
						}
						}
						setState(449);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(450);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 2:
					{
					{
					setState(451);
					match(STATEVARS);
					setState(452);
					match(LBRACE);
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(453);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(455);
						match(SEMI);
						}
						}
						setState(461);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(462);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 3:
					{
					setState(463);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 4:
					{
					setState(466);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 5:
					{
					setState(469);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.rcd.setEndLineNumber(((ReactiveClassDeclarationContext)_localctx).RBRACE.getLine());_localctx.rcd.setEndCharacter(((ReactiveClassDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration md;
		public Token name;
		public FormalParametersContext fps;
		public BlockContext b;
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HybridRebecaCompleteParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, MethodDeclaration md) {
			super(parent, invokingState);
			this.md = md;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(MethodDeclaration md) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), md);
		enterRule(_localctx, 38, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(482);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(484);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(487);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaration cd;
		public AnnotationContext an;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(491);
				((ConstructorDeclarationContext)_localctx).an = annotation();
				_localctx.cd.getAnnotations().add(((ConstructorDeclarationContext)_localctx).an.an);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			methodDeclaration(_localctx.cd);
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

	public static class MsgsrvDeclarationContext extends ParserRuleContext {
		public MsgsrvDeclaration md;
		public AnnotationContext an;
		public TerminalNode MSGSRV() { return getToken(HybridRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MsgsrvDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgsrvDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(502);
				((MsgsrvDeclarationContext)_localctx).an = annotation();
				_localctx.md.getAnnotations().add(((MsgsrvDeclarationContext)_localctx).an.an);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(510);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(514);
			match(MSGSRV);
			setState(515);
			methodDeclaration(_localctx.md);
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

	public static class SynchMethodDeclarationContext extends ParserRuleContext {
		public SynchMethodDeclaration smd;
		public AnnotationContext an;
		public TypeContext t;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SynchMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(518);
				((SynchMethodDeclarationContext)_localctx).an = annotation();
				_localctx.smd.getAnnotations().add(((SynchMethodDeclarationContext)_localctx).an.an);
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(526);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(530);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(532);
			methodDeclaration(_localctx.smd);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterDeclaration> fps;
		public FormalParametersDeclarationContext fpds;
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public FormalParametersDeclarationContext formalParametersDeclaration() {
			return getRuleContext(FormalParametersDeclarationContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(535);
			match(LPAREN);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(536);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(541);
			match(RPAREN);
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

	public static class FormalParametersDeclarationContext extends ParserRuleContext {
		public List<FormalParameterDeclaration> fpds;
		public FormalParameterDeclarationContext fpd;
		public List<FormalParameterDeclarationContext> formalParameterDeclaration() {
			return getRuleContexts(FormalParameterDeclarationContext.class);
		}
		public FormalParameterDeclarationContext formalParameterDeclaration(int i) {
			return getRuleContext(FormalParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public FormalParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFormalParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFormalParametersDeclaration(this);
		}
	}

	public final FormalParametersDeclarationContext formalParametersDeclaration() throws RecognitionException {
		FormalParametersDeclarationContext _localctx = new FormalParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(544);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(546);
				match(COMMA);
				setState(547);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(554);
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

	public static class FormalParameterDeclarationContext extends ParserRuleContext {
		public FormalParameterDeclaration fpd;
		public TypeContext t;
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFormalParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFormalParameterDeclaration(this);
		}
	}

	public final FormalParameterDeclarationContext formalParameterDeclaration() throws RecognitionException {
		FormalParameterDeclarationContext _localctx = new FormalParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(556);
			((FormalParameterDeclarationContext)_localctx).name = match(IDENTIFIER);

			            ((FormalParameterDeclarationContext)_localctx).fpd =  new FormalParameterDeclaration();
						_localctx.fpd.setLineNumber(((FormalParameterDeclarationContext)_localctx).name.getLine());
						_localctx.fpd.setCharacter(((FormalParameterDeclarationContext)_localctx).name.getCharPositionInLine());
			            _localctx.fpd.setName((((FormalParameterDeclarationContext)_localctx).name!=null?((FormalParameterDeclarationContext)_localctx).name.getText():null));
			            _localctx.fpd.setType(((FormalParameterDeclarationContext)_localctx).t.t);
			        
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStatement bs;
		public Token LBRACE;
		public AnnotationContext an;
		public StatementContext s;
		public Token RBRACE;
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(560);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				ArrayList<Annotation> anns = new ArrayList<Annotation>();
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(563);
						((BlockContext)_localctx).an = annotation();
						anns.add(((BlockContext)_localctx).an.an);
						}
						} 
					}
					setState(570);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(571);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s); ((BlockContext)_localctx).s.s.getAnnotations().addAll(anns);
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			((BlockContext)_localctx).RBRACE = match(RBRACE);
			_localctx.bs.setEndLineNumber(((BlockContext)_localctx).RBRACE.getLine());_localctx.bs.setEndCharacter(((BlockContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class StatementContext extends ParserRuleContext {
		public Statement s;
		public StatementExpressionContext se;
		public FieldDeclarationContext fd;
		public BlockContext b;
		public Token IF;
		public ExpressionContext e;
		public StatementContext st;
		public StatementContext est;
		public Token WHILE;
		public Token FOR;
		public ForInitContext fi;
		public ExpressionListContext el;
		public Token SWITCH;
		public SwitchBlockContext sb;
		public Token RETURN;
		public Token BREAK;
		public Token CONTINUE;
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(HybridRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HybridRebecaCompleteParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(HybridRebecaCompleteParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(HybridRebecaCompleteParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(HybridRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(HybridRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(HybridRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(HybridRebecaCompleteParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		int _la;
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(584);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(588);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(595);
				match(LPAREN);
				setState(596);
				((StatementContext)_localctx).e = expression(0);
				setState(597);
				match(RPAREN);
				setState(598);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(600);
					match(ELSE);
					setState(601);
					((StatementContext)_localctx).est = statement();
					((ConditionalStatement)_localctx.s).setElseStatement(((StatementContext)_localctx).est.s);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(606);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(608);
				match(LPAREN);
				setState(609);
				((StatementContext)_localctx).e = expression(0);
				setState(610);
				match(RPAREN);
				setState(611);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(614);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(616);
				match(LPAREN);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(617);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(622);
				match(SEMI);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(623);
					((StatementContext)_localctx).e = expression(0);
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(628);
				match(SEMI);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(629);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(634);
				match(RPAREN);
				setState(635);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(638);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(639);
				match(LPAREN);
				setState(640);
				((StatementContext)_localctx).e = expression(0);
				setState(641);
				match(RPAREN);
				setState(642);
				match(LBRACE);
				setState(643);
				((StatementContext)_localctx).sb = switchBlock();
				setState(644);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(647);
				((StatementContext)_localctx).RETURN = match(RETURN);
				((StatementContext)_localctx).s =  new ReturnStatement();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(649);
					((StatementContext)_localctx).e = expression(0);
					((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e);
					}
				}

				setState(654);
				match(SEMI);
				_localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());
				    	 _localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(656);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(657);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(659);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(660);
				match(SEMI);
				((StatementContext)_localctx).s =  new ContinueStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(662);
				match(SEMI);
				((StatementContext)_localctx).s =  new Statement();
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

	public static class ForInitContext extends ParserRuleContext {
		public ForInitializer fi;
		public FieldDeclarationContext fd;
		public ExpressionListContext el;
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forInit);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				((ForInitContext)_localctx).el = expressionList();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.getExpressions().addAll(((ForInitContext)_localctx).el.el);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchStatement ss;
		public AnnotationContext an;
		public ExpressionContext e;
		public StatementContext st;
		public Token DEFAULT;
		public List<TerminalNode> CASE() { return getTokens(HybridRebecaCompleteParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(HybridRebecaCompleteParser.CASE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HybridRebecaCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HybridRebecaCompleteParser.COLON, i);
		}
		public TerminalNode DEFAULT() { return getToken(HybridRebecaCompleteParser.DEFAULT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(704); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    		
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(676);
					((SwitchBlockContext)_localctx).an = annotation();
					anns.add(((SwitchBlockContext)_localctx).an.an);
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684);
				match(CASE);
				setState(685);
				((SwitchBlockContext)_localctx).e = expression(0);
				setState(686);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(693);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(688);
								((SwitchBlockContext)_localctx).an = annotation();
								anns.add(((SwitchBlockContext)_localctx).an.an);
								}
								} 
							}
							setState(695);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						}
						setState(696);
						((SwitchBlockContext)_localctx).st = statement();

											((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns);
											_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1)
												.getStatements().add(((SwitchBlockContext)_localctx).st.s);
										
						}
						} 
					}
					setState(703);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				}
				setState(706); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==MONKEYS_AT );
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(708);
				((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);
				setState(709);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(716);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(711);
							((SwitchBlockContext)_localctx).an = annotation();
							anns.add(((SwitchBlockContext)_localctx).an.an);
							}
							} 
						}
						setState(718);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					}
					setState(719);
					((SwitchBlockContext)_localctx).st = statement();
					((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns); _localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public Statement se;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			((StatementExpressionContext)_localctx).e = expression(0);
			((StatementExpressionContext)_localctx).se =  ((StatementExpressionContext)_localctx).e.e;
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
		public TerminalNode MONKEYS_AT() { return getToken(HybridRebecaCompleteParser.MONKEYS_AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(733);
			match(MONKEYS_AT);
			setState(734);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(736);
				match(LPAREN);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(737);
					((AnnotationContext)_localctx).exp = expression(0);
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(742);
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
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(747);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(752);
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
		public TerminalNode LT() { return getToken(HybridRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(HybridRebecaCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(759);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(761);
				match(COMMA);
				setState(762);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770);
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
		public List<TerminalNode> LBRACKET() { return getTokens(HybridRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HybridRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(HybridRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(HybridRebecaCompleteParser.INTLITERAL, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(777); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(773);
					match(LBRACKET);
					setState(774);
					((DimensionsContext)_localctx).i = match(INTLITERAL);
					setState(775);
					match(RBRACKET);
					_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(779); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		public TerminalNode AMP() { return getToken(HybridRebecaCompleteParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(HybridRebecaCompleteParser.CARET, 0); }
		public TerminalNode BAR() { return getToken(HybridRebecaCompleteParser.BAR, 0); }
		public TerminalNode AMPAMP() { return getToken(HybridRebecaCompleteParser.AMPAMP, 0); }
		public TerminalNode BARBAR() { return getToken(HybridRebecaCompleteParser.BARBAR, 0); }
		public TerminalNode QUES() { return getToken(HybridRebecaCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(HybridRebecaCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitExpression(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(782);
				((ExpressionContext)_localctx).ece = coreExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ece.e;
				}
				break;
			case 2:
				{
				setState(785);
				((ExpressionContext)_localctx).ue = unaryExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ue.e;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(857);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.me1 = _prevctx;
						_localctx.me1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(791);
						((ExpressionContext)_localctx).mo = multiplicativeOp();
						setState(792);
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
						setState(795);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(796);
						((ExpressionContext)_localctx).ado = additiveOp();
						setState(797);
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
						setState(800);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(801);
						((ExpressionContext)_localctx).so = shiftOp();
						setState(802);
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
						setState(805);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(806);
						((ExpressionContext)_localctx).ro = relationalOp();
						setState(807);
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
						setState(810);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(811);
						((ExpressionContext)_localctx).eo = equalityOp();
						setState(812);
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
						setState(815);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(816);
						((ExpressionContext)_localctx).AMP = match(AMP);
						setState(817);
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
						setState(820);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(821);
						((ExpressionContext)_localctx).CARET = match(CARET);
						setState(822);
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
						setState(825);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(826);
						((ExpressionContext)_localctx).BAR = match(BAR);
						setState(827);
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
						setState(830);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(831);
						((ExpressionContext)_localctx).AMPAMP = match(AMPAMP);
						setState(832);
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
						setState(835);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(836);
						((ExpressionContext)_localctx).BARBAR = match(BARBAR);
						setState(837);
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
						setState(840);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(841);
						match(QUES);
						setState(842);
						((ExpressionContext)_localctx).cee2 = expression(0);
						setState(843);
						match(COLON);
						setState(844);
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
						setState(847);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(848);
						((ExpressionContext)_localctx).ao = assignmentOperator();
						setState(849);
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
						setState(852);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(853);
						match(INSTANCEOF);
						setState(854);
						((ExpressionContext)_localctx).t = type();
						InstanceofExpression e3 = new InstanceofExpression(); e3.setValue(((ExpressionContext)_localctx).ie1.e); e3.setEvaluationType(((ExpressionContext)_localctx).t.t);
						                       e3.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE); e3.setLineNumber(((ExpressionContext)_localctx).t.t.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).t.t.getCharacter());
						                       ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					}
					} 
				}
				setState(861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		public TerminalNode EQ() { return getToken(HybridRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(HybridRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(HybridRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(HybridRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(HybridRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(HybridRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(HybridRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(HybridRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(HybridRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(HybridRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(HybridRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(HybridRebecaCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignmentOperator);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(868);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(872);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(876);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(878);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(880);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(882);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(884);
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
		public TerminalNode STAR() { return getToken(HybridRebecaCompleteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(HybridRebecaCompleteParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HybridRebecaCompleteParser.PERCENT, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMultiplicativeOp(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_multiplicativeOp);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				((MultiplicativeOpContext)_localctx).STAR = match(STAR);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).STAR!=null?((MultiplicativeOpContext)_localctx).STAR.getText():null);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				((MultiplicativeOpContext)_localctx).SLASH = match(SLASH);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).SLASH!=null?((MultiplicativeOpContext)_localctx).SLASH.getText():null);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
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
		public TerminalNode PLUS() { return getToken(HybridRebecaCompleteParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(HybridRebecaCompleteParser.SUB, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAdditiveOp(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_additiveOp);
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				((AdditiveOpContext)_localctx).PLUS = match(PLUS);
				((AdditiveOpContext)_localctx).ado =  (((AdditiveOpContext)_localctx).PLUS!=null?((AdditiveOpContext)_localctx).PLUS.getText():null);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
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
		public TerminalNode LT() { return getToken(HybridRebecaCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(HybridRebecaCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(HybridRebecaCompleteParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relationalOp);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(903);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(906);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
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
		public List<TerminalNode> LT() { return getTokens(HybridRebecaCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HybridRebecaCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(HybridRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HybridRebecaCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shiftOp);
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				match(LT);
				setState(915);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(GT);
				setState(918);
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
		public TerminalNode EQEQ() { return getToken(HybridRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(HybridRebecaCompleteParser.BANGEQ, 0); }
		public EqualityOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterEqualityOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitEqualityOp(this);
		}
	}

	public final EqualityOpContext equalityOp() throws RecognitionException {
		EqualityOpContext _localctx = new EqualityOpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_equalityOp);
		try {
			setState(926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				((EqualityOpContext)_localctx).EQEQ = match(EQEQ);
				((EqualityOpContext)_localctx).eo =  (((EqualityOpContext)_localctx).EQEQ!=null?((EqualityOpContext)_localctx).EQEQ.getText():null);
				}
				break;
			case BANGEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
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
		public TerminalNode PLUS() { return getToken(HybridRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(HybridRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(HybridRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(HybridRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(HybridRebecaCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(HybridRebecaCompleteParser.BANG, 0); }
		public CoreExpressionContext coreExpression() {
			return getRuleContext(CoreExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unaryExpression);
		try {
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(PLUS);
				setState(929);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(933);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(937);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(941);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case TILDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(944);
				((UnaryExpressionContext)_localctx).TILDA = match(TILDA);
				setState(945);
				((UnaryExpressionContext)_localctx).et = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).TILDA!=null?((UnaryExpressionContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).et.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).et.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).et.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(948);
				((UnaryExpressionContext)_localctx).BANG = match(BANG);
				setState(949);
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
				setState(952);
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
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(HybridRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(HybridRebecaCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(HybridRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HybridRebecaCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(HybridRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(HybridRebecaCompleteParser.SUBSUB, 0); }
		public CoreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterCoreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitCoreExpression(this);
		}
	}

	public final CoreExpressionContext coreExpression() throws RecognitionException {
		CoreExpressionContext _localctx = new CoreExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_coreExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(957);
				((CoreExpressionContext)_localctx).ec = castExpression();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ec.e;
				}
				break;
			case 2:
				{
				setState(960);
				match(LPAREN);
				setState(961);
				((CoreExpressionContext)_localctx).ep = expression(0);
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ep.e;
				setState(963);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(965);
				((CoreExpressionContext)_localctx).p = primary();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).p.tp;
				}
				break;
			case 4:
				{
				setState(968);
				((CoreExpressionContext)_localctx).l = literal();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).l.l;
				}
				break;
			case 5:
				{
				setState(971);
				((CoreExpressionContext)_localctx).QUES = match(QUES);
				setState(972);
				match(LPAREN);
				setState(973);
				((CoreExpressionContext)_localctx).el = expressionList();
				setState(974);
				match(RPAREN);
				((CoreExpressionContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((CoreExpressionContext)_localctx).el.el);
					    	_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).QUES.getCharPositionInLine());
				}
				break;
			case 6:
				{
				setState(977);
				match(NEW);
				setState(978);
				((CoreExpressionContext)_localctx).t = type();
				((CoreExpressionContext)_localctx).e =  new RebecInstantiationPrimary();
								_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((CoreExpressionContext)_localctx).t.t);
				setState(980);
				match(LPAREN);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(981);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(986);
				match(RPAREN);
				setState(987);
				match(COLON);
				setState(988);
				match(LPAREN);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(989);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(994);
				match(RPAREN);
				}
				break;
			}
			setState(1004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(998);
					((CoreExpressionContext)_localctx).DOT = match(DOT);
					setState(999);
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
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1007);
				((CoreExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((CoreExpressionContext)_localctx).e = pse;
				        		pse.setLineNumber(((CoreExpressionContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((CoreExpressionContext)_localctx).PLUSPLUS.getCharPositionInLine());
				}
				break;
			case 2:
				{
				setState(1009);
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
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(LPAREN);
			setState(1014);
			((CastExpressionContext)_localctx).t = type();
			setState(1015);
			match(RPAREN);
			setState(1016);
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
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(1020);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1028);
			((ExpressionListContext)_localctx).e = expression(0);
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1030);
				match(COMMA);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(1031);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(1038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1039);
				((ExpressionListContext)_localctx).e = expression(0);
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(1046);
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
		public TerminalNode INTLITERAL() { return getToken(HybridRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(HybridRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(HybridRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(HybridRebecaCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(HybridRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(HybridRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HybridRebecaCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(HybridRebecaCompleteParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		try {
			setState(1063);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1053);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1057);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1059);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1061);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3c\u042c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\3\2\6\2v\n\2\r\2\16"+
		"\2w\3\2\3\2\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\u008d\n\3\f\3\16\3\u0090\13\3\3\3\5\3\u0093\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\u009a\n\3\f\3\16\3\u009d\13\3\3\3\5\3\u00a0\n"+
		"\3\3\3\3\3\3\3\3\3\7\3\u00a6\n\3\f\3\16\3\u00a9\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u00bf"+
		"\n\5\3\5\3\5\5\5\u00c3\n\5\3\5\5\5\u00c6\n\5\5\5\u00c8\n\5\3\5\3\5\3\5"+
		"\3\5\7\5\u00ce\n\5\f\5\16\5\u00d1\13\5\3\5\7\5\u00d4\n\5\f\5\16\5\u00d7"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00e7"+
		"\n\b\3\b\3\b\3\b\7\b\u00ec\n\b\f\b\16\b\u00ef\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0101\n\f\f\f\16\f"+
		"\u0104\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u010d\n\r\f\r\16\r\u0110\13"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0119\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0121\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u012a\n\16\f\16\16\16"+
		"\u012d\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u013a\n\17\f\17\16\17\u013d\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0146\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u014e\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0158\n\22\f\22\16\22\u015b\13"+
		"\22\5\22\u015d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0165\n\23\f\23"+
		"\16\23\u0168\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0173"+
		"\n\23\f\23\16\23\u0176\13\23\5\23\u0178\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u017f\n\23\f\23\16\23\u0182\13\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u018b\n\23\f\23\16\23\u018e\13\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\7\24\u0197\n\24\f\24\16\24\u019a\13\24\3\24\3\24\5\24\u019e"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a6\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u01ae\n\24\f\24\16\24\u01b1\13\24\5\24\u01b3\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01c0\n\24\f\24"+
		"\16\24\u01c3\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01cc\n\24"+
		"\f\24\16\24\u01cf\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u01db\n\24\f\24\16\24\u01de\13\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u01eb\n\25\3\26\3\26\3\26\3\26\7\26"+
		"\u01f1\n\26\f\26\16\26\u01f4\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u01fc\n\27\f\27\16\27\u01ff\13\27\3\27\3\27\5\27\u0203\n\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\7\30\u020c\n\30\f\30\16\30\u020f\13\30\3\30"+
		"\3\30\5\30\u0213\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u021e\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0229\n"+
		"\32\f\32\16\32\u022c\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0239\n\34\f\34\16\34\u023c\13\34\3\34\3\34\3\34\7\34"+
		"\u0241\n\34\f\34\16\34\u0244\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u025f\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u026f\n\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0275\n\35\3\35\3\35\3\35\3\35\5\35\u027b\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u028f\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u029b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02a3\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u02aa\n\37\f\37\16\37\u02ad\13\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u02b6\n\37\f\37\16\37\u02b9\13\37\3\37\3"+
		"\37\3\37\7\37\u02be\n\37\f\37\16\37\u02c1\13\37\6\37\u02c3\n\37\r\37\16"+
		"\37\u02c4\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u02cd\n\37\f\37\16\37\u02d0"+
		"\13\37\3\37\3\37\3\37\7\37\u02d5\n\37\f\37\16\37\u02d8\13\37\5\37\u02da"+
		"\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u02e7\n!\3!\5!\u02ea\n!\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u02f1\n\"\3\"\3\"\3\"\5\"\u02f6\n\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\7#\u0300\n#\f#\16#\u0303\13#\3#\3#\3$\3$\3$\3$\3$\6$\u030c"+
		"\n$\r$\16$\u030d\3%\3%\3%\3%\3%\3%\3%\5%\u0317\n%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u035c\n%\f%\16%\u035f\13"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u0379\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0381\n\'\3(\3(\3(\3(\5("+
		"\u0387\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0393\n)\3*\3*\3*\3*\3*\3*"+
		"\5*\u039b\n*\3+\3+\3+\3+\5+\u03a1\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03be\n,\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u03db\n-\3-\3-\3-\3-\3-\3-\5-\u03e3\n-\3-\3-\5-\u03e7\n-\3-\3-"+
		"\3-\3-\7-\u03ed\n-\f-\16-\u03f0\13-\3-\3-\3-\3-\5-\u03f6\n-\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\7/\u0402\n/\f/\16/\u0405\13/\3/\3/\3/\3/\3/\3/\7/"+
		"\u040d\n/\f/\16/\u0410\13/\3/\3/\3/\7/\u0415\n/\f/\16/\u0418\13/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u042a\n\60\3\60\2\3H\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\2\2\u0490\2c\3\2\2\2\4"+
		"~\3\2\2\2\6\u00ac\3\2\2\2\b\u00bb\3\2\2\2\n\u00d8\3\2\2\2\f\u00dd\3\2"+
		"\2\2\16\u00e2\3\2\2\2\20\u00f3\3\2\2\2\22\u00f5\3\2\2\2\24\u00f7\3\2\2"+
		"\2\26\u00f9\3\2\2\2\30\u0108\3\2\2\2\32\u0125\3\2\2\2\34\u0132\3\2\2\2"+
		"\36\u013e\3\2\2\2 \u014d\3\2\2\2\"\u014f\3\2\2\2$\u0160\3\2\2\2&\u0192"+
		"\3\2\2\2(\u01e2\3\2\2\2*\u01ec\3\2\2\2,\u01f7\3\2\2\2.\u0207\3\2\2\2\60"+
		"\u0218\3\2\2\2\62\u0221\3\2\2\2\64\u022d\3\2\2\2\66\u0231\3\2\2\28\u029a"+
		"\3\2\2\2:\u02a2\3\2\2\2<\u02a4\3\2\2\2>\u02db\3\2\2\2@\u02de\3\2\2\2B"+
		"\u02eb\3\2\2\2D\u02f7\3\2\2\2F\u0306\3\2\2\2H\u0316\3\2\2\2J\u0378\3\2"+
		"\2\2L\u0380\3\2\2\2N\u0386\3\2\2\2P\u0392\3\2\2\2R\u039a\3\2\2\2T\u03a0"+
		"\3\2\2\2V\u03bd\3\2\2\2X\u03e6\3\2\2\2Z\u03f7\3\2\2\2\\\u03fd\3\2\2\2"+
		"^\u0429\3\2\2\2`b\5\24\13\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2do"+
		"\3\2\2\2ec\3\2\2\2fg\7&\2\2gh\5\32\16\2hi\7<\2\2in\3\2\2\2jk\7\'\2\2k"+
		"l\7c\2\2ln\7<\2\2mf\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu"+
		"\3\2\2\2qo\3\2\2\2rv\5&\24\2sv\5$\23\2tv\5\4\3\2ur\3\2\2\2us\3\2\2\2u"+
		"t\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5\26\f\2z\3\3\2\2"+
		"\2{}\5@!\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7\66\2\2\u0084\u0085\7\13\2\2\u0085\u0086\7\67\2\2\u0086\u0092\78\2\2"+
		"\u0087\u0088\7\61\2\2\u0088\u008e\78\2\2\u0089\u008a\5\32\16\2\u008a\u008b"+
		"\7<\2\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0093\79\2\2\u0092\u0087\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u009f\3\2\2\2\u0094\u0095\7\60\2\2\u0095\u009b\78\2\2\u0096\u0097\5\32"+
		"\16\2\u0097\u0098\7<\2\2\u0098\u009a\3\2\2\2\u0099\u0096\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\79\2\2\u009f\u0094\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a7\3\2\2\2\u00a1\u00a6\5*\26\2\u00a2\u00a6\5,"+
		"\27\2\u00a3\u00a6\5.\30\2\u00a4\u00a6\5\6\4\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\79\2\2\u00ab\5\3\2\2\2\u00ac\u00ad\7\3\2\2"+
		"\u00ad\u00ae\7c\2\2\u00ae\u00af\78\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1"+
		"\7\66\2\2\u00b1\u00b2\5H%\2\u00b2\u00b3\7\67\2\2\u00b3\u00b4\5\66\34\2"+
		"\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7\66\2\2\u00b6\u00b7\5H%\2\u00b7\u00b8"+
		"\7\67\2\2\u00b8\u00b9\5\66\34\2\u00b9\u00ba\79\2\2\u00ba\7\3\2\2\2\u00bb"+
		"\u00c7\7c\2\2\u00bc\u00be\7\66\2\2\u00bd\u00bf\5\\/\2\u00be\u00bd\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7\67\2\2\u00c1"+
		"\u00c3\5\n\6\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c6\5\f\7\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cf\3\2"+
		"\2\2\u00c9\u00ca\7:\2\2\u00ca\u00cb\5H%\2\u00cb\u00cc\7;\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\7\b"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\t\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\t\2\2"+
		"\u00d9\u00da\7\66\2\2\u00da\u00db\5H%\2\u00db\u00dc\7\67\2\2\u00dc\13"+
		"\3\2\2\2\u00dd\u00de\7\n\2\2\u00de\u00df\7\66\2\2\u00df\u00e0\5H%\2\u00e0"+
		"\u00e1\7\67\2\2\u00e1\r\3\2\2\2\u00e2\u00e6\b\b\1\2\u00e3\u00e4\5\20\t"+
		"\2\u00e4\u00e5\b\b\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\b\b\1\2"+
		"\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\5\2\2\2\u00f1\u00f2\b\b\1\2\u00f2\17\3\2\2\2\u00f3\u00f4\7\36\2"+
		"\2\u00f4\21\3\2\2\2\u00f5\u00f6\7\34\2\2\u00f6\23\3\2\2\2\u00f7\u00f8"+
		"\7\"\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\b\f\1\2\u00fa\u00fb\7/\2\2\u00fb"+
		"\u00fc\b\f\1\2\u00fc\u0102\78\2\2\u00fd\u00fe\5\30\r\2\u00fe\u00ff\b\f"+
		"\1\2\u00ff\u0101\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\79\2\2\u0106\u0107\b\f\1\2\u0107\27\3\2\2\2\u0108\u010e"+
		"\b\r\1\2\u0109\u010a\5@!\2\u010a\u010b\b\r\1\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0109\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\5B\"\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\b\r\1\2\u0114\u0118\7\66\2\2\u0115\u0116\5\\"+
		"/\2\u0116\u0117\b\r\1\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\67\2\2\u011b\u011c\7"+
		"C\2\2\u011c\u0120\7\66\2\2\u011d\u011e\5\\/\2\u011e\u011f\b\r\1\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\7\67\2\2\u0123\u0124\7<\2\2\u0124\31\3\2\2\2\u0125\u012b"+
		"\b\16\1\2\u0126\u0127\5@!\2\u0127\u0128\b\16\1\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5B\"\2\u012f"+
		"\u0130\5\34\17\2\u0130\u0131\b\16\1\2\u0131\33\3\2\2\2\u0132\u0133\b\17"+
		"\1\2\u0133\u0134\5\36\20\2\u0134\u013b\b\17\1\2\u0135\u0136\7=\2\2\u0136"+
		"\u0137\5\36\20\2\u0137\u0138\b\17\1\2\u0138\u013a\3\2\2\2\u0139\u0135"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\35\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b\20\1\2\u013f\u0140\7c\2"+
		"\2\u0140\u0145\b\20\1\2\u0141\u0142\7?\2\2\u0142\u0143\5 \21\2\u0143\u0144"+
		"\b\20\1\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2"+
		"\u0146\37\3\2\2\2\u0147\u0148\5\"\22\2\u0148\u0149\b\21\1\2\u0149\u014e"+
		"\3\2\2\2\u014a\u014b\5H%\2\u014b\u014c\b\21\1\2\u014c\u014e\3\2\2\2\u014d"+
		"\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e!\3\2\2\2\u014f\u0150\b\22\1\2"+
		"\u0150\u015c\78\2\2\u0151\u0152\5 \21\2\u0152\u0159\b\22\1\2\u0153\u0154"+
		"\7=\2\2\u0154\u0155\5 \21\2\u0155\u0156\b\22\1\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0153\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0151\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\79\2\2\u015f#\3\2\2\2\u0160"+
		"\u0166\b\23\1\2\u0161\u0162\5@!\2\u0162\u0163\b\23\1\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0161\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7*"+
		"\2\2\u016a\u016b\7c\2\2\u016b\u0177\b\23\1\2\u016c\u016d\7,\2\2\u016d"+
		"\u016e\7c\2\2\u016e\u0174\b\23\1\2\u016f\u0170\7=\2\2\u0170\u0171\7c\2"+
		"\2\u0171\u0173\b\23\1\2\u0172\u016f\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u016c\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u018c\78\2\2\u017a\u0180\b\23\1\2\u017b\u017c\5@!\2\u017c\u017d\b\23"+
		"\1\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0184\7.\2\2\u0184\u0185\7c\2\2\u0185\u0186\b\23\1\2\u0186"+
		"\u0187\5\60\31\2\u0187\u0188\b\23\1\2\u0188\u0189\7<\2\2\u0189\u018b\3"+
		"\2\2\2\u018a\u017a\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\79"+
		"\2\2\u0190\u0191\b\23\1\2\u0191%\3\2\2\2\u0192\u0198\b\24\1\2\u0193\u0194"+
		"\5@!\2\u0194\u0195\b\24\1\2\u0195\u0197\3\2\2\2\u0196\u0193\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019d\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7+\2\2\u019c\u019e\b\24\1\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7)"+
		"\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a5\b\24\1\2\u01a2\u01a3\7,\2\2\u01a3"+
		"\u01a4\7c\2\2\u01a4\u01a6\b\24\1\2\u01a5\u01a2\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01b2\3\2\2\2\u01a7\u01a8\7-\2\2\u01a8\u01a9\7c\2\2\u01a9\u01af"+
		"\b\24\1\2\u01aa\u01ab\7=\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ae\b\24\1\2\u01ad"+
		"\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01a7\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7\66\2\2\u01b5\u01b6\7"+
		"\13\2\2\u01b6\u01b7\b\24\1\2\u01b7\u01b8\7\67\2\2\u01b8\u01dc\78\2\2\u01b9"+
		"\u01ba\7\61\2\2\u01ba\u01c1\78\2\2\u01bb\u01bc\5\32\16\2\u01bc\u01bd\b"+
		"\24\1\2\u01bd\u01be\7<\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bb\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01db\79\2\2\u01c5\u01c6\7\60\2\2\u01c6"+
		"\u01cd\78\2\2\u01c7\u01c8\5\32\16\2\u01c8\u01c9\b\24\1\2\u01c9\u01ca\7"+
		"<\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01d0\u01db\79\2\2\u01d1\u01d2\5*\26\2\u01d2\u01d3\b\24\1\2\u01d3"+
		"\u01db\3\2\2\2\u01d4\u01d5\5,\27\2\u01d5\u01d6\b\24\1\2\u01d6\u01db\3"+
		"\2\2\2\u01d7\u01d8\5.\30\2\u01d8\u01d9\b\24\1\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01b9\3\2\2\2\u01da\u01c5\3\2\2\2\u01da\u01d1\3\2\2\2\u01da\u01d4\3\2"+
		"\2\2\u01da\u01d7\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\79"+
		"\2\2\u01e0\u01e1\b\24\1\2\u01e1\'\3\2\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4"+
		"\b\25\1\2\u01e4\u01e5\5\60\31\2\u01e5\u01ea\b\25\1\2\u01e6\u01e7\5\66"+
		"\34\2\u01e7\u01e8\b\25\1\2\u01e8\u01eb\3\2\2\2\u01e9\u01eb\7<\2\2\u01ea"+
		"\u01e6\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb)\3\2\2\2\u01ec\u01f2\b\26\1\2"+
		"\u01ed\u01ee\5@!\2\u01ee\u01ef\b\26\1\2\u01ef\u01f1\3\2\2\2\u01f0\u01ed"+
		"\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\5(\25\2\u01f6+\3\2\2\2"+
		"\u01f7\u01fd\b\27\1\2\u01f8\u01f9\5@!\2\u01f9\u01fa\b\27\1\2\u01fa\u01fc"+
		"\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0202\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7+"+
		"\2\2\u0201\u0203\b\27\1\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\7.\2\2\u0205\u0206\5(\25\2\u0206-\3\2\2\2\u0207"+
		"\u020d\b\30\1\2\u0208\u0209\5@!\2\u0209\u020a\b\30\1\2\u020a\u020c\3\2"+
		"\2\2\u020b\u0208\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0212\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7+"+
		"\2\2\u0211\u0213\b\30\1\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\5B\"\2\u0215\u0216\b\30\1\2\u0216\u0217\5("+
		"\25\2\u0217/\3\2\2\2\u0218\u0219\b\31\1\2\u0219\u021d\7\66\2\2\u021a\u021b"+
		"\5\62\32\2\u021b\u021c\b\31\1\2\u021c\u021e\3\2\2\2\u021d\u021a\3\2\2"+
		"\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\7\67\2\2\u0220"+
		"\61\3\2\2\2\u0221\u0222\b\32\1\2\u0222\u0223\5\64\33\2\u0223\u022a\b\32"+
		"\1\2\u0224\u0225\7=\2\2\u0225\u0226\5\64\33\2\u0226\u0227\b\32\1\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0224\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\63\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e"+
		"\5B\"\2\u022e\u022f\7c\2\2\u022f\u0230\b\33\1\2\u0230\65\3\2\2\2\u0231"+
		"\u0232\b\34\1\2\u0232\u0233\78\2\2\u0233\u0242\b\34\1\2\u0234\u023a\b"+
		"\34\1\2\u0235\u0236\5@!\2\u0236\u0237\b\34\1\2\u0237\u0239\3\2\2\2\u0238"+
		"\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\58\35\2\u023e"+
		"\u023f\b\34\1\2\u023f\u0241\3\2\2\2\u0240\u0234\3\2\2\2\u0241\u0244\3"+
		"\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0246\79\2\2\u0246\u0247\b\34\1\2\u0247\67\3\2\2"+
		"\2\u0248\u0249\5> \2\u0249\u024a\b\35\1\2\u024a\u024b\7<\2\2\u024b\u029b"+
		"\3\2\2\2\u024c\u024d\5\32\16\2\u024d\u024e\b\35\1\2\u024e\u024f\7<\2\2"+
		"\u024f\u029b\3\2\2\2\u0250\u0251\5\66\34\2\u0251\u0252\b\35\1\2\u0252"+
		"\u029b\3\2\2\2\u0253\u0254\7\33\2\2\u0254\u0255\b\35\1\2\u0255\u0256\7"+
		"\66\2\2\u0256\u0257\5H%\2\u0257\u0258\7\67\2\2\u0258\u0259\58\35\2\u0259"+
		"\u025e\b\35\1\2\u025a\u025b\7\30\2\2\u025b\u025c\58\35\2\u025c\u025d\b"+
		"\35\1\2\u025d\u025f\3\2\2\2\u025e\u025a\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u029b\3\2\2\2\u0260\u0261\7%\2\2\u0261\u0262\b\35\1\2\u0262\u0263\7\66"+
		"\2\2\u0263\u0264\5H%\2\u0264\u0265\7\67\2\2\u0265\u0266\58\35\2\u0266"+
		"\u0267\b\35\1\2\u0267\u029b\3\2\2\2\u0268\u0269\7\31\2\2\u0269\u026a\b"+
		"\35\1\2\u026a\u026e\7\66\2\2\u026b\u026c\5:\36\2\u026c\u026d\b\35\1\2"+
		"\u026d\u026f\3\2\2\2\u026e\u026b\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0274\7<\2\2\u0271\u0272\5H%\2\u0272\u0273\b\35\1\2\u0273"+
		"\u0275\3\2\2\2\u0274\u0271\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u027a\7<\2\2\u0277\u0278\5\\/\2\u0278\u0279\b\35\1\2\u0279"+
		"\u027b\3\2\2\2\u027a\u0277\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u027d\7\67\2\2\u027d\u027e\58\35\2\u027e\u027f\b\35\1\2\u027f"+
		"\u029b\3\2\2\2\u0280\u0281\7$\2\2\u0281\u0282\7\66\2\2\u0282\u0283\5H"+
		"%\2\u0283\u0284\7\67\2\2\u0284\u0285\78\2\2\u0285\u0286\5<\37\2\u0286"+
		"\u0287\79\2\2\u0287\u0288\b\35\1\2\u0288\u029b\3\2\2\2\u0289\u028a\7#"+
		"\2\2\u028a\u028e\b\35\1\2\u028b\u028c\5H%\2\u028c\u028d\b\35\1\2\u028d"+
		"\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u0291\7<\2\2\u0291\u029b\b\35\1\2\u0292\u0293\7\23\2\2\u0293"+
		"\u0294\7<\2\2\u0294\u029b\b\35\1\2\u0295\u0296\7\26\2\2\u0296\u0297\7"+
		"<\2\2\u0297\u029b\b\35\1\2\u0298\u0299\7<\2\2\u0299\u029b\b\35\1\2\u029a"+
		"\u0248\3\2\2\2\u029a\u024c\3\2\2\2\u029a\u0250\3\2\2\2\u029a\u0253\3\2"+
		"\2\2\u029a\u0260\3\2\2\2\u029a\u0268\3\2\2\2\u029a\u0280\3\2\2\2\u029a"+
		"\u0289\3\2\2\2\u029a\u0292\3\2\2\2\u029a\u0295\3\2\2\2\u029a\u0298\3\2"+
		"\2\2\u029b9\3\2\2\2\u029c\u029d\5\32\16\2\u029d\u029e\b\36\1\2\u029e\u02a3"+
		"\3\2\2\2\u029f\u02a0\5\\/\2\u02a0\u02a1\b\36\1\2\u02a1\u02a3\3\2\2\2\u02a2"+
		"\u029c\3\2\2\2\u02a2\u029f\3\2\2\2\u02a3;\3\2\2\2\u02a4\u02c2\b\37\1\2"+
		"\u02a5\u02ab\b\37\1\2\u02a6\u02a7\5@!\2\u02a7\u02a8\b\37\1\2\u02a8\u02aa"+
		"\3\2\2\2\u02a9\u02a6\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7\24"+
		"\2\2\u02af\u02b0\5H%\2\u02b0\u02b1\7C\2\2\u02b1\u02bf\b\37\1\2\u02b2\u02b3"+
		"\5@!\2\u02b3\u02b4\b\37\1\2\u02b4\u02b6\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\58\35\2\u02bb\u02bc\b\37\1\2\u02bc"+
		"\u02be\3\2\2\2\u02bd\u02b7\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2"+
		"\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2"+
		"\u02a5\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02d9\3\2\2\2\u02c6\u02c7\7\27\2\2\u02c7\u02c8\7C\2\2\u02c8"+
		"\u02d6\b\37\1\2\u02c9\u02ca\5@!\2\u02ca\u02cb\b\37\1\2\u02cb\u02cd\3\2"+
		"\2\2\u02cc\u02c9\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\58"+
		"\35\2\u02d2\u02d3\b\37\1\2\u02d3\u02d5\3\2\2\2\u02d4\u02ce\3\2\2\2\u02d5"+
		"\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02da\3\2"+
		"\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02c6\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"=\3\2\2\2\u02db\u02dc\5H%\2\u02dc\u02dd\b \1\2\u02dd?\3\2\2\2\u02de\u02df"+
		"\b!\1\2\u02df\u02e0\7[\2\2\u02e0\u02e1\7c\2\2\u02e1\u02e9\b!\1\2\u02e2"+
		"\u02e6\7\66\2\2\u02e3\u02e4\5H%\2\u02e4\u02e5\b!\1\2\u02e5\u02e7\3\2\2"+
		"\2\u02e6\u02e3\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea"+
		"\7\67\2\2\u02e9\u02e2\3\2\2\2\u02e9\u02ea\3\2\2\2\u02eaA\3\2\2\2\u02eb"+
		"\u02ec\7c\2\2\u02ec\u02f0\b\"\1\2\u02ed\u02ee\5D#\2\u02ee\u02ef\b\"\1"+
		"\2\u02ef\u02f1\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f5"+
		"\3\2\2\2\u02f2\u02f3\5F$\2\u02f3\u02f4\b\"\1\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02f2\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6C\3\2\2\2\u02f7\u02f8\7^\2\2\u02f8"+
		"\u02f9\b#\1\2\u02f9\u02fa\5B\"\2\u02fa\u0301\b#\1\2\u02fb\u02fc\7=\2\2"+
		"\u02fc\u02fd\5B\"\2\u02fd\u02fe\b#\1\2\u02fe\u0300\3\2\2\2\u02ff\u02fb"+
		"\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\7]\2\2\u0305E\3\2\2\2\u0306"+
		"\u030b\b$\1\2\u0307\u0308\7:\2\2\u0308\u0309\7\13\2\2\u0309\u030a\7;\2"+
		"\2\u030a\u030c\b$\1\2\u030b\u0307\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030eG\3\2\2\2\u030f\u0310\b%\1\2\u0310\u0311"+
		"\5X-\2\u0311\u0312\b%\1\2\u0312\u0317\3\2\2\2\u0313\u0314\5V,\2\u0314"+
		"\u0315\b%\1\2\u0315\u0317\3\2\2\2\u0316\u030f\3\2\2\2\u0316\u0313\3\2"+
		"\2\2\u0317\u035d\3\2\2\2\u0318\u0319\f\17\2\2\u0319\u031a\5L\'\2\u031a"+
		"\u031b\5H%\20\u031b\u031c\b%\1\2\u031c\u035c\3\2\2\2\u031d\u031e\f\16"+
		"\2\2\u031e\u031f\5N(\2\u031f\u0320\5H%\17\u0320\u0321\b%\1\2\u0321\u035c"+
		"\3\2\2\2\u0322\u0323\f\r\2\2\u0323\u0324\5R*\2\u0324\u0325\5H%\16\u0325"+
		"\u0326\b%\1\2\u0326\u035c\3\2\2\2\u0327\u0328\f\f\2\2\u0328\u0329\5P)"+
		"\2\u0329\u032a\5H%\r\u032a\u032b\b%\1\2\u032b\u035c\3\2\2\2\u032c\u032d"+
		"\f\n\2\2\u032d\u032e\5T+\2\u032e\u032f\5H%\13\u032f\u0330\b%\1\2\u0330"+
		"\u035c\3\2\2\2\u0331\u0332\f\t\2\2\u0332\u0333\7N\2\2\u0333\u0334\5H%"+
		"\n\u0334\u0335\b%\1\2\u0335\u035c\3\2\2\2\u0336\u0337\f\b\2\2\u0337\u0338"+
		"\7P\2\2\u0338\u0339\5H%\t\u0339\u033a\b%\1\2\u033a\u035c\3\2\2\2\u033b"+
		"\u033c\f\7\2\2\u033c\u033d\7O\2\2\u033d\u033e\5H%\b\u033e\u033f\b%\1\2"+
		"\u033f\u035c\3\2\2\2\u0340\u0341\f\6\2\2\u0341\u0342\7E\2\2\u0342\u0343"+
		"\5H%\7\u0343\u0344\b%\1\2\u0344\u035c\3\2\2\2\u0345\u0346\f\5\2\2\u0346"+
		"\u0347\7F\2\2\u0347\u0348\5H%\6\u0348\u0349\b%\1\2\u0349\u035c\3\2\2\2"+
		"\u034a\u034b\f\4\2\2\u034b\u034c\7B\2\2\u034c\u034d\5H%\2\u034d\u034e"+
		"\7C\2\2\u034e\u034f\5H%\5\u034f\u0350\b%\1\2\u0350\u035c\3\2\2\2\u0351"+
		"\u0352\f\3\2\2\u0352\u0353\5J&\2\u0353\u0354\5H%\4\u0354\u0355\b%\1\2"+
		"\u0355\u035c\3\2\2\2\u0356\u0357\f\13\2\2\u0357\u0358\7(\2\2\u0358\u0359"+
		"\5B\"\2\u0359\u035a\b%\1\2\u035a\u035c\3\2\2\2\u035b\u0318\3\2\2\2\u035b"+
		"\u031d\3\2\2\2\u035b\u0322\3\2\2\2\u035b\u0327\3\2\2\2\u035b\u032c\3\2"+
		"\2\2\u035b\u0331\3\2\2\2\u035b\u0336\3\2\2\2\u035b\u033b\3\2\2\2\u035b"+
		"\u0340\3\2\2\2\u035b\u0345\3\2\2\2\u035b\u034a\3\2\2\2\u035b\u0351\3\2"+
		"\2\2\u035b\u0356\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035eI\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0361\7?\2\2\u0361"+
		"\u0379\b&\1\2\u0362\u0363\7R\2\2\u0363\u0379\b&\1\2\u0364\u0365\7S\2\2"+
		"\u0365\u0379\b&\1\2\u0366\u0367\7T\2\2\u0367\u0379\b&\1\2\u0368\u0369"+
		"\7U\2\2\u0369\u0379\b&\1\2\u036a\u036b\7V\2\2\u036b\u0379\b&\1\2\u036c"+
		"\u036d\7W\2\2\u036d\u0379\b&\1\2\u036e\u036f\7X\2\2\u036f\u0379\b&\1\2"+
		"\u0370\u0371\7Y\2\2\u0371\u0379\b&\1\2\u0372\u0373\7Z\2\2\u0373\u0379"+
		"\b&\1\2\u0374\u0375\7`\2\2\u0375\u0379\b&\1\2\u0376\u0377\7b\2\2\u0377"+
		"\u0379\b&\1\2\u0378\u0360\3\2\2\2\u0378\u0362\3\2\2\2\u0378\u0364\3\2"+
		"\2\2\u0378\u0366\3\2\2\2\u0378\u0368\3\2\2\2\u0378\u036a\3\2\2\2\u0378"+
		"\u036c\3\2\2\2\u0378\u036e\3\2\2\2\u0378\u0370\3\2\2\2\u0378\u0372\3\2"+
		"\2\2\u0378\u0374\3\2\2\2\u0378\u0376\3\2\2\2\u0379K\3\2\2\2\u037a\u037b"+
		"\7L\2\2\u037b\u0381\b\'\1\2\u037c\u037d\7M\2\2\u037d\u0381\b\'\1\2\u037e"+
		"\u037f\7Q\2\2\u037f\u0381\b\'\1\2\u0380\u037a\3\2\2\2\u0380\u037c\3\2"+
		"\2\2\u0380\u037e\3\2\2\2\u0381M\3\2\2\2\u0382\u0383\7J\2\2\u0383\u0387"+
		"\b(\1\2\u0384\u0385\7K\2\2\u0385\u0387\b(\1\2\u0386\u0382\3\2\2\2\u0386"+
		"\u0384\3\2\2\2\u0387O\3\2\2\2\u0388\u0389\7^\2\2\u0389\u038a\7?\2\2\u038a"+
		"\u0393\b)\1\2\u038b\u038c\7]\2\2\u038c\u038d\7?\2\2\u038d\u0393\b)\1\2"+
		"\u038e\u038f\7^\2\2\u038f\u0393\b)\1\2\u0390\u0391\7]\2\2\u0391\u0393"+
		"\b)\1\2\u0392\u0388\3\2\2\2\u0392\u038b\3\2\2\2\u0392\u038e\3\2\2\2\u0392"+
		"\u0390\3\2\2\2\u0393Q\3\2\2\2\u0394\u0395\7^\2\2\u0395\u0396\7^\2\2\u0396"+
		"\u039b\b*\1\2\u0397\u0398\7]\2\2\u0398\u0399\7]\2\2\u0399\u039b\b*\1\2"+
		"\u039a\u0394\3\2\2\2\u039a\u0397\3\2\2\2\u039bS\3\2\2\2\u039c\u039d\7"+
		"D\2\2\u039d\u03a1\b+\1\2\u039e\u039f\7\\\2\2\u039f\u03a1\b+\1\2\u03a0"+
		"\u039c\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1U\3\2\2\2\u03a2\u03a3\7J\2\2\u03a3"+
		"\u03a4\5V,\2\u03a4\u03a5\b,\1\2\u03a5\u03be\3\2\2\2\u03a6\u03a7\7K\2\2"+
		"\u03a7\u03a8\5V,\2\u03a8\u03a9\b,\1\2\u03a9\u03be\3\2\2\2\u03aa\u03ab"+
		"\7G\2\2\u03ab\u03ac\5V,\2\u03ac\u03ad\b,\1\2\u03ad\u03be\3\2\2\2\u03ae"+
		"\u03af\7H\2\2\u03af\u03b0\5V,\2\u03b0\u03b1\b,\1\2\u03b1\u03be\3\2\2\2"+
		"\u03b2\u03b3\7A\2\2\u03b3\u03b4\5V,\2\u03b4\u03b5\b,\1\2\u03b5\u03be\3"+
		"\2\2\2\u03b6\u03b7\7@\2\2\u03b7\u03b8\5V,\2\u03b8\u03b9\b,\1\2\u03b9\u03be"+
		"\3\2\2\2\u03ba\u03bb\5X-\2\u03bb\u03bc\b,\1\2\u03bc\u03be\3\2\2\2\u03bd"+
		"\u03a2\3\2\2\2\u03bd\u03a6\3\2\2\2\u03bd\u03aa\3\2\2\2\u03bd\u03ae\3\2"+
		"\2\2\u03bd\u03b2\3\2\2\2\u03bd\u03b6\3\2\2\2\u03bd\u03ba\3\2\2\2\u03be"+
		"W\3\2\2\2\u03bf\u03c0\5Z.\2\u03c0\u03c1\b-\1\2\u03c1\u03e7\3\2\2\2\u03c2"+
		"\u03c3\7\66\2\2\u03c3\u03c4\5H%\2\u03c4\u03c5\b-\1\2\u03c5\u03c6\7\67"+
		"\2\2\u03c6\u03e7\3\2\2\2\u03c7\u03c8\5\b\5\2\u03c8\u03c9\b-\1\2\u03c9"+
		"\u03e7\3\2\2\2\u03ca\u03cb\5^\60\2\u03cb\u03cc\b-\1\2\u03cc\u03e7\3\2"+
		"\2\2\u03cd\u03ce\7B\2\2\u03ce\u03cf\7\66\2\2\u03cf\u03d0\5\\/\2\u03d0"+
		"\u03d1\7\67\2\2\u03d1\u03d2\b-\1\2\u03d2\u03e7\3\2\2\2\u03d3\u03d4\7\35"+
		"\2\2\u03d4\u03d5\5B\"\2\u03d5\u03d6\b-\1\2\u03d6\u03da\7\66\2\2\u03d7"+
		"\u03d8\5\\/\2\u03d8\u03d9\b-\1\2\u03d9\u03db\3\2\2\2\u03da\u03d7\3\2\2"+
		"\2\u03da\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\7\67\2\2\u03dd"+
		"\u03de\7C\2\2\u03de\u03e2\7\66\2\2\u03df\u03e0\5\\/\2\u03e0\u03e1\b-\1"+
		"\2\u03e1\u03e3\3\2\2\2\u03e2\u03df\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4"+
		"\3\2\2\2\u03e4\u03e5\7\67\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03bf\3\2\2\2"+
		"\u03e6\u03c2\3\2\2\2\u03e6\u03c7\3\2\2\2\u03e6\u03ca\3\2\2\2\u03e6\u03cd"+
		"\3\2\2\2\u03e6\u03d3\3\2\2\2\u03e7\u03ee\3\2\2\2\u03e8\u03e9\7>\2\2\u03e9"+
		"\u03ea\5\b\5\2\u03ea\u03eb\b-\1\2\u03eb\u03ed\3\2\2\2\u03ec\u03e8\3\2"+
		"\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f5\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\7G\2\2\u03f2\u03f6\b-\1"+
		"\2\u03f3\u03f4\7H\2\2\u03f4\u03f6\b-\1\2\u03f5\u03f1\3\2\2\2\u03f5\u03f3"+
		"\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6Y\3\2\2\2\u03f7\u03f8\7\66\2\2\u03f8"+
		"\u03f9\5B\"\2\u03f9\u03fa\7\67\2\2\u03fa\u03fb\5H%\2\u03fb\u03fc\b.\1"+
		"\2\u03fc[\3\2\2\2\u03fd\u0403\b/\1\2\u03fe\u03ff\5@!\2\u03ff\u0400\b/"+
		"\1\2\u0400\u0402\3\2\2\2\u0401\u03fe\3\2\2\2\u0402\u0405\3\2\2\2\u0403"+
		"\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0403\3\2"+
		"\2\2\u0406\u0407\5H%\2\u0407\u0416\b/\1\2\u0408\u040e\7=\2\2\u0409\u040a"+
		"\5@!\2\u040a\u040b\b/\1\2\u040b\u040d\3\2\2\2\u040c\u0409\3\2\2\2\u040d"+
		"\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2"+
		"\2\2\u0410\u040e\3\2\2\2\u0411\u0412\5H%\2\u0412\u0413\b/\1\2\u0413\u0415"+
		"\3\2\2\2\u0414\u0408\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416"+
		"\u0417\3\2\2\2\u0417]\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041a\7\13\2\2"+
		"\u041a\u042a\b\60\1\2\u041b\u041c\7\f\2\2\u041c\u042a\b\60\1\2\u041d\u041e"+
		"\7\r\2\2\u041e\u042a\b\60\1\2\u041f\u0420\7\16\2\2\u0420\u042a\b\60\1"+
		"\2\u0421\u0422\7\17\2\2\u0422\u042a\b\60\1\2\u0423\u0424\7\63\2\2\u0424"+
		"\u042a\b\60\1\2\u0425\u0426\7\64\2\2\u0426\u042a\b\60\1\2\u0427\u0428"+
		"\7\65\2\2\u0428\u042a\b\60\1\2\u0429\u0419\3\2\2\2\u0429\u041b\3\2\2\2"+
		"\u0429\u041d\3\2\2\2\u0429\u041f\3\2\2\2\u0429\u0421\3\2\2\2\u0429\u0423"+
		"\3\2\2\2\u0429\u0425\3\2\2\2\u0429\u0427\3\2\2\2\u042a_\3\2\2\2_cmouw"+
		"~\u008e\u0092\u009b\u009f\u00a5\u00a7\u00be\u00c2\u00c5\u00c7\u00cf\u00d5"+
		"\u00e6\u00ed\u0102\u010e\u0118\u0120\u012b\u013b\u0145\u014d\u0159\u015c"+
		"\u0166\u0174\u0177\u0180\u018c\u0198\u019d\u01a5\u01af\u01b2\u01c1\u01cd"+
		"\u01da\u01dc\u01ea\u01f2\u01fd\u0202\u020d\u0212\u021d\u022a\u023a\u0242"+
		"\u025e\u026e\u0274\u027a\u028e\u029a\u02a2\u02ab\u02b7\u02bf\u02c4\u02ce"+
		"\u02d6\u02d9\u02e6\u02e9\u02f0\u02f5\u0301\u030d\u0316\u035b\u035d\u0378"+
		"\u0380\u0386\u0392\u039a\u03a0\u03bd\u03da\u03e2\u03e6\u03ee\u03f5\u0403"+
		"\u040e\u0416\u0429";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}