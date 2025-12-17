package Stack;

import java.util.Stack;

public class maxRectangularAreaInHistogram {

    // -----------------------------
    // Function to calculate max rectangular area in histogram
    // -----------------------------
    public static int getMaxArea(int[] hist) {
        int n = hist.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        // Traverse all bars of histogram
        while (index < n) {
            // If current bar is higher than bar at stack top, push index
            if (stack.isEmpty() || hist[stack.peek()] <= hist[index]) {
                stack.push(index++);
            } else {
                // Pop the top and calculate area with hist[top] as smallest bar
                int top = stack.pop();
                int area = hist[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        // Pop remaining bars from stack and calculate area
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = hist[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // -----------------------------
    // Main method to test
    // -----------------------------
    public static void main(String[] args) {
        int[] hist = { 6, 2, 5, 4, 5, 1, 6 };
        int maxArea = getMaxArea(hist);
        System.out.println("Maximum rectangular area in histogram: " + maxArea);
    }
}
/*
🔹 Dry Run Example: hist = [6, 2, 5, 4, 5, 1, 6]
Step	Stack (Indices)	Action & Area Calculation	maxArea
6	[]	Push 0	0
2	[0]	Pop 0 → Area = 6 * 1 = 6	6
2	[]	Push 1	6
5	[1]	Push 2	6
4	[1,2]	Pop 2 → Area = 5 * 1 = 5	6
4	[1]	Push 3	6
5	[1,3]	Push 4	6
1	[1,3,4]	Pop 4 → Area = 51=5; Pop 3 → Area=43=12	12
1	[1]	Pop 1 → Area=2*7=14	14
6	[]	Push 5, 6	14

✅ Maximum area: 12 (from bars [5,4,5])
*/