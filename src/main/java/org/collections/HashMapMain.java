package org.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {


    public static void main(String[] args) {
        String s1 = new String("john");
        String s2 = new String("john");
        System.out.println(s1 == s2);// false

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
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
