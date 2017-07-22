package roomfinder;

public abstract class Room {

    protected RoomType roomType;

    abstract boolean canAccommodate(Integer noOfAdults, Integer noOfChildren);

    public RoomType getRoomType() {
        return this.roomType;
    }
}
