package memento_pattern1;

public class Originator {
    private double temperature;
    private double pressure;
    private double volume;

    public void setState(double temperature, double pressure, double volume) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.volume = volume;
    }

    public Memento saveToMemento(){
        return new Memento(temperature,pressure,volume);
    }

    public void restoreStateFromMemento(Memento memento){
        this.temperature= memento.getTemperature();
        this.pressure= memento.getPressure();
        this.volume= memento.getVolume();
    }

    public void printState(){
        System.out.println( "State: temperature=" + temperature + ", pressure=" + pressure + ", volume=" + volume );
    }
}