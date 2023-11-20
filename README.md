# Software Design patterns 
A Pizza ordering application with usage of 6 Software design patterns. [ Adapter, Strategy, Observer, Singleton, Factory, Decorator] .

# A brief documentation of the patterns used in this project.
In the provided project, the following design patterns are used:


1. The Adapter pattern is implemented for integrating an external payment system (ExternalPaymentSystem) with the existing payment interface (Payment). The PaymentAdapter class acts as an adapter, allowing the external payment system to be used through the common Payment interface.
Observer Pattern:

2. The Observer pattern is used for handling the notification of order completion. The OrderObserver interface defines the contract for observers, and the OrderCompletionNotifier class serves as a concrete observer. The BasicPizza and ToppingDecorator classes also play a role in this pattern by allowing observers to register and be notified of changes in the pizza order.
Factory Pattern:

3. The Factory pattern is implemented in the PizzaFactory class. It is responsible for creating instances of Pizza based on the input type (small, medium, large) and registers an OrderCompletionNotifier as an observer for each pizza created.
Decorator Pattern:

4. The Decorator pattern is used for adding toppings to the basic pizza. The ToppingDecorator class is an abstract decorator that extends the Pizza interface, and concrete decorators (Cheese, Mushroom, Olives, Pepperoni) add specific behavior (cost) to the pizza.

5. The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. In the modified code, a Singleton class is introduced with a private constructor and a static method getInstance() that returns the single instance of the class.

6. The Strategy pattern defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. In the modified code, a PaymentStrategy interface is introduced, and two concrete implementations (CreditCardPayment and PayPalPayment) represent different payment strategies.

# From
Projects for the university.

# Main action

![21](https://github.com/YasarMushtaq1/SDP_Final/assets/124120950/ac2e3444-ada7-4e29-aae8-e5de99299dbb)





