package org.ctrl.statements;

public class ForLoopMain {
    public static void main(String[] args) {
      //  display();
        display1();
    }

    private static void display1()
    {
        // i : 1 to 10
        // j: 1 to 10
        for(int i = 1, j = 1; i<=10 || j <=10 ; i++, j++)
        {
            System.out.println(i+j);
        }

    }
    private static void display() {
        // display from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("-------------------");

        int i = 1;
        for (; i <= 10; ) {
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
