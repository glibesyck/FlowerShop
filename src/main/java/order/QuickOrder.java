package order;

import flowers.Flower;

public class QuickOrder {
    public static Order createOrder(Flower flower) {
        return new Order(flower);
    }
}
