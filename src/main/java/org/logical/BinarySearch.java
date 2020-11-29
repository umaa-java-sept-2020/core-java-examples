package org.logical;

public class BinarySearch {

    public int getSearchValueIndex(int[] arr, int key) {
        int index = -1;

        int l = 0;
        int h = arr.length - 1;

        while (h - l > 1) {
            int midIndex = (l + h) / 2;
            int midValue = arr[midIndex];
            if (key > midValue) {
                l = midIndex;
            } else if (key < midValue) {
                h = midIndex;
            } else {
                index = midIndex;
                break;
            }
        }

        if (h - l == 1 && index == -1) {
            if (arr[h] == key) {
                index = h;
            } else if (arr[l] == key) {
                index = l;
            }
        }

        return index;
    }
}
