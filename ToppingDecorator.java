import java.util.ArrayList;
import java.util.List;

// The ToppingDecorator is an abstract class that implements the Pizza interface.
abstract class ToppingDecorator implements Pizza {

    // Protected member variable to hold the base pizza.
    protected Pizza pizza;

    // List to hold observers that will be notified when the order is complete.
    private List<OrderObserver> observers = new ArrayList<>();

    // Constructor to initialize the ToppingDecorator with a base pizza.
    ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    // Implementation of the registerObserver method from the Pizza interface.
    @Override
    public void registerObserver(OrderObserver observer) {
        // Registering the observer with the base pizza.
        pizza.registerObserver(observer);
        // Adding the observer to the list of observers.
        observers.add(observer);
    }

    // Implementation of the notifyObservers method from the Pizza interface.
    @Override
    public void notifyObservers() {
        // Iterating through the list of observers and notifying each one.
        for (OrderObserver observer : observers) {
            observer.update();
        }
    }
}
