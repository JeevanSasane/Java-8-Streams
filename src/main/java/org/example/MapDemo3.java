package org.example;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {

    public static void main(String[] args) {

        List<Integer> numbersList= Arrays.asList(12,24,15,58,93,2,52,65,26,3,5);

        List<Integer> list = numbersList.stream().map(i -> i * 3).toList();
        System.out.println(list);

//        List<Integer> list1 = numbersList.stream().filter(i -> i / 2 == 0).map(i -> i * 3).toList();
//        System.out.println(list1);

    }
}
