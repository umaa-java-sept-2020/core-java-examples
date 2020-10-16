package org.oops.inheritance.scenarios;

public class Test15 {
    // multi level inheritance
    // parent refVar = child object
    public static void main(String[] args) {
        BaseParent baseParent = new Child();
        baseParent.m1();
        System.out.println("----------------------------------------");

        BaseParent baseParent1 = new Child();
        // Object-> BaseParent -> Parent -> Child
        // baseParennt1 refVar is smaller that objectRefVar. no complain by compiler
        Object objectRefVar = baseParent1;
        // baseParennt1 refVar is bigger than parentRefVar. so complain by compiler. do typecast with Parent. parent = child
        Parent parentRefVar = (Parent)baseParent1;
        // baseParennt1 refVar is bigger than childRefVar. so complain by compiler. do typecast with Child. parent = child
        Child childRefVar = (Child) baseParent1;

    }

    private static class BaseParent
    {
        public BaseParent() {
            System.out.println(this.getClass());
            System.out.println(this.hashCode());
        }

        protected void m1()
        {
            System.out.println("baseParent");
        }
    }

    private static class Parent extends BaseParent
    {
        public Parent() {
            System.out.println(this.getClass());
            System.out.println(this.hashCode());
        }
    }

    private static class Child extends Parent
    {
        public Child() {
            System.out.println(this.getClass());
            System.out.println(this.hashCode());
        }

        @Override
        protected void m1() {
            System.out.println("override in child");
        }
    }
}
