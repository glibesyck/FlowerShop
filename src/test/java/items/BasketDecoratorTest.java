package items;

import flowers.Flower;
import flowers.FlowerPack;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Flower flower = Flower.flowerWithGivenType(FlowerType.CHAMOMILE);
    FlowerPack flowerPack = new FlowerPack(1, flower);
    List<FlowerPack> flowerPackList = new ArrayList<>(Arrays.asList(flowerPack));
    double oldPrice = flower.getPrice();
    Item item = new FlowerBucket(flowerPackList);
    @BeforeEach
    void setUp() {
        item = new BasketDecorator(item);
    }

    @Test
    void price() {
        assertEquals(oldPrice + 4, item.price());
    }
}