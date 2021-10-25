package FlowerStore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<>();
    private final static int MAX_SIZE = 100;

    public void addFlowerPack(FlowerPack flowerPack) {
        if (flowerPacks.size() < MAX_SIZE) {
            flowerPacks.add(flowerPack);
        } else {
            System.out.println("No more space");
        }
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
