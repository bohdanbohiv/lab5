package Decorators;

import FlowerStore.Item;

public class PaperDecorator extends ItemDecorator {
    Item item;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "wrapped in paper";
    }
}
