package roomfinder;

public class StandardRoom extends Room {
    public StandardRoom() {
        this.roomType = RoomType.Standard;
    }

    @Override
    public boolean canAccommodate(Integer noOfAdults, Integer noOfChildren) {
        return noOfAdults + noOfChildren == 1;
    }
}
