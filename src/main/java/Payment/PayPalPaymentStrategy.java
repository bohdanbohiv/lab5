package Payment;

class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Pay with PayPal");
    }
}
