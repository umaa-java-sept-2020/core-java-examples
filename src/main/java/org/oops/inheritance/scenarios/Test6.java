package org.oops.inheritance.scenarios;

public class Test6 {

    // variable hiding or depends on reference
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.i);

        Child c = new Child();
        System.out.println(c.i);
    }


    public static class Parent
    {
       public int i = 10;

    }

    public static class Child extends Parent
    {
        public int i = 1000;
    }
}
