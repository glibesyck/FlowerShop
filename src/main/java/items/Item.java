package items;

public abstract class Item {
    public String description;
    public String getDescription() {
        return this.description;
    }
    public abstract double price();
}
