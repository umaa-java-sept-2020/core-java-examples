package org.oops.inheritance.intrface;

public interface ICalculator {
    // interface defines what methods need to expose or implemented by child classes.
    // no common code shared across sub classes (JAVA 7)

    // you cant write any logic
    // you can define only method prototypes
    // can have constant variables defined
    // cant create object of interface

    // by default your method prototypes are public abstract
    // by default variables are constants (public static final)

    // concrete child class implementation will implement all the methods
    // abstract child class implementation will implement all or some of the methods

    int sum(int x, int y); // method prototype
    int diff(int x, int y); // method prototype
    int mul(int x, int y); // method prototype
    // private (protected) methods / variables not allowed

    public static final int i = 1000;
}
