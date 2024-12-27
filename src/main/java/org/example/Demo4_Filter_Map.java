package org.example;


import java.util.Arrays;
import java.util.List;

class Employee{

    int id;
    String name;
    int salary;

    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Demo4_Filter_Map {

    public static void main(String[] args) {

        List<Employee> employees= Arrays.asList(
                new Employee(1,"Jeevan",50000),
                new Employee(2,"Amit",40000),
                new Employee(3,"Ashu",60000),
                new Employee(4,"Omkar",70000)
        );

        List<Integer> list = employees.stream().filter(e -> e.salary > 40000).map(e -> e.salary / 2).toList();
        System.out.println(list);
        List<Integer> list2 = employees.stream().filter(e -> e.salary > 40000).map(e -> e.salary).toList();
        System.out.println(list2);

    }
}
