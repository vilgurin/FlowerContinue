package decorators;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    private Flower flower;
    private Item bucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setPrice(10.0);
        ((FlowerBucket) bucket).addFlower((Flower) flower);
        bucket = new RibbonDecorator(bucket);

    }

    @Test
    void getPrice() {
        assertEquals(50.0,bucket.getPrice());
    }
}