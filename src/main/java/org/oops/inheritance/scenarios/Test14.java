package org.oops.inheritance.scenarios;

public class Test14 {

    // class cast exception
    // refVar is pointing to a different object type with which we are doing the casting
    public static void main(String[] args) {

        // parent ref = child object
        Object objectRefVar = new Employee();
        System.out.println(objectRefVar.getClass());

        // child ref = parent ref
        Employee object2 = (Employee) objectRefVar;
        System.out.println(object2.getClass());

        String object3 = (String) objectRefVar;
        System.out.println(object3.getClass());

        Object object1 = new Object();
        Employee e = (Employee) object1;

    }

    private static class Employee
    {

    }
}
