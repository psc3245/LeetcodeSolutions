package Medium.Longest_Palindrome_Substring_5;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String odd = findPalindrome(s, i, i);
            String even = findPalindrome(s, i, i+1);
            String current = odd.length() > even.length() ? odd : even;
            if (current.length() > longest.length()) longest = current;
        }

        return longest;
    }

    public String findPalindrome(String s, int l, int r) {

        String ret = "";

        while (l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)) {
            r++;
            l--;
        }
        return s.substring(l + 1, r);
    }
}
