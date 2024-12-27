package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce

public class ReduceDemo1 {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("A","B","C","1","2","3");
        Optional<String> reduce = stringList.stream().reduce((s, s2) -> s + s2);
        System.out.println(reduce.get());

    }
}
