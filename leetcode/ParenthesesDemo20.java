package leetcode;

import java.util.Stack;

public class ParenthesesDemo20 {
    public static void main(String[] args) {

        String s = "[(()){}[]][[]";
        boolean valid = isValid(s);
        System.out.println(valid);

    }

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push(')');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(s.charAt(i) == '[') stack.push(']');
            else {
                if(stack.isEmpty() || stack.peek() != s.charAt(i)) return false;
                else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();

    }
}
