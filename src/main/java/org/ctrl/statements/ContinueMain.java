package org.ctrl.statements;

public class ContinueMain {
    // continue statements.
    // always used along with loops.
    // when we use this the control moves to next iteration in the  the loop

    public static void main(String[] args) {
        breakExample();
    }

    private static void breakExample() {
        String names[] = {"john", "doe", "alex", "carry"};

        for (String s : names) {
            if (s.startsWith("a")) {
                System.out.println("continue from here");
                continue;
            }
            System.out.println(s);
        }

        System.out.println("statement1");
    }
}
