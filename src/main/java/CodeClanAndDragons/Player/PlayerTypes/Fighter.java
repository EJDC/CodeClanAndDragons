package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Sword;
import CodeClanAndDragons.Armoury.Weapon;
import CodeClanAndDragons.Enemy.Enemy;
import CodeClanAndDragons.Mechanics.IFight;
import CodeClanAndDragons.Player.Player;

public abstract class Fighter extends Player  {

    Weapon weapon;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

}
