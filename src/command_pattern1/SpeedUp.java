package command_pattern1;

public class SpeedUp implements Controller{
    Engine engine;

    public SpeedUp(Engine engine) {
        this.engine = engine;
    }


    @Override
    public void execute() {
        this.engine.speedUp();
    }
}
