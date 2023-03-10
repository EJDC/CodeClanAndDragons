package CodeClanAndDragonsTest.PlayerTest;

import CodeClanAndDragons.Armoury.Club;
import CodeClanAndDragons.Armoury.Sword;
import CodeClanAndDragons.Enemy.EnemyTypes.Troll;
import CodeClanAndDragons.Player.PlayerTypes.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;

    Club club;

    Troll troll;
    @Before
    public void before(){
        sword = new Sword(25, "Unknown");
        knight = new Knight("Sir Clegain", 140, sword);
        club = new Club(15, "club club");
        troll = new Troll("Glark", 125, club);
    }

    @Test
    public void knightHasName(){
        assertEquals("Sir Clegain", knight.getName());
    }

    @Test
    public void knightHasHealthPoints(){
        assertEquals(140, knight.getHealthPoints());
    }

    @Test
    public void knightHasSword(){
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void knightCanChangeWeaponToClub(){
        knight.changeWeapon(club);
        assertEquals(club, knight.getWeapon());
    }

    @Test
    public void knightCanAttackTroll(){
        knight.attack(troll);
        assertEquals(100, troll.getHealthPoints());
    }



}
