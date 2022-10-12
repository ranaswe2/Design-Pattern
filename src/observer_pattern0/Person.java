package observer_pattern0;

public abstract class Person {

    protected String name;

    public abstract void notify(String notice);

    public void subscrib(Notice notice){

        notice.attach(this);
    }

    public void unSubscrib(Notice notice){

        notice.detach(this);
    }


}
