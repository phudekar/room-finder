package roomfinder;

public class SuiteRoom extends Room {

    public SuiteRoom(){
        this.roomType = RoomType.Suite;
    }

    @Override
    public boolean canAccommodate(Integer noOfAdults, Integer noOfChildren) {
        return (noOfAdults <= 2 && noOfChildren <= 4)
                || noOfAdults == 4;
    }
}
