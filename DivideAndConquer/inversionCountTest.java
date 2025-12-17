package DivideAndConquer;

import org.junit.jupiter.api.Test;

public class inversionCountTest {
    @Test
    void testGetInvCount() {
        int arr[] = { 1, 20, 6, 4, 5 };
        int invCount = inversionCount.getInvCount(arr);
        assert invCount == 5 : "Expected 5 inversions, but got " + invCount;
    }

    @Test
    void testMain() {
        int arr[] = { 1, 20, 6, 4, 5 };
        System.out.println("Inversion Count = " + inversionCount.getInvCount(arr));
    }
}
