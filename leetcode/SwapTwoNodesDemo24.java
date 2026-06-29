package leetcode;
import leetcode.ListNode;

public class SwapTwoNodesDemo24 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {

        // 虚拟头节点
        ListNode fakeHead = new ListNode();
        fakeHead.next = head;

        ListNode curr = fakeHead;

        while(curr.next != null && curr.next.next != null) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = curr.next.next;
            curr.next.next = temp;
            curr = temp;
            temp = curr.next;
        }

        return fakeHead.next;
    }
}




