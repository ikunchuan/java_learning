package leetcode;

import java.util.Stack;

public class StackToQueueDemo232 {

    //用栈实现队列

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;


    public StackToQueueDemo232() {

        stackIn = new Stack<>(); // 负责进栈
        stackOut = new Stack<>(); // 负责出栈

    }

    public void push(int x) {

        stackIn.push(x);

    }

    public int pop() {

        dumpstackIn();
        return stackOut.pop();

    }

    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    private void dumpstackIn(){
        if(!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
    }

}

class Demo232{
    public static void main(String[] args) {

//         Your MyQueue object will be instantiated and called as such:
        StackToQueueDemo232 obj = new StackToQueueDemo232();
         obj.push(5);
         int param_2 = obj.pop();
         int param_3 = obj.peek();
         boolean param_4 = obj.empty();

    }
}