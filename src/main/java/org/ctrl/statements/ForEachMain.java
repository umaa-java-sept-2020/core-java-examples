package org.ctrl.statements;

public class ForEachMain {
    public static void main(String[] args) {

        displayWithForEach();
        displayWithFor();
    }

    private static final String namesArr[] = {"john","doe", "chris", "green"};
    private static void displayWithForEach()
    {
        for(String strName: namesArr)
        {
            System.out.println(strName);
        }
    }

    private static void displayWithFor()
    {
        for(int index = 0; index< namesArr.length;index++)
        {
            System.out.println(namesArr[index]);
        }
    }

    private static void dislayWithWhile()
    {

    }

    private static void displayWithDoWhile()
    {

    }
}
