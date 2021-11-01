package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static flowerstore.FlowerType.ROSE;
import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private FlowerBucket bucket = new FlowerBucket();
    private Flower flower1 = new Flower(FlowerType.CHAMOMILE);
    private Flower flower2 = new Flower(FlowerType.ROSE);

    @BeforeEach
    void setUp() {
        flower1.setPrice(5);
        flower2.setPrice(10);

        bucket.addFlower(flower1);
        bucket.addFlower(flower2);

    }

    @Test
    void getPrice() {
        assertEquals(15,bucket.getPrice());
    }


    @Test
    void searchFlower() {
        assertEquals(5.0,bucket.searchFlower(flower1).get(0).getPrice());
    }

    @Test
    void getSize() {
        assertEquals(2,bucket.getSize());
    }
}