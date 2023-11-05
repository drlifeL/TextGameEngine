// Generated from TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.12.0
package antlr.command;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayerCommandParser}.
 */
public interface PlayerCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PlayerCommandParser.CommandContext ctx);
}