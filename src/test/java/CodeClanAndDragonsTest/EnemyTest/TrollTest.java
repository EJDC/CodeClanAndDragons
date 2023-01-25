package CodeClanAndDragonsTest.EnemyTest;

import CodeClanAndDragons.Armoury.Club;
import CodeClanAndDragons.Enemy.EnemyTypes.Troll;
import CodeClanAndDragons.Player.PlayerTypes.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {

    Club club;

    Troll troll;

    Knight knight;

    @Before
    public void before() {
        club = new Club(15, "The Club called Club");
        troll = new Troll("Gark", 125, club);
        knight = new Knight("Sir Clegain", 150, club);

    }

    @Test
    public void getName() {
        assertEquals("Gark", troll.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(125, troll.getHealthPoints());
    }

    @Test
    public void getWeapon() {
        assertEquals(club, troll.getWeapon());
    }

    @Test
    public void reduceHealthPoints() {
        troll.reduceHealthPoints(10);
        assertEquals(115, troll.getHealthPoints());
    }

    @Test
    public void trollCanAttackKnight(){
        troll.attack(knight);
        assertEquals(135, knight.getHealthPoints());
    }


}