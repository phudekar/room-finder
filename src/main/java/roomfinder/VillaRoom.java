package roomfinder;

public class VillaRoom extends Room {

    public VillaRoom() {
        this.roomType = RoomType.Villa;
    }

    @Override
    public boolean canAccommodate(Integer noOfAdults, Integer noOfChildren) {
        return true;
    }

}
