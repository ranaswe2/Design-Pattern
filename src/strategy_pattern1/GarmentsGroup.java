package strategy_pattern1;

public class GarmentsGroup implements Strategy{
    @Override
    public String product(String name, int netContent, int price) {
        return "Name: "+name+"\nNet Content: "+netContent+" Square Feet\nPrice: "+price+" Tk";
    }
}
