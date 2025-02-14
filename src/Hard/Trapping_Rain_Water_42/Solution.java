package Hard.Trapping_Rain_Water_42;

import java.util.PriorityQueue;

public class Solution {
    public static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int lMax = 0;
        int rMax = 0;
        int total = 0;

        while (l <= r) {
            if (lMax < rMax) {
                if (height[l] <= lMax) {
                    total += Math.min(lMax, rMax) - height[l];
                }
                else {
                    lMax = height[l];
                }

                l++;
            }
            else {
                if (height[r] <= rMax) {
                    total += Math.min(lMax, rMax) - height[r];
                }
                else {
                    rMax = height[r];
                }

                r--;
            }

        }

        return total;
    }
    public static int attempt2(int[] height) {
        int r = 0;
        int rMax = r;
        int l = height.length - 1;
        int lMax = l;
        int total = 0;
        while (r < l) {
            if (height[lMax] < height[l]) {
                lMax = height[l];
                l--;
            } else {

            }
            if (height[rMax] < height[r]) {
                rMax = height[r];
                r++;
            }

        }
        return total;
    }

    public int attempt1(int[] height) {
        int total = 0;
        int r = 0;
        int l = 1;
        while (l < height.length) {


            if (height[r] == 0) {
                r++;
                l++;
            }
            else if (height[r] > height[l]) {
                l++;
            }
            else if (height[r] <= height[l]) {
                int max = Math.min(height[r], height[l]);
                for (int i = r; i < l; i++) {
                    total += max - height[i];
                }
                r = l;
                l ++;
            }
            if (l > height.length - 1 && l - r > 1) {
                r++;
                l = r + 1;
            }

        }

        return total;
    }
}
