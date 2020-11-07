package org.strings;

public class StringClassMain {

    public static void main(String[] args) {
       // m1();
       // m2();
        m3();
    }

    // equals() of string: content comparison
    public static void m3()
    {
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

    // hashCode of string depends on content
    public static void m2()
    {
        String s1 = "abc";
        String s2 = new String("abc");

        // string class overridden hashCode method from Object class
        System.out.println(s1.hashCode()); // hashcode here depends on content of string.
        // first time hash evaluated and stored in instance variable hash. next time if we call it will be returned that value
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
    }

    // comparing references . literal, heap objects, scp
    public static void m1()
    {
        String s1 = new String("abc"); // object on heap
        String s2 = "abc"; // literal object at string constant pool (cache)

        System.out.println(s1 == s2); // reference : false, one is in scp other is in heap

        String s3 = "abc"; // in scp you cant have 2 objects having same content. if it presnet in scp, that object reference will be returned else it will be created in scp
        System.out.println(s2 == s3); // true

        String s4  = new String("abc"); // object on heap
        System.out.println(s1 == s4); // false, both are created on heap using new operators, so both are having different reference

        String s5 = s1;
        System.out.println(s5 == s1);
    }
}
