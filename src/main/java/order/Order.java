package order;

import payment.Payment;
import delivery.Delivery;
import flowerstore.Item;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Order {
    List<Item> order_list = new ArrayList<Item>();
    public Payment payment;
    public Delivery delivery;

    public void addItem(Item item) {
        this.order_list.add(item);
    }
    public void removeItem(Item item){
        for (int i = 0; i< order_list.size();i++){
            if (Objects.equals(item,order_list.get(i))){
                order_list.remove(i);
            }
        }
    }

    public Order() {
    }

    ;

    public void setPaymentStrategy(Payment payment_strat) {
        this.payment = payment_strat;
    }

    public void setDeliveryStrategy(Delivery delivery_strat) {
        this.delivery = delivery_strat;
    }

    public double calculateTotalPrice() {
        double items_price = 0;
        for (int i = 0; i < order_list.size(); i++) {
            items_price += order_list.get(i).getPrice();
        }
        return items_price;
    }

    public boolean processOrder(double price) {
        for (int i = 0; i < order_list.size(); i++) {
            if (price == order_list.get(i).getPrice()) {
                order_list.get(i).getDescription();
                return true;
            }
        }
        return false;
    }



}
