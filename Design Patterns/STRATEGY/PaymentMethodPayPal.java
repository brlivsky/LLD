package Strategy;
public class PaymentMethodPayPal implements PaymentMethod {
    @Override
    public void processPayment(Integer amount) {
        System.out.println("Payment using PayPal done for amount " + amount);
    }
}
