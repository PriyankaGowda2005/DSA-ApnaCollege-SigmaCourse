package DivideAndConquer;

import org.junit.jupiter.api.Test;

public class majorityElementArrayTest {
    @Test
    void testMain() {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element = " + majorityElementArray.majorityElement(arr));
    }

    @Test
    void testMajorityElement() {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int majorityElement = majorityElementArray.majorityElement(arr);
        assert majorityElement == 2 : "Expected majority element to be 2, but got " + majorityElement;
    }
}
