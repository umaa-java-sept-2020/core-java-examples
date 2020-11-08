package org.strings;

import java.util.Arrays;

public class StringClassMain {

    public static void main(String[] args) {
        // m1();
        // m2();
        //  m3();
        //  m4();
        // m5();
        // m6();
        // m7();

        //  m8();
        // m9();

        m10();
    }

    public static void m10() {
        String s = "abc abc";
        byte[] bytes = s.getBytes();
        System.out.println(bytes);
        System.out.println(Arrays.toString(bytes));

        int index = s.indexOf('b');
        System.out.println(index);
        index = s.lastIndexOf('b');
        System.out.println(index);

    }

    public static void m9() {
        String s1 = "abc def";
        boolean flag = s1.contains("de");
        System.out.println(flag);
        flag = s1.contains("fe");
        System.out.println(flag);
    }

    public static void m8() {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s3 == s4); // false ? why? findout
        System.out.println(s3.equals(s4));
    }

    public static void m7() {
        String s = new String("india is our country");
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(7));

        String s1 = "Abc";
        String s2 = "ADef";
        System.out.println(s1.compareTo(s2)); // 30

        String s3 = "ABF";
        System.out.println(s1.compareToIgnoreCase(s3)); // c - f

        String s4 = "Abcdefghi";
        System.out.println(s1.compareToIgnoreCase(s4)); // s1.length() - s2.length()


        String s5 = "Abfdefghi";
        System.out.println(s1.compareToIgnoreCase(s5)); // c - f
    }

    // toString() from object class overidden in string class
    public static void m6() {
        String s = new String("abc");
        System.out.println(s.toString());
    }

    // using equalIgnoreCase
    public static void m5() {
        String s = "Abc";
        String s1 = "ABC";
        System.out.println(s1.equals(s)); // false
        System.out.println(s1.equalsIgnoreCase(s)); // true
    }

    // string interning: read oracle doc again
    public static void m4() {
        String s = new String("abc"); // heap
        String s1 = s.intern(); // is abc present in scp ? no. then add it to scp.
        String s2 = s.intern(); // is abc present in scp ? yes. then dont add it to scp. just return existing refrence from scp.

        System.out.println(s1 == s2); // true
        System.out.println(s == s2); // false
        System.out.println(s == s1); // false
    }

    // equals() of string: content comparison: overridden from object class
    public static void m3() {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");
        String s4 = new String("abcd");

        // s1 == s2 ? false
        // s1 == s3 ? false
        // s2 == s3 ? false

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
    }

    // hashCode() of string depends on content: overridden from object class
    public static void m2() {
        String s1 = "abc";
        String s2 = new String("abc");

        // string class overridden hashCode method from Object class
        System.out.println(s1.hashCode()); // hashcode here depends on content of string.
        // first time hash evaluated and stored in instance variable hash. next time if we call it will be returned that value
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
    }

    // comparing references . literal, heap objects, scp
    public static void m1() {
        String s1 = new String("abc"); // object on heap
        String s2 = "abc"; // literal object at string constant pool (cache)

        System.out.println(s1 == s2); // reference : false, one is in scp other is in heap

        String s3 = "abc"; // in scp you cant have 2 objects having same content. if it presnet in scp, that object reference will be returned else it will be created in scp
        System.out.println(s2 == s3); // true

        String s4 = new String("abc"); // object on heap
        System.out.println(s1 == s4); // false, both are created on heap using new operators, so both are having different reference

        String s5 = s1;
        System.out.println(s5 == s1);
    }
}
