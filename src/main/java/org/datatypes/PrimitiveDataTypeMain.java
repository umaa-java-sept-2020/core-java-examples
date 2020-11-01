package org.datatypes;

// assignment:

/**
 *  decimal (+ve / -ve)  convert to binary.
 *  +ve number : binary
 *  -ve number: 2s compliment form
 *
 *  hexadecimal form ( +ve / -ve ) convert binary
 *
 *  floating point numbers ( +ve / -ve) convert it to binary
 */

public class PrimitiveDataTypeMain {
    public static void main(String[] args) {

        // -128 to 0 and 0  to 127 : 256
        byte b = 124;
        int i = b;
        System.out.println(Integer.toBinaryString(i));

        int k = 42424;
        System.out.println(Integer.toBinaryString(k));
        byte v = (byte)k;
        System.out.println(v);
        System.out.println(Integer.toBinaryString(v));
    }

    private static void sizesOfDataTypes()
    {
        // wrapper classes: represents 8 primitive types as objects
        // below all these are constants. defined in respective classes as 'public static final'
        System.out.println(Byte.SIZE); // 8
        System.out.println(Byte.MIN_VALUE);// 2^8 = 128, -128 to 127
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.SIZE); // 16
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.SIZE); // 32 bit
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.SIZE); // 64
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Float.SIZE); // 32
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.SIZE); // 64
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(Character.SIZE); // 16
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
    }
    private static void representingCharsAsInt() {
        char c = 'a';
        System.out.println((int) c);
        int iii = 970;
        System.out.println((char) iii);

        int j = 0;
        while (j < 65535) {
            System.out.println("j= " + j + " " + (char) j);
            j = j + 1;
        }

        int i = 123456;
        int ii = -123456;
        long l = 1234567890123456789L;
    }

    private static void primitiveDataTypes() {

        // eight primitive types
        // signed nature (+ve, -ve)
        byte b = 127;
        short s = 129;
        int i = 12456;
        long l = 1234567890123456L;

        float f = 10.4f; // single precision
        double d = 10.4d; // double precision

        char c = 'a'; // 0 - 65535 (may be wrong)
        boolean bool = true; // true or false
    }
}
