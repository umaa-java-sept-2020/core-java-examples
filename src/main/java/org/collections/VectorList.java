package org.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorList {

    public static void main(String[] args) {
        // synchronized : thread safe
        Vector<String> vector = new Vector<>(); // capacity 10

        vector.add("john");
        vector.add("doe");

        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println("===============");
        Enumeration<String> elementVector = vector.elements();

        while (elementVector.hasMoreElements()) {
            System.out.println(elementVector.nextElement());
        }

        System.out.println("***************************");
        elementVector = vector.elements();
        elementVector.hasMoreElements();
        elementVector.hasMoreElements();
        System.out.println(elementVector.nextElement());


        System.out.println("***********====================****************");
        elementVector = vector.elements();
        elementVector.nextElement();
        System.out.println(elementVector.nextElement());
    }
}
