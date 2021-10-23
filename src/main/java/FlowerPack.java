import flowers.Flower;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class FlowerPack {
    protected int amount;
    protected Flower flower;
    public double price() {
        return flower.getPrice()*amount;
    };
}
