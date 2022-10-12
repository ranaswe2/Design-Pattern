package memento_pattern0;

public class Main {
    public static void main(String[] args) {

        Editor editor= new Editor();
        CareTaker ct= new CareTaker();

        editor.setText("Joy Bangla");
        ct.addMemento(editor.saveTextToMemento());

        editor.setText("Joy Bangabandhu");
        ct.addMemento(editor.saveTextToMemento());

        editor.setText("Joy Hasina");
        ct.addMemento(editor.saveTextToMemento());

       // ct.getMementos();

        ct.getLastMementos();
        ct.getLastMementos();
        ct.getLastMementos();
    }
}
