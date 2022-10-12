package strategy_pattern0;

public class Main {

    public static void main(String[] args) {
       // Context context;

        Context context1= new Context(new AddOperation());
        System.out.println(context1.execute(10,12));

        Context context2= new Context(new MulOperation());
        System.out.println(context2.execute(10,12));


    }
}
