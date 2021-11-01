package FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        byte[] color = new byte[]{0, 0, 127};
        flower.setColor(color);
        color[0] = 127;
    }

    @Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getType());
    }

    @Test
    void getFlowerColor() {
        assertArrayEquals(new byte[]{0, 0, 127}, flower.getColor());
    }

}
