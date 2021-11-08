package Observer;

import Delivery.Delivery;
import FlowerStore.Item;
import Payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers(String status) {
        for (User user: users) {
            user.update(status);
        }
    }

    public void order(List<Item> items, Payment paymentStrategy, Delivery
            deliveryStrategy) {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
        }
        paymentStrategy.pay(price);
        deliveryStrategy.deliver(items);
        notifyUsers(items.toString() + " " + paymentStrategy + " " +
                deliveryStrategy);
    }
}
