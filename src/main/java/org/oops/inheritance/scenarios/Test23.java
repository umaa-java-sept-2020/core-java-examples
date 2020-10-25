package org.oops.inheritance.scenarios;

public class Test23 {

    public static void main(String[] args) {

        A a = new B();
    }

    private static abstract class A
    {
        protected int i;

        // constructor is not meant object creation here in abstract class.
        // initializing the variables. or executing some initialization logic.
        public A(int i) {
            this.i = i;
            System.out.println(this.getClass());  // depends on object which we created. same in parenet & child class
            System.out.println(this.hashCode()); // same everywhere parent & child class.
        }

        public void m1()
        {
            System.out.println("super class m1");
        }
    }

    private static class  B extends A{

        protected  int i = 100;
        public B() {
            super(10); // invoking super constructor
            System.out.println(i);
            System.out.println(this.i);
            System.out.println(super.i);
            m1();
            this.m1();
            super.m1();

            System.out.println(this.getClass());
            System.out.println(this.hashCode());
        }


        public void m1()
        {
            System.out.println("child class m1");
        }

    }
}
