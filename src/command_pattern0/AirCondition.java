package command_pattern0;

public class AirCondition {
    boolean on;
    int temperature;

    public AirCondition() {
        this.on = false;
        this.temperature = 18;
    }

    public void switchToggle(){
        this.on= !this.on;
    }

    public void increaseTemperature(){
        if(this.temperature==30){
            return;
        }
        else {
            this.temperature= this.temperature+1;
        }
    }

    public void decreaseTemperature(){
        if(this.temperature==10){
            return;
        }
        else {
            this.temperature= this.temperature-1;
        }
    }

    @Override
    public String toString() {

        return "Power Status: " + on +" Temperature: " + temperature;
    }
}
