package org.oops.thiskeyword;

public class Calculator {

    private int i;
    private int j;

    {  // a logic we want apply to every object we create.
        // instead of writing in every constructor,
        // just write it at one place.
        this.i = 100;
        i = 201;
        System.out.println("non-static block: " + sum());
        System.out.println("non-static block: " + this.sum());
    }

    public Calculator(int x, int y) {
        //  i = x;
        j = y;
    }

    public Calculator(int x)
    { // non-static block
        this.i = x;
        System.out.println(this.hashCode());
    }

    public int sum() {
        return i + j;
    }
}
