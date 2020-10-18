package org.oops.inheritance.abstrct;

public class BusinessPassengerService extends FlightServiceManager {
    @Override
    public void doPassengerService() {
        System.out.println("serving business passengers");
    }
}
