// Generated from /Users/jordan/Desktop/512/project-part2/src/main/java/Rdd.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RddLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WHITESPACE=4, SC=5, VAL=6, IF=7, ELSE=8, ASSIGN=9, 
		DOT=10, LB=11, RB=12, LP=13, RP=14, COMMA=15, SEMICOLON=16, ARROW=17, 
		OP=18, COMP=19, ID=20, NUMBER=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "DIGIT", "LETTER", "WHITESPACE", "SC", "VAL", 
		"IF", "ELSE", "ASSIGN", "DOT", "LB", "RB", "LP", "RP", "COMMA", "SEMICOLON", 
		"ARROW", "OP", "COMP", "ID", "NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'range'", "'collect'", "'map'", null, "'sc'", "'val'", "'if'", 
		"'else'", "'='", "'.'", "'{'", "'}'", "'('", "')'", "','", "';'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WHITESPACE", "SC", "VAL", "IF", "ELSE", "ASSIGN", 
		"DOT", "LB", "RB", "LP", "RP", "COMMA", "SEMICOLON", "ARROW", "OP", "COMP", 
		"ID", "NUMBER"
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


	public RddLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rdd.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\5\6G\n\6\3\7\6\7J\n\7\r\7\16\7K\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26}\n\26\3\27\3\27"+
		"\3\27\7\27\u0082\n\27\f\27\16\27\u0085\13\27\3\30\6\30\u0088\n\30\r\30"+
		"\16\30\u0089\2\2\31\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13"+
		"\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\3\2\6\5\2C\\a"+
		"ac|\5\2\13\f\16\17\"\"\5\2\'\',-//\4\2>>@@\2\u0090\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\67\3\2\2\2\7?\3\2\2\2\tC\3\2"+
		"\2\2\13F\3\2\2\2\rI\3\2\2\2\17O\3\2\2\2\21R\3\2\2\2\23V\3\2\2\2\25Y\3"+
		"\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!h\3"+
		"\2\2\2#j\3\2\2\2%l\3\2\2\2\'n\3\2\2\2)q\3\2\2\2+|\3\2\2\2-~\3\2\2\2/\u0087"+
		"\3\2\2\2\61\62\7t\2\2\62\63\7c\2\2\63\64\7p\2\2\64\65\7i\2\2\65\66\7g"+
		"\2\2\66\4\3\2\2\2\678\7e\2\289\7q\2\29:\7n\2\2:;\7n\2\2;<\7g\2\2<=\7e"+
		"\2\2=>\7v\2\2>\6\3\2\2\2?@\7o\2\2@A\7c\2\2AB\7r\2\2B\b\3\2\2\2CD\4\62"+
		";\2D\n\3\2\2\2EG\t\2\2\2FE\3\2\2\2G\f\3\2\2\2HJ\t\3\2\2IH\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\7\2\2N\16\3\2\2\2OP\7u\2\2PQ"+
		"\7e\2\2Q\20\3\2\2\2RS\7x\2\2ST\7c\2\2TU\7n\2\2U\22\3\2\2\2VW\7k\2\2WX"+
		"\7h\2\2X\24\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\26\3\2\2\2"+
		"^_\7?\2\2_\30\3\2\2\2`a\7\60\2\2a\32\3\2\2\2bc\7}\2\2c\34\3\2\2\2de\7"+
		"\177\2\2e\36\3\2\2\2fg\7*\2\2g \3\2\2\2hi\7+\2\2i\"\3\2\2\2jk\7.\2\2k"+
		"$\3\2\2\2lm\7=\2\2m&\3\2\2\2no\7?\2\2op\7@\2\2p(\3\2\2\2qr\t\4\2\2r*\3"+
		"\2\2\2st\7?\2\2t}\7?\2\2u}\t\5\2\2vw\7#\2\2w}\7?\2\2xy\7@\2\2y}\7?\2\2"+
		"z{\7>\2\2{}\7?\2\2|s\3\2\2\2|u\3\2\2\2|v\3\2\2\2|x\3\2\2\2|z\3\2\2\2}"+
		",\3\2\2\2~\u0083\5\13\6\2\177\u0082\5\13\6\2\u0080\u0082\5\t\5\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084.\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088"+
		"\5\t\5\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\60\3\2\2\2\t\2FK|\u0081\u0083\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}