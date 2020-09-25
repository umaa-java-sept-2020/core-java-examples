package org.variables.local;

public class VariablesBlockMain {


    // variables declared inside a block are local to the block only.
    static {
        int x = 10;
        System.out.println(x);
    }

    {
        int y = 20;
        System.out.println(y);
    }

    public static void main(String[] args) {
       // System.out.println(x);

       VariablesBlockMain variablesBlockMain = new VariablesBlockMain();
       variablesBlockMain.sum();
       variablesBlockMain.sum(30,40);
    }

    public void sum(int x, int y)
    {
        int result = x + y;
        System.out.println("sum of x & y: "+result);
    }

    public void sum()
    {
        int result = 10 + 20;
        System.out.println(result);
    }
}
