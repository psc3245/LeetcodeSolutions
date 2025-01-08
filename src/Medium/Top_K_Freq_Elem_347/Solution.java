package Medium.Top_K_Freq_Elem_347;

import java.util.HashMap;

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }

        int[] sol = new int[k];
        int index = 0;

        while (index < k) {
            int maxKey = 0;
            int currMax = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > currMax) {
                    currMax = map.get(key);
                    maxKey = key;
                }
            }
            sol[index++] = maxKey;
            map.remove(maxKey);
            if (map.isEmpty()) {
                break;
            }
        }

        return sol;
    }


}
