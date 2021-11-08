package order;

import flowerstore.CactusFlower;
import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order;
    @BeforeEach
    void setUp(){
        order = new Order();
        Flower flower1 = new Flower();
        flower1.setPrice(10.0);
    }


    @Test
    void addItem() {
        Item item1 = new CactusFlower();
        order.addItem(item1);
        assertEquals(1,order.order_list.size());
    }

    @Test
    void removeItem() {
        Item item1 = new CactusFlower();
        order.addItem(item1);
        order.removeItem(item1);
        assertEquals(0,order.order_list.size());
    }

    @Test
    void addUser() {
        User sender = new Sender();
        order.addUser(sender);
        assertEquals(1,order.users.size());


    }

}