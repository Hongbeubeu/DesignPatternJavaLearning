package singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void PrintClass() {
        System.out.println("This is Bill Pugh Singleton");
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
