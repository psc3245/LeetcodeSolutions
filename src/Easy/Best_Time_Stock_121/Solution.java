package Easy.Best_Time_Stock_121;

public class Solution {
    public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;

        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(profit, maxP);
            }
            else {
                l = r;
            }
            r++;
        }

        return maxP;
    }
}
