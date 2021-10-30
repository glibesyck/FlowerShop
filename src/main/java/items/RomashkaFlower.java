package items;

public class RomashkaFlower extends Item{
    public RomashkaFlower(double priceRoamshka) {
        this.priceRomashka = priceRoamshka;
    }
    private double priceRomashka;
    @Override
    public double price() {
        return this.priceRomashka;
    }
    @Override
    public String getDescription() {
        String description = "RomashkaFlower {price=" + this.price() + "}";
        return description;
    }
}

