package observer_pattern1;

public class PhoneShop extends Shop{

    public PhoneShop(String storeName) {
        this.storeName= storeName;
    }

    @Override
    public void notifyAllShope(String notice) {
        System.out.println(storeName+": "+notice);
    }

}
