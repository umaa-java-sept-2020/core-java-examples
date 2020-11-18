package org.enums;

public enum Department {
    // defining constants: make it in uppercase always
    MCA(1990), ENGLISH(1985), ORIYA(1984), CHEMISTRY, PHYSICS(1995);

    // enum with constructor
    Department() {
        System.out.println("enum with default constructor: "+this);
    }

    private int year;
    // enum with param constructor
    Department(int year)
    {
        System.out.println("enum with param constructor: "+this+ "  year "+ year);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
