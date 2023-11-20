// The Pizza interface defines methods related to pizza and order observation.
interface Pizza {
    double cost(); // Method to calculate and return the cost of the pizza.

    void registerObserver(OrderObserver observer); // Method to register an observer for order completion.

    void notifyObservers(); // Method to notify registered observers when the order is complete.
}

// The PizzaFactory class creates different types of pizzas based on user input.
class PizzaFactory {
    Pizza createPizza(String type) {
        Pizza pizza = null;

        // Creating different types of pizzas based on user input.
        if (type.equalsIgnoreCase("1")) { // Small pizza
            pizza = new BasicPizza(5.0);
        } else if (type.equalsIgnoreCase("2")) { // Medium Pizza
            pizza = new BasicPizza(7.0);
        } else if (type.equalsIgnoreCase("3")) { // Large pizza
            pizza = new BasicPizza(9.0);
        }

        // Creating an OrderCompletionNotifier to be notified when the order is complete.
        OrderCompletionNotifier notifier = new OrderCompletionNotifier();
        pizza.registerObserver(notifier); // Registering the observer with the pizza.

        return pizza;
    }
}
