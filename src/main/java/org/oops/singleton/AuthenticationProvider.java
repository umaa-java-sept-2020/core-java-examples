package org.oops.singleton;

// Singleton: Only one object of the class
public class AuthenticationProvider {

    // this gets initialized on class loading (only once)
    // only one object will be created
    private static AuthenticationProvider INSTANCE = new AuthenticationProvider();

    public static AuthenticationProvider getInstance()
    {
        return INSTANCE;
    }

    // dont allow anyone from outside class to call and create object
    private AuthenticationProvider()
    {
        // no-code
    }
}
