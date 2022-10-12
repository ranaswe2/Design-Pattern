package observer_pattern1;

public abstract class Shop {
    String storeName;

    public void subscribe(Dealer shop) {
        shop.addStore(this);
    }

    public void unSubscribe(Dealer shop) {
        shop.removeStore(this);
    }

    public abstract void notifyAllShope(String notice);

}
