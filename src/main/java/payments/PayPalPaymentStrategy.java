package payments;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("You paid this amount " + price + "by PayPal!");
        return true;
    }
}
