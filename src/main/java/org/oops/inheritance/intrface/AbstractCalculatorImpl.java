package org.oops.inheritance.intrface;

public abstract class AbstractCalculatorImpl implements ICalculator {
    @Override
    public int sum(int x, int y) {
        System.out.println("from abstract class sum");
        return x + y;
    }
}
