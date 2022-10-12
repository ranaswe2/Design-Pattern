package memento_pattern1;

public class Memento {
    private double temperature;
    private double pressure;
    private double volume;

    public Memento(double temperature, double pressure, double volume) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getVolume() {
        return volume;
    }

    public void printMemento() {
        System.out.println( "State: temperature=" + temperature + ", pressure=" + pressure + ", volume=" + volume );
    }
}
