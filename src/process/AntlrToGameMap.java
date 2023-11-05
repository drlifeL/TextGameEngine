package process;

import antlr.gamemap.GameMapBaseVisitor;
import antlr.gamemap.GameMapParser;
import entity.convert.GameMap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TODO
 * @since 2023/10/21
 */
public class AntlrToGameMap extends GameMapBaseVisitor<GameMap> {

    private final List<String> semanticErrors;

    public AntlrToGameMap() {
        this.semanticErrors = new ArrayList<>();
    }

    public boolean hasSemanticErrors() {
        return semanticErrors.size() > 0;
    }

    public void showSemanticErrors() {
        for (String semanticError : semanticErrors) {
            System.err.println(semanticError);
        }
    }

    @Override
    public GameMap visitGameMap(GameMapParser.GameMapContext ctx) {
        GameMap result = new GameMap();

        AntlrToItem itemVisitor = new AntlrToItem(semanticErrors);

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1) {
                // Do not visit Last Child 'EOF'
            } else {
                result.addEntity(itemVisitor.visit(ctx.getChild(i)));
            }
        }

        return result;
    }
}
