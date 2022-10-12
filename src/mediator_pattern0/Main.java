package mediator_pattern0;

public class Main {

    public static void main(String[] args) {
        User user1= new User("Rana");
        User user2= new User("Razu");
        User user3= new User("Sourav");

        user1.sendMessage("Tour Plan Kor...");
        user2.sendMessage("Sylhet Jamu..");
        user3.sendMessage("Nijhum Dwip Jamu...");
    }
}
