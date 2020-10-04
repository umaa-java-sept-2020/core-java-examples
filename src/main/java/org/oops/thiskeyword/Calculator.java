package org.oops.thiskeyword;

public class Calculator {

    private int i;
    private int j;

    {
        this.i = 100;
        i = 200;
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
