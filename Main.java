import java.util.Scanner;

// Adapter Pattern

// 1. External Payment System
class ExternalPaymentSystem {
    // Some methods specific to the external payment system
    void processPaymentExternal() {
        // External payment processing logic
    }
}

// 2. Common Payment Interface
interface Payment {
    void processPayment();
}

// 3. Adapter class
class PaymentAdapter implements Payment {
    private ExternalPaymentSystem externalPaymentSystem;

    PaymentAdapter(ExternalPaymentSystem externalPaymentSystem) {
        this.externalPaymentSystem = externalPaymentSystem;
    }

    @Override
    public void processPayment() {
        // Adapt the external payment system's method to the common interface
        externalPaymentSystem.processPaymentExternal();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaFactory factory = new PizzaFactory();

        // Suppose you want to introduce an external payment system
        ExternalPaymentSystem externalPaymentSystem = new ExternalPaymentSystem();

        // Use the PaymentAdapter to adapt the external payment system to the common interface
        Payment paymentAdapter = new PaymentAdapter(externalPaymentSystem);

        // Process payment using the common interface
        paymentAdapter.processPayment();

        // Suppose you want to introduce different payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy payPalPayment = new PayPalPayment();

        // Use the selected payment strategy
        creditCardPayment.processPayment(); // Example: Process payment using Credit Card
        // or
        payPalPayment.processPayment(); // Example: Process payment using PayPal

        System.out.println("--------------Welcome to our Pizza King Store!--------------");

        System.out.println("-------------------Available pizza sizes:-------------------");
        System.out.println("1. Small, 2. Medium, 3. Large");
        System.out.print("Choose your pizza size: ");
        String pizzaSize = scanner.nextLine();

        Pizza pizza = factory.createPizza(pizzaSize);

        System.out.println("--------------------Available toppings:---------------------");
        System.out.println("1.Cheese, 2.Pepperoni, 3.Mushroom, 4.Olives");
        boolean ordering = true;
        while (ordering) {
            System.out.println("Current cost: " + pizza.cost());
            System.out.println("Do you want to add topping or not?  ");
            System.out.println("If (Yes) choose the options!");
            System.out.println("If (No),------- Type! 'N/n' ");

            String topping = scanner.nextLine().trim();

            switch (topping.toLowerCase()) {
                case "1":
                    pizza = new Cheese(pizza);
                    break;
                case "2":
                    pizza = new Pepperoni(pizza);
                    break;
                case "3":
                    pizza = new Mushroom(pizza);
                    break;
                case "4":
                    pizza = new Olives(pizza);
                    break;
                case "n":
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid topping. Please try again.");
                    break;
            }
        }
        System.out.println("--------------------Your bill is Here:---------------------");
        System.out.println("--------------------Total Cost: " + pizza.cost() + "$" + "-----------------------");
    }
}
