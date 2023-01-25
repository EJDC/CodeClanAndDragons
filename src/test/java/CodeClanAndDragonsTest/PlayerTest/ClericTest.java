package CodeClanAndDragonsTest.PlayerTest;

import CodeClanAndDragons.Armoury.Club;
import CodeClanAndDragons.Armoury.Spell;
import CodeClanAndDragons.Armoury.Sumonee;
import CodeClanAndDragons.Armoury.Sword;
import CodeClanAndDragons.Enemy.EnemyTypes.Troll;
import CodeClanAndDragons.Player.PlayerTypes.Cleric;
import CodeClanAndDragons.Player.PlayerTypes.Knight;
import CodeClanAndDragons.Player.PlayerTypes.Rogue;
import CodeClanAndDragons.Player.PlayerTypes.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {
    Club club;
    Cleric cleric;

    Troll troll;
    Spell spell;

    Sumonee dragon;
    Knight knight;

    @Before
    public void before(){
        spell = Spell.FIRE;
        dragon = Sumonee.DRAGON;
        cleric = new Cleric("Merlin", 100, spell, dragon);
        club = new Club(15, "club club");
        troll = new Troll("Glark", 125, club);
        knight = new Knight("Sir Clegain", 140, club);

    }

    @Test
    public void rogueHasName(){
        assertEquals("Merlin", cleric.getName());
    }

    @Test
    public void rogueHasHealthPoints(){
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void hasSpellFire(){
        assertEquals("Fireball", cleric.getSpell().getSpellName());
    }

    @Test
    public void canDealDamageToTrollWithFireSpell(){
        cleric.cast(troll);
        assertEquals(105, troll.getHealthPoints());
    }

    @Test
    public void canDealDamageToTrollWithSumoneeDragon(){
        cleric.sumoneeAttack(troll);
        assertEquals(95, troll.getHealthPoints());
    }

    @Test
    public void canChangeSpelltoWater(){
        cleric.changeSpell(Spell.WATER);
        assertEquals("Aquis", cleric.getSpell().getSpellName());
    }

    @Test
    public void canChangeSumoneeToDireBadger(){
        cleric.changeSummon(Sumonee.DIREBADGER);
        assertEquals(Sumonee.DIREBADGER, cleric.getSumonee());
    }

    @Test
    public void canHealSelfCastingHeal(){
        troll.attack(cleric);
        cleric.heal(cleric);
        assertEquals(105, cleric.getHealthPoints());
    }

    @Test
    public void canHealOtherPlayerUsingHeal(){
        troll.attack(knight);
        cleric.heal(knight);
        assertEquals(145, knight.getHealthPoints());
    }

}