package builder_pattern1;

public class PizzaClient {
    public static void main(String[] args) {
        PizzaBuilder hawaiiPizza= new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizza= new SpicyPizzaBuilder();

        Waiter waiter= new Waiter();

        waiter.setPizzaBuilder(hawaiiPizza);
        waiter.constructPizza();

       // Pizza pizza= waiter.getPizza();
    }
}
