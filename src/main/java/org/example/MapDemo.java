package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {

        List<String> vehicles= Arrays.asList("bus","car","flight","brain","bicycle");

        List<String> vehiclesInUpperCase=new ArrayList<>();
        vehicles.forEach(s -> {
            vehiclesInUpperCase.add(s.toUpperCase());
        });

        System.out.println(vehicles);
        System.out.println(vehiclesInUpperCase);

        List<String> collect = vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);


    }
}
