package FlowerStore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower extends Item {
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

    @Override
    public String getDescription() {
        return Arrays.toString(color) + " " + type.toString().toLowerCase() +
                " with " + sepalLength + " sepal length";
    }
}
