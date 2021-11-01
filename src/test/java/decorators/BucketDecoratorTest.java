package decorators;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BucketDecoratorTest {

    private Flower flower;
    private Item bucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setPrice(10.0);
        ((FlowerBucket) bucket).addFlower((Flower) flower);
        bucket = new BucketDecorator(bucket);

    }

    @Test
    void getPrice() {
        assertEquals(14.0,bucket.getPrice());
    }
}