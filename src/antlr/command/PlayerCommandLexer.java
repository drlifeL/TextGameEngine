// Generated from TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.12.0
package antlr.command;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, N=12, NAME=13, NEWLINE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "N", "NAME", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'door'", "'pickup'", "'exit'", "'describe'", "'admire'", "'eat'", 
			"'attack'", "'status'", "'wield'", "'open'", "'help'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"N", "NAME", "NEWLINE", "WS"
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


	public PlayerCommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

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
		"\u0004\u0000\u000fu\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0004\u000bd\b\u000b\u000b\u000b\f\u000b"+
		"e\u0001\f\u0004\fi\b\f\u000b\f\f\fj\u0001\r\u0003\rn\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u0001\u0000\u0003\u0001\u000009\u0002\u0000AZaz\u0002\u0000\t\t"+
		"  w\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003"+
		"$\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u00070\u0001"+
		"\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000"+
		"\u0000\rD\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011"+
		"R\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015]\u0001"+
		"\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000"+
		"\u0000\u001bm\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000\u001f"+
		" \u0005d\u0000\u0000 !\u0005o\u0000\u0000!\"\u0005o\u0000\u0000\"#\u0005"+
		"r\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005p\u0000\u0000%&\u0005"+
		"i\u0000\u0000&\'\u0005c\u0000\u0000\'(\u0005k\u0000\u0000()\u0005u\u0000"+
		"\u0000)*\u0005p\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005e\u0000"+
		"\u0000,-\u0005x\u0000\u0000-.\u0005i\u0000\u0000./\u0005t\u0000\u0000"+
		"/\u0006\u0001\u0000\u0000\u000001\u0005d\u0000\u000012\u0005e\u0000\u0000"+
		"23\u0005s\u0000\u000034\u0005c\u0000\u000045\u0005r\u0000\u000056\u0005"+
		"i\u0000\u000067\u0005b\u0000\u000078\u0005e\u0000\u00008\b\u0001\u0000"+
		"\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000\u0000;<\u0005m\u0000"+
		"\u0000<=\u0005i\u0000\u0000=>\u0005r\u0000\u0000>?\u0005e\u0000\u0000"+
		"?\n\u0001\u0000\u0000\u0000@A\u0005e\u0000\u0000AB\u0005a\u0000\u0000"+
		"BC\u0005t\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005a\u0000\u0000"+
		"EF\u0005t\u0000\u0000FG\u0005t\u0000\u0000GH\u0005a\u0000\u0000HI\u0005"+
		"c\u0000\u0000IJ\u0005k\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005"+
		"s\u0000\u0000LM\u0005t\u0000\u0000MN\u0005a\u0000\u0000NO\u0005t\u0000"+
		"\u0000OP\u0005u\u0000\u0000PQ\u0005s\u0000\u0000Q\u0010\u0001\u0000\u0000"+
		"\u0000RS\u0005w\u0000\u0000ST\u0005i\u0000\u0000TU\u0005e\u0000\u0000"+
		"UV\u0005l\u0000\u0000VW\u0005d\u0000\u0000W\u0012\u0001\u0000\u0000\u0000"+
		"XY\u0005o\u0000\u0000YZ\u0005p\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005"+
		"n\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000]^\u0005h\u0000\u0000^_\u0005"+
		"e\u0000\u0000_`\u0005l\u0000\u0000`a\u0005p\u0000\u0000a\u0016\u0001\u0000"+
		"\u0000\u0000bd\u0007\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"f\u0018\u0001\u0000\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000k\u001a\u0001\u0000\u0000\u0000ln\u0005\r\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0005\n\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0007\u0002"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006\u000e\u0000\u0000t\u001e"+
		"\u0001\u0000\u0000\u0000\u0004\u0000ejm\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}