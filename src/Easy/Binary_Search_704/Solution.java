package Easy.Binary_Search_704;

public class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2 - 1;
        return recursiveBin(0, nums.length - 1, nums, target );

    }

    public int recursiveBin(int l, int r, int[] nums, int target) {
        if (l > r) return -1;
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) {
            int newMid = (nums.length - 1 + mid) / 2;
            return recursiveBin(l, mid - 1, nums, target);
        }
        else {
            int newMid = mid / 2;
            return recursiveBin(mid + 1, r, nums, target);
        }
    }
}
