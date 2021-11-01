package flowerstore;
import lombok.Data;
import java.util.Arrays;

import static flowerstore.FlowerType.ROMASHKA;


@Data
public class RomashkaFlower extends Flower{
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowerType = ROMASHKA;

    public RomashkaFlower(){};

    public void SetColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    public double getPrice(){
        return this.price;
    }
}
