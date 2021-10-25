package FlowerStore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        byte[] color = new byte[]{0, 0, 127};
        flower.setColor(color);
        color[0] = 127;
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getType());
    }

    @org.junit.jupiter.api.Test
    void getFlowerColor() {
        assertArrayEquals(new byte[]{0, 0, 127}, flower.getColor());
    }

}
