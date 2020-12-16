package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item d1 = new Dish("d1", "", 15);
        Item d2 = new Dish("d2", "", 2);
        Item d3 = new Drink("d3", "", 4);
        Item d4 = new Dish("d4", "", 56);
        Item d5 = new Dish("d4", "", 56);
        Item d6 = new Drink("d6", "", 78);
        Item d7 = new Drink("d1", "", 15);


        Order order = new Order();
        order.add(d1);
        order.add(d2);
        order.add(d3);
        order.add(d4);
        order.add(d5);
        order.add(d6);
        order.add(d7);
        System.out.println(order);
        System.out.println(Arrays.toString(order.sortedItemsByCost()));
        order.remove("d6");
        System.out.println(order);
        order.removeAll("d1");
        System.out.println(order);
        System.out.println(order.totalCost());
        System.out.println(order.itemQuantity());
        System.out.println(order.itemQuantity("d4"));
    }
}