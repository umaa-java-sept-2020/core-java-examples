package org.oops.inheritance.intrface;

public class ConcreteCalculatorImpl extends AbstractCalculatorImpl{
    @Override
    public int diff(int x, int y) {
        System.out.println("from child class: "+this.getClass());
        System.out.println(i);
        return x - y;
    }

    @Override
    public int mul(int x, int y) {
        return 0;
    }
}
