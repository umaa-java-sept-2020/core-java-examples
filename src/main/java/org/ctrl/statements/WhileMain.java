package org.ctrl.statements;

public class WhileMain {
    public static void main(String[] args) {
        display();
    }

    private static void display() {
        // display from 1 to 10

        int i = 1;
        while (i <= 10) {
            System.out.println(i);

            i = i + 1;
        }
//        System.out.println(i++);
//        System.out.println(i++);
//        System.out.println(i++);
//        System.out.println(i++);
//        System.out.println(i++);
    }
}
