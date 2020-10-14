package org.oops.inheritance.scenarios;

public class Test2 {
    // overriding
    public static void main(String[] args) {

        Child c = new Child();
        c.m1();

        Parent p = new Parent();
        p.m1();

        p = new Child();
        p.m1();
    }

    public static class Parent
    {
        public void m1()
        {
            System.out.println("inside parent class m1()");
        }
    }

    public static class Child extends Parent
    {
        @Override
        public void m1()
        {
            System.out.println("inside child class overridden m1()");
        }

        public void m2()
        {
            System.out.println("inside child class m2()");
        }
    }
}
