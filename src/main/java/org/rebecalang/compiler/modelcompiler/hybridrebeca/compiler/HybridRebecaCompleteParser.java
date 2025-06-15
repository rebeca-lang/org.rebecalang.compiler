// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/HybridRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.*;

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
		DEADLINE=8, MONKEYS_AT=9, BREAK=10, CASE=11, CONTINUE=12, DEFAULT=13, 
		ELSE=14, FOR=15, GOTO=16, IF=17, RETURN=18, SWITCH=19, WHILE=20, ENV=21, 
		FEATUREVAR=22, IMPORT=23, PACKAGE=24, PRIVATE=25, PROTECTED=26, PUBLIC=27, 
		RECORD=28, REACTIVECLASS=29, INTERFACE=30, ABSTRACT=31, EXTENDS=32, IMPLEMENTS=33, 
		MSGSRV=34, MAIN=35, STATEVARS=36, KNOWNREBECS=37, INSTANCEOF=38, NEW=39, 
		THIS=40, SUPER=41, LPAREN=42, RPAREN=43, LBRACE=44, RBRACE=45, LBRACKET=46, 
		RBRACKET=47, SEMI=48, COMMA=49, DOT=50, EQ=51, BANG=52, TILDA=53, QUES=54, 
		COLON=55, EQEQ=56, AMPAMP=57, BARBAR=58, PLUSPLUS=59, SUBSUB=60, PLUS=61, 
		SUB=62, STAR=63, SLASH=64, AMP=65, BAR=66, CARET=67, PERCENT=68, PLUSEQ=69, 
		SUBEQ=70, STAREQ=71, SLASHEQ=72, AMPEQ=73, BAREQ=74, CARETEQ=75, TILDAEQ=76, 
		PERCENTEQ=77, BANGEQ=78, GT=79, GTEQ=80, LT=81, LTEQ=82, LTLT=83, LTLTEQ=84, 
		GTGT=85, GTGTEQ=86, DECIMAL_LITERAL=87, HEX_LITERAL=88, OCT_LITERAL=89, 
		BINARY_LITERAL=90, FLOAT_LITERAL=91, BOOL_LITERAL=92, CHAR_LITERAL=93, 
		STRING_LITERAL=94, NULL_LITERAL=95, IDENTIFIER=96, WS=97, COMMENT=98, 
		LINE_COMMENT=99;
	public static final int
		RULE_rebecaCode = 0, RULE_physicalClassDeclaration = 1, RULE_modeDeclaration = 2, 
		RULE_primary = 3, RULE_after = 4, RULE_deadline = 5, RULE_rebecaModel = 6, 
		RULE_packageDeclaration = 7, RULE_importDeclaration = 8, RULE_recordDeclaration = 9, 
		RULE_mainDeclaration = 10, RULE_mainRebecDefinition = 11, RULE_bindingsExpressionList = 12, 
		RULE_argumentsExpressionList = 13, RULE_fieldDeclaration = 14, RULE_variableDeclarators = 15, 
		RULE_variableDeclarator = 16, RULE_variableInitializer = 17, RULE_arrayInitializer = 18, 
		RULE_interfaceDeclaration = 19, RULE_extendingInterface = 20, RULE_msgsrvSignature = 21, 
		RULE_reactiveClassDeclaration = 22, RULE_implementingInterface = 23, RULE_knownRebecsDeclaration = 24, 
		RULE_stateVarsDeclaration = 25, RULE_methodDeclaration = 26, RULE_constructorDeclaration = 27, 
		RULE_msgsrvDeclaration = 28, RULE_synchMethodDeclaration = 29, RULE_formalParameters = 30, 
		RULE_formalParametersDeclaration = 31, RULE_formalParameterDeclaration = 32, 
		RULE_block = 33, RULE_statement = 34, RULE_statementExtension = 35, RULE_forInit = 36, 
		RULE_switchBlock = 37, RULE_caseSwitchGroup = 38, RULE_defaultSwitchGroup = 39, 
		RULE_annotatedStatement = 40, RULE_statementExpression = 41, RULE_annotation = 42, 
		RULE_type = 43, RULE_genericTypeParams = 44, RULE_dimensions = 45, RULE_expressionList = 46, 
		RULE_annotatedExpression = 47, RULE_methodCall = 48, RULE_expression = 49, 
		RULE_nondetExpression = 50, RULE_arguments = 51, RULE_literal = 52, RULE_integerLiteral = 53, 
		RULE_floatLiteral = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"rebecaCode", "physicalClassDeclaration", "modeDeclaration", "primary", 
			"after", "deadline", "rebecaModel", "packageDeclaration", "importDeclaration", 
			"recordDeclaration", "mainDeclaration", "mainRebecDefinition", "bindingsExpressionList", 
			"argumentsExpressionList", "fieldDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableInitializer", "arrayInitializer", "interfaceDeclaration", 
			"extendingInterface", "msgsrvSignature", "reactiveClassDeclaration", 
			"implementingInterface", "knownRebecsDeclaration", "stateVarsDeclaration", 
			"methodDeclaration", "constructorDeclaration", "msgsrvDeclaration", "synchMethodDeclaration", 
			"formalParameters", "formalParametersDeclaration", "formalParameterDeclaration", 
			"block", "statement", "statementExtension", "forInit", "switchBlock", 
			"caseSwitchGroup", "defaultSwitchGroup", "annotatedStatement", "statementExpression", 
			"annotation", "type", "genericTypeParams", "dimensions", "expressionList", 
			"annotatedExpression", "methodCall", "expression", "nondetExpression", 
			"arguments", "literal", "integerLiteral", "floatLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mode'", "'physicalclass'", "'inv'", "'guard'", "'priorities'", 
			"'''", "'after'", "'deadline'", "'@'", "'break'", "'case'", "'continue'", 
			"'default'", "'else'", "'for'", "'goto'", "'if'", "'return'", "'switch'", 
			"'while'", "'env'", "'featurevar'", "'import'", "'package'", "'private'", 
			"'protected'", "'public'", "'record'", "'reactiveclass'", "'interface'", 
			"'abstract'", "'extends'", "'implements'", "'msgsrv'", "'main'", "'statevars'", 
			"'knownrebecs'", "'instanceof'", "'new'", "'this'", "'super'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'~='", "'%='", "'!='", "'>'", "'>='", "'<'", 
			"'<='", "'<<'", "'<<='", "'>>'", "'>>='", null, null, null, null, null, 
			null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODE", "PHYSICALCLASS", "INV", "GUARD", "PRIORITIES", "PRIME", 
			"AFTER", "DEADLINE", "MONKEYS_AT", "BREAK", "CASE", "CONTINUE", "DEFAULT", 
			"ELSE", "FOR", "GOTO", "IF", "RETURN", "SWITCH", "WHILE", "ENV", "FEATUREVAR", 
			"IMPORT", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", "REACTIVECLASS", 
			"INTERFACE", "ABSTRACT", "EXTENDS", "IMPLEMENTS", "MSGSRV", "MAIN", "STATEVARS", 
			"KNOWNREBECS", "INSTANCEOF", "NEW", "THIS", "SUPER", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "EQ", 
			"BANG", "TILDA", "QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", 
			"SUBSUB", "PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", 
			"PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", 
			"TILDAEQ", "PERCENTEQ", "BANGEQ", "GT", "GTEQ", "LT", "LTEQ", "LTLT", 
			"LTLTEQ", "GTGT", "GTGTEQ", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(110);
				recordDeclaration();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(116);
					match(ENV);
					setState(117);
					fieldDeclaration();
					setState(118);
					match(SEMI);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(120);
					match(FEATUREVAR);
					setState(121);
					match(IDENTIFIER);
					setState(122);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(128);
					reactiveClassDeclaration();
					}
					break;
				case 2:
					{
					setState(129);
					interfaceDeclaration();
					}
					break;
				case 3:
					{
					setState(130);
					physicalClassDeclaration();
					}
					break;
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PHYSICALCLASS) | (1L << MONKEYS_AT) | (1L << REACTIVECLASS) | (1L << INTERFACE) | (1L << ABSTRACT))) != 0) );
			setState(135);
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(HybridRebecaCompleteParser.DECIMAL_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public KnownRebecsDeclarationContext knownRebecsDeclaration() {
			return getRuleContext(KnownRebecsDeclarationContext.class,0);
		}
		public StateVarsDeclarationContext stateVarsDeclaration() {
			return getRuleContext(StateVarsDeclarationContext.class,0);
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
		public List<ModeDeclarationContext> modeDeclaration() {
			return getRuleContexts(ModeDeclarationContext.class);
		}
		public ModeDeclarationContext modeDeclaration(int i) {
			return getRuleContext(ModeDeclarationContext.class,i);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(137);
				annotation();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(PHYSICALCLASS);
			setState(144);
			match(IDENTIFIER);
			setState(145);
			match(LPAREN);
			setState(146);
			match(DECIMAL_LITERAL);
			setState(147);
			match(RPAREN);
			setState(148);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(149);
				knownRebecsDeclaration();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(152);
				stateVarsDeclaration();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODE) | (1L << MONKEYS_AT) | (1L << ABSTRACT) | (1L << MSGSRV))) != 0) || _la==IDENTIFIER) {
				{
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(155);
					constructorDeclaration();
					}
					break;
				case 2:
					{
					setState(156);
					msgsrvDeclaration();
					}
					break;
				case 3:
					{
					setState(157);
					synchMethodDeclaration();
					}
					break;
				case 4:
					{
					setState(158);
					modeDeclaration();
					}
					break;
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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
			setState(166);
			match(MODE);
			setState(167);
			match(IDENTIFIER);
			setState(168);
			match(LBRACE);
			setState(169);
			match(INV);
			setState(170);
			match(LPAREN);
			setState(171);
			expression(0);
			setState(172);
			match(RPAREN);
			setState(173);
			block();
			setState(174);
			match(GUARD);
			setState(175);
			match(LPAREN);
			setState(176);
			expression(0);
			setState(177);
			match(RPAREN);
			setState(178);
			block();
			setState(179);
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
		public TerminalNode THIS() { return getToken(HybridRebecaCompleteParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(HybridRebecaCompleteParser.SUPER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(SUPER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(IDENTIFIER);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(184);
					arguments();
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(185);
						after();
						}
						break;
					}
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(188);
						deadline();
						}
						break;
					}
					}
					break;
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						match(LBRACKET);
						setState(194);
						expression(0);
						setState(195);
						match(RBRACKET);
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(202);
						match(PRIME);
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(210);
			match(AFTER);
			setState(211);
			match(LPAREN);
			setState(212);
			expression(0);
			setState(213);
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
			setState(215);
			match(DEADLINE);
			setState(216);
			match(LPAREN);
			setState(217);
			expression(0);
			setState(218);
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
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(220);
				packageDeclaration();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(223);
				importDeclaration();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			rebecaCode();
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
			setState(231);
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
			setState(233);
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
			setState(235);
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
			setState(237);
			match(MAIN);
			setState(238);
			match(LBRACE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(239);
				mainRebecDefinition();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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

	public static class MainRebecDefinitionContext extends ParserRuleContext {
		public MainRebecDefinition mrd;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public BindingsExpressionListContext bindingsExpressionList() {
			return getRuleContext(BindingsExpressionListContext.class,0);
		}
		public ArgumentsExpressionListContext argumentsExpressionList() {
			return getRuleContext(ArgumentsExpressionListContext.class,0);
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
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(247);
				annotation();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			type();
			setState(254);
			match(IDENTIFIER);
			setState(255);
			match(LPAREN);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOAT_LITERAL - 87)) | (1L << (BOOL_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (STRING_LITERAL - 87)) | (1L << (NULL_LITERAL - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
				{
				setState(256);
				bindingsExpressionList();
				}
			}

			setState(259);
			match(RPAREN);
			setState(260);
			match(COLON);
			setState(261);
			match(LPAREN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOAT_LITERAL - 87)) | (1L << (BOOL_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (STRING_LITERAL - 87)) | (1L << (NULL_LITERAL - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
				{
				setState(262);
				argumentsExpressionList();
				}
			}

			setState(265);
			match(RPAREN);
			setState(266);
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

	public static class BindingsExpressionListContext extends ParserRuleContext {
		public List<Expression> el;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BindingsExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingsExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterBindingsExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitBindingsExpressionList(this);
		}
	}

	public final BindingsExpressionListContext bindingsExpressionList() throws RecognitionException {
		BindingsExpressionListContext _localctx = new BindingsExpressionListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bindingsExpressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			expressionList();
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

	public static class ArgumentsExpressionListContext extends ParserRuleContext {
		public List<Expression> el;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterArgumentsExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitArgumentsExpressionList(this);
		}
	}

	public final ArgumentsExpressionListContext argumentsExpressionList() throws RecognitionException {
		ArgumentsExpressionListContext _localctx = new ArgumentsExpressionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentsExpressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			expressionList();
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
		enterRule(_localctx, 28, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(272);
				annotation();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			type();
			setState(279);
			variableDeclarators();
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
		enterRule(_localctx, 30, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			variableDeclarator();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				variableDeclarator();
				}
				}
				setState(288);
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
		enterRule(_localctx, 32, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IDENTIFIER);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(290);
				match(EQ);
				setState(291);
				variableInitializer();
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
		enterRule(_localctx, 34, RULE_variableInitializer);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				arrayInitializer();
				}
				break;
			case NEW:
			case THIS:
			case SUPER:
			case LPAREN:
			case BANG:
			case TILDA:
			case QUES:
			case PLUSPLUS:
			case SUBSUB:
			case PLUS:
			case SUB:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				expression(0);
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
		enterRule(_localctx, 36, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LBRACE);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (NEW - 39)) | (1L << (THIS - 39)) | (1L << (SUPER - 39)) | (1L << (LPAREN - 39)) | (1L << (LBRACE - 39)) | (1L << (BANG - 39)) | (1L << (TILDA - 39)) | (1L << (QUES - 39)) | (1L << (PLUSPLUS - 39)) | (1L << (SUBSUB - 39)) | (1L << (PLUS - 39)) | (1L << (SUB - 39)) | (1L << (DECIMAL_LITERAL - 39)) | (1L << (HEX_LITERAL - 39)) | (1L << (OCT_LITERAL - 39)) | (1L << (BINARY_LITERAL - 39)) | (1L << (FLOAT_LITERAL - 39)) | (1L << (BOOL_LITERAL - 39)) | (1L << (CHAR_LITERAL - 39)) | (1L << (STRING_LITERAL - 39)) | (1L << (NULL_LITERAL - 39)) | (1L << (IDENTIFIER - 39)))) != 0)) {
				{
				setState(299);
				variableInitializer();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					variableInitializer();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(309);
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
		public TerminalNode INTERFACE() { return getToken(HybridRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExtendingInterfaceContext extendingInterface() {
			return getRuleContext(ExtendingInterfaceContext.class,0);
		}
		public List<MsgsrvSignatureContext> msgsrvSignature() {
			return getRuleContexts(MsgsrvSignatureContext.class);
		}
		public MsgsrvSignatureContext msgsrvSignature(int i) {
			return getRuleContext(MsgsrvSignatureContext.class,i);
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
		enterRule(_localctx, 38, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(311);
				annotation();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(INTERFACE);
			setState(318);
			match(IDENTIFIER);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(319);
				extendingInterface();
				}
			}

			setState(322);
			match(LBRACE);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==MSGSRV) {
				{
				{
				setState(323);
				msgsrvSignature();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
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

	public static class ExtendingInterfaceContext extends ParserRuleContext {
		public List<OrdinaryPrimitiveType> opts;
		public TerminalNode EXTENDS() { return getToken(HybridRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public ExtendingInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendingInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterExtendingInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitExtendingInterface(this);
		}
	}

	public final ExtendingInterfaceContext extendingInterface() throws RecognitionException {
		ExtendingInterfaceContext _localctx = new ExtendingInterfaceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extendingInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(EXTENDS);
			setState(332);
			match(IDENTIFIER);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(333);
				match(COMMA);
				setState(334);
				match(IDENTIFIER);
				}
				}
				setState(339);
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

	public static class MsgsrvSignatureContext extends ParserRuleContext {
		public MsgsrvDeclaration md;
		public TerminalNode MSGSRV() { return getToken(HybridRebecaCompleteParser.MSGSRV, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HybridRebecaCompleteParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MsgsrvSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgsrvSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMsgsrvSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMsgsrvSignature(this);
		}
	}

	public final MsgsrvSignatureContext msgsrvSignature() throws RecognitionException {
		MsgsrvSignatureContext _localctx = new MsgsrvSignatureContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_msgsrvSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(340);
				annotation();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(MSGSRV);
			setState(347);
			match(IDENTIFIER);
			setState(348);
			formalParameters();
			setState(349);
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

	public static class ReactiveClassDeclarationContext extends ParserRuleContext {
		public ReactiveClassDeclaration rcd;
		public TerminalNode REACTIVECLASS() { return getToken(HybridRebecaCompleteParser.REACTIVECLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(HybridRebecaCompleteParser.DECIMAL_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(HybridRebecaCompleteParser.EXTENDS, 0); }
		public ImplementingInterfaceContext implementingInterface() {
			return getRuleContext(ImplementingInterfaceContext.class,0);
		}
		public List<KnownRebecsDeclarationContext> knownRebecsDeclaration() {
			return getRuleContexts(KnownRebecsDeclarationContext.class);
		}
		public KnownRebecsDeclarationContext knownRebecsDeclaration(int i) {
			return getRuleContext(KnownRebecsDeclarationContext.class,i);
		}
		public List<StateVarsDeclarationContext> stateVarsDeclaration() {
			return getRuleContexts(StateVarsDeclarationContext.class);
		}
		public StateVarsDeclarationContext stateVarsDeclaration(int i) {
			return getRuleContext(StateVarsDeclarationContext.class,i);
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
		enterRule(_localctx, 44, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(351);
				annotation();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(357);
				match(ABSTRACT);
				}
			}

			setState(360);
			match(REACTIVECLASS);
			setState(361);
			match(IDENTIFIER);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(362);
				match(EXTENDS);
				setState(363);
				match(IDENTIFIER);
				}
			}

			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(366);
				implementingInterface();
				}
			}

			setState(369);
			match(LPAREN);
			setState(370);
			match(DECIMAL_LITERAL);
			setState(371);
			match(RPAREN);
			setState(372);
			match(LBRACE);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << ABSTRACT) | (1L << MSGSRV) | (1L << STATEVARS) | (1L << KNOWNREBECS))) != 0) || _la==IDENTIFIER) {
				{
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(373);
					knownRebecsDeclaration();
					}
					break;
				case 2:
					{
					setState(374);
					stateVarsDeclaration();
					}
					break;
				case 3:
					{
					setState(375);
					constructorDeclaration();
					}
					break;
				case 4:
					{
					setState(376);
					msgsrvDeclaration();
					}
					break;
				case 5:
					{
					setState(377);
					synchMethodDeclaration();
					}
					break;
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
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

	public static class ImplementingInterfaceContext extends ParserRuleContext {
		public List<OrdinaryPrimitiveType> opts;
		public TerminalNode IMPLEMENTS() { return getToken(HybridRebecaCompleteParser.IMPLEMENTS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public ImplementingInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementingInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterImplementingInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitImplementingInterface(this);
		}
	}

	public final ImplementingInterfaceContext implementingInterface() throws RecognitionException {
		ImplementingInterfaceContext _localctx = new ImplementingInterfaceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_implementingInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(IMPLEMENTS);
			setState(386);
			match(IDENTIFIER);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				match(IDENTIFIER);
				}
				}
				setState(393);
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

	public static class KnownRebecsDeclarationContext extends ParserRuleContext {
		public List<FieldDeclaration> fds;
		public TerminalNode KNOWNREBECS() { return getToken(HybridRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
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
		public KnownRebecsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownRebecsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterKnownRebecsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitKnownRebecsDeclaration(this);
		}
	}

	public final KnownRebecsDeclarationContext knownRebecsDeclaration() throws RecognitionException {
		KnownRebecsDeclarationContext _localctx = new KnownRebecsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_knownRebecsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(KNOWNREBECS);
			setState(395);
			match(LBRACE);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(396);
				fieldDeclaration();
				setState(397);
				match(SEMI);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
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

	public static class StateVarsDeclarationContext extends ParserRuleContext {
		public List<FieldDeclaration> fds;
		public TerminalNode STATEVARS() { return getToken(HybridRebecaCompleteParser.STATEVARS, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
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
		public StateVarsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterStateVarsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitStateVarsDeclaration(this);
		}
	}

	public final StateVarsDeclarationContext stateVarsDeclaration() throws RecognitionException {
		StateVarsDeclarationContext _localctx = new StateVarsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stateVarsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(STATEVARS);
			setState(407);
			match(LBRACE);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(408);
				fieldDeclaration();
				setState(409);
				match(SEMI);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration md;
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HybridRebecaCompleteParser.SEMI, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(IDENTIFIER);
			setState(419);
			formalParameters();
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(420);
				block();
				}
				break;
			case SEMI:
				{
				setState(421);
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
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(424);
				annotation();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			methodDeclaration();
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
		public TerminalNode MSGSRV() { return getToken(HybridRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
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
		enterRule(_localctx, 56, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(432);
				annotation();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(438);
				match(ABSTRACT);
				}
			}

			setState(441);
			match(MSGSRV);
			setState(442);
			methodDeclaration();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
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
		enterRule(_localctx, 58, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(444);
				annotation();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(450);
				match(ABSTRACT);
				}
			}

			setState(453);
			type();
			setState(454);
			methodDeclaration();
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
		enterRule(_localctx, 60, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(LPAREN);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(457);
				formalParametersDeclaration();
				}
			}

			setState(460);
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
		enterRule(_localctx, 62, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			formalParameterDeclaration();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(463);
				match(COMMA);
				setState(464);
				formalParameterDeclaration();
				}
				}
				setState(469);
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
		enterRule(_localctx, 64, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			type();
			setState(471);
			match(IDENTIFIER);
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
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<AnnotatedStatementContext> annotatedStatement() {
			return getRuleContexts(AnnotatedStatementContext.class);
		}
		public AnnotatedStatementContext annotatedStatement(int i) {
			return getRuleContext(AnnotatedStatementContext.class,i);
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
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(LBRACE);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOAT_LITERAL - 87)) | (1L << (BOOL_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (STRING_LITERAL - 87)) | (1L << (NULL_LITERAL - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
				{
				{
				setState(474);
				annotatedStatement();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement s;
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(HybridRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
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
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode RETURN() { return getToken(HybridRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(HybridRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(HybridRebecaCompleteParser.CONTINUE, 0); }
		public StatementExtensionContext statementExtension() {
			return getRuleContext(StatementExtensionContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_statement);
		int _la;
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				statementExpression();
				setState(483);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				fieldDeclaration();
				setState(486);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(IF);
				setState(490);
				match(LPAREN);
				setState(491);
				expression(0);
				setState(492);
				match(RPAREN);
				setState(493);
				statement();
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(494);
					match(ELSE);
					setState(495);
					statement();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				match(WHILE);
				setState(499);
				match(LPAREN);
				setState(500);
				expression(0);
				setState(501);
				match(RPAREN);
				setState(502);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				match(FOR);
				setState(505);
				match(LPAREN);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOAT_LITERAL - 87)) | (1L << (BOOL_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (STRING_LITERAL - 87)) | (1L << (NULL_LITERAL - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
					{
					setState(506);
					forInit();
					}
				}

				setState(509);
				match(SEMI);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (NEW - 39)) | (1L << (THIS - 39)) | (1L << (SUPER - 39)) | (1L << (LPAREN - 39)) | (1L << (BANG - 39)) | (1L << (TILDA - 39)) | (1L << (QUES - 39)) | (1L << (PLUSPLUS - 39)) | (1L << (SUBSUB - 39)) | (1L << (PLUS - 39)) | (1L << (SUB - 39)) | (1L << (DECIMAL_LITERAL - 39)) | (1L << (HEX_LITERAL - 39)) | (1L << (OCT_LITERAL - 39)) | (1L << (BINARY_LITERAL - 39)) | (1L << (FLOAT_LITERAL - 39)) | (1L << (BOOL_LITERAL - 39)) | (1L << (CHAR_LITERAL - 39)) | (1L << (STRING_LITERAL - 39)) | (1L << (NULL_LITERAL - 39)) | (1L << (IDENTIFIER - 39)))) != 0)) {
					{
					setState(510);
					expression(0);
					}
				}

				setState(513);
				match(SEMI);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOAT_LITERAL - 87)) | (1L << (BOOL_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (STRING_LITERAL - 87)) | (1L << (NULL_LITERAL - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
					{
					setState(514);
					expressionList();
					}
				}

				setState(517);
				match(RPAREN);
				setState(518);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(519);
				match(SWITCH);
				setState(520);
				match(LPAREN);
				setState(521);
				expression(0);
				setState(522);
				match(RPAREN);
				setState(523);
				match(LBRACE);
				setState(524);
				switchBlock();
				setState(525);
				match(RBRACE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(527);
				match(RETURN);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (NEW - 39)) | (1L << (THIS - 39)) | (1L << (SUPER - 39)) | (1L << (LPAREN - 39)) | (1L << (BANG - 39)) | (1L << (TILDA - 39)) | (1L << (QUES - 39)) | (1L << (PLUSPLUS - 39)) | (1L << (SUBSUB - 39)) | (1L << (PLUS - 39)) | (1L << (SUB - 39)) | (1L << (DECIMAL_LITERAL - 39)) | (1L << (HEX_LITERAL - 39)) | (1L << (OCT_LITERAL - 39)) | (1L << (BINARY_LITERAL - 39)) | (1L << (FLOAT_LITERAL - 39)) | (1L << (BOOL_LITERAL - 39)) | (1L << (CHAR_LITERAL - 39)) | (1L << (STRING_LITERAL - 39)) | (1L << (NULL_LITERAL - 39)) | (1L << (IDENTIFIER - 39)))) != 0)) {
					{
					setState(528);
					expression(0);
					}
				}

				setState(531);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(532);
				match(BREAK);
				setState(533);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(534);
				match(CONTINUE);
				setState(535);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(536);
				statementExtension();
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

	public static class StatementExtensionContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(HybridRebecaCompleteParser.SEMI, 0); }
		public StatementExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterStatementExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitStatementExtension(this);
		}
	}

	public final StatementExtensionContext statementExtension() throws RecognitionException {
		StatementExtensionContext _localctx = new StatementExtensionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statementExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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

	public static class ForInitContext extends ParserRuleContext {
		public ForInitializer fi;
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
		enterRule(_localctx, 72, RULE_forInit);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				expressionList();
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
		public List<CaseSwitchGroupContext> caseSwitchGroup() {
			return getRuleContexts(CaseSwitchGroupContext.class);
		}
		public CaseSwitchGroupContext caseSwitchGroup(int i) {
			return getRuleContext(CaseSwitchGroupContext.class,i);
		}
		public DefaultSwitchGroupContext defaultSwitchGroup() {
			return getRuleContext(DefaultSwitchGroupContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
		enterRule(_localctx, 74, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(545);
					annotation();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
				caseSwitchGroup();
				}
				}
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MONKEYS_AT || _la==CASE );
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(556);
				defaultSwitchGroup();
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

	public static class CaseSwitchGroupContext extends ParserRuleContext {
		public SwitchStatementGroup ssg;
		public TerminalNode CASE() { return getToken(HybridRebecaCompleteParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
		public List<AnnotatedStatementContext> annotatedStatement() {
			return getRuleContexts(AnnotatedStatementContext.class);
		}
		public AnnotatedStatementContext annotatedStatement(int i) {
			return getRuleContext(AnnotatedStatementContext.class,i);
		}
		public CaseSwitchGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseSwitchGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterCaseSwitchGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitCaseSwitchGroup(this);
		}
	}

	public final CaseSwitchGroupContext caseSwitchGroup() throws RecognitionException {
		CaseSwitchGroupContext _localctx = new CaseSwitchGroupContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_caseSwitchGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(CASE);
			setState(560);
			expression(0);
			setState(561);
			match(COLON);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(562);
					annotatedStatement();
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class DefaultSwitchGroupContext extends ParserRuleContext {
		public SwitchStatementGroup ssg;
		public TerminalNode DEFAULT() { return getToken(HybridRebecaCompleteParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
		public List<AnnotatedStatementContext> annotatedStatement() {
			return getRuleContexts(AnnotatedStatementContext.class);
		}
		public AnnotatedStatementContext annotatedStatement(int i) {
			return getRuleContext(AnnotatedStatementContext.class,i);
		}
		public DefaultSwitchGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultSwitchGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterDefaultSwitchGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitDefaultSwitchGroup(this);
		}
	}

	public final DefaultSwitchGroupContext defaultSwitchGroup() throws RecognitionException {
		DefaultSwitchGroupContext _localctx = new DefaultSwitchGroupContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_defaultSwitchGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(DEFAULT);
			setState(569);
			match(COLON);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOAT_LITERAL - 87)) | (1L << (BOOL_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (STRING_LITERAL - 87)) | (1L << (NULL_LITERAL - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
				{
				{
				setState(570);
				annotatedStatement();
				}
				}
				setState(575);
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

	public static class AnnotatedStatementContext extends ParserRuleContext {
		public Statement s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotatedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAnnotatedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAnnotatedStatement(this);
		}
	}

	public final AnnotatedStatementContext annotatedStatement() throws RecognitionException {
		AnnotatedStatementContext _localctx = new AnnotatedStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_annotatedStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(576);
					annotation();
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(582);
			statement();
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
		enterRule(_localctx, 82, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			expression(0);
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
		enterRule(_localctx, 84, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(MONKEYS_AT);
			setState(587);
			match(IDENTIFIER);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(588);
				match(LPAREN);
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (NEW - 39)) | (1L << (THIS - 39)) | (1L << (SUPER - 39)) | (1L << (LPAREN - 39)) | (1L << (BANG - 39)) | (1L << (TILDA - 39)) | (1L << (QUES - 39)) | (1L << (PLUSPLUS - 39)) | (1L << (SUBSUB - 39)) | (1L << (PLUS - 39)) | (1L << (SUB - 39)) | (1L << (DECIMAL_LITERAL - 39)) | (1L << (HEX_LITERAL - 39)) | (1L << (OCT_LITERAL - 39)) | (1L << (BINARY_LITERAL - 39)) | (1L << (FLOAT_LITERAL - 39)) | (1L << (BOOL_LITERAL - 39)) | (1L << (CHAR_LITERAL - 39)) | (1L << (STRING_LITERAL - 39)) | (1L << (NULL_LITERAL - 39)) | (1L << (IDENTIFIER - 39)))) != 0)) {
					{
					setState(589);
					expression(0);
					}
				}

				setState(592);
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
		enterRule(_localctx, 86, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(IDENTIFIER);
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(596);
				genericTypeParams();
				}
				break;
			}
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(599);
				dimensions();
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
		public TerminalNode LT() { return getToken(HybridRebecaCompleteParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(HybridRebecaCompleteParser.GT, 0); }
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
		enterRule(_localctx, 88, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(LT);
			setState(603);
			type();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(604);
				match(COMMA);
				setState(605);
				type();
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
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
		public List<TerminalNode> LBRACKET() { return getTokens(HybridRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(HybridRebecaCompleteParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(HybridRebecaCompleteParser.DECIMAL_LITERAL, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HybridRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACKET, i);
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
		enterRule(_localctx, 90, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(613);
					match(LBRACKET);
					setState(614);
					match(DECIMAL_LITERAL);
					setState(615);
					match(RBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(618); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> el;
		public List<AnnotatedExpressionContext> annotatedExpression() {
			return getRuleContexts(AnnotatedExpressionContext.class);
		}
		public AnnotatedExpressionContext annotatedExpression(int i) {
			return getRuleContext(AnnotatedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
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
		enterRule(_localctx, 92, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			annotatedExpression();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(621);
				match(COMMA);
				setState(622);
				annotatedExpression();
				}
				}
				setState(627);
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

	public static class AnnotatedExpressionContext extends ParserRuleContext {
		public Expression e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotatedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAnnotatedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAnnotatedExpression(this);
		}
	}

	public final AnnotatedExpressionContext annotatedExpression() throws RecognitionException {
		AnnotatedExpressionContext _localctx = new AnnotatedExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_annotatedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(628);
				annotation();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			expression(0);
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

	public static class MethodCallContext extends ParserRuleContext {
		public Expression e;
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(IDENTIFIER);
			setState(637);
			arguments();
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
		public Token prefix;
		public Token parenExp;
		public TypeContext castType;
		public Token bop;
		public Token postfix;
		public Token dot;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(HybridRebecaCompleteParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(HybridRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(HybridRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(HybridRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(HybridRebecaCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(HybridRebecaCompleteParser.BANG, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NondetExpressionContext nondetExpression() {
			return getRuleContext(NondetExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(HybridRebecaCompleteParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode STAR() { return getToken(HybridRebecaCompleteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(HybridRebecaCompleteParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HybridRebecaCompleteParser.PERCENT, 0); }
		public TerminalNode LTLT() { return getToken(HybridRebecaCompleteParser.LTLT, 0); }
		public TerminalNode GTGT() { return getToken(HybridRebecaCompleteParser.GTGT, 0); }
		public TerminalNode LTEQ() { return getToken(HybridRebecaCompleteParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(HybridRebecaCompleteParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(HybridRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(HybridRebecaCompleteParser.GT, 0); }
		public TerminalNode EQEQ() { return getToken(HybridRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(HybridRebecaCompleteParser.BANGEQ, 0); }
		public TerminalNode AMP() { return getToken(HybridRebecaCompleteParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(HybridRebecaCompleteParser.CARET, 0); }
		public TerminalNode BAR() { return getToken(HybridRebecaCompleteParser.BAR, 0); }
		public TerminalNode AMPAMP() { return getToken(HybridRebecaCompleteParser.AMPAMP, 0); }
		public TerminalNode BARBAR() { return getToken(HybridRebecaCompleteParser.BARBAR, 0); }
		public TerminalNode QUES() { return getToken(HybridRebecaCompleteParser.QUES, 0); }
		public TerminalNode EQ() { return getToken(HybridRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(HybridRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(HybridRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(HybridRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(HybridRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(HybridRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(HybridRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(HybridRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(HybridRebecaCompleteParser.GTGTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(HybridRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(HybridRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode INSTANCEOF() { return getToken(HybridRebecaCompleteParser.INSTANCEOF, 0); }
		public List<TerminalNode> DOT() { return getTokens(HybridRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HybridRebecaCompleteParser.DOT, i);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(640);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << TILDA) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(641);
				expression(21);
				}
				break;
			case 2:
				{
				setState(642);
				((ExpressionContext)_localctx).parenExp = match(LPAREN);
				setState(643);
				expression(0);
				setState(644);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(646);
				match(LPAREN);
				setState(647);
				((ExpressionContext)_localctx).castType = type();
				setState(648);
				match(RPAREN);
				setState(649);
				expression(19);
				}
				break;
			case 4:
				{
				setState(651);
				nondetExpression();
				}
				break;
			case 5:
				{
				setState(652);
				match(NEW);
				setState(653);
				match(IDENTIFIER);
				setState(654);
				arguments();
				setState(655);
				match(COLON);
				setState(656);
				arguments();
				}
				break;
			case 6:
				{
				setState(658);
				primary();
				}
				break;
			case 7:
				{
				setState(659);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(713);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(662);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(663);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (STAR - 63)) | (1L << (SLASH - 63)) | (1L << (PERCENT - 63)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(664);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(665);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(666);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(667);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(668);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(669);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LTLT || _la==GTGT) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(670);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(671);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(672);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (GT - 79)) | (1L << (GTEQ - 79)) | (1L << (LT - 79)) | (1L << (LTEQ - 79)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(673);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(674);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(675);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==BANGEQ) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(676);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(677);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(678);
						((ExpressionContext)_localctx).bop = match(AMP);
						setState(679);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(680);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(681);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(682);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(684);
						((ExpressionContext)_localctx).bop = match(BAR);
						setState(685);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(687);
						((ExpressionContext)_localctx).bop = match(AMPAMP);
						setState(688);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(689);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(690);
						((ExpressionContext)_localctx).bop = match(BARBAR);
						setState(691);
						expression(7);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(692);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(693);
						((ExpressionContext)_localctx).bop = match(QUES);
						setState(694);
						expression(0);
						setState(695);
						match(COLON);
						setState(696);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(698);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(699);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (EQ - 51)) | (1L << (PLUSEQ - 51)) | (1L << (SUBEQ - 51)) | (1L << (STAREQ - 51)) | (1L << (SLASHEQ - 51)) | (1L << (AMPEQ - 51)) | (1L << (BAREQ - 51)) | (1L << (CARETEQ - 51)) | (1L << (PERCENTEQ - 51)) | (1L << (LTLTEQ - 51)) | (1L << (GTGTEQ - 51)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(700);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(702);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUSPLUS || _la==SUBSUB) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(703);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(704);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(705);
						type();
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(706);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(709); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(707);
								((ExpressionContext)_localctx).dot = match(DOT);
								setState(708);
								primary();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(711); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class NondetExpressionContext extends ParserRuleContext {
		public Expression e;
		public TerminalNode QUES() { return getToken(HybridRebecaCompleteParser.QUES, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public NondetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nondetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterNondetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitNondetExpression(this);
		}
	}

	public final NondetExpressionContext nondetExpression() throws RecognitionException {
		NondetExpressionContext _localctx = new NondetExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nondetExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(QUES);
			setState(719);
			match(LPAREN);
			setState(720);
			expression(0);
			setState(723); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(721);
				match(COMMA);
				setState(722);
				expression(0);
				}
				}
				setState(725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(727);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> args;
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(LPAREN);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOAT_LITERAL - 87)) | (1L << (BOOL_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (STRING_LITERAL - 87)) | (1L << (NULL_LITERAL - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
				{
				setState(730);
				expressionList();
				}
			}

			setState(733);
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

	public static class LiteralContext extends ParserRuleContext {
		public Literal l;
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(HybridRebecaCompleteParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HybridRebecaCompleteParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(HybridRebecaCompleteParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(HybridRebecaCompleteParser.NULL_LITERAL, 0); }
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
		enterRule(_localctx, 104, RULE_literal);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(739);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(740);
				match(NULL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(HybridRebecaCompleteParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(HybridRebecaCompleteParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(HybridRebecaCompleteParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(HybridRebecaCompleteParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DECIMAL_LITERAL - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (OCT_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(HybridRebecaCompleteParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(FLOAT_LITERAL);
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
		case 49:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 22);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u02ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2~\n\2\f\2\16\2\u0081\13\2\3\2\3\2\3\2\6"+
		"\2\u0086\n\2\r\2\16\2\u0087\3\2\3\2\3\3\7\3\u008d\n\3\f\3\16\3\u0090\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0099\n\3\3\3\5\3\u009c\n\3\3\3\3\3"+
		"\3\3\3\3\7\3\u00a2\n\3\f\3\16\3\u00a5\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00bd"+
		"\n\5\3\5\5\5\u00c0\n\5\5\5\u00c2\n\5\3\5\3\5\3\5\3\5\7\5\u00c8\n\5\f\5"+
		"\16\5\u00cb\13\5\3\5\7\5\u00ce\n\5\f\5\16\5\u00d1\13\5\5\5\u00d3\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\5\b\u00e0\n\b\3\b\7\b\u00e3"+
		"\n\b\f\b\16\b\u00e6\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\7\f\u00f3\n\f\f\f\16\f\u00f6\13\f\3\f\3\f\3\r\7\r\u00fb\n\r\f\r\16\r"+
		"\u00fe\13\r\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\r\3\r\3\r\3\r\5\r\u010a\n"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0114\n\20\f\20\16\20\u0117"+
		"\13\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u011f\n\21\f\21\16\21\u0122"+
		"\13\21\3\22\3\22\3\22\5\22\u0127\n\22\3\23\3\23\5\23\u012b\n\23\3\24\3"+
		"\24\3\24\3\24\7\24\u0131\n\24\f\24\16\24\u0134\13\24\5\24\u0136\n\24\3"+
		"\24\3\24\3\25\7\25\u013b\n\25\f\25\16\25\u013e\13\25\3\25\3\25\3\25\5"+
		"\25\u0143\n\25\3\25\3\25\7\25\u0147\n\25\f\25\16\25\u014a\13\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\7\26\u0152\n\26\f\26\16\26\u0155\13\26\3\27\7"+
		"\27\u0158\n\27\f\27\16\27\u015b\13\27\3\27\3\27\3\27\3\27\3\27\3\30\7"+
		"\30\u0163\n\30\f\30\16\30\u0166\13\30\3\30\5\30\u0169\n\30\3\30\3\30\3"+
		"\30\3\30\5\30\u016f\n\30\3\30\5\30\u0172\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u017d\n\30\f\30\16\30\u0180\13\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u0188\n\31\f\31\16\31\u018b\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0192\n\32\f\32\16\32\u0195\13\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u019e\n\33\f\33\16\33\u01a1\13\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\5\34\u01a9\n\34\3\35\7\35\u01ac\n\35\f\35\16\35\u01af"+
		"\13\35\3\35\3\35\3\36\7\36\u01b4\n\36\f\36\16\36\u01b7\13\36\3\36\5\36"+
		"\u01ba\n\36\3\36\3\36\3\36\3\37\7\37\u01c0\n\37\f\37\16\37\u01c3\13\37"+
		"\3\37\5\37\u01c6\n\37\3\37\3\37\3\37\3 \3 \5 \u01cd\n \3 \3 \3!\3!\3!"+
		"\7!\u01d4\n!\f!\16!\u01d7\13!\3\"\3\"\3\"\3#\3#\7#\u01de\n#\f#\16#\u01e1"+
		"\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01f3\n$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u01fe\n$\3$\3$\5$\u0202\n$\3$\3$\5$\u0206\n"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0214\n$\3$\3$\3$\3$\3$\3$\5"+
		"$\u021c\n$\3%\3%\3&\3&\5&\u0222\n&\3\'\7\'\u0225\n\'\f\'\16\'\u0228\13"+
		"\'\3\'\6\'\u022b\n\'\r\'\16\'\u022c\3\'\5\'\u0230\n\'\3(\3(\3(\3(\7(\u0236"+
		"\n(\f(\16(\u0239\13(\3)\3)\3)\7)\u023e\n)\f)\16)\u0241\13)\3*\7*\u0244"+
		"\n*\f*\16*\u0247\13*\3*\3*\3+\3+\3,\3,\3,\3,\5,\u0251\n,\3,\5,\u0254\n"+
		",\3-\3-\5-\u0258\n-\3-\5-\u025b\n-\3.\3.\3.\3.\7.\u0261\n.\f.\16.\u0264"+
		"\13.\3.\3.\3/\3/\3/\6/\u026b\n/\r/\16/\u026c\3\60\3\60\3\60\7\60\u0272"+
		"\n\60\f\60\16\60\u0275\13\60\3\61\7\61\u0278\n\61\f\61\16\61\u027b\13"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0297"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\6\63\u02c8\n\63\r\63\16\63\u02c9\7\63\u02cc"+
		"\n\63\f\63\16\63\u02cf\13\63\3\64\3\64\3\64\3\64\3\64\6\64\u02d6\n\64"+
		"\r\64\16\64\u02d7\3\64\3\64\3\65\3\65\5\65\u02de\n\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\5\66\u02e8\n\66\3\67\3\67\38\38\38\2\3d9\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjln\2\13\4\2\66\67=@\4\2ABFF\3\2?@\4\2UUWW\3\2QT\4\2::PP\7"+
		"\2\65\65GMOOVVXX\3\2=>\3\2Y\\\2\u032b\2s\3\2\2\2\4\u008e\3\2\2\2\6\u00a8"+
		"\3\2\2\2\b\u00d2\3\2\2\2\n\u00d4\3\2\2\2\f\u00d9\3\2\2\2\16\u00df\3\2"+
		"\2\2\20\u00e9\3\2\2\2\22\u00eb\3\2\2\2\24\u00ed\3\2\2\2\26\u00ef\3\2\2"+
		"\2\30\u00fc\3\2\2\2\32\u010e\3\2\2\2\34\u0110\3\2\2\2\36\u0115\3\2\2\2"+
		" \u011b\3\2\2\2\"\u0123\3\2\2\2$\u012a\3\2\2\2&\u012c\3\2\2\2(\u013c\3"+
		"\2\2\2*\u014d\3\2\2\2,\u0159\3\2\2\2.\u0164\3\2\2\2\60\u0183\3\2\2\2\62"+
		"\u018c\3\2\2\2\64\u0198\3\2\2\2\66\u01a4\3\2\2\28\u01ad\3\2\2\2:\u01b5"+
		"\3\2\2\2<\u01c1\3\2\2\2>\u01ca\3\2\2\2@\u01d0\3\2\2\2B\u01d8\3\2\2\2D"+
		"\u01db\3\2\2\2F\u021b\3\2\2\2H\u021d\3\2\2\2J\u0221\3\2\2\2L\u022a\3\2"+
		"\2\2N\u0231\3\2\2\2P\u023a\3\2\2\2R\u0245\3\2\2\2T\u024a\3\2\2\2V\u024c"+
		"\3\2\2\2X\u0255\3\2\2\2Z\u025c\3\2\2\2\\\u026a\3\2\2\2^\u026e\3\2\2\2"+
		"`\u0279\3\2\2\2b\u027e\3\2\2\2d\u0296\3\2\2\2f\u02d0\3\2\2\2h\u02db\3"+
		"\2\2\2j\u02e7\3\2\2\2l\u02e9\3\2\2\2n\u02eb\3\2\2\2pr\5\24\13\2qp\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\177\3\2\2\2us\3\2\2\2vw\7\27\2\2w"+
		"x\5\36\20\2xy\7\62\2\2y~\3\2\2\2z{\7\30\2\2{|\7b\2\2|~\7\62\2\2}v\3\2"+
		"\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0085"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0086\5.\30\2\u0083\u0086\5(\25\2\u0084"+
		"\u0086\5\4\3\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\5\26\f\2\u008a\3\3\2\2\2\u008b\u008d\5V,\2"+
		"\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\4\2\2\u0092"+
		"\u0093\7b\2\2\u0093\u0094\7,\2\2\u0094\u0095\7Y\2\2\u0095\u0096\7-\2\2"+
		"\u0096\u0098\7.\2\2\u0097\u0099\5\62\32\2\u0098\u0097\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\5\64\33\2\u009b\u009a\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u00a3\3\2\2\2\u009d\u00a2\58\35\2\u009e\u00a2"+
		"\5:\36\2\u009f\u00a2\5<\37\2\u00a0\u00a2\5\6\4\2\u00a1\u009d\3\2\2\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7\5\3\2\2\2\u00a8\u00a9\7\3\2\2"+
		"\u00a9\u00aa\7b\2\2\u00aa\u00ab\7.\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad"+
		"\7,\2\2\u00ad\u00ae\5d\63\2\u00ae\u00af\7-\2\2\u00af\u00b0\5D#\2\u00b0"+
		"\u00b1\7\6\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b3\5d\63\2\u00b3\u00b4\7-\2"+
		"\2\u00b4\u00b5\5D#\2\u00b5\u00b6\7/\2\2\u00b6\7\3\2\2\2\u00b7\u00d3\7"+
		"*\2\2\u00b8\u00d3\7+\2\2\u00b9\u00c1\7b\2\2\u00ba\u00bc\5h\65\2\u00bb"+
		"\u00bd\5\n\6\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00c0\5\f\7\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c9\3\2"+
		"\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\5d\63\2\u00c5\u00c6\7\61\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cf\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00ce\7\b\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00b7\3\2\2\2\u00d2\u00b8\3\2\2\2\u00d2\u00b9\3\2\2\2\u00d3\t\3\2\2\2"+
		"\u00d4\u00d5\7\t\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d7\5d\63\2\u00d7\u00d8"+
		"\7-\2\2\u00d8\13\3\2\2\2\u00d9\u00da\7\n\2\2\u00da\u00db\7,\2\2\u00db"+
		"\u00dc\5d\63\2\u00dc\u00dd\7-\2\2\u00dd\r\3\2\2\2\u00de\u00e0\5\20\t\2"+
		"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3"+
		"\5\22\n\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8"+
		"\5\2\2\2\u00e8\17\3\2\2\2\u00e9\u00ea\7\32\2\2\u00ea\21\3\2\2\2\u00eb"+
		"\u00ec\7\31\2\2\u00ec\23\3\2\2\2\u00ed\u00ee\7\36\2\2\u00ee\25\3\2\2\2"+
		"\u00ef\u00f0\7%\2\2\u00f0\u00f4\7.\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7/\2\2\u00f8\27\3\2\2\2"+
		"\u00f9\u00fb\5V,\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\5X-\2\u0100\u0101\7b\2\2\u0101\u0103\7,\2\2\u0102\u0104\5\32\16"+
		"\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\7-\2\2\u0106\u0107\79\2\2\u0107\u0109\7,\2\2\u0108\u010a\5\34\17\2\u0109"+
		"\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7-"+
		"\2\2\u010c\u010d\7\62\2\2\u010d\31\3\2\2\2\u010e\u010f\5^\60\2\u010f\33"+
		"\3\2\2\2\u0110\u0111\5^\60\2\u0111\35\3\2\2\2\u0112\u0114\5V,\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5X-\2\u0119\u011a"+
		"\5 \21\2\u011a\37\3\2\2\2\u011b\u0120\5\"\22\2\u011c\u011d\7\63\2\2\u011d"+
		"\u011f\5\"\22\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121!\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0126"+
		"\7b\2\2\u0124\u0125\7\65\2\2\u0125\u0127\5$\23\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127#\3\2\2\2\u0128\u012b\5&\24\2\u0129\u012b\5d\63\2"+
		"\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b%\3\2\2\2\u012c\u0135\7"+
		".\2\2\u012d\u0132\5$\23\2\u012e\u012f\7\63\2\2\u012f\u0131\5$\23\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u012d\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7/\2\2\u0138\'\3\2\2\2"+
		"\u0139\u013b\5V,\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\7 \2\2\u0140\u0142\7b\2\2\u0141\u0143\5*\26\2\u0142\u0141\3\2\2"+
		"\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0148\7.\2\2\u0145\u0147"+
		"\5,\27\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7/"+
		"\2\2\u014c)\3\2\2\2\u014d\u014e\7\"\2\2\u014e\u0153\7b\2\2\u014f\u0150"+
		"\7\63\2\2\u0150\u0152\7b\2\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154+\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0156\u0158\5V,\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\7$\2\2\u015d\u015e\7b\2\2\u015e\u015f\5> \2\u015f\u0160\7\62\2"+
		"\2\u0160-\3\2\2\2\u0161\u0163\5V,\2\u0162\u0161\3\2\2\2\u0163\u0166\3"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0169\7!\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7\37\2\2\u016b\u016e\7b\2\2\u016c"+
		"\u016d\7\"\2\2\u016d\u016f\7b\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5\60\31\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7,\2\2\u0174\u0175\7Y\2"+
		"\2\u0175\u0176\7-\2\2\u0176\u017e\7.\2\2\u0177\u017d\5\62\32\2\u0178\u017d"+
		"\5\64\33\2\u0179\u017d\58\35\2\u017a\u017d\5:\36\2\u017b\u017d\5<\37\2"+
		"\u017c\u0177\3\2\2\2\u017c\u0178\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7/"+
		"\2\2\u0182/\3\2\2\2\u0183\u0184\7#\2\2\u0184\u0189\7b\2\2\u0185\u0186"+
		"\7\63\2\2\u0186\u0188\7b\2\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\61\3\2\2\2\u018b\u0189\3\2\2"+
		"\2\u018c\u018d\7\'\2\2\u018d\u0193\7.\2\2\u018e\u018f\5\36\20\2\u018f"+
		"\u0190\7\62\2\2\u0190\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0195\3"+
		"\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0197\7/\2\2\u0197\63\3\2\2\2\u0198\u0199\7&\2\2"+
		"\u0199\u019f\7.\2\2\u019a\u019b\5\36\20\2\u019b\u019c\7\62\2\2\u019c\u019e"+
		"\3\2\2\2\u019d\u019a\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7/"+
		"\2\2\u01a3\65\3\2\2\2\u01a4\u01a5\7b\2\2\u01a5\u01a8\5> \2\u01a6\u01a9"+
		"\5D#\2\u01a7\u01a9\7\62\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\67\3\2\2\2\u01aa\u01ac\5V,\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01b0\u01b1\5\66\34\2\u01b19\3\2\2\2\u01b2\u01b4\5V,\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\7!\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\7$"+
		"\2\2\u01bc\u01bd\5\66\34\2\u01bd;\3\2\2\2\u01be\u01c0\5V,\2\u01bf\u01be"+
		"\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6\7!\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\5X-\2\u01c8\u01c9"+
		"\5\66\34\2\u01c9=\3\2\2\2\u01ca\u01cc\7,\2\2\u01cb\u01cd\5@!\2\u01cc\u01cb"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7-\2\2\u01cf"+
		"?\3\2\2\2\u01d0\u01d5\5B\"\2\u01d1\u01d2\7\63\2\2\u01d2\u01d4\5B\"\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6A\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\5X-\2\u01d9\u01da"+
		"\7b\2\2\u01daC\3\2\2\2\u01db\u01df\7.\2\2\u01dc\u01de\5R*\2\u01dd\u01dc"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7/\2\2\u01e3E\3\2\2\2\u01e4"+
		"\u01e5\5T+\2\u01e5\u01e6\7\62\2\2\u01e6\u021c\3\2\2\2\u01e7\u01e8\5\36"+
		"\20\2\u01e8\u01e9\7\62\2\2\u01e9\u021c\3\2\2\2\u01ea\u021c\5D#\2\u01eb"+
		"\u01ec\7\23\2\2\u01ec\u01ed\7,\2\2\u01ed\u01ee\5d\63\2\u01ee\u01ef\7-"+
		"\2\2\u01ef\u01f2\5F$\2\u01f0\u01f1\7\20\2\2\u01f1\u01f3\5F$\2\u01f2\u01f0"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u021c\3\2\2\2\u01f4\u01f5\7\26\2\2"+
		"\u01f5\u01f6\7,\2\2\u01f6\u01f7\5d\63\2\u01f7\u01f8\7-\2\2\u01f8\u01f9"+
		"\5F$\2\u01f9\u021c\3\2\2\2\u01fa\u01fb\7\21\2\2\u01fb\u01fd\7,\2\2\u01fc"+
		"\u01fe\5J&\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2"+
		"\2\u01ff\u0201\7\62\2\2\u0200\u0202\5d\63\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\7\62\2\2\u0204\u0206\5"+
		"^\60\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0208\7-\2\2\u0208\u021c\5F$\2\u0209\u020a\7\25\2\2\u020a\u020b\7,\2"+
		"\2\u020b\u020c\5d\63\2\u020c\u020d\7-\2\2\u020d\u020e\7.\2\2\u020e\u020f"+
		"\5L\'\2\u020f\u0210\7/\2\2\u0210\u021c\3\2\2\2\u0211\u0213\7\24\2\2\u0212"+
		"\u0214\5d\63\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u021c\7\62\2\2\u0216\u0217\7\f\2\2\u0217\u021c\7\62\2\2\u0218"+
		"\u0219\7\16\2\2\u0219\u021c\7\62\2\2\u021a\u021c\5H%\2\u021b\u01e4\3\2"+
		"\2\2\u021b\u01e7\3\2\2\2\u021b\u01ea\3\2\2\2\u021b\u01eb\3\2\2\2\u021b"+
		"\u01f4\3\2\2\2\u021b\u01fa\3\2\2\2\u021b\u0209\3\2\2\2\u021b\u0211\3\2"+
		"\2\2\u021b\u0216\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u021a\3\2\2\2\u021c"+
		"G\3\2\2\2\u021d\u021e\7\62\2\2\u021eI\3\2\2\2\u021f\u0222\5\36\20\2\u0220"+
		"\u0222\5^\60\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222K\3\2\2\2"+
		"\u0223\u0225\5V,\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229"+
		"\u022b\5N(\2\u022a\u0226\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2"+
		"\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u0230\5P)\2\u022f\u022e"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230M\3\2\2\2\u0231\u0232\7\r\2\2\u0232"+
		"\u0233\5d\63\2\u0233\u0237\79\2\2\u0234\u0236\5R*\2\u0235\u0234\3\2\2"+
		"\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238O"+
		"\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7\17\2\2\u023b\u023f\79\2\2\u023c"+
		"\u023e\5R*\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2"+
		"\2\u023f\u0240\3\2\2\2\u0240Q\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0244"+
		"\5V,\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\5F"+
		"$\2\u0249S\3\2\2\2\u024a\u024b\5d\63\2\u024bU\3\2\2\2\u024c\u024d\7\13"+
		"\2\2\u024d\u0253\7b\2\2\u024e\u0250\7,\2\2\u024f\u0251\5d\63\2\u0250\u024f"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\7-\2\2\u0253"+
		"\u024e\3\2\2\2\u0253\u0254\3\2\2\2\u0254W\3\2\2\2\u0255\u0257\7b\2\2\u0256"+
		"\u0258\5Z.\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2"+
		"\2\u0259\u025b\5\\/\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025bY\3"+
		"\2\2\2\u025c\u025d\7S\2\2\u025d\u0262\5X-\2\u025e\u025f\7\63\2\2\u025f"+
		"\u0261\5X-\2\u0260\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2"+
		"\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266"+
		"\7Q\2\2\u0266[\3\2\2\2\u0267\u0268\7\60\2\2\u0268\u0269\7Y\2\2\u0269\u026b"+
		"\7\61\2\2\u026a\u0267\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026a\3\2\2\2"+
		"\u026c\u026d\3\2\2\2\u026d]\3\2\2\2\u026e\u0273\5`\61\2\u026f\u0270\7"+
		"\63\2\2\u0270\u0272\5`\61\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274_\3\2\2\2\u0275\u0273\3\2\2\2"+
		"\u0276\u0278\5V,\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c"+
		"\u027d\5d\63\2\u027da\3\2\2\2\u027e\u027f\7b\2\2\u027f\u0280\5h\65\2\u0280"+
		"c\3\2\2\2\u0281\u0282\b\63\1\2\u0282\u0283\t\2\2\2\u0283\u0297\5d\63\27"+
		"\u0284\u0285\7,\2\2\u0285\u0286\5d\63\2\u0286\u0287\7-\2\2\u0287\u0297"+
		"\3\2\2\2\u0288\u0289\7,\2\2\u0289\u028a\5X-\2\u028a\u028b\7-\2\2\u028b"+
		"\u028c\5d\63\25\u028c\u0297\3\2\2\2\u028d\u0297\5f\64\2\u028e\u028f\7"+
		")\2\2\u028f\u0290\7b\2\2\u0290\u0291\5h\65\2\u0291\u0292\79\2\2\u0292"+
		"\u0293\5h\65\2\u0293\u0297\3\2\2\2\u0294\u0297\5\b\5\2\u0295\u0297\5j"+
		"\66\2\u0296\u0281\3\2\2\2\u0296\u0284\3\2\2\2\u0296\u0288\3\2\2\2\u0296"+
		"\u028d\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2"+
		"\2\2\u0297\u02cd\3\2\2\2\u0298\u0299\f\22\2\2\u0299\u029a\t\3\2\2\u029a"+
		"\u02cc\5d\63\23\u029b\u029c\f\21\2\2\u029c\u029d\t\4\2\2\u029d\u02cc\5"+
		"d\63\22\u029e\u029f\f\20\2\2\u029f\u02a0\t\5\2\2\u02a0\u02cc\5d\63\21"+
		"\u02a1\u02a2\f\17\2\2\u02a2\u02a3\t\6\2\2\u02a3\u02cc\5d\63\20\u02a4\u02a5"+
		"\f\r\2\2\u02a5\u02a6\t\7\2\2\u02a6\u02cc\5d\63\16\u02a7\u02a8\f\f\2\2"+
		"\u02a8\u02a9\7C\2\2\u02a9\u02cc\5d\63\r\u02aa\u02ab\f\13\2\2\u02ab\u02ac"+
		"\7E\2\2\u02ac\u02cc\5d\63\f\u02ad\u02ae\f\n\2\2\u02ae\u02af\7D\2\2\u02af"+
		"\u02cc\5d\63\13\u02b0\u02b1\f\t\2\2\u02b1\u02b2\7;\2\2\u02b2\u02cc\5d"+
		"\63\n\u02b3\u02b4\f\b\2\2\u02b4\u02b5\7<\2\2\u02b5\u02cc\5d\63\t\u02b6"+
		"\u02b7\f\7\2\2\u02b7\u02b8\78\2\2\u02b8\u02b9\5d\63\2\u02b9\u02ba\79\2"+
		"\2\u02ba\u02bb\5d\63\7\u02bb\u02cc\3\2\2\2\u02bc\u02bd\f\6\2\2\u02bd\u02be"+
		"\t\b\2\2\u02be\u02cc\5d\63\6\u02bf\u02c0\f\30\2\2\u02c0\u02cc\t\t\2\2"+
		"\u02c1\u02c2\f\16\2\2\u02c2\u02c3\7(\2\2\u02c3\u02cc\5X-\2\u02c4\u02c7"+
		"\f\5\2\2\u02c5\u02c6\7\64\2\2\u02c6\u02c8\5\b\5\2\u02c7\u02c5\3\2\2\2"+
		"\u02c8\u02c9\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc"+
		"\3\2\2\2\u02cb\u0298\3\2\2\2\u02cb\u029b\3\2\2\2\u02cb\u029e\3\2\2\2\u02cb"+
		"\u02a1\3\2\2\2\u02cb\u02a4\3\2\2\2\u02cb\u02a7\3\2\2\2\u02cb\u02aa\3\2"+
		"\2\2\u02cb\u02ad\3\2\2\2\u02cb\u02b0\3\2\2\2\u02cb\u02b3\3\2\2\2\u02cb"+
		"\u02b6\3\2\2\2\u02cb\u02bc\3\2\2\2\u02cb\u02bf\3\2\2\2\u02cb\u02c1\3\2"+
		"\2\2\u02cb\u02c4\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02cee\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\78\2\2\u02d1"+
		"\u02d2\7,\2\2\u02d2\u02d5\5d\63\2\u02d3\u02d4\7\63\2\2\u02d4\u02d6\5d"+
		"\63\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\7-\2\2\u02dag\3\2\2\2\u02db"+
		"\u02dd\7,\2\2\u02dc\u02de\5^\60\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2"+
		"\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\7-\2\2\u02e0i\3\2\2\2\u02e1\u02e8"+
		"\5l\67\2\u02e2\u02e8\5n8\2\u02e3\u02e8\7_\2\2\u02e4\u02e8\7`\2\2\u02e5"+
		"\u02e8\7^\2\2\u02e6\u02e8\7a\2\2\u02e7\u02e1\3\2\2\2\u02e7\u02e2\3\2\2"+
		"\2\u02e7\u02e3\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6"+
		"\3\2\2\2\u02e8k\3\2\2\2\u02e9\u02ea\t\n\2\2\u02eam\3\2\2\2\u02eb\u02ec"+
		"\7]\2\2\u02eco\3\2\2\2Qs}\177\u0085\u0087\u008e\u0098\u009b\u00a1\u00a3"+
		"\u00bc\u00bf\u00c1\u00c9\u00cf\u00d2\u00df\u00e4\u00f4\u00fc\u0103\u0109"+
		"\u0115\u0120\u0126\u012a\u0132\u0135\u013c\u0142\u0148\u0153\u0159\u0164"+
		"\u0168\u016e\u0171\u017c\u017e\u0189\u0193\u019f\u01a8\u01ad\u01b5\u01b9"+
		"\u01c1\u01c5\u01cc\u01d5\u01df\u01f2\u01fd\u0201\u0205\u0213\u021b\u0221"+
		"\u0226\u022c\u022f\u0237\u023f\u0245\u0250\u0253\u0257\u025a\u0262\u026c"+
		"\u0273\u0279\u0296\u02c9\u02cb\u02cd\u02d7\u02dd\u02e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}