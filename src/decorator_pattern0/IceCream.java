package decorator_pattern0;

public interface IceCream {
    public String makeIcecream();
    public double getPrice();
}

/* Base Icecream*/

class MilkCream implements IceCream{
    @Override
    public String makeIcecream() {
        return "Milk Cream ";
    }
    public double getPrice(){
        return 100;
    }
}



class Kulfi implements IceCream{
    @Override
    public String makeIcecream() {
        return "Kulfi ";
    }
    public double getPrice(){
        return 150;
    }
}
