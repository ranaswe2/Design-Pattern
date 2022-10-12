package builder_pattern1;

public abstract class PizzaBuilder {

    protected   Pizza pizza;
    public Pizza getPizza(){ return pizza;}

    void createNewPizza(){
        pizza= new Pizza();
    }

    abstract void buildDough();
    abstract void buildSauce();
    abstract void buildTopping();

}

class HawaiianPizzaBuilder extends PizzaBuilder{

    @Override
    void buildDough() {
pizza.setDough("Cross");
        System.out.println(pizza.getDough());
    }

    @Override
    void buildSauce() {
pizza.setSauce("Tomato");
        System.out.println(pizza.getSauce());
    }

    @Override
    void buildTopping() {
pizza.setTopping("Ham+Pineapple");
        System.out.println(pizza.getTopping());
    }
}

class SpicyPizzaBuilder extends PizzaBuilder{

    @Override
    void buildDough() {
        pizza.setDough("Pane Baked");
    }

    @Override
    void buildSauce() {
        pizza.setSauce("Hot Chili");
    }

    @Override
    void buildTopping() {
        pizza.setTopping("Tomato+Capsicum");
    }
}
