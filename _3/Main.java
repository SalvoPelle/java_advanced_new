package javaadvanced._3;

import shared.Meal;
import java.util.*;

    public class Main {

        public static void main(String[] args) {
            Map<String, Meal> menu = new HashMap<>();

//            menu.put("Burger", new Meal(7.80, 500, Set.of("Bun", "Patty", "Sauce")));
//            menu.put("Cheese Burger", new Meal(7.80, 500, Set.of("Bun", "Patty", "Sauce", "Cheese single")));
//            menu.put("Fries", new Meal(3.50, 250, Set.of("Potato", "Loads of oil")));
//            menu.put("Pizza", new Meal(10.0, 700, Set.of("Dough", "Cheese", "Tomato", "Toppings")));

            List<Meal> orders = new ArrayList<>();

            orders.add(menu.get("Burger"));
            orders.add(menu.get("Pizza"));

            for (Meal order : orders) {
                System.out.println(order);
            }
        }
}
