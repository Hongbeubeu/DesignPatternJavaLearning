package singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }

    public void PrintClass() {
        System.out.println("This is Eagle Initialized Singleton");
    }
}
