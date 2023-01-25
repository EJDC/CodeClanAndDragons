package CodeClanAndDragons.Enemy;

import CodeClanAndDragons.Armoury.Weapon;

public abstract class Enemy {

    private String name;
    private int healthPoints;
    private Weapon weapon;

    public Enemy(String name, int healthPoints, Weapon weapon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void reduceHealthPoints(int healthPoints) {
        this.healthPoints -= healthPoints;
    }
}
