package FlowerStore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;
    private final static int MAX_SIZE = 1000;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public void setAmount(int amount) {
        if (amount <= MAX_SIZE) {
            this.amount = amount;
        } else {
            this.amount = MAX_SIZE;
            System.out.println("No more space!");
        }
    }
}
