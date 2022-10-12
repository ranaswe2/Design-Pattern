package adapter_pattern0;

public class TennisCourt implements IRectangle{
    int length;
    int width;

    @Override
    public void setLength(int length) {
        this.length=length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void printRectArea() {
        System.out.println("Area of Court:"+getLength()*getWidth());
    }
}
