package org.ctrl.statements;

public class IfElseStatementMain {
    public static void main(String[] args) {
        displayResult();
    }


    private static boolean checkEvenOrOdd(int x) {
        // statement1
        // statemnt 2
        // statement 3
        return x % 2 == 0;
    }

    private static void displayResult() {

        int x = 11;
        if(checkEvenOrOdd(x))
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        System.out.println("remanining lines");
    }
}
