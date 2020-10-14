package org.oops.inheritance.scenarios;

public class Test5 {

    // how many objects in inheritance: 1
    public static void main(String[] args) {

        Parent p = new Child();

    }
    public static class Parent
    {
        public Parent() {
            System.out.println("parent class: "+this.hashCode());
            System.out.println("parent class: "+this.getClass());
        }
    }

    public static class Child extends Parent
    {
        public Child() {
            super();// optional to write here
            System.out.println("child class: "+this.hashCode());
            System.out.println("child class: "+this.getClass());
        }
    }

}
