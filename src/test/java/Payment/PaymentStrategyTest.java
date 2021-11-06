package Payment;

import org.junit.jupiter.api.Test;

class PaymentStrategyTest {
    @Test
    void creditCardPay() {
        Payment payment = new CreditCardPaymentStrategy();
        payment.pay(73);
    }

    @Test
    void payPalPay() {
        Payment payment = new PayPalPaymentStrategy();
        payment.pay(80);
    }
}