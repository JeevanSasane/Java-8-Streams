package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {

        List<String> words= Arrays.asList("Avd","Sewknds",null,"sdsmek",null,"ssdewe","ofdkgkfkg",null).
                 stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(words);


    }
}
