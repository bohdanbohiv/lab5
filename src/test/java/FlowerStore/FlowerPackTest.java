package FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flowerPack = new FlowerPack();
        flowerPack.setFlower(flower);
        flowerPack.setAmount(10);
    }

    @Test
    void getPrice() {
        assertEquals(100, flowerPack.getPrice());
    }
}
