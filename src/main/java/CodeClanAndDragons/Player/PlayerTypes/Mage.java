package CodeClanAndDragons.Player.PlayerTypes;

import CodeClanAndDragons.Armoury.Spell;
import CodeClanAndDragons.Armoury.Sumonee;
import CodeClanAndDragons.Mechanics.ISummon;
import CodeClanAndDragons.Player.Player;

public abstract class Mage extends Player implements ISummon {

    Spell spell;

    Sumonee sumonee;
    public Mage(String name, int healthPoints, Spell spell, Sumonee sumonee) {
        super(name, healthPoints);
        this.spell = spell;
        this.sumonee = sumonee;
    }


    public Spell getSpell() {
        return this.spell;
    }

    public Sumonee getSumonee() {
        return this.sumonee;
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;
    }


    public void changeSummon(Sumonee sumonee) {
        this.sumonee = sumonee;

    }
}
