package org.oops.inheritance.abstrct;

public class FlightMain {
    public static void main(String[] args) {
        FlightServiceManager manager = new BusinessPassengerService();
        manager.manage();
        System.out.println("----------------------");
        manager = new EconomyPassengerService();
        manager.manage();
    }
}
