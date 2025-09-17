package Medium.Two_Sum_II_167;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[r] + numbers[l];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            }
            if (sum < target) {
                l ++;
            }
            else {
                r--;
            }
        }

        return new int[]{-1, -1};
    }
}
