package memento_pattern1;

public class Main {
    public static void main(String[] args) {
        Originator originator= new Originator();
        CareTaker ct= new CareTaker();

        originator.setState(12,2,13);
        ct.addState(originator.saveToMemento());

        originator.setState(45,3,13);
        ct.addState(originator.saveToMemento());

        originator.setState(5,30,19);
        ct.addState(originator.saveToMemento());

        ct.printAllSavedState();
       // originator.printState();
        originator.restoreStateFromMemento(ct.getState(3));
        originator.printState();

    }
}
