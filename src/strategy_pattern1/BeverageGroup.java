package strategy_pattern1;

public class BeverageGroup implements Strategy{
    @Override
    public String product(String name, int netContent, int price) {
        return "Name: "+name+"\nNet Content: "+netContent+" mL\nPrice: "+price+" Tk";
    }
}
