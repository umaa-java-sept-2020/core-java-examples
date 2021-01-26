package org.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMain {
    public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<>();

        map.put("k1",10);
        map.put("k4",40);
        map.put("k2",20);
        map.put("k3",30);

        System.out.println(map);

        Set<String> keys = map.keySet();

        for(String key: keys)
        {
            Integer value = map.get(key);

            System.out.println(key+" "+value);

        }
    }
}
