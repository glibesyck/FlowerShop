package payments;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("You paid this amount " + price + " by credit card!");
        return true;
    }
}
