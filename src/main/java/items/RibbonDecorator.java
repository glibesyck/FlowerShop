package items;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }
    @Override
    public double price() {
        return 40 + super.price();
    }
}
