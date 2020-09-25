package org.variables.debugging;

public class DebuggingMain {

    static int staticValue = 10;
    int nonStaticValue = 200;

    public static void main(String[] args) {
        DebuggingMain debuggingMain = new DebuggingMain();
        debuggingMain.sum(10, 20);
    }

    public DebuggingMain()
    {
        System.out.println("inside constructor");
    }
    public void sum(int x, int y)
    {
        int result = x + y;
        System.out.println(result);
    }
}
