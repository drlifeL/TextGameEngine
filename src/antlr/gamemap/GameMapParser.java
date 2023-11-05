// Generated from TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.12.0
package antlr.gamemap;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ID=27, NAME=28, COMMENT=29, WS=30;
	public static final int
		RULE_gameMap = 0, RULE_rd = 1, RULE_roomName = 2, RULE_roomLink = 3, RULE_roomItem = 4, 
		RULE_roomExit = 5, RULE_roomEnter = 6, RULE_item = 7, RULE_wieldable = 8, 
		RULE_food = 9, RULE_valuable = 10, RULE_opener = 11, RULE_openable = 12, 
		RULE_monster = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"gameMap", "rd", "roomName", "roomLink", "roomItem", "roomExit", "roomEnter", 
			"item", "wieldable", "food", "valuable", "opener", "openable", "monster"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'['", "','", "']'", "'exit'", "'enter'", "'axe'", "':'", 
			"'sword'", "'mead'", "'bread'", "'roastboar'", "'chalice'", "'mobile'", 
			"'coin'", "'goldBars'", "'ring'", "'moneyBag'", "'jewel'", "'lockPick'", 
			"'key'", "'treasireChest'", "'warChest'", "'ogre'", "'Zombie'", "'Dragon'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NAME", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GameMapContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GameMapParser.EOF, 0); }
		public List<RdContext> rd() {
			return getRuleContexts(RdContext.class);
		}
		public RdContext rd(int i) {
			return getRuleContext(RdContext.class,i);
		}
		public List<RoomLinkContext> roomLink() {
			return getRuleContexts(RoomLinkContext.class);
		}
		public RoomLinkContext roomLink(int i) {
			return getRuleContext(RoomLinkContext.class,i);
		}
		public List<RoomItemContext> roomItem() {
			return getRuleContexts(RoomItemContext.class);
		}
		public RoomItemContext roomItem(int i) {
			return getRuleContext(RoomItemContext.class,i);
		}
		public List<RoomExitContext> roomExit() {
			return getRuleContexts(RoomExitContext.class);
		}
		public RoomExitContext roomExit(int i) {
			return getRuleContext(RoomExitContext.class,i);
		}
		public List<RoomEnterContext> roomEnter() {
			return getRuleContexts(RoomEnterContext.class);
		}
		public RoomEnterContext roomEnter(int i) {
			return getRuleContext(RoomEnterContext.class,i);
		}
		public GameMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGameMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGameMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGameMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameMapContext gameMap() throws RecognitionException {
		GameMapContext _localctx = new GameMapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gameMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28);
					rd();
					}
					break;
				case 2:
					{
					setState(29);
					roomLink();
					}
					break;
				case 3:
					{
					setState(30);
					roomItem();
					}
					break;
				case 4:
					{
					setState(31);
					roomExit();
					}
					break;
				case 5:
					{
					setState(32);
					roomEnter();
					}
					break;
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(37);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RdContext extends ParserRuleContext {
		public RdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rd; }
	 
		public RdContext() { }
		public void copyFrom(RdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoomDeclarationContext extends RdContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public RoomDeclarationContext(RdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdContext rd() throws RecognitionException {
		RdContext _localctx = new RdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rd);
		try {
			_localctx = new RoomDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoomNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public RoomNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomNameContext roomName() throws RecognitionException {
		RoomNameContext _localctx = new RoomNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_roomName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoomLinkContext extends ParserRuleContext {
		public List<RoomNameContext> roomName() {
			return getRuleContexts(RoomNameContext.class);
		}
		public RoomNameContext roomName(int i) {
			return getRuleContext(RoomNameContext.class,i);
		}
		public RoomLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomLinkContext roomLink() throws RecognitionException {
		RoomLinkContext _localctx = new RoomLinkContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_roomLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			roomName();
			setState(44);
			match(T__0);
			setState(45);
			roomName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoomItemContext extends ParserRuleContext {
		public RoomNameContext roomName() {
			return getRuleContext(RoomNameContext.class,0);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public RoomItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomItemContext roomItem() throws RecognitionException {
		RoomItemContext _localctx = new RoomItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_roomItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			roomName();
			setState(48);
			match(T__1);
			setState(49);
			item();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(50);
				match(T__2);
				setState(51);
				item();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoomExitContext extends ParserRuleContext {
		public RoomNameContext roomName() {
			return getRuleContext(RoomNameContext.class,0);
		}
		public RoomExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomExit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomExit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomExitContext roomExit() throws RecognitionException {
		RoomExitContext _localctx = new RoomExitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_roomExit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			roomName();
			setState(60);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoomEnterContext extends ParserRuleContext {
		public RoomNameContext roomName() {
			return getRuleContext(RoomNameContext.class,0);
		}
		public RoomEnterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomEnter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomEnter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomEnter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomEnter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomEnterContext roomEnter() throws RecognitionException {
		RoomEnterContext _localctx = new RoomEnterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_roomEnter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			roomName();
			setState(63);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public WieldableContext wieldable() {
			return getRuleContext(WieldableContext.class,0);
		}
		public FoodContext food() {
			return getRuleContext(FoodContext.class,0);
		}
		public ValuableContext valuable() {
			return getRuleContext(ValuableContext.class,0);
		}
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public OpenableContext openable() {
			return getRuleContext(OpenableContext.class,0);
		}
		public MonsterContext monster() {
			return getRuleContext(MonsterContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
				{
				setState(65);
				wieldable();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
				{
				setState(66);
				food();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				setState(67);
				valuable();
				}
				break;
			case T__19:
			case T__20:
				{
				setState(68);
				opener();
				}
				break;
			case T__21:
			case T__22:
				{
				setState(69);
				openable();
				}
				break;
			case T__23:
			case T__24:
			case T__25:
				{
				setState(70);
				monster();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WieldableContext extends ParserRuleContext {
		public WieldableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wieldable; }
	 
		public WieldableContext() { }
		public void copyFrom(WieldableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwordContext extends WieldableContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public SwordContext(WieldableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterSword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitSword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitSword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AxeContext extends WieldableContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public AxeContext(WieldableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterAxe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitAxe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitAxe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WieldableContext wieldable() throws RecognitionException {
		WieldableContext _localctx = new WieldableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_wieldable);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new AxeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__6);
				setState(74);
				match(T__7);
				setState(75);
				match(ID);
				setState(76);
				match(T__7);
				setState(77);
				match(ID);
				}
				break;
			case T__8:
				_localctx = new SwordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__8);
				setState(79);
				match(T__7);
				setState(80);
				match(ID);
				setState(81);
				match(T__7);
				setState(82);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FoodContext extends ParserRuleContext {
		public FoodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_food; }
	 
		public FoodContext() { }
		public void copyFrom(FoodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreadContext extends FoodContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public BreadContext(FoodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterBread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitBread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitBread(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoastboarContext extends FoodContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public RoastboarContext(FoodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoastboar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoastboar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoastboar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MeadContext extends FoodContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public MeadContext(FoodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterMead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitMead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitMead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoodContext food() throws RecognitionException {
		FoodContext _localctx = new FoodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_food);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new MeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__9);
				setState(86);
				match(T__7);
				setState(87);
				match(ID);
				}
				break;
			case T__10:
				_localctx = new BreadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__10);
				setState(89);
				match(T__7);
				setState(90);
				match(ID);
				}
				break;
			case T__11:
				_localctx = new RoastboarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__11);
				setState(92);
				match(T__7);
				setState(93);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValuableContext extends ParserRuleContext {
		public ValuableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuable; }
	 
		public ValuableContext() { }
		public void copyFrom(ValuableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChaliceContext extends ValuableContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public ChaliceContext(ValuableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterChalice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitChalice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitChalice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RingContext extends ValuableContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public RingContext(ValuableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JewelContext extends ValuableContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public JewelContext(ValuableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterJewel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitJewel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitJewel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MobileContext extends ValuableContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public MobileContext(ValuableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterMobile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitMobile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitMobile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoldBarsContext extends ValuableContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public GoldBarsContext(ValuableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGoldBars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGoldBars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGoldBars(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoneyBagContext extends ValuableContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public MoneyBagContext(ValuableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterMoneyBag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitMoneyBag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitMoneyBag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CoinContext extends ValuableContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public CoinContext(ValuableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterCoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitCoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitCoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuableContext valuable() throws RecognitionException {
		ValuableContext _localctx = new ValuableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valuable);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new ChaliceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__12);
				setState(97);
				match(T__7);
				setState(98);
				match(ID);
				}
				break;
			case T__13:
				_localctx = new MobileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__13);
				setState(100);
				match(T__7);
				setState(101);
				match(ID);
				}
				break;
			case T__14:
				_localctx = new CoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(T__14);
				setState(103);
				match(T__7);
				setState(104);
				match(ID);
				}
				break;
			case T__15:
				_localctx = new GoldBarsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(T__15);
				setState(106);
				match(T__7);
				setState(107);
				match(ID);
				}
				break;
			case T__16:
				_localctx = new RingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(T__16);
				setState(109);
				match(T__7);
				setState(110);
				match(ID);
				}
				break;
			case T__17:
				_localctx = new MoneyBagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(T__17);
				setState(112);
				match(T__7);
				setState(113);
				match(ID);
				}
				break;
			case T__18:
				_localctx = new JewelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				match(T__18);
				setState(115);
				match(T__7);
				setState(116);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenerContext extends ParserRuleContext {
		public OpenerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opener; }
	 
		public OpenerContext() { }
		public void copyFrom(OpenerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LockPickContext extends OpenerContext {
		public LockPickContext(OpenerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterLockPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitLockPick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitLockPick(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends OpenerContext {
		public KeyContext(OpenerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenerContext opener() throws RecognitionException {
		OpenerContext _localctx = new OpenerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opener);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new LockPickContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new KeyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenableContext extends ParserRuleContext {
		public OpenableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openable; }
	 
		public OpenableContext() { }
		public void copyFrom(OpenableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WarChestContext extends OpenableContext {
		public WieldableContext wieldable() {
			return getRuleContext(WieldableContext.class,0);
		}
		public WarChestContext(OpenableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterWarChest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitWarChest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitWarChest(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TreasireChestContext extends OpenableContext {
		public ValuableContext valuable() {
			return getRuleContext(ValuableContext.class,0);
		}
		public TreasireChestContext(OpenableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterTreasireChest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitTreasireChest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitTreasireChest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenableContext openable() throws RecognitionException {
		OpenableContext _localctx = new OpenableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_openable);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new TreasireChestContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__21);
				setState(124);
				match(T__7);
				setState(125);
				valuable();
				}
				break;
			case T__22:
				_localctx = new WarChestContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__22);
				setState(127);
				match(T__7);
				setState(128);
				wieldable();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MonsterContext extends ParserRuleContext {
		public MonsterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monster; }
	 
		public MonsterContext() { }
		public void copyFrom(MonsterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ZombieContext extends MonsterContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public ZombieContext(MonsterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterZombie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitZombie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitZombie(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DragonContext extends MonsterContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public DragonContext(MonsterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterDragon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitDragon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitDragon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OgreContext extends MonsterContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public OgreContext(MonsterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterOgre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitOgre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitOgre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonsterContext monster() throws RecognitionException {
		MonsterContext _localctx = new MonsterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_monster);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new OgreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__23);
				setState(132);
				match(T__7);
				setState(133);
				match(ID);
				setState(134);
				match(T__7);
				setState(135);
				match(ID);
				setState(136);
				match(T__7);
				setState(137);
				match(ID);
				}
				break;
			case T__24:
				_localctx = new ZombieContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__24);
				setState(139);
				match(T__7);
				setState(140);
				match(ID);
				setState(141);
				match(T__7);
				setState(142);
				match(ID);
				setState(143);
				match(T__7);
				setState(144);
				match(ID);
				}
				break;
			case T__25:
				_localctx = new DragonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(T__25);
				setState(146);
				match(T__7);
				setState(147);
				match(ID);
				setState(148);
				match(T__7);
				setState(149);
				match(ID);
				setState(150);
				match(T__7);
				setState(151);
				match(ID);
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
		"\u0004\u0001\u001e\u009b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u00045\b\u0004\n\u0004\f\u00048\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007H\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bT\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t_\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nv\b\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000bz\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0082\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0099\b\r\u0001\r\u0000"+
		"\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0000\u00a4\u0000!\u0001\u0000\u0000\u0000\u0002\'"+
		"\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006+\u0001\u0000"+
		"\u0000\u0000\b/\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f>"+
		"\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010S\u0001\u0000"+
		"\u0000\u0000\u0012^\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000"+
		"\u0016y\u0001\u0000\u0000\u0000\u0018\u0081\u0001\u0000\u0000\u0000\u001a"+
		"\u0098\u0001\u0000\u0000\u0000\u001c\"\u0003\u0002\u0001\u0000\u001d\""+
		"\u0003\u0006\u0003\u0000\u001e\"\u0003\b\u0004\u0000\u001f\"\u0003\n\u0005"+
		"\u0000 \"\u0003\f\u0006\u0000!\u001c\u0001\u0000\u0000\u0000!\u001d\u0001"+
		"\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005"+
		"\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\'(\u0005\u001b\u0000"+
		"\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005\u001b\u0000\u0000*\u0005"+
		"\u0001\u0000\u0000\u0000+,\u0003\u0004\u0002\u0000,-\u0005\u0001\u0000"+
		"\u0000-.\u0003\u0004\u0002\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0003"+
		"\u0004\u0002\u000001\u0005\u0002\u0000\u000016\u0003\u000e\u0007\u0000"+
		"23\u0005\u0003\u0000\u000035\u0003\u000e\u0007\u000042\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005"+
		"\u0004\u0000\u0000:\t\u0001\u0000\u0000\u0000;<\u0003\u0004\u0002\u0000"+
		"<=\u0005\u0005\u0000\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0003\u0004"+
		"\u0002\u0000?@\u0005\u0006\u0000\u0000@\r\u0001\u0000\u0000\u0000AH\u0003"+
		"\u0010\b\u0000BH\u0003\u0012\t\u0000CH\u0003\u0014\n\u0000DH\u0003\u0016"+
		"\u000b\u0000EH\u0003\u0018\f\u0000FH\u0003\u001a\r\u0000GA\u0001\u0000"+
		"\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GD\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"H\u000f\u0001\u0000\u0000\u0000IJ\u0005\u0007\u0000\u0000JK\u0005\b\u0000"+
		"\u0000KL\u0005\u001b\u0000\u0000LM\u0005\b\u0000\u0000MT\u0005\u001b\u0000"+
		"\u0000NO\u0005\t\u0000\u0000OP\u0005\b\u0000\u0000PQ\u0005\u001b\u0000"+
		"\u0000QR\u0005\b\u0000\u0000RT\u0005\u001b\u0000\u0000SI\u0001\u0000\u0000"+
		"\u0000SN\u0001\u0000\u0000\u0000T\u0011\u0001\u0000\u0000\u0000UV\u0005"+
		"\n\u0000\u0000VW\u0005\b\u0000\u0000W_\u0005\u001b\u0000\u0000XY\u0005"+
		"\u000b\u0000\u0000YZ\u0005\b\u0000\u0000Z_\u0005\u001b\u0000\u0000[\\"+
		"\u0005\f\u0000\u0000\\]\u0005\b\u0000\u0000]_\u0005\u001b\u0000\u0000"+
		"^U\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000"+
		"\u0000_\u0013\u0001\u0000\u0000\u0000`a\u0005\r\u0000\u0000ab\u0005\b"+
		"\u0000\u0000bv\u0005\u001b\u0000\u0000cd\u0005\u000e\u0000\u0000de\u0005"+
		"\b\u0000\u0000ev\u0005\u001b\u0000\u0000fg\u0005\u000f\u0000\u0000gh\u0005"+
		"\b\u0000\u0000hv\u0005\u001b\u0000\u0000ij\u0005\u0010\u0000\u0000jk\u0005"+
		"\b\u0000\u0000kv\u0005\u001b\u0000\u0000lm\u0005\u0011\u0000\u0000mn\u0005"+
		"\b\u0000\u0000nv\u0005\u001b\u0000\u0000op\u0005\u0012\u0000\u0000pq\u0005"+
		"\b\u0000\u0000qv\u0005\u001b\u0000\u0000rs\u0005\u0013\u0000\u0000st\u0005"+
		"\b\u0000\u0000tv\u0005\u001b\u0000\u0000u`\u0001\u0000\u0000\u0000uc\u0001"+
		"\u0000\u0000\u0000uf\u0001\u0000\u0000\u0000ui\u0001\u0000\u0000\u0000"+
		"ul\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000"+
		"\u0000v\u0015\u0001\u0000\u0000\u0000wz\u0005\u0014\u0000\u0000xz\u0005"+
		"\u0015\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z\u0017\u0001\u0000\u0000\u0000{|\u0005\u0016\u0000\u0000|}\u0005\b\u0000"+
		"\u0000}\u0082\u0003\u0014\n\u0000~\u007f\u0005\u0017\u0000\u0000\u007f"+
		"\u0080\u0005\b\u0000\u0000\u0080\u0082\u0003\u0010\b\u0000\u0081{\u0001"+
		"\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u0019\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\u0018\u0000\u0000\u0084\u0085\u0005\b\u0000"+
		"\u0000\u0085\u0086\u0005\u001b\u0000\u0000\u0086\u0087\u0005\b\u0000\u0000"+
		"\u0087\u0088\u0005\u001b\u0000\u0000\u0088\u0089\u0005\b\u0000\u0000\u0089"+
		"\u0099\u0005\u001b\u0000\u0000\u008a\u008b\u0005\u0019\u0000\u0000\u008b"+
		"\u008c\u0005\b\u0000\u0000\u008c\u008d\u0005\u001b\u0000\u0000\u008d\u008e"+
		"\u0005\b\u0000\u0000\u008e\u008f\u0005\u001b\u0000\u0000\u008f\u0090\u0005"+
		"\b\u0000\u0000\u0090\u0099\u0005\u001b\u0000\u0000\u0091\u0092\u0005\u001a"+
		"\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0094\u0005\u001b\u0000"+
		"\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096\u0005\u001b\u0000\u0000"+
		"\u0096\u0097\u0005\b\u0000\u0000\u0097\u0099\u0005\u001b\u0000\u0000\u0098"+
		"\u0083\u0001\u0000\u0000\u0000\u0098\u008a\u0001\u0000\u0000\u0000\u0098"+
		"\u0091\u0001\u0000\u0000\u0000\u0099\u001b\u0001\u0000\u0000\u0000\n!"+
		"#6GS^uy\u0081\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}