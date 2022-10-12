package lab_test3.decorator;

public interface Pizza {
    String getDescription();
    double getPrice();
}

class SimplePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Simple Pizza ";
    }

    @Override
    public double getPrice() {
        return 300;
    }
}

class PizzaTopper implements Pizza{

    Pizza pizza;

    public PizzaTopper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}



class PepperoniTopper extends PizzaTopper{

    public PepperoniTopper(Pizza pizza) {
        super(pizza);
    }


    public String getDescription() {
        return pizza.getDescription()+" with Pepperoni topper ";
    }

    public double getPrice() {
        return pizza.getPrice()+50;
    }
}





class CheeseTopper extends PizzaTopper{

    public CheeseTopper(Pizza pizza) {
        super(pizza);
    }


    public String getDescription() {
        return pizza.getDescription()+" with Cheese topper ";
    }

    public double getPrice() {
        return pizza.getPrice()+60;
    }
}
