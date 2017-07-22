package roomfinder;

public class DeluxRoom extends Room {

    public DeluxRoom() {
        this.roomType = RoomType.Delux;
    }

    @Override
    public boolean canAccommodate(Integer noOfAdults, Integer noOfChildren) {
        return noOfAdults + noOfChildren == 2;
    }

}
