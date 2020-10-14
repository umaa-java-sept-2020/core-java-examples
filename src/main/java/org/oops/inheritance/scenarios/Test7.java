package org.oops.inheritance.scenarios;

public class Test7 {

    // use of variable with this object
    public static void main(String[] args) {

        Parent p = new Child();
        System.out.println(p.i);
        p.m1();

        Child c = new Child();
        System.out.println(c.i);
        c.m1();
    }


    public static class Parent
    {
       public int i = 10;

       public void m1()
       {
           System.out.println("inside parent class: "+i);
       }
    }

    public static class Child extends Parent
    {
        public int i = 1000;

        @Override
        public void m1()
        {
            System.out.println("inside child class: "+i);
        }
    }
}
