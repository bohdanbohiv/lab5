package Delivery;

import FlowerStore.Flower;
import FlowerStore.FlowerPack;
import FlowerStore.FlowerType;
import FlowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DeliveryStrategyTest {
    private List<Item> items;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(30);
        rose.setSepalLength(5);
        rose.setColor(new byte[]{127, 0, 0});

        Flower chamomile = new Flower(FlowerType.CHAMOMILE);
        chamomile.setPrice(10);
        chamomile.setColor(new byte[]{127, 127, 127});
        chamomile.setSepalLength(7.5);
        FlowerPack chamomilePack = new FlowerPack();
        chamomilePack.setFlower(chamomile);
        chamomilePack.setAmount(20);

        items = new ArrayList<>();
        items.add(rose);
        items.add(chamomilePack);
    }

    @Test
    void DHLDDeliver() {
        Delivery delivery = new DHLDeliveryStrategy();
        delivery.deliver(items);
    }

    @Test
    void PostDeliver() {
        Delivery delivery = new PostDeliveryStrategy();
        delivery.deliver(items);
    }
}
