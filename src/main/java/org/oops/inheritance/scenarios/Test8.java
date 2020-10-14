package org.oops.inheritance.scenarios;

public class Test8 {

    // use of variable with this object. but variable not in child class
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
       public int i = 10; // this will be inherit to child class

       public void m1() // this will be inherit to child class
       {
           System.out.println("inside parent class: "+i);
       }
    }

    public static class Child extends Parent
    {

        @Override
        public void m1()
        {
            System.out.println("inside child class: "+i);
        }
    }
}
