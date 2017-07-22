package roomfinder;

import org.junit.Assert;
import org.junit.Test;


public class RoomFinderTest {

    @Test
    public void ShouldFindRoomAccordingToCapacity() {

        RoomFinder roomFinder = new RoomFinder();

        Room standardRoom = new StandardRoom();
        Room deluxRoom = new DeluxRoom();
        Room villa = new VillaRoom();
        Room suite = new SuiteRoom();

        roomFinder.AddRoom(standardRoom, 1);
        roomFinder.AddRoom(deluxRoom, 2);
        roomFinder.AddRoom(suite, 3);
        roomFinder.AddRoom(villa, 4);

        int noOfAdults = 2;
        int noOfChildren = 4;

        RoomType roomType = roomFinder.FindRoom(noOfAdults, noOfChildren);

        Assert.assertEquals(RoomType.Suite, roomType);

    }
}
