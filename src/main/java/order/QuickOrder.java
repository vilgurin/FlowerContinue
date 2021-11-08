package order;
import flowerstore.Item;

import java.util.ArrayList;
import java.util.List;

public class QuickOrder extends Order {
    private List<Item> order_list = new ArrayList<Item>();
    private List<User> users = new ArrayList<User>();

    private QuickOrder(List<Item> items_to_order, User user){
        this.order_list = items_to_order;
        addUser(user);
        order();
    }

    public QuickOrder createQuickOrder(List<Item> items_to_order, User user){
        return new QuickOrder(items_to_order, user);
    }

}
