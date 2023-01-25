package CodeClanAndDragons.Enemy.EnemyTypes;

import CodeClanAndDragons.Armoury.Weapon;
import CodeClanAndDragons.Enemy.Enemy;
import CodeClanAndDragons.Mechanics.IFight;
import CodeClanAndDragons.Player.Player;

public class Ogre extends Enemy implements IFight {

    public Ogre(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
    }

    public void attack(Enemy enemy) {

    }

    public void attack(Player player) {
        player.reduceHealthPoints(this.getWeapon().getDamage());
    }
}
