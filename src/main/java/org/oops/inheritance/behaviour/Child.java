package org.oops.inheritance.behaviour;

public class Child extends Parent {

    public int j = 20;
    // variable hiding
    public int i = 100;

    public void m3()
    {
        System.out.println("child: m3()");
    }

    // overriding
    public void m1()
    {
        System.out.println("child: m1()");
        m4();
    }

    // method hiding
    public static void m2()
    {
        System.out.println("child: m2() static");


    }



}
