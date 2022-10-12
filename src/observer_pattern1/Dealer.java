package observer_pattern1;

import java.util.ArrayList;
import java.util.List;

public class Dealer  implements ProductDetails{
   private List<Shop> stores= new ArrayList<>();

    public void addStore(Shop store){
        stores.add(store);
    }

    public void removeStore(Shop store){
        stores.remove(store);
    }

    public List<Shop> getStores(){
       return this.stores;
    }

    public void updateNotice(String notice){
        for (Shop store:getStores()) {
            store.notifyAllShope(notice);
        }

    }

    @Override
    public String aboutProduct(String productName, String model, double price) {
        return " Device Name: "+productName+"  Model: "+model+" Price: "+price;
    }
}
