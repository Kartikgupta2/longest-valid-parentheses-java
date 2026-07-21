import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public static int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

       
        String s1 = "(()";
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: " + longestValidParentheses(s1));
        System.out.println();

       
        String s2 = ")()())";
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output: " + longestValidParentheses(s2));
        System.out.println();

       
        String s3 = "";
        System.out.println("Input: s = \"" + s3 + "\"");
        System.out.println("Output: " + longestValidParentheses(s3));
    }
}
