// The Pepperoni class is a concrete decorator that extends ToppingDecorator.
class Pepperoni extends ToppingDecorator {

    // Constructor to initialize the Pepperoni decorator with a base pizza.
    Pepperoni(Pizza pizza) {
        super(pizza);
    }

    // Override the cost method to add the cost of pepperoni to the base pizza cost.
    @Override
    public double cost() {
        return pizza.cost() + 1.0; // Adding the cost of pepperoni to the base pizza cost.
    }
}
