package DivideAndConquer;

import org.junit.jupiter.api.Test;

public class inversionOptimizedTest {

    @Test
    void testMergeSort() {
        int arr[] = { 1, 20, 6, 4, 5 };
        int invCount = inversionOptimized.mergeSort(arr, 0, arr.length - 1);
        assert invCount == 5 : "Expected 5 inversions, but got " + invCount;
    }
}
