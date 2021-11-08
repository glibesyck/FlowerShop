package users;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender sender = new Sender();
    Sender secondSender = new Sender();

    @Test
    void ID() {
        assertEquals(sender.getID(), 0);
        assertEquals(secondSender.getID(), 1);
    }
}