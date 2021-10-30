package payments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    CreditCardPaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertEquals(true, creditCardPayment.pay(20));
    }
}