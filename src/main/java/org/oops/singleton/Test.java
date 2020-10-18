package org.oops.singleton;

// Singleton: java.lang.Runtime
public class Test {

    public static void main(String[] args) {
//        AuthenticationProvider provider = new AuthenticationProvider();
//        System.out.println(provider.hashCode());
//        provider = new AuthenticationProvider();
//        System.out.println(provider.hashCode());

        System.out.println("-------------------------");
        System.out.println(AuthenticationProvider.getInstance());
        System.out.println(AuthenticationProvider.getInstance());
        System.out.println(AuthenticationProvider.getInstance());
    }
}
