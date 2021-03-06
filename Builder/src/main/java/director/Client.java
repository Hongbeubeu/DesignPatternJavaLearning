package director;

import concretebuilder.FastFoodOrderBuilder;
import product.order.Order;
import product.type.BreadType;
import product.type.OrderType;
import product.type.SauceType;
import product.type.VegetableType;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE)
                .orderBread(BreadType.SIMPLE)
                .orderSauce(SauceType.SOY_SAUCE)
                .orderVegetable(VegetableType.CUCUMBER)
                .build();
        System.out.println(order.toString());
    }
}
