package org.arrays;

import java.util.Arrays;

public class IntArraysMain {
    public static void main(String[] args) {

    }

    private static void m4()
    {
        String[] names = {"john","doe","alex","carry"};

        System.out.println(Arrays.toString(names));

        for(int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
    private static void m3()
    {
        int[] nums1 = new int[]{10, 20, 30, 40};

        for (int i : nums1) {
            System.out.println(i);
        }

        for (int i = nums1.length -1; i >= 0; i--) {
            System.out.println(nums1[i]);
        }

    }
    private static void m2() {
        int[] nums1 = new int[]{10, 20, 30, 40};
        System.out.println(nums1.length); // field
        String s = new String("utkal");
        System.out.println(s.length()); // method call
        nums1[-1] = 900; // ArrayIndexOutOfBoundsException
        nums1[4] = 900; // ArrayIndexOutOfBoundsException


        /*
        ArrayIndexOutOfBoundsException extends
        IndexOutOfBoundsException extends
        RuntimeException extends
        Exception extends
        Throwable
         */
    }

    private static void m1() {
        int[] nums = {10, 20, 30, 40};
        int[] nums1 = new int[]{10, 20, 30, 40};
        int[] nums2 = new int[4]; //{10, 20, 30, 40};
        System.out.println(nums2.getClass());
        System.out.println(nums2.hashCode());

        nums1[0] = 500;

        nums2[0] = 100;
        nums2[1] = 200;
        nums2[2] = 300;
        nums2[3] = 400; // n - 1 = 3
        //  nums2[4] = 500;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}
