package STRATEGY;
public class PaymentMethodCreditCard implements PaymentMethod {
    // @Override
    public void processPayment(Integer amount) {
        System.out.println("Payment using credit card done for amount " + amount);
    }
}