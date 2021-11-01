package delivery;

import flowerstore.Flower;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;


import static flowerstore.FlowerType.ROSE;
import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    private PostDeliveryStrategy post = new PostDeliveryStrategy();


    @BeforeEach
    void setUp() {
        post.setDelivered(true);

    }

    @Test
    void delivery() {
        assertEquals(true,post.delivery());
    }

    @Test
    void deliverer() {
        assertEquals("The deliverer is PostDelivery",post.deliverer());
    }
}