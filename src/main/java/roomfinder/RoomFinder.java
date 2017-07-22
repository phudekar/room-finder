package roomfinder;

import java.util.SortedMap;
import java.util.TreeMap;

public class RoomFinder {
    private SortedMap<Integer, Room> rooms;

    public RoomFinder() {
        rooms = new TreeMap<>();
    }

    public RoomType FindRoom(int noOfAdults, int noOfChildren) {

        for (Integer priority : rooms.keySet()) {
            if (rooms.get(priority).canAccommodate(noOfAdults, noOfChildren)) {
                return rooms.get(priority).getRoomType();
            }
        }
        return RoomType.Villa;

    }

    public void AddRoom(Room standardRoom, int priority) {
        this.rooms.put(priority, standardRoom);
    }
}
