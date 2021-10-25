package FlowerStore;

public class Store {
    public Flower search(double price, byte[] color, FlowerType type, double sepalLength) {
        Flower flower = new Flower(type);
        flower.setColor(color);
        flower.setPrice(price);
        flower.setSepalLength(sepalLength);
        return flower;
    }
}
