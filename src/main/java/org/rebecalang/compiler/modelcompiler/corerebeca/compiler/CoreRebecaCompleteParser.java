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
		RULE_mainRebecDefinition = 6, RULE_fieldDeclaration = 7, RULE_variableDeclarators = 8, 
		RULE_variableDeclarator = 9, RULE_variableInitializer = 10, RULE_arrayInitializer = 11, 
		RULE_interfaceDeclaration = 12, RULE_reactiveClassDeclaration = 13, RULE_methodDeclaration = 14, 
		RULE_constructorDeclaration = 15, RULE_msgsrvDeclaration = 16, RULE_synchMethodDeclaration = 17, 
		RULE_formalParameters = 18, RULE_formalParametersDeclaration = 19, RULE_formalParameterDeclaration = 20, 
		RULE_block = 21, RULE_statement = 22, RULE_forInit = 23, RULE_switchBlock = 24, 
		RULE_statementExpression = 25, RULE_annotation = 26, RULE_type = 27, RULE_genericTypeParams = 28, 
		RULE_dimensions = 29, RULE_expression = 30, RULE_assignmentOperator = 31, 
		RULE_multiplicativeOp = 32, RULE_additiveOp = 33, RULE_relationalOp = 34, 
		RULE_shiftOp = 35, RULE_equalityOp = 36, RULE_unaryExpression = 37, RULE_coreExpression = 38, 
		RULE_castExpression = 39, RULE_primary = 40, RULE_expressionList = 41, 
		RULE_literal = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"rebecaModel", "packageDeclaration", "importDeclaration", "rebecaCode", 
			"recordDeclaration", "mainDeclaration", "mainRebecDefinition", "fieldDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableInitializer", "arrayInitializer", 
			"interfaceDeclaration", "reactiveClassDeclaration", "methodDeclaration", 
			"constructorDeclaration", "msgsrvDeclaration", "synchMethodDeclaration", 
			"formalParameters", "formalParametersDeclaration", "formalParameterDeclaration", 
			"block", "statement", "forInit", "switchBlock", "statementExpression", 
			"annotation", "type", "genericTypeParams", "dimensions", "expression", 
			"assignmentOperator", "multiplicativeOp", "additiveOp", "relationalOp", 
			"shiftOp", "equalityOp", "unaryExpression", "coreExpression", "castExpression", 
			"primary", "expressionList", "literal"
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
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(87);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(92);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(100);
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
			setState(103);
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
			setState(105);
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
		public RecordDeclarationContext rd;
		public FieldDeclarationContext fd;
		public Token featureName;
		public ReactiveClassDeclarationContext rcd;
		public InterfaceDeclarationContext intd;
		public MainDeclarationContext md;
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
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public List<TerminalNode> FEATUREVAR() { return getTokens(CoreRebecaCompleteParser.FEATUREVAR); }
		public TerminalNode FEATUREVAR(int i) {
			return getToken(CoreRebecaCompleteParser.FEATUREVAR, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
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
			((RebecaCodeContext)_localctx).rc =  new RebecaCode();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(108);
				((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(116);
					match(ENV);
					setState(117);
					((RebecaCodeContext)_localctx).fd = fieldDeclaration();
					setState(118);
					match(SEMI);
					_localctx.rc.getEnvironmentVariables().add(((RebecaCodeContext)_localctx).fd.fd);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(121);
					match(FEATUREVAR);
					setState(122);
					((RebecaCodeContext)_localctx).featureName = match(IDENTIFIER);
					setState(123);
					match(SEMI);

									VariableDeclarator vd = new VariableDeclarator();
									vd.setVariableName((((RebecaCodeContext)_localctx).featureName!=null?((RebecaCodeContext)_localctx).featureName.getText():null));
									vd.setLineNumber(((RebecaCodeContext)_localctx).featureName.getLine());
									vd.setCharacter(((RebecaCodeContext)_localctx).featureName.getCharPositionInLine());
									FieldDeclaration fd = new FieldDeclaration();
									fd.getVariableDeclarators().add(vd);
									fd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);				
					    			fd.setCharacter(((RebecaCodeContext)_localctx).featureName.getCharPositionInLine());
									fd.setLineNumber(((RebecaCodeContext)_localctx).featureName.getLine());
									_localctx.rc.getFeatureVariables().add(fd);				
									
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(130);
					((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
					_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
					}
					break;
				case 2:
					{
					setState(133);
					((RebecaCodeContext)_localctx).intd = interfaceDeclaration();
					_localctx.rc.getInterfaceDeclaration().add(((RebecaCodeContext)_localctx).intd.intd);
					}
					break;
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (REACTIVECLASS - 31)) | (1L << (INTERFACE - 31)) | (1L << (ABSTRACT - 31)) | (1L << (MONKEYS_AT - 31)))) != 0) );
			setState(140);
			((RebecaCodeContext)_localctx).md = mainDeclaration();
			_localctx.rc.setMainDeclaration(((RebecaCodeContext)_localctx).md.md);
			}
		}
		catch (RecognitionException re) {
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
		public Token MAIN;
		public MainRebecDefinitionContext mrd;
		public Token RBRACE;
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
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(146);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(148);
			match(LBRACE);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(149);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(161);
				((MainRebecDefinitionContext)_localctx).an = annotation();
				_localctx.mrd.getAnnotations().add(((MainRebecDefinitionContext)_localctx).an.an);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(170);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(172);
			match(LPAREN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(173);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(178);
			match(RPAREN);
			setState(179);
			match(COLON);
			setState(180);
			match(LPAREN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(181);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(186);
			match(RPAREN);
			setState(187);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(190);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			((FieldDeclarationContext)_localctx).t = type();
			setState(199);
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
		enterRule(_localctx, 16, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(203);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(213);
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
		enterRule(_localctx, 18, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(215);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(217);
				match(EQ);
				setState(218);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableInitializer);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
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
				setState(226);
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
		enterRule(_localctx, 22, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(232);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(233);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(246);
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
		public TerminalNode INTERFACE() { return getToken(CoreRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(CoreRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> MSGSRV() { return getTokens(CoreRebecaCompleteParser.MSGSRV); }
		public TerminalNode MSGSRV(int i) {
			return getToken(CoreRebecaCompleteParser.MSGSRV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
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
		enterRule(_localctx, 24, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(249);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(INTERFACE);
			setState(258);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(260);
				match(EXTENDS);
				setState(261);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(273);
			match(LBRACE);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==MONKEYS_AT) {
				{
				{
				MethodDeclaration md = new MsgsrvDeclaration();md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(275);
					((InterfaceDeclarationContext)_localctx).an = annotation();
					md.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(MSGSRV);
				setState(284);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(286);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(288);
				match(SEMI);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
		public TerminalNode REACTIVECLASS() { return getToken(CoreRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(CoreRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CoreRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode INTLITERAL() { return getToken(CoreRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(CoreRebecaCompleteParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(CoreRebecaCompleteParser.IMPLEMENTS, 0); }
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
		public List<TerminalNode> KNOWNREBECS() { return getTokens(CoreRebecaCompleteParser.KNOWNREBECS); }
		public TerminalNode KNOWNREBECS(int i) {
			return getToken(CoreRebecaCompleteParser.KNOWNREBECS, i);
		}
		public List<TerminalNode> STATEVARS() { return getTokens(CoreRebecaCompleteParser.STATEVARS); }
		public TerminalNode STATEVARS(int i) {
			return getToken(CoreRebecaCompleteParser.STATEVARS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(299);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(307);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(311);
			match(REACTIVECLASS);
			setState(312);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(314);
				match(EXTENDS);
				setState(315);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(319);
				match(IMPLEMENTS);
				setState(320);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(322);
					match(COMMA);
					setState(323);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
			match(LPAREN);
			setState(333);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(335);
			match(RPAREN);
			setState(336);
			match(LBRACE);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (ABSTRACT - 33)) | (1L << (MSGSRV - 33)) | (1L << (STATEVARS - 33)) | (1L << (KNOWNREBECS - 33)) | (1L << (MONKEYS_AT - 33)) | (1L << (IDENTIFIER - 33)))) != 0)) {
				{
				setState(370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					{
					setState(337);
					match(KNOWNREBECS);
					setState(338);
					match(LBRACE);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(339);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(341);
						match(SEMI);
						}
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(348);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 2:
					{
					{
					setState(349);
					match(STATEVARS);
					setState(350);
					match(LBRACE);
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(351);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(353);
						match(SEMI);
						}
						}
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(360);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 3:
					{
					setState(361);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 4:
					{
					setState(364);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 5:
					{
					setState(367);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(MethodDeclaration md) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), md);
		enterRule(_localctx, 28, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(380);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(382);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(385);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(389);
				((ConstructorDeclarationContext)_localctx).an = annotation();
				_localctx.cd.getAnnotations().add(((ConstructorDeclarationContext)_localctx).an.an);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
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
		public TerminalNode MSGSRV() { return getToken(CoreRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(400);
				((MsgsrvDeclarationContext)_localctx).an = annotation();
				_localctx.md.getAnnotations().add(((MsgsrvDeclarationContext)_localctx).an.an);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(408);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(412);
			match(MSGSRV);
			setState(413);
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
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(416);
				((SynchMethodDeclarationContext)_localctx).an = annotation();
				_localctx.smd.getAnnotations().add(((SynchMethodDeclarationContext)_localctx).an.an);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(424);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(428);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(430);
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
		enterRule(_localctx, 36, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(433);
			match(LPAREN);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(434);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(439);
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
		enterRule(_localctx, 38, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(442);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(444);
				match(COMMA);
				setState(445);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(452);
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
		enterRule(_localctx, 40, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(454);
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
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(458);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				ArrayList<Annotation> anns = new ArrayList<Annotation>();
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(461);
						((BlockContext)_localctx).an = annotation();
						anns.add(((BlockContext)_localctx).an.an);
						}
						} 
					}
					setState(468);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(469);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s); ((BlockContext)_localctx).s.s.getAnnotations().addAll(anns);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(482);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(486);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(493);
				match(LPAREN);
				setState(494);
				((StatementContext)_localctx).e = expression(0);
				setState(495);
				match(RPAREN);
				setState(496);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(498);
					match(ELSE);
					setState(499);
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
				setState(504);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(506);
				match(LPAREN);
				setState(507);
				((StatementContext)_localctx).e = expression(0);
				setState(508);
				match(RPAREN);
				setState(509);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(512);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(514);
				match(LPAREN);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(515);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(520);
				match(SEMI);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(521);
					((StatementContext)_localctx).e = expression(0);
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(526);
				match(SEMI);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(527);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(532);
				match(RPAREN);
				setState(533);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(536);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(537);
				match(LPAREN);
				setState(538);
				((StatementContext)_localctx).e = expression(0);
				setState(539);
				match(RPAREN);
				setState(540);
				match(LBRACE);
				setState(541);
				((StatementContext)_localctx).sb = switchBlock();
				setState(542);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(545);
				((StatementContext)_localctx).RETURN = match(RETURN);
				((StatementContext)_localctx).s =  new ReturnStatement();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(547);
					((StatementContext)_localctx).e = expression(0);
					((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e);
					}
				}

				setState(552);
				match(SEMI);
				_localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());
				    	 _localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(554);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(555);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(557);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(558);
				match(SEMI);
				((StatementContext)_localctx).s =  new ContinueStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(560);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forInit);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
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
		public List<TerminalNode> CASE() { return getTokens(CoreRebecaCompleteParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(CoreRebecaCompleteParser.CASE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoreRebecaCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoreRebecaCompleteParser.COLON, i);
		}
		public TerminalNode DEFAULT() { return getToken(CoreRebecaCompleteParser.DEFAULT, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(602); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    		
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(574);
					((SwitchBlockContext)_localctx).an = annotation();
					anns.add(((SwitchBlockContext)_localctx).an.an);
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(582);
				match(CASE);
				setState(583);
				((SwitchBlockContext)_localctx).e = expression(0);
				setState(584);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(591);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(586);
								((SwitchBlockContext)_localctx).an = annotation();
								anns.add(((SwitchBlockContext)_localctx).an.an);
								}
								} 
							}
							setState(593);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						}
						setState(594);
						((SwitchBlockContext)_localctx).st = statement();

											((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns);
											_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1)
												.getStatements().add(((SwitchBlockContext)_localctx).st.s);
										
						}
						} 
					}
					setState(601);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				}
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==MONKEYS_AT );
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(606);
				((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);
				setState(607);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(614);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(609);
							((SwitchBlockContext)_localctx).an = annotation();
							anns.add(((SwitchBlockContext)_localctx).an.an);
							}
							} 
						}
						setState(616);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					}
					setState(617);
					((SwitchBlockContext)_localctx).st = statement();
					((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns); _localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(624);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
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
		enterRule(_localctx, 52, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(631);
			match(MONKEYS_AT);
			setState(632);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(634);
				match(LPAREN);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(635);
					((AnnotationContext)_localctx).exp = expression(0);
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(640);
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
		enterRule(_localctx, 54, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(645);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(650);
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
		public TerminalNode LT() { return getToken(CoreRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
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
		enterRule(_localctx, 56, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(657);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(659);
				match(COMMA);
				setState(660);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
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
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(CoreRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(CoreRebecaCompleteParser.INTLITERAL, i);
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
		enterRule(_localctx, 58, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(675); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(671);
					match(LBRACKET);
					setState(672);
					((DimensionsContext)_localctx).i = match(INTLITERAL);
					setState(673);
					match(RBRACKET);
					_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(677); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(680);
				((ExpressionContext)_localctx).ece = coreExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ece.e;
				}
				break;
			case 2:
				{
				setState(683);
				((ExpressionContext)_localctx).ue = unaryExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ue.e;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(755);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.me1 = _prevctx;
						_localctx.me1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(688);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(689);
						((ExpressionContext)_localctx).mo = multiplicativeOp();
						setState(690);
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
						setState(693);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(694);
						((ExpressionContext)_localctx).ado = additiveOp();
						setState(695);
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
						setState(698);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(699);
						((ExpressionContext)_localctx).so = shiftOp();
						setState(700);
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
						setState(703);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(704);
						((ExpressionContext)_localctx).ro = relationalOp();
						setState(705);
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
						setState(708);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(709);
						((ExpressionContext)_localctx).eo = equalityOp();
						setState(710);
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
						setState(713);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(714);
						((ExpressionContext)_localctx).AMP = match(AMP);
						setState(715);
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
						setState(718);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(719);
						((ExpressionContext)_localctx).CARET = match(CARET);
						setState(720);
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
						setState(723);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(724);
						((ExpressionContext)_localctx).BAR = match(BAR);
						setState(725);
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
						setState(728);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(729);
						((ExpressionContext)_localctx).AMPAMP = match(AMPAMP);
						setState(730);
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
						setState(733);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(734);
						((ExpressionContext)_localctx).BARBAR = match(BARBAR);
						setState(735);
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
						setState(738);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(739);
						match(QUES);
						setState(740);
						((ExpressionContext)_localctx).cee2 = expression(0);
						setState(741);
						match(COLON);
						setState(742);
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
						setState(745);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(746);
						((ExpressionContext)_localctx).ao = assignmentOperator();
						setState(747);
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
						setState(750);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(751);
						match(INSTANCEOF);
						setState(752);
						((ExpressionContext)_localctx).t = type();
						InstanceofExpression e3 = new InstanceofExpression(); e3.setValue(((ExpressionContext)_localctx).ie1.e); e3.setEvaluationType(((ExpressionContext)_localctx).t.t);
						                       e3.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE); e3.setLineNumber(((ExpressionContext)_localctx).t.t.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).t.t.getCharacter());
						                       ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 62, RULE_assignmentOperator);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(770);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(772);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(774);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(776);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(778);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(780);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(782);
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
		enterRule(_localctx, 64, RULE_multiplicativeOp);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				((MultiplicativeOpContext)_localctx).STAR = match(STAR);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).STAR!=null?((MultiplicativeOpContext)_localctx).STAR.getText():null);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				((MultiplicativeOpContext)_localctx).SLASH = match(SLASH);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).SLASH!=null?((MultiplicativeOpContext)_localctx).SLASH.getText():null);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
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
		enterRule(_localctx, 66, RULE_additiveOp);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				((AdditiveOpContext)_localctx).PLUS = match(PLUS);
				((AdditiveOpContext)_localctx).ado =  (((AdditiveOpContext)_localctx).PLUS!=null?((AdditiveOpContext)_localctx).PLUS.getText():null);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
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
		enterRule(_localctx, 68, RULE_relationalOp);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(801);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(804);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(808);
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
		enterRule(_localctx, 70, RULE_shiftOp);
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(LT);
				setState(813);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(GT);
				setState(816);
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
		enterRule(_localctx, 72, RULE_equalityOp);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				((EqualityOpContext)_localctx).EQEQ = match(EQEQ);
				((EqualityOpContext)_localctx).eo =  (((EqualityOpContext)_localctx).EQEQ!=null?((EqualityOpContext)_localctx).EQEQ.getText():null);
				}
				break;
			case BANGEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
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
		public TerminalNode PLUS() { return getToken(CoreRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CoreRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(CoreRebecaCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(CoreRebecaCompleteParser.BANG, 0); }
		public CoreExpressionContext coreExpression() {
			return getRuleContext(CoreExpressionContext.class,0);
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
		enterRule(_localctx, 74, RULE_unaryExpression);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(PLUS);
				setState(827);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(831);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(835);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(838);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(839);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case TILDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(842);
				((UnaryExpressionContext)_localctx).TILDA = match(TILDA);
				setState(843);
				((UnaryExpressionContext)_localctx).et = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).TILDA!=null?((UnaryExpressionContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).et.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).et.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).et.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(846);
				((UnaryExpressionContext)_localctx).BANG = match(BANG);
				setState(847);
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
				setState(850);
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
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(CoreRebecaCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(CoreRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CoreRebecaCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
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
		enterRule(_localctx, 76, RULE_coreExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(855);
				((CoreExpressionContext)_localctx).ec = castExpression();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ec.e;
				}
				break;
			case 2:
				{
				setState(858);
				match(LPAREN);
				setState(859);
				((CoreExpressionContext)_localctx).ep = expression(0);
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ep.e;
				setState(861);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(863);
				((CoreExpressionContext)_localctx).p = primary();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).p.tp;
				}
				break;
			case 4:
				{
				setState(866);
				((CoreExpressionContext)_localctx).l = literal();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).l.l;
				}
				break;
			case 5:
				{
				setState(869);
				((CoreExpressionContext)_localctx).QUES = match(QUES);
				setState(870);
				match(LPAREN);
				setState(871);
				((CoreExpressionContext)_localctx).el = expressionList();
				setState(872);
				match(RPAREN);
				((CoreExpressionContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((CoreExpressionContext)_localctx).el.el);
					    	_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).QUES.getCharPositionInLine());
				}
				break;
			case 6:
				{
				setState(875);
				match(NEW);
				setState(876);
				((CoreExpressionContext)_localctx).t = type();
				((CoreExpressionContext)_localctx).e =  new RebecInstantiationPrimary();
								_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((CoreExpressionContext)_localctx).t.t);
				setState(878);
				match(LPAREN);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(879);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(884);
				match(RPAREN);
				setState(885);
				match(COLON);
				setState(886);
				match(LPAREN);
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(887);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(892);
				match(RPAREN);
				}
				break;
			}
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(896);
					((CoreExpressionContext)_localctx).DOT = match(DOT);
					setState(897);
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
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(905);
				((CoreExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((CoreExpressionContext)_localctx).e = pse;
				        		pse.setLineNumber(((CoreExpressionContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((CoreExpressionContext)_localctx).PLUSPLUS.getCharPositionInLine());
				}
				break;
			case 2:
				{
				setState(907);
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
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(LPAREN);
			setState(912);
			((CastExpressionContext)_localctx).t = type();
			setState(913);
			match(RPAREN);
			setState(914);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(919);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(921);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(926);
				match(RPAREN);
				}
				break;
			}
			setState(936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(929);
					match(LBRACKET);
					setState(930);
					((PrimaryContext)_localctx).e2 = expression(0);
					setState(931);
					match(RBRACKET);
					_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
					}
					} 
				}
				setState(938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
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
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(940);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			((ExpressionListContext)_localctx).e = expression(0);
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(950);
				match(COMMA);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(951);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(959);
				((ExpressionListContext)_localctx).e = expression(0);
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(966);
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
		enterRule(_localctx, 84, RULE_literal);
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(971);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(975);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(977);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(979);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(981);
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
		case 30:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u03dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\5\2]\n\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\6\5\u008b\n\5\r\5\16\5\u008c\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00b3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bb\n\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d4\n\n\f\n\16\n\u00d7\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00e8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f2\n\r\f\r\16\r\u00f5"+
		"\13\r\5\r\u00f7\n\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00ff\n\16\f\16\16"+
		"\16\u0102\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u010d"+
		"\n\16\f\16\16\16\u0110\13\16\5\16\u0112\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0119\n\16\f\16\16\16\u011c\13\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u0125\n\16\f\16\16\16\u0128\13\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u0131\n\17\f\17\16\17\u0134\13\17\3\17\3\17\5\17\u0138"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0140\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0148\n\17\f\17\16\17\u014b\13\17\5\17\u014d\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u015a\n\17\f\17"+
		"\16\17\u015d\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0166\n\17"+
		"\f\17\16\17\u0169\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u0175\n\17\f\17\16\17\u0178\13\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u0185\n\20\3\21\3\21\3\21\3\21\7\21"+
		"\u018b\n\21\f\21\16\21\u018e\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"\u0196\n\22\f\22\16\22\u0199\13\22\3\22\3\22\5\22\u019d\n\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\7\23\u01a6\n\23\f\23\16\23\u01a9\13\23\3\23"+
		"\3\23\5\23\u01ad\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u01b8\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01c3\n"+
		"\25\f\25\16\25\u01c6\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u01d3\n\27\f\27\16\27\u01d6\13\27\3\27\3\27\3\27\7\27"+
		"\u01db\n\27\f\27\16\27\u01de\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u01f9\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0209\n\30\3\30\3\30\3\30\3\30"+
		"\5\30\u020f\n\30\3\30\3\30\3\30\3\30\5\30\u0215\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u0229\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0235\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u023d\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\7\32\u0244\n\32\f\32\16\32\u0247\13\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\7\32\u0250\n\32\f\32\16\32\u0253\13\32\3\32\3"+
		"\32\3\32\7\32\u0258\n\32\f\32\16\32\u025b\13\32\6\32\u025d\n\32\r\32\16"+
		"\32\u025e\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0267\n\32\f\32\16\32\u026a"+
		"\13\32\3\32\3\32\3\32\7\32\u026f\n\32\f\32\16\32\u0272\13\32\5\32\u0274"+
		"\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0281"+
		"\n\34\3\34\5\34\u0284\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u028b\n\35\3"+
		"\35\3\35\3\35\5\35\u0290\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u029a\n\36\f\36\16\36\u029d\13\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\6\37\u02a6\n\37\r\37\16\37\u02a7\3 \3 \3 \3 \3 \3 \3 \5 \u02b1\n"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u02f6"+
		"\n \f \16 \u02f9\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u0313\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u031b\n"+
		"\"\3#\3#\3#\3#\5#\u0321\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u032d\n$\3"+
		"%\3%\3%\3%\3%\3%\5%\u0335\n%\3&\3&\3&\3&\5&\u033b\n&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u0358\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0375\n(\3(\3(\3(\3"+
		"(\3(\3(\5(\u037d\n(\3(\3(\5(\u0381\n(\3(\3(\3(\3(\7(\u0387\n(\f(\16(\u038a"+
		"\13(\3(\3(\3(\3(\5(\u0390\n(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u039f\n*\3*\5*\u03a2\n*\3*\3*\3*\3*\3*\7*\u03a9\n*\f*\16*\u03ac\13*"+
		"\3+\3+\3+\3+\7+\u03b2\n+\f+\16+\u03b5\13+\3+\3+\3+\3+\3+\3+\7+\u03bd\n"+
		"+\f+\16+\u03c0\13+\3+\3+\3+\7+\u03c5\n+\f+\16+\u03c8\13+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03da\n,\3,\2\3>-\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\2\u0437"+
		"\2X\3\2\2\2\4i\3\2\2\2\6k\3\2\2\2\bm\3\2\2\2\n\u0091\3\2\2\2\f\u0093\3"+
		"\2\2\2\16\u00a2\3\2\2\2\20\u00bf\3\2\2\2\22\u00cc\3\2\2\2\24\u00d8\3\2"+
		"\2\2\26\u00e7\3\2\2\2\30\u00e9\3\2\2\2\32\u00fa\3\2\2\2\34\u012c\3\2\2"+
		"\2\36\u017c\3\2\2\2 \u0186\3\2\2\2\"\u0191\3\2\2\2$\u01a1\3\2\2\2&\u01b2"+
		"\3\2\2\2(\u01bb\3\2\2\2*\u01c7\3\2\2\2,\u01cb\3\2\2\2.\u0234\3\2\2\2\60"+
		"\u023c\3\2\2\2\62\u023e\3\2\2\2\64\u0275\3\2\2\2\66\u0278\3\2\2\28\u0285"+
		"\3\2\2\2:\u0291\3\2\2\2<\u02a0\3\2\2\2>\u02b0\3\2\2\2@\u0312\3\2\2\2B"+
		"\u031a\3\2\2\2D\u0320\3\2\2\2F\u032c\3\2\2\2H\u0334\3\2\2\2J\u033a\3\2"+
		"\2\2L\u0357\3\2\2\2N\u0380\3\2\2\2P\u0391\3\2\2\2R\u0397\3\2\2\2T\u03ad"+
		"\3\2\2\2V\u03d9\3\2\2\2X\\\b\2\1\2YZ\5\4\3\2Z[\b\2\1\2[]\3\2\2\2\\Y\3"+
		"\2\2\2\\]\3\2\2\2]c\3\2\2\2^_\5\6\4\2_`\b\2\1\2`b\3\2\2\2a^\3\2\2\2be"+
		"\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5\b\5\2gh\b\2\1\2h"+
		"\3\3\2\2\2ij\7\26\2\2j\5\3\2\2\2kl\7\24\2\2l\7\3\2\2\2ms\b\5\1\2no\5\n"+
		"\6\2op\b\5\1\2pr\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\u0081"+
		"\3\2\2\2us\3\2\2\2vw\7\36\2\2wx\5\20\t\2xy\7\64\2\2yz\b\5\1\2z\u0080\3"+
		"\2\2\2{|\7\37\2\2|}\7[\2\2}~\7\64\2\2~\u0080\b\5\1\2\177v\3\2\2\2\177"+
		"{\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u008a\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\34\17\2\u0085\u0086\b"+
		"\5\1\2\u0086\u008b\3\2\2\2\u0087\u0088\5\32\16\2\u0088\u0089\b\5\1\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\5\f\7\2\u008f\u0090\b\5\1\2\u0090\t\3\2\2\2\u0091\u0092\7\32\2"+
		"\2\u0092\13\3\2\2\2\u0093\u0094\b\7\1\2\u0094\u0095\7\'\2\2\u0095\u0096"+
		"\b\7\1\2\u0096\u009c\7\60\2\2\u0097\u0098\5\16\b\2\u0098\u0099\b\7\1\2"+
		"\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\61\2\2\u00a0\u00a1\b\7\1\2\u00a1\r\3\2\2\2\u00a2\u00a8\b\b\1"+
		"\2\u00a3\u00a4\5\66\34\2\u00a4\u00a5\b\b\1\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\58\35\2\u00ac"+
		"\u00ad\7[\2\2\u00ad\u00ae\b\b\1\2\u00ae\u00b2\7.\2\2\u00af\u00b0\5T+\2"+
		"\u00b0\u00b1\b\b\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7/\2\2\u00b5\u00b6\7;\2\2\u00b6"+
		"\u00ba\7.\2\2\u00b7\u00b8\5T+\2\u00b8\u00b9\b\b\1\2\u00b9\u00bb\3\2\2"+
		"\2\u00ba\u00b7\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\7/\2\2\u00bd\u00be\7\64\2\2\u00be\17\3\2\2\2\u00bf\u00c5\b\t\1\2\u00c0"+
		"\u00c1\5\66\34\2\u00c1\u00c2\b\t\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00c0\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\58\35\2\u00c9\u00ca\5\22"+
		"\n\2\u00ca\u00cb\b\t\1\2\u00cb\21\3\2\2\2\u00cc\u00cd\b\n\1\2\u00cd\u00ce"+
		"\5\24\13\2\u00ce\u00d5\b\n\1\2\u00cf\u00d0\7\65\2\2\u00d0\u00d1\5\24\13"+
		"\2\u00d1\u00d2\b\n\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\23\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\b\13\1\2\u00d9\u00da\7[\2\2\u00da\u00df\b\13"+
		"\1\2\u00db\u00dc\7\67\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\b\13\1\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\25\3\2\2"+
		"\2\u00e1\u00e2\5\30\r\2\u00e2\u00e3\b\f\1\2\u00e3\u00e8\3\2\2\2\u00e4"+
		"\u00e5\5> \2\u00e5\u00e6\b\f\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2\2"+
		"\2\u00e7\u00e4\3\2\2\2\u00e8\27\3\2\2\2\u00e9\u00ea\b\r\1\2\u00ea\u00f6"+
		"\7\60\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00f3\b\r\1\2\u00ed\u00ee\7\65\2"+
		"\2\u00ee\u00ef\5\26\f\2\u00ef\u00f0\b\r\1\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\31\3\2\2"+
		"\2\u00fa\u0100\b\16\1\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\b\16\1\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7\"\2\2\u0104\u0105\7[\2\2\u0105\u0111\b\16\1\2\u0106\u0107\7$"+
		"\2\2\u0107\u0108\7[\2\2\u0108\u010e\b\16\1\2\u0109\u010a\7\65\2\2\u010a"+
		"\u010b\7[\2\2\u010b\u010d\b\16\1\2\u010c\u0109\3\2\2\2\u010d\u0110\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0106\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0126\7\60\2\2\u0114\u011a\b\16\1\2\u0115\u0116\5\66\34\2\u0116"+
		"\u0117\b\16\1\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\7&\2\2\u011e\u011f\7[\2\2\u011f\u0120\b\16"+
		"\1\2\u0120\u0121\5&\24\2\u0121\u0122\b\16\1\2\u0122\u0123\7\64\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0114\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\7\61\2\2\u012a\u012b\b\16\1\2\u012b\33\3\2\2\2\u012c\u0132\b\17"+
		"\1\2\u012d\u012e\5\66\34\2\u012e\u012f\b\17\1\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0137\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7#\2\2\u0136"+
		"\u0138\b\17\1\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0139\u013a\7!\2\2\u013a\u013b\7[\2\2\u013b\u013f\b\17\1\2\u013c"+
		"\u013d\7$\2\2\u013d\u013e\7[\2\2\u013e\u0140\b\17\1\2\u013f\u013c\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u014c\3\2\2\2\u0141\u0142\7%\2\2\u0142"+
		"\u0143\7[\2\2\u0143\u0149\b\17\1\2\u0144\u0145\7\65\2\2\u0145\u0146\7"+
		"[\2\2\u0146\u0148\b\17\1\2\u0147\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0141\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\7.\2\2\u014f\u0150\7\3\2\2\u0150\u0151\b\17\1\2\u0151\u0152\7/"+
		"\2\2\u0152\u0176\7\60\2\2\u0153\u0154\7)\2\2\u0154\u015b\7\60\2\2\u0155"+
		"\u0156\5\20\t\2\u0156\u0157\b\17\1\2\u0157\u0158\7\64\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0155\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0175\7\61"+
		"\2\2\u015f\u0160\7(\2\2\u0160\u0167\7\60\2\2\u0161\u0162\5\20\t\2\u0162"+
		"\u0163\b\17\1\2\u0163\u0164\7\64\2\2\u0164\u0166\3\2\2\2\u0165\u0161\3"+
		"\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0175\7\61\2\2\u016b\u016c\5"+
		" \21\2\u016c\u016d\b\17\1\2\u016d\u0175\3\2\2\2\u016e\u016f\5\"\22\2\u016f"+
		"\u0170\b\17\1\2\u0170\u0175\3\2\2\2\u0171\u0172\5$\23\2\u0172\u0173\b"+
		"\17\1\2\u0173\u0175\3\2\2\2\u0174\u0153\3\2\2\2\u0174\u015f\3\2\2\2\u0174"+
		"\u016b\3\2\2\2\u0174\u016e\3\2\2\2\u0174\u0171\3\2\2\2\u0175\u0178\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7\61\2\2\u017a\u017b\b\17\1\2\u017b\35\3\2"+
		"\2\2\u017c\u017d\7[\2\2\u017d\u017e\b\20\1\2\u017e\u017f\5&\24\2\u017f"+
		"\u0184\b\20\1\2\u0180\u0181\5,\27\2\u0181\u0182\b\20\1\2\u0182\u0185\3"+
		"\2\2\2\u0183\u0185\7\64\2\2\u0184\u0180\3\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\37\3\2\2\2\u0186\u018c\b\21\1\2\u0187\u0188\5\66\34\2\u0188\u0189\b\21"+
		"\1\2\u0189\u018b\3\2\2\2\u018a\u0187\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\5\36\20\2\u0190!\3\2\2\2\u0191\u0197\b\22\1\2\u0192\u0193"+
		"\5\66\34\2\u0193\u0194\b\22\1\2\u0194\u0196\3\2\2\2\u0195\u0192\3\2\2"+
		"\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019c"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7#\2\2\u019b\u019d\b\22\1\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7&"+
		"\2\2\u019f\u01a0\5\36\20\2\u01a0#\3\2\2\2\u01a1\u01a7\b\23\1\2\u01a2\u01a3"+
		"\5\66\34\2\u01a3\u01a4\b\23\1\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2\3\2\2"+
		"\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ac"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7#\2\2\u01ab\u01ad\b\23\1\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\58"+
		"\35\2\u01af\u01b0\b\23\1\2\u01b0\u01b1\5\36\20\2\u01b1%\3\2\2\2\u01b2"+
		"\u01b3\b\24\1\2\u01b3\u01b7\7.\2\2\u01b4\u01b5\5(\25\2\u01b5\u01b6\b\24"+
		"\1\2\u01b6\u01b8\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\7/\2\2\u01ba\'\3\2\2\2\u01bb\u01bc\b\25\1\2"+
		"\u01bc\u01bd\5*\26\2\u01bd\u01c4\b\25\1\2\u01be\u01bf\7\65\2\2\u01bf\u01c0"+
		"\5*\26\2\u01c0\u01c1\b\25\1\2\u01c1\u01c3\3\2\2\2\u01c2\u01be\3\2\2\2"+
		"\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5)\3"+
		"\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\58\35\2\u01c8\u01c9\7[\2\2\u01c9"+
		"\u01ca\b\26\1\2\u01ca+\3\2\2\2\u01cb\u01cc\b\27\1\2\u01cc\u01cd\7\60\2"+
		"\2\u01cd\u01dc\b\27\1\2\u01ce\u01d4\b\27\1\2\u01cf\u01d0\5\66\34\2\u01d0"+
		"\u01d1\b\27\1\2\u01d1\u01d3\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d3\u01d6\3"+
		"\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01d8\5.\30\2\u01d8\u01d9\b\27\1\2\u01d9\u01db\3"+
		"\2\2\2\u01da\u01ce\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7\61"+
		"\2\2\u01e0\u01e1\b\27\1\2\u01e1-\3\2\2\2\u01e2\u01e3\5\64\33\2\u01e3\u01e4"+
		"\b\30\1\2\u01e4\u01e5\7\64\2\2\u01e5\u0235\3\2\2\2\u01e6\u01e7\5\20\t"+
		"\2\u01e7\u01e8\b\30\1\2\u01e8\u01e9\7\64\2\2\u01e9\u0235\3\2\2\2\u01ea"+
		"\u01eb\5,\27\2\u01eb\u01ec\b\30\1\2\u01ec\u0235\3\2\2\2\u01ed\u01ee\7"+
		"\23\2\2\u01ee\u01ef\b\30\1\2\u01ef\u01f0\7.\2\2\u01f0\u01f1\5> \2\u01f1"+
		"\u01f2\7/\2\2\u01f2\u01f3\5.\30\2\u01f3\u01f8\b\30\1\2\u01f4\u01f5\7\20"+
		"\2\2\u01f5\u01f6\5.\30\2\u01f6\u01f7\b\30\1\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01f4\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0235\3\2\2\2\u01fa\u01fb\7\35"+
		"\2\2\u01fb\u01fc\b\30\1\2\u01fc\u01fd\7.\2\2\u01fd\u01fe\5> \2\u01fe\u01ff"+
		"\7/\2\2\u01ff\u0200\5.\30\2\u0200\u0201\b\30\1\2\u0201\u0235\3\2\2\2\u0202"+
		"\u0203\7\21\2\2\u0203\u0204\b\30\1\2\u0204\u0208\7.\2\2\u0205\u0206\5"+
		"\60\31\2\u0206\u0207\b\30\1\2\u0207\u0209\3\2\2\2\u0208\u0205\3\2\2\2"+
		"\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020e\7\64\2\2\u020b\u020c"+
		"\5> \2\u020c\u020d\b\30\1\2\u020d\u020f\3\2\2\2\u020e\u020b\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0214\7\64\2\2\u0211\u0212\5"+
		"T+\2\u0212\u0213\b\30\1\2\u0213\u0215\3\2\2\2\u0214\u0211\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7/\2\2\u0217\u0218\5.\30"+
		"\2\u0218\u0219\b\30\1\2\u0219\u0235\3\2\2\2\u021a\u021b\7\34\2\2\u021b"+
		"\u021c\7.\2\2\u021c\u021d\5> \2\u021d\u021e\7/\2\2\u021e\u021f\7\60\2"+
		"\2\u021f\u0220\5\62\32\2\u0220\u0221\7\61\2\2\u0221\u0222\b\30\1\2\u0222"+
		"\u0235\3\2\2\2\u0223\u0224\7\33\2\2\u0224\u0228\b\30\1\2\u0225\u0226\5"+
		"> \2\u0226\u0227\b\30\1\2\u0227\u0229\3\2\2\2\u0228\u0225\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7\64\2\2\u022b\u0235\b"+
		"\30\1\2\u022c\u022d\7\13\2\2\u022d\u022e\7\64\2\2\u022e\u0235\b\30\1\2"+
		"\u022f\u0230\7\16\2\2\u0230\u0231\7\64\2\2\u0231\u0235\b\30\1\2\u0232"+
		"\u0233\7\64\2\2\u0233\u0235\b\30\1\2\u0234\u01e2\3\2\2\2\u0234\u01e6\3"+
		"\2\2\2\u0234\u01ea\3\2\2\2\u0234\u01ed\3\2\2\2\u0234\u01fa\3\2\2\2\u0234"+
		"\u0202\3\2\2\2\u0234\u021a\3\2\2\2\u0234\u0223\3\2\2\2\u0234\u022c\3\2"+
		"\2\2\u0234\u022f\3\2\2\2\u0234\u0232\3\2\2\2\u0235/\3\2\2\2\u0236\u0237"+
		"\5\20\t\2\u0237\u0238\b\31\1\2\u0238\u023d\3\2\2\2\u0239\u023a\5T+\2\u023a"+
		"\u023b\b\31\1\2\u023b\u023d\3\2\2\2\u023c\u0236\3\2\2\2\u023c\u0239\3"+
		"\2\2\2\u023d\61\3\2\2\2\u023e\u025c\b\32\1\2\u023f\u0245\b\32\1\2\u0240"+
		"\u0241\5\66\34\2\u0241\u0242\b\32\1\2\u0242\u0244\3\2\2\2\u0243\u0240"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7\f\2\2\u0249\u024a\5>"+
		" \2\u024a\u024b\7;\2\2\u024b\u0259\b\32\1\2\u024c\u024d\5\66\34\2\u024d"+
		"\u024e\b\32\1\2\u024e\u0250\3\2\2\2\u024f\u024c\3\2\2\2\u0250\u0253\3"+
		"\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0255\5.\30\2\u0255\u0256\b\32\1\2\u0256\u0258\3"+
		"\2\2\2\u0257\u0251\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u023f\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0273\3\2\2\2\u0260\u0261\7\17\2\2\u0261\u0262\7;\2\2\u0262\u0270\b\32"+
		"\1\2\u0263\u0264\5\66\34\2\u0264\u0265\b\32\1\2\u0265\u0267\3\2\2\2\u0266"+
		"\u0263\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\5.\30\2\u026c"+
		"\u026d\b\32\1\2\u026d\u026f\3\2\2\2\u026e\u0268\3\2\2\2\u026f\u0272\3"+
		"\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0260\3\2\2\2\u0273\u0274\3\2\2\2\u0274\63\3\2\2"+
		"\2\u0275\u0276\5> \2\u0276\u0277\b\33\1\2\u0277\65\3\2\2\2\u0278\u0279"+
		"\b\34\1\2\u0279\u027a\7S\2\2\u027a\u027b\7[\2\2\u027b\u0283\b\34\1\2\u027c"+
		"\u0280\7.\2\2\u027d\u027e\5> \2\u027e\u027f\b\34\1\2\u027f\u0281\3\2\2"+
		"\2\u0280\u027d\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284"+
		"\7/\2\2\u0283\u027c\3\2\2\2\u0283\u0284\3\2\2\2\u0284\67\3\2\2\2\u0285"+
		"\u0286\7[\2\2\u0286\u028a\b\35\1\2\u0287\u0288\5:\36\2\u0288\u0289\b\35"+
		"\1\2\u0289\u028b\3\2\2\2\u028a\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028f\3\2\2\2\u028c\u028d\5<\37\2\u028d\u028e\b\35\1\2\u028e\u0290\3"+
		"\2\2\2\u028f\u028c\3\2\2\2\u028f\u0290\3\2\2\2\u02909\3\2\2\2\u0291\u0292"+
		"\7V\2\2\u0292\u0293\b\36\1\2\u0293\u0294\58\35\2\u0294\u029b\b\36\1\2"+
		"\u0295\u0296\7\65\2\2\u0296\u0297\58\35\2\u0297\u0298\b\36\1\2\u0298\u029a"+
		"\3\2\2\2\u0299\u0295\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\7U"+
		"\2\2\u029f;\3\2\2\2\u02a0\u02a5\b\37\1\2\u02a1\u02a2\7\62\2\2\u02a2\u02a3"+
		"\7\3\2\2\u02a3\u02a4\7\63\2\2\u02a4\u02a6\b\37\1\2\u02a5\u02a1\3\2\2\2"+
		"\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8=\3"+
		"\2\2\2\u02a9\u02aa\b \1\2\u02aa\u02ab\5N(\2\u02ab\u02ac\b \1\2\u02ac\u02b1"+
		"\3\2\2\2\u02ad\u02ae\5L\'\2\u02ae\u02af\b \1\2\u02af\u02b1\3\2\2\2\u02b0"+
		"\u02a9\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b1\u02f7\3\2\2\2\u02b2\u02b3\f\17"+
		"\2\2\u02b3\u02b4\5B\"\2\u02b4\u02b5\5> \20\u02b5\u02b6\b \1\2\u02b6\u02f6"+
		"\3\2\2\2\u02b7\u02b8\f\16\2\2\u02b8\u02b9\5D#\2\u02b9\u02ba\5> \17\u02ba"+
		"\u02bb\b \1\2\u02bb\u02f6\3\2\2\2\u02bc\u02bd\f\r\2\2\u02bd\u02be\5H%"+
		"\2\u02be\u02bf\5> \16\u02bf\u02c0\b \1\2\u02c0\u02f6\3\2\2\2\u02c1\u02c2"+
		"\f\f\2\2\u02c2\u02c3\5F$\2\u02c3\u02c4\5> \r\u02c4\u02c5\b \1\2\u02c5"+
		"\u02f6\3\2\2\2\u02c6\u02c7\f\n\2\2\u02c7\u02c8\5J&\2\u02c8\u02c9\5> \13"+
		"\u02c9\u02ca\b \1\2\u02ca\u02f6\3\2\2\2\u02cb\u02cc\f\t\2\2\u02cc\u02cd"+
		"\7F\2\2\u02cd\u02ce\5> \n\u02ce\u02cf\b \1\2\u02cf\u02f6\3\2\2\2\u02d0"+
		"\u02d1\f\b\2\2\u02d1\u02d2\7H\2\2\u02d2\u02d3\5> \t\u02d3\u02d4\b \1\2"+
		"\u02d4\u02f6\3\2\2\2\u02d5\u02d6\f\7\2\2\u02d6\u02d7\7G\2\2\u02d7\u02d8"+
		"\5> \b\u02d8\u02d9\b \1\2\u02d9\u02f6\3\2\2\2\u02da\u02db\f\6\2\2\u02db"+
		"\u02dc\7=\2\2\u02dc\u02dd\5> \7\u02dd\u02de\b \1\2\u02de\u02f6\3\2\2\2"+
		"\u02df\u02e0\f\5\2\2\u02e0\u02e1\7>\2\2\u02e1\u02e2\5> \6\u02e2\u02e3"+
		"\b \1\2\u02e3\u02f6\3\2\2\2\u02e4\u02e5\f\4\2\2\u02e5\u02e6\7:\2\2\u02e6"+
		"\u02e7\5> \2\u02e7\u02e8\7;\2\2\u02e8\u02e9\5> \5\u02e9\u02ea\b \1\2\u02ea"+
		"\u02f6\3\2\2\2\u02eb\u02ec\f\3\2\2\u02ec\u02ed\5@!\2\u02ed\u02ee\5> \4"+
		"\u02ee\u02ef\b \1\2\u02ef\u02f6\3\2\2\2\u02f0\u02f1\f\13\2\2\u02f1\u02f2"+
		"\7 \2\2\u02f2\u02f3\58\35\2\u02f3\u02f4\b \1\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02b2\3\2\2\2\u02f5\u02b7\3\2\2\2\u02f5\u02bc\3\2\2\2\u02f5\u02c1\3\2"+
		"\2\2\u02f5\u02c6\3\2\2\2\u02f5\u02cb\3\2\2\2\u02f5\u02d0\3\2\2\2\u02f5"+
		"\u02d5\3\2\2\2\u02f5\u02da\3\2\2\2\u02f5\u02df\3\2\2\2\u02f5\u02e4\3\2"+
		"\2\2\u02f5\u02eb\3\2\2\2\u02f5\u02f0\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8?\3\2\2\2\u02f9\u02f7\3\2\2\2"+
		"\u02fa\u02fb\7\67\2\2\u02fb\u0313\b!\1\2\u02fc\u02fd\7J\2\2\u02fd\u0313"+
		"\b!\1\2\u02fe\u02ff\7K\2\2\u02ff\u0313\b!\1\2\u0300\u0301\7L\2\2\u0301"+
		"\u0313\b!\1\2\u0302\u0303\7M\2\2\u0303\u0313\b!\1\2\u0304\u0305\7N\2\2"+
		"\u0305\u0313\b!\1\2\u0306\u0307\7O\2\2\u0307\u0313\b!\1\2\u0308\u0309"+
		"\7P\2\2\u0309\u0313\b!\1\2\u030a\u030b\7Q\2\2\u030b\u0313\b!\1\2\u030c"+
		"\u030d\7R\2\2\u030d\u0313\b!\1\2\u030e\u030f\7X\2\2\u030f\u0313\b!\1\2"+
		"\u0310\u0311\7Z\2\2\u0311\u0313\b!\1\2\u0312\u02fa\3\2\2\2\u0312\u02fc"+
		"\3\2\2\2\u0312\u02fe\3\2\2\2\u0312\u0300\3\2\2\2\u0312\u0302\3\2\2\2\u0312"+
		"\u0304\3\2\2\2\u0312\u0306\3\2\2\2\u0312\u0308\3\2\2\2\u0312\u030a\3\2"+
		"\2\2\u0312\u030c\3\2\2\2\u0312\u030e\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"A\3\2\2\2\u0314\u0315\7D\2\2\u0315\u031b\b\"\1\2\u0316\u0317\7E\2\2\u0317"+
		"\u031b\b\"\1\2\u0318\u0319\7I\2\2\u0319\u031b\b\"\1\2\u031a\u0314\3\2"+
		"\2\2\u031a\u0316\3\2\2\2\u031a\u0318\3\2\2\2\u031bC\3\2\2\2\u031c\u031d"+
		"\7B\2\2\u031d\u0321\b#\1\2\u031e\u031f\7C\2\2\u031f\u0321\b#\1\2\u0320"+
		"\u031c\3\2\2\2\u0320\u031e\3\2\2\2\u0321E\3\2\2\2\u0322\u0323\7V\2\2\u0323"+
		"\u0324\7\67\2\2\u0324\u032d\b$\1\2\u0325\u0326\7U\2\2\u0326\u0327\7\67"+
		"\2\2\u0327\u032d\b$\1\2\u0328\u0329\7V\2\2\u0329\u032d\b$\1\2\u032a\u032b"+
		"\7U\2\2\u032b\u032d\b$\1\2\u032c\u0322\3\2\2\2\u032c\u0325\3\2\2\2\u032c"+
		"\u0328\3\2\2\2\u032c\u032a\3\2\2\2\u032dG\3\2\2\2\u032e\u032f\7V\2\2\u032f"+
		"\u0330\7V\2\2\u0330\u0335\b%\1\2\u0331\u0332\7U\2\2\u0332\u0333\7U\2\2"+
		"\u0333\u0335\b%\1\2\u0334\u032e\3\2\2\2\u0334\u0331\3\2\2\2\u0335I\3\2"+
		"\2\2\u0336\u0337\7<\2\2\u0337\u033b\b&\1\2\u0338\u0339\7T\2\2\u0339\u033b"+
		"\b&\1\2\u033a\u0336\3\2\2\2\u033a\u0338\3\2\2\2\u033bK\3\2\2\2\u033c\u033d"+
		"\7B\2\2\u033d\u033e\5L\'\2\u033e\u033f\b\'\1\2\u033f\u0358\3\2\2\2\u0340"+
		"\u0341\7C\2\2\u0341\u0342\5L\'\2\u0342\u0343\b\'\1\2\u0343\u0358\3\2\2"+
		"\2\u0344\u0345\7?\2\2\u0345\u0346\5L\'\2\u0346\u0347\b\'\1\2\u0347\u0358"+
		"\3\2\2\2\u0348\u0349\7@\2\2\u0349\u034a\5L\'\2\u034a\u034b\b\'\1\2\u034b"+
		"\u0358\3\2\2\2\u034c\u034d\79\2\2\u034d\u034e\5L\'\2\u034e\u034f\b\'\1"+
		"\2\u034f\u0358\3\2\2\2\u0350\u0351\78\2\2\u0351\u0352\5L\'\2\u0352\u0353"+
		"\b\'\1\2\u0353\u0358\3\2\2\2\u0354\u0355\5N(\2\u0355\u0356\b\'\1\2\u0356"+
		"\u0358\3\2\2\2\u0357\u033c\3\2\2\2\u0357\u0340\3\2\2\2\u0357\u0344\3\2"+
		"\2\2\u0357\u0348\3\2\2\2\u0357\u034c\3\2\2\2\u0357\u0350\3\2\2\2\u0357"+
		"\u0354\3\2\2\2\u0358M\3\2\2\2\u0359\u035a\5P)\2\u035a\u035b\b(\1\2\u035b"+
		"\u0381\3\2\2\2\u035c\u035d\7.\2\2\u035d\u035e\5> \2\u035e\u035f\b(\1\2"+
		"\u035f\u0360\7/\2\2\u0360\u0381\3\2\2\2\u0361\u0362\5R*\2\u0362\u0363"+
		"\b(\1\2\u0363\u0381\3\2\2\2\u0364\u0365\5V,\2\u0365\u0366\b(\1\2\u0366"+
		"\u0381\3\2\2\2\u0367\u0368\7:\2\2\u0368\u0369\7.\2\2\u0369\u036a\5T+\2"+
		"\u036a\u036b\7/\2\2\u036b\u036c\b(\1\2\u036c\u0381\3\2\2\2\u036d\u036e"+
		"\7\25\2\2\u036e\u036f\58\35\2\u036f\u0370\b(\1\2\u0370\u0374\7.\2\2\u0371"+
		"\u0372\5T+\2\u0372\u0373\b(\1\2\u0373\u0375\3\2\2\2\u0374\u0371\3\2\2"+
		"\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\7/\2\2\u0377\u0378"+
		"\7;\2\2\u0378\u037c\7.\2\2\u0379\u037a\5T+\2\u037a\u037b\b(\1\2\u037b"+
		"\u037d\3\2\2\2\u037c\u0379\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u037f\7/\2\2\u037f\u0381\3\2\2\2\u0380\u0359\3\2\2\2\u0380"+
		"\u035c\3\2\2\2\u0380\u0361\3\2\2\2\u0380\u0364\3\2\2\2\u0380\u0367\3\2"+
		"\2\2\u0380\u036d\3\2\2\2\u0381\u0388\3\2\2\2\u0382\u0383\7\66\2\2\u0383"+
		"\u0384\5R*\2\u0384\u0385\b(\1\2\u0385\u0387\3\2\2\2\u0386\u0382\3\2\2"+
		"\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038f"+
		"\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038c\7?\2\2\u038c\u0390\b(\1\2\u038d"+
		"\u038e\7@\2\2\u038e\u0390\b(\1\2\u038f\u038b\3\2\2\2\u038f\u038d\3\2\2"+
		"\2\u038f\u0390\3\2\2\2\u0390O\3\2\2\2\u0391\u0392\7.\2\2\u0392\u0393\5"+
		"8\35\2\u0393\u0394\7/\2\2\u0394\u0395\5> \2\u0395\u0396\b)\1\2\u0396Q"+
		"\3\2\2\2\u0397\u0398\7[\2\2\u0398\u03a1\b*\1\2\u0399\u039a\7.\2\2\u039a"+
		"\u039e\b*\1\2\u039b\u039c\5T+\2\u039c\u039d\b*\1\2\u039d\u039f\3\2\2\2"+
		"\u039e\u039b\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2"+
		"\7/\2\2\u03a1\u0399\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03aa\3\2\2\2\u03a3"+
		"\u03a4\7\62\2\2\u03a4\u03a5\5> \2\u03a5\u03a6\7\63\2\2\u03a6\u03a7\b*"+
		"\1\2\u03a7\u03a9\3\2\2\2\u03a8\u03a3\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03abS\3\2\2\2\u03ac\u03aa\3\2\2\2"+
		"\u03ad\u03b3\b+\1\2\u03ae\u03af\5\66\34\2\u03af\u03b0\b+\1\2\u03b0\u03b2"+
		"\3\2\2\2\u03b1\u03ae\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\5>"+
		" \2\u03b7\u03c6\b+\1\2\u03b8\u03be\7\65\2\2\u03b9\u03ba\5\66\34\2\u03ba"+
		"\u03bb\b+\1\2\u03bb\u03bd\3\2\2\2\u03bc\u03b9\3\2\2\2\u03bd\u03c0\3\2"+
		"\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0"+
		"\u03be\3\2\2\2\u03c1\u03c2\5> \2\u03c2\u03c3\b+\1\2\u03c3\u03c5\3\2\2"+
		"\2\u03c4\u03b8\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7"+
		"\3\2\2\2\u03c7U\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ca\7\3\2\2\u03ca"+
		"\u03da\b,\1\2\u03cb\u03cc\7\4\2\2\u03cc\u03da\b,\1\2\u03cd\u03ce\7\5\2"+
		"\2\u03ce\u03da\b,\1\2\u03cf\u03d0\7\6\2\2\u03d0\u03da\b,\1\2\u03d1\u03d2"+
		"\7\7\2\2\u03d2\u03da\b,\1\2\u03d3\u03d4\7+\2\2\u03d4\u03da\b,\1\2\u03d5"+
		"\u03d6\7,\2\2\u03d6\u03da\b,\1\2\u03d7\u03d8\7-\2\2\u03d8\u03da\b,\1\2"+
		"\u03d9\u03c9\3\2\2\2\u03d9\u03cb\3\2\2\2\u03d9\u03cd\3\2\2\2\u03d9\u03cf"+
		"\3\2\2\2\u03d9\u03d1\3\2\2\2\u03d9\u03d3\3\2\2\2\u03d9\u03d5\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03daW\3\2\2\2U\\cs\177\u0081\u008a\u008c\u009c\u00a8\u00b2"+
		"\u00ba\u00c5\u00d5\u00df\u00e7\u00f3\u00f6\u0100\u010e\u0111\u011a\u0126"+
		"\u0132\u0137\u013f\u0149\u014c\u015b\u0167\u0174\u0176\u0184\u018c\u0197"+
		"\u019c\u01a7\u01ac\u01b7\u01c4\u01d4\u01dc\u01f8\u0208\u020e\u0214\u0228"+
		"\u0234\u023c\u0245\u0251\u0259\u025e\u0268\u0270\u0273\u0280\u0283\u028a"+
		"\u028f\u029b\u02a7\u02b0\u02f5\u02f7\u0312\u031a\u0320\u032c\u0334\u033a"+
		"\u0357\u0374\u037c\u0380\u0388\u038f\u039e\u03a1\u03aa\u03b3\u03be\u03c6"+
		"\u03d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}