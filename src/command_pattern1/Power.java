package command_pattern1;

public class Power implements Controller{
    Engine engine;

    public Power(Engine engine) {
        this.engine = engine;
    }


    @Override
    public void execute() {
        this.engine.powerOn();
    }
}
