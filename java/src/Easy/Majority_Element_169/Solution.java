package Easy.Majority_Element_169;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            }
            hashMap.putIfAbsent(i, 1);
        }
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) > nums.length / 2) return i;
        }
        return 0;
    }
}
