package org.example;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("A","B","C","1","2","3");

        Object[] array = stringList.stream().toArray();

        for (Object v:array){
            System.out.print(v);
        }
    }
}
