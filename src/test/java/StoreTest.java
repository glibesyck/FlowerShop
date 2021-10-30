import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower firstFlower = new Flower(FlowerType.ROSE, Color.BLACK, 10, 10);
    private Flower secondFlower = new Flower(FlowerType.ROSE, Color.BLACK, 10, 10);
    private Flower thirdFlower = Flower.flowerWithGivenType(FlowerType.TULIP);
    private Flower fourthFlower = Flower.flowerWithGivenType(FlowerType.CHAMOMILE);
    private Store store = new Store();
    @BeforeEach
    void setUp() {
        store.addFlower(firstFlower);
        store.addFlower(thirdFlower);
        store.addFlower(fourthFlower);
    }
    @Test
    void search() {
        assertEquals(store.search(secondFlower).get(0), firstFlower);
    }
}