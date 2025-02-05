package Medium.Jump_Game_55;

public class Solution {
    public static boolean canJump(int[] nums) {
        int furthestIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > furthestIndex) return false;
            furthestIndex = Math.max(furthestIndex, i + nums[i]);
            if (furthestIndex >= nums.length - 1) return true;
        }
        return false;
    }
}
