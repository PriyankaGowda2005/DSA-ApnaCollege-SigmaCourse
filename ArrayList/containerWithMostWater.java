package ArrayList;

public class containerWithMostWater {
    public static void main(String[] args) {
        // Example array representing heights of vertical lines
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        // Call the maxArea function
        int maxArea = maxArea(height);

        // Print the result
        System.out.println("Maximum area of water container: " + maxArea);
    }

    // -----------------------------------------------------
    // Function to calculate maximum area of water container
    // -----------------------------------------------------
    public static int maxArea(int[] height) {

        int left = 0; // Left pointer
        int right = height.length - 1; // Right pointer
        int maxArea = 0; // Store maximum area

        // Loop until pointers meet
        while (left < right) {

            // Current height = min of two lines
            int currentHeight = Math.min(height[left], height[right]);

            // Current width = distance between lines
            int currentWidth = right - left;

            // Current area = height * width
            int currentArea = currentHeight * currentWidth;

            // Update max area if current area is larger
            maxArea = Math.max(maxArea, currentArea);

            /*
             * Move the pointer pointing to smaller height
             * Reason: Area is limited by shorter line.
             * To potentially increase area, move the shorter line.
             */
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
// Time Complexity: O(n) where n is number of lines
// Space Complexity: O(1) constant space
/*
 * height = [1,8,6,2,5,4,8,3,7]
 * left = 0, right = 8
 * 
 * Step 1:
 * height[left]=1, height[right]=7
 * min=1, width=8-0=8
 * area = 1*8=8
 * maxArea = 8
 * height[left]<height[right] → left++
 * 
 * Step 2:
 * left=1, right=8
 * height[left]=8, height[right]=7
 * min=7, width=7
 * area=7*7=49
 * maxArea=49
 * height[left]>height[right] → right--
 * 
 * Step 3:
 * left=1, right=7
 * height[left]=8, height[right]=3
 * min=3, width=6
 * area=3*6=18
 * maxArea=49 (unchanged)
 * height[left]>height[right] → right--
 * 
 * ...
 * Continue until left==right
 * 
 * Final maxArea = 49
 * 
 */