package leetcode;

import java.util.Stack;

public class RemoveDuplicatesDemo1047 {
    public static void main(String[] args) {

        String s = "abbaca";

        String string = removeDuplicates(s);
        System.out.println(string);

    }

    static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty() || s.charAt(i) != stack.peek()) stack.push(s.charAt(i));
            else{
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();


        // 另一种写法：快慢指针



    }
}
