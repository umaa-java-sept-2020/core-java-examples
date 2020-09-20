package org.methods.statics;

public class StaticMethodMain {

    static int x = 100; // static variable
    int y = 20; // instance variable

    static {
        System.out.println("static block executing");
        welcomeCustomer("steve smith");
        String fullName = getFullName("virat", "kohli");
        System.out.println(fullName);
    }

    static {
        System.out.println("static variables executing");
        System.out.println(x);
        // System.out.println(y); // Compilation Error: Non-static field 'y' cannot be referenced from a static context
        //  System.out.println(z); Illegal forward reference because z is defined later on line 21
    }

    static int z = 300;

    public static void main(String[] args) {
        display();
        display();
        display(10, 2);
        display(9, 2);
        // display(9,0);
        welcomeCustomer();
        welcomeCustomer("alex doe");
        welcomeCustomer("john cambell");

        int sumValue = sum(10, 20);
        System.out.println(sumValue);

        String fullName = getFullName("john", "doe");
        System.out.println(fullName);
    }


    static String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    static void display(int x, int y) {
        // division
        // 10 / 2 = 5
        // 9 / 2 = 4
        // 9 / 0 : ArithmeticException


        int res = x / y;
        System.out.println(res);


    }

    // 1. return type is void. no params
    static // says it is a static method
    void // the return type
    display // methodName: valid indentifier
    () // parameters are optional here
    { // starting method body

        System.out.println("display-1");// duplicate: CTRl D
        System.out.println("display-1");// duplicate: CTRl D
        System.out.println("display-1");// duplicate: CTRl D
        System.out.println("display-1");// remove: CTRl Y

    } // ending method body

    static void welcomeCustomer() {
        // hardcoded
        System.out.println("welcome customer to our shop: john doe");
    }

    static void welcomeCustomer(String name) {
        // hardcoded
        System.out.println("welcome customer to our shop: " + name);
    }
}
