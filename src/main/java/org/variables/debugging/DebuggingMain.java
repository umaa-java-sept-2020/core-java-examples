package org.variables.debugging;

public class DebuggingMain {

    static int staticValue = 10;
    int nonStaticValue = 200;

    public static void main(String[] args) {
        DebuggingMain debuggingMain = new DebuggingMain();
        System.out.println("debug1");
        System.out.println("debug2");
        System.out.println("debug3");
        System.out.println("debug4");
        debuggingMain.sum(10, 20);
        System.out.println("debug5");
    }

    public DebuggingMain()
    {
        System.out.println("inside constructor");
    }

    public void sum(int x, int y)
    {
        int result = x + y;
        System.out.println("some more lines");
        System.out.println("some more lines");
        System.out.println("some more lines");
        System.out.println(result);
    }
}
