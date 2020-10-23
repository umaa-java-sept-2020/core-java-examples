package org.oops.inheritance.intrface;

public class CalculatorImpl implements ICalculator {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int diff(int x, int y) {
        return  x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }
}
