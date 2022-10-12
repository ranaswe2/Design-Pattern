package strategy_pattern1;

public class FoodGroup implements Strategy{
    @Override
    public String product(String name, int netContent, int price) {
        return "Name: "+name+"\nNet Content: "+netContent+" Gram\nPrice: "+price+" Tk";
    }
}
