package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    PaymentFactory paymentFactory = new ConcretePaymentFactory();
    PaymentProcessor creditCardProcessor = paymentFactory.createProcessor("credit");
    creditCardProcessor.processPayment(100, "123456");

    PaymentProcessor payPalProcessor = paymentFactory.createProcessor("paypal");
    payPalProcessor.processPayment(100, "123456");

    PaymentProcessor bankTransferProcessor = paymentFactory.createProcessor("bank");
    bankTransferProcessor.processPayment(100, "123456");

    }
}