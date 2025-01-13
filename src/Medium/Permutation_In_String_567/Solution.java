package Medium.Permutation_In_String_567;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        if (s1.length() == 0) return true;

        int[] arr1 = new int[26];
        for (char c : s1.toCharArray()) {
            arr1[c - 'a'] ++;
        }

        int[] arr2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr2[s2.charAt(i) - 'a'] ++;
        }
        if (matches(arr1, arr2)) return true;

        // Slide the window - go through the remaining substrings of s2
        for (int i = s1.length(); i < s2.length(); i++) {
            // See if the last substring matched
            if (matches(arr1, arr2)) return true;
            // Slide the window
            arr2[s2.charAt(i) - 'a'] ++;
            arr2[s2.charAt(i - s1.length()) - 'a']--;
        }

        return matches(arr1, arr2);
    }


    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }


}
