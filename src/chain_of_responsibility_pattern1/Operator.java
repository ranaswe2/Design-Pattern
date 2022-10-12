package chain_of_responsibility_pattern1;

public abstract class Operator {
    Operator operator;

    public void nextOperator(Operator operator) {

        this.operator = operator;
    }

   abstract void receivedCall(String phoneNumber);

}
class OperatorA extends Operator{

    boolean isBusy= false;

    @Override
    public void receivedCall(String phoneNumber) {
        if(isBusy==false){
            System.out.println("Call from "+phoneNumber+" Received by OperatorA");
            isBusy=true;
        }
        else{
            operator.receivedCall(phoneNumber);
        }
    }
}

class OperatorB extends Operator{

    boolean isBusy= false;

    @Override
    public void receivedCall(String phoneNumber) {
        if(this.isBusy==false){
            System.out.println("Call from "+phoneNumber+" Received by OperatorB");
            isBusy=true;
        }
        else{
            operator.receivedCall(phoneNumber);
        }
    }
}

class OperatorC extends Operator{

    boolean isBusy= false;

    @Override
    public void receivedCall(String phoneNumber) {
        if(this.isBusy==false){
            System.out.println("Call from "+phoneNumber+" Received by OperatorC");
            isBusy=true;
        }
        else{
            System.out.println("Call from "+phoneNumber+" is now waiting for an operator.");
        }
    }
}

class Main {
    public static void main(String[] args) {

        OperatorA operatorA= new OperatorA();
        OperatorB operatorB= new OperatorB();
        OperatorC operatorC= new OperatorC();

        operatorA.nextOperator(operatorB);
        operatorB.nextOperator(operatorC);

        operatorA.receivedCall("01923456098");
        operatorA.receivedCall("01973456023");
        operatorA.receivedCall("01963456056");
        operatorA.receivedCall("01913456091");
    }

}
