package QuickOrder;

import Decorators.PaperDecorator;
import Decorators.RibbonDecorator;
import Delivery.DHLDeliveryStrategy;
import FlowerStore.*;
import Observer.Order;
import Payment.CreditCardPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public enum FastOrderConstructor {
    ROSE_BUCKET;

    public static Order createOrder(FastOrderConstructor quickOrder) {
        Order order = new Order();
        List<Item> items = new ArrayList<>();
        if (quickOrder == ROSE_BUCKET) {
            Flower rose = new Flower(FlowerType.ROSE);
            rose.setColor(new byte[]{127, 0, 0});
            rose.setPrice(30.5);
            rose.setSepalLength(5.3);

            FlowerPack rosePack = new FlowerPack();
            rosePack.setFlower(rose);
            rosePack.setAmount(20);

            FlowerBucket roseBucket = new FlowerBucket();
            roseBucket.addFlowerPack(rosePack);

            Item item = new RibbonDecorator(roseBucket);
            item = new PaperDecorator(item);
            items.add(item);
        }
        order.order(items, new CreditCardPaymentStrategy(), new DHLDeliveryStrategy());
        return order;
    }
}
