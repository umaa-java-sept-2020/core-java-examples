package org.oops.inheritance.scenarios;

public class Test21 {
    public static void main(String[] args) {

    }

    // final classes cant be extended again by another child class.
    private static final class AA
    {
        public void m1()
        {

        }
    }

    private static class BB extends A
   // private static class BB extends AA
    {

    }
    private static class A
    {
        private static final int i;
        private final int j;

        static {
            i = 10;
           // i = 200;
        }
        public A() {
           j = 100;
          // j = 120;
        }

        // this method cant be overriden in child class
        public final void m1()
        {

        }

        public void m2()
        {

        }
    }

    private static class B extends A{
        @Override
        public void m2() {
            super.m2();
        }
    }
}
