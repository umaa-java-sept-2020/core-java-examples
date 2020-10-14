package org.oops.inheritance.scenarios;

public class Test13 {
    public static void main(String[] args) {

        new Child(10);
    }

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
            super(i); // super() must be first line in your constructor
            // it is just call to parent class param constructor. no new object creation.
            System.out.println("child class constructor");
        }
    }
}
