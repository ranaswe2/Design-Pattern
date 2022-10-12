package observer_pattern0;

import java.util.ArrayList;
import java.util.List;

public class Notice {
    private List<Person> subscriber= new ArrayList<>();

    public List<Person> getSubscriber(){

        return subscriber;
    }

    public void update(String notice){
        for(Person p: getSubscriber()){
            p.notify(notice);
        }
    }

    public void attach(Person subscriber){

        this.subscriber.add(subscriber);
    }

    public void detach(Person subscriber){

        this.subscriber.remove(subscriber);
    }

}
