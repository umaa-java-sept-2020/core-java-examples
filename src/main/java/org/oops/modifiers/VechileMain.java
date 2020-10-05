package org.oops.modifiers;

public class VechileMain {
    public static void main(String[] args) {
        Vechile v  = new Vechile();
       v.registrationState = "DELHI";
        // DELHI (DL), ODISHA (OD)
        v.setRegistrationState(null);
        v.color = "black";

        System.out.println(v.getRegistrationState());
    }
}
