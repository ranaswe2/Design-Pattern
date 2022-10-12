package bridge_pattern0;

public class RemoteControl {

    IDevice device;

    public RemoteControl(IDevice device) {
        this.device = device;
    }

    void togglePower(){
        if(device.isEnabled()){
            device.disable();
        }
        else  device.enable();
    }

    void volumeDown(){
        device.setVolume(device.getVolume()-1);
        System.out.println("Volume is: "+device.getVolume());
    }

    void volumeUp(){
        device.setVolume(device.getVolume()+1);
        System.out.println("Volume is: "+device.getVolume());
    }

}




class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(IDevice device) {
        super(device);
    }

    void mute(){
        device.setVolume(0);
        System.out.println("Volume is: "+device.getVolume());
    }


}