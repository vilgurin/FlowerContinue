package order;

import payment.Payment;
import delivery.Delivery;
import flowerstore.Item;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Order {
    List<Item> order_list = new ArrayList<Item>();
    List<User> users = new ArrayList<User>();
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

    public String processOrder() {
        return "The order costs: "+calculateTotalPrice()+".";
    }

    public void addUser(User user){
        this.users.add(user);
    }
    public void removeUser(User user){
        for (int i = 0; i < users.size();i++){
            if (Objects.equals(user,users.get(i))){
                users.remove(i);
            }
        }
    }

    public void notifyUsers(){
        for (int i = 0; i<users.size();i++){
            users.get(i).update(1);
        }
    }

    public void order(){
        processOrder();
        notifyUsers();
    }







}
