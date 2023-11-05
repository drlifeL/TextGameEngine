package gameplay;

import entity.character.Player;

public class GameEngine
{

    public static void main(String[] args)
    {
        // TODO input path
        String fileName = "TextGameEngine/TextGameEngine/lib/test0.txt";
        //read the World object instance from a text file or literal
        World world = ReadWorldDataFile.basicWorld(fileName);

        System.out.println(world);

        Player playerOne = new Player("Sir Kendric",100,50);
        world.play(playerOne);
    }

}
