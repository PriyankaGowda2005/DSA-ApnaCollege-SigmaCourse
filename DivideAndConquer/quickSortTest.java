package DivideAndConquer;

import org.junit.jupiter.api.Test;

public class quickSortTest {
    @Test
    void testMain() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        quickSort.main(new String[] {});
    }

    @Test
    void testPartition() {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int pivotIndex = quickSort.partition(arr, 0, arr.length - 1);
        assert pivotIndex == 1 : "Expected pivot index to be 1, but got " + pivotIndex;
    }

    @Test
    void testPrintArray() {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        quickSort.printArray(arr);
    }

    @Test
    void testSort() {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        quickSort.sort(arr, 0, arr.length - 1);
        int[] expected = { 1, 5, 7, 8, 9, 10 };
        assert java.util.Arrays.equals(arr, expected)
                : "Expected " + java.util.Arrays.toString(expected) + ", but got " + java.util.Arrays.toString(arr);
    }
}
