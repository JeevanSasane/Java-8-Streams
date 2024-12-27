package org.example;


// Non-terminal/processing methods
    // distinct()
    // count()
//Terminal methods
    // limit()
    // forEach()

import java.util.Arrays;
import java.util.List;

public class StreamMethodDemo1 {

    public static void main(String[] args) {

        List<String> vehicalList= Arrays.asList("bus","car","bus","car","bike","bicycle");
        List<String> list =
                vehicalList.stream().distinct().map(String::toUpperCase).toList();
        System.out.println(list);

        long count = vehicalList.stream().count();
        long countDistinct = vehicalList.stream().distinct().count();
        System.out.println(count);
        System.out.println(countDistinct);

        List<String> list1 = vehicalList.stream().limit(3).toList();
        System.out.println(list1);


    }
}
