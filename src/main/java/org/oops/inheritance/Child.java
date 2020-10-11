package org.oops.inheritance;

/**
 * child class, sub class, derived class
 */
public class Child extends Parent {

    // internally calls the parent constructor (default), but it doesnt use new
    public Child() {
        super();// this invokes parent constructor . must be first line in your constructor.
        System.out.println("parent I (printing in child)"+ parentI); // accessing parent class field
        parentMethod1();// invoking parent class behaviour
    }

    public void childMethod1()
    {
        System.out.println("parent I (printing in child)"+ parentI); // accessing parent class field
        parentMethod1();// invoking parent class behaviour
    }
}
