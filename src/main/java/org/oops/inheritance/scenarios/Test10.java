package org.oops.inheritance.scenarios;

public class Test10 {
    public static void main(String[] args) {

    }

    // inheritance: parent class having param constructor. child having default constructor
    // fix: define a default constructor in parent
    public static class Parent
    {
        private int i;

        public Parent(int i) {
            this.i = i;
        }
//        // no default constructor here, because we defined param constructor
//
        // fix: manually define a no argument constructor
        public Parent() {
        }
    }

    public static class Child extends Parent
    {
        // has own default constructor
        public Child() {
            super(); // invoked default constructor of parent class
        }
    }
}
