package LabFinal.q2;

public class DebitCard {
    String acc;
    CentralDatabase cd;
    AmountCalculator ac;
    LedScrin ls;
    ReceiptPrinter rp;

    public DebitCard(String acc) {
        this.acc = acc;
        cd= new CentralDatabase();
        ac= new AmountCalculator();
        ls= new LedScrin();
        rp= new ReceiptPrinter();
    }

    void withdraw(int amount){
        cd.withdrawn(amount);
        ac.debited(amount);
        ls.message();
        rp.printx(amount,acc);
    }
}


class CentralDatabase{

    void withdrawn(int money){
        System.out.println("Central Database : "+money+" Taka can be withdrawn.");
    }
}

class AmountCalculator{
    void debited(int money){
        System.out.println("Amount Calculator"+money+" Taka has been debited.");
    }
}

class LedScrin{
    void message(){
        System.out.println("Led Scrin: Txn has been completely successfully");
    }
}
class ReceiptPrinter{
    void printx(int money,String acc){
        System.out.println("Receipt Printer: "+money+" Taka has been deducted from "+acc);
    }
}


class Main{
    public static void main(String[] args) {
        DebitCard card= new DebitCard("120-4567-0987");
        card.withdraw(500);
    }
}