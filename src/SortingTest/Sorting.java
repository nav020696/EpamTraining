package SortingTest;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array){
        if (array == null){
            throw new IllegalArgumentException("Array = null");
        }
        Arrays.sort(array);
    }
}
