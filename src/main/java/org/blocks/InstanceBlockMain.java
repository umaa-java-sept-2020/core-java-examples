package org.blocks;

// non-static block
public class InstanceBlockMain {

    // instance block: no static keyword
    // instance block: every time we create object of the class.
    { // 2
        System.out.println("non-static statement1");
        System.out.println("non-static statement2");
    }

    { // 3
        System.out.println("non-static statement3");
        System.out.println("non-static statement4");
    }

    public static void main(String[] args) {

        System.out.println("main method output"); // 1
        new InstanceBlockMain();// syntax to create object
        System.out.println("------------------------------");
        new InstanceBlockMain();
        System.out.println("**********************************");
        new InstanceBlockMain();
    }
}
