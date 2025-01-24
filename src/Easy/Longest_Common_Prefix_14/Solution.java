package Easy.Longest_Common_Prefix_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortest = 10000000;
        for (String s : strs) {
            if (s.length() < shortest) shortest = s.length();
        }
        String prefix = "";

        for (int i = 0; i < shortest; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return prefix;
                }
            }
            prefix += c;
        }

        return prefix;
    }
}
