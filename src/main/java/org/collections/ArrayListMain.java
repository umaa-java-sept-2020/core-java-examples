package org.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {


    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("john");
        al.add("doe");
        al.add("doe");
        al.add("john");

        System.out.println(al.get(2));
        Object[] arrayAsObject = al.toArray();
        System.out.println(Arrays.toString(arrayAsObject));

        int size = al.size();
        String[] strArray = al.toArray(new String[size]);
        System.out.println(Arrays.toString(strArray));
    }

    public static void m5(String[] args) {
        // array list overrides equals and hashcode methods
        ArrayList<String> al = new ArrayList<>();
        al.add("john");
        al.add("doe");
        al.add("doe");
        al.add("john");

        al.remove("john");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
    }

    public static void m4(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("john");
        al.add("doe");
        al.add("doe");
        al.add("john");

        System.out.println(al.indexOf("doe"));
        System.out.println(al.lastIndexOf("doe"));
    }


    public static void m3(String[] args) {

        // insert , update, search, delete
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        al.add("john");
        al.add("doe");
        System.out.println(al.isEmpty());
        System.out.println(al.size());

        System.out.println(al.contains("john")); // search

        System.out.println(al.remove("john1")); // delete
        al.set(0, "alex"); // update by index

        System.out.println(al);

        System.out.println(al.remove("alex"));
        System.out.println(al);


    }

    public static void m2(String[] args) {
        /*
        public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
         */

        /*
        Marker Interfaces: (no method)
        RandomAccess, Cloneable, java.io.Serializable
         */
    }

    public static void m1(String[] args) {
        int[] arr = {10, 20, 30};
        arr[3] = 50;// runtime memory allocation
    }
}
