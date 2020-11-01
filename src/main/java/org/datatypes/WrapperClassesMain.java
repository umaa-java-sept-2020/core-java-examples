package org.datatypes;


// https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
public class WrapperClassesMain {

    public static void main(String[] args) {

        // Byte (byte), Short (short),
        // Integer (int), Long (long), Float (float)
        // , Double (double), Character (char), Boolean (boolean)









    }

    private static void autoBoxingUnboxing()
    {


        char c = 'x'; // primitive

        // primitive to object: auto boxing
        Character c1 = new Character(c); // object
        c1 = c; // object

        System.out.println(c1.hashCode());

        // c converted to c1 where c1 is an object.

        // object to primitive: auto unboxing
        // convert c1 (object) to primitive again
        char c2 =  c1.charValue();// convert to char // auto unboxing
        Character c3 = c1.charValue(); // char -> character
    }
    private static void charMethodsAndConstructors()
    {
        char c = 'x';
        Character c1 = new Character('y');
        c1 = new Character(c);

        boolean flag = Character.isDigit(8);
        flag = Character.isDigit('2');
        System.out.println(flag);
        flag = Character.isAlphabetic('8');
        flag = Character.isAlphabetic('A');
        flag = Character.isLetter('a');
        flag = Character.isLetterOrDigit('8');
        System.out.println(flag);
        int result = Character.getNumericValue('1'); // hexadecimal

        result = Character.compare('x', 'z');
        result = c1.compareTo(c);
        System.out.println(result);

    }
    private static void integerMethodsAndConstrcutors() {
        int x = 10;
        Integer xx = 100;
        Integer i = new Integer(x);
        Integer ii = new Integer("100");

        int result = i.compareTo(ii); // i > ii : -1
        result = ii.compareTo(i); // ii > i : 1
        result = i.compareTo(10); // i == 10 : 0

        result = Integer.compare(10, 100);

        System.out.println(result);

        String s = Integer.toBinaryString(100);
        System.out.println(s);
        s = Integer.toBinaryString(-100); // find the 2s complement of 100
        System.out.println(s);

        s = Integer.toOctalString(100);
        System.out.println(s);

        result = Integer.reverse(105);
        System.out.println(result);

        System.out.println(Integer.toBinaryString(105));

        s = Integer.toBinaryString(105);
        result = Integer.parseInt(s, 10);

        System.out.println(result);

        result = Integer.valueOf("10");
        result = Integer.valueOf(10);

        result = Integer.valueOf("100", 8);
        System.out.println(result);

    }

    private static void byteMethods() {

        Byte b = new Byte((byte) 10);
        int result = b.compareTo((byte) 8); // diff
        result = Byte.compare((byte) 10, (byte) 15); // diff
        System.out.println(result);

        Long l = b.longValue();
        int i = b.intValue();
        System.out.println(l);
        System.out.println(i);

        Byte b1 = Byte.valueOf(b);
        System.out.println(b1);
        byte b2 = Byte.valueOf("100");
        System.out.println(b2);
        byte b3 = Byte.valueOf("130", 8);
        System.out.println(b3);
    }

    private static void byteConstructors() {
        System.out.println(Integer.toHexString(100));
        byte primByte = 100;
        Byte b = new Byte(primByte); // -128 to 127
        b = new Byte("100");
        b = new Byte(Integer.toHexString(100));
        b = new Byte("1000"); // NumberFormatException
    }
}
