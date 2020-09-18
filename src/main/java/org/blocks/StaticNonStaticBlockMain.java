package org.blocks;

public class StaticNonStaticBlockMain {

    // static blocks: class gets loaded
    // one time activity per class without having object of the class.
    static int x;
    static {
        // static variables. static methods
        System.out.println("static statement1");
        System.out.println(x);
        x = 10;
    }

    static {
        System.out.println("static statement2");
    }

    // non-static blocks
    // 100 of non static blocks
    {
        System.out.println("non static statement1");
        if( x == 0)
        {
            System.out.println("invalid value of x!!!");
        }
    }

    {
        System.out.println("non static statement2");
    }

    public static void main(String[] args) {

        System.out.println("main method output");
        new StaticNonStaticBlockMain(); // 1st object
        new StaticNonStaticBlockMain(); // 2nd object
    }

    public StaticNonStaticBlockMain() {
        System.out.println("        constructor executed");
    }
}
