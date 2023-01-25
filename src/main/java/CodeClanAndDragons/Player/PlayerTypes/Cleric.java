package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Spell;
import CodeClanAndDragons.Armoury.Sumonee;
import CodeClanAndDragons.Enemy.Enemy;
import CodeClanAndDragons.Mechanics.ISpell;
import CodeClanAndDragons.Mechanics.IHeal;
import CodeClanAndDragons.Player.Player;

public class Cleric extends Mage implements ISpell, IHeal {
    public Cleric(String name, int healthPoints, Spell spell, Sumonee sumonee) {
        super(name, healthPoints, spell, sumonee);
    }


    public void cast(Enemy enemy) {
        enemy.reduceHealthPoints(this.spell.getSpellDamage());
    }

    public void sumoneeAttack(Enemy enemy) {
        enemy.reduceHealthPoints(this.sumonee.getDamage());
    }

    public void heal(Player player) {
        player.increaseHealthPoints(20);
    }
}
