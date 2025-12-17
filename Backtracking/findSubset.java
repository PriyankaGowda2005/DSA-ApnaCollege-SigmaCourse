package Backtracking;

public class findSubset {
    public static void findSubsets(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        // Include the current character
        findSubsets(str, curr + str.charAt(index), index + 1);

        // Exclude the current character
        findSubsets(str, curr, index + 1);
    }

    public static void main(String[] args) {
        String str = "Priyanka IAS";
        findSubsets(str, "", 0);
    }
}
