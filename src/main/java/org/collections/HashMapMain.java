package org.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

    public static void main(String[] args) {
        Map<String, Integer> nameVsScore = new HashMap<>();

        nameVsScore.put("john", 24);
        nameVsScore.put("doe", 28);
        nameVsScore.put("alex", 30);
        nameVsScore.put("mac", 20);

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
            System.out.println(key+ " "+nameVsScore.get(key) );
        }
    }
}
