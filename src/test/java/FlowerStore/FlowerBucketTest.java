package FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        Flower chamomile = new Flower(FlowerType.CHAMOMILE);
        chamomile.setPrice(10);
        FlowerPack chamomileFlowerPack = new FlowerPack();
        chamomileFlowerPack.setFlower(chamomile);
        chamomileFlowerPack.setAmount(10);

        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(15);
        FlowerPack roseFlowerPack = new FlowerPack();
        roseFlowerPack.setFlower(rose);
        roseFlowerPack.setAmount(5);

        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(chamomileFlowerPack);
        flowerBucket.addFlowerPack(roseFlowerPack);
    }

    @Test
    void getPrice() {
        assertEquals(175, flowerBucket.getPrice());
    }
}