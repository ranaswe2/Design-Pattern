package memento_pattern0;

public class Editor {
    private String text;

    public void setText(String text) {

        this.text= text;
    }

    public Memento saveTextToMemento() {

        return new Memento(text);
    }


}
