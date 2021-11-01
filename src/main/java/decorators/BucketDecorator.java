package decorators;
import flowerstore.Item;
import lombok.ToString;

@ToString
public class BucketDecorator extends ItemDecorator {

    public BucketDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice(){
        return 4 + this.item.getPrice();
    }
    @Override
    public String getDescription(){
        return item.getDescription();

    }


}