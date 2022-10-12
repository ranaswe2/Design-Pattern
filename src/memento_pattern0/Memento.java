package memento_pattern0;

public class Memento {
    private String text;

    public Memento(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

}
