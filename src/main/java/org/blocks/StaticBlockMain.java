package org.blocks;

public class StaticBlockMain {

    // class is loading & executing static blocks if any
    static { // 1
        System.out.println("statement1");
        System.out.println("statement2");
    }

    static { // 2
        System.out.println("statement3");
        System.out.println("statement4");
    }

    public static void main(String[] args) {
        System.out.println("main method output"); // 3
    }
}
