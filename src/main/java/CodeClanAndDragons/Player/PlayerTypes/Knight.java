package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Weapon;

public class Knight extends Fighter{


    public Knight(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }


}