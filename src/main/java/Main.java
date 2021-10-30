import flowers.Color;
import flowers.Flower;
import flowers.FlowerPack;
import flowers.FlowerType;
import items.FlowerBucket;
import items.Item;
import items.PaperDecorator;
import items.RibbonDecorator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlowerPack flowerPack = new FlowerPack(1, new Flower(FlowerType.TULIP, Color.BLACK, 10, 3));
        List<FlowerPack> flowerPackList = new ArrayList<>();
        flowerPackList.add(flowerPack);
        Item item = new FlowerBucket(flowerPackList);
        System.out.println(item.price());
        item = new RibbonDecorator(item);
        item = new PaperDecorator(item);
        System.out.println(item.price());
    }
}
