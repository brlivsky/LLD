package Strategy;
public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor() {}
    
    // Set the Strategy dynamically
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Delegate the payment processing
    public void executePayment(Integer amount) {
        if (paymentMethod == null) {
            throw new IllegalStateException("Payment method not set!");
        }
        paymentMethod.processPayment(amount);
    }
}