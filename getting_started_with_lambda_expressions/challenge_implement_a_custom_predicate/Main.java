package com.example;

import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface StringPredicate {
    boolean test(String s);
}

public class Main {
    public static void main(String[] args) {
        List<String> products = List.of("Shampoo", "Soap", "Toothbrush", "Sunscreen", "Comb", "Conditioner");

        List<String> startsWithS = filterByPredicate(products, s -> s.startsWith("S"));
        System.out.println("Products starting with S: " + startsWithS);

        List<String> longerThanEight = filterByPredicate(products, s -> s.length() > 8);
        System.out.println("Products with name longer than 8 characters: " + longerThanEight);
    }

    public static List<String> filterByPredicate(List<String> items, StringPredicate predicate) {
        List<String> filtered = new ArrayList<>();          // 1) new list
        for (String item : items) {                         // 2) iterate
            if (predicate.test(item)) {                     // 3) test each
                filtered.add(item);                         //    and add matches
            }
        }
        return filtered;                                     // 4) return list
    }
}