package items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomashkaFlowerTest {
    RomashkaFlower flower = new RomashkaFlower(15);

    @Test
    void price() {
        assertEquals(15, flower.price());
    }

    @Test
    void getDescription() {
        assertEquals("RomashkaFlower {price=15.0}", flower.getDescription());
    }
}