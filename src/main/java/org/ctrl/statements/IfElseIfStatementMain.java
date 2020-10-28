package org.ctrl.statements;

public class IfElseIfStatementMain {
    // 3 * 5 = 15
    // n % 3 = Fuzzy
    // n % 5 = Buzzy
    // n % 15 = FuzzyBuzzy

    public static void main(String[] args) {

        evaluate();
    }

    private static void evaluate()
    {
        int n = 15;

        if(n % 15 == 0)
        {
            System.out.println("FuzzyBuzzy");
        }
        else if(n % 5 == 0)
        {
            System.out.println("Buzzy");
        }
        else if( n % 3 == 0)
        {
            System.out.println("Fuzzy");
        }

        System.out.println("invalid number");
        System.out.println("done");

    }
}
