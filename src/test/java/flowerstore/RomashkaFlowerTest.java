package flowerstore;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static flowerstore.FlowerType.CACTUS;
import static flowerstore.FlowerType.ROMASHKA;
import static org.junit.jupiter.api.Assertions.*;

class RomashkaFlowerTest {
    private RomashkaFlower romashka;
    private Flower flower;

    @BeforeEach
    void setUp() {
        romashka = new RomashkaFlower();
        int[] color = {0,0,0};
        romashka.SetColor(new int[]{0,0,0});
//        System.out.println(Arrays.toString(flower.getColor()));
        romashka.setPrice(10.0);
        romashka.setSepalLength(5.0);

    }

    @Test
    void getColor() {
        assertEquals("[0, 0, 0]",Arrays.toString((romashka.getColor())));
    }

    @Test
    void getPrice() {
        assertEquals(10.0, romashka.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(5.0, romashka.getSepalLength());
    }

    @Test
    void getFlowerType(){
        assertEquals(ROMASHKA,romashka.getFlowerType());
    }

}