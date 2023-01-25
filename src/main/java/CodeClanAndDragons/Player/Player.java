package CodeClanAndDragons.Player;

public abstract class Player {

    private String name;

    private int healthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void reduceHealthPoints(int healthPoints) {
        this.healthPoints -= healthPoints;
    }

    public void increaseHealthPoints(int healthPoints){
        this.healthPoints += healthPoints;
    }
}
