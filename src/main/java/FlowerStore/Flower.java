package FlowerStore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {
    private FlowerType type;
    private double price;
    private double sepalLength;
    private byte[] color;  // rgb

    public Flower(FlowerType type) {
        this.type = type;
    }

    public void setColor(byte[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }
}
