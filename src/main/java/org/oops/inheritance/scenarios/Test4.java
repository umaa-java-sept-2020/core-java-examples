package org.oops.inheritance.scenarios;


public class Test4 {

    // method hiding
    public static void main(String[] args) {

        Parent p = new Child();
        p.m2(); // child
        p.m1(); // parent

        Child c = new Child();
        c.m2(); // child
        c.m1(); // child

    }

    public static class Parent
    {
        public void m2()
        {
            System.out.println("inside parent class m2()");
        }
        public static void m1()
        {
            System.out.println("inside parent class static m1()");
        }
    }

    public static class Child extends Parent
    {
        public void m2()
        {
            System.out.println("inside child class m2()");
        }

        public static void m1()
        {
            System.out.println("inside child class static m1()");
        }
    }
}
