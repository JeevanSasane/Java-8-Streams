package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodDemo2 {

    public static void main(String[] args) {

        List<Integer> numbersList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        long evenNumberCount= numbersList.stream()
                .filter(no -> no % 2 == 0).count();

        System.out.println(evenNumberCount);

        // min
        Optional<Integer> min = numbersList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });

        System.out.println(min);

        //max
        Optional<Integer> max = numbersList.stream().max(Integer::compareTo);

        System.out.println(max.get());

    }
}
