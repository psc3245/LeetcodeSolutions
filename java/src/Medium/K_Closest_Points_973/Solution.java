package Medium.K_Closest_Points_973;

import java.util.PriorityQueue;

public class Solution {
    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> priq = new PriorityQueue<>(
                (a, b) -> Double.compare(calcDistance(b), calcDistance(a))
        );
        for (int[] arr : points) {
            priq.add(arr);
            if (priq.size() > k) {
                priq.poll();
            }
        }


        int[][] sol = new int[k][2];
        int index = 0;

        while (!priq.isEmpty()) {
            sol[index++] = priq.poll();
        }

        return sol;
    }

    public static Double calcDistance(int[] arr) {
        return Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1]);
    }

}
