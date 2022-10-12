package command_pattern1;

public class Main {
    public static void main(String[] args) {
        Engine engine= new Engine();

        Cockpit cockpit= new Cockpit();
        cockpit.setCommand(new Power(engine));
        cockpit.run();
        System.out.println(engine);

        cockpit.addCommand(new SpeedUp(engine));
        cockpit.runAll();
        System.out.println(engine);

        cockpit.addCommand(new SpeedUp(engine));
        cockpit.addCommand(new SpeedUp(engine));
        cockpit.addCommand(new SpeedUp(engine));
        cockpit.addCommand(new SpeedUp(engine));
        cockpit.addCommand(new SpeedUp(engine));
        cockpit.addCommand(new SpeedUp(engine));
        cockpit.addCommand(new SpeedUp(engine));
        cockpit.runAll();
        System.out.println(engine);

        cockpit.addCommand(new SpeedDown(engine));
        cockpit.runAll();
        System.out.println(engine);

    }
}
