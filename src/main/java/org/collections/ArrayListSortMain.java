package org.collections;

import java.util.*;

// Iterator, ListIterator: self learning

public class ArrayListSortMain {

    public static void main(String[] args) {

        Employee e1 = new Employee("John", 234.5d, "Delhi");
        Employee e2 = new Employee("Doe", 234.5d, "Mumbai");
        Employee e3 = new Employee("Alex", 234.5d, "Delhi");
        Employee e4 = new Employee("Joe", 434.5d, "Mumbai");
        Employee e5 = new Employee("Haris", 534.5d, "Bhubaneswar");

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

//        employeeList.add(e1);

        //     sortByName(employeeList);
//        sortByNameWhenCityNameIsSame(employeeList);
        sortByNameWithComparable(employeeList);
    }

    private static void sortByNameWithComparable(List<Employee> employeeList)
    {
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }

    private static void sortByNameWhenCityNameIsSame(List<Employee> employeeList) {

        System.out.println(employeeList);
        Comparator<Employee> nameCityComparator = new NameCityComparator();
        Collections.sort(employeeList, nameCityComparator);
        System.out.println(employeeList);
    }

    private static class NameCityComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            String city1 = o1.city;
            String city2 = o2.city;

            int cityCmpResult = city1.compareTo(city2);
            if (cityCmpResult == 0)
                return o1.name.compareTo(o2.name);
            return cityCmpResult;
        }
    }

    private static void sortByName(List<Employee> employeeList) {
        System.out.println(employeeList);
        Comparator<Employee> employeeNameComparator = new NameComparator();
        Collections.sort(employeeList, employeeNameComparator);
        System.out.println(employeeList);
    }

    private static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return -o1.name.compareTo(o2.name);
        }
    }

    private static class Employee implements Comparable<Employee>{
        String name;
        Double salary;
        String city;

        public Employee(String name, Double salary, String city) {
            this.name = name;
            this.salary = salary;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", city='" + city + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Employee o) {
            String name1 = this.name;
            String name2 = o.name;

            return name1.compareTo(name2);
        }
    }
}
