package flowerstore;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static flowerstore.FlowerType.CACTUS;
import static org.junit.jupiter.api.Assertions.*;

class CactusFlowerTest {
    private CactusFlower cactus;
    private Flower flower;

    @BeforeEach
    void setUp() {
        cactus = new CactusFlower();
        int[] color = {0,0,0};
        cactus.SetColor(new int[]{0,0,0});
//        System.out.println(Arrays.toString(flower.getColor()));
        cactus.setPrice(10.0);
        cactus.setSepalLength(5.0);

    }

    @Test
    void getColor() {
        assertEquals("[0, 0, 0]",Arrays.toString((cactus.getColor())));
    }

    @Test
    void getPrice() {
        assertEquals(10.0, cactus.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(5.0, cactus.getSepalLength());
    }

    @Test
    void getFlowerType(){
        assertEquals(CACTUS,cactus.getFlowerType());
    }

}