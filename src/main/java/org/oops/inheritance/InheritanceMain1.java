package org.oops.inheritance;

public class InheritanceMain1 {

    public static void main(String[] args) {

        Child c1 = new Child();

        // c1: a reference variable of type Child class.
        // it can access all public fields/methods.
        // default fields/methods in the same package

        System.out.println("invoking child class method from main");
        c1.childMethod1();
        System.out.println("invoking parent class method from main");
        c1.parentMethod1();
    }
}
