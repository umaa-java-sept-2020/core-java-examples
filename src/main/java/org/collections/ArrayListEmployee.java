package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ArrayListEmployee {


    public static void main(String[] args) {


        int x = 0;

        Scanner sc = new Scanner(System.in);
        IEmployeeService service = new EmployeeServiceImpl();
        while (true) {
            System.out.println("1. CREATE \n 2. GET BY ID \n 3. GET ALL EMPLOYEE \n 4. UPDATE EMPLOYEE \n 5. DELETE EMPLOYEE \n 6. EXIT");
            System.out.println("enter the value of x");
            x = sc.nextInt();

            if (x < 1 || x > 6) {
                System.out.println("please enter a value between 1 and 6");
            }

            switch (x) {
                case 1:
                    createEmployee(service, sc);
                    break;
                case 3:
                    getAllEmployee(service);
                    break;
                case 2:
                    getEmployeeById(service, sc);
                    break;
                case 5:
                    deleteEmployeeById(service, sc);
                    break;
                case 6:
                    sc.close();
                    return;
            }

        }
    }

    private static void deleteEmployeeById(IEmployeeService service, Scanner sc)
    {
        System.out.println("enter id of employee");
        String id = sc.next();
        System.out.println(service.delete(id));
    }

    private static void getEmployeeById(IEmployeeService service, Scanner sc)
    {
        System.out.println("enter id of employee");
        String id = sc.next();
        System.out.println(service.get(id));
    }

    private static void getAllEmployee(IEmployeeService service)
    {

        System.out.println(service.get());
    }
    private static void createEmployee(IEmployeeService service, Scanner sc)
    {
        System.out.println("enter name: ");
        String name = sc.next();

        System.out.println("enter salary: ");
        Double salary = sc.nextDouble();
        System.out.println("enter age: ");
        Integer age = sc.nextInt();

        Employee e = new Employee();
        e.name = name;
        e.salary = salary;
        e.age = age;
        e.id = UUID.randomUUID().toString();

        service.create(e);

        System.out.println("employee has been created with id: "+e.id);
    }

    private static class Employee {
        //        private String name;
        String id;
        String name;
        Double salary;
        Integer age;

        @Override
        public String toString() {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
    }

    private static interface IEmployeeService {
        int create(Employee e);

        Employee get(String id);

        List<Employee> get();

        int update(String id, Employee e);

        int delete(String id);
    }

    private static class EmployeeServiceImpl implements IEmployeeService {
        private List<Employee> employeeList;

        public EmployeeServiceImpl() {
            employeeList = new ArrayList<>();
        }

        @Override
        public int create(Employee e) {
            employeeList.add(e);
            return 1;
        }

        @Override
        public Employee get(String id) {

            for (Employee e : employeeList) {
                String idOfEmployee = e.id;
                if (idOfEmployee != null && idOfEmployee.equals(id)) {
                    return e;
                }
            }
            return null;
        }

        @Override
        public List<Employee> get() {
            return employeeList;
        }

        @Override
        public int update(String id, Employee e) {
            Employee existingEmployee = get(id);
            if (existingEmployee != null) {
                existingEmployee.age = e.age;
                existingEmployee.name = e.name;
                existingEmployee.salary = e.salary;

                return 1;
            }
            return 0;
        }

        @Override
        public int delete(String id) {
            Employee existingEmployee = get(id);
            if (existingEmployee != null) {
                employeeList.remove(existingEmployee);
                return 1;
            }
            return 0;
        }
    }

}
