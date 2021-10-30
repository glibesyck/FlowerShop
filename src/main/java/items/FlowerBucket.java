package items;

import flowers.FlowerPack;

import java.util.List;

public class FlowerBucket extends Item{
    public FlowerBucket(List<FlowerPack> bucket) {
        this.bucket = bucket;
    }
    private List<FlowerPack> bucket;
    @Override
    public double price() {
        double result = 0;
        for (int i = 0; i < bucket.size(); i++) {
            result = result + bucket.get(i).price();
        }
        return result;
    }
    @Override
    public String getDescription() {
        String description = "FlowerBucket {price=" + this.price() + "}";
        return description;
    }
}
