import CodeClanAndDragons.Dungeon.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){

        room = new Room();


    }
//    @Test
//    public void canGenerateRandomNumber(){
//        assertEquals(13231, room.randomNumberOfExits());
//    }

    @Test
    public void canGetRandomExits(){
        assertEquals("sss", room.chosenArrayList());
    }

}
