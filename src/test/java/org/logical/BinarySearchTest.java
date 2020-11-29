package org.logical;

import org.junit.*;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Before
    public void before()
    {
        binarySearch = new BinarySearch();
    }

    @Test
    public void getSearchValueIndex() {
        int[] arr = {2, 5, 7, 8, 9 , 11, 13, 15};
        int index = binarySearch.getSearchValueIndex(arr, 13);
        Assert.assertEquals(6, index);
    }

    @Test
    public void getSearchValueIndex2() {
        int[] arr = {2, 5, 7, 8, 9 , 11, 13, 15};
        int index = binarySearch.getSearchValueIndex(arr, 15);
        Assert.assertEquals(7, index);
    }

    @Test
    public void getSearchValueIndex1() {
        int[] arr = {2, 5, 7, 8, 9 , 11, 13, 15};
        int index = binarySearch.getSearchValueIndex(arr, 14);
        Assert.assertEquals(-1, index);
    }
}