package decorator_pattern1;

public class RoomDecorator implements Booking{
    Booking booking;

    public RoomDecorator(Booking booking) {
        this.booking = booking;
    }

    @Override
    public double price() {
        return booking.price();
    }

    @Override
    public String description() {
        return booking.description();
    }
}


class WiFi extends RoomDecorator{

    public WiFi(Booking booking) {
        super(booking);
    }

    @Override
    public double price() {
        return super.price()+100;
    }

    @Override
    public String description() {
        return super.description()+" with WiFi ";
    }
}

class ExtraBed extends RoomDecorator{

    public ExtraBed(Booking booking) {
        super(booking);
    }

    @Override
    public double price() {
        return super.price()+500;
    }

    @Override
    public String description() {
        return super.description()+" with extra bed";
    }
}