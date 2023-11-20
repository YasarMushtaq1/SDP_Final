// The OrderCompletionNotifier class implements OrderObserver to act as an observer.
class OrderCompletionNotifier implements OrderObserver {

    // Override the update method to provide the notification when the pizza order is complete.
    @Override
    public void update() {
        System.out.println("Your pizza order is complete! Enjoy your meal!");
    }
}
