package org.ctrl.statements;

public class ReturnWithValueMain {
    // return : that method execution stops from that point or removed from the stack.
    public static void main(String[] args) {

        int len = returnWithoutValue();
        System.out.println(len);
    }

    private static int returnWithoutValue() {
        String names[] = {"john", "doe", "josh", "carry"};

        for (String s : names) {
            if (s.startsWith("a")) {
                System.out.println("return from here");
                return s.length();
            }
            System.out.println(s);
        }
        System.out.println("statement1");
        return -1;
    }
}
