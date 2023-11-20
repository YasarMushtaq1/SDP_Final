// The Mushroom class is a concrete decorator that extends ToppingDecorator.
class Mushroom extends ToppingDecorator {

    // Constructor to initialize the Mushroom decorator with a base pizza.
    Mushroom(Pizza pizza) {
        super(pizza);
    }

    // Override the cost method to add the cost of mushrooms to the base pizza cost.
    @Override
    public double cost() {
        return pizza.cost() + 0.8; // Adding the cost of mushrooms to the base pizza cost.
    }
}
