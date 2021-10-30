package flowers;

import flowers.Flower;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class FlowerPack {
    public FlowerPack(int amount, Flower flower) {
        this.amount = amount;
        this.flower = flower;
    }
    public FlowerPack() {}
    protected int amount;
    protected Flower flower;
    public double price() {
        return flower.getPrice()*amount;
    };
}
