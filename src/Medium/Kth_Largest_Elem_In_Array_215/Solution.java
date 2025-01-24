package Medium.Kth_Largest_Elem_In_Array_215;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.poll();
    }
}
