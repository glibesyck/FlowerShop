package items;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }
    @Override
    public double price() {
        return 13 + super.price();
    }
}
