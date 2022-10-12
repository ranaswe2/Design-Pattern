package builder_pattern0;

public interface TransportBuilder {
    void addWheel();
    void addEngine();
    void addDoor();
    void getVehicle();
    Vehicle createVehicle();
}

class CarBuilder implements  TransportBuilder{

    Car car;
    @Override
    public void addWheel() {

        car.setParts("FR",new Wheel());
        car.setParts("FL",new Wheel());
        car.setParts("RR",new Wheel());
        car.setParts("RL",new Wheel());
    }

    @Override
    public void addEngine() {
        car.setParts("Volvo",new Engine());
    }

    @Override
    public void addDoor() {
        car.setParts("LD",new Door());
        car.setParts("RD",new Door());
    }

    @Override
    public void getVehicle() {
        car.ready();
    }

    @Override
    public Vehicle createVehicle() {
        car= new Car();
        return car;
    }
}





class TruckBuilder implements  TransportBuilder{

    Truck truck;
    @Override
    public void addWheel() {

        truck.setParts("FR",new Wheel());
        truck.setParts("FL",new Wheel());
        truck.setParts("RR",new Wheel());
        truck.setParts("RL",new Wheel());
    }

    @Override
    public void addEngine() {
        truck.setParts("Ashok Layland",new Engine());
    }

    @Override
    public void addDoor() {
        truck.setParts("LD",new Door());
        truck.setParts("RD",new Door());
    }

    @Override
    public void getVehicle() {
        truck.ready();
    }

    @Override
    public Vehicle createVehicle() {
        truck= new Truck();
        return truck;
    }
}
