package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Spell;
import CodeClanAndDragons.Armoury.Sumonee;
import CodeClanAndDragons.Enemy.Enemy;
import CodeClanAndDragons.Mechanics.ISpell;

public class Wizard extends Mage implements ISpell {

    public Wizard(String name, int healthPoints, Spell spell, Sumonee sumonee) {
        super(name, healthPoints, spell, sumonee);
    }

    public void cast(Enemy enemy) {
        enemy.reduceHealthPoints(this.spell.getSpellDamage());
    }

    public void sumoneeAttack(Enemy enemy) {
        enemy.reduceHealthPoints(this.sumonee.getDamage());
    }
}
