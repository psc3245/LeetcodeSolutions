package Easy.Two_Sum_1;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                int index = map.get(target - nums[i]);
                return new int[] { Math.min(index, i), Math.max(index, i) };
            }
        }
        return new int[] {};
    }
}