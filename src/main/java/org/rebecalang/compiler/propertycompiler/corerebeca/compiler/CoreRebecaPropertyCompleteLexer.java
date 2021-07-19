// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.7.1

	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoreRebecaPropertyCompleteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LTL=1, DEFINE=2, THEN=3, PROPERTY=4, ASSERTION=5, INTLITERAL=6, FLOATLITERAL=7, 
		DOUBLELITERAL=8, CHARLITERAL=9, STRINGLITERAL=10, WS=11, COMMENT=12, LINE_COMMENT=13, 
		TRUE=14, FALSE=15, NULL=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, 
		LBRACKET=21, RBRACKET=22, SEMI=23, COMMA=24, DOT=25, EQ=26, BANG=27, TILDA=28, 
		QUES=29, COLON=30, EQEQ=31, AMPAMP=32, BARBAR=33, PLUSPLUS=34, SUBSUB=35, 
		PLUS=36, SUB=37, STAR=38, SLASH=39, AMP=40, BAR=41, CARET=42, PERCENT=43, 
		PLUSEQ=44, SUBEQ=45, STAREQ=46, SLASHEQ=47, AMPEQ=48, BAREQ=49, CARETEQ=50, 
		TILDAEQ=51, PERCENTEQ=52, MONKEYS_AT=53, BANGEQ=54, GT=55, LT=56, LTLT=57, 
		LTLTEQ=58, GTGT=59, GTGTEQ=60, IDENTIFIER=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LTL", "DEFINE", "THEN", "PROPERTY", "ASSERTION", "INTLITERAL", "IntegerNumber", 
		"HexPrefix", "HexDigit", "LongSuffix", "NonIntegerNumber", "Exponent", 
		"FloatSuffix", "DoubleSuffix", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", 
		"STRINGLITERAL", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "TRUE", 
		"FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"SEMI", "COMMA", "DOT", "EQ", "BANG", "TILDA", "QUES", "COLON", "EQEQ", 
		"AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "PLUS", "SUB", "STAR", "SLASH", 
		"AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", 
		"AMPEQ", "BAREQ", "CARETEQ", "TILDAEQ", "PERCENTEQ", "MONKEYS_AT", "BANGEQ", 
		"GT", "LT", "LTLT", "LTLTEQ", "GTGT", "GTGTEQ", "IDENTIFIER", "Letter", 
		"JavaIDDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'LTL'", "'define'", "'->'", "'property'", "'Assertion'", null, 
		null, null, null, null, null, null, null, "'true'", "'false'", "'null'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'~='", "'%='", "'@'", "'!='", "'>'", 
		"'<'", "'<<'", "'<<='", "'>>'", "'>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LTL", "DEFINE", "THEN", "PROPERTY", "ASSERTION", "INTLITERAL", 
		"FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "WS", 
		"COMMENT", "LINE_COMMENT", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "EQ", 
		"BANG", "TILDA", "QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", 
		"SUBSUB", "PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", 
		"PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "TILDAEQ", 
		"PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", "LT", "LTLT", "LTLTEQ", "GTGT", 
		"GTGTEQ", "IDENTIFIER"
	};
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


	public CoreRebecaPropertyCompleteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoreRebecaPropertyComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u01f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\7\b\u00ba\n\b\f\b\16\b\u00bd\13\b\3\b\3\b\6\b\u00c1\n"+
		"\b\r\b\16\b\u00c2\3\b\3\b\6\b\u00c7\n\b\r\b\16\b\u00c8\5\b\u00cb\n\b\3"+
		"\t\3\t\3\t\3\t\5\t\u00d1\n\t\3\n\3\n\3\13\3\13\3\f\6\f\u00d8\n\f\r\f\16"+
		"\f\u00d9\3\f\3\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\3\f\5\f\u00e4\n\f\3"+
		"\f\3\f\6\f\u00e8\n\f\r\f\16\f\u00e9\3\f\5\f\u00ed\n\f\3\f\6\f\u00f0\n"+
		"\f\r\f\16\f\u00f1\3\f\3\f\6\f\u00f6\n\f\r\f\16\f\u00f7\3\f\3\f\7\f\u00fc"+
		"\n\f\f\f\16\f\u00ff\13\f\3\f\3\f\3\f\7\f\u0104\n\f\f\f\16\f\u0107\13\f"+
		"\5\f\u0109\n\f\3\f\3\f\5\f\u010d\n\f\3\f\6\f\u0110\n\f\r\f\16\f\u0111"+
		"\5\f\u0114\n\f\3\r\3\r\5\r\u0118\n\r\3\r\6\r\u011b\n\r\r\r\16\r\u011c"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u0128\n\21\3\22\3\22"+
		"\3\22\5\22\u012d\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u0134\n\23\f\23\16"+
		"\23\u0137\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0143\n\24\3\25\6\25\u0146\n\25\r\25\16\25\u0147\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\7\26\u0150\n\26\f\26\16\26\u0153\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\7\27\u015e\n\27\f\27\16\27\u0161\13\27\3\27"+
		"\5\27\u0164\n\27\3\27\3\27\5\27\u0168\n\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3"+
		";\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"C\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\7G\u01ec\nG\fG\16G\u01ef\13"+
		"G\3H\3H\3I\3I\3\u0151\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2"+
		"\27\2\31\2\33\2\35\2\37\t!\n#\13%\f\'\2)\r+\16-\17/\20\61\21\63\22\65"+
		"\23\67\249\25;\26=\27?\30A\31C\32E\33G\34I\35K\36M\37O Q!S\"U#W$Y%[&]"+
		"\'_(a)c*e+g,i-k.m/o\60q\61s\62u\63w\64y\65{\66}\67\1778\u00819\u0083:"+
		"\u0085;\u0087<\u0089=\u008b>\u008d?\u008f\2\u0091\2\3\2\20\5\2\62;CHc"+
		"h\4\2NNnn\4\2RRrr\4\2--//\4\2GGgg\4\2HHhh\4\2FFff\6\2\f\f\17\17))^^\6"+
		"\2\f\f\17\17$$^^\t\2))^^ddhhppttvv\5\2\13\f\16\17\"\"\4\2\f\f\17\17\16"+
		"\2&&C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381"+
		"\u3402\u3d2f\u4e02\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb"+
		"\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1"+
		"\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b"+
		"\2\u020f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u0093\3\2\2\2\5\u0097\3\2\2\2\7\u009e"+
		"\3\2\2\2\t\u00a1\3\2\2\2\13\u00aa\3\2\2\2\r\u00b4\3\2\2\2\17\u00ca\3\2"+
		"\2\2\21\u00d0\3\2\2\2\23\u00d2\3\2\2\2\25\u00d4\3\2\2\2\27\u0113\3\2\2"+
		"\2\31\u0115\3\2\2\2\33\u011e\3\2\2\2\35\u0120\3\2\2\2\37\u0122\3\2\2\2"+
		"!\u0125\3\2\2\2#\u0129\3\2\2\2%\u0130\3\2\2\2\'\u013a\3\2\2\2)\u0145\3"+
		"\2\2\2+\u014b\3\2\2\2-\u0159\3\2\2\2/\u016b\3\2\2\2\61\u0170\3\2\2\2\63"+
		"\u0176\3\2\2\2\65\u017b\3\2\2\2\67\u017d\3\2\2\29\u017f\3\2\2\2;\u0181"+
		"\3\2\2\2=\u0183\3\2\2\2?\u0185\3\2\2\2A\u0187\3\2\2\2C\u0189\3\2\2\2E"+
		"\u018b\3\2\2\2G\u018d\3\2\2\2I\u018f\3\2\2\2K\u0191\3\2\2\2M\u0193\3\2"+
		"\2\2O\u0195\3\2\2\2Q\u0197\3\2\2\2S\u019a\3\2\2\2U\u019d\3\2\2\2W\u01a0"+
		"\3\2\2\2Y\u01a3\3\2\2\2[\u01a6\3\2\2\2]\u01a8\3\2\2\2_\u01aa\3\2\2\2a"+
		"\u01ac\3\2\2\2c\u01ae\3\2\2\2e\u01b0\3\2\2\2g\u01b2\3\2\2\2i\u01b4\3\2"+
		"\2\2k\u01b6\3\2\2\2m\u01b9\3\2\2\2o\u01bc\3\2\2\2q\u01bf\3\2\2\2s\u01c2"+
		"\3\2\2\2u\u01c5\3\2\2\2w\u01c8\3\2\2\2y\u01cb\3\2\2\2{\u01ce\3\2\2\2}"+
		"\u01d1\3\2\2\2\177\u01d3\3\2\2\2\u0081\u01d6\3\2\2\2\u0083\u01d8\3\2\2"+
		"\2\u0085\u01da\3\2\2\2\u0087\u01dd\3\2\2\2\u0089\u01e1\3\2\2\2\u008b\u01e4"+
		"\3\2\2\2\u008d\u01e8\3\2\2\2\u008f\u01f0\3\2\2\2\u0091\u01f2\3\2\2\2\u0093"+
		"\u0094\7N\2\2\u0094\u0095\7V\2\2\u0095\u0096\7N\2\2\u0096\4\3\2\2\2\u0097"+
		"\u0098\7f\2\2\u0098\u0099\7g\2\2\u0099\u009a\7h\2\2\u009a\u009b\7k\2\2"+
		"\u009b\u009c\7p\2\2\u009c\u009d\7g\2\2\u009d\6\3\2\2\2\u009e\u009f\7/"+
		"\2\2\u009f\u00a0\7@\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7{\2\2\u00a9\n\3\2\2\2\u00aa"+
		"\u00ab\7C\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7t\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2\u00b3\7p\2\2\u00b3\f\3\2\2\2\u00b4\u00b5\5\17\b\2\u00b5"+
		"\16\3\2\2\2\u00b6\u00cb\7\62\2\2\u00b7\u00bb\4\63;\2\u00b8\u00ba\4\62"+
		";\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00cb\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\7\62"+
		"\2\2\u00bf\u00c1\4\629\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00cb\3\2\2\2\u00c4\u00c6\5\21"+
		"\t\2\u00c5\u00c7\5\23\n\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00b6\3\2"+
		"\2\2\u00ca\u00b7\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb"+
		"\20\3\2\2\2\u00cc\u00cd\7\62\2\2\u00cd\u00d1\7z\2\2\u00ce\u00cf\7\62\2"+
		"\2\u00cf\u00d1\7Z\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\22"+
		"\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3\24\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5"+
		"\26\3\2\2\2\u00d6\u00d8\4\62;\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2"+
		"\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df"+
		"\5E#\2\u00dc\u00de\4\62;\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e4\5\31\r\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u0114\3\2\2\2\u00e5\u00e7\5E#\2\u00e6\u00e8\4\62;\2\u00e7\u00e6\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec"+
		"\3\2\2\2\u00eb\u00ed\5\31\r\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u0114\3\2\2\2\u00ee\u00f0\4\62;\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u0114\5\31\r\2\u00f4\u00f6\4\62;\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0114\3\2\2\2\u00f9"+
		"\u00fd\5\21\t\2\u00fa\u00fc\5\23\n\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0108\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0109\3\2\2\2\u0101\u0105\5E#\2\u0102\u0104\5\23"+
		"\n\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0100\3\2"+
		"\2\2\u0108\u0101\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\t\4\2\2\u010b"+
		"\u010d\t\5\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2"+
		"\2\2\u010e\u0110\4\62;\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u00d7\3\2"+
		"\2\2\u0113\u00e5\3\2\2\2\u0113\u00ef\3\2\2\2\u0113\u00f5\3\2\2\2\u0113"+
		"\u00f9\3\2\2\2\u0114\30\3\2\2\2\u0115\u0117\t\6\2\2\u0116\u0118\t\5\2"+
		"\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b"+
		"\4\62;\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\32\3\2\2\2\u011e\u011f\t\7\2\2\u011f\34\3\2\2\2\u0120"+
		"\u0121\t\b\2\2\u0121\36\3\2\2\2\u0122\u0123\5\27\f\2\u0123\u0124\5\33"+
		"\16\2\u0124 \3\2\2\2\u0125\u0127\5\27\f\2\u0126\u0128\5\35\17\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\"\3\2\2\2\u0129\u012c\7)\2\2"+
		"\u012a\u012d\5\'\24\2\u012b\u012d\n\t\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7)\2\2\u012f$\3\2\2\2\u0130\u0135"+
		"\7$\2\2\u0131\u0134\5\'\24\2\u0132\u0134\n\n\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7$\2\2\u0139"+
		"&\3\2\2\2\u013a\u0142\7^\2\2\u013b\u0143\t\13\2\2\u013c\u013d\4\62\65"+
		"\2\u013d\u013e\4\629\2\u013e\u0143\4\629\2\u013f\u0140\4\629\2\u0140\u0143"+
		"\4\629\2\u0141\u0143\4\629\2\u0142\u013b\3\2\2\2\u0142\u013c\3\2\2\2\u0142"+
		"\u013f\3\2\2\2\u0142\u0141\3\2\2\2\u0143(\3\2\2\2\u0144\u0146\t\f\2\2"+
		"\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\25\2\2\u014a*\3\2\2\2\u014b"+
		"\u014c\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13"+
		"\2\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,"+
		"\2\2\u0155\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\26\2\2\u0158"+
		",\3\2\2\2\u0159\u015a\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2"+
		"\2\u015c\u015e\n\r\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0167\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0164\7\17\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3"+
		"\2\2\2\u0165\u0168\7\f\2\2\u0166\u0168\7\2\2\3\u0167\u0163\3\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b\27\2\2\u016a.\3\2\2\2"+
		"\u016b\u016c\7v\2\2\u016c\u016d\7t\2\2\u016d\u016e\7w\2\2\u016e\u016f"+
		"\7g\2\2\u016f\60\3\2\2\2\u0170\u0171\7h\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7n\2\2\u0173\u0174\7u\2\2\u0174\u0175\7g\2\2\u0175\62\3\2\2\2\u0176\u0177"+
		"\7p\2\2\u0177\u0178\7w\2\2\u0178\u0179\7n\2\2\u0179\u017a\7n\2\2\u017a"+
		"\64\3\2\2\2\u017b\u017c\7*\2\2\u017c\66\3\2\2\2\u017d\u017e\7+\2\2\u017e"+
		"8\3\2\2\2\u017f\u0180\7}\2\2\u0180:\3\2\2\2\u0181\u0182\7\177\2\2\u0182"+
		"<\3\2\2\2\u0183\u0184\7]\2\2\u0184>\3\2\2\2\u0185\u0186\7_\2\2\u0186@"+
		"\3\2\2\2\u0187\u0188\7=\2\2\u0188B\3\2\2\2\u0189\u018a\7.\2\2\u018aD\3"+
		"\2\2\2\u018b\u018c\7\60\2\2\u018cF\3\2\2\2\u018d\u018e\7?\2\2\u018eH\3"+
		"\2\2\2\u018f\u0190\7#\2\2\u0190J\3\2\2\2\u0191\u0192\7\u0080\2\2\u0192"+
		"L\3\2\2\2\u0193\u0194\7A\2\2\u0194N\3\2\2\2\u0195\u0196\7<\2\2\u0196P"+
		"\3\2\2\2\u0197\u0198\7?\2\2\u0198\u0199\7?\2\2\u0199R\3\2\2\2\u019a\u019b"+
		"\7(\2\2\u019b\u019c\7(\2\2\u019cT\3\2\2\2\u019d\u019e\7~\2\2\u019e\u019f"+
		"\7~\2\2\u019fV\3\2\2\2\u01a0\u01a1\7-\2\2\u01a1\u01a2\7-\2\2\u01a2X\3"+
		"\2\2\2\u01a3\u01a4\7/\2\2\u01a4\u01a5\7/\2\2\u01a5Z\3\2\2\2\u01a6\u01a7"+
		"\7-\2\2\u01a7\\\3\2\2\2\u01a8\u01a9\7/\2\2\u01a9^\3\2\2\2\u01aa\u01ab"+
		"\7,\2\2\u01ab`\3\2\2\2\u01ac\u01ad\7\61\2\2\u01adb\3\2\2\2\u01ae\u01af"+
		"\7(\2\2\u01afd\3\2\2\2\u01b0\u01b1\7~\2\2\u01b1f\3\2\2\2\u01b2\u01b3\7"+
		"`\2\2\u01b3h\3\2\2\2\u01b4\u01b5\7\'\2\2\u01b5j\3\2\2\2\u01b6\u01b7\7"+
		"-\2\2\u01b7\u01b8\7?\2\2\u01b8l\3\2\2\2\u01b9\u01ba\7/\2\2\u01ba\u01bb"+
		"\7?\2\2\u01bbn\3\2\2\2\u01bc\u01bd\7,\2\2\u01bd\u01be\7?\2\2\u01bep\3"+
		"\2\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c1\7?\2\2\u01c1r\3\2\2\2\u01c2\u01c3"+
		"\7(\2\2\u01c3\u01c4\7?\2\2\u01c4t\3\2\2\2\u01c5\u01c6\7~\2\2\u01c6\u01c7"+
		"\7?\2\2\u01c7v\3\2\2\2\u01c8\u01c9\7`\2\2\u01c9\u01ca\7?\2\2\u01cax\3"+
		"\2\2\2\u01cb\u01cc\7\u0080\2\2\u01cc\u01cd\7?\2\2\u01cdz\3\2\2\2\u01ce"+
		"\u01cf\7\'\2\2\u01cf\u01d0\7?\2\2\u01d0|\3\2\2\2\u01d1\u01d2\7B\2\2\u01d2"+
		"~\3\2\2\2\u01d3\u01d4\7#\2\2\u01d4\u01d5\7?\2\2\u01d5\u0080\3\2\2\2\u01d6"+
		"\u01d7\7@\2\2\u01d7\u0082\3\2\2\2\u01d8\u01d9\7>\2\2\u01d9\u0084\3\2\2"+
		"\2\u01da\u01db\7>\2\2\u01db\u01dc\7>\2\2\u01dc\u0086\3\2\2\2\u01dd\u01de"+
		"\7>\2\2\u01de\u01df\7>\2\2\u01df\u01e0\7?\2\2\u01e0\u0088\3\2\2\2\u01e1"+
		"\u01e2\7@\2\2\u01e2\u01e3\7@\2\2\u01e3\u008a\3\2\2\2\u01e4\u01e5\7@\2"+
		"\2\u01e5\u01e6\7@\2\2\u01e6\u01e7\7?\2\2\u01e7\u008c\3\2\2\2\u01e8\u01ed"+
		"\5\u008fH\2\u01e9\u01ec\5\u008fH\2\u01ea\u01ec\5\u0091I\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u008e\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\t\16"+
		"\2\2\u01f1\u0090\3\2\2\2\u01f2\u01f3\t\17\2\2\u01f3\u0092\3\2\2\2#\2\u00bb"+
		"\u00c2\u00c8\u00ca\u00d0\u00d9\u00df\u00e3\u00e9\u00ec\u00f1\u00f7\u00fd"+
		"\u0105\u0108\u010c\u0111\u0113\u0117\u011c\u0127\u012c\u0133\u0135\u0142"+
		"\u0147\u0151\u015f\u0163\u0167\u01eb\u01ed\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}