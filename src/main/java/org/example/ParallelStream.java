package org.example;

import java.util.Arrays;
import java.util.List;

class Student1{

    String name;
    int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
public class ParallelStream {

    public static void main(String[] args) {

        List<Student1> student1s= Arrays.asList(
                new Student1("Jeevan",80),
                new Student1("Amit",70),
                new Student1("Ashu",90),
                new Student1("Manish",82),
                new Student1("Shubham",60),
                new Student1("Viki",89)
        );

        List<Student1> list = student1s.parallelStream()
                .filter(student1 -> student1.getScore() > 80)
                .limit(2).toList();
        System.out.println(list);

        List<Student1> list2 = student1s.stream().parallel()
                .filter(student1 -> student1.getScore() > 80)
                .limit(2).toList();
        System.out.println(list2);


    }


}
