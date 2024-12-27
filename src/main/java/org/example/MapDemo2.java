package org.example;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

    public static void main(String[] args) {

        List<String> vehicles= Arrays.asList("bus","car","flight","brain","bicycle");

        List<Integer> list = vehicles.stream().map(String::length).toList();
        System.out.println(list);

        vehicles.stream().map(String::length).forEach(System.out::println);
    }


}
