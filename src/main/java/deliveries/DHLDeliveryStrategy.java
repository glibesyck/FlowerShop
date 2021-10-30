package deliveries;

import items.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Your delivery method is using DHL!");
        return true;
    }
}
