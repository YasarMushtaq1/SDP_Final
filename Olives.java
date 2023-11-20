// The Olives class is a concrete decorator that extends ToppingDecorator.
class Olives extends ToppingDecorator {

    // Constructor to initialize the Olives decorator with a base pizza.
    Olives(Pizza pizza) {
        super(pizza);
    }

    // Override the cost method to add the cost of olives to the base pizza cost.
    @Override
    public double cost() {
        return pizza.cost() + 0.7; // Adding the cost of olives to the base pizza cost.
    }
}
