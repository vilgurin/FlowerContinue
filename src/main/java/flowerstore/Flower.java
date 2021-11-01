package flowerstore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowerType;

    public Flower() {
        ;
    }

    public void SetColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType){
        this.flowerType = flowerType;
    }

    public static void main(String[] args) {
        System.out.println(12);
    }
}
