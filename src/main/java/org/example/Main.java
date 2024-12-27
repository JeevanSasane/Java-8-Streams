package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {

    int marks;
    String name;

    public Student(int marks,String name){
        this.marks=marks;
        this.name=name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {

        List<Student> students= List.of(
                new Student(80,"Jeevan"),
                new Student(70,"Amit"),
                new Student(75,"Ashu"),
                new Student(80,"Aniket")
        );
        List<Student> collect = students.stream().sorted(Comparator.comparingInt(Student::getMarks).thenComparing(Student::getName)).collect(Collectors.toList());

        System.out.println("Hello world!");
    }
}




















