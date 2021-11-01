package flowerstore;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        int[] color = {0,0,0};
        flower = new Flower();
        flower.SetColor(new int[]{0,0,0});
        System.out.println(Arrays.toString(flower.getColor()));
        flower.setPrice(10.0);
        flower.setSepalLength(5.0);
    }

    @Test
    void getColor() {
        assertEquals("[0, 0, 0]",Arrays.toString((flower.getColor())));
    }

    @Test
    void getPrice() {
        assertEquals(10.0, flower.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(5.0, flower.getSepalLength());
    }

}