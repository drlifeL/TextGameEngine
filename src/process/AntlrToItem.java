package process;

import antlr.gamemap.GameMapBaseVisitor;
import antlr.gamemap.GameMapParser;
import entity.Entity;
import entity.Pickup;
import entity.character.Dragon;
import entity.character.Ogre;
import entity.character.Zombie;
import entity.consumable.food.Bread;
import entity.consumable.food.Mead;
import entity.consumable.food.RoastBoar;
import entity.consumable.valuable.Chalice;
import entity.consumable.valuable.Coin;
import entity.consumable.valuable.GoldBars;
import entity.consumable.valuable.Jewel;
import entity.consumable.valuable.Mobile;
import entity.consumable.valuable.MoneyBag;
import entity.consumable.valuable.Ring;
import entity.convert.RoomDeclaration;
import entity.convert.RoomEnter;
import entity.convert.RoomExit;
import entity.convert.RoomItem;
import entity.convert.RoomLink;
import entity.convert.RoomName;
import entity.open.Key;
import entity.open.LockPick;
import entity.open.TreasureChest;
import entity.open.WarChest;
import entity.weidables.Axe;
import entity.weidables.Sword;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author TODO
 * @since 2023/10/17
 */
public class AntlrToItem extends GameMapBaseVisitor<Entity> {

    private Set<String> declRooms;

    private Set<String> declRoomLinks;

    private List<String> semanticErrors;

    public AntlrToItem(List<String> semanticErrors) {
        this.declRooms = new HashSet<>();
        this.declRoomLinks = new HashSet<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Entity visitRoomDeclaration(GameMapParser.RoomDeclarationContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int lineNum = idToken.getLine();
        int columnNum = idToken.getCharPositionInLine() + 1;

        String roomName = ctx.ID().getText();

        if (declRooms.contains(roomName)) {
            this.semanticErrors.add("Error: RoomName " + roomName + " already declared (" + lineNum + " , " + columnNum + ")");
        }

        declRooms.add(roomName);

        return new RoomDeclaration(roomName);
    }

    @Override
    public Entity visitRoomLink(GameMapParser.RoomLinkContext ctx) {

        RoomName sourceRoomName = (RoomName) visit(ctx.getChild(0));
        RoomName targetRoomName = (RoomName) visit(ctx.getChild(2));

        String declLink = sourceRoomName.getDescription() + ctx.getChild(1).getText() + targetRoomName.getDescription();
        if (declRoomLinks.contains(declLink)) {
            int line = ctx.start.getLine();
            this.semanticErrors.add("Error: RoomLink " + declLink + " already declared ( LineNum: " + line + " )");
        }
        declRoomLinks.add(declLink);

        return new RoomLink(declLink, sourceRoomName, targetRoomName);
    }

    @Override
    public Entity visitRoomEnter(GameMapParser.RoomEnterContext ctx) {
        RoomName roomName = (RoomName) visit(ctx.getChild(0));
        String desc = ctx.getChild(1).getText();
        return new RoomEnter(desc, roomName);
    }


    @Override
    public Entity visitRoomExit(GameMapParser.RoomExitContext ctx) {
        RoomName roomName = (RoomName) visit(ctx.getChild(0));
        String desc = ctx.getChild(1).getText();
        return new RoomExit(desc, roomName);
    }

    @Override
    public Entity visitRoomItem(GameMapParser.RoomItemContext ctx) {

        RoomName roomName = (RoomName) visit(ctx.getChild(0));

        List<Entity> items = new ArrayList<>(ctx.item().size());

        for (GameMapParser.ItemContext itemContext : ctx.item()) {
            items.add(visit(itemContext));
        }
        return new RoomItem(roomName.getDescription(), roomName, items);
    }

    @Override
    public Entity visitRoomName(GameMapParser.RoomNameContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int lineNum = idToken.getLine();
        int columnNum = idToken.getCharPositionInLine() + 1;

        String roomName = ctx.ID().getText();
        if (!declRooms.contains(roomName)) {
            semanticErrors.add("Error: roomName " + roomName + " not declared (" + lineNum + " , " + columnNum + ")");
        }
        return new RoomName(roomName);
    }

    @Override
    public Entity visitAxe(GameMapParser.AxeContext ctx) {
        String desc = ctx.getChild(0).getText();
        int low = Integer.parseInt(ctx.getChild(2).getText());
        int high = Integer.parseInt(ctx.getChild(4).getText());
        return new Axe(desc, low, high);
    }

    @Override
    public Entity visitSword(GameMapParser.SwordContext ctx) {
        String desc = ctx.getChild(0).getText();
        int low = Integer.parseInt(ctx.getChild(2).getText());
        int high = Integer.parseInt(ctx.getChild(4).getText());
        return new Sword(desc, low, high);
    }


    @Override
    public Entity visitMead(GameMapParser.MeadContext ctx) {

        String desc = ctx.getChild(0).getText();

        int hp = Integer.parseInt(ctx.ID().getText());

        return new Mead(desc, hp);
    }


    @Override
    public Entity visitBread(GameMapParser.BreadContext ctx) {
        String desc = ctx.getChild(0).getText();

        int hp = Integer.parseInt(ctx.ID().getText());

        return new Bread(desc, hp);
    }


    @Override
    public Entity visitRoastboar(GameMapParser.RoastboarContext ctx) {
        String desc = ctx.getChild(0).getText();
        int hp = Integer.parseInt(ctx.ID().getText());
        return new RoastBoar(desc, hp);
    }


    @Override
    public Entity visitChalice(GameMapParser.ChaliceContext ctx) {
        String desc = ctx.getChild(0).getText();
        int val = Integer.parseInt(ctx.ID().getText());
        return new Chalice(desc, val);
    }

    @Override
    public Entity visitMobile(GameMapParser.MobileContext ctx) {
        String desc = ctx.getChild(0).getText();
        int val = Integer.parseInt(ctx.ID().getText());
        return new Mobile(desc, val);
    }

    @Override
    public Entity visitCoin(GameMapParser.CoinContext ctx) {
        String desc = ctx.getChild(0).getText();
        int val = Integer.parseInt(ctx.ID().getText());
        return new Coin(desc, val);
    }


    @Override
    public Entity visitGoldBars(GameMapParser.GoldBarsContext ctx) {
        String desc = ctx.getChild(0).getText();
        int val = Integer.parseInt(ctx.ID().getText());
        return new GoldBars(desc, val);
    }

    @Override
    public Entity visitRing(GameMapParser.RingContext ctx) {
        String desc = ctx.getChild(0).getText();
        int val = Integer.parseInt(ctx.ID().getText());
        return new Ring(desc, val);
    }

    @Override
    public Entity visitMoneyBag(GameMapParser.MoneyBagContext ctx) {
        String desc = ctx.getChild(0).getText();
        int val = Integer.parseInt(ctx.ID().getText());
        return new MoneyBag(desc, val);
    }

    @Override
    public Entity visitJewel(GameMapParser.JewelContext ctx) {
        String desc = ctx.getChild(0).getText();
        int val = Integer.parseInt(ctx.ID().getText());
        return new Jewel(desc, val);
    }

    @Override
    public Entity visitLockPick(GameMapParser.LockPickContext ctx) {
        String desc = ctx.getChild(0).getText();
        return new LockPick(desc);
    }

    @Override
    public Entity visitKey(GameMapParser.KeyContext ctx) {
        String desc = ctx.getChild(0).getText();
        return new Key(desc);
    }


    @Override
    public Entity visitTreasireChest(GameMapParser.TreasireChestContext ctx) {
        String desc = ctx.getChild(0).getText();
        Pickup contents = (Pickup) visit(ctx.getChild(2));
        return new TreasureChest(desc, contents);
    }

    @Override
    public Entity visitWarChest(GameMapParser.WarChestContext ctx) {
        String desc = ctx.getChild(0).getText();
        Pickup contents = (Pickup) visit(ctx.getChild(2));
        return new WarChest(desc, contents);
    }


    @Override
    public Entity visitDragon(GameMapParser.DragonContext ctx) {
        String desc = ctx.getChild(0).getText();
        int hp = Integer.parseInt(ctx.getChild(2).getText());
        int pb = Integer.parseInt(ctx.getChild(4).getText());
        int ad = Integer.parseInt(ctx.getChild(6).getText());
        return new Dragon(desc, hp, pb, ad);
    }


    @Override
    public Entity visitZombie(GameMapParser.ZombieContext ctx) {
        String desc = ctx.getChild(0).getText();
        int hp = Integer.parseInt(ctx.getChild(2).getText());
        int pb = Integer.parseInt(ctx.getChild(4).getText());
        int ad = Integer.parseInt(ctx.getChild(6).getText());
        return new Zombie(desc, hp, pb, ad);
    }


    @Override
    public Entity visitOgre(GameMapParser.OgreContext ctx) {
        String desc = ctx.getChild(0).getText();
        int hp = Integer.parseInt(ctx.getChild(2).getText());
        int pb = Integer.parseInt(ctx.getChild(4).getText());
        int ad = Integer.parseInt(ctx.getChild(6).getText());
        return new Ogre(desc, hp, pb, ad);
    }
}
