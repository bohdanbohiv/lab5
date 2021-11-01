package Delivery;

import FlowerStore.Item;

import java.util.List;

class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("The items will be delivered by post");
    }
}
