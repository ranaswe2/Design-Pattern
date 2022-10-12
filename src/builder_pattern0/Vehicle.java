package builder_pattern0;

public abstract class Vehicle {
    final void setParts(String key,Parts parts){
        System.out.println(key+" "+parts.toString());
    }
    abstract void ready();
}

class Car extends Vehicle{

    public void ready() {
        System.out.println("Car is ready!");
    }
}


class Truck extends Vehicle{

    public void ready() {
        System.out.println("Truck is ready!");
    }
}
