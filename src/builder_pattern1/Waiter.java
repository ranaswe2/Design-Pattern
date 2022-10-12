package builder_pattern1;

public class Waiter {
    PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder= pizzaBuilder;
    }

    public void constructPizza(){
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

    public Pizza getPizza(){
       return pizzaBuilder.getPizza();
    }
}
