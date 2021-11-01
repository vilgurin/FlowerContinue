package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalCardPaymentStrategyTest {

    CreditCardPaymentStrategy card = new CreditCardPaymentStrategy();

    @BeforeEach
    void setUp() {
    }

    @Test
    void pay() {
        assertEquals(100.0,card.pay(100.0));
    }
}