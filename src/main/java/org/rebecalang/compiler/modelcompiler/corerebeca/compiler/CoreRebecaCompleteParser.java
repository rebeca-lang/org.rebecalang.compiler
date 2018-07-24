// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/CoreRebecaComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
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
public class CoreRebecaCompleteParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTLITERAL=1, FLOATLITERAL=2, DOUBLELITERAL=3, CHARLITERAL=4, STRINGLITERAL=5, 
		WS=6, COMMENT=7, LINE_COMMENT=8, BREAK=9, CASE=10, CLASS=11, CONTINUE=12, 
		DEFAULT=13, ELSE=14, FOR=15, GOTO=16, IF=17, IMPORT=18, NEW=19, PACKAGE=20, 
		PRIVATE=21, PROTECTED=22, PUBLIC=23, RECORD=24, RETURN=25, SWITCH=26, 
		WHILE=27, ENV=28, INSTANCEOF=29, REACTIVECLASS=30, MSGSRV=31, MAIN=32, 
		STATEVARS=33, KNOWNREBECS=34, THIS=35, TRUE=36, FALSE=37, NULL=38, LPAREN=39, 
		RPAREN=40, LBRACE=41, RBRACE=42, LBRACKET=43, RBRACKET=44, SEMI=45, COMMA=46, 
		DOT=47, EQ=48, BANG=49, TILDA=50, QUES=51, COLON=52, EQEQ=53, AMPAMP=54, 
		BARBAR=55, PLUSPLUS=56, SUBSUB=57, SUPER=58, PLUS=59, SUB=60, STAR=61, 
		SLASH=62, AMP=63, BAR=64, CARET=65, PERCENT=66, PLUSEQ=67, SUBEQ=68, STAREQ=69, 
		SLASHEQ=70, AMPEQ=71, BAREQ=72, CARETEQ=73, TILDAEQ=74, PERCENTEQ=75, 
		MONKEYS_AT=76, BANGEQ=77, GT=78, LT=79, LTLT=80, LTLTEQ=81, GTGT=82, GTGTEQ=83, 
		IDENTIFIER=84;
	public static final String[] tokenNames = {
		"<INVALID>", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", 
		"STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "'break'", "'case'", 
		"'class'", "'continue'", "'default'", "'else'", "'for'", "'goto'", "'if'", 
		"'import'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'record'", "'return'", "'switch'", "'while'", "'env'", "'instanceof'", 
		"'reactiveclass'", "'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", 
		"'this'", "'true'", "'false'", "'null'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'&&'", "'||'", "'++'", "'--'", "'super'", "'+'", "'-'", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'~='", "'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", "'<<='", 
		"'>>'", "'>>='", "IDENTIFIER"
	};
	public static final int
		RULE_rebecaModel = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_rebecaCode = 3, RULE_recordDeclaration = 4, RULE_mainDeclaration = 5, 
		RULE_mainRebecDefinition = 6, RULE_environmentVariables = 7, RULE_fieldDeclaration = 8, 
		RULE_variableDeclarators = 9, RULE_variableDeclarator = 10, RULE_variableInitializer = 11, 
		RULE_arrayInitializer = 12, RULE_reactiveClassDeclaration = 13, RULE_methodDeclaration = 14, 
		RULE_constructorDeclaration = 15, RULE_msgsrvDeclaration = 16, RULE_synchMethodDeclaration = 17, 
		RULE_formalParameters = 18, RULE_formalParametersDeclaration = 19, RULE_formalParameterDeclaration = 20, 
		RULE_block = 21, RULE_statement = 22, RULE_forInit = 23, RULE_switchBlock = 24, 
		RULE_statementExpression = 25, RULE_annotation = 26, RULE_type = 27, RULE_dimensions = 28, 
		RULE_expression = 29, RULE_assignmentOperator = 30, RULE_conditionalExpression = 31, 
		RULE_conditionalOrExpression = 32, RULE_conditionalAndExpression = 33, 
		RULE_inclusiveOrExpression = 34, RULE_exclusiveOrExpression = 35, RULE_andExpression = 36, 
		RULE_equalityExpression = 37, RULE_instanceOfExpression = 38, RULE_relationalExpression = 39, 
		RULE_relationalOp = 40, RULE_shiftExpression = 41, RULE_shiftOp = 42, 
		RULE_additiveExpression = 43, RULE_multiplicativeExpression = 44, RULE_unaryExpression = 45, 
		RULE_unaryExpressionNotPlusMinus = 46, RULE_castExpression = 47, RULE_primary = 48, 
		RULE_expressionList = 49, RULE_literal = 50;
	public static final String[] ruleNames = {
		"rebecaModel", "packageDeclaration", "importDeclaration", "rebecaCode", 
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
		"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "primary", 
		"expressionList", "literal"
	};

	@Override
	public String getGrammarFileName() { return "CoreRebecaComplete.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
			        
			setState(106);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(103); ((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(108); ((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(116); ((RebecaModelContext)_localctx).t1 = rebecaCode();
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
			setState(119); match(PACKAGE);
			}
		}
		catch (RecognitionException re) {
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
			setState(121); match(IMPORT);
			}
		}
		catch (RecognitionException re) {
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(124); ((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(132); ((RebecaCodeContext)_localctx).e = environmentVariables();
			_localctx.rc.getEnvironmentVariables().addAll(((RebecaCodeContext)_localctx).e.fds);
			}
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135); ((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
				_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REACTIVECLASS || _la==MONKEYS_AT );
			setState(142); ((RebecaCodeContext)_localctx).md = mainDeclaration();
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
			setState(145); match(RECORD);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public MainRebecDefinitionContext mainRebecDefinition(int i) {
			return getRuleContext(MainRebecDefinitionContext.class,i);
		}
		public List<MainRebecDefinitionContext> mainRebecDefinition() {
			return getRuleContexts(MainRebecDefinitionContext.class);
		}
		public TerminalNode MAIN() { return getToken(CoreRebecaCompleteParser.MAIN, 0); }
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
			setState(148); ((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(150); match(LBRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(151); ((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159); ((MainDeclarationContext)_localctx).RBRACE = match(RBRACE);
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
			return getToken(CoreRebecaCompleteParser.RPAREN, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaCompleteParser.LPAREN); }
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaCompleteParser.RPAREN); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.LPAREN, i);
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
			setState(163); ((MainRebecDefinitionContext)_localctx).t = type();
			setState(164); ((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(166); match(LPAREN);
			setState(170);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				setState(167); ((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(172); match(RPAREN);
			setState(173); match(COLON);
			setState(174); match(LPAREN);
			setState(178);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				setState(175); ((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(180); match(RPAREN);
			setState(181); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> ENV() { return getTokens(CoreRebecaCompleteParser.ENV); }
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode ENV(int i) {
			return getToken(CoreRebecaCompleteParser.ENV, i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterEnvironmentVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitEnvironmentVariables(this);
		}
	}

	public final EnvironmentVariablesContext environmentVariables() throws RecognitionException {
		EnvironmentVariablesContext _localctx = new EnvironmentVariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_environmentVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((EnvironmentVariablesContext)_localctx).fds =  new ArrayList<FieldDeclaration>();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV) {
				{
				{
				setState(184); match(ENV);
				setState(185); ((EnvironmentVariablesContext)_localctx).fd = fieldDeclaration();
				_localctx.fds.add(((EnvironmentVariablesContext)_localctx).fd.fd);
				setState(187); match(SEMI);
				}
				}
				setState(193);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(195); ((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203); ((FieldDeclarationContext)_localctx).t = type();
			setState(204); ((FieldDeclarationContext)_localctx).vds = variableDeclarators();
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
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
		enterRule(_localctx, 18, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(208); ((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(210); match(COMMA);
				setState(211); ((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(218);
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
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 20, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(220); ((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(226);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(222); match(EQ);
				setState(223); ((VariableDeclaratorContext)_localctx).vi = variableInitializer();
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
		enterRule(_localctx, 22, RULE_variableInitializer);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); ((VariableInitializerContext)_localctx).ai = arrayInitializer();
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
				setState(231); ((VariableInitializerContext)_localctx).e = expression();
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
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(237); ((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(249);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				setState(238); ((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(240); match(COMMA);
					setState(241); ((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(251); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> LBRACE() { return getTokens(CoreRebecaCompleteParser.LBRACE); }
		public MsgsrvDeclarationContext msgsrvDeclaration(int i) {
			return getRuleContext(MsgsrvDeclarationContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public TerminalNode LBRACE(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACE, i);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<MsgsrvDeclarationContext> msgsrvDeclaration() {
			return getRuleContexts(MsgsrvDeclarationContext.class);
		}
		public TerminalNode REACTIVECLASS() { return getToken(CoreRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode RBRACE(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACE, i);
		}
		public TerminalNode KNOWNREBECS() { return getToken(CoreRebecaCompleteParser.KNOWNREBECS, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(CoreRebecaCompleteParser.RBRACE); }
		public TerminalNode INTLITERAL() { return getToken(CoreRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode STATEVARS() { return getToken(CoreRebecaCompleteParser.STATEVARS, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 26, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(254); ((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262); match(REACTIVECLASS);
			setState(263); ((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(265); match(LPAREN);
			setState(266); ((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(268); match(RPAREN);
			setState(269); match(LBRACE);
			setState(282);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(270); match(KNOWNREBECS);
				setState(271); match(LBRACE);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(272); ((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(274); match(SEMI);
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281); ((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(296);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(284); match(STATEVARS);
				setState(285); match(LBRACE);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(286); ((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(288); match(SEMI);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295); ((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==IDENTIFIER) {
				{
				setState(307);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(298); ((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;

				case 2:
					{
					setState(301); ((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;

				case 3:
					{
					setState(304); ((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312); ((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
			setState(315); ((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(317); ((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(319); ((MethodDeclarationContext)_localctx).b = block();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(323); methodDeclaration(_localctx.cd);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode MSGSRV() { return getToken(CoreRebecaCompleteParser.MSGSRV, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(326); match(MSGSRV);
			setState(327); methodDeclaration(_localctx.md);
			}
		}
		catch (RecognitionException re) {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(330); ((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(332); methodDeclaration(_localctx.smd);
			}
		}
		catch (RecognitionException re) {
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
			setState(335); match(LPAREN);
			setState(339);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(336); ((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(341); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public List<FormalParameterDeclarationContext> formalParameterDeclaration() {
			return getRuleContexts(FormalParameterDeclarationContext.class);
		}
		public FormalParameterDeclarationContext formalParameterDeclaration(int i) {
			return getRuleContext(FormalParameterDeclarationContext.class,i);
		}
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
			setState(344); ((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(346); match(COMMA);
				setState(347); ((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(354);
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
			setState(355); ((FormalParameterDeclarationContext)_localctx).t = type();
			setState(356); ((FormalParameterDeclarationContext)_localctx).name = match(IDENTIFIER);

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
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(360); ((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(362); ((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370); ((BlockContext)_localctx).RBRACE = match(RBRACE);
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
		public TerminalNode ELSE() { return getToken(CoreRebecaCompleteParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CoreRebecaCompleteParser.IF, 0); }
		public TerminalNode BREAK() { return getToken(CoreRebecaCompleteParser.BREAK, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(CoreRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public TerminalNode FOR() { return getToken(CoreRebecaCompleteParser.FOR, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(CoreRebecaCompleteParser.WHILE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode RETURN() { return getToken(CoreRebecaCompleteParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode CONTINUE() { return getToken(CoreRebecaCompleteParser.CONTINUE, 0); }
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
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373); ((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(375); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377); ((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380); ((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(382); match(LPAREN);
				setState(383); ((StatementContext)_localctx).e = expression();
				setState(384); match(RPAREN);
				setState(385); ((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(391);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(387); match(ELSE);
					setState(388); ((StatementContext)_localctx).est = statement();
					((ConditionalStatement)_localctx.s).setElseStatement(((StatementContext)_localctx).est.s);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393); ((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(395); match(LPAREN);
				setState(396); ((StatementContext)_localctx).e = expression();
				setState(397); match(RPAREN);
				setState(398); ((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401); ((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(403); match(LPAREN);
				setState(407);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					setState(404); ((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(409); match(SEMI);
				setState(413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(410); ((StatementContext)_localctx).e = expression();
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(415); match(SEMI);
				setState(419);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(416); ((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(421); match(RPAREN);
				setState(422); ((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(425); ((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(426); match(LPAREN);
				setState(427); ((StatementContext)_localctx).e = expression();
				setState(428); match(RPAREN);
				setState(429); match(LBRACE);
				setState(430); ((StatementContext)_localctx).sb = switchBlock();
				setState(431); match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(434); ((StatementContext)_localctx).RETURN = match(RETURN);
				setState(436);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(435); ((StatementContext)_localctx).e = expression();
					}
				}

				setState(438); match(SEMI);
				((StatementContext)_localctx).s =  new ReturnStatement(); ((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(440); ((StatementContext)_localctx).BREAK = match(BREAK);
				setState(441); match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(443); ((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(444); match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(446); match(SEMI);
				((StatementContext)_localctx).s =  new Statement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(448); ((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(450); match(SEMI);
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
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); ((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457); ((ForInitContext)_localctx).el = expressionList();
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
		public List<TerminalNode> CASE() { return getTokens(CoreRebecaCompleteParser.CASE); }
		public TerminalNode COLON(int i) {
			return getToken(CoreRebecaCompleteParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoreRebecaCompleteParser.COLON); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(CoreRebecaCompleteParser.DEFAULT); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CASE(int i) {
			return getToken(CoreRebecaCompleteParser.CASE, i);
		}
		public TerminalNode DEFAULT(int i) {
			return getToken(CoreRebecaCompleteParser.DEFAULT, i);
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
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				setState(470);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(464); match(CASE);
					setState(465); ((SwitchBlockContext)_localctx).e = expression();

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
					    			
					}
					break;
				case DEFAULT:
					{
					setState(468); ((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
					    			
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(472); match(COLON);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(473); ((SwitchBlockContext)_localctx).st = statement();
					_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(485);
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
			setState(486); ((StatementExpressionContext)_localctx).e = expression();
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
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
			setState(490); match(MONKEYS_AT);
			setState(491); ((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			setState(500);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(493); match(LPAREN);
				setState(497);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(494); ((AnnotationContext)_localctx).exp = expression();
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(499); match(RPAREN);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypeContext)_localctx).t =  new PrimitiveType();
			setState(503); ((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(508);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(505); ((TypeContext)_localctx).ds = dimensions();
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
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(CoreRebecaCompleteParser.INTLITERAL); }
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
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
		enterRule(_localctx, 56, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(515); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(511); match(LBRACKET);
				setState(512); ((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(513); match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(517); 
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); ((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(525);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(521); ((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(522); ((ExpressionContext)_localctx).e2 = expression();
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
		public TerminalNode PERCENTEQ() { return getToken(CoreRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(CoreRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(CoreRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(CoreRebecaCompleteParser.GTGTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(CoreRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode BAREQ() { return getToken(CoreRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(CoreRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(CoreRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(CoreRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(CoreRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode STAREQ() { return getToken(CoreRebecaCompleteParser.STAREQ, 0); }
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
		enterRule(_localctx, 60, RULE_assignmentOperator);
		try {
			setState(551);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); ((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(529); ((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(531); ((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(533); ((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(535); ((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(537); ((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(539); ((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(541); ((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(543); ((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(545); ((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(547); ((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(549); ((AssignmentOperatorContext)_localctx).GTGTEQ = match(GTGTEQ);
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
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); ((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(555); match(QUES);
				setState(556); ((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(557); match(COLON);
				setState(558); ((ConditionalExpressionContext)_localctx).e3 = conditionalExpression();
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
		public List<TerminalNode> BARBAR() { return getTokens(CoreRebecaCompleteParser.BARBAR); }
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public TerminalNode BARBAR(int i) {
			return getToken(CoreRebecaCompleteParser.BARBAR, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563); ((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(565); ((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
					setState(566); ((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public List<TerminalNode> AMPAMP() { return getTokens(CoreRebecaCompleteParser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(CoreRebecaCompleteParser.AMPAMP, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574); ((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(576); ((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(577); ((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public List<TerminalNode> BAR() { return getTokens(CoreRebecaCompleteParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(CoreRebecaCompleteParser.BAR, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585); ((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(587); ((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(588); ((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
			return getToken(CoreRebecaCompleteParser.CARET, i);
		}
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(CoreRebecaCompleteParser.CARET); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596); ((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(598); ((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(599); ((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public List<TerminalNode> AMP() { return getTokens(CoreRebecaCompleteParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(CoreRebecaCompleteParser.AMP, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607); ((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(609); ((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(610); ((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		public TerminalNode EQEQ() { return getToken(CoreRebecaCompleteParser.EQEQ, 0); }
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public TerminalNode BANGEQ() { return getToken(CoreRebecaCompleteParser.BANGEQ, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); ((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(630);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
				setState(625);
				switch (_input.LA(1)) {
				case EQEQ:
					{
					setState(621); ((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
					}
					break;
				case BANGEQ:
					{
					setState(623); ((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(627); ((EqualityExpressionContext)_localctx).e2 = instanceOfExpression();
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
		public TerminalNode INSTANCEOF() { return getToken(CoreRebecaCompleteParser.INSTANCEOF, 0); }
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632); ((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
			setState(638);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(634); match(INSTANCEOF);
				setState(635); ((InstanceOfExpressionContext)_localctx).t = type();
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(640); ((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(642); ((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(643); ((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(_localctx.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(650);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public Token LT;
		public Token EQ;
		public Token GT;
		public TerminalNode LT() { return getToken(CoreRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaCompleteParser.GT, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
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
		enterRule(_localctx, 80, RULE_relationalOp);
		try {
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); ((RelationalOpContext)_localctx).LT = match(LT);
				setState(652); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654); ((RelationalOpContext)_localctx).GT = match(GT);
				setState(655); ((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657); ((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(659); ((RelationalOpContext)_localctx).GT = match(GT);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663); ((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(665); ((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(666); ((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(_localctx.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public List<TerminalNode> LT() { return getTokens(CoreRebecaCompleteParser.LT); }
		public List<TerminalNode> GT() { return getTokens(CoreRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CoreRebecaCompleteParser.GT, i);
		}
		public TerminalNode LT(int i) {
			return getToken(CoreRebecaCompleteParser.LT, i);
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
		enterRule(_localctx, 84, RULE_shiftOp);
		try {
			setState(680);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(674); match(LT);
				setState(675); match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(677); match(GT);
				setState(678); match(GT);
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
		public List<TerminalNode> SUB() { return getTokens(CoreRebecaCompleteParser.SUB); }
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public List<TerminalNode> PLUS() { return getTokens(CoreRebecaCompleteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CoreRebecaCompleteParser.PLUS, i);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public TerminalNode SUB(int i) {
			return getToken(CoreRebecaCompleteParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682); ((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(689);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(685); ((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						e3.setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(687); ((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						e3.setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(691); ((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					e3.setRight(((AdditiveExpressionContext)_localctx).e2.e); ((AdditiveExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(698);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext e1;
		public Token STAR;
		public Token SLASH;
		public Token PERCENT;
		public UnaryExpressionContext e2;
		public TerminalNode STAR(int i) {
			return getToken(CoreRebecaCompleteParser.STAR, i);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public List<TerminalNode> SLASH() { return getTokens(CoreRebecaCompleteParser.SLASH); }
		public TerminalNode PERCENT(int i) {
			return getToken(CoreRebecaCompleteParser.PERCENT, i);
		}
		public List<TerminalNode> STAR() { return getTokens(CoreRebecaCompleteParser.STAR); }
		public TerminalNode SLASH(int i) {
			return getToken(CoreRebecaCompleteParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CoreRebecaCompleteParser.PERCENT); }
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699); ((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(708);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(702); ((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(704); ((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(706); ((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(710); ((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					e3.setRight(((MultiplicativeExpressionContext)_localctx).e2.e); ((MultiplicativeExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(717);
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
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUB() { return getToken(CoreRebecaCompleteParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CoreRebecaCompleteParser.PLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
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
		enterRule(_localctx, 90, RULE_unaryExpression);
		try {
			setState(737);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); match(PLUS);
				setState(719); ((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(722); ((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(723); ((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(726); ((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(727); ((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(730); ((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(731); ((UnaryExpressionContext)_localctx).ess = unaryExpression();
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
				setState(734); ((UnaryExpressionContext)_localctx).eu = unaryExpressionNotPlusMinus();
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
		public TerminalNode TILDA() { return getToken(CoreRebecaCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaCompleteParser.RPAREN); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(CoreRebecaCompleteParser.NEW, 0); }
		public TerminalNode DOT(int i) {
			return getToken(CoreRebecaCompleteParser.DOT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CoreRebecaCompleteParser.DOT); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.RPAREN, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaCompleteParser.LPAREN); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
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
			return getToken(CoreRebecaCompleteParser.LPAREN, i);
		}
		public TerminalNode BANG() { return getToken(CoreRebecaCompleteParser.BANG, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			int _alt;
			setState(803);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(739); ((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(740); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(743); ((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(744); ((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
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
				setState(786);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(747); ((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;

				case 2:
					{
					setState(750); match(LPAREN);
					setState(751); ((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(753); match(RPAREN);
					}
					break;

				case 3:
					{
					setState(755); ((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;

				case 4:
					{
					setState(758); ((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;

				case 5:
					{
					setState(761); ((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(762); match(LPAREN);
					setState(763); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(764); match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;

				case 6:
					{
					setState(767); match(NEW);
					setState(768); ((UnaryExpressionNotPlusMinusContext)_localctx).t = type();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new RebecInstantiationPrimary();
									_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((UnaryExpressionNotPlusMinusContext)_localctx).t.t);
					setState(770); match(LPAREN);
					setState(774);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
						{
						setState(771); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(776); match(RPAREN);
					setState(777); match(COLON);
					setState(778); match(LPAREN);
					setState(782);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
						{
						setState(779); ((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(784); match(RPAREN);
					}
					break;
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(788); ((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(789); ((UnaryExpressionNotPlusMinusContext)_localctx).p2 = primary();

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
					setState(796);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(801);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(797); ((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;

				case 2:
					{
					setState(799); ((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB = match(SUBSUB);
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
		enterRule(_localctx, 94, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805); match(LPAREN);
			setState(806); ((CastExpressionContext)_localctx).t = type();
			setState(807); match(RPAREN);
			setState(808); ((CastExpressionContext)_localctx).e1 = expression();
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
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		enterRule(_localctx, 96, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811); ((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(821);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(813); ((PrimaryContext)_localctx).lp = match(LPAREN);
				ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(818);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(815); ((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(820); match(RPAREN);
				}
			}

			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(823); match(LBRACKET);
				setState(824); ((PrimaryContext)_localctx).e2 = expression();
				setState(825); match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(832);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
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
		enterRule(_localctx, 98, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>();
			setState(834); ((ExpressionListContext)_localctx).e = expression();
			_localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(836); match(COMMA);
				setState(837); ((ExpressionListContext)_localctx).e = expression();
				_localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(844);
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
		public TerminalNode NULL() { return getToken(CoreRebecaCompleteParser.NULL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(CoreRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode FALSE() { return getToken(CoreRebecaCompleteParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(CoreRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(CoreRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(CoreRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(CoreRebecaCompleteParser.CHARLITERAL, 0); }
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
		enterRule(_localctx, 100, RULE_literal);
		try {
			setState(861);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(845); ((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(TypesUtilities.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(847); ((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(849); ((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(851); ((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(853); ((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(855); ((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(857); ((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(859); ((LiteralContext)_localctx).NULL = match(NULL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3V\u0362\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\5\2m\n\2\3\2\3\2\3\2\7\2r\n\2\f\2\16\2u\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u008d\n\5\r\5\16\5\u008e\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0\13\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00b5\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c0"+
		"\n\t\f\t\16\t\u00c3\13\t\3\n\3\n\3\n\3\n\7\n\u00c9\n\n\f\n\16\n\u00cc"+
		"\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d9\n"+
		"\13\f\13\16\13\u00dc\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ed\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00f7\n\16\f\16\16\16\u00fa\13\16\5\16\u00fc\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\7\17\u0104\n\17\f\17\16\17\u0107\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0117"+
		"\n\17\f\17\16\17\u011a\13\17\3\17\5\17\u011d\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0125\n\17\f\17\16\17\u0128\13\17\3\17\5\17\u012b\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0136\n\17\f\17\16"+
		"\17\u0139\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0156\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0161\n\25\f\25\16\25\u0164\13\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0170\n\27\f\27\16\27\u0173\13\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u018a\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u019a\n\30\3\30\3\30\3\30"+
		"\3\30\5\30\u01a0\n\30\3\30\3\30\3\30\3\30\5\30\u01a6\n\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01b7"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u01c7\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01cf\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01d9\n\32\3\32\3\32\3\32"+
		"\3\32\7\32\u01df\n\32\f\32\16\32\u01e2\13\32\7\32\u01e4\n\32\f\32\16\32"+
		"\u01e7\13\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u01f4\n\34\3\34\5\34\u01f7\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01ff\n\35\3\36\3\36\3\36\3\36\3\36\6\36\u0206\n\36\r\36\16\36\u0207"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0210\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u022a\n \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u0234\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u023c\n\"\f\""+
		"\16\"\u023f\13\"\3#\3#\3#\3#\3#\3#\7#\u0247\n#\f#\16#\u024a\13#\3$\3$"+
		"\3$\3$\3$\3$\7$\u0252\n$\f$\16$\u0255\13$\3%\3%\3%\3%\3%\3%\7%\u025d\n"+
		"%\f%\16%\u0260\13%\3&\3&\3&\3&\3&\3&\7&\u0268\n&\f&\16&\u026b\13&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0274\n\'\3\'\3\'\3\'\5\'\u0279\n\'\3(\3"+
		"(\3(\3(\3(\3(\5(\u0281\n(\3)\3)\3)\3)\3)\3)\7)\u0289\n)\f)\16)\u028c\13"+
		")\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0298\n*\3+\3+\3+\3+\3+\3+\7+\u02a0"+
		"\n+\f+\16+\u02a3\13+\3,\3,\3,\3,\3,\3,\5,\u02ab\n,\3-\3-\3-\3-\3-\3-\3"+
		"-\5-\u02b4\n-\3-\3-\3-\7-\u02b9\n-\f-\16-\u02bc\13-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u02c7\n.\3.\3.\3.\7.\u02cc\n.\f.\16.\u02cf\13.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02e4\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u0309\n\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0311\n\60\3\60\3\60\5\60\u0315\n\60\3\60\3\60\3\60\3\60\7\60\u031b"+
		"\n\60\f\60\16\60\u031e\13\60\3\60\3\60\3\60\3\60\5\60\u0324\n\60\5\60"+
		"\u0326\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0335\n\62\3\62\5\62\u0338\n\62\3\62\3\62\3\62\3\62\3\62\7"+
		"\62\u033f\n\62\f\62\16\62\u0342\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\7\63\u034b\n\63\f\63\16\63\u034e\13\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0360\n\64"+
		"\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\2\u0399\2h\3\2\2\2\4y\3\2\2\2\6{\3\2\2"+
		"\2\b}\3\2\2\2\n\u0093\3\2\2\2\f\u0095\3\2\2\2\16\u00a4\3\2\2\2\20\u00b9"+
		"\3\2\2\2\22\u00c4\3\2\2\2\24\u00d1\3\2\2\2\26\u00dd\3\2\2\2\30\u00ec\3"+
		"\2\2\2\32\u00ee\3\2\2\2\34\u00ff\3\2\2\2\36\u013d\3\2\2\2 \u0144\3\2\2"+
		"\2\"\u0147\3\2\2\2$\u014b\3\2\2\2&\u0150\3\2\2\2(\u0159\3\2\2\2*\u0165"+
		"\3\2\2\2,\u0169\3\2\2\2.\u01c6\3\2\2\2\60\u01ce\3\2\2\2\62\u01d0\3\2\2"+
		"\2\64\u01e8\3\2\2\2\66\u01eb\3\2\2\28\u01f8\3\2\2\2:\u0200\3\2\2\2<\u0209"+
		"\3\2\2\2>\u0229\3\2\2\2@\u022b\3\2\2\2B\u0235\3\2\2\2D\u0240\3\2\2\2F"+
		"\u024b\3\2\2\2H\u0256\3\2\2\2J\u0261\3\2\2\2L\u026c\3\2\2\2N\u027a\3\2"+
		"\2\2P\u0282\3\2\2\2R\u0297\3\2\2\2T\u0299\3\2\2\2V\u02aa\3\2\2\2X\u02ac"+
		"\3\2\2\2Z\u02bd\3\2\2\2\\\u02e3\3\2\2\2^\u0325\3\2\2\2`\u0327\3\2\2\2"+
		"b\u032d\3\2\2\2d\u0343\3\2\2\2f\u035f\3\2\2\2hl\b\2\1\2ij\5\4\3\2jk\b"+
		"\2\1\2km\3\2\2\2li\3\2\2\2lm\3\2\2\2ms\3\2\2\2no\5\6\4\2op\b\2\1\2pr\3"+
		"\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5"+
		"\b\5\2wx\b\2\1\2x\3\3\2\2\2yz\7\26\2\2z\5\3\2\2\2{|\7\24\2\2|\7\3\2\2"+
		"\2}\u0083\b\5\1\2~\177\5\n\6\2\177\u0080\b\5\1\2\u0080\u0082\3\2\2\2\u0081"+
		"~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\20\t\2\u0087\u0088"+
		"\b\5\1\2\u0088\u008c\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b\b\5\1\2"+
		"\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5\f\7\2\u0091"+
		"\u0092\b\5\1\2\u0092\t\3\2\2\2\u0093\u0094\7\32\2\2\u0094\13\3\2\2\2\u0095"+
		"\u0096\b\7\1\2\u0096\u0097\7\"\2\2\u0097\u0098\b\7\1\2\u0098\u009e\7+"+
		"\2\2\u0099\u009a\5\16\b\2\u009a\u009b\b\7\1\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2"+
		"\u00a3\b\7\1\2\u00a3\r\3\2\2\2\u00a4\u00a5\b\b\1\2\u00a5\u00a6\58\35\2"+
		"\u00a6\u00a7\7V\2\2\u00a7\u00a8\b\b\1\2\u00a8\u00ac\7)\2\2\u00a9\u00aa"+
		"\5d\63\2\u00aa\u00ab\b\b\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7*\2\2\u00af\u00b0\7\66"+
		"\2\2\u00b0\u00b4\7)\2\2\u00b1\u00b2\5d\63\2\u00b2\u00b3\b\b\1\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\7*\2\2\u00b7\u00b8\7/\2\2\u00b8\17\3\2\2\2\u00b9\u00c1"+
		"\b\t\1\2\u00ba\u00bb\7\36\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\b\t\1\2"+
		"\u00bd\u00be\7/\2\2\u00be\u00c0\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\21\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00ca\b\n\1\2\u00c5\u00c6\5\66\34\2\u00c6\u00c7\b"+
		"\n\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\58\35\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\b\n\1\2\u00d0"+
		"\23\3\2\2\2\u00d1\u00d2\b\13\1\2\u00d2\u00d3\5\26\f\2\u00d3\u00da\b\13"+
		"\1\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6\5\26\f\2\u00d6\u00d7\b\13\1\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\25\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de"+
		"\b\f\1\2\u00de\u00df\7V\2\2\u00df\u00e4\b\f\1\2\u00e0\u00e1\7\62\2\2\u00e1"+
		"\u00e2\5\30\r\2\u00e2\u00e3\b\f\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\27\3\2\2\2\u00e6\u00e7\5\32\16\2\u00e7"+
		"\u00e8\b\r\1\2\u00e8\u00ed\3\2\2\2\u00e9\u00ea\5<\37\2\u00ea\u00eb\b\r"+
		"\1\2\u00eb\u00ed\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed"+
		"\31\3\2\2\2\u00ee\u00ef\b\16\1\2\u00ef\u00fb\7+\2\2\u00f0\u00f1\5\30\r"+
		"\2\u00f1\u00f8\b\16\1\2\u00f2\u00f3\7\60\2\2\u00f3\u00f4\5\30\r\2\u00f4"+
		"\u00f5\b\16\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\7,\2\2\u00fe\33\3\2\2\2\u00ff\u0105\b\17\1\2\u0100\u0101"+
		"\5\66\34\2\u0101\u0102\b\17\1\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2"+
		"\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7 \2\2\u0109\u010a\7V\2\2\u010a"+
		"\u010b\b\17\1\2\u010b\u010c\7)\2\2\u010c\u010d\7\3\2\2\u010d\u010e\b\17"+
		"\1\2\u010e\u010f\7*\2\2\u010f\u011c\7+\2\2\u0110\u0111\7$\2\2\u0111\u0118"+
		"\7+\2\2\u0112\u0113\5\22\n\2\u0113\u0114\b\17\1\2\u0114\u0115\7/\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011d\7,\2\2\u011c\u0110\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u012a\3\2"+
		"\2\2\u011e\u011f\7#\2\2\u011f\u0126\7+\2\2\u0120\u0121\5\22\n\2\u0121"+
		"\u0122\b\17\1\2\u0122\u0123\7/\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7,\2\2\u012a\u011e\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0137\3\2\2\2\u012c\u012d\5 \21\2\u012d"+
		"\u012e\b\17\1\2\u012e\u0136\3\2\2\2\u012f\u0130\5\"\22\2\u0130\u0131\b"+
		"\17\1\2\u0131\u0136\3\2\2\2\u0132\u0133\5$\23\2\u0133\u0134\b\17\1\2\u0134"+
		"\u0136\3\2\2\2\u0135\u012c\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0132\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\b\17"+
		"\1\2\u013c\35\3\2\2\2\u013d\u013e\7V\2\2\u013e\u013f\b\20\1\2\u013f\u0140"+
		"\5&\24\2\u0140\u0141\b\20\1\2\u0141\u0142\5,\27\2\u0142\u0143\b\20\1\2"+
		"\u0143\37\3\2\2\2\u0144\u0145\b\21\1\2\u0145\u0146\5\36\20\2\u0146!\3"+
		"\2\2\2\u0147\u0148\b\22\1\2\u0148\u0149\7!\2\2\u0149\u014a\5\36\20\2\u014a"+
		"#\3\2\2\2\u014b\u014c\b\23\1\2\u014c\u014d\58\35\2\u014d\u014e\b\23\1"+
		"\2\u014e\u014f\5\36\20\2\u014f%\3\2\2\2\u0150\u0151\b\24\1\2\u0151\u0155"+
		"\7)\2\2\u0152\u0153\5(\25\2\u0153\u0154\b\24\1\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0152\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7*"+
		"\2\2\u0158\'\3\2\2\2\u0159\u015a\b\25\1\2\u015a\u015b\5*\26\2\u015b\u0162"+
		"\b\25\1\2\u015c\u015d\7\60\2\2\u015d\u015e\5*\26\2\u015e\u015f\b\25\1"+
		"\2\u015f\u0161\3\2\2\2\u0160\u015c\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163)\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\58\35\2\u0166\u0167\7V\2\2\u0167\u0168\b\26\1\2\u0168+\3\2\2\2"+
		"\u0169\u016a\b\27\1\2\u016a\u016b\7+\2\2\u016b\u0171\b\27\1\2\u016c\u016d"+
		"\5.\30\2\u016d\u016e\b\27\1\2\u016e\u0170\3\2\2\2\u016f\u016c\3\2\2\2"+
		"\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7,\2\2\u0175\u0176\b\27\1\2\u0176"+
		"-\3\2\2\2\u0177\u0178\5\22\n\2\u0178\u0179\b\30\1\2\u0179\u017a\7/\2\2"+
		"\u017a\u01c7\3\2\2\2\u017b\u017c\5,\27\2\u017c\u017d\b\30\1\2\u017d\u01c7"+
		"\3\2\2\2\u017e\u017f\7\23\2\2\u017f\u0180\b\30\1\2\u0180\u0181\7)\2\2"+
		"\u0181\u0182\5<\37\2\u0182\u0183\7*\2\2\u0183\u0184\5.\30\2\u0184\u0189"+
		"\b\30\1\2\u0185\u0186\7\20\2\2\u0186\u0187\5.\30\2\u0187\u0188\b\30\1"+
		"\2\u0188\u018a\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u01c7"+
		"\3\2\2\2\u018b\u018c\7\35\2\2\u018c\u018d\b\30\1\2\u018d\u018e\7)\2\2"+
		"\u018e\u018f\5<\37\2\u018f\u0190\7*\2\2\u0190\u0191\5.\30\2\u0191\u0192"+
		"\b\30\1\2\u0192\u01c7\3\2\2\2\u0193\u0194\7\21\2\2\u0194\u0195\b\30\1"+
		"\2\u0195\u0199\7)\2\2\u0196\u0197\5\60\31\2\u0197\u0198\b\30\1\2\u0198"+
		"\u019a\3\2\2\2\u0199\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019f\7/\2\2\u019c\u019d\5<\37\2\u019d\u019e\b\30\1\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a5\7/\2\2\u01a2\u01a3\5d\63\2\u01a3\u01a4\b\30\1\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a8\7*\2\2\u01a8\u01a9\5.\30\2\u01a9\u01aa\b\30\1\2\u01aa"+
		"\u01c7\3\2\2\2\u01ab\u01ac\7\34\2\2\u01ac\u01ad\7)\2\2\u01ad\u01ae\5<"+
		"\37\2\u01ae\u01af\7*\2\2\u01af\u01b0\7+\2\2\u01b0\u01b1\5\62\32\2\u01b1"+
		"\u01b2\7,\2\2\u01b2\u01b3\b\30\1\2\u01b3\u01c7\3\2\2\2\u01b4\u01b6\7\33"+
		"\2\2\u01b5\u01b7\5<\37\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\7/\2\2\u01b9\u01c7\b\30\1\2\u01ba\u01bb\7\13"+
		"\2\2\u01bb\u01bc\7/\2\2\u01bc\u01c7\b\30\1\2\u01bd\u01be\7\16\2\2\u01be"+
		"\u01bf\7/\2\2\u01bf\u01c7\b\30\1\2\u01c0\u01c1\7/\2\2\u01c1\u01c7\b\30"+
		"\1\2\u01c2\u01c3\5\64\33\2\u01c3\u01c4\b\30\1\2\u01c4\u01c5\7/\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u0177\3\2\2\2\u01c6\u017b\3\2\2\2\u01c6\u017e\3\2"+
		"\2\2\u01c6\u018b\3\2\2\2\u01c6\u0193\3\2\2\2\u01c6\u01ab\3\2\2\2\u01c6"+
		"\u01b4\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01c0\3\2"+
		"\2\2\u01c6\u01c2\3\2\2\2\u01c7/\3\2\2\2\u01c8\u01c9\5\22\n\2\u01c9\u01ca"+
		"\b\31\1\2\u01ca\u01cf\3\2\2\2\u01cb\u01cc\5d\63\2\u01cc\u01cd\b\31\1\2"+
		"\u01cd\u01cf\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01cb\3\2\2\2\u01cf\61"+
		"\3\2\2\2\u01d0\u01e5\b\32\1\2\u01d1\u01d8\b\32\1\2\u01d2\u01d3\7\f\2\2"+
		"\u01d3\u01d4\5<\37\2\u01d4\u01d5\b\32\1\2\u01d5\u01d9\3\2\2\2\u01d6\u01d7"+
		"\7\17\2\2\u01d7\u01d9\b\32\1\2\u01d8\u01d2\3\2\2\2\u01d8\u01d6\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01da\u01e0\7\66\2\2\u01db\u01dc\5.\30\2\u01dc\u01dd"+
		"\b\32\1\2\u01dd\u01df\3\2\2\2\u01de\u01db\3\2\2\2\u01df\u01e2\3\2\2\2"+
		"\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e3\u01d1\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\63\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\5<\37"+
		"\2\u01e9\u01ea\b\33\1\2\u01ea\65\3\2\2\2\u01eb\u01ec\b\34\1\2\u01ec\u01ed"+
		"\7N\2\2\u01ed\u01ee\7V\2\2\u01ee\u01f6\b\34\1\2\u01ef\u01f3\7)\2\2\u01f0"+
		"\u01f1\5<\37\2\u01f1\u01f2\b\34\1\2\u01f2\u01f4\3\2\2\2\u01f3\u01f0\3"+
		"\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\7*\2\2\u01f6"+
		"\u01ef\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\67\3\2\2\2\u01f8\u01f9\b\35\1"+
		"\2\u01f9\u01fa\7V\2\2\u01fa\u01fe\b\35\1\2\u01fb\u01fc\5:\36\2\u01fc\u01fd"+
		"\b\35\1\2\u01fd\u01ff\3\2\2\2\u01fe\u01fb\3\2\2\2\u01fe\u01ff\3\2\2\2"+
		"\u01ff9\3\2\2\2\u0200\u0205\b\36\1\2\u0201\u0202\7-\2\2\u0202\u0203\7"+
		"\3\2\2\u0203\u0204\7.\2\2\u0204\u0206\b\36\1\2\u0205\u0201\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208;\3\2\2\2"+
		"\u0209\u020a\5@!\2\u020a\u020f\b\37\1\2\u020b\u020c\5> \2\u020c\u020d"+
		"\5<\37\2\u020d\u020e\b\37\1\2\u020e\u0210\3\2\2\2\u020f\u020b\3\2\2\2"+
		"\u020f\u0210\3\2\2\2\u0210=\3\2\2\2\u0211\u0212\7\62\2\2\u0212\u022a\b"+
		" \1\2\u0213\u0214\7E\2\2\u0214\u022a\b \1\2\u0215\u0216\7F\2\2\u0216\u022a"+
		"\b \1\2\u0217\u0218\7G\2\2\u0218\u022a\b \1\2\u0219\u021a\7H\2\2\u021a"+
		"\u022a\b \1\2\u021b\u021c\7I\2\2\u021c\u022a\b \1\2\u021d\u021e\7J\2\2"+
		"\u021e\u022a\b \1\2\u021f\u0220\7K\2\2\u0220\u022a\b \1\2\u0221\u0222"+
		"\7L\2\2\u0222\u022a\b \1\2\u0223\u0224\7M\2\2\u0224\u022a\b \1\2\u0225"+
		"\u0226\7S\2\2\u0226\u022a\b \1\2\u0227\u0228\7U\2\2\u0228\u022a\b \1\2"+
		"\u0229\u0211\3\2\2\2\u0229\u0213\3\2\2\2\u0229\u0215\3\2\2\2\u0229\u0217"+
		"\3\2\2\2\u0229\u0219\3\2\2\2\u0229\u021b\3\2\2\2\u0229\u021d\3\2\2\2\u0229"+
		"\u021f\3\2\2\2\u0229\u0221\3\2\2\2\u0229\u0223\3\2\2\2\u0229\u0225\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u022a?\3\2\2\2\u022b\u022c\5B\"\2\u022c\u0233"+
		"\b!\1\2\u022d\u022e\7\65\2\2\u022e\u022f\5<\37\2\u022f\u0230\7\66\2\2"+
		"\u0230\u0231\5@!\2\u0231\u0232\b!\1\2\u0232\u0234\3\2\2\2\u0233\u022d"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234A\3\2\2\2\u0235\u0236\5D#\2\u0236\u023d"+
		"\b\"\1\2\u0237\u0238\79\2\2\u0238\u0239\5D#\2\u0239\u023a\b\"\1\2\u023a"+
		"\u023c\3\2\2\2\u023b\u0237\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023eC\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241"+
		"\5F$\2\u0241\u0248\b#\1\2\u0242\u0243\78\2\2\u0243\u0244\5F$\2\u0244\u0245"+
		"\b#\1\2\u0245\u0247\3\2\2\2\u0246\u0242\3\2\2\2\u0247\u024a\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249E\3\2\2\2\u024a\u0248\3\2\2\2"+
		"\u024b\u024c\5H%\2\u024c\u0253\b$\1\2\u024d\u024e\7B\2\2\u024e\u024f\5"+
		"H%\2\u024f\u0250\b$\1\2\u0250\u0252\3\2\2\2\u0251\u024d\3\2\2\2\u0252"+
		"\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254G\3\2\2\2"+
		"\u0255\u0253\3\2\2\2\u0256\u0257\5J&\2\u0257\u025e\b%\1\2\u0258\u0259"+
		"\7C\2\2\u0259\u025a\5J&\2\u025a\u025b\b%\1\2\u025b\u025d\3\2\2\2\u025c"+
		"\u0258\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025fI\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\5L\'\2\u0262\u0269"+
		"\b&\1\2\u0263\u0264\7A\2\2\u0264\u0265\5L\'\2\u0265\u0266\b&\1\2\u0266"+
		"\u0268\3\2\2\2\u0267\u0263\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026aK\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d"+
		"\5N(\2\u026d\u0278\b\'\1\2\u026e\u0273\b\'\1\2\u026f\u0270\7\67\2\2\u0270"+
		"\u0274\b\'\1\2\u0271\u0272\7O\2\2\u0272\u0274\b\'\1\2\u0273\u026f\3\2"+
		"\2\2\u0273\u0271\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5N(\2\u0276\u0277"+
		"\b\'\1\2\u0277\u0279\3\2\2\2\u0278\u026e\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"M\3\2\2\2\u027a\u027b\5P)\2\u027b\u0280\b(\1\2\u027c\u027d\7\37\2\2\u027d"+
		"\u027e\58\35\2\u027e\u027f\b(\1\2\u027f\u0281\3\2\2\2\u0280\u027c\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281O\3\2\2\2\u0282\u0283\5T+\2\u0283\u028a"+
		"\b)\1\2\u0284\u0285\5R*\2\u0285\u0286\5T+\2\u0286\u0287\b)\1\2\u0287\u0289"+
		"\3\2\2\2\u0288\u0284\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028bQ\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e\7Q\2\2\u028e"+
		"\u028f\7\62\2\2\u028f\u0298\b*\1\2\u0290\u0291\7P\2\2\u0291\u0292\7\62"+
		"\2\2\u0292\u0298\b*\1\2\u0293\u0294\7Q\2\2\u0294\u0298\b*\1\2\u0295\u0296"+
		"\7P\2\2\u0296\u0298\b*\1\2\u0297\u028d\3\2\2\2\u0297\u0290\3\2\2\2\u0297"+
		"\u0293\3\2\2\2\u0297\u0295\3\2\2\2\u0298S\3\2\2\2\u0299\u029a\5X-\2\u029a"+
		"\u02a1\b+\1\2\u029b\u029c\5V,\2\u029c\u029d\5X-\2\u029d\u029e\b+\1\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u029b\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2U\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5"+
		"\7Q\2\2\u02a5\u02a6\7Q\2\2\u02a6\u02ab\b,\1\2\u02a7\u02a8\7P\2\2\u02a8"+
		"\u02a9\7P\2\2\u02a9\u02ab\b,\1\2\u02aa\u02a4\3\2\2\2\u02aa\u02a7\3\2\2"+
		"\2\u02abW\3\2\2\2\u02ac\u02ad\5Z.\2\u02ad\u02ba\b-\1\2\u02ae\u02b3\b-"+
		"\1\2\u02af\u02b0\7=\2\2\u02b0\u02b4\b-\1\2\u02b1\u02b2\7>\2\2\u02b2\u02b4"+
		"\b-\1\2\u02b3\u02af\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b6\5Z.\2\u02b6\u02b7\b-\1\2\u02b7\u02b9\3\2\2\2\u02b8\u02ae\3\2\2"+
		"\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbY"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\5\\/\2\u02be\u02cd\b.\1\2\u02bf"+
		"\u02c6\b.\1\2\u02c0\u02c1\7?\2\2\u02c1\u02c7\b.\1\2\u02c2\u02c3\7@\2\2"+
		"\u02c3\u02c7\b.\1\2\u02c4\u02c5\7D\2\2\u02c5\u02c7\b.\1\2\u02c6\u02c0"+
		"\3\2\2\2\u02c6\u02c2\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02c9\5\\/\2\u02c9\u02ca\b.\1\2\u02ca\u02cc\3\2\2\2\u02cb\u02bf\3\2\2"+
		"\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce["+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\7=\2\2\u02d1\u02d2\5\\/\2\u02d2"+
		"\u02d3\b/\1\2\u02d3\u02e4\3\2\2\2\u02d4\u02d5\7>\2\2\u02d5\u02d6\5\\/"+
		"\2\u02d6\u02d7\b/\1\2\u02d7\u02e4\3\2\2\2\u02d8\u02d9\7:\2\2\u02d9\u02da"+
		"\5\\/\2\u02da\u02db\b/\1\2\u02db\u02e4\3\2\2\2\u02dc\u02dd\7;\2\2\u02dd"+
		"\u02de\5\\/\2\u02de\u02df\b/\1\2\u02df\u02e4\3\2\2\2\u02e0\u02e1\5^\60"+
		"\2\u02e1\u02e2\b/\1\2\u02e2\u02e4\3\2\2\2\u02e3\u02d0\3\2\2\2\u02e3\u02d4"+
		"\3\2\2\2\u02e3\u02d8\3\2\2\2\u02e3\u02dc\3\2\2\2\u02e3\u02e0\3\2\2\2\u02e4"+
		"]\3\2\2\2\u02e5\u02e6\7\64\2\2\u02e6\u02e7\5\\/\2\u02e7\u02e8\b\60\1\2"+
		"\u02e8\u0326\3\2\2\2\u02e9\u02ea\7\63\2\2\u02ea\u02eb\5\\/\2\u02eb\u02ec"+
		"\b\60\1\2\u02ec\u0326\3\2\2\2\u02ed\u02ee\5`\61\2\u02ee\u02ef\b\60\1\2"+
		"\u02ef\u0315\3\2\2\2\u02f0\u02f1\7)\2\2\u02f1\u02f2\5<\37\2\u02f2\u02f3"+
		"\b\60\1\2\u02f3\u02f4\7*\2\2\u02f4\u0315\3\2\2\2\u02f5\u02f6\5b\62\2\u02f6"+
		"\u02f7\b\60\1\2\u02f7\u0315\3\2\2\2\u02f8\u02f9\5f\64\2\u02f9\u02fa\b"+
		"\60\1\2\u02fa\u0315\3\2\2\2\u02fb\u02fc\7\65\2\2\u02fc\u02fd\7)\2\2\u02fd"+
		"\u02fe\5d\63\2\u02fe\u02ff\7*\2\2\u02ff\u0300\b\60\1\2\u0300\u0315\3\2"+
		"\2\2\u0301\u0302\7\25\2\2\u0302\u0303\58\35\2\u0303\u0304\b\60\1\2\u0304"+
		"\u0308\7)\2\2\u0305\u0306\5d\63\2\u0306\u0307\b\60\1\2\u0307\u0309\3\2"+
		"\2\2\u0308\u0305\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030b\7*\2\2\u030b\u030c\7\66\2\2\u030c\u0310\7)\2\2\u030d\u030e\5d\63"+
		"\2\u030e\u030f\b\60\1\2\u030f\u0311\3\2\2\2\u0310\u030d\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7*\2\2\u0313\u0315\3\2"+
		"\2\2\u0314\u02ed\3\2\2\2\u0314\u02f0\3\2\2\2\u0314\u02f5\3\2\2\2\u0314"+
		"\u02f8\3\2\2\2\u0314\u02fb\3\2\2\2\u0314\u0301\3\2\2\2\u0315\u031c\3\2"+
		"\2\2\u0316\u0317\7\61\2\2\u0317\u0318\5b\62\2\u0318\u0319\b\60\1\2\u0319"+
		"\u031b\3\2\2\2\u031a\u0316\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u0323\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0320\7:\2\2\u0320\u0324\b\60\1\2\u0321\u0322\7;\2\2\u0322\u0324\b\60"+
		"\1\2\u0323\u031f\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0326\3\2\2\2\u0325\u02e5\3\2\2\2\u0325\u02e9\3\2\2\2\u0325\u0314\3\2"+
		"\2\2\u0326_\3\2\2\2\u0327\u0328\7)\2\2\u0328\u0329\58\35\2\u0329\u032a"+
		"\7*\2\2\u032a\u032b\5<\37\2\u032b\u032c\b\61\1\2\u032ca\3\2\2\2\u032d"+
		"\u032e\7V\2\2\u032e\u0337\b\62\1\2\u032f\u0330\7)\2\2\u0330\u0334\b\62"+
		"\1\2\u0331\u0332\5d\63\2\u0332\u0333\b\62\1\2\u0333\u0335\3\2\2\2\u0334"+
		"\u0331\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\7*"+
		"\2\2\u0337\u032f\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0340\3\2\2\2\u0339"+
		"\u033a\7-\2\2\u033a\u033b\5<\37\2\u033b\u033c\7.\2\2\u033c\u033d\b\62"+
		"\1\2\u033d\u033f\3\2\2\2\u033e\u0339\3\2\2\2\u033f\u0342\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341c\3\2\2\2\u0342\u0340\3\2\2\2"+
		"\u0343\u0344\b\63\1\2\u0344\u0345\5<\37\2\u0345\u034c\b\63\1\2\u0346\u0347"+
		"\7\60\2\2\u0347\u0348\5<\37\2\u0348\u0349\b\63\1\2\u0349\u034b\3\2\2\2"+
		"\u034a\u0346\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034de\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\7\3\2\2\u0350"+
		"\u0360\b\64\1\2\u0351\u0352\7\4\2\2\u0352\u0360\b\64\1\2\u0353\u0354\7"+
		"\5\2\2\u0354\u0360\b\64\1\2\u0355\u0356\7\6\2\2\u0356\u0360\b\64\1\2\u0357"+
		"\u0358\7\7\2\2\u0358\u0360\b\64\1\2\u0359\u035a\7&\2\2\u035a\u0360\b\64"+
		"\1\2\u035b\u035c\7\'\2\2\u035c\u0360\b\64\1\2\u035d\u035e\7(\2\2\u035e"+
		"\u0360\b\64\1\2\u035f\u034f\3\2\2\2\u035f\u0351\3\2\2\2\u035f\u0353\3"+
		"\2\2\2\u035f\u0355\3\2\2\2\u035f\u0357\3\2\2\2\u035f\u0359\3\2\2\2\u035f"+
		"\u035b\3\2\2\2\u035f\u035d\3\2\2\2\u0360g\3\2\2\2Gls\u0083\u008e\u009e"+
		"\u00ac\u00b4\u00c1\u00ca\u00da\u00e4\u00ec\u00f8\u00fb\u0105\u0118\u011c"+
		"\u0126\u012a\u0135\u0137\u0155\u0162\u0171\u0189\u0199\u019f\u01a5\u01b6"+
		"\u01c6\u01ce\u01d8\u01e0\u01e5\u01f3\u01f6\u01fe\u0207\u020f\u0229\u0233"+
		"\u023d\u0248\u0253\u025e\u0269\u0273\u0278\u0280\u028a\u0297\u02a1\u02aa"+
		"\u02b3\u02ba\u02c6\u02cd\u02e3\u0308\u0310\u0314\u031c\u0323\u0325\u0334"+
		"\u0337\u0340\u034c\u035f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}