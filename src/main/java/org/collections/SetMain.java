package org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {
        Set stringTreeSet = new TreeSet<>();
        stringTreeSet.add("s1");
        stringTreeSet.add("s1");
        stringTreeSet.add("s2");
        stringTreeSet.add(new Object()); // Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
        stringTreeSet.add("s3");


        for (Object s : stringTreeSet) {
            System.out.println(s);
        }

        System.out.println(stringTreeSet);

        boolean b = stringTreeSet.contains("s1");
        System.out.println(b);
    }
    public static void m3(String[] args) {
        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("s1");
        stringTreeSet.add("s1");
        stringTreeSet.add("s2");
        stringTreeSet.add("s3");


        for (String s : stringTreeSet) {
            System.out.println(s);
        }

        System.out.println(stringTreeSet);

        boolean b = stringTreeSet.contains("s1");
        System.out.println(b);
    }
    public static void m2(String[] args) {
        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("s1");
        stringLinkedHashSet.add("s1");
        stringLinkedHashSet.add("s2");
        stringLinkedHashSet.add("s3");
        stringLinkedHashSet.add("s4");

        for (String s : stringLinkedHashSet) {
            System.out.println(s);
        }

        System.out.println(stringLinkedHashSet);

        boolean b = stringLinkedHashSet.contains("s1");
        System.out.println(b);

    }

    public static void m1(String[] args) {

        Set<String> stringHashSet = new HashSet<>();
        boolean b = stringHashSet.add("s1");
        System.out.println(b);
        b = stringHashSet.add("s1");

        System.out.println(b);

        b = stringHashSet.add("s2");
        System.out.println(b);

        for (String s : stringHashSet) {
            System.out.println(s);
        }

        System.out.println(stringHashSet);
    }
}
