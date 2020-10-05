package org.oops.thisconstructor;

public class ProductMain {

    public static void main(String[] args) {

        Product p = new Product(1, "tea bag", 100);

     //   p.display();
        System.out.println(p.hashCode());

    }
}
