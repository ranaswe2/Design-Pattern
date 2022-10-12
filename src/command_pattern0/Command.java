package command_pattern0;

public interface Command {

    void execute();

}



class DecreseTemperature implements Command{
    AirCondition airCondition;

    public DecreseTemperature(AirCondition airCondition) {
        this.airCondition = airCondition;
    }


    @Override
    public void execute() {
        this.airCondition.decreaseTemperature();
    }
}



class IncreaseTemperature implements Command{
    AirCondition airCondition;

    public IncreaseTemperature(AirCondition airCondition) {
        this.airCondition = airCondition;
    }


    @Override
    public void execute() {
        this.airCondition.increaseTemperature();
    }
}



class TogglePower implements Command{
    AirCondition airCondition;

    public TogglePower(AirCondition airCondition) {
        this.airCondition = airCondition;
    }


    @Override
    public void execute() {
        this.airCondition.switchToggle();
    }
}

