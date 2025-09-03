package org.example;

public class PayPalProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount, String transactionId) {
        System.out.println("Processing PayPal payment of $" + amount + " for transaction " + transactionId);
    }
}
