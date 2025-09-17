package Easy.Valid_Parenthesis_20;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c2 = stack.pop();
                if (c == ')' && c2 != '(') {
                    return false;
                }
                if (c == ']' && c2 != '[') {
                    return false;
                }
                if (c == '}' && c2 != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
