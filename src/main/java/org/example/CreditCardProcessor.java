package org.example;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount, String transactionId) {
        System.out.println("Processing Credit Card payment of $" + amount + " for transaction " + transactionId);
    }
}
