package order;

import flowers.Flower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    Flower flower = new Flower();

    @Test
    void createOrder() {
        Order order = QuickOrder.createOrder(flower);
        assertEquals(order.flower, flower);
    }
}