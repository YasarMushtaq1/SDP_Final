// The PaymentStrategy interface defines a common method for payment processing strategies.
interface PaymentStrategy {
    void processPayment();
}

// The CreditCardPayment class is a concrete implementation of the PaymentStrategy interface.
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        // Credit card payment logic
        System.out.println("Processing payment using Credit Card.");
    }
}

// The PayPalPayment class is a concrete implementation of the PaymentStrategy interface.
class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        // PayPal payment logic
        System.out.println("Processing payment using PayPal.");
    }
}
