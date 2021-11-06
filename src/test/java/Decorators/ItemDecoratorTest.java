package Decorators;

import FlowerStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
    Item roseItem;
    Item chamomileItem;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(30);
        rose.setSepalLength(5);
        rose.setColor(new byte[]{127, 0, 0});
        roseItem = rose;
        roseItem = new RibbonDecorator(roseItem);
        roseItem = new PaperDecorator(roseItem);

        Flower chamomile = new Flower(FlowerType.CHAMOMILE);
        chamomile.setPrice(10);
        chamomile.setColor(new byte[]{127, 127, 127});
        chamomile.setSepalLength(7.5);
        FlowerPack chamomilePack = new FlowerPack();
        chamomilePack.setFlower(chamomile);
        chamomilePack.setAmount(20);
        chamomileItem = chamomilePack;
        chamomileItem = new BasketDecorator(chamomileItem);
    }

    @Test
    void getPrice() {
        assertEquals(83, roseItem.getPrice());
        assertEquals(204, chamomileItem.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("[127, 0, 0] rose with 5.0 sepal length with " +
                "ribbon wrapped in paper", roseItem.getDescription());
        assertEquals("Flower pack of 20 chamomiles in basket",
                chamomileItem.getDescription());
    }
}
