package org.oops.inheritance.abstrct;

public class EconomyPassengerService extends FlightServiceManager {
    @Override
    public void doPassengerService() {
        System.out.println("serving economy passengers");
    }
}
