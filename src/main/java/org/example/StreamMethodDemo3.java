package org.example;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// sorted
public class StreamMethodDemo3 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,5,4,1,3,6,8,7,9,0);

        List<Integer> sorted = list.stream().sorted().toList();

        System.out.println(sorted);

        List<Integer> sortedRevers = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedRevers);



        List<String> list1= Arrays.asList("John","Merry","Kim","Devid","Smith");

        List<String> list2 = list1.stream().sorted().toList();
        List<String> list3 = list1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list2);
        System.out.println(list3);


    }
}
