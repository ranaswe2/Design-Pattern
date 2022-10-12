package decorator_pattern1;

public interface Booking {
    double price();
    String description();
}

class RoomBooking implements Booking{

    @Override
    public double price() {
        return 3000;
    }

    @Override
    public String description() {
        return "Single bed for 24 hours ";
    }
}
