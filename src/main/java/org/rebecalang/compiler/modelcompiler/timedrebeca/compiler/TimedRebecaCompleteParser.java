// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
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
public class TimedRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AFTER=1, DEADLINE=2, INTLITERAL=3, FLOATLITERAL=4, DOUBLELITERAL=5, CHARLITERAL=6, 
		STRINGLITERAL=7, WS=8, COMMENT=9, LINE_COMMENT=10, BREAK=11, CASE=12, 
		CLASS=13, CONTINUE=14, DEFAULT=15, ELSE=16, FOR=17, GOTO=18, IF=19, IMPORT=20, 
		NEW=21, PACKAGE=22, PRIVATE=23, PROTECTED=24, PUBLIC=25, RECORD=26, RETURN=27, 
		SWITCH=28, WHILE=29, ENV=30, FEATUREVAR=31, INSTANCEOF=32, REACTIVECLASS=33, 
		INTERFACE=34, ABSTRACT=35, EXTENDS=36, IMPLEMENTS=37, MSGSRV=38, MAIN=39, 
		STATEVARS=40, KNOWNREBECS=41, THIS=42, TRUE=43, FALSE=44, NULL=45, LPAREN=46, 
		RPAREN=47, LBRACE=48, RBRACE=49, LBRACKET=50, RBRACKET=51, SEMI=52, COMMA=53, 
		DOT=54, EQ=55, BANG=56, TILDA=57, QUES=58, COLON=59, EQEQ=60, AMPAMP=61, 
		BARBAR=62, PLUSPLUS=63, SUBSUB=64, SUPER=65, PLUS=66, SUB=67, STAR=68, 
		SLASH=69, AMP=70, BAR=71, CARET=72, PERCENT=73, PLUSEQ=74, SUBEQ=75, STAREQ=76, 
		SLASHEQ=77, AMPEQ=78, BAREQ=79, CARETEQ=80, TILDAEQ=81, PERCENTEQ=82, 
		MONKEYS_AT=83, BANGEQ=84, GT=85, LT=86, LTLT=87, LTLTEQ=88, GTGT=89, GTGTEQ=90, 
		IDENTIFIER=91;
	public static final int
		RULE_primary = 0, RULE_after = 1, RULE_deadline = 2, RULE_rebecaModel = 3, 
		RULE_packageDeclaration = 4, RULE_importDeclaration = 5, RULE_rebecaCode = 6, 
		RULE_recordDeclaration = 7, RULE_mainDeclaration = 8, RULE_mainRebecDefinition = 9, 
		RULE_fieldDeclaration = 10, RULE_variableDeclarators = 11, RULE_variableDeclarator = 12, 
		RULE_variableInitializer = 13, RULE_arrayInitializer = 14, RULE_interfaceDeclaration = 15, 
		RULE_reactiveClassDeclaration = 16, RULE_methodDeclaration = 17, RULE_constructorDeclaration = 18, 
		RULE_msgsrvDeclaration = 19, RULE_synchMethodDeclaration = 20, RULE_formalParameters = 21, 
		RULE_formalParametersDeclaration = 22, RULE_formalParameterDeclaration = 23, 
		RULE_block = 24, RULE_statement = 25, RULE_forInit = 26, RULE_switchBlock = 27, 
		RULE_statementExpression = 28, RULE_annotation = 29, RULE_type = 30, RULE_genericTypeParams = 31, 
		RULE_dimensions = 32, RULE_expression = 33, RULE_assignmentOperator = 34, 
		RULE_multiplicativeOp = 35, RULE_additiveOp = 36, RULE_relationalOp = 37, 
		RULE_shiftOp = 38, RULE_equalityOp = 39, RULE_unaryExpression = 40, RULE_coreExpression = 41, 
		RULE_castExpression = 42, RULE_expressionList = 43, RULE_literal = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"primary", "after", "deadline", "rebecaModel", "packageDeclaration", 
			"importDeclaration", "rebecaCode", "recordDeclaration", "mainDeclaration", 
			"mainRebecDefinition", "fieldDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableInitializer", "arrayInitializer", "interfaceDeclaration", "reactiveClassDeclaration", 
			"methodDeclaration", "constructorDeclaration", "msgsrvDeclaration", "synchMethodDeclaration", 
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
			null, "'after'", "'deadline'", null, null, null, null, null, null, null, 
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
			null, "AFTER", "DEADLINE", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", 
			"CHARLITERAL", "STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "BREAK", 
			"CASE", "CLASS", "CONTINUE", "DEFAULT", "ELSE", "FOR", "GOTO", "IF", 
			"IMPORT", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", 
			"RETURN", "SWITCH", "WHILE", "ENV", "FEATUREVAR", "INSTANCEOF", "REACTIVECLASS", 
			"INTERFACE", "ABSTRACT", "EXTENDS", "IMPLEMENTS", "MSGSRV", "MAIN", "STATEVARS", 
			"KNOWNREBECS", "THIS", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "EQ", "BANG", 
			"TILDA", "QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", 
			"SUPER", "PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", 
			"PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", 
			"TILDAEQ", "PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", "LT", "LTLT", "LTLTEQ", 
			"GTGT", "GTGTEQ", "IDENTIFIER"
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
	public String getGrammarFileName() { return "TimedRebecaComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TimedRebecaCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENTIFIER);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(91);
				match(LPAREN);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(92);
					expressionList();
					}
				}

				setState(95);
				match(RPAREN);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(96);
					after();
					}
					break;
				}
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(99);
					deadline();
					}
					break;
				}
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(LBRACKET);
					setState(105);
					expression(0);
					setState(106);
					match(RBRACKET);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode AFTER() { return getToken(TimedRebecaCompleteParser.AFTER, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public AfterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_after; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAfter(this);
		}
	}

	public final AfterContext after() throws RecognitionException {
		AfterContext _localctx = new AfterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_after);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(AFTER);
			setState(114);
			match(LPAREN);
			setState(115);
			expression(0);
			setState(116);
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
		public TerminalNode DEADLINE() { return getToken(TimedRebecaCompleteParser.DEADLINE, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public DeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deadline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterDeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitDeadline(this);
		}
	}

	public final DeadlineContext deadline() throws RecognitionException {
		DeadlineContext _localctx = new DeadlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_deadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(DEADLINE);
			setState(119);
			match(LPAREN);
			setState(120);
			expression(0);
			setState(121);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRebecaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRebecaModel(this);
		}
	}

	public final RebecaModelContext rebecaModel() throws RecognitionException {
		RebecaModelContext _localctx = new RebecaModelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(124);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(129);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(137);
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
		public TerminalNode PACKAGE() { return getToken(TimedRebecaCompleteParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		public TerminalNode IMPORT() { return getToken(TimedRebecaCompleteParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		public List<TerminalNode> ENV() { return getTokens(TimedRebecaCompleteParser.ENV); }
		public TerminalNode ENV(int i) {
			return getToken(TimedRebecaCompleteParser.ENV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<TerminalNode> FEATUREVAR() { return getTokens(TimedRebecaCompleteParser.FEATUREVAR); }
		public TerminalNode FEATUREVAR(int i) {
			return getToken(TimedRebecaCompleteParser.FEATUREVAR, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public RebecaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRebecaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRebecaCode(this);
		}
	}

	public final RebecaCodeContext rebecaCode() throws RecognitionException {
		RebecaCodeContext _localctx = new RebecaCodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaCodeContext)_localctx).rc =  new RebecaCode();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(145);
				((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(153);
					match(ENV);
					setState(154);
					((RebecaCodeContext)_localctx).fd = fieldDeclaration();
					setState(155);
					match(SEMI);
					_localctx.rc.getEnvironmentVariables().add(((RebecaCodeContext)_localctx).fd.fd);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(158);
					match(FEATUREVAR);
					setState(159);
					((RebecaCodeContext)_localctx).featureName = match(IDENTIFIER);
					setState(160);
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
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(167);
					((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
					_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
					}
					break;
				case 2:
					{
					setState(170);
					((RebecaCodeContext)_localctx).intd = interfaceDeclaration();
					_localctx.rc.getInterfaceDeclaration().add(((RebecaCodeContext)_localctx).intd.intd);
					}
					break;
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (REACTIVECLASS - 33)) | (1L << (INTERFACE - 33)) | (1L << (ABSTRACT - 33)) | (1L << (MONKEYS_AT - 33)))) != 0) );
			setState(177);
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
		public TerminalNode RECORD() { return getToken(TimedRebecaCompleteParser.RECORD, 0); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		public TerminalNode MAIN() { return getToken(TimedRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(183);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(185);
			match(LBRACE);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(186);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMainRebecDefinition(this);
		}
	}

	public final MainRebecDefinitionContext mainRebecDefinition() throws RecognitionException {
		MainRebecDefinitionContext _localctx = new MainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(198);
				((MainRebecDefinitionContext)_localctx).an = annotation();
				_localctx.mrd.getAnnotations().add(((MainRebecDefinitionContext)_localctx).an.an);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(207);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(209);
			match(LPAREN);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(210);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(215);
			match(RPAREN);
			setState(216);
			match(COLON);
			setState(217);
			match(LPAREN);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(218);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(223);
			match(RPAREN);
			setState(224);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(227);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			((FieldDeclarationContext)_localctx).t = type();
			setState(236);
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
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(240);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(250);
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
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(252);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(254);
				match(EQ);
				setState(255);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableInitializer);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
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
				setState(263);
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
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(269);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(270);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(272);
					match(COMMA);
					setState(273);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(283);
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
		public TerminalNode INTERFACE() { return getToken(TimedRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(TimedRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> MSGSRV() { return getTokens(TimedRebecaCompleteParser.MSGSRV); }
		public TerminalNode MSGSRV(int i) {
			return getToken(TimedRebecaCompleteParser.MSGSRV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
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
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(286);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(INTERFACE);
			setState(295);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(297);
				match(EXTENDS);
				setState(298);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(310);
			match(LBRACE);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==MONKEYS_AT) {
				{
				{
				MethodDeclaration md = new MsgsrvDeclaration();md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(312);
					((InterfaceDeclarationContext)_localctx).an = annotation();
					md.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(MSGSRV);
				setState(321);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(323);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(325);
				match(SEMI);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
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
		public TerminalNode REACTIVECLASS() { return getToken(TimedRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(TimedRebecaCompleteParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(TimedRebecaCompleteParser.IMPLEMENTS, 0); }
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
		public List<TerminalNode> KNOWNREBECS() { return getTokens(TimedRebecaCompleteParser.KNOWNREBECS); }
		public TerminalNode KNOWNREBECS(int i) {
			return getToken(TimedRebecaCompleteParser.KNOWNREBECS, i);
		}
		public List<TerminalNode> STATEVARS() { return getTokens(TimedRebecaCompleteParser.STATEVARS); }
		public TerminalNode STATEVARS(int i) {
			return getToken(TimedRebecaCompleteParser.STATEVARS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(336);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(344);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(348);
			match(REACTIVECLASS);
			setState(349);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(351);
				match(EXTENDS);
				setState(352);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(356);
				match(IMPLEMENTS);
				setState(357);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(369);
			match(LPAREN);
			setState(370);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(372);
			match(RPAREN);
			setState(373);
			match(LBRACE);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (ABSTRACT - 35)) | (1L << (MSGSRV - 35)) | (1L << (STATEVARS - 35)) | (1L << (KNOWNREBECS - 35)) | (1L << (MONKEYS_AT - 35)) | (1L << (IDENTIFIER - 35)))) != 0)) {
				{
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					{
					setState(374);
					match(KNOWNREBECS);
					setState(375);
					match(LBRACE);
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(376);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(378);
						match(SEMI);
						}
						}
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(385);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 2:
					{
					{
					setState(386);
					match(STATEVARS);
					setState(387);
					match(LBRACE);
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(388);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(390);
						match(SEMI);
						}
						}
						setState(396);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(397);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 3:
					{
					setState(398);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 4:
					{
					setState(401);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 5:
					{
					setState(404);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
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
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(MethodDeclaration md) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), md);
		enterRule(_localctx, 34, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(417);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(419);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(422);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(426);
				((ConstructorDeclarationContext)_localctx).an = annotation();
				_localctx.cd.getAnnotations().add(((ConstructorDeclarationContext)_localctx).an.an);
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
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
		public TerminalNode MSGSRV() { return getToken(TimedRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(437);
				((MsgsrvDeclarationContext)_localctx).an = annotation();
				_localctx.md.getAnnotations().add(((MsgsrvDeclarationContext)_localctx).an.an);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(445);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(449);
			match(MSGSRV);
			setState(450);
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
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(453);
				((SynchMethodDeclarationContext)_localctx).an = annotation();
				_localctx.smd.getAnnotations().add(((SynchMethodDeclarationContext)_localctx).an.an);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(461);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(465);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(467);
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
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public FormalParametersDeclarationContext formalParametersDeclaration() {
			return getRuleContext(FormalParametersDeclarationContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(470);
			match(LPAREN);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(471);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(476);
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
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public FormalParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParametersDeclaration(this);
		}
	}

	public final FormalParametersDeclarationContext formalParametersDeclaration() throws RecognitionException {
		FormalParametersDeclarationContext _localctx = new FormalParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(479);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(481);
				match(COMMA);
				setState(482);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(489);
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
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParameterDeclaration(this);
		}
	}

	public final FormalParameterDeclarationContext formalParameterDeclaration() throws RecognitionException {
		FormalParameterDeclarationContext _localctx = new FormalParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(491);
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
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(495);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				ArrayList<Annotation> anns = new ArrayList<Annotation>();
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(498);
						((BlockContext)_localctx).an = annotation();
						anns.add(((BlockContext)_localctx).an.an);
						}
						} 
					}
					setState(505);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(506);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s); ((BlockContext)_localctx).s.s.getAnnotations().addAll(anns);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
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
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
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
		public TerminalNode IF() { return getToken(TimedRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TimedRebecaCompleteParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(TimedRebecaCompleteParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(TimedRebecaCompleteParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(TimedRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(TimedRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(TimedRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(TimedRebecaCompleteParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(519);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(523);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(530);
				match(LPAREN);
				setState(531);
				((StatementContext)_localctx).e = expression(0);
				setState(532);
				match(RPAREN);
				setState(533);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(535);
					match(ELSE);
					setState(536);
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
				setState(541);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(543);
				match(LPAREN);
				setState(544);
				((StatementContext)_localctx).e = expression(0);
				setState(545);
				match(RPAREN);
				setState(546);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(549);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(551);
				match(LPAREN);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(552);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(557);
				match(SEMI);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(558);
					((StatementContext)_localctx).e = expression(0);
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(563);
				match(SEMI);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(564);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(569);
				match(RPAREN);
				setState(570);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(574);
				match(LPAREN);
				setState(575);
				((StatementContext)_localctx).e = expression(0);
				setState(576);
				match(RPAREN);
				setState(577);
				match(LBRACE);
				setState(578);
				((StatementContext)_localctx).sb = switchBlock();
				setState(579);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(582);
				((StatementContext)_localctx).RETURN = match(RETURN);
				((StatementContext)_localctx).s =  new ReturnStatement();
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(584);
					((StatementContext)_localctx).e = expression(0);
					((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e);
					}
				}

				setState(589);
				match(SEMI);
				_localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());
				    	 _localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(591);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(592);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(594);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(595);
				match(SEMI);
				((StatementContext)_localctx).s =  new ContinueStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(597);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forInit);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
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
		public List<TerminalNode> CASE() { return getTokens(TimedRebecaCompleteParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(TimedRebecaCompleteParser.CASE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(TimedRebecaCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TimedRebecaCompleteParser.COLON, i);
		}
		public TerminalNode DEFAULT() { return getToken(TimedRebecaCompleteParser.DEFAULT, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(639); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    		
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(611);
					((SwitchBlockContext)_localctx).an = annotation();
					anns.add(((SwitchBlockContext)_localctx).an.an);
					}
					}
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(619);
				match(CASE);
				setState(620);
				((SwitchBlockContext)_localctx).e = expression(0);
				setState(621);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(628);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(623);
								((SwitchBlockContext)_localctx).an = annotation();
								anns.add(((SwitchBlockContext)_localctx).an.an);
								}
								} 
							}
							setState(630);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						}
						setState(631);
						((SwitchBlockContext)_localctx).st = statement();

											((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns);
											_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1)
												.getStatements().add(((SwitchBlockContext)_localctx).st.s);
										
						}
						} 
					}
					setState(638);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				}
				}
				setState(641); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==MONKEYS_AT );
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(643);
				((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);
				setState(644);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(646);
							((SwitchBlockContext)_localctx).an = annotation();
							anns.add(((SwitchBlockContext)_localctx).an.an);
							}
							} 
						}
						setState(653);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					}
					setState(654);
					((SwitchBlockContext)_localctx).st = statement();
					((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns); _localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(661);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
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
		public TerminalNode MONKEYS_AT() { return getToken(TimedRebecaCompleteParser.MONKEYS_AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(668);
			match(MONKEYS_AT);
			setState(669);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(671);
				match(LPAREN);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(672);
					((AnnotationContext)_localctx).exp = expression(0);
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(677);
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
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(682);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(687);
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
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(694);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(696);
				match(COMMA);
				setState(697);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
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
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(TimedRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(TimedRebecaCompleteParser.INTLITERAL, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(712); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(708);
					match(LBRACKET);
					setState(709);
					((DimensionsContext)_localctx).i = match(INTLITERAL);
					setState(710);
					match(RBRACKET);
					_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(714); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		public TerminalNode AMP() { return getToken(TimedRebecaCompleteParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(TimedRebecaCompleteParser.CARET, 0); }
		public TerminalNode BAR() { return getToken(TimedRebecaCompleteParser.BAR, 0); }
		public TerminalNode AMPAMP() { return getToken(TimedRebecaCompleteParser.AMPAMP, 0); }
		public TerminalNode BARBAR() { return getToken(TimedRebecaCompleteParser.BARBAR, 0); }
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(TimedRebecaCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExpression(this);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(717);
				((ExpressionContext)_localctx).ece = coreExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ece.e;
				}
				break;
			case 2:
				{
				setState(720);
				((ExpressionContext)_localctx).ue = unaryExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ue.e;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(792);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.me1 = _prevctx;
						_localctx.me1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(726);
						((ExpressionContext)_localctx).mo = multiplicativeOp();
						setState(727);
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
						setState(730);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(731);
						((ExpressionContext)_localctx).ado = additiveOp();
						setState(732);
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
						setState(735);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(736);
						((ExpressionContext)_localctx).so = shiftOp();
						setState(737);
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
						setState(740);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(741);
						((ExpressionContext)_localctx).ro = relationalOp();
						setState(742);
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
						setState(745);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(746);
						((ExpressionContext)_localctx).eo = equalityOp();
						setState(747);
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
						setState(750);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(751);
						((ExpressionContext)_localctx).AMP = match(AMP);
						setState(752);
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
						setState(755);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(756);
						((ExpressionContext)_localctx).CARET = match(CARET);
						setState(757);
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
						setState(760);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(761);
						((ExpressionContext)_localctx).BAR = match(BAR);
						setState(762);
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
						setState(765);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(766);
						((ExpressionContext)_localctx).AMPAMP = match(AMPAMP);
						setState(767);
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
						setState(770);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(771);
						((ExpressionContext)_localctx).BARBAR = match(BARBAR);
						setState(772);
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
						setState(775);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(776);
						match(QUES);
						setState(777);
						((ExpressionContext)_localctx).cee2 = expression(0);
						setState(778);
						match(COLON);
						setState(779);
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
						setState(782);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(783);
						((ExpressionContext)_localctx).ao = assignmentOperator();
						setState(784);
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
						setState(787);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(788);
						match(INSTANCEOF);
						setState(789);
						((ExpressionContext)_localctx).t = type();
						InstanceofExpression e3 = new InstanceofExpression(); e3.setValue(((ExpressionContext)_localctx).ie1.e); e3.setEvaluationType(((ExpressionContext)_localctx).t.t);
						                       e3.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE); e3.setLineNumber(((ExpressionContext)_localctx).t.t.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).t.t.getCharacter());
						                       ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					}
					} 
				}
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(TimedRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(TimedRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(TimedRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(TimedRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(TimedRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(TimedRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(TimedRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(TimedRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(TimedRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(TimedRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(TimedRebecaCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignmentOperator);
		try {
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(807);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(809);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(811);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(813);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(815);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(817);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(819);
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
		public TerminalNode STAR() { return getToken(TimedRebecaCompleteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(TimedRebecaCompleteParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(TimedRebecaCompleteParser.PERCENT, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMultiplicativeOp(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multiplicativeOp);
		try {
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				((MultiplicativeOpContext)_localctx).STAR = match(STAR);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).STAR!=null?((MultiplicativeOpContext)_localctx).STAR.getText():null);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				((MultiplicativeOpContext)_localctx).SLASH = match(SLASH);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).SLASH!=null?((MultiplicativeOpContext)_localctx).SLASH.getText():null);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
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
		public TerminalNode PLUS() { return getToken(TimedRebecaCompleteParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(TimedRebecaCompleteParser.SUB, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAdditiveOp(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_additiveOp);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				((AdditiveOpContext)_localctx).PLUS = match(PLUS);
				((AdditiveOpContext)_localctx).ado =  (((AdditiveOpContext)_localctx).PLUS!=null?((AdditiveOpContext)_localctx).PLUS.getText():null);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
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
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_relationalOp);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(838);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(841);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
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
		public List<TerminalNode> LT() { return getTokens(TimedRebecaCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(TimedRebecaCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(TimedRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TimedRebecaCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shiftOp);
		try {
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				match(LT);
				setState(850);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(GT);
				setState(853);
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
		public TerminalNode EQEQ() { return getToken(TimedRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(TimedRebecaCompleteParser.BANGEQ, 0); }
		public EqualityOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterEqualityOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitEqualityOp(this);
		}
	}

	public final EqualityOpContext equalityOp() throws RecognitionException {
		EqualityOpContext _localctx = new EqualityOpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_equalityOp);
		try {
			setState(861);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				((EqualityOpContext)_localctx).EQEQ = match(EQEQ);
				((EqualityOpContext)_localctx).eo =  (((EqualityOpContext)_localctx).EQEQ!=null?((EqualityOpContext)_localctx).EQEQ.getText():null);
				}
				break;
			case BANGEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
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
		public TerminalNode PLUS() { return getToken(TimedRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TimedRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode TILDA() { return getToken(TimedRebecaCompleteParser.TILDA, 0); }
		public TerminalNode BANG() { return getToken(TimedRebecaCompleteParser.BANG, 0); }
		public CoreExpressionContext coreExpression() {
			return getRuleContext(CoreExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unaryExpression);
		try {
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				match(PLUS);
				setState(864);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(868);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(871);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(872);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(875);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(876);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case TILDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(879);
				((UnaryExpressionContext)_localctx).TILDA = match(TILDA);
				setState(880);
				((UnaryExpressionContext)_localctx).et = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).TILDA!=null?((UnaryExpressionContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).et.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).et.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).et.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(883);
				((UnaryExpressionContext)_localctx).BANG = match(BANG);
				setState(884);
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
				setState(887);
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
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(TimedRebecaCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(TimedRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TimedRebecaCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
		public CoreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterCoreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitCoreExpression(this);
		}
	}

	public final CoreExpressionContext coreExpression() throws RecognitionException {
		CoreExpressionContext _localctx = new CoreExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_coreExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(892);
				((CoreExpressionContext)_localctx).ec = castExpression();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ec.e;
				}
				break;
			case 2:
				{
				setState(895);
				match(LPAREN);
				setState(896);
				((CoreExpressionContext)_localctx).ep = expression(0);
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ep.e;
				setState(898);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(900);
				((CoreExpressionContext)_localctx).p = primary();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).p.tp;
				}
				break;
			case 4:
				{
				setState(903);
				((CoreExpressionContext)_localctx).l = literal();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).l.l;
				}
				break;
			case 5:
				{
				setState(906);
				((CoreExpressionContext)_localctx).QUES = match(QUES);
				setState(907);
				match(LPAREN);
				setState(908);
				((CoreExpressionContext)_localctx).el = expressionList();
				setState(909);
				match(RPAREN);
				((CoreExpressionContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((CoreExpressionContext)_localctx).el.el);
					    	_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).QUES.getCharPositionInLine());
				}
				break;
			case 6:
				{
				setState(912);
				match(NEW);
				setState(913);
				((CoreExpressionContext)_localctx).t = type();
				((CoreExpressionContext)_localctx).e =  new RebecInstantiationPrimary();
								_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((CoreExpressionContext)_localctx).t.t);
				setState(915);
				match(LPAREN);
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(916);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(921);
				match(RPAREN);
				setState(922);
				match(COLON);
				setState(923);
				match(LPAREN);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(924);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(929);
				match(RPAREN);
				}
				break;
			}
			setState(939);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(933);
					((CoreExpressionContext)_localctx).DOT = match(DOT);
					setState(934);
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
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(942);
				((CoreExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((CoreExpressionContext)_localctx).e = pse;
				        		pse.setLineNumber(((CoreExpressionContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((CoreExpressionContext)_localctx).PLUSPLUS.getCharPositionInLine());
				}
				break;
			case 2:
				{
				setState(944);
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
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(LPAREN);
			setState(949);
			((CastExpressionContext)_localctx).t = type();
			setState(950);
			match(RPAREN);
			setState(951);
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
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(955);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
			((ExpressionListContext)_localctx).e = expression(0);
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(965);
				match(COMMA);
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(966);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(974);
				((ExpressionListContext)_localctx).e = expression(0);
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(981);
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
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(TimedRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(TimedRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(TimedRebecaCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(TimedRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(TimedRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TimedRebecaCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(TimedRebecaCompleteParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(988);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(990);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(992);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(994);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(996);
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
		case 33:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u03eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\5\2`\n\2\3\2\3\2\5\2d\n\2\3\2\5\2g\n\2\5"+
		"\2i\n\2\3\2\3\2\3\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\3\5\7\5\u0087"+
		"\n\5\f\5\16\5\u008a\13\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7"+
		"\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00b0\n\b"+
		"\r\b\16\b\u00b1\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c0"+
		"\n\n\f\n\16\n\u00c3\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00cc\n"+
		"\13\f\13\16\13\u00cf\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d8"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e0\n\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\7\f\u00e9\n\f\f\f\16\f\u00ec\13\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00f9\n\r\f\r\16\r\u00fc\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0105\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u010d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0117\n\20\f"+
		"\20\16\20\u011a\13\20\5\20\u011c\n\20\3\20\3\20\3\21\3\21\3\21\3\21\7"+
		"\21\u0124\n\21\f\21\16\21\u0127\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0132\n\21\f\21\16\21\u0135\13\21\5\21\u0137\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u013e\n\21\f\21\16\21\u0141\13\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u014a\n\21\f\21\16\21\u014d\13\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0156\n\22\f\22\16\22\u0159\13"+
		"\22\3\22\3\22\5\22\u015d\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0165"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u016d\n\22\f\22\16\22\u0170\13"+
		"\22\5\22\u0172\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u017f\n\22\f\22\16\22\u0182\13\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u018b\n\22\f\22\16\22\u018e\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u019a\n\22\f\22\16\22\u019d\13\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01aa\n\23"+
		"\3\24\3\24\3\24\3\24\7\24\u01b0\n\24\f\24\16\24\u01b3\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u01bb\n\25\f\25\16\25\u01be\13\25\3\25\3\25"+
		"\5\25\u01c2\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u01cb\n\26\f"+
		"\26\16\26\u01ce\13\26\3\26\3\26\5\26\u01d2\n\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u01dd\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u01e8\n\30\f\30\16\30\u01eb\13\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01f8\n\32\f\32\16\32\u01fb"+
		"\13\32\3\32\3\32\3\32\7\32\u0200\n\32\f\32\16\32\u0203\13\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u021e\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u022e"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u0234\n\33\3\33\3\33\3\33\3\33\5\33\u023a"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u024e\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u025a\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0262\n\34\3\35\3\35\3\35\3\35\3\35\7\35\u0269\n\35\f\35\16\35\u026c"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0275\n\35\f\35\16\35\u0278"+
		"\13\35\3\35\3\35\3\35\7\35\u027d\n\35\f\35\16\35\u0280\13\35\6\35\u0282"+
		"\n\35\r\35\16\35\u0283\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u028c\n\35\f"+
		"\35\16\35\u028f\13\35\3\35\3\35\3\35\7\35\u0294\n\35\f\35\16\35\u0297"+
		"\13\35\5\35\u0299\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\5\37\u02a6\n\37\3\37\5\37\u02a9\n\37\3 \3 \3 \3 \3 \5 \u02b0"+
		"\n \3 \3 \3 \5 \u02b5\n \3!\3!\3!\3!\3!\3!\3!\3!\7!\u02bf\n!\f!\16!\u02c2"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\6\"\u02cb\n\"\r\"\16\"\u02cc\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u02d6\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\7#\u031b\n#\f#\16#\u031e\13#\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0338\n$\3%\3%\3%"+
		"\3%\3%\3%\5%\u0340\n%\3&\3&\3&\3&\5&\u0346\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0352\n\'\3(\3(\3(\3(\3(\3(\5(\u035a\n(\3)\3)\3)"+
		"\3)\5)\u0360\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u037d\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u039a\n+\3+\3+"+
		"\3+\3+\3+\3+\5+\u03a2\n+\3+\3+\5+\u03a6\n+\3+\3+\3+\3+\7+\u03ac\n+\f+"+
		"\16+\u03af\13+\3+\3+\3+\3+\5+\u03b5\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\7"+
		"-\u03c1\n-\f-\16-\u03c4\13-\3-\3-\3-\3-\3-\3-\7-\u03cc\n-\f-\16-\u03cf"+
		"\13-\3-\3-\3-\7-\u03d4\n-\f-\16-\u03d7\13-\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u03e9\n.\3.\2\3D/\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\2\2\u0446\2\\\3"+
		"\2\2\2\4s\3\2\2\2\6x\3\2\2\2\b}\3\2\2\2\n\u008e\3\2\2\2\f\u0090\3\2\2"+
		"\2\16\u0092\3\2\2\2\20\u00b6\3\2\2\2\22\u00b8\3\2\2\2\24\u00c7\3\2\2\2"+
		"\26\u00e4\3\2\2\2\30\u00f1\3\2\2\2\32\u00fd\3\2\2\2\34\u010c\3\2\2\2\36"+
		"\u010e\3\2\2\2 \u011f\3\2\2\2\"\u0151\3\2\2\2$\u01a1\3\2\2\2&\u01ab\3"+
		"\2\2\2(\u01b6\3\2\2\2*\u01c6\3\2\2\2,\u01d7\3\2\2\2.\u01e0\3\2\2\2\60"+
		"\u01ec\3\2\2\2\62\u01f0\3\2\2\2\64\u0259\3\2\2\2\66\u0261\3\2\2\28\u0263"+
		"\3\2\2\2:\u029a\3\2\2\2<\u029d\3\2\2\2>\u02aa\3\2\2\2@\u02b6\3\2\2\2B"+
		"\u02c5\3\2\2\2D\u02d5\3\2\2\2F\u0337\3\2\2\2H\u033f\3\2\2\2J\u0345\3\2"+
		"\2\2L\u0351\3\2\2\2N\u0359\3\2\2\2P\u035f\3\2\2\2R\u037c\3\2\2\2T\u03a5"+
		"\3\2\2\2V\u03b6\3\2\2\2X\u03bc\3\2\2\2Z\u03e8\3\2\2\2\\h\7]\2\2]_\7\60"+
		"\2\2^`\5X-\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\61\2\2bd\5\4\3\2cb\3\2"+
		"\2\2cd\3\2\2\2df\3\2\2\2eg\5\6\4\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2h]\3\2"+
		"\2\2hi\3\2\2\2ip\3\2\2\2jk\7\64\2\2kl\5D#\2lm\7\65\2\2mo\3\2\2\2nj\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\3\3\2\2\2rp\3\2\2\2st\7\3\2\2tu\7"+
		"\60\2\2uv\5D#\2vw\7\61\2\2w\5\3\2\2\2xy\7\4\2\2yz\7\60\2\2z{\5D#\2{|\7"+
		"\61\2\2|\7\3\2\2\2}\u0081\b\5\1\2~\177\5\n\6\2\177\u0080\b\5\1\2\u0080"+
		"\u0082\3\2\2\2\u0081~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0088\3\2\2\2"+
		"\u0083\u0084\5\f\7\2\u0084\u0085\b\5\1\2\u0085\u0087\3\2\2\2\u0086\u0083"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u008d\b"+
		"\5\1\2\u008d\t\3\2\2\2\u008e\u008f\7\30\2\2\u008f\13\3\2\2\2\u0090\u0091"+
		"\7\26\2\2\u0091\r\3\2\2\2\u0092\u0098\b\b\1\2\u0093\u0094\5\20\t\2\u0094"+
		"\u0095\b\b\1\2\u0095\u0097\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a6\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\7 \2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\66"+
		"\2\2\u009e\u009f\b\b\1\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\7!\2\2\u00a1"+
		"\u00a2\7]\2\2\u00a2\u00a3\7\66\2\2\u00a3\u00a5\b\b\1\2\u00a4\u009b\3\2"+
		"\2\2\u00a4\u00a0\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00af\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\5\""+
		"\22\2\u00aa\u00ab\b\b\1\2\u00ab\u00b0\3\2\2\2\u00ac\u00ad\5 \21\2\u00ad"+
		"\u00ae\b\b\1\2\u00ae\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ac\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\b\b\1\2\u00b5\17\3\2\2"+
		"\2\u00b6\u00b7\7\34\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\b\n\1\2\u00b9\u00ba"+
		"\7)\2\2\u00ba\u00bb\b\n\1\2\u00bb\u00c1\7\62\2\2\u00bc\u00bd\5\24\13\2"+
		"\u00bd\u00be\b\n\1\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7\63\2\2\u00c5\u00c6\b\n\1\2\u00c6\23\3\2\2"+
		"\2\u00c7\u00cd\b\13\1\2\u00c8\u00c9\5<\37\2\u00c9\u00ca\b\13\1\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\5> \2\u00d1\u00d2\7]\2\2\u00d2\u00d3\b\13\1\2\u00d3\u00d7\7\60"+
		"\2\2\u00d4\u00d5\5X-\2\u00d5\u00d6\b\13\1\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\61"+
		"\2\2\u00da\u00db\7=\2\2\u00db\u00df\7\60\2\2\u00dc\u00dd\5X-\2\u00dd\u00de"+
		"\b\13\1\2\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7\66\2\2\u00e3\25"+
		"\3\2\2\2\u00e4\u00ea\b\f\1\2\u00e5\u00e6\5<\37\2\u00e6\u00e7\b\f\1\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\5> \2\u00ee\u00ef\5\30\r\2\u00ef\u00f0\b\f\1\2\u00f0\27\3\2\2\2"+
		"\u00f1\u00f2\b\r\1\2\u00f2\u00f3\5\32\16\2\u00f3\u00fa\b\r\1\2\u00f4\u00f5"+
		"\7\67\2\2\u00f5\u00f6\5\32\16\2\u00f6\u00f7\b\r\1\2\u00f7\u00f9\3\2\2"+
		"\2\u00f8\u00f4\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\b\16\1\2\u00fe"+
		"\u00ff\7]\2\2\u00ff\u0104\b\16\1\2\u0100\u0101\79\2\2\u0101\u0102\5\34"+
		"\17\2\u0102\u0103\b\16\1\2\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\33\3\2\2\2\u0106\u0107\5\36\20\2\u0107\u0108\b\17"+
		"\1\2\u0108\u010d\3\2\2\2\u0109\u010a\5D#\2\u010a\u010b\b\17\1\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010d\35\3\2\2"+
		"\2\u010e\u010f\b\20\1\2\u010f\u011b\7\62\2\2\u0110\u0111\5\34\17\2\u0111"+
		"\u0118\b\20\1\2\u0112\u0113\7\67\2\2\u0113\u0114\5\34\17\2\u0114\u0115"+
		"\b\20\1\2\u0115\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0117\u011a\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u0110\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\7\63\2\2\u011e\37\3\2\2\2\u011f\u0125\b\21\1\2\u0120\u0121\5<\37"+
		"\2\u0121\u0122\b\21\1\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7$\2\2\u0129\u012a\7]\2\2\u012a\u0136"+
		"\b\21\1\2\u012b\u012c\7&\2\2\u012c\u012d\7]\2\2\u012d\u0133\b\21\1\2\u012e"+
		"\u012f\7\67\2\2\u012f\u0130\7]\2\2\u0130\u0132\b\21\1\2\u0131\u012e\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u012b\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u014b\7\62\2\2\u0139\u013f\b\21\1\2\u013a"+
		"\u013b\5<\37\2\u013b\u013c\b\21\1\2\u013c\u013e\3\2\2\2\u013d\u013a\3"+
		"\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7(\2\2\u0143\u0144\7]\2"+
		"\2\u0144\u0145\b\21\1\2\u0145\u0146\5,\27\2\u0146\u0147\b\21\1\2\u0147"+
		"\u0148\7\66\2\2\u0148\u014a\3\2\2\2\u0149\u0139\3\2\2\2\u014a\u014d\3"+
		"\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7\63\2\2\u014f\u0150\b\21\1\2\u0150!\3\2\2"+
		"\2\u0151\u0157\b\22\1\2\u0152\u0153\5<\37\2\u0153\u0154\b\22\1\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0152\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015b\7%\2\2\u015b\u015d\b\22\1\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7#\2\2\u015f\u0160\7]\2\2\u0160\u0164"+
		"\b\22\1\2\u0161\u0162\7&\2\2\u0162\u0163\7]\2\2\u0163\u0165\b\22\1\2\u0164"+
		"\u0161\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0171\3\2\2\2\u0166\u0167\7\'"+
		"\2\2\u0167\u0168\7]\2\2\u0168\u016e\b\22\1\2\u0169\u016a\7\67\2\2\u016a"+
		"\u016b\7]\2\2\u016b\u016d\b\22\1\2\u016c\u0169\3\2\2\2\u016d\u0170\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0166\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0174\7\60\2\2\u0174\u0175\7\5\2\2\u0175\u0176\b\22\1\2\u0176"+
		"\u0177\7\61\2\2\u0177\u019b\7\62\2\2\u0178\u0179\7+\2\2\u0179\u0180\7"+
		"\62\2\2\u017a\u017b\5\26\f\2\u017b\u017c\b\22\1\2\u017c\u017d\7\66\2\2"+
		"\u017d\u017f\3\2\2\2\u017e\u017a\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u019a\7\63\2\2\u0184\u0185\7*\2\2\u0185\u018c\7\62\2\2\u0186\u0187\5"+
		"\26\f\2\u0187\u0188\b\22\1\2\u0188\u0189\7\66\2\2\u0189\u018b\3\2\2\2"+
		"\u018a\u0186\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u019a\7\63\2\2"+
		"\u0190\u0191\5&\24\2\u0191\u0192\b\22\1\2\u0192\u019a\3\2\2\2\u0193\u0194"+
		"\5(\25\2\u0194\u0195\b\22\1\2\u0195\u019a\3\2\2\2\u0196\u0197\5*\26\2"+
		"\u0197\u0198\b\22\1\2\u0198\u019a\3\2\2\2\u0199\u0178\3\2\2\2\u0199\u0184"+
		"\3\2\2\2\u0199\u0190\3\2\2\2\u0199\u0193\3\2\2\2\u0199\u0196\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7\63\2\2\u019f\u01a0\b\22\1\2\u01a0"+
		"#\3\2\2\2\u01a1\u01a2\7]\2\2\u01a2\u01a3\b\23\1\2\u01a3\u01a4\5,\27\2"+
		"\u01a4\u01a9\b\23\1\2\u01a5\u01a6\5\62\32\2\u01a6\u01a7\b\23\1\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01aa\7\66\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a8\3"+
		"\2\2\2\u01aa%\3\2\2\2\u01ab\u01b1\b\24\1\2\u01ac\u01ad\5<\37\2\u01ad\u01ae"+
		"\b\24\1\2\u01ae\u01b0\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0\u01b3\3\2\2\2"+
		"\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u01b5\5$\23\2\u01b5\'\3\2\2\2\u01b6\u01bc\b\25\1\2\u01b7"+
		"\u01b8\5<\37\2\u01b8\u01b9\b\25\1\2\u01b9\u01bb\3\2\2\2\u01ba\u01b7\3"+
		"\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c1\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7%\2\2\u01c0\u01c2\b\25"+
		"\1\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\7(\2\2\u01c4\u01c5\5$\23\2\u01c5)\3\2\2\2\u01c6\u01cc\b\26\1\2"+
		"\u01c7\u01c8\5<\37\2\u01c8\u01c9\b\26\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01c7"+
		"\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01d1\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7%\2\2\u01d0\u01d2\b\26"+
		"\1\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\5> \2\u01d4\u01d5\b\26\1\2\u01d5\u01d6\5$\23\2\u01d6+\3\2\2\2\u01d7"+
		"\u01d8\b\27\1\2\u01d8\u01dc\7\60\2\2\u01d9\u01da\5.\30\2\u01da\u01db\b"+
		"\27\1\2\u01db\u01dd\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\7\61\2\2\u01df-\3\2\2\2\u01e0\u01e1\b\30\1"+
		"\2\u01e1\u01e2\5\60\31\2\u01e2\u01e9\b\30\1\2\u01e3\u01e4\7\67\2\2\u01e4"+
		"\u01e5\5\60\31\2\u01e5\u01e6\b\30\1\2\u01e6\u01e8\3\2\2\2\u01e7\u01e3"+
		"\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"/\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\5> \2\u01ed\u01ee\7]\2\2\u01ee"+
		"\u01ef\b\31\1\2\u01ef\61\3\2\2\2\u01f0\u01f1\b\32\1\2\u01f1\u01f2\7\62"+
		"\2\2\u01f2\u0201\b\32\1\2\u01f3\u01f9\b\32\1\2\u01f4\u01f5\5<\37\2\u01f5"+
		"\u01f6\b\32\1\2\u01f6\u01f8\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8\u01fb\3"+
		"\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fd\5\64\33\2\u01fd\u01fe\b\32\1\2\u01fe\u0200"+
		"\3\2\2\2\u01ff\u01f3\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7\63"+
		"\2\2\u0205\u0206\b\32\1\2\u0206\63\3\2\2\2\u0207\u0208\5:\36\2\u0208\u0209"+
		"\b\33\1\2\u0209\u020a\7\66\2\2\u020a\u025a\3\2\2\2\u020b\u020c\5\26\f"+
		"\2\u020c\u020d\b\33\1\2\u020d\u020e\7\66\2\2\u020e\u025a\3\2\2\2\u020f"+
		"\u0210\5\62\32\2\u0210\u0211\b\33\1\2\u0211\u025a\3\2\2\2\u0212\u0213"+
		"\7\25\2\2\u0213\u0214\b\33\1\2\u0214\u0215\7\60\2\2\u0215\u0216\5D#\2"+
		"\u0216\u0217\7\61\2\2\u0217\u0218\5\64\33\2\u0218\u021d\b\33\1\2\u0219"+
		"\u021a\7\22\2\2\u021a\u021b\5\64\33\2\u021b\u021c\b\33\1\2\u021c\u021e"+
		"\3\2\2\2\u021d\u0219\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u025a\3\2\2\2\u021f"+
		"\u0220\7\37\2\2\u0220\u0221\b\33\1\2\u0221\u0222\7\60\2\2\u0222\u0223"+
		"\5D#\2\u0223\u0224\7\61\2\2\u0224\u0225\5\64\33\2\u0225\u0226\b\33\1\2"+
		"\u0226\u025a\3\2\2\2\u0227\u0228\7\23\2\2\u0228\u0229\b\33\1\2\u0229\u022d"+
		"\7\60\2\2\u022a\u022b\5\66\34\2\u022b\u022c\b\33\1\2\u022c\u022e\3\2\2"+
		"\2\u022d\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0233"+
		"\7\66\2\2\u0230\u0231\5D#\2\u0231\u0232\b\33\1\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0230\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0239\7\66"+
		"\2\2\u0236\u0237\5X-\2\u0237\u0238\b\33\1\2\u0238\u023a\3\2\2\2\u0239"+
		"\u0236\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\61"+
		"\2\2\u023c\u023d\5\64\33\2\u023d\u023e\b\33\1\2\u023e\u025a\3\2\2\2\u023f"+
		"\u0240\7\36\2\2\u0240\u0241\7\60\2\2\u0241\u0242\5D#\2\u0242\u0243\7\61"+
		"\2\2\u0243\u0244\7\62\2\2\u0244\u0245\58\35\2\u0245\u0246\7\63\2\2\u0246"+
		"\u0247\b\33\1\2\u0247\u025a\3\2\2\2\u0248\u0249\7\35\2\2\u0249\u024d\b"+
		"\33\1\2\u024a\u024b\5D#\2\u024b\u024c\b\33\1\2\u024c\u024e\3\2\2\2\u024d"+
		"\u024a\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7\66"+
		"\2\2\u0250\u025a\b\33\1\2\u0251\u0252\7\r\2\2\u0252\u0253\7\66\2\2\u0253"+
		"\u025a\b\33\1\2\u0254\u0255\7\20\2\2\u0255\u0256\7\66\2\2\u0256\u025a"+
		"\b\33\1\2\u0257\u0258\7\66\2\2\u0258\u025a\b\33\1\2\u0259\u0207\3\2\2"+
		"\2\u0259\u020b\3\2\2\2\u0259\u020f\3\2\2\2\u0259\u0212\3\2\2\2\u0259\u021f"+
		"\3\2\2\2\u0259\u0227\3\2\2\2\u0259\u023f\3\2\2\2\u0259\u0248\3\2\2\2\u0259"+
		"\u0251\3\2\2\2\u0259\u0254\3\2\2\2\u0259\u0257\3\2\2\2\u025a\65\3\2\2"+
		"\2\u025b\u025c\5\26\f\2\u025c\u025d\b\34\1\2\u025d\u0262\3\2\2\2\u025e"+
		"\u025f\5X-\2\u025f\u0260\b\34\1\2\u0260\u0262\3\2\2\2\u0261\u025b\3\2"+
		"\2\2\u0261\u025e\3\2\2\2\u0262\67\3\2\2\2\u0263\u0281\b\35\1\2\u0264\u026a"+
		"\b\35\1\2\u0265\u0266\5<\37\2\u0266\u0267\b\35\1\2\u0267\u0269\3\2\2\2"+
		"\u0268\u0265\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026e\7\16\2\2"+
		"\u026e\u026f\5D#\2\u026f\u0270\7=\2\2\u0270\u027e\b\35\1\2\u0271\u0272"+
		"\5<\37\2\u0272\u0273\b\35\1\2\u0273\u0275\3\2\2\2\u0274\u0271\3\2\2\2"+
		"\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\5\64\33\2\u027a\u027b\b\35\1"+
		"\2\u027b\u027d\3\2\2\2\u027c\u0276\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0281"+
		"\u0264\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u0298\3\2\2\2\u0285\u0286\7\21\2\2\u0286\u0287\7=\2\2\u0287"+
		"\u0295\b\35\1\2\u0288\u0289\5<\37\2\u0289\u028a\b\35\1\2\u028a\u028c\3"+
		"\2\2\2\u028b\u0288\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\5\64"+
		"\33\2\u0291\u0292\b\35\1\2\u0292\u0294\3\2\2\2\u0293\u028d\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0299\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0298\u0285\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"9\3\2\2\2\u029a\u029b\5D#\2\u029b\u029c\b\36\1\2\u029c;\3\2\2\2\u029d"+
		"\u029e\b\37\1\2\u029e\u029f\7U\2\2\u029f\u02a0\7]\2\2\u02a0\u02a8\b\37"+
		"\1\2\u02a1\u02a5\7\60\2\2\u02a2\u02a3\5D#\2\u02a3\u02a4\b\37\1\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a9\7\61\2\2\u02a8\u02a1\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"=\3\2\2\2\u02aa\u02ab\7]\2\2\u02ab\u02af\b \1\2\u02ac\u02ad\5@!\2\u02ad"+
		"\u02ae\b \1\2\u02ae\u02b0\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02b0\3\2"+
		"\2\2\u02b0\u02b4\3\2\2\2\u02b1\u02b2\5B\"\2\u02b2\u02b3\b \1\2\u02b3\u02b5"+
		"\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5?\3\2\2\2\u02b6"+
		"\u02b7\7X\2\2\u02b7\u02b8\b!\1\2\u02b8\u02b9\5> \2\u02b9\u02c0\b!\1\2"+
		"\u02ba\u02bb\7\67\2\2\u02bb\u02bc\5> \2\u02bc\u02bd\b!\1\2\u02bd\u02bf"+
		"\3\2\2\2\u02be\u02ba\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7W"+
		"\2\2\u02c4A\3\2\2\2\u02c5\u02ca\b\"\1\2\u02c6\u02c7\7\64\2\2\u02c7\u02c8"+
		"\7\5\2\2\u02c8\u02c9\7\65\2\2\u02c9\u02cb\b\"\1\2\u02ca\u02c6\3\2\2\2"+
		"\u02cb\u02cc\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cdC\3"+
		"\2\2\2\u02ce\u02cf\b#\1\2\u02cf\u02d0\5T+\2\u02d0\u02d1\b#\1\2\u02d1\u02d6"+
		"\3\2\2\2\u02d2\u02d3\5R*\2\u02d3\u02d4\b#\1\2\u02d4\u02d6\3\2\2\2\u02d5"+
		"\u02ce\3\2\2\2\u02d5\u02d2\3\2\2\2\u02d6\u031c\3\2\2\2\u02d7\u02d8\f\17"+
		"\2\2\u02d8\u02d9\5H%\2\u02d9\u02da\5D#\20\u02da\u02db\b#\1\2\u02db\u031b"+
		"\3\2\2\2\u02dc\u02dd\f\16\2\2\u02dd\u02de\5J&\2\u02de\u02df\5D#\17\u02df"+
		"\u02e0\b#\1\2\u02e0\u031b\3\2\2\2\u02e1\u02e2\f\r\2\2\u02e2\u02e3\5N("+
		"\2\u02e3\u02e4\5D#\16\u02e4\u02e5\b#\1\2\u02e5\u031b\3\2\2\2\u02e6\u02e7"+
		"\f\f\2\2\u02e7\u02e8\5L\'\2\u02e8\u02e9\5D#\r\u02e9\u02ea\b#\1\2\u02ea"+
		"\u031b\3\2\2\2\u02eb\u02ec\f\n\2\2\u02ec\u02ed\5P)\2\u02ed\u02ee\5D#\13"+
		"\u02ee\u02ef\b#\1\2\u02ef\u031b\3\2\2\2\u02f0\u02f1\f\t\2\2\u02f1\u02f2"+
		"\7H\2\2\u02f2\u02f3\5D#\n\u02f3\u02f4\b#\1\2\u02f4\u031b\3\2\2\2\u02f5"+
		"\u02f6\f\b\2\2\u02f6\u02f7\7J\2\2\u02f7\u02f8\5D#\t\u02f8\u02f9\b#\1\2"+
		"\u02f9\u031b\3\2\2\2\u02fa\u02fb\f\7\2\2\u02fb\u02fc\7I\2\2\u02fc\u02fd"+
		"\5D#\b\u02fd\u02fe\b#\1\2\u02fe\u031b\3\2\2\2\u02ff\u0300\f\6\2\2\u0300"+
		"\u0301\7?\2\2\u0301\u0302\5D#\7\u0302\u0303\b#\1\2\u0303\u031b\3\2\2\2"+
		"\u0304\u0305\f\5\2\2\u0305\u0306\7@\2\2\u0306\u0307\5D#\6\u0307\u0308"+
		"\b#\1\2\u0308\u031b\3\2\2\2\u0309\u030a\f\4\2\2\u030a\u030b\7<\2\2\u030b"+
		"\u030c\5D#\2\u030c\u030d\7=\2\2\u030d\u030e\5D#\5\u030e\u030f\b#\1\2\u030f"+
		"\u031b\3\2\2\2\u0310\u0311\f\3\2\2\u0311\u0312\5F$\2\u0312\u0313\5D#\4"+
		"\u0313\u0314\b#\1\2\u0314\u031b\3\2\2\2\u0315\u0316\f\13\2\2\u0316\u0317"+
		"\7\"\2\2\u0317\u0318\5> \2\u0318\u0319\b#\1\2\u0319\u031b\3\2\2\2\u031a"+
		"\u02d7\3\2\2\2\u031a\u02dc\3\2\2\2\u031a\u02e1\3\2\2\2\u031a\u02e6\3\2"+
		"\2\2\u031a\u02eb\3\2\2\2\u031a\u02f0\3\2\2\2\u031a\u02f5\3\2\2\2\u031a"+
		"\u02fa\3\2\2\2\u031a\u02ff\3\2\2\2\u031a\u0304\3\2\2\2\u031a\u0309\3\2"+
		"\2\2\u031a\u0310\3\2\2\2\u031a\u0315\3\2\2\2\u031b\u031e\3\2\2\2\u031c"+
		"\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031dE\3\2\2\2\u031e\u031c\3\2\2\2"+
		"\u031f\u0320\79\2\2\u0320\u0338\b$\1\2\u0321\u0322\7L\2\2\u0322\u0338"+
		"\b$\1\2\u0323\u0324\7M\2\2\u0324\u0338\b$\1\2\u0325\u0326\7N\2\2\u0326"+
		"\u0338\b$\1\2\u0327\u0328\7O\2\2\u0328\u0338\b$\1\2\u0329\u032a\7P\2\2"+
		"\u032a\u0338\b$\1\2\u032b\u032c\7Q\2\2\u032c\u0338\b$\1\2\u032d\u032e"+
		"\7R\2\2\u032e\u0338\b$\1\2\u032f\u0330\7S\2\2\u0330\u0338\b$\1\2\u0331"+
		"\u0332\7T\2\2\u0332\u0338\b$\1\2\u0333\u0334\7Z\2\2\u0334\u0338\b$\1\2"+
		"\u0335\u0336\7\\\2\2\u0336\u0338\b$\1\2\u0337\u031f\3\2\2\2\u0337\u0321"+
		"\3\2\2\2\u0337\u0323\3\2\2\2\u0337\u0325\3\2\2\2\u0337\u0327\3\2\2\2\u0337"+
		"\u0329\3\2\2\2\u0337\u032b\3\2\2\2\u0337\u032d\3\2\2\2\u0337\u032f\3\2"+
		"\2\2\u0337\u0331\3\2\2\2\u0337\u0333\3\2\2\2\u0337\u0335\3\2\2\2\u0338"+
		"G\3\2\2\2\u0339\u033a\7F\2\2\u033a\u0340\b%\1\2\u033b\u033c\7G\2\2\u033c"+
		"\u0340\b%\1\2\u033d\u033e\7K\2\2\u033e\u0340\b%\1\2\u033f\u0339\3\2\2"+
		"\2\u033f\u033b\3\2\2\2\u033f\u033d\3\2\2\2\u0340I\3\2\2\2\u0341\u0342"+
		"\7D\2\2\u0342\u0346\b&\1\2\u0343\u0344\7E\2\2\u0344\u0346\b&\1\2\u0345"+
		"\u0341\3\2\2\2\u0345\u0343\3\2\2\2\u0346K\3\2\2\2\u0347\u0348\7X\2\2\u0348"+
		"\u0349\79\2\2\u0349\u0352\b\'\1\2\u034a\u034b\7W\2\2\u034b\u034c\79\2"+
		"\2\u034c\u0352\b\'\1\2\u034d\u034e\7X\2\2\u034e\u0352\b\'\1\2\u034f\u0350"+
		"\7W\2\2\u0350\u0352\b\'\1\2\u0351\u0347\3\2\2\2\u0351\u034a\3\2\2\2\u0351"+
		"\u034d\3\2\2\2\u0351\u034f\3\2\2\2\u0352M\3\2\2\2\u0353\u0354\7X\2\2\u0354"+
		"\u0355\7X\2\2\u0355\u035a\b(\1\2\u0356\u0357\7W\2\2\u0357\u0358\7W\2\2"+
		"\u0358\u035a\b(\1\2\u0359\u0353\3\2\2\2\u0359\u0356\3\2\2\2\u035aO\3\2"+
		"\2\2\u035b\u035c\7>\2\2\u035c\u0360\b)\1\2\u035d\u035e\7V\2\2\u035e\u0360"+
		"\b)\1\2\u035f\u035b\3\2\2\2\u035f\u035d\3\2\2\2\u0360Q\3\2\2\2\u0361\u0362"+
		"\7D\2\2\u0362\u0363\5R*\2\u0363\u0364\b*\1\2\u0364\u037d\3\2\2\2\u0365"+
		"\u0366\7E\2\2\u0366\u0367\5R*\2\u0367\u0368\b*\1\2\u0368\u037d\3\2\2\2"+
		"\u0369\u036a\7A\2\2\u036a\u036b\5R*\2\u036b\u036c\b*\1\2\u036c\u037d\3"+
		"\2\2\2\u036d\u036e\7B\2\2\u036e\u036f\5R*\2\u036f\u0370\b*\1\2\u0370\u037d"+
		"\3\2\2\2\u0371\u0372\7;\2\2\u0372\u0373\5R*\2\u0373\u0374\b*\1\2\u0374"+
		"\u037d\3\2\2\2\u0375\u0376\7:\2\2\u0376\u0377\5R*\2\u0377\u0378\b*\1\2"+
		"\u0378\u037d\3\2\2\2\u0379\u037a\5T+\2\u037a\u037b\b*\1\2\u037b\u037d"+
		"\3\2\2\2\u037c\u0361\3\2\2\2\u037c\u0365\3\2\2\2\u037c\u0369\3\2\2\2\u037c"+
		"\u036d\3\2\2\2\u037c\u0371\3\2\2\2\u037c\u0375\3\2\2\2\u037c\u0379\3\2"+
		"\2\2\u037dS\3\2\2\2\u037e\u037f\5V,\2\u037f\u0380\b+\1\2\u0380\u03a6\3"+
		"\2\2\2\u0381\u0382\7\60\2\2\u0382\u0383\5D#\2\u0383\u0384\b+\1\2\u0384"+
		"\u0385\7\61\2\2\u0385\u03a6\3\2\2\2\u0386\u0387\5\2\2\2\u0387\u0388\b"+
		"+\1\2\u0388\u03a6\3\2\2\2\u0389\u038a\5Z.\2\u038a\u038b\b+\1\2\u038b\u03a6"+
		"\3\2\2\2\u038c\u038d\7<\2\2\u038d\u038e\7\60\2\2\u038e\u038f\5X-\2\u038f"+
		"\u0390\7\61\2\2\u0390\u0391\b+\1\2\u0391\u03a6\3\2\2\2\u0392\u0393\7\27"+
		"\2\2\u0393\u0394\5> \2\u0394\u0395\b+\1\2\u0395\u0399\7\60\2\2\u0396\u0397"+
		"\5X-\2\u0397\u0398\b+\1\2\u0398\u039a\3\2\2\2\u0399\u0396\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\7\61\2\2\u039c\u039d\7"+
		"=\2\2\u039d\u03a1\7\60\2\2\u039e\u039f\5X-\2\u039f\u03a0\b+\1\2\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u039e\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2"+
		"\2\2\u03a3\u03a4\7\61\2\2\u03a4\u03a6\3\2\2\2\u03a5\u037e\3\2\2\2\u03a5"+
		"\u0381\3\2\2\2\u03a5\u0386\3\2\2\2\u03a5\u0389\3\2\2\2\u03a5\u038c\3\2"+
		"\2\2\u03a5\u0392\3\2\2\2\u03a6\u03ad\3\2\2\2\u03a7\u03a8\78\2\2\u03a8"+
		"\u03a9\5\2\2\2\u03a9\u03aa\b+\1\2\u03aa\u03ac\3\2\2\2\u03ab\u03a7\3\2"+
		"\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03b4\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\7A\2\2\u03b1\u03b5\b+\1"+
		"\2\u03b2\u03b3\7B\2\2\u03b3\u03b5\b+\1\2\u03b4\u03b0\3\2\2\2\u03b4\u03b2"+
		"\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5U\3\2\2\2\u03b6\u03b7\7\60\2\2\u03b7"+
		"\u03b8\5> \2\u03b8\u03b9\7\61\2\2\u03b9\u03ba\5D#\2\u03ba\u03bb\b,\1\2"+
		"\u03bbW\3\2\2\2\u03bc\u03c2\b-\1\2\u03bd\u03be\5<\37\2\u03be\u03bf\b-"+
		"\1\2\u03bf\u03c1\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2"+
		"\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c2\3\2"+
		"\2\2\u03c5\u03c6\5D#\2\u03c6\u03d5\b-\1\2\u03c7\u03cd\7\67\2\2\u03c8\u03c9"+
		"\5<\37\2\u03c9\u03ca\b-\1\2\u03ca\u03cc\3\2\2\2\u03cb\u03c8\3\2\2\2\u03cc"+
		"\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2"+
		"\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d1\5D#\2\u03d1\u03d2\b-\1\2\u03d2\u03d4"+
		"\3\2\2\2\u03d3\u03c7\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5"+
		"\u03d6\3\2\2\2\u03d6Y\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03d9\7\5\2\2"+
		"\u03d9\u03e9\b.\1\2\u03da\u03db\7\6\2\2\u03db\u03e9\b.\1\2\u03dc\u03dd"+
		"\7\7\2\2\u03dd\u03e9\b.\1\2\u03de\u03df\7\b\2\2\u03df\u03e9\b.\1\2\u03e0"+
		"\u03e1\7\t\2\2\u03e1\u03e9\b.\1\2\u03e2\u03e3\7-\2\2\u03e3\u03e9\b.\1"+
		"\2\u03e4\u03e5\7.\2\2\u03e5\u03e9\b.\1\2\u03e6\u03e7\7/\2\2\u03e7\u03e9"+
		"\b.\1\2\u03e8\u03d8\3\2\2\2\u03e8\u03da\3\2\2\2\u03e8\u03dc\3\2\2\2\u03e8"+
		"\u03de\3\2\2\2\u03e8\u03e0\3\2\2\2\u03e8\u03e2\3\2\2\2\u03e8\u03e4\3\2"+
		"\2\2\u03e8\u03e6\3\2\2\2\u03e9[\3\2\2\2W_cfhp\u0081\u0088\u0098\u00a4"+
		"\u00a6\u00af\u00b1\u00c1\u00cd\u00d7\u00df\u00ea\u00fa\u0104\u010c\u0118"+
		"\u011b\u0125\u0133\u0136\u013f\u014b\u0157\u015c\u0164\u016e\u0171\u0180"+
		"\u018c\u0199\u019b\u01a9\u01b1\u01bc\u01c1\u01cc\u01d1\u01dc\u01e9\u01f9"+
		"\u0201\u021d\u022d\u0233\u0239\u024d\u0259\u0261\u026a\u0276\u027e\u0283"+
		"\u028d\u0295\u0298\u02a5\u02a8\u02af\u02b4\u02c0\u02cc\u02d5\u031a\u031c"+
		"\u0337\u033f\u0345\u0351\u0359\u035f\u037c\u0399\u03a1\u03a5\u03ad\u03b4"+
		"\u03c2\u03cd\u03d5\u03e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}