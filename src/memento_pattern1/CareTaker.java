package memento_pattern1;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private int counter = 1;

    Map<Integer, Memento> mementoMap = new HashMap<>();

    public void addState(Memento memento) {
        mementoMap.put(counter, memento);
        counter++;
    }

    public void removeState(int state) {
        mementoMap.remove(state);
    }

    public void printAllSavedState() {
        for (Map.Entry<Integer, Memento> entry : mementoMap.entrySet()) {
            System.out.println("State-" + entry.getKey() + " :");
            entry.getValue().printMemento();
        }
    }
    public Memento getState(int state){
        return mementoMap.get(state);
    }
}

