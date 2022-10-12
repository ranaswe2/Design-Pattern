package observer_pattern0;

public class Student extends Person{

    public Student(String name) {
        this.name= name;
    }

    @Override
    public void notify(String notice) {
        System.out.println(name+" Notify Via Mail: "+notice);
    }
}
