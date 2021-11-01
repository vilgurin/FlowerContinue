package payment;
import lombok.Data;

@Data
public class CreditCardPaymentStrategy implements payment.Payment {
    public String payment_type;

    @Override
    public double pay(double price) {
        return price;
    }
}
