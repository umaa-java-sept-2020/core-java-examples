package org.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeArraysSorting {

    public static void m2(String[] args) {
        Employee e1 = new Employee(1, "John", "FICO");
        Employee e2 = new Employee(2, "Doe", "TCS");
        Employee e3 = new Employee(3, "Alex", "FICO");
        Employee e4 = new Employee(4, "Carrey", "ACCENTURE");

        // sort employee array by company name

        Employee[] employees = {e1, e2, e3, e4};

        Arrays.sort(employees, Comparator.comparing(Employee::getCompanyName)); // JAVA 8 Style
        System.out.println(Arrays.toString(employees));
    }


    public static void main(String[] args) {

        Employee e1 = new Employee(1, "John", "FICO");
        Employee e2 = new Employee(2, "Doe", "TCS");
        Employee e3 = new Employee(3, "Alex", "FICO");
        Employee e4 = new Employee(4, "Carrey", "ACCENTURE");
        Employee e5 = new Employee(5, "John", "GOOGLE");

        Employee[] employees = {e1, e2, e3, e4, e5};

        Arrays.sort(employees); // sortByName: depends on comparable defined inside Employee class.
        Arrays.sort(employees, new CompanyNameComparator());// sorting: external to Employee class

//        Comparator comparator = (Comparator) e1; // runtime ClassCastException
        Comparable comparable = (Comparable) e1; // no error as it has implemented Comparable
        System.out.println(Arrays.toString(employees)); // sort object by comparable by default
        // if your employee object has not implemented comparable?
        // AT runtime ClassCastException: because trying to assign to a comparable(by doing typecast) even though your employee object has not implemented comparable
    }

    public static void sortEmpUsingComparator(String[] args) {

        Employee e1 = new Employee(1, "John", "FICO");
        Employee e2 = new Employee(2, "Doe", "TCS");
        Employee e3 = new Employee(3, "Alex", "FICO");
        Employee e4 = new Employee(4, "Carrey", "ACCENTURE");
        Employee e5 = new Employee(5, "John", "GOOGLE");

        // sort employee array by company name

        Employee[] employees = {e1, e2, e3, e4, e5};

        Comparator companyNameComparator = new CompanyNameComparator();
        Comparator nameComparator = new NameComparator();
        Comparator nameReverseCompanyNameComparator = new NameReverseCompanyNameComparator();

        Arrays.sort(employees, nameReverseCompanyNameComparator);
        System.out.println(Arrays.toString(employees));

    }

    // Comparator: to sort the objects: logic
    private static class CompanyNameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            String c1 = o1.getCompanyName();
            String c2 = o2.getCompanyName();
            return c1.compareTo(c2);
        }
    }

    private static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            String c1 = o1.getName();
            String c2 = o2.getName();
            int result = -c1.compareTo(c2); // reverseOrder -
            return result;
        }
    }

    // if name is same then sort in reverse order of company name
    private static class NameReverseCompanyNameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            String c1 = o1.getName();
            String c2 = o2.getName();
            int result = -c1.compareTo(c2);
            if (result == 0) {
                String companyName1 = o1.getCompanyName();
                String companyName2 = o2.getCompanyName();

                result = -companyName1.compareTo(companyName2);
            }
            return result;
        }
    }
}
