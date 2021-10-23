package flowers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlowerTest {
    private Flower flower = new Flower();
    @BeforeEach
    void setUp() {
        flower.setColor(Color.RED);
        flower.setPrice(5);
    }
    @Test
    void getPrice() {
        assertEquals(flower.getPrice(), 5);
    }

    @Test
    void getColor() {
        assertEquals(flower.getColor(), Color.RED);
    }
}