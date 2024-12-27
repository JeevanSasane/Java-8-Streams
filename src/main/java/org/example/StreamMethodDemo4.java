package org.example;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

// anyMatch()
// allMatch()
// noneMatch()
public class StreamMethodDemo4 {

    public static void main(String[] args) {


        Set<String> fruits= new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");

        boolean a = fruits.stream().anyMatch(s -> {
            return s.startsWith("A");
        });
        System.out.println(a);

        boolean b = fruits.stream().noneMatch(s -> {
            return s.contains("B");
        });
        System.out.println(b);

        boolean b1 = fruits.stream().allMatch(s -> {
            return s.startsWith("A");
        });
        System.out.println(b1);

        Optional<String> first = fruits.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = fruits.stream().findAny();
        System.out.println(any.get());

    }
}
















