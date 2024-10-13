package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.setPrice(10);
    
        FlowerPack pack = new FlowerPack(flower, 5);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(pack);
    
        // This should print 50 (10 * 5)
        System.out.println("Bucket price: " + bucket.getPrice());
    }
}

