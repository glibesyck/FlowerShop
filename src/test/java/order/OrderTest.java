package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;
import users.User;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order = new Order();
    Receiver user = new Receiver();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void addUser() {
        order.addUser(user);
        assertEquals(order.users.size(), 1);
    }

    @Test
    void removeUser() {
        order.removeUser(user);
        assertEquals(order.users.size(), 0);
    }

    @Test
    void notifyUsers() {
        order.addUser(user);
        order.notifyUsers();
        assertEquals(outputStreamCaptor.toString().trim(), "Status: There is update for you!");
    }

    @Test
    void order() {
        order.addUser(user);
        order.order();
        assertEquals(outputStreamCaptor.toString().trim(), "Status: There is update for you!");
    }
}