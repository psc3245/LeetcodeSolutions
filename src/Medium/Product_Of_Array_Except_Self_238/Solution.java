package Medium.Product_Of_Array_Except_Self_238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int subtotal = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            subtotal *= nums[i];
            prefix[i + 1] = subtotal;
        }
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;
        subtotal = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            subtotal *= nums[i];
            suffix[i - 1] = subtotal;
        }
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ret[i] = prefix[i] * suffix[i];
        }
        return ret;
    }
}
