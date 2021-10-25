package flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public static Flower flowerWithGivenType(FlowerType flowerType) {
        return new Flower(flowerType, Color.getRandom(), new Random().nextInt(9) + 1, new Random().nextInt(15) + 5);
    } // static factory method implementation
    public Flower() {};
    public Flower(FlowerType flowerType, Color color, double sepalLength, double price) {
        this.flowerType = flowerType;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }
}
