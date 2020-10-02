package org.oops.constructors;

public class OverloadedConstructorsMain {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(300);
        Calculator c3 = new Calculator(500, 500);

        System.out.println(c1.i+" "+c1.j);
        System.out.println(c2.i+" "+c2.j);
        System.out.println(c3.i+" "+c3.j);
    }
}
