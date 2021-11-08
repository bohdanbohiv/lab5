package Observer;

import Delivery.DHLDeliveryStrategy;
import FlowerStore.Flower;
import FlowerStore.FlowerPack;
import FlowerStore.FlowerType;
import FlowerStore.Item;
import Payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order();
        User sender = new Sender();
        order.addUser(sender);
        User receiver = new Receiver();
        order.addUser(receiver);
    }

    @Test
    void addRemoveUser() {
        order.notifyUsers("before adding new user");
        User receiver = new Receiver();
        order.addUser(receiver);
        order.notifyUsers("after adding new user");
        order.removeUser(receiver);
        order.notifyUsers("after removing user");
        System.out.println();
    }

    @Test
    void notifyUsers() {
        order.notifyUsers("test notifyUsers");
        System.out.println();
    }

    @Test
    void order() {
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

        List<Item> items = new ArrayList<>();
        items.add(rose);
        items.add(chamomilePack);

        order.order(items, new PayPalPaymentStrategy(), new DHLDeliveryStrategy());
    }
}