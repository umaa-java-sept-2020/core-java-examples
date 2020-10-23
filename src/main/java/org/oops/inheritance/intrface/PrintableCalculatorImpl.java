package org.oops.inheritance.intrface;

public class PrintableCalculatorImpl implements ICalculator {
    @Override
    public int sum(int x, int y) {
        System.out.println("doing sum for "+x+" and "+y);
        return x  + y;
    }

    @Override
    public int diff(int x, int y) {
        return 0;
    }

    @Override
    public int mul(int x, int y) {
        return 0;
    }
}
