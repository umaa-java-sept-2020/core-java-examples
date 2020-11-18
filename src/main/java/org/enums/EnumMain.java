package org.enums;

public class EnumMain {

    public static void main(String[] args) {


        //  m2();
        m3();
    }

    private static void m3() {
        StateCapitals stateCapitals = StateCapitals.ODISHA;
        System.out.println(stateCapitals.hashCode());
        String countryName = stateCapitals.getCountry();
        String capitalName = stateCapitals.getCapital();

        String message = "Country Name is %s, State name is %s and capital name is %s";
        String displayMessage = String.format(message, countryName, stateCapitals.name(), capitalName);

        System.out.println(displayMessage);
    }

    private static void m2() {
        String countryName = States.ODISHA.getCountry();
        System.out.println(countryName);
    }

    private static void m1() {
        Department d1 = Department.PHYSICS;

        System.out.println("=========================");
        System.out.println(d1);
        System.out.println(d1.name());
        System.out.println(d1.ordinal());
        System.out.println(d1.getYear());

    }
}
