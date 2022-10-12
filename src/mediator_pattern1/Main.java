package mediator_pattern1;

public class Main {
    public static void main(String[] args) {
        Participant participant1= new Participant("Dr. Mabubur Rahman");
        Participant participant2= new Participant("Dr. Ayesha Jannat");
        Participant participant3= new Participant("Razu Biswas-Patient");
        Participant participant4= new Participant("S. Barman-Patient");

        Receptionist reception= new Receptionist();

        participant1.joinDiscussionGroup(reception);
        participant2.joinDiscussionGroup(reception);
        participant3.joinDiscussionGroup(reception);

        participant3.askSomething("When my operation will be occured?");
        participant1.askSomething("Today 10:00 PM");
    }
}
