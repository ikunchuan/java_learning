package leetcode;
import leetcode.ListNode;

public class RemoveNodeFromEndDemo19 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 虚拟头节点
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        // 快慢指针
        ListNode curr = dummyHead;
        ListNode front = curr;
        for (int i = 0; i < n; i++) {
            front = front.next;
        }

        // 找到操作节点curr，要删除的节点就是它的next
        while (front.next != null){
            curr = curr.next;
            front = front.next;
        }

        curr.next = curr.next.next;

        return dummyHead.next;
    }
}
