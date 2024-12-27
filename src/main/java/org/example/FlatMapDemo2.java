package org.example;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo2 {

    public static void main(String[] args) {

        List<String> teamA= Arrays.asList("Scott","David","John");
        List<String> teamB= Arrays.asList("Mary","Luna","Tom");
        List<String> teamC= Arrays.asList("Ken","Jony","Kitty");

        List<List<String>> finalList=Arrays.asList(teamA,teamB,teamC);

        List<String> list = finalList.stream()
                .flatMap(team -> team.stream()
                        .filter(a->a.contains("o") || a.contains("O"))
                        .map(a->a.replaceAll("o","O"))).toList();

        System.out.println(list);
    }
}
