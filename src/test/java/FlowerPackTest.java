import flowers.Flower;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack = new FlowerPack();
    private Flower flower = new Flower(FlowerType.TULIP);

    @BeforeEach
    void setUp() {
        flowerPack.setAmount(5);
        flowerPack.setFlower(flower);
        flower.setPrice(10);
    }

    @Test
    void price() {
        assertEquals(50, flowerPack.price());
    }

    @Test
    void getAmount() {
        assertEquals(5, flowerPack.getAmount());
    }

    @Test
    void getFlower() {
        assertEquals(flower, flowerPack.getFlower());
    }
    @Test
    void getFlowerType() {
        assertEquals(FlowerType.TULIP, flower.getFlowerType());
    }
}