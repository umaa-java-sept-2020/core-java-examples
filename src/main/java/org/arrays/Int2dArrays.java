package org.arrays;

import java.util.Arrays;

public class Int2dArrays {


    public static void main(String[] args) {
        int[] arr = {2,4,6,8};

        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("========================");
        Arrays.stream(arr).forEach(elem->{
            System.out.println(elem);
        });

        System.out.println("============================");
        int[][] two_d_array = {
                {2,5,9},
                {11,13,15},
                {21,23,25}
        };

        Arrays.stream(two_d_array).forEach(int1dArray->{
            Arrays.stream(int1dArray).forEach(elem->{
                System.out.println(elem);
            });
            System.out.println("*************************");
        });
    }
    public static void m12(String[] args) {
        int[][] two_d_array = {
                {2,5,9},
                {11,13,15},
                {21,23,25}
        };

        int i = 2;
        int j = 1;
        System.out.println(two_d_array[i][j]);
        int index = two_d_array[0].length * i + j;
        System.out.println(index);

        int tempi = index / two_d_array[0].length;
        int tempj = index % two_d_array[1].length;

        System.out.println(tempi);
        System.out.println(tempj);


    }
    public static void m11(String[] args) {
        int[][] arr = new int[2][3]; // you cant modify size
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{2, 4, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            int[] int1dArray = arr[i]; // to get 1d array
            for (int j = 0; j < int1dArray.length; j++) {
                System.out.println(int1dArray[j]);
            }
            System.out.println("=======================");
        }
    }

    public static void m10(String[] args) {
        int[][] arr = new int[2][3]; // you cant modify size
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{2, 4, 6, 7};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        arr[1][3] = 70;
        arr[0][3] = 4;
    }

    public static void m9(String[] args) {
        int[][] arr = new int[2][3]; // you cant modify size
        arr[0] = new int[]{1, 2, 3, 4, 5};
        arr[1] = new int[]{2, 4, 6, 8, 10, 11, 12};

        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }

    public static void m8(String[] args) {
        int[][] arr = new int[2][]; // you cant modify size
        arr[0] = new int[]{1, 2, 3, 4, 5};
        arr[1] = new int[]{2, 4, 6, 8, 10, 11, 12};
        arr[2] = new int[]{2, 4, 6, 8}; // ArrayIndexOutOfBoundsException
    }

    public static void m7(String[] args) {
        // compilation error with size as 3 or 4
        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8},
                {6, 8, 9, 10}
        };
        arr[2] = new int[]{2, 4, 6, 9};
        arr[4] = new int[]{2, 4, 6, 9};

    }

    public static void m6(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8},
                {6, 8, 9, 10}
        };

        for (int i = 0; i < arr.length; i++) {
            int[] int1dArray = arr[i];
            for (int j : int1dArray) {
                System.out.println(j);
            }
            System.out.println("=============================");
        }
    }

    public static void m5(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8},
                {6, 8, 9, 10}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void m4(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8},
                {6, 8, 9, 10}
        };

        for (int[] int1dArray : arr) {
            for (int i : int1dArray) {
                System.out.println(i);
            }

            System.out.println("==========================");
        }
    }

    public static void m3(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8},
                {6, 8, 9, 10}
        };

        for (int[] int1d : arr) {
            System.out.println(Arrays.toString(int1d));
        }
    }

    public static void m2(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8},
                {6, 8, 9, 10}
        };

        System.out.println(arr.getClass());

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[0].getClass());
    }

    public static void m1(String[] args) {

        int[] arr = {2, 1, 3, 5, 7};

        for (int i : arr) {
            System.out.println(i);
        }
    }


}
