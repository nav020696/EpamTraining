package TestSorting;

import SortingTest.Sorting;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test (expected = IllegalArgumentException.class)
    public void testNullCase() {
            sorting.sort(null);
    }

    @Test
    public void testEmptyCase() {
        int[] array = new int[0];
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array1 = {1};
        int[] array2 = {2};
        int[] array3 = {3};
        int[] array4 = {4};
        sorting.sort(array1);
        sorting.sort(array2);
        sorting.sort(array3);
        sorting.sort(array4);
        Assert.assertArrayEquals(new int[]{1}, array1);
        Assert.assertArrayEquals(new int[]{2}, array2);
        Assert.assertArrayEquals(new int[]{3}, array3);
        Assert.assertArrayEquals(new int[]{4}, array4);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array1 = {1, 1, 3, 4, 5, 6, 7, 10, 11};
        int[] array2 = {-1, 1, 1, 2, 2, 6, 9, 10};
        int[] array3 = {-15, -10, 0, 1, 3, 10};
        int[] array4 = {-109, -76, -10, 0, 0, 0, 9, 10};
        sorting.sort(array1);
        sorting.sort(array2);
        sorting.sort(array3);
        sorting.sort(array4);
        Assert.assertArrayEquals(new int[]{1, 1, 3, 4, 5, 6, 7, 10, 11}, array1);
        Assert.assertArrayEquals(new int[]{-1, 1, 1, 2, 2, 6, 9, 10}, array2);
        Assert.assertArrayEquals(new int[]{-15, -10, 0, 1, 3, 10}, array3);
        Assert.assertArrayEquals(new int[]{-109, -76, -10, 0, 0, 0, 9, 10}, array4);

    }

    @Test
    public void testOtherCases() {
        int[] array1 = {3, 1, 10, 7, 5, 6, 11, 1, 4};
        int[] array2 = {2, 2, 1, 1, 6, 9, -1, 10};
        int[] array3 = {3, -10, -15, 1, 0, 10};
        int[] array4 = {0, 0, -109, -76, 10, 0, -10, 9};
        sorting.sort(array1);
        sorting.sort(array2);
        sorting.sort(array3);
        sorting.sort(array4);
        Assert.assertArrayEquals(new int[]{1, 1, 3, 4, 5, 6, 7, 10, 11}, array1);
        Assert.assertArrayEquals(new int[]{-1, 1, 1, 2, 2, 6, 9, 10}, array2);
        Assert.assertArrayEquals(new int[]{-15, -10, 0, 1, 3, 10}, array3);
        Assert.assertArrayEquals(new int[]{-109, -76, -10, 0, 0, 0, 9, 10}, array4);
    }

}

