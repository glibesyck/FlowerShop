package flowers;

import java.util.Random;

public enum FlowerType {
    ROSE, TULIP, CHAMOMILE;
    public static FlowerType getRandom() {
        return FlowerType.values()[new Random().nextInt(FlowerType.values().length)];
    }
}
