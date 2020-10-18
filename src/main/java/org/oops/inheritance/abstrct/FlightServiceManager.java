package org.oops.inheritance.abstrct;

// template method design pattern
public abstract class FlightServiceManager {

    public final void manage()
    {
        doBooking();
        doFly();
        doPassengerService();
        doLanding();
    }

    public void doBooking(){
        System.out.println("online booking");
    }
    public void doFly(){
        System.out.println("flying");
    }

    public abstract void doPassengerService();

    public void doLanding(){
        System.out.println("landing");
    }
}
