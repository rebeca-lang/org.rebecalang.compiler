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
		RULE_primary = 3, RULE_rebecaModel = 4, RULE_packageDeclaration = 5, RULE_importDeclaration = 6, 
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
			"rebecaCode", "physicalClassDeclaration", "modeDeclaration", "primary", 
			"rebecaModel", "packageDeclaration", "importDeclaration", "recordDeclaration", 
			"mainDeclaration", "mainRebecDefinition", "fieldDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableInitializer", "arrayInitializer", "interfaceDeclaration", 
			"reactiveClassDeclaration", "methodDeclaration", "constructorDeclaration", 
			"msgsrvDeclaration", "synchMethodDeclaration", "formalParameters", "formalParametersDeclaration", 
			"formalParameterDeclaration", "block", "statement", "forInit", "switchBlock", 
			"statementExpression", "annotation", "type", "genericTypeParams", "dimensions", 
			"expression", "assignmentOperator", "multiplicativeOp", "additiveOp", 
			"relationalOp", "shiftOp", "equalityOp", "unaryExpression", "coreExpression", 
			"castExpression", "expressionList", "literal"
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
		public RecordDeclarationContext rd;
		public FieldDeclarationContext fd;
		public Token featureName;
		public ReactiveClassDeclarationContext rcd;
		public InterfaceDeclarationContext intd;
		public PhysicalClassDeclarationContext pcd;
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
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public List<TerminalNode> FEATUREVAR() { return getTokens(HybridRebecaCompleteParser.FEATUREVAR); }
		public TerminalNode FEATUREVAR(int i) {
			return getToken(HybridRebecaCompleteParser.FEATUREVAR, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
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
			((RebecaCodeContext)_localctx).rc =  new HybridRebecaCode();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(91);
				((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(99);
					match(ENV);
					setState(100);
					((RebecaCodeContext)_localctx).fd = fieldDeclaration();
					setState(101);
					match(SEMI);
					_localctx.rc.getEnvironmentVariables().add(((RebecaCodeContext)_localctx).fd.fd);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(104);
					match(FEATUREVAR);
					setState(105);
					((RebecaCodeContext)_localctx).featureName = match(IDENTIFIER);
					setState(106);
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
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(113);
					((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
					_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
					}
					break;
				case 2:
					{
					setState(116);
					((RebecaCodeContext)_localctx).intd = interfaceDeclaration();
					_localctx.rc.getInterfaceDeclaration().add(((RebecaCodeContext)_localctx).intd.intd);
					}
					break;
				case 3:
					{
					setState(119);
					((RebecaCodeContext)_localctx).pcd = physicalClassDeclaration();
					_localctx.rc.getPhysicalClassDeclaration().add(((RebecaCodeContext)_localctx).pcd.pcd);
					}
					break;
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PHYSICALCLASS) | (1L << REACTIVECLASS) | (1L << INTERFACE) | (1L << ABSTRACT))) != 0) || _la==MONKEYS_AT );
			setState(126);
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

	public static class PhysicalClassDeclarationContext extends ParserRuleContext {
		public PhysicalClassDeclaration pcd;
		public AnnotationContext an;
		public Token physicalClassName;
		public Token queueSize;
		public FieldDeclarationContext fd;
		public Token RBRACE;
		public ConstructorDeclarationContext cd;
		public MsgsrvDeclarationContext mgd;
		public SynchMethodDeclarationContext smd;
		public ModeDeclarationContext md;
		public TerminalNode PHYSICALCLASS() { return getToken(HybridRebecaCompleteParser.PHYSICALCLASS, 0); }
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
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode INTLITERAL() { return getToken(HybridRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode KNOWNREBECS() { return getToken(HybridRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode STATEVARS() { return getToken(HybridRebecaCompleteParser.STATEVARS, 0); }
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
		public List<ModeDeclarationContext> modeDeclaration() {
			return getRuleContexts(ModeDeclarationContext.class);
		}
		public ModeDeclarationContext modeDeclaration(int i) {
			return getRuleContext(ModeDeclarationContext.class,i);
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
			((PhysicalClassDeclarationContext)_localctx).pcd =  new PhysicalClassDeclaration();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(130);
				((PhysicalClassDeclarationContext)_localctx).an = annotation();
				_localctx.pcd.getAnnotations().add(((PhysicalClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(PHYSICALCLASS);
			setState(139);
			((PhysicalClassDeclarationContext)_localctx).physicalClassName = match(IDENTIFIER);
				_localctx.pcd.setName((((PhysicalClassDeclarationContext)_localctx).physicalClassName!=null?((PhysicalClassDeclarationContext)_localctx).physicalClassName.getText():null)); 
			        		_localctx.pcd.setLineNumber(((PhysicalClassDeclarationContext)_localctx).physicalClassName.getLine()); _localctx.pcd.setCharacter(((PhysicalClassDeclarationContext)_localctx).physicalClassName.getCharPositionInLine());
			        	
			setState(141);
			match(LPAREN);
			setState(142);
			((PhysicalClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((PhysicalClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.pcd.setQueueSize(Integer.parseInt((((PhysicalClassDeclarationContext)_localctx).queueSize!=null?((PhysicalClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(144);
			match(RPAREN);
			setState(145);
			match(LBRACE);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(146);
				match(KNOWNREBECS);
				setState(147);
				match(LBRACE);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(148);
					((PhysicalClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.pcd.getKnownRebecs().add(((PhysicalClassDeclarationContext)_localctx).fd.fd);
					setState(150);
					match(SEMI);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				((PhysicalClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(160);
				match(STATEVARS);
				setState(161);
				match(LBRACE);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(162);
					((PhysicalClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.pcd.getStatevars().add(((PhysicalClassDeclarationContext)_localctx).fd.fd);
					setState(164);
					match(SEMI);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				((PhysicalClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODE) | (1L << ABSTRACT) | (1L << MSGSRV))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(174);
					((PhysicalClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.pcd.getConstructors().add(((PhysicalClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 2:
					{
					setState(177);
					((PhysicalClassDeclarationContext)_localctx).mgd = msgsrvDeclaration();
					_localctx.pcd.getMsgsrvs().add(((PhysicalClassDeclarationContext)_localctx).mgd.md);
					}
					break;
				case 3:
					{
					setState(180);
					((PhysicalClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.pcd.getSynchMethods().add(((PhysicalClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				case 4:
					{
					setState(183);
					((PhysicalClassDeclarationContext)_localctx).md = modeDeclaration();
					_localctx.pcd.getModeDeclarations().add(((PhysicalClassDeclarationContext)_localctx).md.md);
					}
					break;
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			((PhysicalClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.pcd.setEndLineNumber(((PhysicalClassDeclarationContext)_localctx).RBRACE.getLine());_localctx.pcd.setEndCharacter(((PhysicalClassDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
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
		public Token MODE;
		public Token modeName;
		public Token INV;
		public ExpressionContext e;
		public BlockContext b;
		public Token GUARD;
		public ExpressionContext e2;
		public TerminalNode MODE() { return getToken(HybridRebecaCompleteParser.MODE, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode INV() { return getToken(HybridRebecaCompleteParser.INV, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode GUARD() { return getToken(HybridRebecaCompleteParser.GUARD, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
			((ModeDeclarationContext)_localctx).md =  new ModeDeclaration(); 
				 GuardDeclaration gd = new GuardDeclaration(); _localctx.md.setGuardDeclaration(gd);
				 InvariantDeclaration id = new InvariantDeclaration(); _localctx.md.setInvariantDeclaration(id);
			setState(195);
			((ModeDeclarationContext)_localctx).MODE = match(MODE);
			setState(196);
			((ModeDeclarationContext)_localctx).modeName = match(IDENTIFIER);
				_localctx.md.setName((((ModeDeclarationContext)_localctx).modeName!=null?((ModeDeclarationContext)_localctx).modeName.getText():null)); 
					_localctx.md.setLineNumber(((ModeDeclarationContext)_localctx).MODE.getLine()); _localctx.md.setCharacter(((ModeDeclarationContext)_localctx).MODE.getCharPositionInLine());
				
			setState(198);
			match(LBRACE);
			setState(199);
			((ModeDeclarationContext)_localctx).INV = match(INV);
			setState(200);
			match(LPAREN);
			{
			setState(201);
			((ModeDeclarationContext)_localctx).e = expression(0);
			id.setCondition(((ModeDeclarationContext)_localctx).e.e);
			}
			setState(204);
			match(RPAREN);
			setState(205);
			((ModeDeclarationContext)_localctx).b = block();
			id.setBlock(((ModeDeclarationContext)_localctx).b.bs);id.setCharacter(((ModeDeclarationContext)_localctx).INV.getCharPositionInLine());id.setLineNumber(((ModeDeclarationContext)_localctx).INV.getLine());
			setState(207);
			((ModeDeclarationContext)_localctx).GUARD = match(GUARD);
			setState(208);
			match(LPAREN);
			{
			setState(209);
			((ModeDeclarationContext)_localctx).e2 = expression(0);
			gd.setCondition(((ModeDeclarationContext)_localctx).e2.e);
			}
			setState(212);
			match(RPAREN);
			setState(213);
			((ModeDeclarationContext)_localctx).b = block();
			gd.setBlock(((ModeDeclarationContext)_localctx).b.bs);gd.setCharacter(((ModeDeclarationContext)_localctx).GUARD.getCharPositionInLine());gd.setLineNumber(((ModeDeclarationContext)_localctx).GUARD.getLine());
			setState(215);
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
		public Token id1;
		public Token lp;
		public ExpressionListContext el;
		public ExpressionContext ef;
		public ExpressionContext ed;
		public ExpressionContext e2;
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(HybridRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HybridRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> PRIME() { return getTokens(HybridRebecaCompleteParser.PRIME); }
		public TerminalNode PRIME(int i) {
			return getToken(HybridRebecaCompleteParser.PRIME, i);
		}
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
		public TerminalNode AFTER() { return getToken(HybridRebecaCompleteParser.AFTER, 0); }
		public TerminalNode DEADLINE() { return getToken(HybridRebecaCompleteParser.DEADLINE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
			setState(217);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(219);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(221);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(226);
				match(RPAREN);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(227);
					match(AFTER);
					setState(228);
					match(LPAREN);
					setState(229);
					((PrimaryContext)_localctx).ef = expression(0);
					setState(230);
					match(RPAREN);
					psp.setAfterExpression(((PrimaryContext)_localctx).ef.e);
					}
					break;
				}
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(235);
					match(DEADLINE);
					setState(236);
					match(LPAREN);
					setState(237);
					((PrimaryContext)_localctx).ed = expression(0);
					setState(238);
					match(RPAREN);
					psp.setDeadlineExpression(((PrimaryContext)_localctx).ed.e);
					}
					break;
				}
				}
				break;
			}
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(LBRACKET);
					setState(246);
					((PrimaryContext)_localctx).e2 = expression(0);
					setState(247);
					match(RBRACKET);
					_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(PRIME);
					if (!(_localctx.tp instanceof HybridTermPrimary)) ((PrimaryContext)_localctx).tp =  HybridrebecaUtils.transformTermPrimaryToHybridTermPrimary(_localctx.tp);
						  	 ((HybridTermPrimary)_localctx.tp).setDerivativeOrder(((HybridTermPrimary)_localctx.tp).getDerivativeOrder() + 1);
					}
					} 
				}
				setState(261);
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
		enterRule(_localctx, 8, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(263);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(268);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(276);
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
		enterRule(_localctx, 10, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 12, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 14, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		enterRule(_localctx, 16, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(286);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(288);
			match(LBRACE);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(289);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
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
		enterRule(_localctx, 18, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(301);
				((MainRebecDefinitionContext)_localctx).an = annotation();
				_localctx.mrd.getAnnotations().add(((MainRebecDefinitionContext)_localctx).an.an);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(310);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(312);
			match(LPAREN);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(313);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(318);
			match(RPAREN);
			setState(319);
			match(COLON);
			setState(320);
			match(LPAREN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(321);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(326);
			match(RPAREN);
			setState(327);
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
		enterRule(_localctx, 20, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(330);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			((FieldDeclarationContext)_localctx).t = type();
			setState(339);
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
		enterRule(_localctx, 22, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(343);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(353);
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
		enterRule(_localctx, 24, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(355);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(357);
				match(EQ);
				setState(358);
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
		enterRule(_localctx, 26, RULE_variableInitializer);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
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
				setState(366);
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
		enterRule(_localctx, 28, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(372);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(373);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(375);
					match(COMMA);
					setState(376);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(386);
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
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(389);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(INTERFACE);
			setState(398);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(400);
				match(EXTENDS);
				setState(401);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(403);
					match(COMMA);
					setState(404);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(413);
			match(LBRACE);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==MONKEYS_AT) {
				{
				{
				MethodDeclaration md = new MsgsrvDeclaration();md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(415);
					((InterfaceDeclarationContext)_localctx).an = annotation();
					md.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(MSGSRV);
				setState(424);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(426);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(428);
				match(SEMI);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
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
		enterRule(_localctx, 32, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(439);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(447);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(451);
			match(REACTIVECLASS);
			setState(452);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(454);
				match(EXTENDS);
				setState(455);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(459);
				match(IMPLEMENTS);
				setState(460);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(462);
					match(COMMA);
					setState(463);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(472);
			match(LPAREN);
			setState(473);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(475);
			match(RPAREN);
			setState(476);
			match(LBRACE);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (ABSTRACT - 41)) | (1L << (MSGSRV - 41)) | (1L << (STATEVARS - 41)) | (1L << (KNOWNREBECS - 41)) | (1L << (MONKEYS_AT - 41)) | (1L << (IDENTIFIER - 41)))) != 0)) {
				{
				setState(510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					{
					setState(477);
					match(KNOWNREBECS);
					setState(478);
					match(LBRACE);
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(479);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(481);
						match(SEMI);
						}
						}
						setState(487);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(488);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 2:
					{
					{
					setState(489);
					match(STATEVARS);
					setState(490);
					match(LBRACE);
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==MONKEYS_AT || _la==IDENTIFIER) {
						{
						{
						setState(491);
						((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
						_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
						setState(493);
						match(SEMI);
						}
						}
						setState(499);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(500);
					((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
					}
					}
					break;
				case 3:
					{
					setState(501);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 4:
					{
					setState(504);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 5:
					{
					setState(507);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
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
		enterRule(_localctx, 34, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(520);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(522);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(525);
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
		enterRule(_localctx, 36, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(529);
				((ConstructorDeclarationContext)_localctx).an = annotation();
				_localctx.cd.getAnnotations().add(((ConstructorDeclarationContext)_localctx).an.an);
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
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
		enterRule(_localctx, 38, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(540);
				((MsgsrvDeclarationContext)_localctx).an = annotation();
				_localctx.md.getAnnotations().add(((MsgsrvDeclarationContext)_localctx).an.an);
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(548);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(552);
			match(MSGSRV);
			setState(553);
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
		enterRule(_localctx, 40, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(556);
				((SynchMethodDeclarationContext)_localctx).an = annotation();
				_localctx.smd.getAnnotations().add(((SynchMethodDeclarationContext)_localctx).an.an);
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(564);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(568);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(570);
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
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(573);
			match(LPAREN);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(574);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(579);
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
		enterRule(_localctx, 44, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(582);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(592);
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
		enterRule(_localctx, 46, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(594);
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
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(598);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				ArrayList<Annotation> anns = new ArrayList<Annotation>();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(601);
						((BlockContext)_localctx).an = annotation();
						anns.add(((BlockContext)_localctx).an.an);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(609);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s); ((BlockContext)_localctx).s.s.getAnnotations().addAll(anns);
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
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
		enterRule(_localctx, 50, RULE_statement);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(622);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(626);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(631);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(633);
				match(LPAREN);
				setState(634);
				((StatementContext)_localctx).e = expression(0);
				setState(635);
				match(RPAREN);
				setState(636);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(638);
					match(ELSE);
					setState(639);
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
				setState(644);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(646);
				match(LPAREN);
				setState(647);
				((StatementContext)_localctx).e = expression(0);
				setState(648);
				match(RPAREN);
				setState(649);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(652);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(654);
				match(LPAREN);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(655);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(660);
				match(SEMI);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(661);
					((StatementContext)_localctx).e = expression(0);
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(666);
				match(SEMI);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(667);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(672);
				match(RPAREN);
				setState(673);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(676);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(677);
				match(LPAREN);
				setState(678);
				((StatementContext)_localctx).e = expression(0);
				setState(679);
				match(RPAREN);
				setState(680);
				match(LBRACE);
				setState(681);
				((StatementContext)_localctx).sb = switchBlock();
				setState(682);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(685);
				((StatementContext)_localctx).RETURN = match(RETURN);
				((StatementContext)_localctx).s =  new ReturnStatement();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(687);
					((StatementContext)_localctx).e = expression(0);
					((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e);
					}
				}

				setState(692);
				match(SEMI);
				_localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());
				    	 _localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(694);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(695);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(697);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(698);
				match(SEMI);
				((StatementContext)_localctx).s =  new ContinueStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(700);
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
		enterRule(_localctx, 52, RULE_forInit);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
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
		enterRule(_localctx, 54, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(742); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    		
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(714);
					((SwitchBlockContext)_localctx).an = annotation();
					anns.add(((SwitchBlockContext)_localctx).an.an);
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(722);
				match(CASE);
				setState(723);
				((SwitchBlockContext)_localctx).e = expression(0);
				setState(724);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(731);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(726);
								((SwitchBlockContext)_localctx).an = annotation();
								anns.add(((SwitchBlockContext)_localctx).an.an);
								}
								} 
							}
							setState(733);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						}
						setState(734);
						((SwitchBlockContext)_localctx).st = statement();

											((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns);
											_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1)
												.getStatements().add(((SwitchBlockContext)_localctx).st.s);
										
						}
						} 
					}
					setState(741);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				}
				setState(744); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==MONKEYS_AT );
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(746);
				((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);
				setState(747);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(749);
							((SwitchBlockContext)_localctx).an = annotation();
							anns.add(((SwitchBlockContext)_localctx).an.an);
							}
							} 
						}
						setState(756);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					}
					setState(757);
					((SwitchBlockContext)_localctx).st = statement();
					((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns); _localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(764);
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
		enterRule(_localctx, 56, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
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
		enterRule(_localctx, 58, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(771);
			match(MONKEYS_AT);
			setState(772);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(774);
				match(LPAREN);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(775);
					((AnnotationContext)_localctx).exp = expression(0);
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(780);
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
		enterRule(_localctx, 60, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(785);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(790);
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
		enterRule(_localctx, 62, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(797);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(799);
				match(COMMA);
				setState(800);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808);
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
		enterRule(_localctx, 64, RULE_dimensions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(815); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(811);
					match(LBRACKET);
					setState(812);
					((DimensionsContext)_localctx).i = match(INTLITERAL);
					setState(813);
					match(RBRACKET);
					_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(817); 
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(820);
				((ExpressionContext)_localctx).ece = coreExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ece.e;
				}
				break;
			case 2:
				{
				setState(823);
				((ExpressionContext)_localctx).ue = unaryExpression();
				((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).ue.e;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(895);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.me1 = _prevctx;
						_localctx.me1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(828);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(829);
						((ExpressionContext)_localctx).mo = multiplicativeOp();
						setState(830);
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
						setState(833);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(834);
						((ExpressionContext)_localctx).ado = additiveOp();
						setState(835);
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
						setState(838);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(839);
						((ExpressionContext)_localctx).so = shiftOp();
						setState(840);
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
						setState(843);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(844);
						((ExpressionContext)_localctx).ro = relationalOp();
						setState(845);
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
						setState(848);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(849);
						((ExpressionContext)_localctx).eo = equalityOp();
						setState(850);
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
						setState(853);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(854);
						((ExpressionContext)_localctx).AMP = match(AMP);
						setState(855);
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
						setState(858);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(859);
						((ExpressionContext)_localctx).CARET = match(CARET);
						setState(860);
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
						setState(863);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(864);
						((ExpressionContext)_localctx).BAR = match(BAR);
						setState(865);
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
						setState(868);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(869);
						((ExpressionContext)_localctx).AMPAMP = match(AMPAMP);
						setState(870);
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
						setState(873);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(874);
						((ExpressionContext)_localctx).BARBAR = match(BARBAR);
						setState(875);
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
						setState(878);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(879);
						match(QUES);
						setState(880);
						((ExpressionContext)_localctx).cee2 = expression(0);
						setState(881);
						match(COLON);
						setState(882);
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
						setState(885);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(886);
						((ExpressionContext)_localctx).ao = assignmentOperator();
						setState(887);
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
						setState(890);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(891);
						match(INSTANCEOF);
						setState(892);
						((ExpressionContext)_localctx).t = type();
						InstanceofExpression e3 = new InstanceofExpression(); e3.setValue(((ExpressionContext)_localctx).ie1.e); e3.setEvaluationType(((ExpressionContext)_localctx).t.t);
						                       e3.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE); e3.setLineNumber(((ExpressionContext)_localctx).t.t.getLineNumber()); e3.setCharacter(((ExpressionContext)_localctx).t.t.getCharacter());
						                       ((ExpressionContext)_localctx).e =  e3; 
						}
						break;
					}
					} 
				}
				setState(899);
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
		enterRule(_localctx, 68, RULE_assignmentOperator);
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(906);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(908);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(910);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(912);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(914);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(916);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(918);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(920);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(922);
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
		enterRule(_localctx, 70, RULE_multiplicativeOp);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				((MultiplicativeOpContext)_localctx).STAR = match(STAR);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).STAR!=null?((MultiplicativeOpContext)_localctx).STAR.getText():null);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				((MultiplicativeOpContext)_localctx).SLASH = match(SLASH);
				((MultiplicativeOpContext)_localctx).mo =  (((MultiplicativeOpContext)_localctx).SLASH!=null?((MultiplicativeOpContext)_localctx).SLASH.getText():null);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
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
		enterRule(_localctx, 72, RULE_additiveOp);
		try {
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				((AdditiveOpContext)_localctx).PLUS = match(PLUS);
				((AdditiveOpContext)_localctx).ado =  (((AdditiveOpContext)_localctx).PLUS!=null?((AdditiveOpContext)_localctx).PLUS.getText():null);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
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
		enterRule(_localctx, 74, RULE_relationalOp);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(941);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(944);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
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
		enterRule(_localctx, 76, RULE_shiftOp);
		try {
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				match(LT);
				setState(953);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				match(GT);
				setState(956);
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
		enterRule(_localctx, 78, RULE_equalityOp);
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				((EqualityOpContext)_localctx).EQEQ = match(EQEQ);
				((EqualityOpContext)_localctx).eo =  (((EqualityOpContext)_localctx).EQEQ!=null?((EqualityOpContext)_localctx).EQEQ.getText():null);
				}
				break;
			case BANGEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
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
		enterRule(_localctx, 80, RULE_unaryExpression);
		try {
			setState(993);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				match(PLUS);
				setState(967);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(971);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(974);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(975);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(979);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case TILDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(982);
				((UnaryExpressionContext)_localctx).TILDA = match(TILDA);
				setState(983);
				((UnaryExpressionContext)_localctx).et = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).TILDA!=null?((UnaryExpressionContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).et.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).et.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).et.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(986);
				((UnaryExpressionContext)_localctx).BANG = match(BANG);
				setState(987);
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
				setState(990);
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
		enterRule(_localctx, 82, RULE_coreExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(995);
				((CoreExpressionContext)_localctx).ec = castExpression();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ec.e;
				}
				break;
			case 2:
				{
				setState(998);
				match(LPAREN);
				setState(999);
				((CoreExpressionContext)_localctx).ep = expression(0);
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).ep.e;
				setState(1001);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(1003);
				((CoreExpressionContext)_localctx).p = primary();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).p.tp;
				}
				break;
			case 4:
				{
				setState(1006);
				((CoreExpressionContext)_localctx).l = literal();
				((CoreExpressionContext)_localctx).e =  ((CoreExpressionContext)_localctx).l.l;
				}
				break;
			case 5:
				{
				setState(1009);
				((CoreExpressionContext)_localctx).QUES = match(QUES);
				setState(1010);
				match(LPAREN);
				setState(1011);
				((CoreExpressionContext)_localctx).el = expressionList();
				setState(1012);
				match(RPAREN);
				((CoreExpressionContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((CoreExpressionContext)_localctx).el.el);
					    	_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).QUES.getCharPositionInLine());
				}
				break;
			case 6:
				{
				setState(1015);
				match(NEW);
				setState(1016);
				((CoreExpressionContext)_localctx).t = type();
				((CoreExpressionContext)_localctx).e =  new RebecInstantiationPrimary();
								_localctx.e.setLineNumber(((CoreExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((CoreExpressionContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((CoreExpressionContext)_localctx).t.t);
				setState(1018);
				match(LPAREN);
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1019);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(1024);
				match(RPAREN);
				setState(1025);
				match(COLON);
				setState(1026);
				match(LPAREN);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1027);
					((CoreExpressionContext)_localctx).el = expressionList();
					((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((CoreExpressionContext)_localctx).el.el);
					}
				}

				setState(1032);
				match(RPAREN);
				}
				break;
			}
			setState(1042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1036);
					((CoreExpressionContext)_localctx).DOT = match(DOT);
					setState(1037);
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
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1045);
				((CoreExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((CoreExpressionContext)_localctx).e = pse;
				        		pse.setLineNumber(((CoreExpressionContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((CoreExpressionContext)_localctx).PLUSPLUS.getCharPositionInLine());
				}
				break;
			case 2:
				{
				setState(1047);
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
		enterRule(_localctx, 84, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(LPAREN);
			setState(1052);
			((CastExpressionContext)_localctx).t = type();
			setState(1053);
			match(RPAREN);
			setState(1054);
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
		enterRule(_localctx, 86, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(1058);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1066);
			((ExpressionListContext)_localctx).e = expression(0);
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1068);
				match(COMMA);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(1069);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1077);
				((ExpressionListContext)_localctx).e = expression(0);
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(1084);
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
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(1101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1091);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1093);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1095);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1097);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1099);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3c\u0452\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\6\2}\n\2\r\2\16\2~\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0088"+
		"\n\3\f\3\16\3\u008b\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3\u009b\n\3\f\3\16\3\u009e\13\3\3\3\5\3\u00a1\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\u00a9\n\3\f\3\16\3\u00ac\13\3\3\3\5\3\u00af\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00bd\n\3\f\3\16\3"+
		"\u00c0\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00e3\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ec\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u00f4\n\5\5\5\u00f6\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u00fd"+
		"\n\5\f\5\16\5\u0100\13\5\3\5\3\5\7\5\u0104\n\5\f\5\16\5\u0107\13\5\3\6"+
		"\3\6\3\6\3\6\5\6\u010d\n\6\3\6\3\6\3\6\7\6\u0112\n\6\f\6\16\6\u0115\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0127\n\n\f\n\16\n\u012a\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0133"+
		"\n\13\f\13\16\13\u0136\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013f"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0147\n\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\7\f\u0150\n\f\f\f\16\f\u0153\13\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u0160\n\r\f\r\16\r\u0163\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u016c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0174\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u017e\n\20\f"+
		"\20\16\20\u0181\13\20\5\20\u0183\n\20\3\20\3\20\3\21\3\21\3\21\3\21\7"+
		"\21\u018b\n\21\f\21\16\21\u018e\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0199\n\21\f\21\16\21\u019c\13\21\5\21\u019e\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u01a5\n\21\f\21\16\21\u01a8\13\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u01b1\n\21\f\21\16\21\u01b4\13\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u01bd\n\22\f\22\16\22\u01c0\13"+
		"\22\3\22\3\22\5\22\u01c4\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01cc"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01d4\n\22\f\22\16\22\u01d7\13"+
		"\22\5\22\u01d9\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u01e6\n\22\f\22\16\22\u01e9\13\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u01f2\n\22\f\22\16\22\u01f5\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0201\n\22\f\22\16\22\u0204\13\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0211\n\23"+
		"\3\24\3\24\3\24\3\24\7\24\u0217\n\24\f\24\16\24\u021a\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u0222\n\25\f\25\16\25\u0225\13\25\3\25\3\25"+
		"\5\25\u0229\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0232\n\26\f"+
		"\26\16\26\u0235\13\26\3\26\3\26\5\26\u0239\n\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u0244\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u024f\n\30\f\30\16\30\u0252\13\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u025f\n\32\f\32\16\32\u0262"+
		"\13\32\3\32\3\32\3\32\7\32\u0267\n\32\f\32\16\32\u026a\13\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0285\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0295"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u029b\n\33\3\33\3\33\3\33\3\33\5\33\u02a1"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u02b5\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u02c1\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u02c9\n\34\3\35\3\35\3\35\3\35\3\35\7\35\u02d0\n\35\f\35\16\35\u02d3"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u02dc\n\35\f\35\16\35\u02df"+
		"\13\35\3\35\3\35\3\35\7\35\u02e4\n\35\f\35\16\35\u02e7\13\35\6\35\u02e9"+
		"\n\35\r\35\16\35\u02ea\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u02f3\n\35\f"+
		"\35\16\35\u02f6\13\35\3\35\3\35\3\35\7\35\u02fb\n\35\f\35\16\35\u02fe"+
		"\13\35\5\35\u0300\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\5\37\u030d\n\37\3\37\5\37\u0310\n\37\3 \3 \3 \3 \3 \5 \u0317"+
		"\n \3 \3 \3 \5 \u031c\n \3!\3!\3!\3!\3!\3!\3!\3!\7!\u0326\n!\f!\16!\u0329"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\6\"\u0332\n\"\r\"\16\"\u0333\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u033d\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\7#\u0382\n#\f#\16#\u0385\13#\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u039f\n$\3%\3%\3%"+
		"\3%\3%\3%\5%\u03a7\n%\3&\3&\3&\3&\5&\u03ad\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u03b9\n\'\3(\3(\3(\3(\3(\3(\5(\u03c1\n(\3)\3)\3)"+
		"\3)\5)\u03c7\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u03e4\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0401\n+\3+\3+"+
		"\3+\3+\3+\3+\5+\u0409\n+\3+\3+\5+\u040d\n+\3+\3+\3+\3+\7+\u0413\n+\f+"+
		"\16+\u0416\13+\3+\3+\3+\3+\5+\u041c\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\7"+
		"-\u0428\n-\f-\16-\u042b\13-\3-\3-\3-\3-\3-\3-\7-\u0433\n-\f-\16-\u0436"+
		"\13-\3-\3-\3-\7-\u043b\n-\f-\16-\u043e\13-\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u0450\n.\3.\2\3D/\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\2\2\u04b8\2\\\3"+
		"\2\2\2\4\u0083\3\2\2\2\6\u00c4\3\2\2\2\b\u00db\3\2\2\2\n\u0108\3\2\2\2"+
		"\f\u0119\3\2\2\2\16\u011b\3\2\2\2\20\u011d\3\2\2\2\22\u011f\3\2\2\2\24"+
		"\u012e\3\2\2\2\26\u014b\3\2\2\2\30\u0158\3\2\2\2\32\u0164\3\2\2\2\34\u0173"+
		"\3\2\2\2\36\u0175\3\2\2\2 \u0186\3\2\2\2\"\u01b8\3\2\2\2$\u0208\3\2\2"+
		"\2&\u0212\3\2\2\2(\u021d\3\2\2\2*\u022d\3\2\2\2,\u023e\3\2\2\2.\u0247"+
		"\3\2\2\2\60\u0253\3\2\2\2\62\u0257\3\2\2\2\64\u02c0\3\2\2\2\66\u02c8\3"+
		"\2\2\28\u02ca\3\2\2\2:\u0301\3\2\2\2<\u0304\3\2\2\2>\u0311\3\2\2\2@\u031d"+
		"\3\2\2\2B\u032c\3\2\2\2D\u033c\3\2\2\2F\u039e\3\2\2\2H\u03a6\3\2\2\2J"+
		"\u03ac\3\2\2\2L\u03b8\3\2\2\2N\u03c0\3\2\2\2P\u03c6\3\2\2\2R\u03e3\3\2"+
		"\2\2T\u040c\3\2\2\2V\u041d\3\2\2\2X\u0423\3\2\2\2Z\u044f\3\2\2\2\\b\b"+
		"\2\1\2]^\5\20\t\2^_\b\2\1\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc"+
		"\3\2\2\2cp\3\2\2\2db\3\2\2\2ef\7&\2\2fg\5\26\f\2gh\7<\2\2hi\b\2\1\2io"+
		"\3\2\2\2jk\7\'\2\2kl\7c\2\2lm\7<\2\2mo\b\2\1\2ne\3\2\2\2nj\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q|\3\2\2\2rp\3\2\2\2st\5\"\22\2tu\b\2\1\2u}"+
		"\3\2\2\2vw\5 \21\2wx\b\2\1\2x}\3\2\2\2yz\5\4\3\2z{\b\2\1\2{}\3\2\2\2|"+
		"s\3\2\2\2|v\3\2\2\2|y\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\5\22\n\2\u0081\u0082\b\2\1\2\u0082\3\3\2\2\2\u0083"+
		"\u0089\b\3\1\2\u0084\u0085\5<\37\2\u0085\u0086\b\3\1\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\4"+
		"\2\2\u008d\u008e\7c\2\2\u008e\u008f\b\3\1\2\u008f\u0090\7\66\2\2\u0090"+
		"\u0091\7\13\2\2\u0091\u0092\b\3\1\2\u0092\u0093\7\67\2\2\u0093\u00a0\7"+
		"8\2\2\u0094\u0095\7\61\2\2\u0095\u009c\78\2\2\u0096\u0097\5\26\f\2\u0097"+
		"\u0098\b\3\1\2\u0098\u0099\7<\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\79\2\2\u00a0\u0094\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ae\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3"+
		"\u00aa\78\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\b\3\1\2\u00a6\u00a7\7<"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00af\79\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00be\3\2\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\b\3\1\2\u00b2\u00bd\3\2"+
		"\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\b\3\1\2\u00b5\u00bd\3\2\2\2\u00b6"+
		"\u00b7\5*\26\2\u00b7\u00b8\b\3\1\2\u00b8\u00bd\3\2\2\2\u00b9\u00ba\5\6"+
		"\4\2\u00ba\u00bb\b\3\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc"+
		"\u00b3\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\79\2\2\u00c2\u00c3\b\3\1\2\u00c3\5\3\2\2\2"+
		"\u00c4\u00c5\b\4\1\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8"+
		"\b\4\1\2\u00c8\u00c9\78\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\7\66\2\2\u00cb"+
		"\u00cc\5D#\2\u00cc\u00cd\b\4\1\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\67"+
		"\2\2\u00cf\u00d0\5\62\32\2\u00d0\u00d1\b\4\1\2\u00d1\u00d2\7\6\2\2\u00d2"+
		"\u00d3\7\66\2\2\u00d3\u00d4\5D#\2\u00d4\u00d5\b\4\1\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\7\67\2\2\u00d7\u00d8\5\62\32\2\u00d8\u00d9\b\4\1\2\u00d9"+
		"\u00da\79\2\2\u00da\7\3\2\2\2\u00db\u00dc\7c\2\2\u00dc\u00f5\b\5\1\2\u00dd"+
		"\u00de\7\66\2\2\u00de\u00e2\b\5\1\2\u00df\u00e0\5X-\2\u00e0\u00e1\b\5"+
		"\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00eb\7\67\2\2\u00e5\u00e6\7\t\2\2\u00e6\u00e7\7"+
		"\66\2\2\u00e7\u00e8\5D#\2\u00e8\u00e9\7\67\2\2\u00e9\u00ea\b\5\1\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f3\3\2"+
		"\2\2\u00ed\u00ee\7\n\2\2\u00ee\u00ef\7\66\2\2\u00ef\u00f0\5D#\2\u00f0"+
		"\u00f1\7\67\2\2\u00f1\u00f2\b\5\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00ed\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00dd\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fe\3\2\2\2\u00f7\u00f8\7:\2\2\u00f8\u00f9\5D#"+
		"\2\u00f9\u00fa\7;\2\2\u00fa\u00fb\b\5\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f7"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0105\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\b\2\2\u0102\u0104\b\5"+
		"\1\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\t\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010c\b\6\1\2"+
		"\u0109\u010a\5\f\7\2\u010a\u010b\b\6\1\2\u010b\u010d\3\2\2\2\u010c\u0109"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0113\3\2\2\2\u010e\u010f\5\16\b\2"+
		"\u010f\u0110\b\6\1\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\5\2\2\2\u0117\u0118\b\6\1\2\u0118\13\3\2\2"+
		"\2\u0119\u011a\7\36\2\2\u011a\r\3\2\2\2\u011b\u011c\7\34\2\2\u011c\17"+
		"\3\2\2\2\u011d\u011e\7\"\2\2\u011e\21\3\2\2\2\u011f\u0120\b\n\1\2\u0120"+
		"\u0121\7/\2\2\u0121\u0122\b\n\1\2\u0122\u0128\78\2\2\u0123\u0124\5\24"+
		"\13\2\u0124\u0125\b\n\1\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u012c\79\2\2\u012c\u012d\b\n\1\2\u012d"+
		"\23\3\2\2\2\u012e\u0134\b\13\1\2\u012f\u0130\5<\37\2\u0130\u0131\b\13"+
		"\1\2\u0131\u0133\3\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\5> \2\u0138\u0139\7c\2\2\u0139\u013a\b\13\1\2\u013a\u013e"+
		"\7\66\2\2\u013b\u013c\5X-\2\u013c\u013d\b\13\1\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\67"+
		"\2\2\u0141\u0142\7C\2\2\u0142\u0146\7\66\2\2\u0143\u0144\5X-\2\u0144\u0145"+
		"\b\13\1\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0147\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0149\7\67\2\2\u0149\u014a\7<\2\2\u014a\25"+
		"\3\2\2\2\u014b\u0151\b\f\1\2\u014c\u014d\5<\37\2\u014d\u014e\b\f\1\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014c\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\5> \2\u0155\u0156\5\30\r\2\u0156\u0157\b\f\1\2\u0157\27\3\2\2\2"+
		"\u0158\u0159\b\r\1\2\u0159\u015a\5\32\16\2\u015a\u0161\b\r\1\2\u015b\u015c"+
		"\7=\2\2\u015c\u015d\5\32\16\2\u015d\u015e\b\r\1\2\u015e\u0160\3\2\2\2"+
		"\u015f\u015b\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\31\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b\16\1\2\u0165"+
		"\u0166\7c\2\2\u0166\u016b\b\16\1\2\u0167\u0168\7?\2\2\u0168\u0169\5\34"+
		"\17\2\u0169\u016a\b\16\1\2\u016a\u016c\3\2\2\2\u016b\u0167\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\33\3\2\2\2\u016d\u016e\5\36\20\2\u016e\u016f\b\17"+
		"\1\2\u016f\u0174\3\2\2\2\u0170\u0171\5D#\2\u0171\u0172\b\17\1\2\u0172"+
		"\u0174\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u0170\3\2\2\2\u0174\35\3\2\2"+
		"\2\u0175\u0176\b\20\1\2\u0176\u0182\78\2\2\u0177\u0178\5\34\17\2\u0178"+
		"\u017f\b\20\1\2\u0179\u017a\7=\2\2\u017a\u017b\5\34\17\2\u017b\u017c\b"+
		"\20\1\2\u017c\u017e\3\2\2\2\u017d\u0179\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0177\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\79\2\2\u0185\37\3\2\2\2\u0186\u018c\b\21\1\2\u0187\u0188\5<\37"+
		"\2\u0188\u0189\b\21\1\2\u0189\u018b\3\2\2\2\u018a\u0187\3\2\2\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7*\2\2\u0190\u0191\7c\2\2\u0191\u019d"+
		"\b\21\1\2\u0192\u0193\7,\2\2\u0193\u0194\7c\2\2\u0194\u019a\b\21\1\2\u0195"+
		"\u0196\7=\2\2\u0196\u0197\7c\2\2\u0197\u0199\b\21\1\2\u0198\u0195\3\2"+
		"\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u0192\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01b2\78\2\2\u01a0\u01a6\b\21\1\2\u01a1"+
		"\u01a2\5<\37\2\u01a2\u01a3\b\21\1\2\u01a3\u01a5\3\2\2\2\u01a4\u01a1\3"+
		"\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7.\2\2\u01aa\u01ab\7c\2"+
		"\2\u01ab\u01ac\b\21\1\2\u01ac\u01ad\5,\27\2\u01ad\u01ae\b\21\1\2\u01ae"+
		"\u01af\7<\2\2\u01af\u01b1\3\2\2\2\u01b0\u01a0\3\2\2\2\u01b1\u01b4\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b6\79\2\2\u01b6\u01b7\b\21\1\2\u01b7!\3\2\2\2"+
		"\u01b8\u01be\b\22\1\2\u01b9\u01ba\5<\37\2\u01ba\u01bb\b\22\1\2\u01bb\u01bd"+
		"\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c3\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7+"+
		"\2\2\u01c2\u01c4\b\22\1\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\7)\2\2\u01c6\u01c7\7c\2\2\u01c7\u01cb\b\22"+
		"\1\2\u01c8\u01c9\7,\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cc\b\22\1\2\u01cb"+
		"\u01c8\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d8\3\2\2\2\u01cd\u01ce\7-"+
		"\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d5\b\22\1\2\u01d0\u01d1\7=\2\2\u01d1"+
		"\u01d2\7c\2\2\u01d2\u01d4\b\22\1\2\u01d3\u01d0\3\2\2\2\u01d4\u01d7\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01cd\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01db\7\66\2\2\u01db\u01dc\7\13\2\2\u01dc\u01dd\b\22\1\2\u01dd"+
		"\u01de\7\67\2\2\u01de\u0202\78\2\2\u01df\u01e0\7\61\2\2\u01e0\u01e7\7"+
		"8\2\2\u01e1\u01e2\5\26\f\2\u01e2\u01e3\b\22\1\2\u01e3\u01e4\7<\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u0201\79\2\2\u01eb\u01ec\7\60\2\2\u01ec\u01f3\78\2\2\u01ed\u01ee\5\26"+
		"\f\2\u01ee\u01ef\b\22\1\2\u01ef\u01f0\7<\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u0201\79\2\2\u01f7"+
		"\u01f8\5&\24\2\u01f8\u01f9\b\22\1\2\u01f9\u0201\3\2\2\2\u01fa\u01fb\5"+
		"(\25\2\u01fb\u01fc\b\22\1\2\u01fc\u0201\3\2\2\2\u01fd\u01fe\5*\26\2\u01fe"+
		"\u01ff\b\22\1\2\u01ff\u0201\3\2\2\2\u0200\u01df\3\2\2\2\u0200\u01eb\3"+
		"\2\2\2\u0200\u01f7\3\2\2\2\u0200\u01fa\3\2\2\2\u0200\u01fd\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0206\79\2\2\u0206\u0207\b\22\1\2\u0207"+
		"#\3\2\2\2\u0208\u0209\7c\2\2\u0209\u020a\b\23\1\2\u020a\u020b\5,\27\2"+
		"\u020b\u0210\b\23\1\2\u020c\u020d\5\62\32\2\u020d\u020e\b\23\1\2\u020e"+
		"\u0211\3\2\2\2\u020f\u0211\7<\2\2\u0210\u020c\3\2\2\2\u0210\u020f\3\2"+
		"\2\2\u0211%\3\2\2\2\u0212\u0218\b\24\1\2\u0213\u0214\5<\37\2\u0214\u0215"+
		"\b\24\1\2\u0215\u0217\3\2\2\2\u0216\u0213\3\2\2\2\u0217\u021a\3\2\2\2"+
		"\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021b\u021c\5$\23\2\u021c\'\3\2\2\2\u021d\u0223\b\25\1\2\u021e"+
		"\u021f\5<\37\2\u021f\u0220\b\25\1\2\u0220\u0222\3\2\2\2\u0221\u021e\3"+
		"\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0228\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7+\2\2\u0227\u0229\b\25"+
		"\1\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\7.\2\2\u022b\u022c\5$\23\2\u022c)\3\2\2\2\u022d\u0233\b\26\1\2"+
		"\u022e\u022f\5<\37\2\u022f\u0230\b\26\1\2\u0230\u0232\3\2\2\2\u0231\u022e"+
		"\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0238\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\7+\2\2\u0237\u0239\b\26"+
		"\1\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\5> \2\u023b\u023c\b\26\1\2\u023c\u023d\5$\23\2\u023d+\3\2\2\2\u023e"+
		"\u023f\b\27\1\2\u023f\u0243\7\66\2\2\u0240\u0241\5.\30\2\u0241\u0242\b"+
		"\27\1\2\u0242\u0244\3\2\2\2\u0243\u0240\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\7\67\2\2\u0246-\3\2\2\2\u0247\u0248\b\30\1"+
		"\2\u0248\u0249\5\60\31\2\u0249\u0250\b\30\1\2\u024a\u024b\7=\2\2\u024b"+
		"\u024c\5\60\31\2\u024c\u024d\b\30\1\2\u024d\u024f\3\2\2\2\u024e\u024a"+
		"\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"/\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\5> \2\u0254\u0255\7c\2\2\u0255"+
		"\u0256\b\31\1\2\u0256\61\3\2\2\2\u0257\u0258\b\32\1\2\u0258\u0259\78\2"+
		"\2\u0259\u0268\b\32\1\2\u025a\u0260\b\32\1\2\u025b\u025c\5<\37\2\u025c"+
		"\u025d\b\32\1\2\u025d\u025f\3\2\2\2\u025e\u025b\3\2\2\2\u025f\u0262\3"+
		"\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0263\u0264\5\64\33\2\u0264\u0265\b\32\1\2\u0265\u0267"+
		"\3\2\2\2\u0266\u025a\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\79"+
		"\2\2\u026c\u026d\b\32\1\2\u026d\63\3\2\2\2\u026e\u026f\5:\36\2\u026f\u0270"+
		"\b\33\1\2\u0270\u0271\7<\2\2\u0271\u02c1\3\2\2\2\u0272\u0273\5\26\f\2"+
		"\u0273\u0274\b\33\1\2\u0274\u0275\7<\2\2\u0275\u02c1\3\2\2\2\u0276\u0277"+
		"\5\62\32\2\u0277\u0278\b\33\1\2\u0278\u02c1\3\2\2\2\u0279\u027a\7\33\2"+
		"\2\u027a\u027b\b\33\1\2\u027b\u027c\7\66\2\2\u027c\u027d\5D#\2\u027d\u027e"+
		"\7\67\2\2\u027e\u027f\5\64\33\2\u027f\u0284\b\33\1\2\u0280\u0281\7\30"+
		"\2\2\u0281\u0282\5\64\33\2\u0282\u0283\b\33\1\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0280\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u02c1\3\2\2\2\u0286\u0287\7%"+
		"\2\2\u0287\u0288\b\33\1\2\u0288\u0289\7\66\2\2\u0289\u028a\5D#\2\u028a"+
		"\u028b\7\67\2\2\u028b\u028c\5\64\33\2\u028c\u028d\b\33\1\2\u028d\u02c1"+
		"\3\2\2\2\u028e\u028f\7\31\2\2\u028f\u0290\b\33\1\2\u0290\u0294\7\66\2"+
		"\2\u0291\u0292\5\66\34\2\u0292\u0293\b\33\1\2\u0293\u0295\3\2\2\2\u0294"+
		"\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029a\7<"+
		"\2\2\u0297\u0298\5D#\2\u0298\u0299\b\33\1\2\u0299\u029b\3\2\2\2\u029a"+
		"\u0297\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a0\7<"+
		"\2\2\u029d\u029e\5X-\2\u029e\u029f\b\33\1\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u029d\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\67"+
		"\2\2\u02a3\u02a4\5\64\33\2\u02a4\u02a5\b\33\1\2\u02a5\u02c1\3\2\2\2\u02a6"+
		"\u02a7\7$\2\2\u02a7\u02a8\7\66\2\2\u02a8\u02a9\5D#\2\u02a9\u02aa\7\67"+
		"\2\2\u02aa\u02ab\78\2\2\u02ab\u02ac\58\35\2\u02ac\u02ad\79\2\2\u02ad\u02ae"+
		"\b\33\1\2\u02ae\u02c1\3\2\2\2\u02af\u02b0\7#\2\2\u02b0\u02b4\b\33\1\2"+
		"\u02b1\u02b2\5D#\2\u02b2\u02b3\b\33\1\2\u02b3\u02b5\3\2\2\2\u02b4\u02b1"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\7<\2\2\u02b7"+
		"\u02c1\b\33\1\2\u02b8\u02b9\7\23\2\2\u02b9\u02ba\7<\2\2\u02ba\u02c1\b"+
		"\33\1\2\u02bb\u02bc\7\26\2\2\u02bc\u02bd\7<\2\2\u02bd\u02c1\b\33\1\2\u02be"+
		"\u02bf\7<\2\2\u02bf\u02c1\b\33\1\2\u02c0\u026e\3\2\2\2\u02c0\u0272\3\2"+
		"\2\2\u02c0\u0276\3\2\2\2\u02c0\u0279\3\2\2\2\u02c0\u0286\3\2\2\2\u02c0"+
		"\u028e\3\2\2\2\u02c0\u02a6\3\2\2\2\u02c0\u02af\3\2\2\2\u02c0\u02b8\3\2"+
		"\2\2\u02c0\u02bb\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\65\3\2\2\2\u02c2\u02c3"+
		"\5\26\f\2\u02c3\u02c4\b\34\1\2\u02c4\u02c9\3\2\2\2\u02c5\u02c6\5X-\2\u02c6"+
		"\u02c7\b\34\1\2\u02c7\u02c9\3\2\2\2\u02c8\u02c2\3\2\2\2\u02c8\u02c5\3"+
		"\2\2\2\u02c9\67\3\2\2\2\u02ca\u02e8\b\35\1\2\u02cb\u02d1\b\35\1\2\u02cc"+
		"\u02cd\5<\37\2\u02cd\u02ce\b\35\1\2\u02ce\u02d0\3\2\2\2\u02cf\u02cc\3"+
		"\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d4\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d5\7\24\2\2\u02d5\u02d6\5"+
		"D#\2\u02d6\u02d7\7C\2\2\u02d7\u02e5\b\35\1\2\u02d8\u02d9\5<\37\2\u02d9"+
		"\u02da\b\35\1\2\u02da\u02dc\3\2\2\2\u02db\u02d8\3\2\2\2\u02dc\u02df\3"+
		"\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02e0\u02e1\5\64\33\2\u02e1\u02e2\b\35\1\2\u02e2\u02e4"+
		"\3\2\2\2\u02e3\u02dd\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02cb\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ff\3\2\2\2\u02ec\u02ed\7\27\2\2\u02ed\u02ee\7C\2\2\u02ee\u02fc\b\35"+
		"\1\2\u02ef\u02f0\5<\37\2\u02f0\u02f1\b\35\1\2\u02f1\u02f3\3\2\2\2\u02f2"+
		"\u02ef\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2"+
		"\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f8\5\64\33\2\u02f8"+
		"\u02f9\b\35\1\2\u02f9\u02fb\3\2\2\2\u02fa\u02f4\3\2\2\2\u02fb\u02fe\3"+
		"\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02ff\u02ec\3\2\2\2\u02ff\u0300\3\2\2\2\u03009\3\2\2\2"+
		"\u0301\u0302\5D#\2\u0302\u0303\b\36\1\2\u0303;\3\2\2\2\u0304\u0305\b\37"+
		"\1\2\u0305\u0306\7[\2\2\u0306\u0307\7c\2\2\u0307\u030f\b\37\1\2\u0308"+
		"\u030c\7\66\2\2\u0309\u030a\5D#\2\u030a\u030b\b\37\1\2\u030b\u030d\3\2"+
		"\2\2\u030c\u0309\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0310\7\67\2\2\u030f\u0308\3\2\2\2\u030f\u0310\3\2\2\2\u0310=\3\2\2\2"+
		"\u0311\u0312\7c\2\2\u0312\u0316\b \1\2\u0313\u0314\5@!\2\u0314\u0315\b"+
		" \1\2\u0315\u0317\3\2\2\2\u0316\u0313\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u031b\3\2\2\2\u0318\u0319\5B\"\2\u0319\u031a\b \1\2\u031a\u031c\3\2\2"+
		"\2\u031b\u0318\3\2\2\2\u031b\u031c\3\2\2\2\u031c?\3\2\2\2\u031d\u031e"+
		"\7^\2\2\u031e\u031f\b!\1\2\u031f\u0320\5> \2\u0320\u0327\b!\1\2\u0321"+
		"\u0322\7=\2\2\u0322\u0323\5> \2\u0323\u0324\b!\1\2\u0324\u0326\3\2\2\2"+
		"\u0325\u0321\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328"+
		"\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b\7]\2\2\u032b"+
		"A\3\2\2\2\u032c\u0331\b\"\1\2\u032d\u032e\7:\2\2\u032e\u032f\7\13\2\2"+
		"\u032f\u0330\7;\2\2\u0330\u0332\b\"\1\2\u0331\u032d\3\2\2\2\u0332\u0333"+
		"\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334C\3\2\2\2\u0335"+
		"\u0336\b#\1\2\u0336\u0337\5T+\2\u0337\u0338\b#\1\2\u0338\u033d\3\2\2\2"+
		"\u0339\u033a\5R*\2\u033a\u033b\b#\1\2\u033b\u033d\3\2\2\2\u033c\u0335"+
		"\3\2\2\2\u033c\u0339\3\2\2\2\u033d\u0383\3\2\2\2\u033e\u033f\f\17\2\2"+
		"\u033f\u0340\5H%\2\u0340\u0341\5D#\20\u0341\u0342\b#\1\2\u0342\u0382\3"+
		"\2\2\2\u0343\u0344\f\16\2\2\u0344\u0345\5J&\2\u0345\u0346\5D#\17\u0346"+
		"\u0347\b#\1\2\u0347\u0382\3\2\2\2\u0348\u0349\f\r\2\2\u0349\u034a\5N("+
		"\2\u034a\u034b\5D#\16\u034b\u034c\b#\1\2\u034c\u0382\3\2\2\2\u034d\u034e"+
		"\f\f\2\2\u034e\u034f\5L\'\2\u034f\u0350\5D#\r\u0350\u0351\b#\1\2\u0351"+
		"\u0382\3\2\2\2\u0352\u0353\f\n\2\2\u0353\u0354\5P)\2\u0354\u0355\5D#\13"+
		"\u0355\u0356\b#\1\2\u0356\u0382\3\2\2\2\u0357\u0358\f\t\2\2\u0358\u0359"+
		"\7N\2\2\u0359\u035a\5D#\n\u035a\u035b\b#\1\2\u035b\u0382\3\2\2\2\u035c"+
		"\u035d\f\b\2\2\u035d\u035e\7P\2\2\u035e\u035f\5D#\t\u035f\u0360\b#\1\2"+
		"\u0360\u0382\3\2\2\2\u0361\u0362\f\7\2\2\u0362\u0363\7O\2\2\u0363\u0364"+
		"\5D#\b\u0364\u0365\b#\1\2\u0365\u0382\3\2\2\2\u0366\u0367\f\6\2\2\u0367"+
		"\u0368\7E\2\2\u0368\u0369\5D#\7\u0369\u036a\b#\1\2\u036a\u0382\3\2\2\2"+
		"\u036b\u036c\f\5\2\2\u036c\u036d\7F\2\2\u036d\u036e\5D#\6\u036e\u036f"+
		"\b#\1\2\u036f\u0382\3\2\2\2\u0370\u0371\f\4\2\2\u0371\u0372\7B\2\2\u0372"+
		"\u0373\5D#\2\u0373\u0374\7C\2\2\u0374\u0375\5D#\5\u0375\u0376\b#\1\2\u0376"+
		"\u0382\3\2\2\2\u0377\u0378\f\3\2\2\u0378\u0379\5F$\2\u0379\u037a\5D#\4"+
		"\u037a\u037b\b#\1\2\u037b\u0382\3\2\2\2\u037c\u037d\f\13\2\2\u037d\u037e"+
		"\7(\2\2\u037e\u037f\5> \2\u037f\u0380\b#\1\2\u0380\u0382\3\2\2\2\u0381"+
		"\u033e\3\2\2\2\u0381\u0343\3\2\2\2\u0381\u0348\3\2\2\2\u0381\u034d\3\2"+
		"\2\2\u0381\u0352\3\2\2\2\u0381\u0357\3\2\2\2\u0381\u035c\3\2\2\2\u0381"+
		"\u0361\3\2\2\2\u0381\u0366\3\2\2\2\u0381\u036b\3\2\2\2\u0381\u0370\3\2"+
		"\2\2\u0381\u0377\3\2\2\2\u0381\u037c\3\2\2\2\u0382\u0385\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384E\3\2\2\2\u0385\u0383\3\2\2\2"+
		"\u0386\u0387\7?\2\2\u0387\u039f\b$\1\2\u0388\u0389\7R\2\2\u0389\u039f"+
		"\b$\1\2\u038a\u038b\7S\2\2\u038b\u039f\b$\1\2\u038c\u038d\7T\2\2\u038d"+
		"\u039f\b$\1\2\u038e\u038f\7U\2\2\u038f\u039f\b$\1\2\u0390\u0391\7V\2\2"+
		"\u0391\u039f\b$\1\2\u0392\u0393\7W\2\2\u0393\u039f\b$\1\2\u0394\u0395"+
		"\7X\2\2\u0395\u039f\b$\1\2\u0396\u0397\7Y\2\2\u0397\u039f\b$\1\2\u0398"+
		"\u0399\7Z\2\2\u0399\u039f\b$\1\2\u039a\u039b\7`\2\2\u039b\u039f\b$\1\2"+
		"\u039c\u039d\7b\2\2\u039d\u039f\b$\1\2\u039e\u0386\3\2\2\2\u039e\u0388"+
		"\3\2\2\2\u039e\u038a\3\2\2\2\u039e\u038c\3\2\2\2\u039e\u038e\3\2\2\2\u039e"+
		"\u0390\3\2\2\2\u039e\u0392\3\2\2\2\u039e\u0394\3\2\2\2\u039e\u0396\3\2"+
		"\2\2\u039e\u0398\3\2\2\2\u039e\u039a\3\2\2\2\u039e\u039c\3\2\2\2\u039f"+
		"G\3\2\2\2\u03a0\u03a1\7L\2\2\u03a1\u03a7\b%\1\2\u03a2\u03a3\7M\2\2\u03a3"+
		"\u03a7\b%\1\2\u03a4\u03a5\7Q\2\2\u03a5\u03a7\b%\1\2\u03a6\u03a0\3\2\2"+
		"\2\u03a6\u03a2\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7I\3\2\2\2\u03a8\u03a9"+
		"\7J\2\2\u03a9\u03ad\b&\1\2\u03aa\u03ab\7K\2\2\u03ab\u03ad\b&\1\2\u03ac"+
		"\u03a8\3\2\2\2\u03ac\u03aa\3\2\2\2\u03adK\3\2\2\2\u03ae\u03af\7^\2\2\u03af"+
		"\u03b0\7?\2\2\u03b0\u03b9\b\'\1\2\u03b1\u03b2\7]\2\2\u03b2\u03b3\7?\2"+
		"\2\u03b3\u03b9\b\'\1\2\u03b4\u03b5\7^\2\2\u03b5\u03b9\b\'\1\2\u03b6\u03b7"+
		"\7]\2\2\u03b7\u03b9\b\'\1\2\u03b8\u03ae\3\2\2\2\u03b8\u03b1\3\2\2\2\u03b8"+
		"\u03b4\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9M\3\2\2\2\u03ba\u03bb\7^\2\2\u03bb"+
		"\u03bc\7^\2\2\u03bc\u03c1\b(\1\2\u03bd\u03be\7]\2\2\u03be\u03bf\7]\2\2"+
		"\u03bf\u03c1\b(\1\2\u03c0\u03ba\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c1O\3\2"+
		"\2\2\u03c2\u03c3\7D\2\2\u03c3\u03c7\b)\1\2\u03c4\u03c5\7\\\2\2\u03c5\u03c7"+
		"\b)\1\2\u03c6\u03c2\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7Q\3\2\2\2\u03c8\u03c9"+
		"\7J\2\2\u03c9\u03ca\5R*\2\u03ca\u03cb\b*\1\2\u03cb\u03e4\3\2\2\2\u03cc"+
		"\u03cd\7K\2\2\u03cd\u03ce\5R*\2\u03ce\u03cf\b*\1\2\u03cf\u03e4\3\2\2\2"+
		"\u03d0\u03d1\7G\2\2\u03d1\u03d2\5R*\2\u03d2\u03d3\b*\1\2\u03d3\u03e4\3"+
		"\2\2\2\u03d4\u03d5\7H\2\2\u03d5\u03d6\5R*\2\u03d6\u03d7\b*\1\2\u03d7\u03e4"+
		"\3\2\2\2\u03d8\u03d9\7A\2\2\u03d9\u03da\5R*\2\u03da\u03db\b*\1\2\u03db"+
		"\u03e4\3\2\2\2\u03dc\u03dd\7@\2\2\u03dd\u03de\5R*\2\u03de\u03df\b*\1\2"+
		"\u03df\u03e4\3\2\2\2\u03e0\u03e1\5T+\2\u03e1\u03e2\b*\1\2\u03e2\u03e4"+
		"\3\2\2\2\u03e3\u03c8\3\2\2\2\u03e3\u03cc\3\2\2\2\u03e3\u03d0\3\2\2\2\u03e3"+
		"\u03d4\3\2\2\2\u03e3\u03d8\3\2\2\2\u03e3\u03dc\3\2\2\2\u03e3\u03e0\3\2"+
		"\2\2\u03e4S\3\2\2\2\u03e5\u03e6\5V,\2\u03e6\u03e7\b+\1\2\u03e7\u040d\3"+
		"\2\2\2\u03e8\u03e9\7\66\2\2\u03e9\u03ea\5D#\2\u03ea\u03eb\b+\1\2\u03eb"+
		"\u03ec\7\67\2\2\u03ec\u040d\3\2\2\2\u03ed\u03ee\5\b\5\2\u03ee\u03ef\b"+
		"+\1\2\u03ef\u040d\3\2\2\2\u03f0\u03f1\5Z.\2\u03f1\u03f2\b+\1\2\u03f2\u040d"+
		"\3\2\2\2\u03f3\u03f4\7B\2\2\u03f4\u03f5\7\66\2\2\u03f5\u03f6\5X-\2\u03f6"+
		"\u03f7\7\67\2\2\u03f7\u03f8\b+\1\2\u03f8\u040d\3\2\2\2\u03f9\u03fa\7\35"+
		"\2\2\u03fa\u03fb\5> \2\u03fb\u03fc\b+\1\2\u03fc\u0400\7\66\2\2\u03fd\u03fe"+
		"\5X-\2\u03fe\u03ff\b+\1\2\u03ff\u0401\3\2\2\2\u0400\u03fd\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\7\67\2\2\u0403\u0404\7"+
		"C\2\2\u0404\u0408\7\66\2\2\u0405\u0406\5X-\2\u0406\u0407\b+\1\2\u0407"+
		"\u0409\3\2\2\2\u0408\u0405\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a\u040b\7\67\2\2\u040b\u040d\3\2\2\2\u040c\u03e5\3\2\2\2\u040c"+
		"\u03e8\3\2\2\2\u040c\u03ed\3\2\2\2\u040c\u03f0\3\2\2\2\u040c\u03f3\3\2"+
		"\2\2\u040c\u03f9\3\2\2\2\u040d\u0414\3\2\2\2\u040e\u040f\7>\2\2\u040f"+
		"\u0410\5\b\5\2\u0410\u0411\b+\1\2\u0411\u0413\3\2\2\2\u0412\u040e\3\2"+
		"\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u041b\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418\7G\2\2\u0418\u041c\b+\1"+
		"\2\u0419\u041a\7H\2\2\u041a\u041c\b+\1\2\u041b\u0417\3\2\2\2\u041b\u0419"+
		"\3\2\2\2\u041b\u041c\3\2\2\2\u041cU\3\2\2\2\u041d\u041e\7\66\2\2\u041e"+
		"\u041f\5> \2\u041f\u0420\7\67\2\2\u0420\u0421\5D#\2\u0421\u0422\b,\1\2"+
		"\u0422W\3\2\2\2\u0423\u0429\b-\1\2\u0424\u0425\5<\37\2\u0425\u0426\b-"+
		"\1\2\u0426\u0428\3\2\2\2\u0427\u0424\3\2\2\2\u0428\u042b\3\2\2\2\u0429"+
		"\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c\3\2\2\2\u042b\u0429\3\2"+
		"\2\2\u042c\u042d\5D#\2\u042d\u043c\b-\1\2\u042e\u0434\7=\2\2\u042f\u0430"+
		"\5<\37\2\u0430\u0431\b-\1\2\u0431\u0433\3\2\2\2\u0432\u042f\3\2\2\2\u0433"+
		"\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2"+
		"\2\2\u0436\u0434\3\2\2\2\u0437\u0438\5D#\2\u0438\u0439\b-\1\2\u0439\u043b"+
		"\3\2\2\2\u043a\u042e\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043dY\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0440\7\13\2\2"+
		"\u0440\u0450\b.\1\2\u0441\u0442\7\f\2\2\u0442\u0450\b.\1\2\u0443\u0444"+
		"\7\r\2\2\u0444\u0450\b.\1\2\u0445\u0446\7\16\2\2\u0446\u0450\b.\1\2\u0447"+
		"\u0448\7\17\2\2\u0448\u0450\b.\1\2\u0449\u044a\7\63\2\2\u044a\u0450\b"+
		".\1\2\u044b\u044c\7\64\2\2\u044c\u0450\b.\1\2\u044d\u044e\7\65\2\2\u044e"+
		"\u0450\b.\1\2\u044f\u043f\3\2\2\2\u044f\u0441\3\2\2\2\u044f\u0443\3\2"+
		"\2\2\u044f\u0445\3\2\2\2\u044f\u0447\3\2\2\2\u044f\u0449\3\2\2\2\u044f"+
		"\u044b\3\2\2\2\u044f\u044d\3\2\2\2\u0450[\3\2\2\2_bnp|~\u0089\u009c\u00a0"+
		"\u00aa\u00ae\u00bc\u00be\u00e2\u00eb\u00f3\u00f5\u00fe\u0105\u010c\u0113"+
		"\u0128\u0134\u013e\u0146\u0151\u0161\u016b\u0173\u017f\u0182\u018c\u019a"+
		"\u019d\u01a6\u01b2\u01be\u01c3\u01cb\u01d5\u01d8\u01e7\u01f3\u0200\u0202"+
		"\u0210\u0218\u0223\u0228\u0233\u0238\u0243\u0250\u0260\u0268\u0284\u0294"+
		"\u029a\u02a0\u02b4\u02c0\u02c8\u02d1\u02dd\u02e5\u02ea\u02f4\u02fc\u02ff"+
		"\u030c\u030f\u0316\u031b\u0327\u0333\u033c\u0381\u0383\u039e\u03a6\u03ac"+
		"\u03b8\u03c0\u03c6\u03e3\u0400\u0408\u040c\u0414\u041b\u0429\u0434\u043c"+
		"\u044f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}