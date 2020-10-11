package org.oops.inheritance;

/**
 * base class, parent class
 */
public class Parent {

    // field in parent class
    public int parentI;

    public Parent() {
        this.parentI = 10;
    }

    // parent class behaviour
    // public or protected methods can inherit to child class
    public void parentMethod1()
    {
        if(parentI % 2  == 0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
