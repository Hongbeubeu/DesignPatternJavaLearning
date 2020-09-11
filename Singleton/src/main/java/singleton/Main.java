package singleton;

public class Main {
    public static void main(String[] args){
        EagerInitializedSingleton.getInstance().PrintClass();
        StaticBlockSingleton.getInstance().PrintClass();
        LazyInitializedSingleton.getInstance().PrintClass();
        ThreadSafeLazyInitializedSingleton.getInstance().PrintClass();
        BillPughSingleton.getInstance().PrintClass();
        DoubleCheckLockingSingleton.getInstance().PrintClass();
    }
}
