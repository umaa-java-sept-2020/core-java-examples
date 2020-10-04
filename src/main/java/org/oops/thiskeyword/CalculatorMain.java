package org.oops.thiskeyword;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 20); // state
        int result = c1.sum();// behaviour
        System.out.println(result);

        Calculator c2 = new Calculator(10);
        System.out.println(c2.hashCode());

      //  admissionFormWithThis();
    }

    public static void admissionFormWithThis()
    {
        AdmissionForm af = new AdmissionForm("rabindra", "patra");
        System.out.println(af.getFullName());
        af.modifyFirstNameAndLastName("john","doe");
        System.out.println(af.getFullName());
    }
}
