package users;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReceiverTest {
    Receiver firstReceiver = new Receiver();
    Receiver secondReceiver = new Receiver();
    @Test
    void ID() {
        assertEquals(firstReceiver.getID(), 2);
        assertEquals(secondReceiver.getID(), 3);
    }

}