package command_pattern1;

public class SpeedDown  implements Controller{
    Engine engine;

    public SpeedDown(Engine engine) {
        this.engine = engine;
    }


    @Override
    public void execute() {
        this.engine.speedDown();
    }
}
