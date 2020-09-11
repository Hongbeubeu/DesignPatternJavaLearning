package singleton;

public class ThreadSafeLazyInitializedSingleton {
    private static volatile ThreadSafeLazyInitializedSingleton INSTANCE;

    private ThreadSafeLazyInitializedSingleton() {
    }

    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeLazyInitializedSingleton();
        }
        return INSTANCE;
    }

    public void PrintClass() {
        System.out.println("This is Thread Safe Lazy Initialized Singleton");
    }
}
