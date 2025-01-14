package Easy.Last_Stone_Weight_1046;

import java.util.PriorityQueue;

public class Solution {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a, b)-> b - a );
        for (int i : stones) {
            maxHeap.add(i);
        }
        while (maxHeap.size() > 1) {
            Integer stoneA = maxHeap.poll();
            Integer stoneB = maxHeap.poll();
            if (stoneA != stoneB) {
                Integer newStone = Math.abs(stoneB - stoneA);
                maxHeap.add(newStone);
            }
        }

        if (maxHeap.size() == 1) return maxHeap.poll();

        return 0;
    }
}
