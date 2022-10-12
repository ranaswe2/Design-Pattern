package adapter_pattern0;

public class RectangleAdapter implements ISquare{

    IRectangle rectangle;

    public RectangleAdapter(IRectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void setSide(int side) {
        rectangle.setLength(side);
        rectangle.setWidth(side);

    }

    @Override
    public void printSquareArea() {
        rectangle.printRectArea();
    }
}
