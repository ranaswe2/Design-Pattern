package observer_pattern1;

public class ComputerShop extends Shop {

    public ComputerShop(String storeName) {
        this.storeName= storeName;
    }

    @Override
    public void notifyAllShope(String notice) {
        System.out.println(storeName+": "+notice);
    }
}
