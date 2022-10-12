package strategy_pattern0;

public class SubOperation implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num2-num1;
    }
}