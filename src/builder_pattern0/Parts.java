package builder_pattern0;

public interface Parts {
    String toString();
}

class Wheel implements  Parts{
    public  String toString(){
        return "Wheel is Connected!";
    }
}


class Engine implements  Parts{
    public  String toString(){
        return "Engine is Connected!";
    }
}


class Door implements  Parts{
    public  String toString(){
        return "Door is Connected!";
    }
}
