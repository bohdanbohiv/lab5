package Payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Pay " + price + " with PayPal");
    }
}
