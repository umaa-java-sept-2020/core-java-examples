package org.oops.constructors;

public class ParamConstructorsMain {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(10, 20);
        System.out.println(c1.i);
        System.out.println(c1.j);

        Calculator c2 = new Calculator(40, 30);
        System.out.println(c2.i);
        System.out.println(c2.j);

        System.out.println(c1 == c2);

        Calculator c3 = new Calculator();
        Calculator c4 = new Calculator();

        System.out.println(c3.i);
        System.out.println(c4.i);

    }
}
