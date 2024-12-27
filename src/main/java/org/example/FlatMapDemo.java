package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        //map()
        List<Integer> list= Stream.of(1,2,3,4,5,6).map(e -> e * 2).toList();
//        System.out.println(list);


        // flatMap()

        List<Integer> list1=Arrays.asList(1,2);
        List<Integer> list2=Arrays.asList(3,4);
        List<Integer> list3=Arrays.asList(5,6);
        List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);

        List<Integer> list4 = finalList.stream().flatMap(x->x.stream().map(n->n+10)).toList();
        System.out.println(list4);

    }
}


















