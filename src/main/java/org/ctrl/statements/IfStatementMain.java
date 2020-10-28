package org.ctrl.statements;

public class IfStatementMain {
    public static void main(String[] args) {

        evaluateDecision();
        displayResult();
    }

    private static void evaluateDecision() {
        int x = 10;
        if (x % 2 == 0) {
            System.out.println("even");
        }
        System.out.println("odd");
    }


    private static boolean checkEvenOrOdd(int x) {
        // statement1
        // statemnt 2
        // statement 3
        return x % 2 == 0;
    }

    private static void displayResult() {

        int x = 10;
        if(checkEvenOrOdd(x))
        {
            System.out.println("even");
        }
        System.out.println("odd");
        System.out.println("remanining lines");
    }
}
