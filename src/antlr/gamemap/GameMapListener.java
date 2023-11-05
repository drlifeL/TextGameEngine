// Generated from TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.12.0
package antlr.gamemap;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameMapParser}.
 */
public interface GameMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameMapParser#gameMap}.
	 * @param ctx the parse tree
	 */
	void enterGameMap(GameMapParser.GameMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#gameMap}.
	 * @param ctx the parse tree
	 */
	void exitGameMap(GameMapParser.GameMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roomDeclaration}
	 * labeled alternative in {@link GameMapParser#rd}.
	 * @param ctx the parse tree
	 */
	void enterRoomDeclaration(GameMapParser.RoomDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roomDeclaration}
	 * labeled alternative in {@link GameMapParser#rd}.
	 * @param ctx the parse tree
	 */
	void exitRoomDeclaration(GameMapParser.RoomDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#roomName}.
	 * @param ctx the parse tree
	 */
	void enterRoomName(GameMapParser.RoomNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#roomName}.
	 * @param ctx the parse tree
	 */
	void exitRoomName(GameMapParser.RoomNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#roomLink}.
	 * @param ctx the parse tree
	 */
	void enterRoomLink(GameMapParser.RoomLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#roomLink}.
	 * @param ctx the parse tree
	 */
	void exitRoomLink(GameMapParser.RoomLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#roomItem}.
	 * @param ctx the parse tree
	 */
	void enterRoomItem(GameMapParser.RoomItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#roomItem}.
	 * @param ctx the parse tree
	 */
	void exitRoomItem(GameMapParser.RoomItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#roomExit}.
	 * @param ctx the parse tree
	 */
	void enterRoomExit(GameMapParser.RoomExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#roomExit}.
	 * @param ctx the parse tree
	 */
	void exitRoomExit(GameMapParser.RoomExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#roomEnter}.
	 * @param ctx the parse tree
	 */
	void enterRoomEnter(GameMapParser.RoomEnterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#roomEnter}.
	 * @param ctx the parse tree
	 */
	void exitRoomEnter(GameMapParser.RoomEnterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(GameMapParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(GameMapParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code axe}
	 * labeled alternative in {@link GameMapParser#wieldable}.
	 * @param ctx the parse tree
	 */
	void enterAxe(GameMapParser.AxeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code axe}
	 * labeled alternative in {@link GameMapParser#wieldable}.
	 * @param ctx the parse tree
	 */
	void exitAxe(GameMapParser.AxeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sword}
	 * labeled alternative in {@link GameMapParser#wieldable}.
	 * @param ctx the parse tree
	 */
	void enterSword(GameMapParser.SwordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sword}
	 * labeled alternative in {@link GameMapParser#wieldable}.
	 * @param ctx the parse tree
	 */
	void exitSword(GameMapParser.SwordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mead}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 */
	void enterMead(GameMapParser.MeadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mead}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 */
	void exitMead(GameMapParser.MeadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bread}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 */
	void enterBread(GameMapParser.BreadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bread}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 */
	void exitBread(GameMapParser.BreadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roastboar}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 */
	void enterRoastboar(GameMapParser.RoastboarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roastboar}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 */
	void exitRoastboar(GameMapParser.RoastboarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chalice}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void enterChalice(GameMapParser.ChaliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chalice}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void exitChalice(GameMapParser.ChaliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mobile}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void enterMobile(GameMapParser.MobileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mobile}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void exitMobile(GameMapParser.MobileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coin}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void enterCoin(GameMapParser.CoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coin}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void exitCoin(GameMapParser.CoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goldBars}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void enterGoldBars(GameMapParser.GoldBarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goldBars}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void exitGoldBars(GameMapParser.GoldBarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ring}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void enterRing(GameMapParser.RingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ring}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void exitRing(GameMapParser.RingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moneyBag}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void enterMoneyBag(GameMapParser.MoneyBagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moneyBag}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void exitMoneyBag(GameMapParser.MoneyBagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jewel}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void enterJewel(GameMapParser.JewelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jewel}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 */
	void exitJewel(GameMapParser.JewelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lockPick}
	 * labeled alternative in {@link GameMapParser#opener}.
	 * @param ctx the parse tree
	 */
	void enterLockPick(GameMapParser.LockPickContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lockPick}
	 * labeled alternative in {@link GameMapParser#opener}.
	 * @param ctx the parse tree
	 */
	void exitLockPick(GameMapParser.LockPickContext ctx);
	/**
	 * Enter a parse tree produced by the {@code key}
	 * labeled alternative in {@link GameMapParser#opener}.
	 * @param ctx the parse tree
	 */
	void enterKey(GameMapParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code key}
	 * labeled alternative in {@link GameMapParser#opener}.
	 * @param ctx the parse tree
	 */
	void exitKey(GameMapParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code treasireChest}
	 * labeled alternative in {@link GameMapParser#openable}.
	 * @param ctx the parse tree
	 */
	void enterTreasireChest(GameMapParser.TreasireChestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code treasireChest}
	 * labeled alternative in {@link GameMapParser#openable}.
	 * @param ctx the parse tree
	 */
	void exitTreasireChest(GameMapParser.TreasireChestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code warChest}
	 * labeled alternative in {@link GameMapParser#openable}.
	 * @param ctx the parse tree
	 */
	void enterWarChest(GameMapParser.WarChestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code warChest}
	 * labeled alternative in {@link GameMapParser#openable}.
	 * @param ctx the parse tree
	 */
	void exitWarChest(GameMapParser.WarChestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ogre}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void enterOgre(GameMapParser.OgreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ogre}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void exitOgre(GameMapParser.OgreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zombie}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void enterZombie(GameMapParser.ZombieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zombie}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void exitZombie(GameMapParser.ZombieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dragon}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void enterDragon(GameMapParser.DragonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dragon}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void exitDragon(GameMapParser.DragonContext ctx);
}