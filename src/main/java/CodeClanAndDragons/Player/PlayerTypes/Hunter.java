package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Weapon;

public class Hunter extends Fighter {
    public Hunter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }
}
