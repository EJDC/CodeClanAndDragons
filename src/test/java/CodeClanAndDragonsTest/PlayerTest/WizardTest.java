package CodeClanAndDragonsTest.PlayerTest;

import CodeClanAndDragons.Armoury.Club;
import CodeClanAndDragons.Armoury.Spell;
import CodeClanAndDragons.Armoury.Sumonee;
import CodeClanAndDragons.Armoury.Sword;
import CodeClanAndDragons.Enemy.EnemyTypes.Troll;
import CodeClanAndDragons.Player.PlayerTypes.Rogue;
import CodeClanAndDragons.Player.PlayerTypes.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {
    Club club;
    Wizard wizard;

    Troll troll;
    Spell spell;

    Sumonee dragon;

    @Before
    public void before(){
        spell = Spell.FIRE;
        dragon = Sumonee.DRAGON;
        wizard = new Wizard("Merlin", 100, spell, dragon);
        club = new Club(15, "club club");
        troll = new Troll("Glark", 125, club);

    }

    @Test
    public void rogueHasName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void rogueHasHealthPoints(){
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void hasSpellFire(){
        assertEquals("Fireball", wizard.getSpell().getSpellName());
    }

    @Test
    public void canDealDamageToTrollWithFireSpell(){
        wizard.cast(troll);
        assertEquals(105, troll.getHealthPoints());
    }

    @Test
    public void canDealDamageToTrollWithSumoneeDragon(){
        wizard.sumoneeAttack(troll);
        assertEquals(95, troll.getHealthPoints());
    }

    @Test
    public void canChangeSpelltoWater(){
        wizard.changeSpell(Spell.WATER);
        assertEquals("Aquis", wizard.getSpell().getSpellName());
    }

    @Test
    public void canChangeSumoneeToDireBadger(){
        wizard.changeSummon(Sumonee.DIREBADGER);
        assertEquals(Sumonee.DIREBADGER, wizard.getSumonee());
    }

}