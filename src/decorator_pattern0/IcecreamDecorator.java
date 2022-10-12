package decorator_pattern0;

public class IcecreamDecorator implements IceCream{
    protected IceCream icecream;

    public IcecreamDecorator(IceCream icecream) {
        this.icecream = icecream;
    }


    @Override
    public String makeIcecream() {
        return icecream.makeIcecream();
    }
    public double getPrice(){
        return icecream.getPrice();
    }
}




class NuttyIcecream extends IcecreamDecorator{

    public NuttyIcecream(IceCream icecream) {
        super(icecream);
    }

    private String addNuts() {
        return "Cruncy Nuts ";
    }

    @Override
    public String makeIcecream() {
        return icecream.makeIcecream()+addNuts();
    }
    public double getPrice(){
        return icecream.getPrice()+40;
    }
}




class ChocolateIcecream extends IcecreamDecorator{
    public ChocolateIcecream(IceCream icecream) {
        super(icecream);
    }

    private String addChocolate(){
        return "Chocolate Layer ";
    }

    @Override
    public String makeIcecream() {
        return icecream.makeIcecream()+addChocolate();
    }
    public double getPrice(){
        return icecream.getPrice()+60;
    }
}
