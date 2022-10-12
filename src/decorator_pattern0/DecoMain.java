package decorator_pattern0;

public class DecoMain {
    public static void main(String[] args) {

        IceCream icecream= new ChocolateIcecream(new NuttyIcecream(new MilkCream()));
        System.out.println(icecream.makeIcecream());
        System.out.println(icecream.getPrice());
    }
}
