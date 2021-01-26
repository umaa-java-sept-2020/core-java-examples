package org.collections;

import java.util.*;

public class HashMapMain {


    public static void main(String[] args) {

        Product p1 = new Product("p1","g1");
        Product p2 = new Product("p2","g1");
        Product p3 = new Product("p3","g2");
        Product p4 = new Product("p4","g1");
        Product p5 = new Product("p5","g3");
        Product p6 = new Product("p6","g3");

        List<Product> products = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));
        // g1 : p1,p2,p4
        // g2: p3
        // g3: p5, p6

        Map<String,List<Product>> groupVsProducts = new HashMap<>();

        for(Product p: products)
        {
            String groupName = p.itemGroup;
            if(groupVsProducts.containsKey(groupName))
            {
                List<Product> productList = groupVsProducts.get(groupName);
                productList.add(p);
            }
            else{
                List<Product> productList = new ArrayList<>();
                productList.add(p);
                groupVsProducts.put(groupName, productList);
            }
        }

        System.out.println(groupVsProducts);
    }

    private static class Product
    {
        String itemName;
        String itemGroup;

        public Product(String itemName, String itemGroup) {
            this.itemName = itemName;
            this.itemGroup = itemGroup;
        }
    }
    public static void m10(String[] args) {

        // map says unique keys (hashing)
        // value can be duplicate
        Map<Student,Integer>  map = new HashMap<>();

        Student s1 = new Student("n1","r1","sec1","std1","f1","l1");
        Student s2 = new Student("n2","r1","sec1","std1","f1","l1");
        Student s3 = new Student("n3","r1","sec1","std1","f1","l1");
        Student s4 = new Student("n4","r1","sec1","std1","f1","l1");


        map.put(s1,10);
        map.put(s2,20);
        map.put(s3,30);
        map.put(s4,40);

        System.out.println(map.size());

        Set<Map.Entry<Student,Integer>> entrySet = map.entrySet();

        for(Map.Entry<Student,Integer> entry: entrySet)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static class Student
    {
        String name;
        String rollNum;
        String section;
        String standard;

        String firstName;
        String lastName;
        String address;

        public Student(String name, String rollNum, String section, String standard, String firstName, String lastName) {
            this.name = name;
            this.rollNum = rollNum;
            this.section = section;
            this.standard = standard;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(this.name, student.name) &&
                    Objects.equals(this.rollNum, student.rollNum) &&
                    Objects.equals(this.section, student.section) &&
                    Objects.equals(this.standard, student.standard) ;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, rollNum, section, standard);
        }
    }
    public static void m9(String[] args) {

        //[4]->Emp-10 --> Emp-20
        Map<Employee,Integer> map = new HashMap<>();
        map.put(new Employee(), 10);
        map.put(new Employee(), 20);

        System.out.println(map.size());

        System.out.println(map.get(new Employee()));

    }


    private static class Employee
    {

        @Override
        public boolean equals(Object obj) {
            return false; // true or false
        }

        @Override
        public int hashCode() {
            return 10; // random ( 0 - 15 )
        }
    }
    //[4]->Node (s1-23)
    //[4]->Node(s2-24) == [4]->Node(s1-24) [because s1.equals(s2) gives true]
    // when hashCode is same for 2 objects (s1,s2), the equals methods must return true but it is not always true.

    //[4]->Node (s1-23)-> Node(s2-24)
    //when hashcode is same for 2 objects , a chance may exits where s1.equals(s2) gives false

    public static void m8(String[] args) {
        String s1 = new String("john");
        String s2 = new String("john");
        System.out.println(s1 == s2);// false

        System.out.println(s1.equals(s2)); // string
        System.out.println(s1.hashCode()); // string
        System.out.println(s2.hashCode());

        Map<String,Integer> map = new HashMap<>();
        map.put(s1,23);
        map.put(s2,24);
        System.out.println(map);
    }

    public static void m7(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>();
        nameVsScore.put("john", 24);
        boolean flag = nameVsScore.containsValue(24);
        System.out.println(flag);
        Integer result = nameVsScore.getOrDefault("john1", 34);
        System.out.println(result);
    }

    public static void m6(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>(); // entries
        nameVsScore.put("john", 24);
        Map<String, Integer> nameVsWeight = new HashMap<>(); // entries
        nameVsWeight.put("john", 45);
        nameVsWeight.put("alex", 43);

        nameVsScore.putAll(nameVsWeight);


        System.out.println(nameVsScore);

        Integer result = nameVsScore.putIfAbsent("john", 46);

        System.out.println(result);

        System.out.println(nameVsScore);
    }

    public static void m5(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>();
        nameVsScore.put("john", 24);
        nameVsScore.put("alex", 24);
        System.out.println(nameVsScore.remove("john"));
        System.out.println(nameVsScore); // {}
        System.out.println(nameVsScore.size());
    }

    public static void m4(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>();
        nameVsScore.put("john", 24);
        System.out.println(nameVsScore.size());
        nameVsScore.clear(); // {}
        System.out.println(nameVsScore.size());
    }

    public static void m3(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>();
        nameVsScore.put("john", 24);
        if (nameVsScore.containsKey("john")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


    public static void m2(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>();
        Integer result =
                result = nameVsScore.put("john", 24);
        System.out.println(result);
        result = nameVsScore.put("mac", 20);
        System.out.println(result);
        result = nameVsScore.put("mac", 39);
        System.out.println(result);
    }


    public static void m1(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>();

        nameVsScore.put("john", 24);
        nameVsScore.put("doe", 28);
        nameVsScore.put("alex", 30);
        nameVsScore.put("mac", 20);
        nameVsScore.put("mac", 39);

        System.out.println(nameVsScore);


        Set<Map.Entry<String, Integer>> entrySet = nameVsScore.entrySet();


        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("-------------------");

        Integer value = nameVsScore.get("mac");
        System.out.println(value);

        System.out.println("************************");

        Set<String> keys = nameVsScore.keySet();
        for (String key : keys) {
            System.out.println(key + " " + nameVsScore.get(key));
        }
    }
}
