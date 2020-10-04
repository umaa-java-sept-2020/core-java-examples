package org.oops.constructors;

public class UserDefinedConstructorMain {
    public static void main(String[] args) {

      //  Item item = new Item();
        // in above line default constructor we cant invoke as
        // we have defined a user defined parameterized constructor.
        // to fix this we have to manually define the default constructor

        Item item1 = new Item(1,"tea bag", 100);

    }
}
