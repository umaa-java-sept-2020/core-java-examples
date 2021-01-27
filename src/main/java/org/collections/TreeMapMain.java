package org.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

// IdenityHashMap, WeakHashMap
// EnumMap.
// Why Strings are used as keys in hashmap.
// contract between hashCode and equals.
public class TreeMapMain {

    public static void main(String[] args) {
        Map<Student,Integer> map = new TreeMap<>(new NameComparator());
        map.put(new Student("n1","25"), 76);
        map.put(new Student("n2","21"), 76);

        System.out.println(map);
    }

    private static class Student
    {
        String name;
        String age;

        public Student(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

    private static class NameComparator implements Comparator<Student>
    {
        @Override
        public int compare(Student o1, Student o2) {
            return -o1.name.compareTo(o2.name);
        }
    }
    public static void m2(String[] args) {
        Map<String,String> stringKeyAsMap = new TreeMap<String,String>();
        stringKeyAsMap.put("s1","s2");

        Map<Object,String> employeeKeyAsMap = new TreeMap<>();
        employeeKeyAsMap.put(new Employee("John",25), "sales");
        employeeKeyAsMap.put(new Employee("Doe", 21), "intern");
        employeeKeyAsMap.put(new String(), "intern"); // Exception in thread "main" java.lang.ClassCastException: org.collections.TreeMapMain$Employee cannot be cast to java.lang.String

        System.out.println(employeeKeyAsMap);
    }
    public static void m1(String[] args) {

        Map<String,String> stringKeyAsMap = new TreeMap<String,String>();
        stringKeyAsMap.put("s1","s2");

        Map<Employee,String> employeeKeyAsMap = new TreeMap<>();
        employeeKeyAsMap.put(new Employee("John",25), "sales");
        employeeKeyAsMap.put(new Employee("Doe", 21), "intern");

        System.out.println(employeeKeyAsMap);
    }

    private static class Employee implements Comparable<Employee>
    {
        String name;
        Integer age;

        public Employee(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Employee o) {
            return -this.age.compareTo(o.age);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            System.out.println("equals()");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(name, employee.name) &&
                    Objects.equals(age, employee.age);
        }

        @Override
        public int hashCode() {
            System.out.println("hashcode()");
            return Objects.hash(name, age);
        }
    }
}
