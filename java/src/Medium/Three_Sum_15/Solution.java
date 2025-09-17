package Medium.Three_Sum_15;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return null;

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list);

        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            h.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && h.contains(list.get(i) + list.get(j))) {
                    System.out.printf("");
                }
            }
        }

        return null;

    }

}
