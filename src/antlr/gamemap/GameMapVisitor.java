// Generated from TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.12.0
package antlr.gamemap;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameMapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameMapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameMapParser#gameMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameMap(GameMapParser.GameMapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roomDeclaration}
	 * labeled alternative in {@link GameMapParser#rd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomDeclaration(GameMapParser.RoomDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomName(GameMapParser.RoomNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomLink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomLink(GameMapParser.RoomLinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomItem(GameMapParser.RoomItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomExit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomExit(GameMapParser.RoomExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomEnter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomEnter(GameMapParser.RoomEnterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(GameMapParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code axe}
	 * labeled alternative in {@link GameMapParser#wieldable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxe(GameMapParser.AxeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sword}
	 * labeled alternative in {@link GameMapParser#wieldable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSword(GameMapParser.SwordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mead}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMead(GameMapParser.MeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bread}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBread(GameMapParser.BreadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roastboar}
	 * labeled alternative in {@link GameMapParser#food}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoastboar(GameMapParser.RoastboarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chalice}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChalice(GameMapParser.ChaliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mobile}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMobile(GameMapParser.MobileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coin}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoin(GameMapParser.CoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goldBars}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoldBars(GameMapParser.GoldBarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ring}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing(GameMapParser.RingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moneyBag}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoneyBag(GameMapParser.MoneyBagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jewel}
	 * labeled alternative in {@link GameMapParser#valuable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJewel(GameMapParser.JewelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lockPick}
	 * labeled alternative in {@link GameMapParser#opener}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockPick(GameMapParser.LockPickContext ctx);
	/**
	 * Visit a parse tree produced by the {@code key}
	 * labeled alternative in {@link GameMapParser#opener}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(GameMapParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code treasireChest}
	 * labeled alternative in {@link GameMapParser#openable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreasireChest(GameMapParser.TreasireChestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code warChest}
	 * labeled alternative in {@link GameMapParser#openable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWarChest(GameMapParser.WarChestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ogre}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgre(GameMapParser.OgreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zombie}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZombie(GameMapParser.ZombieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dragon}
	 * labeled alternative in {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDragon(GameMapParser.DragonContext ctx);
}