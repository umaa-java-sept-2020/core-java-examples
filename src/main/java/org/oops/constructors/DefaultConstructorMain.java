package org.oops.constructors;

public class DefaultConstructorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.i);
        System.out.println(calculator.j);

        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.i);

        System.out.println(calculator == calculator1);

        calculator1.i = 100;
        System.out.println(calculator.i);
        System.out.println(calculator1.i);
    }
}
