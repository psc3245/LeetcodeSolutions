package Hard.Trapping_Rain_Water_42;

public class Solution {
    public int trap(int[] height) {
        int r = 1;

        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {
            int temp = height[i];
            if (temp > 0) {
                while (r < height.length) {
                    if (height[r] < temp && r != height.length - 1) {
                        totalWater += (temp - height[r]);
                        r++;
                    }
                    if (height[r] >= temp) {
                        i = r;
                        break;
                    }
                }
            }

        }

        return totalWater;
    }
}
