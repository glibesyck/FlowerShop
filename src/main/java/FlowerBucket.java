import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> bucket = new ArrayList<>();
    public double price() {
        double result = 0;
        for (int i = 0; i < bucket.size(); i ++) {
            result = result + bucket.get(i).price();
        }
        return result;
    }
    public FlowerBucket(List<FlowerPack> bucket) {
        this.bucket = bucket;
    }
}
