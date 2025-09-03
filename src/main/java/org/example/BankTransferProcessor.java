package org.example;

public class BankTransferProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount, String transactionId) {
        System.out.println("Processing Bank Transfer payment of $" + amount + " for transaction " + transactionId);
    }
}
