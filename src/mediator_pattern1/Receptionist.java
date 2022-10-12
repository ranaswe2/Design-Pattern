package mediator_pattern1;

import java.util.ArrayList;
import java.util.List;

public class Receptionist implements Reception{

    List<Participant> participantList;

    public Receptionist() {
        participantList= new ArrayList<>();
    }

    @Override
    public void addParticipant(Participant participant) {
        participantList.add(participant);
    }

    @Override
    public void askSomething(Participant sender, String query) {

        for (Participant receiver: participantList){

            if(receiver != sender)
                receiver.getReply(sender,query);

        }

    }
}
