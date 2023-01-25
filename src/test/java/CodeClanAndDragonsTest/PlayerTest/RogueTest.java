package CodeClanAndDragonsTest.PlayerTest;

import CodeClanAndDragons.Armoury.Club;
import CodeClanAndDragons.Armoury.Sword;
import CodeClanAndDragons.Enemy.EnemyTypes.Troll;
import CodeClanAndDragons.Player.PlayerTypes.Rogue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RogueTest {
    Sword sword;
    Club club;
    Rogue rogue;

    Troll troll;


    @Before
    public void before(){
        sword = new Sword(25, "Unknown");
        rogue = new Rogue("Sir Clegain", 140, sword);
        club = new Club(15, "club club");
        troll = new Troll("Glark", 125, club);
    }

    @Test
    public void rogueHasName(){
        assertEquals("Sir Clegain", rogue.getName());
    }

    @Test
    public void rogueHasHealthPoints(){
        assertEquals(140, rogue.getHealthPoints());
    }

    @Test
    public void rogueHasSword(){
        assertEquals(sword, rogue.getWeapon());
    }

    @Test
    public void rogueCanChangeWeaponToClub(){
        rogue.changeWeapon(club);
        assertEquals(club, rogue.getWeapon());
    }
    @Test
    public void rogueCanAttackTroll(){
        rogue.attack(troll);
        assertEquals(100, troll.getHealthPoints());
    }
}