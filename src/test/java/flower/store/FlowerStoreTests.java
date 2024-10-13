package flower.store;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FlowerStoreTests {

    // Test Flower class
    @Test
    public void testFlowerCreation() {
        Flower flower = new Flower();
        flower.setSepalLength(5.0);
        flower.setPrice(12.5);
        flower.setColor(FlowerColor.RED);
        flower.setFlowerType(FlowerType.ROSE);

        assertEquals(5.0, flower.getSepalLength(), "Sepal length should be 5.0");
        assertEquals(12.5, flower.getPrice(), "Price should be 12.5");
        assertEquals("#FF0000", flower.getColor(), "Color should be red (#FF0000)");
        assertEquals(FlowerType.ROSE, flower.getFlowerType(), "Flower type should be ROSE");
    }

    // Test FlowerPack class
    @Test
    public void testFlowerPackCreation() {
        Flower flower = new Flower();
        flower.setPrice(10.0);
        FlowerPack pack = new FlowerPack(flower, 5);

        assertEquals(10.0, pack.getFlower().getPrice(), "Flower price should be 10.0");
        assertEquals(5, pack.getQuantity(), "Pack quantity should be 5");
        assertEquals(50.0, pack.getPrice(), "Pack price should be 50.0");
    }

    // Test FlowerBucket class
    @Test
    public void testFlowerBucket() {
        Flower flower1 = new Flower();
        flower1.setPrice(15.0);
        FlowerPack pack1 = new FlowerPack(flower1, 2);

        Flower flower2 = new Flower();
        flower2.setPrice(10.0);
        FlowerPack pack2 = new FlowerPack(flower2, 3);

        FlowerBucket bucket = new FlowerBucket();
        bucket.add(pack1);
        bucket.add(pack2);

        assertEquals(60.0, bucket.getPrice(), "Bucket price should be 60.0 (15 * 2 + 10 * 3)");
        assertEquals(2, bucket.getPacks().size(), "Bucket should contain 2 packs");
    }
}
