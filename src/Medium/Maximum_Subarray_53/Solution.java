package Medium.Maximum_Subarray_53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;

        for (int i : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += i;
            maxSub = Math.max(curSum, maxSub);
        }
        return maxSub;
    }
}
