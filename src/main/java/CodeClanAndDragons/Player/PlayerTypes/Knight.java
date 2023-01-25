package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Weapon;
import CodeClanAndDragons.Enemy.Enemy;
import CodeClanAndDragons.Mechanics.IFight;
import CodeClanAndDragons.Player.Player;

public class Knight extends Fighter implements IFight {


    public Knight(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        enemy.reduceHealthPoints(this.weapon.getDamage());
    }

    public void attack(Player player) {

    }


}
