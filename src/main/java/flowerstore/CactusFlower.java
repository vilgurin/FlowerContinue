package flowerstore;
import lombok.Data;
import java.util.Arrays;

import static flowerstore.FlowerType.CACTUS;


@Data
public class CactusFlower extends Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowerType = CACTUS;

    public CactusFlower(){};

    public void SetColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }


    public double getPrice(){
        return this.price;
    }

    public static void main(String[] args) {
        CactusFlower cactus = new CactusFlower();

        System.out.println(cactus.getFlowerType());
    }
}
