package builder_pattern0;

public class Main {
    public static void main(String[] args) {

        Director director=new Director(new CarBuilder());
        director.buildVehicle();

        Director director1=new Director(new TruckBuilder());
        director1.buildVehicle();
    }
}
