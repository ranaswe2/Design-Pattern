package builder_pattern0;

public class Director {
    TransportBuilder builder;

    public Director(TransportBuilder builder) {
        this.builder = builder;
    }

    public  void buildVehicle(){
        builder.createVehicle();
        builder.addDoor();
        builder.addEngine();
        builder.addWheel();
        builder.getVehicle();
    }

}
