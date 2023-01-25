package CodeClanAndDragonsTest.PlayerTest;

import CodeClanAndDragons.Armoury.Club;
import CodeClanAndDragons.Armoury.Sword;
import CodeClanAndDragons.Player.PlayerTypes.Hunter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HunterTest {
    Sword sword;
    Club club;
    Hunter hunter;


    @Before
    public void before(){
        sword = new Sword(25, "Unknown");
        hunter = new Hunter("Sir Clegain", 140, sword);
        club = new Club(15, "club club");
    }

    @Test
    public void hunterHasName(){
        assertEquals("Sir Clegain", hunter.getName());
    }

    @Test
    public void hunterHasHealthPoints(){
        assertEquals(140, hunter.getHealthPoints());
    }

    @Test
    public void hunterHasSword(){
        assertEquals(sword, hunter.getWeapon());
    }

    @Test
    public void hunterCanChangeWeaponToClub(){
        hunter.changeWeapon(club);
        assertEquals(club, hunter.getWeapon());
    }
}