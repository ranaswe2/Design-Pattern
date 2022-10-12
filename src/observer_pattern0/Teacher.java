package observer_pattern0;

public class Teacher  extends Person{

    public Teacher(String name) {
        this.name= name;
    }

    @Override
    public void notify(String notice) {
        System.out.println("Mr. "+name+" Notify Via Mail: "+notice);
    }
}
