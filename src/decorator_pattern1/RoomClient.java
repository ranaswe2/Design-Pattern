package decorator_pattern1;

public class RoomClient {
    public static void main(String[] args) {

        Booking booking1= new WiFi(new RoomBooking());
        System.out.println("Description: "+booking1.description());
        System.out.println("Total Cost = "+booking1.price());

        Booking booking2= new WiFi(new ExtraBed(new RoomBooking()));
        System.out.println("Description: "+booking2.description());
        System.out.println("Total Cost = "+booking2.price());
    }
}
