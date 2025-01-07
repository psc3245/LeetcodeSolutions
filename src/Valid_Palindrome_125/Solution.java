package Valid_Palindrome_125;

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            char lc = s.charAt(left);
            char rc = s.charAt(right);
            if (!Character.isLetterOrDigit(lc)) left++;
            else if (!Character.isLetterOrDigit(rc)) right--;
            else {
                if (Character.toLowerCase(lc) != Character.toLowerCase(rc)) return false;
                left ++;
                right --;
            }
        }

        return true;
    }
}