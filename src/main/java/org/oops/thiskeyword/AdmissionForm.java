package org.oops.thiskeyword;

public class AdmissionForm {

    private String firstName;
    private String lastName;
    private String universityName;

    public AdmissionForm(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println(firstName); // method parameter
        System.out.println(lastName); // method parameter
        System.out.println(this.firstName); // object state
        System.out.println(this.lastName); // object state
        this.includeUniversityName("utkal university"); // object behaviour
    }

    public String getFullName()
    {
        return firstName + " "+ lastName+ " "+universityName;
    }

    public void modifyFirstNameAndLastName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void includeUniversityName(String universityName)
    {
        this.universityName = universityName;
    }
}
