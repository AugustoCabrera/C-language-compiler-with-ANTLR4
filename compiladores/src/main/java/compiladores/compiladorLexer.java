// Generated from c:\tpFinalCompiladores\proyecto_final_compiladores_Definitivo\compiladores\src\main\java\compiladores\compilador.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, PA=17, 
		PC=18, LLA=19, LLC=20, PYC=21, SUMA=22, MULT=23, DIVI=24, RESTA=25, MAIN=26, 
		IF=27, INT=28, STRING=29, BOOLEAN=30, CHAR=31, FLOAT=32, DOUBLE=33, FALSE=34, 
		TRUE=35, ID=36, NUMERO=37, TEXTO=38, CARACTER=39, WS=40, OTRO=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LETRA", 
			"DIGITO", "PA", "PC", "LLA", "LLC", "PYC", "SUMA", "MULT", "DIVI", "RESTA", 
			"MAIN", "IF", "INT", "STRING", "BOOLEAN", "CHAR", "FLOAT", "DOUBLE", 
			"FALSE", "TRUE", "ID", "NUMERO", "TEXTO", "CARACTER", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'+='", "'++'", "'--'", 
			"'-='", "'='", "','", "'else'", "'while'", "'for'", "'return'", "'('", 
			"')'", "'{'", "'}'", "';'", "'+'", "'*'", "'/'", "'-'", "'main'", "'if'", 
			"'int'", "'string'", "'bool'", "'char'", "'float'", "'double'", "'false'", 
			"'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "PA", "PC", "LLA", "LLC", "PYC", "SUMA", 
			"MULT", "DIVI", "RESTA", "MAIN", "IF", "INT", "STRING", "BOOLEAN", "CHAR", 
			"FLOAT", "DOUBLE", "FALSE", "TRUE", "ID", "NUMERO", "TEXTO", "CARACTER", 
			"WS", "OTRO"
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


	public compiladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compilador.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\5\'\u00dd"+
		"\n\'\3\'\3\'\3\'\7\'\u00e2\n\'\f\'\16\'\u00e5\13\'\3(\6(\u00e8\n(\r(\16"+
		"(\u00e9\3)\3)\3)\5)\u00ef\n)\3)\3)\3)\7)\u00f4\n)\f)\16)\u00f7\13)\3)"+
		"\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\23)\24+\25-\26"+
		"/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W"+
		"+\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u010a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+"+
		"\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2"+
		"\2\7]\3\2\2\2\t`\3\2\2\2\13c\3\2\2\2\rf\3\2\2\2\17i\3\2\2\2\21l\3\2\2"+
		"\2\23o\3\2\2\2\25r\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33y\3\2\2\2\35~\3\2"+
		"\2\2\37\u0084\3\2\2\2!\u0088\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093"+
		"\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61"+
		"\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5"+
		"\3\2\2\2;\u00aa\3\2\2\2=\u00ad\3\2\2\2?\u00b1\3\2\2\2A\u00b8\3\2\2\2C"+
		"\u00bd\3\2\2\2E\u00c2\3\2\2\2G\u00c8\3\2\2\2I\u00cf\3\2\2\2K\u00d5\3\2"+
		"\2\2M\u00dc\3\2\2\2O\u00e7\3\2\2\2Q\u00eb\3\2\2\2S\u00fa\3\2\2\2U\u00fe"+
		"\3\2\2\2W\u0102\3\2\2\2YZ\7>\2\2Z\4\3\2\2\2[\\\7@\2\2\\\6\3\2\2\2]^\7"+
		">\2\2^_\7?\2\2_\b\3\2\2\2`a\7@\2\2ab\7?\2\2b\n\3\2\2\2cd\7#\2\2de\7?\2"+
		"\2e\f\3\2\2\2fg\7?\2\2gh\7?\2\2h\16\3\2\2\2ij\7-\2\2jk\7?\2\2k\20\3\2"+
		"\2\2lm\7-\2\2mn\7-\2\2n\22\3\2\2\2op\7/\2\2pq\7/\2\2q\24\3\2\2\2rs\7/"+
		"\2\2st\7?\2\2t\26\3\2\2\2uv\7?\2\2v\30\3\2\2\2wx\7.\2\2x\32\3\2\2\2yz"+
		"\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\34\3\2\2\2~\177\7y\2\2\177\u0080\7"+
		"j\2\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\36"+
		"\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087"+
		" \3\2\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7t\2\2\u008d\u008e\7p\2\2\u008e\"\3\2\2\2\u008f"+
		"\u0090\t\2\2\2\u0090$\3\2\2\2\u0091\u0092\t\3\2\2\u0092&\3\2\2\2\u0093"+
		"\u0094\7*\2\2\u0094(\3\2\2\2\u0095\u0096\7+\2\2\u0096*\3\2\2\2\u0097\u0098"+
		"\7}\2\2\u0098,\3\2\2\2\u0099\u009a\7\177\2\2\u009a.\3\2\2\2\u009b\u009c"+
		"\7=\2\2\u009c\60\3\2\2\2\u009d\u009e\7-\2\2\u009e\62\3\2\2\2\u009f\u00a0"+
		"\7,\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\66\3\2\2\2\u00a3\u00a4"+
		"\7/\2\2\u00a48\3\2\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7p\2\2\u00a9:\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7h\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0>\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7i\2\2\u00b7"+
		"@\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7n\2\2\u00bcB\3\2\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7j\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7t\2\2\u00c1D\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7v\2\2"+
		"\u00c7F\3\2\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7w\2"+
		"\2\u00cb\u00cc\7d\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ceH\3\2"+
		"\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\u00d4\7g\2\2\u00d4J\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7"+
		"\7t\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7g\2\2\u00d9L\3\2\2\2\u00da\u00dd"+
		"\5#\22\2\u00db\u00dd\7a\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e3\3\2\2\2\u00de\u00e2\5#\22\2\u00df\u00e2\5%\23\2\u00e0\u00e2\7a"+
		"\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4N\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00e8\5%\23\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00eaP\3\2\2\2\u00eb"+
		"\u00ee\7$\2\2\u00ec\u00ef\5#\22\2\u00ed\u00ef\7a\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ee\u00ed\3\2\2\2\u00ef\u00f5\3\2\2\2\u00f0\u00f4\5#\22\2\u00f1\u00f4"+
		"\5%\23\2\u00f2\u00f4\7a\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9"+
		"R\3\2\2\2\u00fa\u00fb\7)\2\2\u00fb\u00fc\5#\22\2\u00fc\u00fd\7)\2\2\u00fd"+
		"T\3\2\2\2\u00fe\u00ff\t\4\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b+\2\2\u0101"+
		"V\3\2\2\2\u0102\u0103\13\2\2\2\u0103X\3\2\2\2\n\2\u00dc\u00e1\u00e3\u00e9"+
		"\u00ee\u00f3\u00f5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}