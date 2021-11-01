package delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();

    @BeforeEach
    void setUp() {
        dhl.setDelivered(true);
    }

    @Test
    void delivery() {
        assertEquals(true,dhl.delivery());
    }

    @Test
    void deliverer() {
        assertEquals("The deliverer is DHL",dhl.deliverer());
    }
}