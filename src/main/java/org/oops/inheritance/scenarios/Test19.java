package org.oops.inheritance.scenarios;

// overloading : possible between 2 classes (inheritance) or in the same class
// name of method must be same. signature must be different. compile time polymorphism.
// overrriding : non-static methods only. runtime polymorphism
public class Test19 {

    public static void main(String[] args) {

        B a = new B();
        a.m1(10);
        a.m1();
        a.m1(10, 20);
    }

    private static class  A
    {
        public void m1(int x){

        }

        public static void m1(){

        }
    }

    private static class B extends  A{

        public void m1(int x, int y){

        }
    }
}
