package STRATEGY;
/*
You are developing a Payment Processing System that supports multiple payment methods (e.g., Credit Card, UPI, Net Banking, Wallet). Each payment method has a different way of processing payments.
You need to design a flexible system that allows the addition of new payment methods without modifying existing code.

Implementation of STRATEGY pattern
*/

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.setPaymentMethod(new PaymentMethodCreditCard());

        paymentProcessor.executePayment(1000); // Example amount

        paymentProcessor.setPaymentMethod(new PaymentMethodPayPal());

        paymentProcessor.executePayment(500); // Example amount

    }
}
