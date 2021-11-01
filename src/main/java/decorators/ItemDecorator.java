package decorators;

import flowerstore.Item;

public class ItemDecorator implements Item{
    protected Item item;

    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public String getDescription(){
        return item.getDescription();
    }

    @Override
    public double getPrice(){
        return item.getPrice();
    }

}