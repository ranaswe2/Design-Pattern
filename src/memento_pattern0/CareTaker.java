package memento_pattern0;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList= new ArrayList<>();

    public  void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public void getLastMementos(){
        int index= mementoList.size()-1;
        System.out.println(mementoList.get(index).getText());
        mementoList.remove(index);
    }

    public void getMementos(){
        for(Memento memento: mementoList){
            System.out.println(memento.getText());
        }
    }
}
