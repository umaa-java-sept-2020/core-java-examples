package org.oops.inheritance.scenarios;

public class Test3 {

    // understanding the reference variable in inheritance.
    public static void main(String[] args) {

        Child c = new Child();
        // inheritance + own member
        c.m2();
        c.m1();

        Parent p = new Parent();
        // own member
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
        public void m2()
        {
            System.out.println("inside child class m2()");
        }
    }
}
