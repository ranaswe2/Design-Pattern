package abstract_factory0;

public abstract class AbstractFactory {
    Shape shape;
    public abstract Shape getShape(String shapeName);
}

class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("rectangle"))
            shape= new Rectangle();
        else if (shapeType.equalsIgnoreCase("square"))
            shape= new Square();

        return shape;
    }
}

class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("rectangle"))
            shape= new RoundedRectangle();
        else if (shapeType.equalsIgnoreCase("square"))
            shape= new RoundedSquare();

        return shape;
    }
}
