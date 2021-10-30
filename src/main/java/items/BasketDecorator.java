package items;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }
    @Override
    public double price() {
        return 4 + super.price();
    }
}
