package order;
import java.util.UUID;

public class Sender implements User {
    public String id;

    public Sender(){
        UUID random_id = UUID.randomUUID();

        this.id = random_id.toString();
    }
    @Override
    public void update(int status) {
        if (status == 1 ){
            System.out.println("The order with an id "+this.id+" is ready!");
        }
        else{
            System.out.println("We are preparing the order with an id "+this.id+"!");
        }

    }
}
