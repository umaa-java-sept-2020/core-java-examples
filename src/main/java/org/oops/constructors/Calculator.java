package org.oops.constructors;

public class Calculator {

    // for int types default value of instance variable is 0
    int i;
    int j;

    public Calculator()
    {
        System.out.println("before decoration: "+i);
        System.out.println("default constructor");
        i = 10;
        System.out.println("after decoration: "+i);
    }

    public Calculator(int x, int y)
    {
        System.out.println("before decoration: i= "+i+" j= "+j);
        System.out.println("2 param constructor");
        i = x;
        j = y;
        System.out.println("after decoration: i= "+i+" j= "+j);

    }

    public Calculator(int m)
    {
        System.out.println("before decoration: i= "+i+" j= "+j);
        System.out.println("1 param constructor");

        i = m;
        System.out.println("after decoration: i= "+i+" j= "+j);
    }

}
