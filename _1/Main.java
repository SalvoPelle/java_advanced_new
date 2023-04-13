package javaadvanced._1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> ingredientsList = new TreeSet<>();
        ingredientsList.add("c - Salad dressing");
        ingredientsList.add("a - Tomato");
        ingredientsList.add("b - Lettuce");

        for (String ingredient : ingredientsList) {
            System.out.println(ingredient);
        }
    }
}
