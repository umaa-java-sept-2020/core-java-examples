package org.variables.constants;

public class ConstantVariablesMain {

    // constants initialized only once. cant be modified.
    static final String staticConstant; // class constants
    final int age = 30; // object or instance constants
    static {
        staticConstant = "some static value";
       // staticConstant = "some static value modified";
    }

    {
       // age = 10; // duplicate initialization of final variable
       // age = 20;
    }

    public static void main(String[] args) {
        System.out.println(staticConstant);
        ConstantVariablesMain constantVariablesMain = new ConstantVariablesMain();
        System.out.println(constantVariablesMain.age);
        constantVariablesMain.sum(10, 20);

        int data = 300;
        final int marks = 75;
        System.out.println(data);
        System.out.println(marks);
    }

    public void sum(final int x, final int y)
    {
      //  x = 40;
        final int result = x + y;
        // result = 100;
        System.out.println("sum of x & y: "+result);
    }
}
