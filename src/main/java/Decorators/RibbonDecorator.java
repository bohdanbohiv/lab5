package Decorators;

import FlowerStore.Item;

public class RibbonDecorator extends ItemDecorator {
    Item item;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with ribbon";
    }
}
