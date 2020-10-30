package org.ctrl.statements;

public class BreakMain {
    // break statements.
    // always used along with loops.
    // when we use this the control comes out of the loop

    //break in loops vs break in switch case

    public static void main(String[] args) {
        breakExample();
    }

    private static void breakExample() {
        String names[] = {"john", "doe", "alex", "carry"};

        for (String s : names) {
            if (s.startsWith("a")) {
                System.out.println("breaking from here");
                break;
            }
            System.out.println(s);
        }

        System.out.println("statement1");
    }
}
