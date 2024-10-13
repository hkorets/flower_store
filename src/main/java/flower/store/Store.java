package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> buckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public List<FlowerBucket> search(FlowerType type, FlowerColor color) {
        List<FlowerBucket> result = new ArrayList<>();
        
        for (FlowerBucket bucket : buckets) {
            for (FlowerPack pack : bucket.getPacks()) {
                if (pack.getFlower().getFlowerType() == type && pack.getFlower().getColor().equals(color.toString())) {
                    result.add(bucket);
                    break;
                }
            }
        }

        return result;
    }
}
