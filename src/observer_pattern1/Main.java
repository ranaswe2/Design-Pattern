package observer_pattern1;

public class Main {
    public static void main(String[] args) {
        Dealer phoneDealer= new Dealer();

        PhoneShop ps1=new PhoneShop("Rose Valley");//
        PhoneShop ps2=new PhoneShop("Loia Jan");
        PhoneShop ps3=new PhoneShop("Dreamer's World");
        ps1.subscribe(phoneDealer);
        ps3.subscribe(phoneDealer);
        phoneDealer.updateNotice("A new product has relised.\n"+phoneDealer.aboutProduct("Tab","Micro Del",23000));
        ps1.unSubscribe(phoneDealer);
        phoneDealer.updateNotice("Eid Offer! You have to give 20% discount for each device.");
        Dealer computerDealer= new Dealer();


        Dealer pcDealer= new Dealer();

        ComputerShop cs1=new ComputerShop("PC World");
        ComputerShop cs2=new ComputerShop("Computer Village");
        ComputerShop cs3=new ComputerShop("PC Universe");
        cs2.subscribe(pcDealer);
        pcDealer.updateNotice("A new product has relised.\n"+pcDealer.aboutProduct("Laptop","Extensive 5cro",63000));



    }
}
