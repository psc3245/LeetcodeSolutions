package Medium.Longest_Consequetive_Sequence_128;

import java.util.PriorityQueue;

public class Solution {
    public static int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> priq = new PriorityQueue<>();
        for (int i : nums) priq.add(i);
        if (priq.size() < 2) return 0;

        int max = 0;
        int length = 1;
        int curr = priq.poll();
        while (!priq.isEmpty()) {
            if (priq.peek() - curr > 1) {
                curr = priq.poll();
                if (length > max) max = length;
                length = 1;
            }
            else if (priq.peek() == curr) curr = priq.poll();
            else {
                curr = priq.poll();
                length ++;
            }
        }
        if (length > max) max = length;


        return max;
    }
}