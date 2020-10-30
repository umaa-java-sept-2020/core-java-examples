package org.ctrl.statements;

public class ReturnWithoutValueMain {
    // return : that method execution stops from that point or removed from the stack.
    public static void main(String[] args) {
        returnWithoutValue();
    }

    private static void returnWithoutValue()
    {
        String names[] = {"john", "doe", "alex", "carry"};

        for (String s : names) {
            if (s.startsWith("a")) {
                System.out.println("return from here");
                return;
            }
            System.out.println(s);
        }

        System.out.println("statement1");
    }
}
