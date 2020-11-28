package org.arrays;

public class Employee2dArraysMain {

    public static void main(String[] args) {
        Employee[][] employees = new Employee[2][2];

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new ContractEmployee();
        employees[0] = new Employee[]{e1,e2,e3};
        employees[1] = new Employee[]{e2,e3,e4};

        for(Employee[] employee1dArray: employees)
        {
            for(Employee employee: employee1dArray)
            {
                System.out.println(employee.getClass());
            }
        }
    }
}
