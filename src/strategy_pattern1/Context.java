package strategy_pattern1;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {

        this.strategy = strategy;
    }

    String execute(String name, int netContent, int price){

        return strategy.product(name, netContent, price);
    }
}
