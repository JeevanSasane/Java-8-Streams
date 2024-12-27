package org.example;

import java.util.ArrayList;
import java.util.List;

class Product{

    int id;
    String name;
    double price;

    public Product (int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
public class FilterDemo4 {

    public static void main(String[] args) {

        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"HP Laptop",30000));
        products.add(new Product(2,"Dell",40000));
        products.add(new Product(3,"Mac Book",70000));
        products.add(new Product(4,"Lenovo",50000));
        products.add(new Product(5,"BenQ",45000));

        List<Product> collect = products.stream().filter(product -> product.price > 40000).toList();
        System.out.println(collect);

        products.stream().filter(product -> product.price > 40000)
                .forEach(product2 -> System.out.println(product2.price));


    }
}
