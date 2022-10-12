package adapter_pattern0;

public class ChessBoard implements ISquare{

    int side;

    @Override
    public void setSide(int side) {
        this.side=side;
    }

    @Override
    public void printSquareArea() {
        System.out.println("Area of Chess Board: "+side*side);
    }
}
