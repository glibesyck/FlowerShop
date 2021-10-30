package deliveries;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    PostDeliveryStrategy delivery = new PostDeliveryStrategy();

    @Test
    void deliver() {
        assertEquals(delivery.deliver(new ArrayList<>()), true);
    }
}