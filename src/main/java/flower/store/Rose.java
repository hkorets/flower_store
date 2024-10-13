package flower.store;

public class Rose extends Flower {
    public Rose () {
        this.setSepalLength(0);
        this.setColor(FlowerColor.BLUE);
        this.setPrice(0);
        this.setFlowerType(FlowerType.ROSE);
    }

    public Rose(double sepalLength, FlowerColor color, double price) {
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setPrice(price);
        this.setFlowerType(FlowerType.ROSE);
    }
}
