package org.arrays;

import java.util.Arrays;

public class EmployeeArraysMain {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "john", "Nokia");
        Employee e2 = new Employee(2, "alex", "JPMC");
        Employee e3 = new Employee(3, "Mark", "FICO");
        Employee e4 = new Employee(4, "Taylor", "FICO");

        Employee[] employeesArray = {e1, e2, e3, e4};


        for (Employee employee : employeesArray) {
            if (employee.getCompanyName() == "FICO") {
                System.out.println(employee);
            }
        }

        System.out.println("===========================");


        for (Employee employee : employeesArray) {
            if (employee.getCompanyName() == new String("FICO").intern()) {
                System.out.println(employee);
            }
        }

    }

    public static void m1(String[] args) {

        Employee e1 = new Employee(1, "john", "Nokia");
        Employee e2 = new Employee(2, "alex", "JPMC");
        Employee e3 = new Employee(3, "Mark", "FICO");
        Employee e4 = new Employee(4, "Taylor", "FICO");

        Employee[] employeesArray = {e1, e2, e3, e4};
        Employee[] employees1 = new Employee[]{e1, e2, e3, e4};

        System.out.println("employee: " + e1);
        System.out.println(Arrays.toString(employeesArray));

        for (int i = 0; i < employeesArray.length; i++) {
            System.out.println(employeesArray[i]);
        }

    }
}
