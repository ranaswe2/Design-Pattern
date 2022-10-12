package command_pattern0;

public class Main {
    public static void main(String[] args) {
        AirCondition airCondition1= new AirCondition();
        AirCondition airCondition2= new AirCondition();

        Remote remote= new Remote();

        remote.setCommand(new TogglePower(airCondition1));
        remote.run();
        System.out.println(airCondition1);

        remote.setCommand(new TogglePower(airCondition2));
        remote.run();
        remote.run();
        System.out.println(airCondition2);


        remote.setCommand(new TogglePower(airCondition2));
        remote.addCommand(new IncreaseTemperature(airCondition2));
        remote.addCommand(new IncreaseTemperature(airCondition2));
        remote.runAll();
        System.out.println(airCondition2);

    }

}
