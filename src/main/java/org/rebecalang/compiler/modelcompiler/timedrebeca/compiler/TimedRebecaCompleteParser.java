// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
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
public class TimedRebecaCompleteParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AFTER=1, DEADLINE=2, INTLITERAL=3, FLOATLITERAL=4, DOUBLELITERAL=5, CHARLITERAL=6, 
		STRINGLITERAL=7, WS=8, COMMENT=9, LINE_COMMENT=10, BREAK=11, CASE=12, 
		CLASS=13, CONTINUE=14, DEFAULT=15, ELSE=16, FOR=17, GOTO=18, IF=19, IMPORT=20, 
		NEW=21, PACKAGE=22, PRIVATE=23, PROTECTED=24, PUBLIC=25, RECORD=26, RETURN=27, 
		SWITCH=28, WHILE=29, ENV=30, INSTANCEOF=31, REACTIVECLASS=32, MSGSRV=33, 
		MAIN=34, STATEVARS=35, KNOWNREBECS=36, THIS=37, TRUE=38, FALSE=39, NULL=40, 
		LPAREN=41, RPAREN=42, LBRACE=43, RBRACE=44, LBRACKET=45, RBRACKET=46, 
		SEMI=47, COMMA=48, DOT=49, EQ=50, BANG=51, TILDA=52, QUES=53, COLON=54, 
		EQEQ=55, AMPAMP=56, BARBAR=57, PLUSPLUS=58, SUBSUB=59, SUPER=60, PLUS=61, 
		SUB=62, STAR=63, SLASH=64, AMP=65, BAR=66, CARET=67, PERCENT=68, PLUSEQ=69, 
		SUBEQ=70, STAREQ=71, SLASHEQ=72, AMPEQ=73, BAREQ=74, CARETEQ=75, TILDAEQ=76, 
		PERCENTEQ=77, MONKEYS_AT=78, BANGEQ=79, GT=80, LT=81, LTLT=82, LTLTEQ=83, 
		GTGT=84, GTGTEQ=85, IDENTIFIER=86;
	public static final String[] tokenNames = {
		"<INVALID>", "'after'", "'deadline'", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", 
		"CHARLITERAL", "STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "'break'", 
		"'case'", "'class'", "'continue'", "'default'", "'else'", "'for'", "'goto'", 
		"'if'", "'import'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'record'", "'return'", "'switch'", "'while'", "'env'", "'instanceof'", 
		"'reactiveclass'", "'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", 
		"'this'", "'true'", "'false'", "'null'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'&&'", "'||'", "'++'", "'--'", "'super'", "'+'", "'-'", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'~='", "'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", "'<<='", 
		"'>>'", "'>>='", "IDENTIFIER"
	};
	public static final int
		RULE_primary = 0, RULE_rebecaModel = 1, RULE_packageDeclaration = 2, RULE_importDeclaration = 3, 
		RULE_rebecaCode = 4, RULE_recordDeclaration = 5, RULE_mainDeclaration = 6, 
		RULE_mainRebecDefinition = 7, RULE_environmentVariables = 8, RULE_fieldDeclaration = 9, 
		RULE_variableDeclarators = 10, RULE_variableDeclarator = 11, RULE_variableInitializer = 12, 
		RULE_arrayInitializer = 13, RULE_reactiveClassDeclaration = 14, RULE_methodDeclaration = 15, 
		RULE_constructorDeclaration = 16, RULE_msgsrvDeclaration = 17, RULE_synchMethodDeclaration = 18, 
		RULE_formalParameters = 19, RULE_formalParametersDeclaration = 20, RULE_formalParameterDeclaration = 21, 
		RULE_block = 22, RULE_statement = 23, RULE_forInit = 24, RULE_switchBlock = 25, 
		RULE_statementExpression = 26, RULE_annotation = 27, RULE_type = 28, RULE_dimensions = 29, 
		RULE_expression = 30, RULE_assignmentOperator = 31, RULE_conditionalExpression = 32, 
		RULE_conditionalOrExpression = 33, RULE_conditionalAndExpression = 34, 
		RULE_inclusiveOrExpression = 35, RULE_exclusiveOrExpression = 36, RULE_andExpression = 37, 
		RULE_equalityExpression = 38, RULE_instanceOfExpression = 39, RULE_relationalExpression = 40, 
		RULE_relationalOp = 41, RULE_shiftExpression = 42, RULE_shiftOp = 43, 
		RULE_additiveExpression = 44, RULE_multiplicativeExpression = 45, RULE_unaryExpression = 46, 
		RULE_unaryExpressionNotPlusMinus = 47, RULE_castExpression = 48, RULE_expressionList = 49, 
		RULE_literal = 50;
	public static final String[] ruleNames = {
		"primary", "rebecaModel", "packageDeclaration", "importDeclaration", "rebecaCode", 
		"recordDeclaration", "mainDeclaration", "mainRebecDefinition", "environmentVariables", 
		"fieldDeclaration", "variableDeclarators", "variableDeclarator", "variableInitializer", 
		"arrayInitializer", "reactiveClassDeclaration", "methodDeclaration", "constructorDeclaration", 
		"msgsrvDeclaration", "synchMethodDeclaration", "formalParameters", "formalParametersDeclaration", 
		"formalParameterDeclaration", "block", "statement", "forInit", "switchBlock", 
		"statementExpression", "annotation", "type", "dimensions", "expression", 
		"assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
		"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "expressionList", 
		"literal"
	};

	@Override
	public String getGrammarFileName() { return "TimedRebecaComplete.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public Token id1;
		public Token lp;
		public ExpressionListContext el;
		public ExpressionContext ef;
		public ExpressionContext ed;
		public ExpressionContext e2;
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public TerminalNode DEADLINE() { return getToken(TimedRebecaCompleteParser.DEADLINE, 0); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public TerminalNode AFTER() { return getToken(TimedRebecaCompleteParser.AFTER, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(102); ((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(128);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(104); ((PrimaryContext)_localctx).lp = match(LPAREN);
				TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(109);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(106); ((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(111); match(RPAREN);
				setState(118);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(112); match(AFTER);
					setState(113); match(LPAREN);
					setState(114); ((PrimaryContext)_localctx).ef = expression();
					setState(115); match(RPAREN);
					psp.setAfterExpression(((PrimaryContext)_localctx).ef.e);
					}
				}

				setState(126);
				_la = _input.LA(1);
				if (_la==DEADLINE) {
					{
					setState(120); match(DEADLINE);
					setState(121); match(LPAREN);
					setState(122); ((PrimaryContext)_localctx).ed = expression();
					setState(123); match(RPAREN);
					psp.setDeadlineExpression(((PrimaryContext)_localctx).ed.e);
					}
				}

				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(130); match(LBRACKET);
				setState(131); ((PrimaryContext)_localctx).e2 = expression();
				setState(132); match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(139);
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

	public static class RebecaModelContext extends ParserRuleContext {
		public RebecaModel r;
		public PackageDeclarationContext p;
		public ImportDeclarationContext i;
		public RebecaCodeContext t1;
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public RebecaCodeContext rebecaCode() {
			return getRuleContext(RebecaCodeContext.class,0);
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
		enterRule(_localctx, 2, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(144);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(141); ((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(146); ((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(154); ((RebecaModelContext)_localctx).t1 = rebecaCode();
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
		enterRule(_localctx, 4, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(PACKAGE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(IMPORT);
			}
		}
		catch (RecognitionException re) {
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
		public EnvironmentVariablesContext e;
		public ReactiveClassDeclarationContext rcd;
		public MainDeclarationContext md;
		public EnvironmentVariablesContext environmentVariables() {
			return getRuleContext(EnvironmentVariablesContext.class,0);
		}
		public List<ReactiveClassDeclarationContext> reactiveClassDeclaration() {
			return getRuleContexts(ReactiveClassDeclarationContext.class);
		}
		public RecordDeclarationContext recordDeclaration(int i) {
			return getRuleContext(RecordDeclarationContext.class,i);
		}
		public List<RecordDeclarationContext> recordDeclaration() {
			return getRuleContexts(RecordDeclarationContext.class);
		}
		public ReactiveClassDeclarationContext reactiveClassDeclaration(int i) {
			return getRuleContext(ReactiveClassDeclarationContext.class,i);
		}
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
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
		enterRule(_localctx, 8, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaCodeContext)_localctx).rc =  new RebecaCode();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(162); ((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(170); ((RebecaCodeContext)_localctx).e = environmentVariables();
			_localctx.rc.getEnvironmentVariables().addAll(((RebecaCodeContext)_localctx).e.fds);
			}
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173); ((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
				_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REACTIVECLASS || _la==MONKEYS_AT );
			setState(180); ((RebecaCodeContext)_localctx).md = mainDeclaration();
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
		enterRule(_localctx, 10, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(RECORD);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public MainRebecDefinitionContext mainRebecDefinition(int i) {
			return getRuleContext(MainRebecDefinitionContext.class,i);
		}
		public List<MainRebecDefinitionContext> mainRebecDefinition() {
			return getRuleContexts(MainRebecDefinitionContext.class);
		}
		public TerminalNode MAIN() { return getToken(TimedRebecaCompleteParser.MAIN, 0); }
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
		enterRule(_localctx, 12, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(186); ((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(188); match(LBRACE);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(189); ((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197); ((MainDeclarationContext)_localctx).RBRACE = match(RBRACE);
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
		public TypeContext t;
		public Token rebecName;
		public ExpressionListContext el;
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
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
		enterRule(_localctx, 14, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(201); ((MainRebecDefinitionContext)_localctx).t = type();
			setState(202); ((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(204); match(LPAREN);
			setState(208);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				setState(205); ((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(210); match(RPAREN);
			setState(211); match(COLON);
			setState(212); match(LPAREN);
			setState(216);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				setState(213); ((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(218); match(RPAREN);
			setState(219); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentVariablesContext extends ParserRuleContext {
		public List<FieldDeclaration> fds;
		public FieldDeclarationContext fd;
		public List<TerminalNode> ENV() { return getTokens(TimedRebecaCompleteParser.ENV); }
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode ENV(int i) {
			return getToken(TimedRebecaCompleteParser.ENV, i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public EnvironmentVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterEnvironmentVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitEnvironmentVariables(this);
		}
	}

	public final EnvironmentVariablesContext environmentVariables() throws RecognitionException {
		EnvironmentVariablesContext _localctx = new EnvironmentVariablesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_environmentVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((EnvironmentVariablesContext)_localctx).fds =  new ArrayList<FieldDeclaration>();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV) {
				{
				{
				setState(222); match(ENV);
				setState(223); ((EnvironmentVariablesContext)_localctx).fd = fieldDeclaration();
				_localctx.fds.add(((EnvironmentVariablesContext)_localctx).fd.fd);
				setState(225); match(SEMI);
				}
				}
				setState(231);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclaration fd;
		public AnnotationContext an;
		public TypeContext t;
		public VariableDeclaratorsContext vds;
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(233); ((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241); ((FieldDeclarationContext)_localctx).t = type();
			setState(242); ((FieldDeclarationContext)_localctx).vds = variableDeclarators();
			_localctx.fd.setType(((FieldDeclarationContext)_localctx).t.t); _localctx.fd.getVariableDeclarators().addAll(((FieldDeclarationContext)_localctx).vds.vds);
			    		_localctx.fd.setCharacter(((FieldDeclarationContext)_localctx).t.t.getCharacter()); _localctx.fd.setLineNumber(((FieldDeclarationContext)_localctx).t.t.getLineNumber());
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(246); ((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(248); match(COMMA);
				setState(249); ((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(256);
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
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 22, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(258); ((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(264);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(260); match(EQ);
				setState(261); ((VariableDeclaratorContext)_localctx).vi = variableInitializer();
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
		enterRule(_localctx, 24, RULE_variableInitializer);
		try {
			setState(272);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); ((VariableInitializerContext)_localctx).ai = arrayInitializer();
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
				setState(269); ((VariableInitializerContext)_localctx).e = expression();
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
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(275); ((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(287);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				setState(276); ((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(278); match(COMMA);
					setState(279); ((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(289); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public Token queueSize;
		public FieldDeclarationContext fd;
		public Token RBRACE;
		public ConstructorDeclarationContext cd;
		public MsgsrvDeclarationContext md;
		public SynchMethodDeclarationContext smd;
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaCompleteParser.LBRACE); }
		public MsgsrvDeclarationContext msgsrvDeclaration(int i) {
			return getRuleContext(MsgsrvDeclarationContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACE, i);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public List<MsgsrvDeclarationContext> msgsrvDeclaration() {
			return getRuleContexts(MsgsrvDeclarationContext.class);
		}
		public TerminalNode REACTIVECLASS() { return getToken(TimedRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACE, i);
		}
		public TerminalNode KNOWNREBECS() { return getToken(TimedRebecaCompleteParser.KNOWNREBECS, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaCompleteParser.RBRACE); }
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode STATEVARS() { return getToken(TimedRebecaCompleteParser.STATEVARS, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(292); ((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300); match(REACTIVECLASS);
			setState(301); ((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(303); match(LPAREN);
			setState(304); ((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(306); match(RPAREN);
			setState(307); match(LBRACE);
			setState(320);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(308); match(KNOWNREBECS);
				setState(309); match(LBRACE);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(310); ((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(312); match(SEMI);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319); ((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(334);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(322); match(STATEVARS);
				setState(323); match(LBRACE);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(324); ((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(326); match(SEMI);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333); ((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==IDENTIFIER) {
				{
				setState(345);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(336); ((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;

				case 2:
					{
					setState(339); ((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;

				case 3:
					{
					setState(342); ((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350); ((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
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
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 30, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); ((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(355); ((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(357); ((MethodDeclarationContext)_localctx).b = block();
			_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(361); methodDeclaration(_localctx.cd);
			}
		}
		catch (RecognitionException re) {
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode MSGSRV() { return getToken(TimedRebecaCompleteParser.MSGSRV, 0); }
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
		enterRule(_localctx, 34, RULE_msgsrvDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(364); match(MSGSRV);
			setState(365); methodDeclaration(_localctx.md);
			}
		}
		catch (RecognitionException re) {
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
		public TypeContext t;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 36, RULE_synchMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(368); ((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(370); methodDeclaration(_localctx.smd);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(373); match(LPAREN);
			setState(377);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(374); ((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(379); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public List<FormalParameterDeclarationContext> formalParameterDeclaration() {
			return getRuleContexts(FormalParameterDeclarationContext.class);
		}
		public FormalParameterDeclarationContext formalParameterDeclaration(int i) {
			return getRuleContext(FormalParameterDeclarationContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(382); ((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384); match(COMMA);
				setState(385); ((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(392);
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
		enterRule(_localctx, 42, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); ((FormalParameterDeclarationContext)_localctx).t = type();
			setState(394); ((FormalParameterDeclarationContext)_localctx).name = match(IDENTIFIER);

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
		public StatementContext s;
		public Token RBRACE;
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(398); ((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(400); ((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408); ((BlockContext)_localctx).RBRACE = match(RBRACE);
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
		public StatementExpressionContext se;
		public TerminalNode ELSE() { return getToken(TimedRebecaCompleteParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(TimedRebecaCompleteParser.IF, 0); }
		public TerminalNode BREAK() { return getToken(TimedRebecaCompleteParser.BREAK, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(TimedRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public TerminalNode FOR() { return getToken(TimedRebecaCompleteParser.FOR, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(TimedRebecaCompleteParser.WHILE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode RETURN() { return getToken(TimedRebecaCompleteParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode CONTINUE() { return getToken(TimedRebecaCompleteParser.CONTINUE, 0); }
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_statement);
		int _la;
		try {
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411); ((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(413); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415); ((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418); ((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(420); match(LPAREN);
				setState(421); ((StatementContext)_localctx).e = expression();
				setState(422); match(RPAREN);
				setState(423); ((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(429);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(425); match(ELSE);
					setState(426); ((StatementContext)_localctx).est = statement();
					((ConditionalStatement)_localctx.s).setElseStatement(((StatementContext)_localctx).est.s);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431); ((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(433); match(LPAREN);
				setState(434); ((StatementContext)_localctx).e = expression();
				setState(435); match(RPAREN);
				setState(436); ((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439); ((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(441); match(LPAREN);
				setState(445);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					setState(442); ((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(447); match(SEMI);
				setState(451);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(448); ((StatementContext)_localctx).e = expression();
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(453); match(SEMI);
				setState(457);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(454); ((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(459); match(RPAREN);
				setState(460); ((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(463); ((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(464); match(LPAREN);
				setState(465); ((StatementContext)_localctx).e = expression();
				setState(466); match(RPAREN);
				setState(467); match(LBRACE);
				setState(468); ((StatementContext)_localctx).sb = switchBlock();
				setState(469); match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(472); ((StatementContext)_localctx).RETURN = match(RETURN);
				setState(474);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(473); ((StatementContext)_localctx).e = expression();
					}
				}

				setState(476); match(SEMI);
				((StatementContext)_localctx).s =  new ReturnStatement(); ((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(478); ((StatementContext)_localctx).BREAK = match(BREAK);
				setState(479); match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(481); ((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(482); match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(484); match(SEMI);
				((StatementContext)_localctx).s =  new Statement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(486); ((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(488); match(SEMI);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
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
		enterRule(_localctx, 48, RULE_forInit);
		try {
			setState(498);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); ((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495); ((ForInitContext)_localctx).el = expressionList();
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
		public ExpressionContext e;
		public Token DEFAULT;
		public StatementContext st;
		public List<TerminalNode> CASE() { return getTokens(TimedRebecaCompleteParser.CASE); }
		public TerminalNode COLON(int i) {
			return getToken(TimedRebecaCompleteParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(TimedRebecaCompleteParser.COLON); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(TimedRebecaCompleteParser.DEFAULT); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CASE(int i) {
			return getToken(TimedRebecaCompleteParser.CASE, i);
		}
		public TerminalNode DEFAULT(int i) {
			return getToken(TimedRebecaCompleteParser.DEFAULT, i);
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
		enterRule(_localctx, 50, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				setState(508);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(502); match(CASE);
					setState(503); ((SwitchBlockContext)_localctx).e = expression();

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
					    			
					}
					break;
				case DEFAULT:
					{
					setState(506); ((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
					    			
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(510); match(COLON);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(511); ((SwitchBlockContext)_localctx).st = statement();
					_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(523);
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
		enterRule(_localctx, 52, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); ((StatementExpressionContext)_localctx).e = expression();
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
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 54, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(528); match(MONKEYS_AT);
			setState(529); ((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			setState(538);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(531); match(LPAREN);
				setState(535);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(532); ((AnnotationContext)_localctx).exp = expression();
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(537); match(RPAREN);
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
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypeContext)_localctx).t =  new PrimitiveType();
			setState(541); ((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(546);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(543); ((TypeContext)_localctx).ds = dimensions();
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
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(TimedRebecaCompleteParser.INTLITERAL); }
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
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
		enterRule(_localctx, 58, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(553); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(549); match(LBRACKET);
				setState(550); ((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(551); match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(555); 
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); ((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(559); ((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(560); ((ExpressionContext)_localctx).e2 = expression();
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
		public TerminalNode PERCENTEQ() { return getToken(TimedRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(TimedRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(TimedRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(TimedRebecaCompleteParser.GTGTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(TimedRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode BAREQ() { return getToken(TimedRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(TimedRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(TimedRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(TimedRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(TimedRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode STAREQ() { return getToken(TimedRebecaCompleteParser.STAREQ, 0); }
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
		enterRule(_localctx, 62, RULE_assignmentOperator);
		try {
			setState(589);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(565); ((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(567); ((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(569); ((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(571); ((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(573); ((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(575); ((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(577); ((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(579); ((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(581); ((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(583); ((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(585); ((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(587); ((AssignmentOperatorContext)_localctx).GTGTEQ = match(GTGTEQ);
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
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); ((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(599);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(593); match(QUES);
				setState(594); ((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(595); match(COLON);
				setState(596); ((ConditionalExpressionContext)_localctx).e3 = conditionalExpression();
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
		public List<TerminalNode> BARBAR() { return getTokens(TimedRebecaCompleteParser.BARBAR); }
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public TerminalNode BARBAR(int i) {
			return getToken(TimedRebecaCompleteParser.BARBAR, i);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601); ((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(603); ((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
					setState(604); ((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public List<TerminalNode> AMPAMP() { return getTokens(TimedRebecaCompleteParser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(TimedRebecaCompleteParser.AMPAMP, i);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612); ((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(614); ((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(615); ((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		public List<TerminalNode> BAR() { return getTokens(TimedRebecaCompleteParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(TimedRebecaCompleteParser.BAR, i);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623); ((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(625); ((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(626); ((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
			return getToken(TimedRebecaCompleteParser.CARET, i);
		}
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(TimedRebecaCompleteParser.CARET); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(634); ((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(636); ((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(637); ((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		public List<TerminalNode> AMP() { return getTokens(TimedRebecaCompleteParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(TimedRebecaCompleteParser.AMP, i);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645); ((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(647); ((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(648); ((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(655);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression e;
		public InstanceOfExpressionContext e1;
		public Token EQEQ;
		public Token BANGEQ;
		public InstanceOfExpressionContext e2;
		public TerminalNode EQEQ() { return getToken(TimedRebecaCompleteParser.EQEQ, 0); }
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public TerminalNode BANGEQ() { return getToken(TimedRebecaCompleteParser.BANGEQ, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656); ((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(668);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
				setState(663);
				switch (_input.LA(1)) {
				case EQEQ:
					{
					setState(659); ((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
					}
					break;
				case BANGEQ:
					{
					setState(661); ((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(665); ((EqualityExpressionContext)_localctx).e2 = instanceOfExpression();
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
		public TerminalNode INSTANCEOF() { return getToken(TimedRebecaCompleteParser.INSTANCEOF, 0); }
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); ((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
			setState(676);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(672); match(INSTANCEOF);
				setState(673); ((InstanceOfExpressionContext)_localctx).t = type();
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678); ((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(680); ((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(681); ((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(_localctx.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
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
		enterRule(_localctx, 82, RULE_relationalOp);
		try {
			setState(699);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689); ((RelationalOpContext)_localctx).LT = match(LT);
				setState(690); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692); ((RelationalOpContext)_localctx).GT = match(GT);
				setState(693); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(695); ((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(697); ((RelationalOpContext)_localctx).GT = match(GT);
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
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701); ((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(703); ((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(704); ((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(_localctx.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public List<TerminalNode> LT() { return getTokens(TimedRebecaCompleteParser.LT); }
		public List<TerminalNode> GT() { return getTokens(TimedRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TimedRebecaCompleteParser.GT, i);
		}
		public TerminalNode LT(int i) {
			return getToken(TimedRebecaCompleteParser.LT, i);
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
		enterRule(_localctx, 86, RULE_shiftOp);
		try {
			setState(718);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(712); match(LT);
				setState(713); match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(715); match(GT);
				setState(716); match(GT);
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
		public List<TerminalNode> SUB() { return getTokens(TimedRebecaCompleteParser.SUB); }
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public List<TerminalNode> PLUS() { return getTokens(TimedRebecaCompleteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TimedRebecaCompleteParser.PLUS, i);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public TerminalNode SUB(int i) {
			return getToken(TimedRebecaCompleteParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(720); ((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(727);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(723); ((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						e3.setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(725); ((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						e3.setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(729); ((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					e3.setRight(((AdditiveExpressionContext)_localctx).e2.e); ((AdditiveExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
			return getToken(TimedRebecaCompleteParser.STAR, i);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public List<TerminalNode> SLASH() { return getTokens(TimedRebecaCompleteParser.SLASH); }
		public TerminalNode PERCENT(int i) {
			return getToken(TimedRebecaCompleteParser.PERCENT, i);
		}
		public List<TerminalNode> STAR() { return getTokens(TimedRebecaCompleteParser.STAR); }
		public TerminalNode SLASH(int i) {
			return getToken(TimedRebecaCompleteParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(TimedRebecaCompleteParser.PERCENT); }
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737); ((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(746);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(740); ((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(742); ((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(744); ((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(748); ((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					e3.setRight(((MultiplicativeExpressionContext)_localctx).e2.e); ((MultiplicativeExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(755);
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
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUB() { return getToken(TimedRebecaCompleteParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TimedRebecaCompleteParser.PLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
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
		enterRule(_localctx, 92, RULE_unaryExpression);
		try {
			setState(775);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(756); match(PLUS);
				setState(757); ((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(760); ((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(761); ((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(764); ((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(765); ((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(768); ((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(769); ((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
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
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(772); ((UnaryExpressionContext)_localctx).eu = unaryExpressionNotPlusMinus();
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
		public TerminalNode TILDA() { return getToken(TimedRebecaCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(TimedRebecaCompleteParser.NEW, 0); }
		public TerminalNode DOT(int i) {
			return getToken(TimedRebecaCompleteParser.DOT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TimedRebecaCompleteParser.DOT); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
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
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public TerminalNode BANG() { return getToken(TimedRebecaCompleteParser.BANG, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			int _alt;
			setState(841);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(777); ((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(778); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(781); ((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(782); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).BANG!=null?((UnaryExpressionNotPlusMinusContext)_localctx).BANG.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
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
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(785); ((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;

				case 2:
					{
					setState(788); match(LPAREN);
					setState(789); ((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(791); match(RPAREN);
					}
					break;

				case 3:
					{
					setState(793); ((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;

				case 4:
					{
					setState(796); ((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;

				case 5:
					{
					setState(799); ((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(800); match(LPAREN);
					setState(801); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(802); match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;

				case 6:
					{
					setState(805); match(NEW);
					setState(806); ((UnaryExpressionNotPlusMinusContext)_localctx).t = type();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new RebecInstantiationPrimary();
									_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((UnaryExpressionNotPlusMinusContext)_localctx).t.t);
					setState(808); match(LPAREN);
					setState(812);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
						{
						setState(809); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(814); match(RPAREN);
					setState(815); match(COLON);
					setState(816); match(LPAREN);
					setState(820);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
						{
						setState(817); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(822); match(RPAREN);
					}
					break;
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(826); ((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(827); ((UnaryExpressionNotPlusMinusContext)_localctx).p2 = primary();

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
					setState(834);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(839);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(835); ((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;

				case 2:
					{
					setState(837); ((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB = match(SUBSUB);
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
		enterRule(_localctx, 96, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843); match(LPAREN);
			setState(844); ((CastExpressionContext)_localctx).t = type();
			setState(845); match(RPAREN);
			setState(846); ((CastExpressionContext)_localctx).e1 = expression();
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
		public ExpressionContext e;
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
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
		enterRule(_localctx, 98, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>();
			setState(850); ((ExpressionListContext)_localctx).e = expression();
			_localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(852); match(COMMA);
				setState(853); ((ExpressionListContext)_localctx).e = expression();
				_localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(860);
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
		public TerminalNode NULL() { return getToken(TimedRebecaCompleteParser.NULL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(TimedRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode FALSE() { return getToken(TimedRebecaCompleteParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(TimedRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(TimedRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(TimedRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(TimedRebecaCompleteParser.CHARLITERAL, 0); }
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
		enterRule(_localctx, 100, RULE_literal);
		try {
			setState(877);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(861); ((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(TypesUtilities.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(863); ((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(865); ((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(867); ((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(869); ((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(871); ((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(873); ((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(875); ((LiteralContext)_localctx).NULL = match(NULL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u0372\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2p\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2y\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0081\n\2\5\2\u0083\n\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\u008a\n\2\f\2\16\2\u008d\13\2\3\3\3\3\3\3\3\3\5\3\u0093"+
		"\n\3\3\3\3\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00a8\n\6\f\6\16\6\u00ab\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\6\6\u00b3\n\6\r\6\16\6\u00b4\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00db\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e6\n\n\f\n\16\n"+
		"\u00e9\13\n\3\13\3\13\3\13\3\13\7\13\u00ef\n\13\f\13\16\13\u00f2\13\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ff\n\f\f\f\16"+
		"\f\u0102\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010b\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0113\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u011d\n\17\f\17\16\17\u0120\13\17\5\17\u0122\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\7\20\u012a\n\20\f\20\16\20\u012d\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u013d\n\20"+
		"\f\20\16\20\u0140\13\20\3\20\5\20\u0143\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u014b\n\20\f\20\16\20\u014e\13\20\3\20\5\20\u0151\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u015c\n\20\f\20\16\20\u015f"+
		"\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u017c\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0187"+
		"\n\26\f\26\16\26\u018a\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\7\30\u0196\n\30\f\30\16\30\u0199\13\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u01b0\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01c0\n\31\3\31\3\31\3\31\3\31\5\31"+
		"\u01c6\n\31\3\31\3\31\3\31\3\31\5\31\u01cc\n\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01dd\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u01ed\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01f5\n\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ff\n\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0205\n\33\f\33\16\33\u0208\13\33\7\33\u020a\n\33\f\33\16\33\u020d"+
		"\13\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u021a"+
		"\n\35\3\35\5\35\u021d\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0225\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\6\37\u022c\n\37\r\37\16\37\u022d\3 \3 \3"+
		" \3 \3 \3 \5 \u0236\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0250\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u025a\n\"\3#\3#\3#\3#\3#\3#\7#\u0262\n#\f#\16#\u0265\13#\3$\3$\3"+
		"$\3$\3$\3$\7$\u026d\n$\f$\16$\u0270\13$\3%\3%\3%\3%\3%\3%\7%\u0278\n%"+
		"\f%\16%\u027b\13%\3&\3&\3&\3&\3&\3&\7&\u0283\n&\f&\16&\u0286\13&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\7\'\u028e\n\'\f\'\16\'\u0291\13\'\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u029a\n(\3(\3(\3(\5(\u029f\n(\3)\3)\3)\3)\3)\3)\5)\u02a7\n)\3"+
		"*\3*\3*\3*\3*\3*\7*\u02af\n*\f*\16*\u02b2\13*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u02be\n+\3,\3,\3,\3,\3,\3,\7,\u02c6\n,\f,\16,\u02c9\13,\3-\3"+
		"-\3-\3-\3-\3-\5-\u02d1\n-\3.\3.\3.\3.\3.\3.\3.\5.\u02da\n.\3.\3.\3.\7"+
		".\u02df\n.\f.\16.\u02e2\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02ed\n/\3/"+
		"\3/\3/\7/\u02f2\n/\f/\16/\u02f5\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u030a"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u032f\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u0337\n\61\3\61\3\61\5\61\u033b\n\61\3\61\3\61\3"+
		"\61\3\61\7\61\u0341\n\61\f\61\16\61\u0344\13\61\3\61\3\61\3\61\3\61\5"+
		"\61\u034a\n\61\5\61\u034c\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\7\63\u035b\n\63\f\63\16\63\u035e\13\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0370\n\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\2\u03ab\2h\3\2\2\2"+
		"\4\u008e\3\2\2\2\6\u009f\3\2\2\2\b\u00a1\3\2\2\2\n\u00a3\3\2\2\2\f\u00b9"+
		"\3\2\2\2\16\u00bb\3\2\2\2\20\u00ca\3\2\2\2\22\u00df\3\2\2\2\24\u00ea\3"+
		"\2\2\2\26\u00f7\3\2\2\2\30\u0103\3\2\2\2\32\u0112\3\2\2\2\34\u0114\3\2"+
		"\2\2\36\u0125\3\2\2\2 \u0163\3\2\2\2\"\u016a\3\2\2\2$\u016d\3\2\2\2&\u0171"+
		"\3\2\2\2(\u0176\3\2\2\2*\u017f\3\2\2\2,\u018b\3\2\2\2.\u018f\3\2\2\2\60"+
		"\u01ec\3\2\2\2\62\u01f4\3\2\2\2\64\u01f6\3\2\2\2\66\u020e\3\2\2\28\u0211"+
		"\3\2\2\2:\u021e\3\2\2\2<\u0226\3\2\2\2>\u022f\3\2\2\2@\u024f\3\2\2\2B"+
		"\u0251\3\2\2\2D\u025b\3\2\2\2F\u0266\3\2\2\2H\u0271\3\2\2\2J\u027c\3\2"+
		"\2\2L\u0287\3\2\2\2N\u0292\3\2\2\2P\u02a0\3\2\2\2R\u02a8\3\2\2\2T\u02bd"+
		"\3\2\2\2V\u02bf\3\2\2\2X\u02d0\3\2\2\2Z\u02d2\3\2\2\2\\\u02e3\3\2\2\2"+
		"^\u0309\3\2\2\2`\u034b\3\2\2\2b\u034d\3\2\2\2d\u0353\3\2\2\2f\u036f\3"+
		"\2\2\2hi\7X\2\2i\u0082\b\2\1\2jk\7+\2\2ko\b\2\1\2lm\5d\63\2mn\b\2\1\2"+
		"np\3\2\2\2ol\3\2\2\2op\3\2\2\2pq\3\2\2\2qx\7,\2\2rs\7\3\2\2st\7+\2\2t"+
		"u\5> \2uv\7,\2\2vw\b\2\1\2wy\3\2\2\2xr\3\2\2\2xy\3\2\2\2y\u0080\3\2\2"+
		"\2z{\7\4\2\2{|\7+\2\2|}\5> \2}~\7,\2\2~\177\b\2\1\2\177\u0081\3\2\2\2"+
		"\u0080z\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082j\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u008b\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086"+
		"\5> \2\u0086\u0087\7\60\2\2\u0087\u0088\b\2\1\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\3\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0092\b\3\1\2\u008f\u0090"+
		"\5\6\4\2\u0090\u0091\b\3\1\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0099\3\2\2\2\u0094\u0095\5\b\5\2\u0095\u0096\b\3"+
		"\1\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\5\n\6\2\u009d\u009e\b\3\1\2\u009e\5\3\2\2\2\u009f\u00a0"+
		"\7\30\2\2\u00a0\7\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2\t\3\2\2\2\u00a3\u00a9"+
		"\b\6\1\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6\b\6\1\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad"+
		"\u00ae\b\6\1\2\u00ae\u00b2\3\2\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\b"+
		"\6\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5\16"+
		"\b\2\u00b7\u00b8\b\6\1\2\u00b8\13\3\2\2\2\u00b9\u00ba\7\34\2\2\u00ba\r"+
		"\3\2\2\2\u00bb\u00bc\b\b\1\2\u00bc\u00bd\7$\2\2\u00bd\u00be\b\b\1\2\u00be"+
		"\u00c4\7-\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\b\b\1\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7."+
		"\2\2\u00c8\u00c9\b\b\1\2\u00c9\17\3\2\2\2\u00ca\u00cb\b\t\1\2\u00cb\u00cc"+
		"\5:\36\2\u00cc\u00cd\7X\2\2\u00cd\u00ce\b\t\1\2\u00ce\u00d2\7+\2\2\u00cf"+
		"\u00d0\5d\63\2\u00d0\u00d1\b\t\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5"+
		"\u00d6\78\2\2\u00d6\u00da\7+\2\2\u00d7\u00d8\5d\63\2\u00d8\u00d9\b\t\1"+
		"\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7\61\2\2\u00de\21\3\2\2\2\u00df"+
		"\u00e7\b\n\1\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\5\24\13\2\u00e2\u00e3\b"+
		"\n\1\2\u00e3\u00e4\7\61\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\23\3\2\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00ea\u00f0\b\13\1\2\u00eb\u00ec\58\35\2\u00ec"+
		"\u00ed\b\13\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\5:\36\2\u00f4\u00f5\5\26\f\2\u00f5\u00f6\b"+
		"\13\1\2\u00f6\25\3\2\2\2\u00f7\u00f8\b\f\1\2\u00f8\u00f9\5\30\r\2\u00f9"+
		"\u0100\b\f\1\2\u00fa\u00fb\7\62\2\2\u00fb\u00fc\5\30\r\2\u00fc\u00fd\b"+
		"\f\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\27\3\2\2\2\u0102\u0100\3\2\2"+
		"\2\u0103\u0104\b\r\1\2\u0104\u0105\7X\2\2\u0105\u010a\b\r\1\2\u0106\u0107"+
		"\7\64\2\2\u0107\u0108\5\32\16\2\u0108\u0109\b\r\1\2\u0109\u010b\3\2\2"+
		"\2\u010a\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b\31\3\2\2\2\u010c\u010d"+
		"\5\34\17\2\u010d\u010e\b\16\1\2\u010e\u0113\3\2\2\2\u010f\u0110\5> \2"+
		"\u0110\u0111\b\16\1\2\u0111\u0113\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010f"+
		"\3\2\2\2\u0113\33\3\2\2\2\u0114\u0115\b\17\1\2\u0115\u0121\7-\2\2\u0116"+
		"\u0117\5\32\16\2\u0117\u011e\b\17\1\2\u0118\u0119\7\62\2\2\u0119\u011a"+
		"\5\32\16\2\u011a\u011b\b\17\1\2\u011b\u011d\3\2\2\2\u011c\u0118\3\2\2"+
		"\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0116\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\7.\2\2\u0124\35\3\2\2\2\u0125\u012b\b\20\1"+
		"\2\u0126\u0127\58\35\2\u0127\u0128\b\20\1\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\"\2\2\u012f"+
		"\u0130\7X\2\2\u0130\u0131\b\20\1\2\u0131\u0132\7+\2\2\u0132\u0133\7\5"+
		"\2\2\u0133\u0134\b\20\1\2\u0134\u0135\7,\2\2\u0135\u0142\7-\2\2\u0136"+
		"\u0137\7&\2\2\u0137\u013e\7-\2\2\u0138\u0139\5\24\13\2\u0139\u013a\b\20"+
		"\1\2\u013a\u013b\7\61\2\2\u013b\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0143\7.\2\2\u0142\u0136\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0150\3\2\2\2\u0144\u0145\7%\2\2\u0145\u014c\7-\2"+
		"\2\u0146\u0147\5\24\13\2\u0147\u0148\b\20\1\2\u0148\u0149\7\61\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0146\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\7.\2\2\u0150\u0144\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u015d\3\2"+
		"\2\2\u0152\u0153\5\"\22\2\u0153\u0154\b\20\1\2\u0154\u015c\3\2\2\2\u0155"+
		"\u0156\5$\23\2\u0156\u0157\b\20\1\2\u0157\u015c\3\2\2\2\u0158\u0159\5"+
		"&\24\2\u0159\u015a\b\20\1\2\u015a\u015c\3\2\2\2\u015b\u0152\3\2\2\2\u015b"+
		"\u0155\3\2\2\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0161\7.\2\2\u0161\u0162\b\20\1\2\u0162\37\3\2\2\2\u0163\u0164\7X\2\2"+
		"\u0164\u0165\b\21\1\2\u0165\u0166\5(\25\2\u0166\u0167\b\21\1\2\u0167\u0168"+
		"\5.\30\2\u0168\u0169\b\21\1\2\u0169!\3\2\2\2\u016a\u016b\b\22\1\2\u016b"+
		"\u016c\5 \21\2\u016c#\3\2\2\2\u016d\u016e\b\23\1\2\u016e\u016f\7#\2\2"+
		"\u016f\u0170\5 \21\2\u0170%\3\2\2\2\u0171\u0172\b\24\1\2\u0172\u0173\5"+
		":\36\2\u0173\u0174\b\24\1\2\u0174\u0175\5 \21\2\u0175\'\3\2\2\2\u0176"+
		"\u0177\b\25\1\2\u0177\u017b\7+\2\2\u0178\u0179\5*\26\2\u0179\u017a\b\25"+
		"\1\2\u017a\u017c\3\2\2\2\u017b\u0178\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\7,\2\2\u017e)\3\2\2\2\u017f\u0180\b\26\1\2"+
		"\u0180\u0181\5,\27\2\u0181\u0188\b\26\1\2\u0182\u0183\7\62\2\2\u0183\u0184"+
		"\5,\27\2\u0184\u0185\b\26\1\2\u0185\u0187\3\2\2\2\u0186\u0182\3\2\2\2"+
		"\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189+\3"+
		"\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5:\36\2\u018c\u018d\7X\2\2\u018d"+
		"\u018e\b\27\1\2\u018e-\3\2\2\2\u018f\u0190\b\30\1\2\u0190\u0191\7-\2\2"+
		"\u0191\u0197\b\30\1\2\u0192\u0193\5\60\31\2\u0193\u0194\b\30\1\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0192\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019b\7.\2\2\u019b\u019c\b\30\1\2\u019c/\3\2\2\2\u019d\u019e\5\24\13"+
		"\2\u019e\u019f\b\31\1\2\u019f\u01a0\7\61\2\2\u01a0\u01ed\3\2\2\2\u01a1"+
		"\u01a2\5.\30\2\u01a2\u01a3\b\31\1\2\u01a3\u01ed\3\2\2\2\u01a4\u01a5\7"+
		"\25\2\2\u01a5\u01a6\b\31\1\2\u01a6\u01a7\7+\2\2\u01a7\u01a8\5> \2\u01a8"+
		"\u01a9\7,\2\2\u01a9\u01aa\5\60\31\2\u01aa\u01af\b\31\1\2\u01ab\u01ac\7"+
		"\22\2\2\u01ac\u01ad\5\60\31\2\u01ad\u01ae\b\31\1\2\u01ae\u01b0\3\2\2\2"+
		"\u01af\u01ab\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ed\3\2\2\2\u01b1\u01b2"+
		"\7\37\2\2\u01b2\u01b3\b\31\1\2\u01b3\u01b4\7+\2\2\u01b4\u01b5\5> \2\u01b5"+
		"\u01b6\7,\2\2\u01b6\u01b7\5\60\31\2\u01b7\u01b8\b\31\1\2\u01b8\u01ed\3"+
		"\2\2\2\u01b9\u01ba\7\23\2\2\u01ba\u01bb\b\31\1\2\u01bb\u01bf\7+\2\2\u01bc"+
		"\u01bd\5\62\32\2\u01bd\u01be\b\31\1\2\u01be\u01c0\3\2\2\2\u01bf\u01bc"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\7\61\2\2"+
		"\u01c2\u01c3\5> \2\u01c3\u01c4\b\31\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cb\7\61\2\2"+
		"\u01c8\u01c9\5d\63\2\u01c9\u01ca\b\31\1\2\u01ca\u01cc\3\2\2\2\u01cb\u01c8"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7,\2\2\u01ce"+
		"\u01cf\5\60\31\2\u01cf\u01d0\b\31\1\2\u01d0\u01ed\3\2\2\2\u01d1\u01d2"+
		"\7\36\2\2\u01d2\u01d3\7+\2\2\u01d3\u01d4\5> \2\u01d4\u01d5\7,\2\2\u01d5"+
		"\u01d6\7-\2\2\u01d6\u01d7\5\64\33\2\u01d7\u01d8\7.\2\2\u01d8\u01d9\b\31"+
		"\1\2\u01d9\u01ed\3\2\2\2\u01da\u01dc\7\35\2\2\u01db\u01dd\5> \2\u01dc"+
		"\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7\61"+
		"\2\2\u01df\u01ed\b\31\1\2\u01e0\u01e1\7\r\2\2\u01e1\u01e2\7\61\2\2\u01e2"+
		"\u01ed\b\31\1\2\u01e3\u01e4\7\20\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01ed"+
		"\b\31\1\2\u01e6\u01e7\7\61\2\2\u01e7\u01ed\b\31\1\2\u01e8\u01e9\5\66\34"+
		"\2\u01e9\u01ea\b\31\1\2\u01ea\u01eb\7\61\2\2\u01eb\u01ed\3\2\2\2\u01ec"+
		"\u019d\3\2\2\2\u01ec\u01a1\3\2\2\2\u01ec\u01a4\3\2\2\2\u01ec\u01b1\3\2"+
		"\2\2\u01ec\u01b9\3\2\2\2\u01ec\u01d1\3\2\2\2\u01ec\u01da\3\2\2\2\u01ec"+
		"\u01e0\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec\u01e8\3\2"+
		"\2\2\u01ed\61\3\2\2\2\u01ee\u01ef\5\24\13\2\u01ef\u01f0\b\32\1\2\u01f0"+
		"\u01f5\3\2\2\2\u01f1\u01f2\5d\63\2\u01f2\u01f3\b\32\1\2\u01f3\u01f5\3"+
		"\2\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5\63\3\2\2\2\u01f6"+
		"\u020b\b\33\1\2\u01f7\u01fe\b\33\1\2\u01f8\u01f9\7\16\2\2\u01f9\u01fa"+
		"\5> \2\u01fa\u01fb\b\33\1\2\u01fb\u01ff\3\2\2\2\u01fc\u01fd\7\21\2\2\u01fd"+
		"\u01ff\b\33\1\2\u01fe\u01f8\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\3"+
		"\2\2\2\u0200\u0206\78\2\2\u0201\u0202\5\60\31\2\u0202\u0203\b\33\1\2\u0203"+
		"\u0205\3\2\2\2\u0204\u0201\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0209"+
		"\u01f7\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\65\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\5> \2\u020f\u0210"+
		"\b\34\1\2\u0210\67\3\2\2\2\u0211\u0212\b\35\1\2\u0212\u0213\7P\2\2\u0213"+
		"\u0214\7X\2\2\u0214\u021c\b\35\1\2\u0215\u0219\7+\2\2\u0216\u0217\5> "+
		"\2\u0217\u0218\b\35\1\2\u0218\u021a\3\2\2\2\u0219\u0216\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\7,\2\2\u021c\u0215\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d9\3\2\2\2\u021e\u021f\b\36\1\2\u021f\u0220"+
		"\7X\2\2\u0220\u0224\b\36\1\2\u0221\u0222\5<\37\2\u0222\u0223\b\36\1\2"+
		"\u0223\u0225\3\2\2\2\u0224\u0221\3\2\2\2\u0224\u0225\3\2\2\2\u0225;\3"+
		"\2\2\2\u0226\u022b\b\37\1\2\u0227\u0228\7/\2\2\u0228\u0229\7\5\2\2\u0229"+
		"\u022a\7\60\2\2\u022a\u022c\b\37\1\2\u022b\u0227\3\2\2\2\u022c\u022d\3"+
		"\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e=\3\2\2\2\u022f\u0230"+
		"\5B\"\2\u0230\u0235\b \1\2\u0231\u0232\5@!\2\u0232\u0233\5> \2\u0233\u0234"+
		"\b \1\2\u0234\u0236\3\2\2\2\u0235\u0231\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"?\3\2\2\2\u0237\u0238\7\64\2\2\u0238\u0250\b!\1\2\u0239\u023a\7G\2\2\u023a"+
		"\u0250\b!\1\2\u023b\u023c\7H\2\2\u023c\u0250\b!\1\2\u023d\u023e\7I\2\2"+
		"\u023e\u0250\b!\1\2\u023f\u0240\7J\2\2\u0240\u0250\b!\1\2\u0241\u0242"+
		"\7K\2\2\u0242\u0250\b!\1\2\u0243\u0244\7L\2\2\u0244\u0250\b!\1\2\u0245"+
		"\u0246\7M\2\2\u0246\u0250\b!\1\2\u0247\u0248\7N\2\2\u0248\u0250\b!\1\2"+
		"\u0249\u024a\7O\2\2\u024a\u0250\b!\1\2\u024b\u024c\7U\2\2\u024c\u0250"+
		"\b!\1\2\u024d\u024e\7W\2\2\u024e\u0250\b!\1\2\u024f\u0237\3\2\2\2\u024f"+
		"\u0239\3\2\2\2\u024f\u023b\3\2\2\2\u024f\u023d\3\2\2\2\u024f\u023f\3\2"+
		"\2\2\u024f\u0241\3\2\2\2\u024f\u0243\3\2\2\2\u024f\u0245\3\2\2\2\u024f"+
		"\u0247\3\2\2\2\u024f\u0249\3\2\2\2\u024f\u024b\3\2\2\2\u024f\u024d\3\2"+
		"\2\2\u0250A\3\2\2\2\u0251\u0252\5D#\2\u0252\u0259\b\"\1\2\u0253\u0254"+
		"\7\67\2\2\u0254\u0255\5> \2\u0255\u0256\78\2\2\u0256\u0257\5B\"\2\u0257"+
		"\u0258\b\"\1\2\u0258\u025a\3\2\2\2\u0259\u0253\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025aC\3\2\2\2\u025b\u025c\5F$\2\u025c\u0263\b#\1\2\u025d\u025e\7"+
		";\2\2\u025e\u025f\5F$\2\u025f\u0260\b#\1\2\u0260\u0262\3\2\2\2\u0261\u025d"+
		"\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"E\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\5H%\2\u0267\u026e\b$\1\2\u0268"+
		"\u0269\7:\2\2\u0269\u026a\5H%\2\u026a\u026b\b$\1\2\u026b\u026d\3\2\2\2"+
		"\u026c\u0268\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026fG\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\5J&\2\u0272\u0279"+
		"\b%\1\2\u0273\u0274\7D\2\2\u0274\u0275\5J&\2\u0275\u0276\b%\1\2\u0276"+
		"\u0278\3\2\2\2\u0277\u0273\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027aI\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d"+
		"\5L\'\2\u027d\u0284\b&\1\2\u027e\u027f\7E\2\2\u027f\u0280\5L\'\2\u0280"+
		"\u0281\b&\1\2\u0281\u0283\3\2\2\2\u0282\u027e\3\2\2\2\u0283\u0286\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285K\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0287\u0288\5N(\2\u0288\u028f\b\'\1\2\u0289\u028a\7C\2\2\u028a"+
		"\u028b\5N(\2\u028b\u028c\b\'\1\2\u028c\u028e\3\2\2\2\u028d\u0289\3\2\2"+
		"\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290M"+
		"\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\5P)\2\u0293\u029e\b(\1\2\u0294"+
		"\u0299\b(\1\2\u0295\u0296\79\2\2\u0296\u029a\b(\1\2\u0297\u0298\7Q\2\2"+
		"\u0298\u029a\b(\1\2\u0299\u0295\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029c\5P)\2\u029c\u029d\b(\1\2\u029d\u029f\3\2\2\2\u029e"+
		"\u0294\3\2\2\2\u029e\u029f\3\2\2\2\u029fO\3\2\2\2\u02a0\u02a1\5R*\2\u02a1"+
		"\u02a6\b)\1\2\u02a2\u02a3\7!\2\2\u02a3\u02a4\5:\36\2\u02a4\u02a5\b)\1"+
		"\2\u02a5\u02a7\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7Q"+
		"\3\2\2\2\u02a8\u02a9\5V,\2\u02a9\u02b0\b*\1\2\u02aa\u02ab\5T+\2\u02ab"+
		"\u02ac\5V,\2\u02ac\u02ad\b*\1\2\u02ad\u02af\3\2\2\2\u02ae\u02aa\3\2\2"+
		"\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1S"+
		"\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b4\7S\2\2\u02b4\u02b5\7\64\2\2\u02b5"+
		"\u02be\b+\1\2\u02b6\u02b7\7R\2\2\u02b7\u02b8\7\64\2\2\u02b8\u02be\b+\1"+
		"\2\u02b9\u02ba\7S\2\2\u02ba\u02be\b+\1\2\u02bb\u02bc\7R\2\2\u02bc\u02be"+
		"\b+\1\2\u02bd\u02b3\3\2\2\2\u02bd\u02b6\3\2\2\2\u02bd\u02b9\3\2\2\2\u02bd"+
		"\u02bb\3\2\2\2\u02beU\3\2\2\2\u02bf\u02c0\5Z.\2\u02c0\u02c7\b,\1\2\u02c1"+
		"\u02c2\5X-\2\u02c2\u02c3\5Z.\2\u02c3\u02c4\b,\1\2\u02c4\u02c6\3\2\2\2"+
		"\u02c5\u02c1\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8W\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7S\2\2\u02cb\u02cc"+
		"\7S\2\2\u02cc\u02d1\b-\1\2\u02cd\u02ce\7R\2\2\u02ce\u02cf\7R\2\2\u02cf"+
		"\u02d1\b-\1\2\u02d0\u02ca\3\2\2\2\u02d0\u02cd\3\2\2\2\u02d1Y\3\2\2\2\u02d2"+
		"\u02d3\5\\/\2\u02d3\u02e0\b.\1\2\u02d4\u02d9\b.\1\2\u02d5\u02d6\7?\2\2"+
		"\u02d6\u02da\b.\1\2\u02d7\u02d8\7@\2\2\u02d8\u02da\b.\1\2\u02d9\u02d5"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\5\\/\2\u02dc"+
		"\u02dd\b.\1\2\u02dd\u02df\3\2\2\2\u02de\u02d4\3\2\2\2\u02df\u02e2\3\2"+
		"\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1[\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e3\u02e4\5^\60\2\u02e4\u02f3\b/\1\2\u02e5\u02ec\b/\1\2\u02e6"+
		"\u02e7\7A\2\2\u02e7\u02ed\b/\1\2\u02e8\u02e9\7B\2\2\u02e9\u02ed\b/\1\2"+
		"\u02ea\u02eb\7F\2\2\u02eb\u02ed\b/\1\2\u02ec\u02e6\3\2\2\2\u02ec\u02e8"+
		"\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\5^\60\2\u02ef"+
		"\u02f0\b/\1\2\u02f0\u02f2\3\2\2\2\u02f1\u02e5\3\2\2\2\u02f2\u02f5\3\2"+
		"\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4]\3\2\2\2\u02f5\u02f3"+
		"\3\2\2\2\u02f6\u02f7\7?\2\2\u02f7\u02f8\5^\60\2\u02f8\u02f9\b\60\1\2\u02f9"+
		"\u030a\3\2\2\2\u02fa\u02fb\7@\2\2\u02fb\u02fc\5^\60\2\u02fc\u02fd\b\60"+
		"\1\2\u02fd\u030a\3\2\2\2\u02fe\u02ff\7<\2\2\u02ff\u0300\5^\60\2\u0300"+
		"\u0301\b\60\1\2\u0301\u030a\3\2\2\2\u0302\u0303\7=\2\2\u0303\u0304\5^"+
		"\60\2\u0304\u0305\b\60\1\2\u0305\u030a\3\2\2\2\u0306\u0307\5`\61\2\u0307"+
		"\u0308\b\60\1\2\u0308\u030a\3\2\2\2\u0309\u02f6\3\2\2\2\u0309\u02fa\3"+
		"\2\2\2\u0309\u02fe\3\2\2\2\u0309\u0302\3\2\2\2\u0309\u0306\3\2\2\2\u030a"+
		"_\3\2\2\2\u030b\u030c\7\66\2\2\u030c\u030d\5^\60\2\u030d\u030e\b\61\1"+
		"\2\u030e\u034c\3\2\2\2\u030f\u0310\7\65\2\2\u0310\u0311\5^\60\2\u0311"+
		"\u0312\b\61\1\2\u0312\u034c\3\2\2\2\u0313\u0314\5b\62\2\u0314\u0315\b"+
		"\61\1\2\u0315\u033b\3\2\2\2\u0316\u0317\7+\2\2\u0317\u0318\5> \2\u0318"+
		"\u0319\b\61\1\2\u0319\u031a\7,\2\2\u031a\u033b\3\2\2\2\u031b\u031c\5\2"+
		"\2\2\u031c\u031d\b\61\1\2\u031d\u033b\3\2\2\2\u031e\u031f\5f\64\2\u031f"+
		"\u0320\b\61\1\2\u0320\u033b\3\2\2\2\u0321\u0322\7\67\2\2\u0322\u0323\7"+
		"+\2\2\u0323\u0324\5d\63\2\u0324\u0325\7,\2\2\u0325\u0326\b\61\1\2\u0326"+
		"\u033b\3\2\2\2\u0327\u0328\7\27\2\2\u0328\u0329\5:\36\2\u0329\u032a\b"+
		"\61\1\2\u032a\u032e\7+\2\2\u032b\u032c\5d\63\2\u032c\u032d\b\61\1\2\u032d"+
		"\u032f\3\2\2\2\u032e\u032b\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0331\7,\2\2\u0331\u0332\78\2\2\u0332\u0336\7+\2\2\u0333\u0334"+
		"\5d\63\2\u0334\u0335\b\61\1\2\u0335\u0337\3\2\2\2\u0336\u0333\3\2\2\2"+
		"\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\7,\2\2\u0339\u033b"+
		"\3\2\2\2\u033a\u0313\3\2\2\2\u033a\u0316\3\2\2\2\u033a\u031b\3\2\2\2\u033a"+
		"\u031e\3\2\2\2\u033a\u0321\3\2\2\2\u033a\u0327\3\2\2\2\u033b\u0342\3\2"+
		"\2\2\u033c\u033d\7\63\2\2\u033d\u033e\5\2\2\2\u033e\u033f\b\61\1\2\u033f"+
		"\u0341\3\2\2\2\u0340\u033c\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u0349\3\2\2\2\u0344\u0342\3\2\2\2\u0345"+
		"\u0346\7<\2\2\u0346\u034a\b\61\1\2\u0347\u0348\7=\2\2\u0348\u034a\b\61"+
		"\1\2\u0349\u0345\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034c\3\2\2\2\u034b\u030b\3\2\2\2\u034b\u030f\3\2\2\2\u034b\u033a\3\2"+
		"\2\2\u034ca\3\2\2\2\u034d\u034e\7+\2\2\u034e\u034f\5:\36\2\u034f\u0350"+
		"\7,\2\2\u0350\u0351\5> \2\u0351\u0352\b\62\1\2\u0352c\3\2\2\2\u0353\u0354"+
		"\b\63\1\2\u0354\u0355\5> \2\u0355\u035c\b\63\1\2\u0356\u0357\7\62\2\2"+
		"\u0357\u0358\5> \2\u0358\u0359\b\63\1\2\u0359\u035b\3\2\2\2\u035a\u0356"+
		"\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"e\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\7\5\2\2\u0360\u0370\b\64\1\2"+
		"\u0361\u0362\7\6\2\2\u0362\u0370\b\64\1\2\u0363\u0364\7\7\2\2\u0364\u0370"+
		"\b\64\1\2\u0365\u0366\7\b\2\2\u0366\u0370\b\64\1\2\u0367\u0368\7\t\2\2"+
		"\u0368\u0370\b\64\1\2\u0369\u036a\7(\2\2\u036a\u0370\b\64\1\2\u036b\u036c"+
		"\7)\2\2\u036c\u0370\b\64\1\2\u036d\u036e\7*\2\2\u036e\u0370\b\64\1\2\u036f"+
		"\u035f\3\2\2\2\u036f\u0361\3\2\2\2\u036f\u0363\3\2\2\2\u036f\u0365\3\2"+
		"\2\2\u036f\u0367\3\2\2\2\u036f\u0369\3\2\2\2\u036f\u036b\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370g\3\2\2\2Iox\u0080\u0082\u008b\u0092\u0099\u00a9\u00b4"+
		"\u00c4\u00d2\u00da\u00e7\u00f0\u0100\u010a\u0112\u011e\u0121\u012b\u013e"+
		"\u0142\u014c\u0150\u015b\u015d\u017b\u0188\u0197\u01af\u01bf\u01c5\u01cb"+
		"\u01dc\u01ec\u01f4\u01fe\u0206\u020b\u0219\u021c\u0224\u022d\u0235\u024f"+
		"\u0259\u0263\u026e\u0279\u0284\u028f\u0299\u029e\u02a6\u02b0\u02bd\u02c7"+
		"\u02d0\u02d9\u02e0\u02ec\u02f3\u0309\u032e\u0336\u033a\u0342\u0349\u034b"+
		"\u035c\u036f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}