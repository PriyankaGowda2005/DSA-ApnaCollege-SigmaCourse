package DivideAndConquer;

import org.junit.jupiter.api.Test;

public class mergeSortTest {
    @Test
    void testMain() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergeSort.main(new String[] {});
    }

    @Test
    void testMerge() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergeSort.merge(arr, 0, 2, 5);
        int[] expected = { 5, 6, 7, 11, 12, 13 };
        assert java.util.Arrays.equals(arr, expected)
                : "Expected " + java.util.Arrays.toString(expected) + ", but got " + java.util.Arrays.toString(arr);
    }

    @Test
    void testSort() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergeSort.sort(arr, 0, arr.length - 1);
        int[] expected = { 5, 6, 7, 11, 12, 13 };
        assert java.util.Arrays.equals(arr, expected)
                : "Expected " + java.util.Arrays.toString(expected) + ", but got " + java.util.Arrays.toString(arr);
    }
}
