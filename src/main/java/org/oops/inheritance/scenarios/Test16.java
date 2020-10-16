package org.oops.inheritance.scenarios;

public class Test16 {

    // instanceof operator
    public static void main(String[] args) {

        // Object -> BaseParent -> Parent -> Child
        Object objectRefVar = new Child();
     //   objectRefVar = new Parent();
//        objectRefVar = new Object();

        System.out.println(objectRefVar instanceof Object);
        // you can assign objectRefVar to another refVar of type java.lang.Object
        Object oRefVar = (Object)objectRefVar;

        System.out.println(objectRefVar instanceof BaseParent);
        // you can assign objectRefVar to another refVar of type BaseParent
        BaseParent bpRefVar = (BaseParent)objectRefVar;

        System.out.println(objectRefVar instanceof Parent);
        // you can assign objectRefVar to another refVar of type Parent
        Parent pRefVar = (Parent) objectRefVar;

        System.out.println(objectRefVar instanceof Child);
        // you can assign objectRefVar to another refVar of type Child
        Child cRefVar = (Child) objectRefVar;


    }

    private static class BaseParent
    {

    }
    private static class Parent extends BaseParent
    {

    }

    private static class Child extends Parent
    {

    }
}
