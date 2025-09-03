package org.example;

public class ConcretePaymentFactory extends PaymentFactory{

    @Override
    public PaymentProcessor createProcessor(String paymentType) {
        return switch (paymentType) {
            case "credit" -> new CreditCardProcessor();
            case "paypal" -> new PayPalProcessor();
            case "bank" -> new BankTransferProcessor();
            default -> throw new IllegalArgumentException("Unknown payment type");
        };
    }
}
