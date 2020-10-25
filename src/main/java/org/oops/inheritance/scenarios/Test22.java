package org.oops.inheritance.scenarios;

public class Test22 {
    public static void main(String[] args) {

    }

    private static class A
    {
        protected int i = 10;

        protected void m1()
        {

        }
    }

    private static class B extends  A
    {
        private int i = 100;

        // scope reduced for method from protected to private: not allowed
        // scope can only be expanded in child class. protected -> public
        public void m1()
        {

        }
    }
}
