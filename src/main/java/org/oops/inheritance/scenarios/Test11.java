package org.oops.inheritance.scenarios;

public class Test11 {
    public static void main(String[] args) {

    }

    // inheritance: parent class having param constructor. child having default constructor
    // fix: invoke parent param constructor from child default constructor
    public static class Parent
    {
        private int i;

        public Parent(int i) {
            this.i = i;
        }
        // no default constructor here


    }

    public static class Child extends Parent
    {
        // has own default constructor
        public Child() {
            // fix:
            super(10); // invoke parent class param constructor
        }
    }
}
