import java.util.List;
import java.util.ArrayList;

// The BasicPizza class represents a basic pizza and implements the Pizza interface.
class BasicPizza implements Pizza {

    // Private member variable to store the price of the pizza.
    private double price;

    // List to hold observers that will be notified when the pizza is ordered.
    private List<OrderObserver> observers = new ArrayList<>();

    // Constructor to initialize the price of the basic pizza.
    BasicPizza(double price) {
        this.price = price;
    }

    // Method to calculate and return the cost of the basic pizza.
    public double cost() {
        return price;
    }

    // Implementation of the registerObserver method from the Pizza interface.
    @Override
    public void registerObserver(OrderObserver observer) {
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
