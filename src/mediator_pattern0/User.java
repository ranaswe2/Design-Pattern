package mediator_pattern0;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sendMessage(String message){
        //
        System.out.println(ChatRoom.showMessage(this, message));
    }

}
