package org.exceptions;


import java.sql.SQLException;

public class ExceptionMain {

    private static void m5() throws InvalidDataException
    {
        int x = 11;
        if(x > 10)
        {
            try {
                System.out.println("try");
                throw new InvalidDataException("invalid data");
            } catch (InvalidDataException e) {
                System.out.println("inside catch1 block");
                throw e;
            }
            finally {
                System.out.println("finally1");
            }
           // System.out.println("bye"); // wont execute unreachable statement
        }
        System.out.println("hello"); // wont execute
    }

    public static void main(String[] args) throws InvalidDataException {
        try {
            m5();
            System.out.println("try2");
        } catch (InvalidDataException e) {
            System.out.println("catch2");
         //   System.exit(0); // if JVM terminated then finally block wont execute
            throw e;
        }
        finally {
            System.out.println("finally2");
        }

        System.out.println("ok");
    }
    /** m4()
     *
     */
    private static void m4() throws InvalidDataException , SQLException {
        System.out.println("m4()");
        int x = 11;
        if (x > 10) {
            throw new InvalidDataException("invalid data");
        }
        if (x > 0) {
            throw new SQLException("invalid data between 0 and 10");
        }
    }

    private static void m3() throws InvalidDataException /*(this is no use now)*/, Exception {
        System.out.println("m3()");
        int x = 11;
        if (x > 10) {
            throw new InvalidDataException("invalid data");
        }
        if (x > 0) {
            throw new Exception("invalid data between 0 and 10");
        }
    }

    public static void main_41(String[] args) {
        // multi catch using pipe and it is used when exceptions are siblings instead they are subclasses.

        try {
            m4();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            m4();
        } catch (InvalidDataException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main_32(String[] args) {
        try {
            m3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main_31(String[] args) {

        try {
            m3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            m3();
        } catch (InvalidDataException e) {
            e.printStackTrace();
            System.out.println("**"+e.getClass());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getClass());
        }
    }

    /**
     * m22() & m2()
     */
    private static void m22() {
        int x = 11;
        if (x > 10) {
            throw new InvalidDataRuntimeException("invalid data");
        }
    }

    private static void m2() throws InvalidDataException {
        int x = 11;
        if (x > 10) {
            throw new InvalidDataException("invalid data");
        }
    }

    private static class InvalidDataException extends Exception {
        public InvalidDataException(String message) {
            super(message);
            // custom logic
        }
    }

    // for reference see SQLException class
    private static class InvalidDataRuntimeException extends RuntimeException {
        public InvalidDataRuntimeException(String message) {
            // problem
            super(message);
            // custom logic
        }
    }

    public static void main_23(String[] args) {
        try {
            m2();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
        System.out.println("bye");
    }

    public static void main_22(String[] args) {
        try {
            m2();
        } catch (Exception e) { // parent of ExceptionMain$InvalidDataException
            e.printStackTrace();
        }
        System.out.println("bye");
    }

    public static void main_221(String[] args) {
        m22();
    }

    public static void main_21(String[] args) throws Exception {
        m2();
    }

    /**
     * m1()
     */
    private static void m1() throws Exception {
        System.out.println("m1()");
        int x = 11;
        if (x > 10)
            throw new Exception("invalid data"); // handle with try and catch for all exceptions

        System.out.println("hi");
    }

    public static void main_m16(String[] args) throws Throwable {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("================");
            throw e;
        }
    }

    public static void main_m15(String[] args) throws Exception {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("================");
            throw new Exception(e);
        }
    }


    public static void main_m14(String[] args) throws Exception {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("================");
            throw e;
        }
        System.out.println("bye"); // this will not execute
    }

    public static void main_m13(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e); // throwing a uncheked exception (converted checked exception to unchecked): no throws statement need to add main method signature
        }
        System.out.println("bye"); // this will not execute
    }

    public static void main_m12(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace(); // [supressing] the exception or else convert the exception or throw the exception
        }
        System.out.println("bye"); // this will execute
    }

    public static void main_m11(String[] args) throws Exception {
        m1();
        System.out.println("bye");  // this line wont execute
    }

    public static void main_m1(String[] args) throws Exception {
        m1(); // it is throwing checked exception so add to signature of main
    }

    // Throwable: Checked in nature
    // Error: uncheck in nature
    // Exception : Anything Exception or child of Exception is called checked Exception
    // RuntimeExcepton
    // anything RuntimeExcepton or child of RuntimeException is called unchecked exception (defined to compiler)
    public static void m1(String[] args) {
        //  throw new RuntimeException(""); // unchecked
        //   throw new ArrayIndexOutOfBoundsException(""); // unchecked
        // throw new Exception(""); // checked
        // throw new IOException(""); // checked
        // throw new Throwable(""); // checked
        throw new Error(""); // unchecked
    }
}
