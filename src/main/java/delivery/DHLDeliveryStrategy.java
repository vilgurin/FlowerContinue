package delivery;
import lombok.Data;

@Data
public class DHLDeliveryStrategy implements Delivery{
    public boolean delivered;
    public String delivery_type;

    @Override
    public boolean delivery() {
        return this.delivered;
    }

    public String deliverer(){
        return "The deliverer is DHL";
    }
}