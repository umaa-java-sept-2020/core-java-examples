package org.oops.inheritance.scenarios;

// object class method overriding
public class Test20 {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.toString());
        System.out.println(a.m1());
    }

    private static class A //extends Object
    {
        private int i = 10;

        @Override
        public String toString() {
            return "A{" +
                    "i=" + i +
                    '}';
        }

        public String m1()
        {
            return "welcome";
        }
    }

    private static class B extends A
    {

    }
}
