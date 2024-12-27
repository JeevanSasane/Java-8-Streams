package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Students{
    int id;
    String name;
    char grade;

    public Students(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class FlatMapDemo3 {

    public static void main(String[] args) {

        List<Students> studentList1= Arrays.asList(
                new Students("Jeevan",101,'A'),
                new Students("Amit",102,'B'),
                new Students("Ashu",103,'C')
        );
        List<Students> studentList2= Arrays.asList(
                new Students("John",201,'A'),
                new Students("Ken",202,'B'),
                new Students("Smith",203,'C')
        );
        List<Students> studentList3= Arrays.asList(
                new Students("Lucy",301,'A'),
                new Students("Piter",302,'B'),
                new Students("Json",303,'C')
        );

        List<List<Students>> finalList=Arrays.asList(studentList1,studentList2,studentList3);

        List<Students> listOfStudentAGrade = finalList.stream().flatMap(Collection::stream)
                .filter(s->s.grade=='A').toList();
        listOfStudentAGrade.forEach(System.out::println);
        System.out.println();

        List<Students> listOfStudentBGrade = finalList.stream().flatMap(Collection::stream)
                .filter(s->s.grade=='B').toList();
        listOfStudentBGrade.forEach(System.out::println);
        System.out.println();

        List<Students> listOfStudentCGrade = finalList.stream().flatMap(Collection::stream)
                .filter(s->s.grade=='C').toList();
        listOfStudentCGrade.forEach(System.out::println);

        List<String> listOfStudentC = finalList.stream().flatMap(Collection::stream)
                .filter(s->s.grade=='C').map(s->s.name).toList();

        listOfStudentC.forEach(System.out::println);
        
        
    }
}









