package adapter_pattern0;

public class AdapterMain {
    public static void main(String[] args) {

        IRectangle ir= new TennisCourt();
        RectangleAdapter square1= new RectangleAdapter(ir);
        square1.setSide(5);
        square1.printSquareArea();

        ISquare square2= new ChessBoard();
        square2.setSide(5);
        square2.printSquareArea();
    }
}
