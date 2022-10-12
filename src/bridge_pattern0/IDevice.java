package bridge_pattern0;

public interface IDevice {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
}





class Radio implements IDevice{

    int volume=10;
    boolean on=false;
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on=true;
        System.out.println("Radio is Enabled.");
    }

    @Override
    public void disable() {
        on= false;
        System.out.println("Radio is disabled.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume=volume;
    }


    public String toString(){

        return "Volume is :"+getVolume();
    }
}





class TV implements IDevice{

    int volume=20;
    boolean on=false;
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on=true;
        System.out.println("TV is Enabled.");
    }

    @Override
    public void disable() {
        on= false;
        System.out.println("TV is disabled.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume=volume;
    }

    public String toString(){

        return "Volume is :"+getVolume();
    }
}

