package org.example;

public abstract class PaymentFactory {
    public abstract PaymentProcessor createProcessor(String paymentType);
}
