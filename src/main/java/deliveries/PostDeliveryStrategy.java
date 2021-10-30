package deliveries;

import items.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Your delivery method is using post!");
        return true;
    }
}
