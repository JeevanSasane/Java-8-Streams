package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Jeevans","Sensa","Amit","Joffery","Jon","Melisandre");

        List<String> collect = names.stream().filter(s -> s.length() > 6 && s.length() < 9).collect(Collectors.toList());
        System.out.println(collect);

    }
}
