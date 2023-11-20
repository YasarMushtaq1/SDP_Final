// The Singleton class demonstrates the Singleton Pattern.
class Singleton {

    // Private static instance variable to hold the single instance of the class.
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class.
    private Singleton() {
        // private constructor to prevent instantiation
    }

    // Public method to provide access to the single instance of the class.
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it does not exist.
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
