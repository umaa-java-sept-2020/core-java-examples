package org.ctrl.statements;

public class SwitchMain {
    public static void main(String[] args) {

        displaySwitch();
    }

    private static void displaySwitch() {
        String day = "SAT";

        switch (day) {
            case "MON":
                System.out.println("it is monday");
                break;
            case "TUE":
                System.out.println("it is tuesday");
                break;
            case "WED":
                System.out.println("it is wednesday");
                break;
            case "THU":
                System.out.println("it is thursday");
                break;
            case "FRI":
                System.out.println("it is friday");
                break;
            case "SAT":
                System.out.println("it is weekend1");
            case "SUN":
                System.out.println("it is weekend2");
                break;
            default:
                System.out.println("invalid day given");
        }
    }

    // do above using if-else-if-else
    private static void displayWithIfElseIf()
    {

    }
}
