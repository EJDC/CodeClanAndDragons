package CodeClanAndDragonsTest.PlayerTest;

import CodeClanAndDragons.Armoury.Club;
import CodeClanAndDragons.Armoury.Sword;
import CodeClanAndDragons.Player.PlayerTypes.Rogue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RogueTest {
    Sword sword;
    Club club;
    Rogue rogue;


    @Before
    public void before(){
        sword = new Sword(25, "Unknown");
        rogue = new Rogue("Sir Clegain", 140, sword);
        club = new Club(15, "club club");
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
}