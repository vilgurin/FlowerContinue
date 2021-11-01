package payment;

public class PayPalPaymentStrategy implements payment.Payment {

    public String payment_type;

    @Override
    public double pay(double price) {
        return price;
    }
}
