package items;

public class CactusFlower extends Item{
    public CactusFlower(double priceCactus) {
        this.priceCactus = priceCactus;
    }
    private double priceCactus;
    @Override
    public double price() {
        return this.priceCactus;
    }

    @Override
    public String getDescription() {
        String description = "FlowerCactus {price=" + this.price() +"}";
        return description;
    }
}
