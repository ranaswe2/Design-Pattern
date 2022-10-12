package lab_test3.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Pizza pizza=new CheeseTopper(new SimplePizza());
        System.out.println("Description: "+pizza.getDescription());
        System.out.println("Total Price: "+pizza.getPrice());
    }
}
