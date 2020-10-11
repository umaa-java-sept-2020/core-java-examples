package org.oops.inheritance.behaviour;

import org.oops.constructors.Item;
import org.oops.thisconstructor.Product;

public class BehaviourMain1 {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.m4();

        m1();

        System.out.println("--------------------");
        m2();

        System.out.println("-----------------");
        m3();
    }


    private static void m3()
    {
        Parent c1 = new Child(); // parent refVariable is aware about child object
        Child c2 = new Child(); // child refVariable is aware about child object
        System.out.println(c1.getClass()); // object is of which type class
        System.out.println(c2.getClass()); // object is of which type class

        System.out.println(c1 instanceof Child); // true Child c = c1;
        System.out.println(c1 instanceof Parent); // true Parent p = c1;
        System.out.println(c2 instanceof Child); // true Child c = c2;
        System.out.println(c2 instanceof Parent); // true Parent p = c2;

        Item item = new Item(10, "name1", 100);

        Parent p1 = new Parent();
        System.out.println(p1 instanceof Child); // Child c = (Child) p1; // Class Class Exception, p1 is aware about parent


        // parent = child, child = child,
        // child = (child)parent, not allowed
        Child c12 = (Child) c1; // child object , so child type cast allowed, c1 is of parent type variable
     //   Child c11 = (Child) p1; // parent object, so child type cast not allowed, p1 is of parent type variable

        p1 = new Child(); // Child c = (Child) p1; // Class Class Exception wont come, p1 is aware about Child object
        Child c11 = (Child) p1; // parent object, so child type cast not allowed, p1 is of parent type variable
    }

    private static void m2()
    {
        // Parent type RefVar = Child Object
        Parent c1 = new Child();
        // i defined in parent class.
        // i defined in child class.
        // the value of i depends on the type of c1 variable?
        // Parent class i will be printed
        System.out.println("value of i : "+c1.i);
      //  System.out.println("value of j : "+c1.j);
        c1.m1(); // parent class non-static behaviour // type of c1 Object reference// if non-static m1() is present in Child class then it will invoke child class behaviour otherwise it will try to invoke from parent class.
        c1.m2(); // parent class static behaviour // from where it will be invoked? depends on type of c1 variable
        //c1.m3(); // child class behaviour
    }


    private static void m1()
    {
        Child c1 = new Child();
        // i defined in parent class.
        // i defined in child class.
        // the value of i depends on the type of c1 variable?
        // Child class i will be printed
        System.out.println("value of i : "+c1.i);
        System.out.println("value of j : "+c1.j);
        c1.m1(); // parent class non-static behaviour // type of c1 Object reference// if non-static m1() is present in Child class then it will invoke child class behaviour
        c1.m2(); // parent class static behaviour // from where it will be invoked? depends on type of c1 variable
        c1.m3(); // child class behaviour
    }
}
