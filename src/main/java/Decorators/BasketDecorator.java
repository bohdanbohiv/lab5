package Decorators;

import FlowerStore.Item;

public class BasketDecorator extends ItemDecorator {
    Item item;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "in basket";
    }
}
