package org.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeArraysSorting {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "FICO");
        Employee e2 = new Employee(2, "Doe", "TCS");
        Employee e3 = new Employee(3, "Alex", "FICO");
        Employee e4 = new Employee(4, "Carrey", "ACCENTURE");

        // sort employee array by company name

        Employee[] employees = {e1, e2, e3, e4};

        Arrays.sort(employees, Comparator.comparing(Employee::getCompanyName)); // JAVA 8 Style
        System.out.println(Arrays.toString(employees));
    }


    public static void m1(String[] args) {

        Employee e1 = new Employee(1, "John", "FICO");
        Employee e2 = new Employee(2, "Doe", "TCS");
        Employee e3 = new Employee(3, "Alex", "FICO");
        Employee e4 = new Employee(4, "Carrey", "ACCENTURE");

        // sort employee array by company name

        Employee[] employees = {e1, e2, e3, e4};

        CompanyNameComparator companyNameComparator = new CompanyNameComparator();
        Arrays.sort(employees, companyNameComparator);
        System.out.println(Arrays.toString(employees));

    }

    // Comparator: to sort the objects: logic
    private static class CompanyNameComparator implements Comparator<Employee>
    {
        @Override
        public int compare(Employee o1, Employee o2) {
            String c1 = o1.getCompanyName();
            String c2 = o2.getCompanyName();
            return c1.compareTo(c2);
        }
    }
}
