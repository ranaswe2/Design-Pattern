package abstract_factory0;

public class AFMain {
    public static void main(String[] args) {

    AbstractFactory afactory= FactoryProducer.getFactory("Rounded");
    Shape shape= afactory.getShape("Rectangle");
    shape.draw();



    }
}
