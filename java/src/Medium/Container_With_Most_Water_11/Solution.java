package Medium.Container_With_Most_Water_11;

public class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int maxTotal = 0;

        while (l < r) {
            int water = Math.min(height[l], height[r]) * (r - l);
            if (water > maxTotal) maxTotal = water;
            if (height[l] < height[r]) {
                l ++;
            }
            else {
                r --;
            }
        }

        return maxTotal;
    }
}
