// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/CoreRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoreRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MONKEYS_AT=1, BREAK=2, CASE=3, CONTINUE=4, DEFAULT=5, ELSE=6, FOR=7, GOTO=8, 
		IF=9, RETURN=10, SWITCH=11, WHILE=12, ENV=13, FEATUREVAR=14, IMPORT=15, 
		PACKAGE=16, PRIVATE=17, PROTECTED=18, PUBLIC=19, RECORD=20, REACTIVECLASS=21, 
		INTERFACE=22, ABSTRACT=23, EXTENDS=24, IMPLEMENTS=25, MSGSRV=26, MAIN=27, 
		STATEVARS=28, KNOWNREBECS=29, INSTANCEOF=30, NEW=31, THIS=32, SUPER=33, 
		LPAREN=34, RPAREN=35, LBRACE=36, RBRACE=37, LBRACKET=38, RBRACKET=39, 
		SEMI=40, COMMA=41, DOT=42, EQ=43, BANG=44, TILDA=45, QUES=46, COLON=47, 
		EQEQ=48, AMPAMP=49, BARBAR=50, PLUSPLUS=51, SUBSUB=52, PLUS=53, SUB=54, 
		STAR=55, SLASH=56, AMP=57, BAR=58, CARET=59, PERCENT=60, PLUSEQ=61, SUBEQ=62, 
		STAREQ=63, SLASHEQ=64, AMPEQ=65, BAREQ=66, CARETEQ=67, TILDAEQ=68, PERCENTEQ=69, 
		BANGEQ=70, GT=71, GTEQ=72, LT=73, LTEQ=74, LTLT=75, LTLTEQ=76, GTGT=77, 
		GTGTEQ=78, DECIMAL_LITERAL=79, HEX_LITERAL=80, OCT_LITERAL=81, BINARY_LITERAL=82, 
		FLOAT_LITERAL=83, BOOL_LITERAL=84, CHAR_LITERAL=85, STRING_LITERAL=86, 
		NULL_LITERAL=87, IDENTIFIER=88, WS=89, COMMENT=90, LINE_COMMENT=91;
	public static final int
		RULE_rebecaModel = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_rebecaCode = 3, RULE_recordDeclaration = 4, RULE_mainDeclaration = 5, 
		RULE_mainRebecDefinition = 6, RULE_bindingsExpressionList = 7, RULE_argumentsExpressionList = 8, 
		RULE_fieldDeclaration = 9, RULE_variableDeclarators = 10, RULE_variableDeclarator = 11, 
		RULE_variableInitializer = 12, RULE_arrayInitializer = 13, RULE_interfaceDeclaration = 14, 
		RULE_extendingInterface = 15, RULE_msgsrvSignature = 16, RULE_reactiveClassDeclaration = 17, 
		RULE_implementingInterface = 18, RULE_knownRebecsDeclaration = 19, RULE_stateVarsDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_constructorDeclaration = 22, RULE_msgsrvDeclaration = 23, 
		RULE_synchMethodDeclaration = 24, RULE_formalParameters = 25, RULE_formalParametersDeclaration = 26, 
		RULE_formalParameterDeclaration = 27, RULE_block = 28, RULE_statement = 29, 
		RULE_statementExtension = 30, RULE_forInit = 31, RULE_switchBlock = 32, 
		RULE_caseSwitchGroup = 33, RULE_defaultSwitchGroup = 34, RULE_annotatedStatement = 35, 
		RULE_statementExpression = 36, RULE_annotation = 37, RULE_type = 38, RULE_genericTypeParams = 39, 
		RULE_dimensions = 40, RULE_expressionList = 41, RULE_annotatedExpression = 42, 
		RULE_methodCall = 43, RULE_expression = 44, RULE_nondetExpression = 45, 
		RULE_primary = 46, RULE_arguments = 47, RULE_literal = 48, RULE_integerLiteral = 49, 
		RULE_floatLiteral = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"rebecaModel", "packageDeclaration", "importDeclaration", "rebecaCode", 
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
			"primary", "arguments", "literal", "integerLiteral", "floatLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'break'", "'case'", "'continue'", "'default'", "'else'", 
			"'for'", "'goto'", "'if'", "'return'", "'switch'", "'while'", "'env'", 
			"'featurevar'", "'import'", "'package'", "'private'", "'protected'", 
			"'public'", "'record'", "'reactiveclass'", "'interface'", "'abstract'", 
			"'extends'", "'implements'", "'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", 
			"'instanceof'", "'new'", "'this'", "'super'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
			"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'~='", "'%='", "'!='", "'>'", "'>='", "'<'", "'<='", "'<<'", 
			"'<<='", "'>>'", "'>>='", null, null, null, null, null, null, null, null, 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MONKEYS_AT", "BREAK", "CASE", "CONTINUE", "DEFAULT", "ELSE", "FOR", 
			"GOTO", "IF", "RETURN", "SWITCH", "WHILE", "ENV", "FEATUREVAR", "IMPORT", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", "REACTIVECLASS", 
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
	public String getGrammarFileName() { return "CoreRebecaComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoreRebecaCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRebecaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRebecaModel(this);
		}
	}

	public final RebecaModelContext rebecaModel() throws RecognitionException {
		RebecaModelContext _localctx = new RebecaModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(102);
				packageDeclaration();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(105);
				importDeclaration();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		public TerminalNode PACKAGE() { return getToken(CoreRebecaCompleteParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		public TerminalNode IMPORT() { return getToken(CoreRebecaCompleteParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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

	public static class RebecaCodeContext extends ParserRuleContext {
		public RebecaCode rc;
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
		public List<TerminalNode> ENV() { return getTokens(CoreRebecaCompleteParser.ENV); }
		public TerminalNode ENV(int i) {
			return getToken(CoreRebecaCompleteParser.ENV, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public List<TerminalNode> FEATUREVAR() { return getTokens(CoreRebecaCompleteParser.FEATUREVAR); }
		public TerminalNode FEATUREVAR(int i) {
			return getToken(CoreRebecaCompleteParser.FEATUREVAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public RebecaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRebecaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRebecaCode(this);
		}
	}

	public final RebecaCodeContext rebecaCode() throws RecognitionException {
		RebecaCodeContext _localctx = new RebecaCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(117);
				recordDeclaration();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(123);
					match(ENV);
					setState(124);
					fieldDeclaration();
					setState(125);
					match(SEMI);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(127);
					match(FEATUREVAR);
					setState(128);
					match(IDENTIFIER);
					setState(129);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(135);
					reactiveClassDeclaration();
					}
					break;
				case 2:
					{
					setState(136);
					interfaceDeclaration();
					}
					break;
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << REACTIVECLASS) | (1L << INTERFACE) | (1L << ABSTRACT))) != 0) );
			setState(141);
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

	public static class RecordDeclarationContext extends ParserRuleContext {
		public RecordDeclaration rd;
		public TerminalNode RECORD() { return getToken(CoreRebecaCompleteParser.RECORD, 0); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		public TerminalNode MAIN() { return getToken(CoreRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(MAIN);
			setState(146);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(147);
				mainRebecDefinition();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMainRebecDefinition(this);
		}
	}

	public final MainRebecDefinitionContext mainRebecDefinition() throws RecognitionException {
		MainRebecDefinitionContext _localctx = new MainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(155);
				annotation();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			type();
			setState(162);
			match(IDENTIFIER);
			setState(163);
			match(LPAREN);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)) | (1L << (FLOAT_LITERAL - 79)) | (1L << (BOOL_LITERAL - 79)) | (1L << (CHAR_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (NULL_LITERAL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				setState(164);
				bindingsExpressionList();
				}
			}

			setState(167);
			match(RPAREN);
			setState(168);
			match(COLON);
			setState(169);
			match(LPAREN);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)) | (1L << (FLOAT_LITERAL - 79)) | (1L << (BOOL_LITERAL - 79)) | (1L << (CHAR_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (NULL_LITERAL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				setState(170);
				argumentsExpressionList();
				}
			}

			setState(173);
			match(RPAREN);
			setState(174);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterBindingsExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitBindingsExpressionList(this);
		}
	}

	public final BindingsExpressionListContext bindingsExpressionList() throws RecognitionException {
		BindingsExpressionListContext _localctx = new BindingsExpressionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bindingsExpressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterArgumentsExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitArgumentsExpressionList(this);
		}
	}

	public final ArgumentsExpressionListContext argumentsExpressionList() throws RecognitionException {
		ArgumentsExpressionListContext _localctx = new ArgumentsExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentsExpressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(180);
				annotation();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			type();
			setState(187);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			variableDeclarator();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				variableDeclarator();
				}
				}
				setState(196);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IDENTIFIER);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(198);
				match(EQ);
				setState(199);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableInitializer);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
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
				setState(203);
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
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LBRACE);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (NEW - 31)) | (1L << (THIS - 31)) | (1L << (SUPER - 31)) | (1L << (LPAREN - 31)) | (1L << (LBRACE - 31)) | (1L << (BANG - 31)) | (1L << (TILDA - 31)) | (1L << (QUES - 31)) | (1L << (PLUSPLUS - 31)) | (1L << (SUBSUB - 31)) | (1L << (PLUS - 31)) | (1L << (SUB - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (HEX_LITERAL - 31)) | (1L << (OCT_LITERAL - 31)) | (1L << (BINARY_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (CHAR_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
				{
				setState(207);
				variableInitializer();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					variableInitializer();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(217);
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
		public TerminalNode INTERFACE() { return getToken(CoreRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(219);
				annotation();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(INTERFACE);
			setState(226);
			match(IDENTIFIER);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(227);
				extendingInterface();
				}
			}

			setState(230);
			match(LBRACE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==MSGSRV) {
				{
				{
				setState(231);
				msgsrvSignature();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		public TerminalNode EXTENDS() { return getToken(CoreRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public ExtendingInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendingInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExtendingInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExtendingInterface(this);
		}
	}

	public final ExtendingInterfaceContext extendingInterface() throws RecognitionException {
		ExtendingInterfaceContext _localctx = new ExtendingInterfaceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_extendingInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(EXTENDS);
			setState(240);
			match(IDENTIFIER);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				match(IDENTIFIER);
				}
				}
				setState(247);
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
		public TerminalNode MSGSRV() { return getToken(CoreRebecaCompleteParser.MSGSRV, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMsgsrvSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMsgsrvSignature(this);
		}
	}

	public final MsgsrvSignatureContext msgsrvSignature() throws RecognitionException {
		MsgsrvSignatureContext _localctx = new MsgsrvSignatureContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_msgsrvSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(248);
				annotation();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(MSGSRV);
			setState(255);
			match(IDENTIFIER);
			setState(256);
			formalParameters();
			setState(257);
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
		public TerminalNode REACTIVECLASS() { return getToken(CoreRebecaCompleteParser.REACTIVECLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CoreRebecaCompleteParser.DECIMAL_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(CoreRebecaCompleteParser.EXTENDS, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(259);
				annotation();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(265);
				match(ABSTRACT);
				}
			}

			setState(268);
			match(REACTIVECLASS);
			setState(269);
			match(IDENTIFIER);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(270);
				match(EXTENDS);
				setState(271);
				match(IDENTIFIER);
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(274);
				implementingInterface();
				}
			}

			setState(277);
			match(LPAREN);
			setState(278);
			match(DECIMAL_LITERAL);
			setState(279);
			match(RPAREN);
			setState(280);
			match(LBRACE);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << ABSTRACT) | (1L << MSGSRV) | (1L << STATEVARS) | (1L << KNOWNREBECS))) != 0) || _la==IDENTIFIER) {
				{
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(281);
					knownRebecsDeclaration();
					}
					break;
				case 2:
					{
					setState(282);
					stateVarsDeclaration();
					}
					break;
				case 3:
					{
					setState(283);
					constructorDeclaration();
					}
					break;
				case 4:
					{
					setState(284);
					msgsrvDeclaration();
					}
					break;
				case 5:
					{
					setState(285);
					synchMethodDeclaration();
					}
					break;
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		public TerminalNode IMPLEMENTS() { return getToken(CoreRebecaCompleteParser.IMPLEMENTS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public ImplementingInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementingInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterImplementingInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitImplementingInterface(this);
		}
	}

	public final ImplementingInterfaceContext implementingInterface() throws RecognitionException {
		ImplementingInterfaceContext _localctx = new ImplementingInterfaceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_implementingInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(IMPLEMENTS);
			setState(294);
			match(IDENTIFIER);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(296);
				match(IDENTIFIER);
				}
				}
				setState(301);
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
		public TerminalNode KNOWNREBECS() { return getToken(CoreRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public KnownRebecsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownRebecsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterKnownRebecsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitKnownRebecsDeclaration(this);
		}
	}

	public final KnownRebecsDeclarationContext knownRebecsDeclaration() throws RecognitionException {
		KnownRebecsDeclarationContext _localctx = new KnownRebecsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_knownRebecsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(KNOWNREBECS);
			setState(303);
			match(LBRACE);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(304);
				fieldDeclaration();
				setState(305);
				match(SEMI);
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
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
		public TerminalNode STATEVARS() { return getToken(CoreRebecaCompleteParser.STATEVARS, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public StateVarsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStateVarsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStateVarsDeclaration(this);
		}
	}

	public final StateVarsDeclarationContext stateVarsDeclaration() throws RecognitionException {
		StateVarsDeclarationContext _localctx = new StateVarsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stateVarsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(STATEVARS);
			setState(315);
			match(LBRACE);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(316);
				fieldDeclaration();
				setState(317);
				match(SEMI);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(IDENTIFIER);
			setState(327);
			formalParameters();
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(328);
				block();
				}
				break;
			case SEMI:
				{
				setState(329);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(332);
				annotation();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
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
		public TerminalNode MSGSRV() { return getToken(CoreRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
		public MsgsrvDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgsrvDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_msgsrvDeclaration);
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
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(346);
				match(ABSTRACT);
				}
			}

			setState(349);
			match(MSGSRV);
			setState(350);
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
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
		public SynchMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(352);
				annotation();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(358);
				match(ABSTRACT);
				}
			}

			setState(361);
			type();
			setState(362);
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
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public FormalParametersDeclarationContext formalParametersDeclaration() {
			return getRuleContext(FormalParametersDeclarationContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LPAREN);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(365);
				formalParametersDeclaration();
				}
			}

			setState(368);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public FormalParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFormalParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFormalParametersDeclaration(this);
		}
	}

	public final FormalParametersDeclarationContext formalParametersDeclaration() throws RecognitionException {
		FormalParametersDeclarationContext _localctx = new FormalParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			formalParameterDeclaration();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				formalParameterDeclaration();
				}
				}
				setState(377);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFormalParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFormalParameterDeclaration(this);
		}
	}

	public final FormalParameterDeclarationContext formalParameterDeclaration() throws RecognitionException {
		FormalParameterDeclarationContext _localctx = new FormalParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			type();
			setState(379);
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
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LBRACE);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)) | (1L << (FLOAT_LITERAL - 79)) | (1L << (BOOL_LITERAL - 79)) | (1L << (CHAR_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (NULL_LITERAL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				{
				setState(382);
				annotatedStatement();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(CoreRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CoreRebecaCompleteParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CoreRebecaCompleteParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(CoreRebecaCompleteParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(CoreRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode RETURN() { return getToken(CoreRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(CoreRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(CoreRebecaCompleteParser.CONTINUE, 0); }
		public StatementExtensionContext statementExtension() {
			return getRuleContext(StatementExtensionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				statementExpression();
				setState(391);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				fieldDeclaration();
				setState(394);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(IF);
				setState(398);
				match(LPAREN);
				setState(399);
				expression(0);
				setState(400);
				match(RPAREN);
				setState(401);
				statement();
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(402);
					match(ELSE);
					setState(403);
					statement();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				match(WHILE);
				setState(407);
				match(LPAREN);
				setState(408);
				expression(0);
				setState(409);
				match(RPAREN);
				setState(410);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(FOR);
				setState(413);
				match(LPAREN);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)) | (1L << (FLOAT_LITERAL - 79)) | (1L << (BOOL_LITERAL - 79)) | (1L << (CHAR_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (NULL_LITERAL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
					{
					setState(414);
					forInit();
					}
				}

				setState(417);
				match(SEMI);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (NEW - 31)) | (1L << (THIS - 31)) | (1L << (SUPER - 31)) | (1L << (LPAREN - 31)) | (1L << (BANG - 31)) | (1L << (TILDA - 31)) | (1L << (QUES - 31)) | (1L << (PLUSPLUS - 31)) | (1L << (SUBSUB - 31)) | (1L << (PLUS - 31)) | (1L << (SUB - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (HEX_LITERAL - 31)) | (1L << (OCT_LITERAL - 31)) | (1L << (BINARY_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (CHAR_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(418);
					expression(0);
					}
				}

				setState(421);
				match(SEMI);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)) | (1L << (FLOAT_LITERAL - 79)) | (1L << (BOOL_LITERAL - 79)) | (1L << (CHAR_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (NULL_LITERAL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
					{
					setState(422);
					expressionList();
					}
				}

				setState(425);
				match(RPAREN);
				setState(426);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				match(SWITCH);
				setState(428);
				match(LPAREN);
				setState(429);
				expression(0);
				setState(430);
				match(RPAREN);
				setState(431);
				match(LBRACE);
				setState(432);
				switchBlock();
				setState(433);
				match(RBRACE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(435);
				match(RETURN);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (NEW - 31)) | (1L << (THIS - 31)) | (1L << (SUPER - 31)) | (1L << (LPAREN - 31)) | (1L << (BANG - 31)) | (1L << (TILDA - 31)) | (1L << (QUES - 31)) | (1L << (PLUSPLUS - 31)) | (1L << (SUBSUB - 31)) | (1L << (PLUS - 31)) | (1L << (SUB - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (HEX_LITERAL - 31)) | (1L << (OCT_LITERAL - 31)) | (1L << (BINARY_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (CHAR_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(436);
					expression(0);
					}
				}

				setState(439);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(440);
				match(BREAK);
				setState(441);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(442);
				match(CONTINUE);
				setState(443);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(444);
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
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
		public StatementExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStatementExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStatementExtension(this);
		}
	}

	public final StatementExtensionContext statementExtension() throws RecognitionException {
		StatementExtensionContext _localctx = new StatementExtensionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statementExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forInit);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(453);
					annotation();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
				caseSwitchGroup();
				}
				}
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MONKEYS_AT || _la==CASE );
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(464);
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
		public TerminalNode CASE() { return getToken(CoreRebecaCompleteParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterCaseSwitchGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitCaseSwitchGroup(this);
		}
	}

	public final CaseSwitchGroupContext caseSwitchGroup() throws RecognitionException {
		CaseSwitchGroupContext _localctx = new CaseSwitchGroupContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_caseSwitchGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(CASE);
			setState(468);
			expression(0);
			setState(469);
			match(COLON);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470);
					annotatedStatement();
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		public TerminalNode DEFAULT() { return getToken(CoreRebecaCompleteParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterDefaultSwitchGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitDefaultSwitchGroup(this);
		}
	}

	public final DefaultSwitchGroupContext defaultSwitchGroup() throws RecognitionException {
		DefaultSwitchGroupContext _localctx = new DefaultSwitchGroupContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_defaultSwitchGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(DEFAULT);
			setState(477);
			match(COLON);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)) | (1L << (FLOAT_LITERAL - 79)) | (1L << (BOOL_LITERAL - 79)) | (1L << (CHAR_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (NULL_LITERAL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				{
				setState(478);
				annotatedStatement();
				}
				}
				setState(483);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAnnotatedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAnnotatedStatement(this);
		}
	}

	public final AnnotatedStatementContext annotatedStatement() throws RecognitionException {
		AnnotatedStatementContext _localctx = new AnnotatedStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_annotatedStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					annotation();
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(490);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		public TerminalNode MONKEYS_AT() { return getToken(CoreRebecaCompleteParser.MONKEYS_AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(MONKEYS_AT);
			setState(495);
			match(IDENTIFIER);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(496);
				match(LPAREN);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (NEW - 31)) | (1L << (THIS - 31)) | (1L << (SUPER - 31)) | (1L << (LPAREN - 31)) | (1L << (BANG - 31)) | (1L << (TILDA - 31)) | (1L << (QUES - 31)) | (1L << (PLUSPLUS - 31)) | (1L << (SUBSUB - 31)) | (1L << (PLUS - 31)) | (1L << (SUB - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (HEX_LITERAL - 31)) | (1L << (OCT_LITERAL - 31)) | (1L << (BINARY_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (CHAR_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(497);
					expression(0);
					}
				}

				setState(500);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(IDENTIFIER);
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(504);
				genericTypeParams();
				}
				break;
			}
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(507);
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
		public TerminalNode LT() { return getToken(CoreRebecaCompleteParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(CoreRebecaCompleteParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(LT);
			setState(511);
			type();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(512);
				match(COMMA);
				setState(513);
				type();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
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
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(CoreRebecaCompleteParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(CoreRebecaCompleteParser.DECIMAL_LITERAL, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(521);
					match(LBRACKET);
					setState(522);
					match(DECIMAL_LITERAL);
					setState(523);
					match(RBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(526); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			annotatedExpression();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(529);
				match(COMMA);
				setState(530);
				annotatedExpression();
				}
				}
				setState(535);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAnnotatedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAnnotatedExpression(this);
		}
	}

	public final AnnotatedExpressionContext annotatedExpression() throws RecognitionException {
		AnnotatedExpressionContext _localctx = new AnnotatedExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_annotatedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(536);
				annotation();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(IDENTIFIER);
			setState(545);
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
		public Token dot;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoreRebecaCompleteParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(CoreRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(CoreRebecaCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(CoreRebecaCompleteParser.BANG, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NondetExpressionContext nondetExpression() {
			return getRuleContext(NondetExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CoreRebecaCompleteParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode STAR() { return getToken(CoreRebecaCompleteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CoreRebecaCompleteParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(CoreRebecaCompleteParser.PERCENT, 0); }
		public TerminalNode LTLT() { return getToken(CoreRebecaCompleteParser.LTLT, 0); }
		public TerminalNode GTGT() { return getToken(CoreRebecaCompleteParser.GTGT, 0); }
		public TerminalNode LTEQ() { return getToken(CoreRebecaCompleteParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(CoreRebecaCompleteParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(CoreRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaCompleteParser.GT, 0); }
		public TerminalNode EQEQ() { return getToken(CoreRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(CoreRebecaCompleteParser.BANGEQ, 0); }
		public TerminalNode AMP() { return getToken(CoreRebecaCompleteParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(CoreRebecaCompleteParser.CARET, 0); }
		public TerminalNode BAR() { return getToken(CoreRebecaCompleteParser.BAR, 0); }
		public TerminalNode AMPAMP() { return getToken(CoreRebecaCompleteParser.AMPAMP, 0); }
		public TerminalNode BARBAR() { return getToken(CoreRebecaCompleteParser.BARBAR, 0); }
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(CoreRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(CoreRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(CoreRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(CoreRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(CoreRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(CoreRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(CoreRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(CoreRebecaCompleteParser.GTGTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(CoreRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(CoreRebecaCompleteParser.PERCENTEQ, 0); }
		public List<TerminalNode> DOT() { return getTokens(CoreRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CoreRebecaCompleteParser.DOT, i);
		}
		public TerminalNode INSTANCEOF() { return getToken(CoreRebecaCompleteParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExpression(this);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(548);
				primary();
				}
				break;
			case 2:
				{
				setState(549);
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
				setState(550);
				expression(19);
				}
				break;
			case 3:
				{
				setState(551);
				((ExpressionContext)_localctx).parenExp = match(LPAREN);
				setState(552);
				expression(0);
				setState(553);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(555);
				match(LPAREN);
				setState(556);
				((ExpressionContext)_localctx).castType = type();
				setState(557);
				match(RPAREN);
				setState(558);
				expression(17);
				}
				break;
			case 5:
				{
				setState(560);
				nondetExpression();
				}
				break;
			case 6:
				{
				setState(561);
				match(NEW);
				setState(562);
				match(IDENTIFIER);
				setState(563);
				arguments();
				setState(564);
				match(COLON);
				setState(565);
				arguments();
				}
				break;
			case 7:
				{
				setState(567);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(621);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(570);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(571);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(572);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(574);
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
						setState(575);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(577);
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
						setState(578);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(580);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (GT - 71)) | (1L << (GTEQ - 71)) | (1L << (LT - 71)) | (1L << (LTEQ - 71)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(581);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(583);
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
						setState(584);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(586);
						((ExpressionContext)_localctx).bop = match(AMP);
						setState(587);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(589);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(590);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(591);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(592);
						((ExpressionContext)_localctx).bop = match(BAR);
						setState(593);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(594);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(595);
						((ExpressionContext)_localctx).bop = match(AMPAMP);
						setState(596);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(597);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(598);
						((ExpressionContext)_localctx).bop = match(BARBAR);
						setState(599);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(600);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(601);
						((ExpressionContext)_localctx).bop = match(QUES);
						setState(602);
						expression(0);
						setState(603);
						match(COLON);
						setState(604);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(606);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(607);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (EQ - 43)) | (1L << (PLUSEQ - 43)) | (1L << (SUBEQ - 43)) | (1L << (STAREQ - 43)) | (1L << (SLASHEQ - 43)) | (1L << (AMPEQ - 43)) | (1L << (BAREQ - 43)) | (1L << (CARETEQ - 43)) | (1L << (PERCENTEQ - 43)) | (1L << (LTLTEQ - 43)) | (1L << (GTGTEQ - 43)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(608);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(609);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(612); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(610);
								((ExpressionContext)_localctx).dot = match(DOT);
								setState(611);
								expression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(614); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(616);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(617);
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
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(618);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(619);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(620);
						type();
						}
						break;
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public NondetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nondetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterNondetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitNondetExpression(this);
		}
	}

	public final NondetExpressionContext nondetExpression() throws RecognitionException {
		NondetExpressionContext _localctx = new NondetExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_nondetExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(QUES);
			setState(627);
			match(LPAREN);
			setState(628);
			expression(0);
			setState(631); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(629);
				match(COMMA);
				setState(630);
				expression(0);
				}
				}
				setState(633); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(635);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public TerminalNode THIS() { return getToken(CoreRebecaCompleteParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(CoreRebecaCompleteParser.SUPER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primary);
		try {
			int _alt;
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(SUPER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				match(IDENTIFIER);
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(640);
					arguments();
					}
					break;
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(643);
						match(LBRACKET);
						setState(644);
						expression(0);
						setState(645);
						match(RBRACKET);
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> args;
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(LPAREN);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MONKEYS_AT) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)) | (1L << (FLOAT_LITERAL - 79)) | (1L << (BOOL_LITERAL - 79)) | (1L << (CHAR_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (NULL_LITERAL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				setState(655);
				expressionList();
				}
			}

			setState(658);
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
		public TerminalNode CHAR_LITERAL() { return getToken(CoreRebecaCompleteParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CoreRebecaCompleteParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CoreRebecaCompleteParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(CoreRebecaCompleteParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(664);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(665);
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(CoreRebecaCompleteParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CoreRebecaCompleteParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(CoreRebecaCompleteParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(CoreRebecaCompleteParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (OCT_LITERAL - 79)) | (1L << (BINARY_LITERAL - 79)))) != 0)) ) {
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
		public TerminalNode FLOAT_LITERAL() { return getToken(CoreRebecaCompleteParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
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
		case 44:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 22);
		case 13:
			return precpred(_ctx, 20);
		case 14:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u02a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\5\2j\n\2\3\2\7\2m\n\2\f\2\16\2p\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0085\n\5\f"+
		"\5\16\5\u0088\13\5\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\b\7\b\u009f"+
		"\n\b\f\b\16\b\u00a2\13\b\3\b\3\b\3\b\3\b\5\b\u00a8\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00ae\n\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\7\13\u00b8\n\13\f\13\16"+
		"\13\u00bb\13\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6"+
		"\13\f\3\r\3\r\3\r\5\r\u00cb\n\r\3\16\3\16\5\16\u00cf\n\16\3\17\3\17\3"+
		"\17\3\17\7\17\u00d5\n\17\f\17\16\17\u00d8\13\17\5\17\u00da\n\17\3\17\3"+
		"\17\3\20\7\20\u00df\n\20\f\20\16\20\u00e2\13\20\3\20\3\20\3\20\5\20\u00e7"+
		"\n\20\3\20\3\20\7\20\u00eb\n\20\f\20\16\20\u00ee\13\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00f6\n\21\f\21\16\21\u00f9\13\21\3\22\7\22\u00fc"+
		"\n\22\f\22\16\22\u00ff\13\22\3\22\3\22\3\22\3\22\3\22\3\23\7\23\u0107"+
		"\n\23\f\23\16\23\u010a\13\23\3\23\5\23\u010d\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0113\n\23\3\23\5\23\u0116\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\7\23\u0121\n\23\f\23\16\23\u0124\13\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\7\24\u012c\n\24\f\24\16\24\u012f\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u0136\n\25\f\25\16\25\u0139\13\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u0142\n\26\f\26\16\26\u0145\13\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\5\27\u014d\n\27\3\30\7\30\u0150\n\30\f\30\16\30\u0153\13"+
		"\30\3\30\3\30\3\31\7\31\u0158\n\31\f\31\16\31\u015b\13\31\3\31\5\31\u015e"+
		"\n\31\3\31\3\31\3\31\3\32\7\32\u0164\n\32\f\32\16\32\u0167\13\32\3\32"+
		"\5\32\u016a\n\32\3\32\3\32\3\32\3\33\3\33\5\33\u0171\n\33\3\33\3\33\3"+
		"\34\3\34\3\34\7\34\u0178\n\34\f\34\16\34\u017b\13\34\3\35\3\35\3\35\3"+
		"\36\3\36\7\36\u0182\n\36\f\36\16\36\u0185\13\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0197"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01a2\n\37\3\37"+
		"\3\37\5\37\u01a6\n\37\3\37\3\37\5\37\u01aa\n\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01b8\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u01c0\n\37\3 \3 \3!\3!\5!\u01c6\n!\3\"\7\"\u01c9"+
		"\n\"\f\"\16\"\u01cc\13\"\3\"\6\"\u01cf\n\"\r\"\16\"\u01d0\3\"\5\"\u01d4"+
		"\n\"\3#\3#\3#\3#\7#\u01da\n#\f#\16#\u01dd\13#\3$\3$\3$\7$\u01e2\n$\f$"+
		"\16$\u01e5\13$\3%\7%\u01e8\n%\f%\16%\u01eb\13%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\5\'\u01f5\n\'\3\'\5\'\u01f8\n\'\3(\3(\5(\u01fc\n(\3(\5(\u01ff\n("+
		"\3)\3)\3)\3)\7)\u0205\n)\f)\16)\u0208\13)\3)\3)\3*\3*\3*\6*\u020f\n*\r"+
		"*\16*\u0210\3+\3+\3+\7+\u0216\n+\f+\16+\u0219\13+\3,\7,\u021c\n,\f,\16"+
		",\u021f\13,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u023b\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\6.\u0267\n.\r.\16.\u0268\3.\3.\3.\3.\3.\7.\u0270\n"+
		".\f.\16.\u0273\13.\3/\3/\3/\3/\3/\6/\u027a\n/\r/\16/\u027b\3/\3/\3\60"+
		"\3\60\3\60\3\60\5\60\u0284\n\60\3\60\3\60\3\60\3\60\7\60\u028a\n\60\f"+
		"\60\16\60\u028d\13\60\5\60\u028f\n\60\3\61\3\61\5\61\u0293\n\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u029d\n\62\3\63\3\63\3\64\3\64"+
		"\3\64\2\3Z\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\13\4\2./\658\4\29:>>\3\2\678\4\2MMOO\3"+
		"\2IL\4\2\62\62HH\7\2--?EGGNNPP\3\2\65\66\3\2QT\2\u02d9\2i\3\2\2\2\4s\3"+
		"\2\2\2\6u\3\2\2\2\bz\3\2\2\2\n\u0091\3\2\2\2\f\u0093\3\2\2\2\16\u00a0"+
		"\3\2\2\2\20\u00b2\3\2\2\2\22\u00b4\3\2\2\2\24\u00b9\3\2\2\2\26\u00bf\3"+
		"\2\2\2\30\u00c7\3\2\2\2\32\u00ce\3\2\2\2\34\u00d0\3\2\2\2\36\u00e0\3\2"+
		"\2\2 \u00f1\3\2\2\2\"\u00fd\3\2\2\2$\u0108\3\2\2\2&\u0127\3\2\2\2(\u0130"+
		"\3\2\2\2*\u013c\3\2\2\2,\u0148\3\2\2\2.\u0151\3\2\2\2\60\u0159\3\2\2\2"+
		"\62\u0165\3\2\2\2\64\u016e\3\2\2\2\66\u0174\3\2\2\28\u017c\3\2\2\2:\u017f"+
		"\3\2\2\2<\u01bf\3\2\2\2>\u01c1\3\2\2\2@\u01c5\3\2\2\2B\u01ce\3\2\2\2D"+
		"\u01d5\3\2\2\2F\u01de\3\2\2\2H\u01e9\3\2\2\2J\u01ee\3\2\2\2L\u01f0\3\2"+
		"\2\2N\u01f9\3\2\2\2P\u0200\3\2\2\2R\u020e\3\2\2\2T\u0212\3\2\2\2V\u021d"+
		"\3\2\2\2X\u0222\3\2\2\2Z\u023a\3\2\2\2\\\u0274\3\2\2\2^\u028e\3\2\2\2"+
		"`\u0290\3\2\2\2b\u029c\3\2\2\2d\u029e\3\2\2\2f\u02a0\3\2\2\2hj\5\4\3\2"+
		"ih\3\2\2\2ij\3\2\2\2jn\3\2\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\5\b\5\2r\3\3\2\2\2st\7\22\2\2t\5\3\2"+
		"\2\2uv\7\21\2\2v\7\3\2\2\2wy\5\n\6\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\u0086\3\2\2\2|z\3\2\2\2}~\7\17\2\2~\177\5\24\13\2\177\u0080\7"+
		"*\2\2\u0080\u0085\3\2\2\2\u0081\u0082\7\20\2\2\u0082\u0083\7Z\2\2\u0083"+
		"\u0085\7*\2\2\u0084}\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008c\5$\23\2\u008a\u008c\5\36\20\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5\f\7\2\u0090\t\3\2\2\2\u0091\u0092"+
		"\7\26\2\2\u0092\13\3\2\2\2\u0093\u0094\7\35\2\2\u0094\u0098\7&\2\2\u0095"+
		"\u0097\5\16\b\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\7\'\2\2\u009c\r\3\2\2\2\u009d\u009f\5L\'\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5N(\2\u00a4\u00a5\7Z\2\2\u00a5"+
		"\u00a7\7$\2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\7\61\2\2\u00ab"+
		"\u00ad\7$\2\2\u00ac\u00ae\5\22\n\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7%\2\2\u00b0\u00b1\7*\2\2\u00b1\17"+
		"\3\2\2\2\u00b2\u00b3\5T+\2\u00b3\21\3\2\2\2\u00b4\u00b5\5T+\2\u00b5\23"+
		"\3\2\2\2\u00b6\u00b8\5L\'\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\5N(\2\u00bd\u00be\5\26\f\2\u00be\25\3\2\2\2\u00bf\u00c4"+
		"\5\30\r\2\u00c0\u00c1\7+\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c0\3\2\2\2"+
		"\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\7Z\2\2\u00c8\u00c9\7-\2\2\u00c9"+
		"\u00cb\5\32\16\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\31\3\2"+
		"\2\2\u00cc\u00cf\5\34\17\2\u00cd\u00cf\5Z.\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\33\3\2\2\2\u00d0\u00d9\7&\2\2\u00d1\u00d6\5\32\16"+
		"\2\u00d2\u00d3\7+\2\2\u00d3\u00d5\5\32\16\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc\35\3\2\2\2\u00dd\u00df\5L\'\2"+
		"\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\30\2\2"+
		"\u00e4\u00e6\7Z\2\2\u00e5\u00e7\5 \21\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\7&\2\2\u00e9\u00eb\5\"\22\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0"+
		"\37\3\2\2\2\u00f1\u00f2\7\32\2\2\u00f2\u00f7\7Z\2\2\u00f3\u00f4\7+\2\2"+
		"\u00f4\u00f6\7Z\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8!\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fc\5L\'\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7\34\2\2\u0101\u0102\7Z\2\2\u0102\u0103\5\64\33\2\u0103\u0104\7"+
		"*\2\2\u0104#\3\2\2\2\u0105\u0107\5L\'\2\u0106\u0105\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010d\7\31\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\27\2\2\u010f\u0112\7Z\2\2\u0110"+
		"\u0111\7\32\2\2\u0111\u0113\7Z\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5&\24\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7$\2\2\u0118\u0119\7Q\2"+
		"\2\u0119\u011a\7%\2\2\u011a\u0122\7&\2\2\u011b\u0121\5(\25\2\u011c\u0121"+
		"\5*\26\2\u011d\u0121\5.\30\2\u011e\u0121\5\60\31\2\u011f\u0121\5\62\32"+
		"\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\'"+
		"\2\2\u0126%\3\2\2\2\u0127\u0128\7\33\2\2\u0128\u012d\7Z\2\2\u0129\u012a"+
		"\7+\2\2\u012a\u012c\7Z\2\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\'\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u0130\u0131\7\37\2\2\u0131\u0137\7&\2\2\u0132\u0133\5\24\13\2\u0133\u0134"+
		"\7*\2\2\u0134\u0136\3\2\2\2\u0135\u0132\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013b\7\'\2\2\u013b)\3\2\2\2\u013c\u013d\7\36\2\2\u013d\u0143"+
		"\7&\2\2\u013e\u013f\5\24\13\2\u013f\u0140\7*\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013e\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\'\2\2\u0147"+
		"+\3\2\2\2\u0148\u0149\7Z\2\2\u0149\u014c\5\64\33\2\u014a\u014d\5:\36\2"+
		"\u014b\u014d\7*\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d-\3\2"+
		"\2\2\u014e\u0150\5L\'\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0155\5,\27\2\u0155/\3\2\2\2\u0156\u0158\5L\'\2\u0157\u0156"+
		"\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\7\31\2\2\u015d\u015c\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\34\2\2\u0160"+
		"\u0161\5,\27\2\u0161\61\3\2\2\2\u0162\u0164\5L\'\2\u0163\u0162\3\2\2\2"+
		"\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\7\31\2\2\u0169\u0168\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5N(\2\u016c\u016d"+
		"\5,\27\2\u016d\63\3\2\2\2\u016e\u0170\7$\2\2\u016f\u0171\5\66\34\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7%"+
		"\2\2\u0173\65\3\2\2\2\u0174\u0179\58\35\2\u0175\u0176\7+\2\2\u0176\u0178"+
		"\58\35\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\67\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\5N(\2"+
		"\u017d\u017e\7Z\2\2\u017e9\3\2\2\2\u017f\u0183\7&\2\2\u0180\u0182\5H%"+
		"\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\'\2\2\u0187"+
		";\3\2\2\2\u0188\u0189\5J&\2\u0189\u018a\7*\2\2\u018a\u01c0\3\2\2\2\u018b"+
		"\u018c\5\24\13\2\u018c\u018d\7*\2\2\u018d\u01c0\3\2\2\2\u018e\u01c0\5"+
		":\36\2\u018f\u0190\7\13\2\2\u0190\u0191\7$\2\2\u0191\u0192\5Z.\2\u0192"+
		"\u0193\7%\2\2\u0193\u0196\5<\37\2\u0194\u0195\7\b\2\2\u0195\u0197\5<\37"+
		"\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01c0\3\2\2\2\u0198\u0199"+
		"\7\16\2\2\u0199\u019a\7$\2\2\u019a\u019b\5Z.\2\u019b\u019c\7%\2\2\u019c"+
		"\u019d\5<\37\2\u019d\u01c0\3\2\2\2\u019e\u019f\7\t\2\2\u019f\u01a1\7$"+
		"\2\2\u01a0\u01a2\5@!\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a5\7*\2\2\u01a4\u01a6\5Z.\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\7*\2\2\u01a8\u01aa\5T+"+
		"\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac"+
		"\7%\2\2\u01ac\u01c0\5<\37\2\u01ad\u01ae\7\r\2\2\u01ae\u01af\7$\2\2\u01af"+
		"\u01b0\5Z.\2\u01b0\u01b1\7%\2\2\u01b1\u01b2\7&\2\2\u01b2\u01b3\5B\"\2"+
		"\u01b3\u01b4\7\'\2\2\u01b4\u01c0\3\2\2\2\u01b5\u01b7\7\f\2\2\u01b6\u01b8"+
		"\5Z.\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01c0\7*\2\2\u01ba\u01bb\7\4\2\2\u01bb\u01c0\7*\2\2\u01bc\u01bd\7\6\2"+
		"\2\u01bd\u01c0\7*\2\2\u01be\u01c0\5> \2\u01bf\u0188\3\2\2\2\u01bf\u018b"+
		"\3\2\2\2\u01bf\u018e\3\2\2\2\u01bf\u018f\3\2\2\2\u01bf\u0198\3\2\2\2\u01bf"+
		"\u019e\3\2\2\2\u01bf\u01ad\3\2\2\2\u01bf\u01b5\3\2\2\2\u01bf\u01ba\3\2"+
		"\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0=\3\2\2\2\u01c1\u01c2"+
		"\7*\2\2\u01c2?\3\2\2\2\u01c3\u01c6\5\24\13\2\u01c4\u01c6\5T+\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6A\3\2\2\2\u01c7\u01c9\5L\'\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf\5D#\2\u01ce\u01ca\3\2\2"+
		"\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3"+
		"\3\2\2\2\u01d2\u01d4\5F$\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"C\3\2\2\2\u01d5\u01d6\7\5\2\2\u01d6\u01d7\5Z.\2\u01d7\u01db\7\61\2\2\u01d8"+
		"\u01da\5H%\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2"+
		"\2\u01db\u01dc\3\2\2\2\u01dcE\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df"+
		"\7\7\2\2\u01df\u01e3\7\61\2\2\u01e0\u01e2\5H%\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4G\3\2\2\2"+
		"\u01e5\u01e3\3\2\2\2\u01e6\u01e8\5L\'\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01ed\5<\37\2\u01edI\3\2\2\2\u01ee\u01ef\5Z.\2\u01ef"+
		"K\3\2\2\2\u01f0\u01f1\7\3\2\2\u01f1\u01f7\7Z\2\2\u01f2\u01f4\7$\2\2\u01f3"+
		"\u01f5\5Z.\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2"+
		"\2\u01f6\u01f8\7%\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8M\3"+
		"\2\2\2\u01f9\u01fb\7Z\2\2\u01fa\u01fc\5P)\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5R*\2\u01fe\u01fd\3\2\2"+
		"\2\u01fe\u01ff\3\2\2\2\u01ffO\3\2\2\2\u0200\u0201\7K\2\2\u0201\u0206\5"+
		"N(\2\u0202\u0203\7+\2\2\u0203\u0205\5N(\2\u0204\u0202\3\2\2\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020a\7I\2\2\u020aQ\3\2\2\2\u020b\u020c\7(\2\2\u020c"+
		"\u020d\7Q\2\2\u020d\u020f\7)\2\2\u020e\u020b\3\2\2\2\u020f\u0210\3\2\2"+
		"\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211S\3\2\2\2\u0212\u0217"+
		"\5V,\2\u0213\u0214\7+\2\2\u0214\u0216\5V,\2\u0215\u0213\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218U\3\2\2\2"+
		"\u0219\u0217\3\2\2\2\u021a\u021c\5L\'\2\u021b\u021a\3\2\2\2\u021c\u021f"+
		"\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u0220\u0221\5Z.\2\u0221W\3\2\2\2\u0222\u0223\7Z\2\2\u0223"+
		"\u0224\5`\61\2\u0224Y\3\2\2\2\u0225\u0226\b.\1\2\u0226\u023b\5^\60\2\u0227"+
		"\u0228\t\2\2\2\u0228\u023b\5Z.\25\u0229\u022a\7$\2\2\u022a\u022b\5Z.\2"+
		"\u022b\u022c\7%\2\2\u022c\u023b\3\2\2\2\u022d\u022e\7$\2\2\u022e\u022f"+
		"\5N(\2\u022f\u0230\7%\2\2\u0230\u0231\5Z.\23\u0231\u023b\3\2\2\2\u0232"+
		"\u023b\5\\/\2\u0233\u0234\7!\2\2\u0234\u0235\7Z\2\2\u0235\u0236\5`\61"+
		"\2\u0236\u0237\7\61\2\2\u0237\u0238\5`\61\2\u0238\u023b\3\2\2\2\u0239"+
		"\u023b\5b\62\2\u023a\u0225\3\2\2\2\u023a\u0227\3\2\2\2\u023a\u0229\3\2"+
		"\2\2\u023a\u022d\3\2\2\2\u023a\u0232\3\2\2\2\u023a\u0233\3\2\2\2\u023a"+
		"\u0239\3\2\2\2\u023b\u0271\3\2\2\2\u023c\u023d\f\20\2\2\u023d\u023e\t"+
		"\3\2\2\u023e\u0270\5Z.\21\u023f\u0240\f\17\2\2\u0240\u0241\t\4\2\2\u0241"+
		"\u0270\5Z.\20\u0242\u0243\f\16\2\2\u0243\u0244\t\5\2\2\u0244\u0270\5Z"+
		".\17\u0245\u0246\f\r\2\2\u0246\u0247\t\6\2\2\u0247\u0270\5Z.\16\u0248"+
		"\u0249\f\13\2\2\u0249\u024a\t\7\2\2\u024a\u0270\5Z.\f\u024b\u024c\f\n"+
		"\2\2\u024c\u024d\7;\2\2\u024d\u0270\5Z.\13\u024e\u024f\f\t\2\2\u024f\u0250"+
		"\7=\2\2\u0250\u0270\5Z.\n\u0251\u0252\f\b\2\2\u0252\u0253\7<\2\2\u0253"+
		"\u0270\5Z.\t\u0254\u0255\f\7\2\2\u0255\u0256\7\63\2\2\u0256\u0270\5Z."+
		"\b\u0257\u0258\f\6\2\2\u0258\u0259\7\64\2\2\u0259\u0270\5Z.\7\u025a\u025b"+
		"\f\5\2\2\u025b\u025c\7\60\2\2\u025c\u025d\5Z.\2\u025d\u025e\7\61\2\2\u025e"+
		"\u025f\5Z.\5\u025f\u0270\3\2\2\2\u0260\u0261\f\4\2\2\u0261\u0262\t\b\2"+
		"\2\u0262\u0270\5Z.\4\u0263\u0266\f\30\2\2\u0264\u0265\7,\2\2\u0265\u0267"+
		"\5Z.\2\u0266\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u0270\3\2\2\2\u026a\u026b\f\26\2\2\u026b\u0270\t"+
		"\t\2\2\u026c\u026d\f\f\2\2\u026d\u026e\7 \2\2\u026e\u0270\5N(\2\u026f"+
		"\u023c\3\2\2\2\u026f\u023f\3\2\2\2\u026f\u0242\3\2\2\2\u026f\u0245\3\2"+
		"\2\2\u026f\u0248\3\2\2\2\u026f\u024b\3\2\2\2\u026f\u024e\3\2\2\2\u026f"+
		"\u0251\3\2\2\2\u026f\u0254\3\2\2\2\u026f\u0257\3\2\2\2\u026f\u025a\3\2"+
		"\2\2\u026f\u0260\3\2\2\2\u026f\u0263\3\2\2\2\u026f\u026a\3\2\2\2\u026f"+
		"\u026c\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272[\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7\60\2\2\u0275\u0276"+
		"\7$\2\2\u0276\u0279\5Z.\2\u0277\u0278\7+\2\2\u0278\u027a\5Z.\2\u0279\u0277"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027e\7%\2\2\u027e]\3\2\2\2\u027f\u028f\7\"\2\2\u0280"+
		"\u028f\7#\2\2\u0281\u0283\7Z\2\2\u0282\u0284\5`\61\2\u0283\u0282\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u028b\3\2\2\2\u0285\u0286\7(\2\2\u0286\u0287"+
		"\5Z.\2\u0287\u0288\7)\2\2\u0288\u028a\3\2\2\2\u0289\u0285\3\2\2\2\u028a"+
		"\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028f\3\2"+
		"\2\2\u028d\u028b\3\2\2\2\u028e\u027f\3\2\2\2\u028e\u0280\3\2\2\2\u028e"+
		"\u0281\3\2\2\2\u028f_\3\2\2\2\u0290\u0292\7$\2\2\u0291\u0293\5T+\2\u0292"+
		"\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\7%"+
		"\2\2\u0295a\3\2\2\2\u0296\u029d\5d\63\2\u0297\u029d\5f\64\2\u0298\u029d"+
		"\7W\2\2\u0299\u029d\7X\2\2\u029a\u029d\7V\2\2\u029b\u029d\7Y\2\2\u029c"+
		"\u0296\3\2\2\2\u029c\u0297\3\2\2\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2"+
		"\2\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2\u029dc\3\2\2\2\u029e\u029f"+
		"\t\n\2\2\u029fe\3\2\2\2\u02a0\u02a1\7U\2\2\u02a1g\3\2\2\2Iinz\u0084\u0086"+
		"\u008b\u008d\u0098\u00a0\u00a7\u00ad\u00b9\u00c4\u00ca\u00ce\u00d6\u00d9"+
		"\u00e0\u00e6\u00ec\u00f7\u00fd\u0108\u010c\u0112\u0115\u0120\u0122\u012d"+
		"\u0137\u0143\u014c\u0151\u0159\u015d\u0165\u0169\u0170\u0179\u0183\u0196"+
		"\u01a1\u01a5\u01a9\u01b7\u01bf\u01c5\u01ca\u01d0\u01d3\u01db\u01e3\u01e9"+
		"\u01f4\u01f7\u01fb\u01fe\u0206\u0210\u0217\u021d\u023a\u0268\u026f\u0271"+
		"\u027b\u0283\u028b\u028e\u0292\u029c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}