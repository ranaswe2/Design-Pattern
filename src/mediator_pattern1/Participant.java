package mediator_pattern1;

public class Participant extends Receptionist{
private String participantName;
private Reception reception;

    public Participant(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void joinDiscussionGroup(Reception reception){
        this.reception=reception;
        reception.addParticipant(this);
    }

    public void askSomething(String query) {

        System.out.println(participantName+": "+query);

        reception.askSomething(this,query);
    }

    public void getReply(Participant sender, String query){
        System.out.println(participantName+": "+query+" <From:"+sender.participantName+">");

    }
}
