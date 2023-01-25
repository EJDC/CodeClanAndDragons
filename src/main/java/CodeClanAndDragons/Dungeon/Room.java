package CodeClanAndDragons.Dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Room {

    Exit exit;
    private ArrayList<Exit> exits;

    public Room() {
        this.exits = new ArrayList<Exit>();
    }

    public int randomNumberOfExits(){
        Random random;
        random = new Random();
        return random.nextInt(5 - 1) + 1;
    }

    public ArrayList<Exit> chosenArrayList() {
        ArrayList<Exit> choiceA = new ArrayList<Exit>(Arrays.asList(Exit.NORTH, Exit.WEST, Exit.SOUTH));
        ArrayList<Exit> choiceB = new ArrayList<Exit>(Arrays.asList(Exit.SOUTH, Exit.EAST, Exit.NORTH, Exit.WEST));
        ArrayList<Exit> choiceC = new ArrayList<Exit>(Arrays.asList(Exit.NORTH, Exit.SOUTH));
        ArrayList<Exit> choiceD = new ArrayList<Exit>(Arrays.asList(Exit.WEST, Exit.SOUTH, Exit.EAST, Exit.WEST));

        int randomNumber = randomNumberOfExits();
        ArrayList<Exit> chosenArray = choiceA;
        switch (randomNumber) {
            case 1:
                chosenArray = choiceA;
                break;
            case 2:
                chosenArray = choiceB;
                break;
            case 3:
                chosenArray = choiceC;
            break;
            case 4:
                chosenArray = choiceD;
            break;
        }
        return chosenArray;
    }

}
