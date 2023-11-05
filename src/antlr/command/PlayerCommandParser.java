// Generated from TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.12.0
package antlr.command;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, N=12, NAME=13, NEWLINE=14, WS=15;
	public static final int
		RULE_command = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"command"
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

	@Override
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayerCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public List<TerminalNode> N() { return getTokens(PlayerCommandParser.N); }
		public TerminalNode N(int i) {
			return getToken(PlayerCommandParser.N, i);
		}
		public List<TerminalNode> NAME() { return getTokens(PlayerCommandParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PlayerCommandParser.NAME, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(19);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(2);
					match(T__0);
					setState(3);
					match(N);
					}
					break;
				case T__1:
					{
					setState(4);
					match(T__1);
					setState(5);
					match(NAME);
					}
					break;
				case T__2:
					{
					setState(6);
					match(T__2);
					}
					break;
				case T__3:
					{
					setState(7);
					match(T__3);
					}
					break;
				case T__4:
					{
					setState(8);
					match(T__4);
					setState(9);
					match(NAME);
					}
					break;
				case T__5:
					{
					setState(10);
					match(T__5);
					setState(11);
					match(NAME);
					}
					break;
				case T__6:
					{
					setState(12);
					match(T__6);
					}
					break;
				case T__7:
					{
					setState(13);
					match(T__7);
					}
					break;
				case T__8:
					{
					setState(14);
					match(T__8);
					setState(15);
					match(NAME);
					}
					break;
				case T__9:
					{
					setState(16);
					match(T__9);
					setState(17);
					match(NAME);
					}
					break;
				case T__10:
					{
					setState(18);
					match(T__10);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4094L) != 0) );
			setState(23);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u000f\u001a\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000"+
		"\f\u0000\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0000#\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0003\u0005\u0001"+
		"\u0000\u0000\u0003\u0014\u0005\f\u0000\u0000\u0004\u0005\u0005\u0002\u0000"+
		"\u0000\u0005\u0014\u0005\r\u0000\u0000\u0006\u0014\u0005\u0003\u0000\u0000"+
		"\u0007\u0014\u0005\u0004\u0000\u0000\b\t\u0005\u0005\u0000\u0000\t\u0014"+
		"\u0005\r\u0000\u0000\n\u000b\u0005\u0006\u0000\u0000\u000b\u0014\u0005"+
		"\r\u0000\u0000\f\u0014\u0005\u0007\u0000\u0000\r\u0014\u0005\b\u0000\u0000"+
		"\u000e\u000f\u0005\t\u0000\u0000\u000f\u0014\u0005\r\u0000\u0000\u0010"+
		"\u0011\u0005\n\u0000\u0000\u0011\u0014\u0005\r\u0000\u0000\u0012\u0014"+
		"\u0005\u000b\u0000\u0000\u0013\u0002\u0001\u0000\u0000\u0000\u0013\u0004"+
		"\u0001\u0000\u0000\u0000\u0013\u0006\u0001\u0000\u0000\u0000\u0013\u0007"+
		"\u0001\u0000\u0000\u0000\u0013\b\u0001\u0000\u0000\u0000\u0013\n\u0001"+
		"\u0000\u0000\u0000\u0013\f\u0001\u0000\u0000\u0000\u0013\r\u0001\u0000"+
		"\u0000\u0000\u0013\u000e\u0001\u0000\u0000\u0000\u0013\u0010\u0001\u0000"+
		"\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000"+
		"\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u000e"+
		"\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0002\u0013\u0015";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}