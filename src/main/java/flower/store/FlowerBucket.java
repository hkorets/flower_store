package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public double price() {
        return packs.stream().mapToDouble(FlowerPack::getPrice).sum();
    }

    public ArrayList<FlowerPack> getPacks() {
        return packs;
    }

    public double getPrice() {
        return price();
    }    
}


