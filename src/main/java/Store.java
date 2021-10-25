import flowers.Flower;

import java.util.LinkedList;
import java.util.List;

public class Store {
    private List<Flower> flowers;
    public Store(List<Flower> flowers) {
        this.flowers = flowers;
    }
    public Store() {
        flowers = new LinkedList<>();
    }
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
    public List search(Flower flower) {
        List<Flower> matchingFlowers = new LinkedList<>();
        for (Flower possibleFlower: flowers) {
            if (possibleFlower.getFlowerType() != flower.getFlowerType()) {
                continue;
            }
            if (possibleFlower.getPrice() != flower.getPrice()) {
                continue;
            }
            if (possibleFlower.getColor() != flower.getColor()) {
                continue;
            }
            if (possibleFlower.getSepalLength() != flower.getSepalLength()) {
                continue;
            }
            matchingFlowers.add(possibleFlower);

        }
        return matchingFlowers;
    }
}
