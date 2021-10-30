package items;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusFlowerTest {
    CactusFlower flower = new CactusFlower(14);

    @BeforeEach
    void setUp() {
    }

    @Test
    void price() {
        assertEquals(flower.price(), 14);
    }

    @Test
    void getDescription() {
        assertEquals(flower.getDescription(), "FlowerCactus {price=14.0}");
    }
}