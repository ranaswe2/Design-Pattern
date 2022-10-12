package bridge_pattern0;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class BridgeMain {
    public static void main(String[] args) {

        IDevice tv= new TV();
        tv.enable();
        System.out.println(tv);

        RemoteControl tvControl=new RemoteControl(tv);
        tvControl.volumeUp();
        tvControl.togglePower();

        IDevice radio= new Radio();
        radio.enable();
        System.out.println(radio);

        AdvancedRemoteControl radioControl= new AdvancedRemoteControl(radio);
        radioControl.volumeUp();
        radioControl.volumeUp();
        radioControl.mute();
        radioControl.togglePower();
    }
}
