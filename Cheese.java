// The Cheese class is a concrete decorator that extends ToppingDecorator.
class Cheese extends ToppingDecorator {

    // Constructor to initialize the Cheese decorator with a base pizza.
    Cheese(Pizza pizza) {
        super(pizza);
    }

    // Override the cost method to add the cost of cheese to the base pizza cost.
    @Override
    public double cost() {
        return pizza.cost() + 0.5; // Adding the cost of cheese to the base pizza cost.
    }
}
