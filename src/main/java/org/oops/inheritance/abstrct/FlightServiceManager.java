package org.oops.inheritance.abstrct;

// template method design pattern
public abstract class FlightServiceManager {

    // control the sequence of method execution
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

    // child class need to give the implementation
    public abstract void doPassengerService();

    public void doLanding(){
        System.out.println("landing");
    }
}
