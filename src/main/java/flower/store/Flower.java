package flower.store;

public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public void setColor(FlowerColor color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setSepalLength(double len) {
        this.sepalLength = len;
    }
    public double getSepalLength(){
        return this.sepalLength;
    }
    public void setFlowerType(FlowerType type){
        this.flowerType = type;
    }
    public FlowerType getFlowerType(){
        return this.flowerType;
    }
}