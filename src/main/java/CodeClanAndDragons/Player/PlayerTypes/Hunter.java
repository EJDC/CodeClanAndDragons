package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Weapon;
import CodeClanAndDragons.Enemy.Enemy;
import CodeClanAndDragons.Mechanics.IFight;
import CodeClanAndDragons.Player.Player;

public class Hunter extends Fighter implements IFight {
    public Hunter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }


    public void attack(Enemy enemy) {
        enemy.reduceHealthPoints(this.weapon.getDamage());
    }

    public void attack(Player player) {

    }
}
