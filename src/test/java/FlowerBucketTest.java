import flowers.Flower;
import flowers.FlowerPack;
import flowers.FlowerType;
import items.FlowerBucket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerPack firstFlowerPack = new FlowerPack();
    private FlowerPack secondFlowerPack = new FlowerPack();
    private FlowerPack thirdFlowerPack = new FlowerPack();
    private Flower firstFlower = Flower.flowerWithGivenType(FlowerType.ROSE);
    private Flower secondFlower = Flower.flowerWithGivenType(FlowerType.CHAMOMILE);
    private Flower thirdFlower = Flower.flowerWithGivenType(FlowerType.ROSE);
    private ArrayList<FlowerPack> bucket = new ArrayList<>(Arrays.asList(firstFlowerPack, secondFlowerPack, thirdFlowerPack));
    private FlowerBucket flowerBucket = new FlowerBucket(bucket);
    @BeforeEach
    void setUp() {
        firstFlowerPack.setAmount(5);
        firstFlowerPack.setFlower(firstFlower);
        firstFlower.setPrice(10);
        secondFlowerPack.setAmount(3);
        secondFlowerPack.setFlower(secondFlower);
        secondFlower.setPrice(30);
        thirdFlowerPack.setAmount(7);
        thirdFlowerPack.setFlower(thirdFlower);
        thirdFlower.setPrice(5);
    }

    @Test
    void price() {
        assertEquals(flowerBucket.price(), 175);
    }
}