package abstract_factory0;

public interface Shape {
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle is drawing....");
    }
}

class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("RoundedRectangle is drawing....");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square is drawing....");
    }
}
class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("RoundedSquare is drawing....");
    }
}