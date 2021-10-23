package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
    public Flower() {}
}
