package org.oops.inheritance.scenarios;

// inheritance initialization flow
public class Test18 {
    public static void main(String[] args) {
        A a = new B();
    }

    private static class A {
        public static int i = getI(); // 1
        public int ii = getII(); // 7

        static {
            System.out.println("static-block-1-A"); // 2
        }

        static {
            System.out.println("static-block-2-A");// 3
        }

        {
            System.out.println("non-static-block-1-A"); // 8
        }

        {
            System.out.println("non-static-block-2-A"); // 9
        }

        public A() {
            System.out.println("default constructor of A"); // 10
        }

        public static int getI() {
            System.out.println("static method (variable) for A");
            return 100;
        }

        public int getII()
        {
            System.out.println("non static method(variable) for A");
            return 1000;
        }
    }


    private static class B extends A {
        public static int j = getJ(); // 4
        public int jj = getJJ(); // 11

        static {
            System.out.println("static-block-1-B"); // 5
        }

        static {
            System.out.println("static-block-2-B"); // 6
        }

        {
            System.out.println("non-static-block-1-B"); // 12
        }

        {
            System.out.println("non-static-block-2-B"); // 13
        }

        public B() {
            System.out.println("default constructor of B"); // 14
        }

        public static int getJ() {
            System.out.println("static method(variable) for B");
            return 100;
        }

        public int getJJ() {
            System.out.println("non-static method (variable) for B");
            return 1000;
        }
    }


}
