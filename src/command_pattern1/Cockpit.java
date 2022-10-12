package command_pattern1;

import java.util.ArrayList;
import java.util.List;

public class Cockpit {
    private Controller command;
    private List<Controller> controllerList= new ArrayList<>();

    public void setCommand(Controller command){
        this.command= command;
    }

    public void takeOff(){
        System.out.println("Aircraft is now taking off! Tie your seatbelt.");
    }

    public void fly() {
        System.out.println("Aircraft is now flying! ");
    }

    public void land(){
        System.out.println("Aircraft is now landing! Tie your seatbelt.");
    }


    public void run(){
        this.command.execute();
    }

    public  void  addCommand(Controller command){
        controllerList.add(command);
    }

    public void runAll(){
        for(Controller command:controllerList){
            command.execute();
        }
        controllerList.clear();
    }
}
