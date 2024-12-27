package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        ArrayList<Integer> numbersList=new ArrayList<Integer>();
        numbersList.add(26);
        numbersList.add(21);
        numbersList.add(23);
        numbersList.add(25);
        numbersList.add(22);
        numbersList.add(30);

        List<Integer> collect = numbersList.stream().filter(integer -> integer % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(collect);

//        numbersList.stream().filter(integer -> integer%2==0).forEach(integer -> System.out.println(integer));

        numbersList.stream().filter(integer -> integer%2==0).forEach(System.out::println);
    }
}
