# Factory Method

Here's a coding challenge to assess your understanding of API design using the Factory Method Pattern in Java. 
This pattern is ideal for scenarios where you need to create objects without tightly coupling the client code 
to specific implementations, allowing for extensibility (e.g., adding new subclasses without modifying existing code).


### Challenge: Payment Processor Factory for a E-Commerce System

**Problem Statement**:  
You are tasked with designing an API for an e-commerce payment system that supports multiple payment methods, such as Credit Card, PayPal, and Bank Transfer. The system should be extensible to add new payment methods in the future without changing the core client code.

Use the Factory Method Pattern to achieve this. Specifically:
- Define an abstract `PaymentProcessor` interface with a method `processPayment(double amount, String transactionId)`.
- Create concrete implementations for at least three payment methods (e.g., `CreditCardProcessor`, `PayPalProcessor`, `BankTransferProcessor`). Each should simulate processing by printing a message like "Processing [method] payment of $[amount] for transaction [transactionId]".
- Define an abstract `PaymentFactory` class with a factory method `createProcessor()` that returns a `PaymentProcessor`.
- Provide concrete factory subclasses for each payment method (e.g., `CreditCardFactory`, `PayPalFactory`, etc.), each overriding `createProcessor()` to return the appropriate concrete processor.
- In a `Main` class, demonstrate usage by creating factories dynamically (e.g., based on a string input like "credit" or "paypal") and processing sample payments. Ensure the client code doesn't directly instantiate processors—instead, it relies on the factories.

**Requirements**:
- The design must follow the Factory Method Pattern strictly (subclasses decide the instantiation).
- Handle an invalid payment type gracefully (e.g., throw an exception).
- Keep the code clean, with proper encapsulation and adherence to SOLID principles (focus on Open-Closed Principle).
- Bonus: Make the system configurable via a method that selects the factory based on user input or configuration.

**Expected Output Example**:  
For input "credit" with amount 100.0 and transactionId "TX123":  
"Processing Credit Card payment of $100.0 for transaction TX123"

Implement this in Java. You have 45 minutes. Feel free to ask clarifying questions. Once done, explain how your design promotes extensibility and why Factory Method is preferable over a simple switch statement here.