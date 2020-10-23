package org.oops.inheritance.intrface;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorImpl();
       // calculator = new PrintableCalculatorImpl();
        calculator = new ConcreteCalculatorImpl();
        System.out.println(calculator.getClass());
        System.out.println(calculator.sum(10,20));
        System.out.println(calculator.diff(10,20));
    }
}
