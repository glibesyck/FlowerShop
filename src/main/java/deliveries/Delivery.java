package deliveries;

import java.util.List;
import items.Item;

public interface Delivery {
    boolean deliver(List<Item> items);
}
