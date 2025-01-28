// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/CoreRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
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
public class CoreRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTLITERAL=1, FLOATLITERAL=2, DOUBLELITERAL=3, CHARLITERAL=4, STRINGLITERAL=5, 
		WS=6, COMMENT=7, LINE_COMMENT=8, BREAK=9, CASE=10, CLASS=11, CONTINUE=12, 
		DEFAULT=13, ELSE=14, FOR=15, GOTO=16, IF=17, IMPORT=18, NEW=19, PACKAGE=20, 
		PRIVATE=21, PROTECTED=22, PUBLIC=23, RECORD=24, RETURN=25, SWITCH=26, 
		WHILE=27, ENV=28, FEATUREVAR=29, INSTANCEOF=30, REACTIVECLASS=31, INTERFACE=32, 
		ABSTRACT=33, EXTENDS=34, IMPLEMENTS=35, MSGSRV=36, MAIN=37, STATEVARS=38, 
		KNOWNREBECS=39, THIS=40, TRUE=41, FALSE=42, NULL=43, LPAREN=44, RPAREN=45, 
		LBRACE=46, RBRACE=47, LBRACKET=48, RBRACKET=49, SEMI=50, COMMA=51, DOT=52, 
		EQ=53, BANG=54, TILDA=55, QUES=56, COLON=57, EQEQ=58, AMPAMP=59, BARBAR=60, 
		PLUSPLUS=61, SUBSUB=62, SUPER=63, PLUS=64, SUB=65, STAR=66, SLASH=67, 
		AMP=68, BAR=69, CARET=70, PERCENT=71, PLUSEQ=72, SUBEQ=73, STAREQ=74, 
		SLASHEQ=75, AMPEQ=76, BAREQ=77, CARETEQ=78, TILDAEQ=79, PERCENTEQ=80, 
		MONKEYS_AT=81, BANGEQ=82, GT=83, LT=84, LTLT=85, LTLTEQ=86, GTGT=87, GTGTEQ=88, 
		IDENTIFIER=89;
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
		RULE_forInit = 30, RULE_switchBlock = 31, RULE_caseSwitchGroup = 32, RULE_defaultSwitchGroup = 33, 
		RULE_annotatedStatement = 34, RULE_statementExpression = 35, RULE_annotation = 36, 
		RULE_type = 37, RULE_genericTypeParams = 38, RULE_dimensions = 39, RULE_expression = 40, 
		RULE_assignmentOperator = 41, RULE_multiplicativeOp = 42, RULE_additiveOp = 43, 
		RULE_relationalOp = 44, RULE_shiftOp = 45, RULE_equalityOp = 46, RULE_unaryExpression = 47, 
		RULE_extendableExpression = 48, RULE_coreExpression = 49, RULE_rebecInstantiationExpression = 50, 
		RULE_castExpression = 51, RULE_primary = 52, RULE_expressionList = 53, 
		RULE_annotatedExpression = 54, RULE_literal = 55;
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
			"block", "statement", "forInit", "switchBlock", "caseSwitchGroup", "defaultSwitchGroup", 
			"annotatedStatement", "statementExpression", "annotation", "type", "genericTypeParams", 
			"dimensions", "expression", "assignmentOperator", "multiplicativeOp", 
			"additiveOp", "relationalOp", "shiftOp", "equalityOp", "unaryExpression", 
			"extendableExpression", "coreExpression", "rebecInstantiationExpression", 
			"castExpression", "primary", "expressionList", "annotatedExpression", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'break'", "'case'", 
			"'class'", "'continue'", "'default'", "'else'", "'for'", "'goto'", "'if'", 
			"'import'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
			"'record'", "'return'", "'switch'", "'while'", "'env'", "'featurevar'", 
			"'instanceof'", "'reactiveclass'", "'interface'", "'abstract'", "'extends'", 
			"'implements'", "'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", 
			"'this'", "'true'", "'false'", "'null'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'&&'", "'||'", "'++'", "'--'", "'super'", "'+'", "'-'", "'*'", 
			"'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'~='", "'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", 
			"'<<='", "'>>'", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", 
			"WS", "COMMENT", "LINE_COMMENT", "BREAK", "CASE", "CLASS", "CONTINUE", 
			"DEFAULT", "ELSE", "FOR", "GOTO", "IF", "IMPORT", "NEW", "PACKAGE", "PRIVATE", 
			"PROTECTED", "PUBLIC", "RECORD", "RETURN", "SWITCH", "WHILE", "ENV", 
			"FEATUREVAR", "INSTANCEOF", "REACTIVECLASS", "INTERFACE", "ABSTRACT", 
			"EXTENDS", "IMPLEMENTS", "MSGSRV", "MAIN", "STATEVARS", "KNOWNREBECS", 
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(112);
				packageDeclaration();
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(115);
				importDeclaration();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
			setState(123);
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
			setState(125);
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(127);
				recordDeclaration();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(133);
					match(ENV);
					setState(134);
					fieldDeclaration();
					setState(135);
					match(SEMI);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(137);
					match(FEATUREVAR);
					setState(138);
					match(IDENTIFIER);
					setState(139);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(145);
					reactiveClassDeclaration();
					}
					break;
				case 2:
					{
					setState(146);
					interfaceDeclaration();
					}
					break;
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (REACTIVECLASS - 31)) | (1L << (INTERFACE - 31)) | (1L << (ABSTRACT - 31)) | (1L << (MONKEYS_AT - 31)))) != 0) );
			setState(151);
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
			setState(153);
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
			setState(155);
			match(MAIN);
			setState(156);
			match(LBRACE);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(157);
				mainRebecDefinition();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(165);
				annotation();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			type();
			setState(172);
			match(IDENTIFIER);
			setState(173);
			match(LPAREN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(174);
				bindingsExpressionList();
				}
			}

			setState(177);
			match(RPAREN);
			setState(178);
			match(COLON);
			setState(179);
			match(LPAREN);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(180);
				argumentsExpressionList();
				}
			}

			setState(183);
			match(RPAREN);
			setState(184);
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
			setState(186);
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
			setState(188);
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
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(190);
				annotation();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			type();
			setState(197);
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
			setState(199);
			variableDeclarator();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				variableDeclarator();
				}
				}
				setState(206);
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
			setState(207);
			match(IDENTIFIER);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(208);
				match(EQ);
				setState(209);
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				arrayInitializer();
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
				setState(213);
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
			setState(216);
			match(LBRACE);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(217);
				variableInitializer();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218);
					match(COMMA);
					setState(219);
					variableInitializer();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(227);
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
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(229);
				annotation();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(INTERFACE);
			setState(236);
			match(IDENTIFIER);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(237);
				extendingInterface();
				}
			}

			setState(240);
			match(LBRACE);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==MONKEYS_AT) {
				{
				{
				setState(241);
				msgsrvSignature();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
			setState(249);
			match(EXTENDS);
			setState(250);
			match(IDENTIFIER);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				match(IDENTIFIER);
				}
				}
				setState(257);
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
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(258);
				annotation();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(MSGSRV);
			setState(265);
			match(IDENTIFIER);
			setState(266);
			formalParameters();
			setState(267);
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
		public TerminalNode INTLITERAL() { return getToken(CoreRebecaCompleteParser.INTLITERAL, 0); }
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
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(269);
				annotation();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(275);
				match(ABSTRACT);
				}
			}

			setState(278);
			match(REACTIVECLASS);
			setState(279);
			match(IDENTIFIER);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(280);
				match(EXTENDS);
				setState(281);
				match(IDENTIFIER);
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(284);
				implementingInterface();
				}
			}

			setState(287);
			match(LPAREN);
			setState(288);
			match(INTLITERAL);
			setState(289);
			match(RPAREN);
			setState(290);
			match(LBRACE);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (ABSTRACT - 33)) | (1L << (MSGSRV - 33)) | (1L << (STATEVARS - 33)) | (1L << (KNOWNREBECS - 33)) | (1L << (MONKEYS_AT - 33)) | (1L << (IDENTIFIER - 33)))) != 0)) {
				{
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(291);
					knownRebecsDeclaration();
					}
					break;
				case 2:
					{
					setState(292);
					stateVarsDeclaration();
					}
					break;
				case 3:
					{
					setState(293);
					constructorDeclaration();
					}
					break;
				case 4:
					{
					setState(294);
					msgsrvDeclaration();
					}
					break;
				case 5:
					{
					setState(295);
					synchMethodDeclaration();
					}
					break;
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
			setState(303);
			match(IMPLEMENTS);
			setState(304);
			match(IDENTIFIER);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305);
				match(COMMA);
				setState(306);
				match(IDENTIFIER);
				}
				}
				setState(311);
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
			setState(312);
			match(KNOWNREBECS);
			setState(313);
			match(LBRACE);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(314);
				fieldDeclaration();
				setState(315);
				match(SEMI);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
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
			setState(324);
			match(STATEVARS);
			setState(325);
			match(LBRACE);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(326);
				fieldDeclaration();
				setState(327);
				match(SEMI);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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
			setState(336);
			match(IDENTIFIER);
			setState(337);
			formalParameters();
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(338);
				block();
				}
				break;
			case SEMI:
				{
				setState(339);
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
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(342);
				annotation();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(350);
				annotation();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(356);
				match(ABSTRACT);
				}
			}

			setState(359);
			match(MSGSRV);
			setState(360);
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
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(362);
				annotation();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(368);
				match(ABSTRACT);
				}
			}

			setState(371);
			type();
			setState(372);
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
			setState(374);
			match(LPAREN);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(375);
				formalParametersDeclaration();
				}
			}

			setState(378);
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
			setState(380);
			formalParameterDeclaration();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				formalParameterDeclaration();
				}
				}
				setState(387);
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
			setState(388);
			type();
			setState(389);
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
			setState(391);
			match(LBRACE);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(392);
				annotatedStatement();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
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
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
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
		public TerminalNode IF() { return getToken(CoreRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CoreRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(CoreRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(CoreRebecaCompleteParser.CONTINUE, 0); }
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
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(402);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(406);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(413);
				match(LPAREN);
				setState(414);
				((StatementContext)_localctx).e = expression(0);
				setState(415);
				match(RPAREN);
				setState(416);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(418);
					match(ELSE);
					setState(419);
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
				setState(424);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(426);
				match(LPAREN);
				setState(427);
				((StatementContext)_localctx).e = expression(0);
				setState(428);
				match(RPAREN);
				setState(429);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(434);
				match(LPAREN);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(435);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(440);
				match(SEMI);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(441);
					((StatementContext)_localctx).e = expression(0);
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(446);
				match(SEMI);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(447);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(452);
				match(RPAREN);
				setState(453);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(456);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(457);
				match(LPAREN);
				setState(458);
				((StatementContext)_localctx).e = expression(0);
				setState(459);
				match(RPAREN);
				setState(460);
				match(LBRACE);
				setState(461);
				((StatementContext)_localctx).sb = switchBlock();
				setState(462);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				((StatementContext)_localctx).RETURN = match(RETURN);
				((StatementContext)_localctx).s =  new ReturnStatement();
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(467);
					((StatementContext)_localctx).e = expression(0);
					((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e);
					}
				}

				setState(472);
				match(SEMI);
				_localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());
				    	 _localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(474);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(475);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(477);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(478);
				match(SEMI);
				((StatementContext)_localctx).s =  new ContinueStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(480);
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
		enterRule(_localctx, 60, RULE_forInit);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
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
		enterRule(_localctx, 62, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(488);
					annotation();
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494);
				caseSwitchGroup();
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==MONKEYS_AT );
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(499);
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
		enterRule(_localctx, 64, RULE_caseSwitchGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(CASE);
			setState(503);
			expression(0);
			setState(504);
			match(COLON);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(505);
					annotatedStatement();
					}
					} 
				}
				setState(510);
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
		enterRule(_localctx, 66, RULE_defaultSwitchGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(DEFAULT);
			setState(512);
			match(COLON);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(513);
				annotatedStatement();
				}
				}
				setState(518);
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
		enterRule(_localctx, 68, RULE_annotatedStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					annotation();
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(525);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
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
		enterRule(_localctx, 72, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(MONKEYS_AT);
			setState(531);
			match(IDENTIFIER);
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(532);
				match(LPAREN);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(533);
					expression(0);
					}
				}

				setState(536);
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
		enterRule(_localctx, 74, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(IDENTIFIER);
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(540);
				genericTypeParams();
				}
				break;
			}
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(543);
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
		enterRule(_localctx, 76, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(LT);
			setState(547);
			type();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(548);
				match(COMMA);
				setState(549);
				type();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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
		public List<TerminalNode> INTLITERAL() { return getTokens(CoreRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(CoreRebecaCompleteParser.INTLITERAL, i);
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
		enterRule(_localctx, 78, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(557);
					match(LBRACKET);
					setState(558);
					match(INTLITERAL);
					setState(559);
					match(RBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(562); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression e;
		public ExtendableExpressionContext extendableExpression() {
			return getRuleContext(ExtendableExpressionContext.class,0);
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
		public TerminalNode AMP() { return getToken(CoreRebecaCompleteParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(CoreRebecaCompleteParser.CARET, 0); }
		public TerminalNode BAR() { return getToken(CoreRebecaCompleteParser.BAR, 0); }
		public TerminalNode AMPAMP() { return getToken(CoreRebecaCompleteParser.AMPAMP, 0); }
		public TerminalNode BARBAR() { return getToken(CoreRebecaCompleteParser.BARBAR, 0); }
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(CoreRebecaCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(565);
				extendableExpression();
				}
				break;
			case 2:
				{
				setState(566);
				unaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(617);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(569);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(570);
						multiplicativeOp();
						setState(571);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(574);
						additiveOp();
						setState(575);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(577);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(578);
						shiftOp();
						setState(579);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(581);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(582);
						relationalOp();
						setState(583);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(586);
						equalityOp();
						setState(587);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(589);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(590);
						match(AMP);
						setState(591);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(592);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(593);
						match(CARET);
						setState(594);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(595);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(596);
						match(BAR);
						setState(597);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(598);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(599);
						match(AMPAMP);
						setState(600);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(601);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(602);
						match(BARBAR);
						setState(603);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(604);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(605);
						match(QUES);
						setState(606);
						expression(0);
						setState(607);
						match(COLON);
						setState(608);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(610);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(611);
						assignmentOperator();
						setState(612);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(615);
						match(INSTANCEOF);
						setState(616);
						type();
						}
						break;
					}
					} 
				}
				setState(621);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public String ao;
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(CoreRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(CoreRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(CoreRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(CoreRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(CoreRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(CoreRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(CoreRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(CoreRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(CoreRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(CoreRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(CoreRebecaCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (EQ - 53)) | (1L << (PLUSEQ - 53)) | (1L << (SUBEQ - 53)) | (1L << (STAREQ - 53)) | (1L << (SLASHEQ - 53)) | (1L << (AMPEQ - 53)) | (1L << (BAREQ - 53)) | (1L << (CARETEQ - 53)) | (1L << (TILDAEQ - 53)) | (1L << (PERCENTEQ - 53)) | (1L << (LTLTEQ - 53)) | (1L << (GTGTEQ - 53)))) != 0)) ) {
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

	public static class MultiplicativeOpContext extends ParserRuleContext {
		public String mo;
		public TerminalNode STAR() { return getToken(CoreRebecaCompleteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CoreRebecaCompleteParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(CoreRebecaCompleteParser.PERCENT, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMultiplicativeOp(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STAR - 66)) | (1L << (SLASH - 66)) | (1L << (PERCENT - 66)))) != 0)) ) {
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

	public static class AdditiveOpContext extends ParserRuleContext {
		public String ado;
		public TerminalNode PLUS() { return getToken(CoreRebecaCompleteParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(CoreRebecaCompleteParser.SUB, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAdditiveOp(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==SUB) ) {
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

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public TerminalNode LT() { return getToken(CoreRebecaCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaCompleteParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relationalOp);
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(LT);
				setState(629);
				match(EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(GT);
				setState(631);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(LT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				match(GT);
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
		public List<TerminalNode> LT() { return getTokens(CoreRebecaCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CoreRebecaCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CoreRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CoreRebecaCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_shiftOp);
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(LT);
				setState(637);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(GT);
				setState(639);
				match(GT);
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
		public TerminalNode EQEQ() { return getToken(CoreRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(CoreRebecaCompleteParser.BANGEQ, 0); }
		public EqualityOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterEqualityOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitEqualityOp(this);
		}
	}

	public final EqualityOpContext equalityOp() throws RecognitionException {
		EqualityOpContext _localctx = new EqualityOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_equalityOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !(_la==EQEQ || _la==BANGEQ) ) {
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression e;
		public TerminalNode PLUS() { return getToken(CoreRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CoreRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(CoreRebecaCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(CoreRebecaCompleteParser.BANG, 0); }
		public ExtendableExpressionContext extendableExpression() {
			return getRuleContext(ExtendableExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unaryExpression);
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				match(PLUS);
				setState(645);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(SUB);
				setState(647);
				unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				match(PLUSPLUS);
				setState(649);
				unaryExpression();
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				match(SUBSUB);
				setState(651);
				unaryExpression();
				}
				break;
			case TILDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				match(TILDA);
				setState(653);
				unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(654);
				match(BANG);
				setState(655);
				unaryExpression();
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
				setState(656);
				extendableExpression();
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

	public static class ExtendableExpressionContext extends ParserRuleContext {
		public Expression e;
		public CoreExpressionContext coreExpression() {
			return getRuleContext(CoreExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CoreRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CoreRebecaCompleteParser.DOT, i);
		}
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
		public ExtendableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExtendableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExtendableExpression(this);
		}
	}

	public final ExtendableExpressionContext extendableExpression() throws RecognitionException {
		ExtendableExpressionContext _localctx = new ExtendableExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_extendableExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			coreExpression();
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(660);
					match(DOT);
					setState(661);
					primary();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(667);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==SUBSUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class CoreExpressionContext extends ParserRuleContext {
		public Expression e;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public RebecInstantiationExpressionContext rebecInstantiationExpression() {
			return getRuleContext(RebecInstantiationExpressionContext.class,0);
		}
		public CoreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterCoreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitCoreExpression(this);
		}
	}

	public final CoreExpressionContext coreExpression() throws RecognitionException {
		CoreExpressionContext _localctx = new CoreExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_coreExpression);
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				match(LPAREN);
				setState(672);
				expression(0);
				setState(673);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				match(QUES);
				setState(678);
				match(LPAREN);
				setState(679);
				expressionList();
				setState(680);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(682);
				rebecInstantiationExpression();
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

	public static class RebecInstantiationExpressionContext extends ParserRuleContext {
		public Expression e;
		public TerminalNode NEW() { return getToken(CoreRebecaCompleteParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public RebecInstantiationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecInstantiationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRebecInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRebecInstantiationExpression(this);
		}
	}

	public final RebecInstantiationExpressionContext rebecInstantiationExpression() throws RecognitionException {
		RebecInstantiationExpressionContext _localctx = new RebecInstantiationExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_rebecInstantiationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(NEW);
			setState(686);
			type();
			setState(687);
			match(LPAREN);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(688);
				expressionList();
				}
			}

			setState(691);
			match(RPAREN);
			setState(692);
			match(COLON);
			setState(693);
			match(LPAREN);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(694);
				expressionList();
				}
			}

			setState(697);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public Expression e;
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(LPAREN);
			setState(700);
			type();
			setState(701);
			match(RPAREN);
			setState(702);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 104, RULE_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(IDENTIFIER);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(705);
				match(LPAREN);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(706);
					expressionList();
					}
				}

				setState(709);
				match(RPAREN);
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712);
					match(LBRACKET);
					setState(713);
					expression(0);
					setState(714);
					match(RBRACKET);
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 106, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			annotatedExpression();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(722);
				match(COMMA);
				setState(723);
				annotatedExpression();
				}
				}
				setState(728);
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
		enterRule(_localctx, 108, RULE_annotatedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(729);
				annotation();
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(735);
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

	public static class LiteralContext extends ParserRuleContext {
		public Literal l;
		public TerminalNode INTLITERAL() { return getToken(CoreRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(CoreRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(CoreRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(CoreRebecaCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(CoreRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CoreRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoreRebecaCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(CoreRebecaCompleteParser.NULL, 0); }
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
		enterRule(_localctx, 110, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u02e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\5\2t\n\2\3\2\7\2w\n"+
		"\2\f\2\16\2z\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\7\5\u0083\n\5\f\5\16\5\u0086"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13\5\3"+
		"\5\3\5\6\5\u0096\n\5\r\5\16\5\u0097\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\u00a1"+
		"\n\7\f\7\16\7\u00a4\13\7\3\7\3\7\3\b\7\b\u00a9\n\b\f\b\16\b\u00ac\13\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\b\3\b\3\b\3\b\5\b\u00b8\n\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\7\13\u00c2\n\13\f\13\16\13\u00c5\13\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3\r\3\r\3\r\5\r"+
		"\u00d5\n\r\3\16\3\16\5\16\u00d9\n\16\3\17\3\17\3\17\3\17\7\17\u00df\n"+
		"\17\f\17\16\17\u00e2\13\17\5\17\u00e4\n\17\3\17\3\17\3\20\7\20\u00e9\n"+
		"\20\f\20\16\20\u00ec\13\20\3\20\3\20\3\20\5\20\u00f1\n\20\3\20\3\20\7"+
		"\20\u00f5\n\20\f\20\16\20\u00f8\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7"+
		"\21\u0100\n\21\f\21\16\21\u0103\13\21\3\22\7\22\u0106\n\22\f\22\16\22"+
		"\u0109\13\22\3\22\3\22\3\22\3\22\3\22\3\23\7\23\u0111\n\23\f\23\16\23"+
		"\u0114\13\23\3\23\5\23\u0117\n\23\3\23\3\23\3\23\3\23\5\23\u011d\n\23"+
		"\3\23\5\23\u0120\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u012b\n\23\f\23\16\23\u012e\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24"+
		"\u0136\n\24\f\24\16\24\u0139\13\24\3\25\3\25\3\25\3\25\3\25\7\25\u0140"+
		"\n\25\f\25\16\25\u0143\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u014c"+
		"\n\26\f\26\16\26\u014f\13\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0157"+
		"\n\27\3\30\7\30\u015a\n\30\f\30\16\30\u015d\13\30\3\30\3\30\3\31\7\31"+
		"\u0162\n\31\f\31\16\31\u0165\13\31\3\31\5\31\u0168\n\31\3\31\3\31\3\31"+
		"\3\32\7\32\u016e\n\32\f\32\16\32\u0171\13\32\3\32\5\32\u0174\n\32\3\32"+
		"\3\32\3\32\3\33\3\33\5\33\u017b\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u0182"+
		"\n\34\f\34\16\34\u0185\13\34\3\35\3\35\3\35\3\36\3\36\7\36\u018c\n\36"+
		"\f\36\16\36\u018f\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u01a9\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01b9\n\37\3\37\3\37\3\37\3\37\5\37\u01bf\n"+
		"\37\3\37\3\37\3\37\3\37\5\37\u01c5\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01d9"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e5\n\37"+
		"\3 \3 \5 \u01e9\n \3!\7!\u01ec\n!\f!\16!\u01ef\13!\3!\6!\u01f2\n!\r!\16"+
		"!\u01f3\3!\5!\u01f7\n!\3\"\3\"\3\"\3\"\7\"\u01fd\n\"\f\"\16\"\u0200\13"+
		"\"\3#\3#\3#\7#\u0205\n#\f#\16#\u0208\13#\3$\7$\u020b\n$\f$\16$\u020e\13"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3&\5&\u0219\n&\3&\5&\u021c\n&\3\'\3\'\5\'\u0220"+
		"\n\'\3\'\5\'\u0223\n\'\3(\3(\3(\3(\7(\u0229\n(\f(\16(\u022c\13(\3(\3("+
		"\3)\3)\3)\6)\u0233\n)\r)\16)\u0234\3*\3*\3*\5*\u023a\n*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u026c"+
		"\n*\f*\16*\u026f\13*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\5.\u027d\n.\3"+
		"/\3/\3/\3/\5/\u0283\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u0294\n\61\3\62\3\62\3\62\7\62\u0299"+
		"\n\62\f\62\16\62\u029c\13\62\3\62\5\62\u029f\n\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02ae\n\63\3\64\3\64"+
		"\3\64\3\64\5\64\u02b4\n\64\3\64\3\64\3\64\3\64\5\64\u02ba\n\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u02c6\n\66\3\66\5\66"+
		"\u02c9\n\66\3\66\3\66\3\66\3\66\7\66\u02cf\n\66\f\66\16\66\u02d2\13\66"+
		"\3\67\3\67\3\67\7\67\u02d7\n\67\f\67\16\67\u02da\13\67\38\78\u02dd\n8"+
		"\f8\168\u02e0\138\38\38\39\39\39\2\3R:\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\b\6\2\67\67"+
		"JRXXZZ\4\2DEII\3\2BC\4\2<<TT\3\2?@\4\2\3\7+-\2\u031a\2s\3\2\2\2\4}\3\2"+
		"\2\2\6\177\3\2\2\2\b\u0084\3\2\2\2\n\u009b\3\2\2\2\f\u009d\3\2\2\2\16"+
		"\u00aa\3\2\2\2\20\u00bc\3\2\2\2\22\u00be\3\2\2\2\24\u00c3\3\2\2\2\26\u00c9"+
		"\3\2\2\2\30\u00d1\3\2\2\2\32\u00d8\3\2\2\2\34\u00da\3\2\2\2\36\u00ea\3"+
		"\2\2\2 \u00fb\3\2\2\2\"\u0107\3\2\2\2$\u0112\3\2\2\2&\u0131\3\2\2\2(\u013a"+
		"\3\2\2\2*\u0146\3\2\2\2,\u0152\3\2\2\2.\u015b\3\2\2\2\60\u0163\3\2\2\2"+
		"\62\u016f\3\2\2\2\64\u0178\3\2\2\2\66\u017e\3\2\2\28\u0186\3\2\2\2:\u0189"+
		"\3\2\2\2<\u01e4\3\2\2\2>\u01e8\3\2\2\2@\u01f1\3\2\2\2B\u01f8\3\2\2\2D"+
		"\u0201\3\2\2\2F\u020c\3\2\2\2H\u0211\3\2\2\2J\u0214\3\2\2\2L\u021d\3\2"+
		"\2\2N\u0224\3\2\2\2P\u0232\3\2\2\2R\u0239\3\2\2\2T\u0270\3\2\2\2V\u0272"+
		"\3\2\2\2X\u0274\3\2\2\2Z\u027c\3\2\2\2\\\u0282\3\2\2\2^\u0284\3\2\2\2"+
		"`\u0293\3\2\2\2b\u0295\3\2\2\2d\u02ad\3\2\2\2f\u02af\3\2\2\2h\u02bd\3"+
		"\2\2\2j\u02c2\3\2\2\2l\u02d3\3\2\2\2n\u02de\3\2\2\2p\u02e3\3\2\2\2rt\5"+
		"\4\3\2sr\3\2\2\2st\3\2\2\2tx\3\2\2\2uw\5\6\4\2vu\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\5\b\5\2|\3\3\2\2\2}~\7\26\2\2~"+
		"\5\3\2\2\2\177\u0080\7\24\2\2\u0080\7\3\2\2\2\u0081\u0083\5\n\6\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0090\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\36\2\2\u0088"+
		"\u0089\5\24\13\2\u0089\u008a\7\64\2\2\u008a\u008f\3\2\2\2\u008b\u008c"+
		"\7\37\2\2\u008c\u008d\7[\2\2\u008d\u008f\7\64\2\2\u008e\u0087\3\2\2\2"+
		"\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0095\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096\5$\23\2\u0094"+
		"\u0096\5\36\20\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\5\f\7\2\u009a\t\3\2\2\2\u009b\u009c\7\32\2\2\u009c\13\3\2\2\2\u009d"+
		"\u009e\7\'\2\2\u009e\u00a2\7\60\2\2\u009f\u00a1\5\16\b\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\r\3\2\2"+
		"\2\u00a7\u00a9\5J&\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\5L\'\2\u00ae\u00af\7[\2\2\u00af\u00b1\7.\2\2\u00b0\u00b2\5\20\t"+
		"\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\7/\2\2\u00b4\u00b5\7;\2\2\u00b5\u00b7\7.\2\2\u00b6\u00b8\5\22\n\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7/"+
		"\2\2\u00ba\u00bb\7\64\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\5l\67\2\u00bd\21"+
		"\3\2\2\2\u00be\u00bf\5l\67\2\u00bf\23\3\2\2\2\u00c0\u00c2\5J&\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5L\'\2\u00c7"+
		"\u00c8\5\26\f\2\u00c8\25\3\2\2\2\u00c9\u00ce\5\30\r\2\u00ca\u00cb\7\65"+
		"\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d4\7[\2\2\u00d2\u00d3\7\67\2\2\u00d3\u00d5\5\32\16\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d9\5\34\17"+
		"\2\u00d7\u00d9\5R*\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\33"+
		"\3\2\2\2\u00da\u00e3\7\60\2\2\u00db\u00e0\5\32\16\2\u00dc\u00dd\7\65\2"+
		"\2\u00dd\u00df\5\32\16\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00db\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7\61\2\2\u00e6\35\3\2\2\2\u00e7\u00e9\5J&\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00f0\7[\2\2\u00ef"+
		"\u00f1\5 \21\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f6\7\60\2\2\u00f3\u00f5\5\"\22\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\37\3\2\2\2\u00fb\u00fc"+
		"\7$\2\2\u00fc\u0101\7[\2\2\u00fd\u00fe\7\65\2\2\u00fe\u0100\7[\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102!\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5J&\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7&\2\2\u010b\u010c\7[\2"+
		"\2\u010c\u010d\5\64\33\2\u010d\u010e\7\64\2\2\u010e#\3\2\2\2\u010f\u0111"+
		"\5J&\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7#"+
		"\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\7!\2\2\u0119\u011c\7[\2\2\u011a\u011b\7$\2\2\u011b\u011d\7[\2\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120"+
		"\5&\24\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7.\2\2\u0122\u0123\7\3\2\2\u0123\u0124\7/\2\2\u0124\u012c\7\60"+
		"\2\2\u0125\u012b\5(\25\2\u0126\u012b\5*\26\2\u0127\u012b\5.\30\2\u0128"+
		"\u012b\5\60\31\2\u0129\u012b\5\62\32\2\u012a\u0125\3\2\2\2\u012a\u0126"+
		"\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\61\2\2\u0130%\3\2\2\2\u0131\u0132"+
		"\7%\2\2\u0132\u0137\7[\2\2\u0133\u0134\7\65\2\2\u0134\u0136\7[\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\'\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7)\2\2\u013b\u0141"+
		"\7\60\2\2\u013c\u013d\5\24\13\2\u013d\u013e\7\64\2\2\u013e\u0140\3\2\2"+
		"\2\u013f\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\61\2\2"+
		"\u0145)\3\2\2\2\u0146\u0147\7(\2\2\u0147\u014d\7\60\2\2\u0148\u0149\5"+
		"\24\13\2\u0149\u014a\7\64\2\2\u014a\u014c\3\2\2\2\u014b\u0148\3\2\2\2"+
		"\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\61\2\2\u0151+\3\2\2\2\u0152"+
		"\u0153\7[\2\2\u0153\u0156\5\64\33\2\u0154\u0157\5:\36\2\u0155\u0157\7"+
		"\64\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157-\3\2\2\2\u0158\u015a"+
		"\5J&\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\5,"+
		"\27\2\u015f/\3\2\2\2\u0160\u0162\5J&\2\u0161\u0160\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0168\7#\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7&\2\2\u016a\u016b\5,\27\2\u016b"+
		"\61\3\2\2\2\u016c\u016e\5J&\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0174\7#\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\5L\'\2\u0176\u0177\5,\27\2\u0177\63\3\2\2\2"+
		"\u0178\u017a\7.\2\2\u0179\u017b\5\66\34\2\u017a\u0179\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7/\2\2\u017d\65\3\2\2\2\u017e"+
		"\u0183\58\35\2\u017f\u0180\7\65\2\2\u0180\u0182\58\35\2\u0181\u017f\3"+
		"\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\67\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5L\'\2\u0187\u0188\7[\2\2"+
		"\u01889\3\2\2\2\u0189\u018d\7\60\2\2\u018a\u018c\5F$\2\u018b\u018a\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\61\2\2\u0191;\3\2\2\2"+
		"\u0192\u0193\5H%\2\u0193\u0194\b\37\1\2\u0194\u0195\7\64\2\2\u0195\u01e5"+
		"\3\2\2\2\u0196\u0197\5\24\13\2\u0197\u0198\b\37\1\2\u0198\u0199\7\64\2"+
		"\2\u0199\u01e5\3\2\2\2\u019a\u019b\5:\36\2\u019b\u019c\b\37\1\2\u019c"+
		"\u01e5\3\2\2\2\u019d\u019e\7\23\2\2\u019e\u019f\b\37\1\2\u019f\u01a0\7"+
		".\2\2\u01a0\u01a1\5R*\2\u01a1\u01a2\7/\2\2\u01a2\u01a3\5<\37\2\u01a3\u01a8"+
		"\b\37\1\2\u01a4\u01a5\7\20\2\2\u01a5\u01a6\5<\37\2\u01a6\u01a7\b\37\1"+
		"\2\u01a7\u01a9\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01e5"+
		"\3\2\2\2\u01aa\u01ab\7\35\2\2\u01ab\u01ac\b\37\1\2\u01ac\u01ad\7.\2\2"+
		"\u01ad\u01ae\5R*\2\u01ae\u01af\7/\2\2\u01af\u01b0\5<\37\2\u01b0\u01b1"+
		"\b\37\1\2\u01b1\u01e5\3\2\2\2\u01b2\u01b3\7\21\2\2\u01b3\u01b4\b\37\1"+
		"\2\u01b4\u01b8\7.\2\2\u01b5\u01b6\5> \2\u01b6\u01b7\b\37\1\2\u01b7\u01b9"+
		"\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01be\7\64\2\2\u01bb\u01bc\5R*\2\u01bc\u01bd\b\37\1\2\u01bd\u01bf\3\2"+
		"\2\2\u01be\u01bb\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c4\7\64\2\2\u01c1\u01c2\5l\67\2\u01c2\u01c3\b\37\1\2\u01c3\u01c5\3"+
		"\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\7/\2\2\u01c7\u01c8\5<\37\2\u01c8\u01c9\b\37\1\2\u01c9\u01e5\3\2"+
		"\2\2\u01ca\u01cb\7\34\2\2\u01cb\u01cc\7.\2\2\u01cc\u01cd\5R*\2\u01cd\u01ce"+
		"\7/\2\2\u01ce\u01cf\7\60\2\2\u01cf\u01d0\5@!\2\u01d0\u01d1\7\61\2\2\u01d1"+
		"\u01d2\b\37\1\2\u01d2\u01e5\3\2\2\2\u01d3\u01d4\7\33\2\2\u01d4\u01d8\b"+
		"\37\1\2\u01d5\u01d6\5R*\2\u01d6\u01d7\b\37\1\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01d5\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\64"+
		"\2\2\u01db\u01e5\b\37\1\2\u01dc\u01dd\7\13\2\2\u01dd\u01de\7\64\2\2\u01de"+
		"\u01e5\b\37\1\2\u01df\u01e0\7\16\2\2\u01e0\u01e1\7\64\2\2\u01e1\u01e5"+
		"\b\37\1\2\u01e2\u01e3\7\64\2\2\u01e3\u01e5\b\37\1\2\u01e4\u0192\3\2\2"+
		"\2\u01e4\u0196\3\2\2\2\u01e4\u019a\3\2\2\2\u01e4\u019d\3\2\2\2\u01e4\u01aa"+
		"\3\2\2\2\u01e4\u01b2\3\2\2\2\u01e4\u01ca\3\2\2\2\u01e4\u01d3\3\2\2\2\u01e4"+
		"\u01dc\3\2\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5=\3\2\2\2"+
		"\u01e6\u01e9\5\24\13\2\u01e7\u01e9\5l\67\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9?\3\2\2\2\u01ea\u01ec\5J&\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f2\5B\"\2\u01f1\u01ed\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5"+
		"\u01f7\5D#\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7A\3\2\2\2\u01f8"+
		"\u01f9\7\f\2\2\u01f9\u01fa\5R*\2\u01fa\u01fe\7;\2\2\u01fb\u01fd\5F$\2"+
		"\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ffC\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\17\2\2\u0202"+
		"\u0206\7;\2\2\u0203\u0205\5F$\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2"+
		"\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207E\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0209\u020b\5J&\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020f\u0210\5<\37\2\u0210G\3\2\2\2\u0211\u0212\5R*\2\u0212\u0213"+
		"\b%\1\2\u0213I\3\2\2\2\u0214\u0215\7S\2\2\u0215\u021b\7[\2\2\u0216\u0218"+
		"\7.\2\2\u0217\u0219\5R*\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021c\7/\2\2\u021b\u0216\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021cK\3\2\2\2\u021d\u021f\7[\2\2\u021e\u0220\5N(\2\u021f\u021e\3"+
		"\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u0223\5P)\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223M\3\2\2\2\u0224\u0225\7V\2\2\u0225"+
		"\u022a\5L\'\2\u0226\u0227\7\65\2\2\u0227\u0229\5L\'\2\u0228\u0226\3\2"+
		"\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7U\2\2\u022eO\3\2\2\2\u022f"+
		"\u0230\7\62\2\2\u0230\u0231\7\3\2\2\u0231\u0233\7\63\2\2\u0232\u022f\3"+
		"\2\2\2\u0233\u0234\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"Q\3\2\2\2\u0236\u0237\b*\1\2\u0237\u023a\5b\62\2\u0238\u023a\5`\61\2\u0239"+
		"\u0236\3\2\2\2\u0239\u0238\3\2\2\2\u023a\u026d\3\2\2\2\u023b\u023c\f\17"+
		"\2\2\u023c\u023d\5V,\2\u023d\u023e\5R*\20\u023e\u026c\3\2\2\2\u023f\u0240"+
		"\f\16\2\2\u0240\u0241\5X-\2\u0241\u0242\5R*\17\u0242\u026c\3\2\2\2\u0243"+
		"\u0244\f\r\2\2\u0244\u0245\5\\/\2\u0245\u0246\5R*\16\u0246\u026c\3\2\2"+
		"\2\u0247\u0248\f\f\2\2\u0248\u0249\5Z.\2\u0249\u024a\5R*\r\u024a\u026c"+
		"\3\2\2\2\u024b\u024c\f\n\2\2\u024c\u024d\5^\60\2\u024d\u024e\5R*\13\u024e"+
		"\u026c\3\2\2\2\u024f\u0250\f\t\2\2\u0250\u0251\7F\2\2\u0251\u026c\5R*"+
		"\n\u0252\u0253\f\b\2\2\u0253\u0254\7H\2\2\u0254\u026c\5R*\t\u0255\u0256"+
		"\f\7\2\2\u0256\u0257\7G\2\2\u0257\u026c\5R*\b\u0258\u0259\f\6\2\2\u0259"+
		"\u025a\7=\2\2\u025a\u026c\5R*\7\u025b\u025c\f\5\2\2\u025c\u025d\7>\2\2"+
		"\u025d\u026c\5R*\6\u025e\u025f\f\4\2\2\u025f\u0260\7:\2\2\u0260\u0261"+
		"\5R*\2\u0261\u0262\7;\2\2\u0262\u0263\5R*\5\u0263\u026c\3\2\2\2\u0264"+
		"\u0265\f\3\2\2\u0265\u0266\5T+\2\u0266\u0267\5R*\4\u0267\u026c\3\2\2\2"+
		"\u0268\u0269\f\13\2\2\u0269\u026a\7 \2\2\u026a\u026c\5L\'\2\u026b\u023b"+
		"\3\2\2\2\u026b\u023f\3\2\2\2\u026b\u0243\3\2\2\2\u026b\u0247\3\2\2\2\u026b"+
		"\u024b\3\2\2\2\u026b\u024f\3\2\2\2\u026b\u0252\3\2\2\2\u026b\u0255\3\2"+
		"\2\2\u026b\u0258\3\2\2\2\u026b\u025b\3\2\2\2\u026b\u025e\3\2\2\2\u026b"+
		"\u0264\3\2\2\2\u026b\u0268\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026d\u026e\3\2\2\2\u026eS\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271"+
		"\t\2\2\2\u0271U\3\2\2\2\u0272\u0273\t\3\2\2\u0273W\3\2\2\2\u0274\u0275"+
		"\t\4\2\2\u0275Y\3\2\2\2\u0276\u0277\7V\2\2\u0277\u027d\7\67\2\2\u0278"+
		"\u0279\7U\2\2\u0279\u027d\7\67\2\2\u027a\u027d\7V\2\2\u027b\u027d\7U\2"+
		"\2\u027c\u0276\3\2\2\2\u027c\u0278\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b"+
		"\3\2\2\2\u027d[\3\2\2\2\u027e\u027f\7V\2\2\u027f\u0283\7V\2\2\u0280\u0281"+
		"\7U\2\2\u0281\u0283\7U\2\2\u0282\u027e\3\2\2\2\u0282\u0280\3\2\2\2\u0283"+
		"]\3\2\2\2\u0284\u0285\t\5\2\2\u0285_\3\2\2\2\u0286\u0287\7B\2\2\u0287"+
		"\u0294\5`\61\2\u0288\u0289\7C\2\2\u0289\u0294\5`\61\2\u028a\u028b\7?\2"+
		"\2\u028b\u0294\5`\61\2\u028c\u028d\7@\2\2\u028d\u0294\5`\61\2\u028e\u028f"+
		"\79\2\2\u028f\u0294\5`\61\2\u0290\u0291\78\2\2\u0291\u0294\5`\61\2\u0292"+
		"\u0294\5b\62\2\u0293\u0286\3\2\2\2\u0293\u0288\3\2\2\2\u0293\u028a\3\2"+
		"\2\2\u0293\u028c\3\2\2\2\u0293\u028e\3\2\2\2\u0293\u0290\3\2\2\2\u0293"+
		"\u0292\3\2\2\2\u0294a\3\2\2\2\u0295\u029a\5d\63\2\u0296\u0297\7\66\2\2"+
		"\u0297\u0299\5j\66\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298"+
		"\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029d"+
		"\u029f\t\6\2\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029fc\3\2\2\2"+
		"\u02a0\u02ae\5h\65\2\u02a1\u02a2\7.\2\2\u02a2\u02a3\5R*\2\u02a3\u02a4"+
		"\7/\2\2\u02a4\u02ae\3\2\2\2\u02a5\u02ae\5j\66\2\u02a6\u02ae\5p9\2\u02a7"+
		"\u02a8\7:\2\2\u02a8\u02a9\7.\2\2\u02a9\u02aa\5l\67\2\u02aa\u02ab\7/\2"+
		"\2\u02ab\u02ae\3\2\2\2\u02ac\u02ae\5f\64\2\u02ad\u02a0\3\2\2\2\u02ad\u02a1"+
		"\3\2\2\2\u02ad\u02a5\3\2\2\2\u02ad\u02a6\3\2\2\2\u02ad\u02a7\3\2\2\2\u02ad"+
		"\u02ac\3\2\2\2\u02aee\3\2\2\2\u02af\u02b0\7\25\2\2\u02b0\u02b1\5L\'\2"+
		"\u02b1\u02b3\7.\2\2\u02b2\u02b4\5l\67\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7/\2\2\u02b6\u02b7\7;\2\2\u02b7"+
		"\u02b9\7.\2\2\u02b8\u02ba\5l\67\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7/\2\2\u02bcg\3\2\2\2\u02bd\u02be"+
		"\7.\2\2\u02be\u02bf\5L\'\2\u02bf\u02c0\7/\2\2\u02c0\u02c1\5R*\2\u02c1"+
		"i\3\2\2\2\u02c2\u02c8\7[\2\2\u02c3\u02c5\7.\2\2\u02c4\u02c6\5l\67\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\7/"+
		"\2\2\u02c8\u02c3\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02d0\3\2\2\2\u02ca"+
		"\u02cb\7\62\2\2\u02cb\u02cc\5R*\2\u02cc\u02cd\7\63\2\2\u02cd\u02cf\3\2"+
		"\2\2\u02ce\u02ca\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1k\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d8\5n8\2\u02d4"+
		"\u02d5\7\65\2\2\u02d5\u02d7\5n8\2\u02d6\u02d4\3\2\2\2\u02d7\u02da\3\2"+
		"\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9m\3\2\2\2\u02da\u02d8"+
		"\3\2\2\2\u02db\u02dd\5J&\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2"+
		"\2\2\u02e1\u02e2\5R*\2\u02e2o\3\2\2\2\u02e3\u02e4\t\7\2\2\u02e4q\3\2\2"+
		"\2Msx\u0084\u008e\u0090\u0095\u0097\u00a2\u00aa\u00b1\u00b7\u00c3\u00ce"+
		"\u00d4\u00d8\u00e0\u00e3\u00ea\u00f0\u00f6\u0101\u0107\u0112\u0116\u011c"+
		"\u011f\u012a\u012c\u0137\u0141\u014d\u0156\u015b\u0163\u0167\u016f\u0173"+
		"\u017a\u0183\u018d\u01a8\u01b8\u01be\u01c4\u01d8\u01e4\u01e8\u01ed\u01f3"+
		"\u01f6\u01fe\u0206\u020c\u0218\u021b\u021f\u0222\u022a\u0234\u0239\u026b"+
		"\u026d\u027c\u0282\u0293\u029a\u029e\u02ad\u02b3\u02b9\u02c5\u02c8\u02d0"+
		"\u02d8\u02de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}