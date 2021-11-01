package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket implements Item {
    List<Flower> flowers = new ArrayList<Flower>();

    public void addFlower(Flower flower){
        flowers.add(flower);
    }
    @Override
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowers.size(); i++) {
            price += flowers.get(i).getPrice();
        }
        return price;
    }
    @Override
    public String getDescription(){
        return this.toString();
    }

    public List<Flower> searchFlower(Flower searched){
        List<Flower> searched_flowers_list = new ArrayList<Flower>();
        for (int i = 0; i<flowers.size();i++){
            if (searched.getFlowerType() == flowers.get(i).getFlowerType()){
                searched_flowers_list.add(flowers.get(i));
            }
        }
        return searched_flowers_list;
    }

    public int getSize(){
        return flowers.size();
    }
}


