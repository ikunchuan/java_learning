package leetcode;

import java.util.Objects;
import java.util.Stack;

public class EvalRPNDemo150 {
    public static void main(String[] args) {

    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (Objects.equals(tokens[i], "+") || Objects.equals(tokens[i], "-") || Objects.equals(tokens[i], "*") || Objects.equals(tokens[i], "/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (Objects.equals(tokens[i], "+")) result = num2 + num1;
                if (Objects.equals(tokens[i], "-")) result = num2 - num1;
                if (Objects.equals(tokens[i], "*")) result = num2 * num1;
                if (Objects.equals(tokens[i], "/")) result = num2 / num1;
                stack.push(result);
            }else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.peek();
    }
}
