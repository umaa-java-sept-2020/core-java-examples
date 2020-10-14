package org.oops.inheritance.scenarios;

public class Test1 {
    // reuse of existing functionality
    public static void main(String[] args) {

        Child c = new Child();
        c.m2();
    }

    public static class Parent {
        public int i;
        protected int j;
        private int k; // not accessible outside of the class

        public void m1() {
            System.out.println("inside parent class m1()");
        }
    }

    public static class Child extends Parent {
        public void m2() {
            System.out.println("i: " + i);
            System.out.println("j: " + j);
//            System.out.println("j: "+k);
            m1();
            System.out.println("inside child class m2()");
        }
    }
}
