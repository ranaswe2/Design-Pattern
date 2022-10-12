package strategy_pattern1;

public class Main {
    public static void main(String[] args) {
        Context context;

        context= new Context(new BeverageGroup());
        System.out.println(context.execute("Lemon Juice",250,20));

        context= new Context(new FoodGroup());
        System.out.println(context.execute("Melon Cake",100,10));

        context= new Context(new GarmentsGroup());
        System.out.println(context.execute("Chinese Than",50,1000));
    }
}
