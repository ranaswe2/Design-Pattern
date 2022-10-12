package command_pattern0;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    Command command;
    List<Command>commandList=new ArrayList<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run(){
        this.command.execute();
    }

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void runAll(){
        for(Command command: commandList){
            command.execute();
        }
        commandList.clear();
    }
}
