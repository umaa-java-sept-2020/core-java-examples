package org.oops.inheritance.scenarios;

public class Test13 {
    public static void main(String[] args) {

        new Child(10);
    }

    // which constructor logic will execute first?
    // considering super(param) is constructor invocation from child class.
    // parent logic will execute first due to super constructor invocation from child
    public static class Parent
    {
        private int i;

        public Parent(int i) {
            this.i = i;
            System.out.println("inside parent class param constructor");
        }
        // no default constructor here
    }

    public static class Child extends Parent
    {
        // fix: param constructor
        public Child(int i) {
            super(i); // invocation to any super constructor super() must be first line in your constructor
            // it is just call to parent class param constructor. no new object creation.
            System.out.println("child class constructor");
        }
    }
}
