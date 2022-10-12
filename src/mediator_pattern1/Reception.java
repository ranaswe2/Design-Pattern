package mediator_pattern1;

public interface Reception {

    void addParticipant(Participant participant);
    void askSomething(Participant participant, String query);

}
