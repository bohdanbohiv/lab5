package Payment;

class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Pay with credit card");
    }
}
