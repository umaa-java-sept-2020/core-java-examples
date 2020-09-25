package org.variables.classes;

public class VariablesClassMain {

    public static int ageOfStudent; // static
    public String nameOfStudent; // non-static

    public static int rankOfStudent = 28;
    public String nativePlaceOfStudent = "Bhubaneswar";

    public static int x;
    public String y;

    static {

        x = 200;
        System.out.println(" static value init inside static block: "+x);

    }

    {
        System.out.println("non static variable(non-primitive) with default refrence value: "+nameOfStudent);
        System.out.println("non static variable(non-primitive) with initialized value: "+ nativePlaceOfStudent);

        y = "some string value";

        System.out.println("non static value init inside non-static block: "+y);
    }

    public static void main(String[] args) {
        System.out.println("static variable (primitive) with default value: "+ageOfStudent);
        System.out.println("static variable (primitive) with initialized value: "+rankOfStudent);
        VariablesClassMain variablesClassMain =  new VariablesClassMain();
        variablesClassMain.m2(); // non-static method
        m1();// static method
    }

    static void m1()
    {
        x = 3000;
        System.out.println("init of x inside static method: "+x);
    }

    void m2()// non-static
    {
        // x = 4000; static resource
        y = "some value in method";
        System.out.println("init of y inside non-static method: "+y);
    }

    public VariablesClassMain()
    {
        System.out.println("-------------------------------------------");
        x = 100;
        y = "some value inside constructor";

        System.out.println("inside constructor: x "+x);
        System.out.println("inside constructor: y "+y);
        System.out.println("--------------------------------------------");
    }
}
