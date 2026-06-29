package leetcode;

public class ReverseLinkedList206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null && head.next == null){
            return head;
        }
        // 新建一个节点
        ListNode otherNode = new ListNode();
        otherNode.val = head.val;
        otherNode.next = null;
        // 把原来链表的每个元素依次使用头插
        ListNode curr = head.next;
        while (curr != null){
            if(curr.next != null){
                ListNode currNext = curr.next;
                curr.next = otherNode;
                otherNode = curr;
                curr = currNext;
                currNext = currNext.next;
            }else{
                curr.next = otherNode;
                otherNode = curr;
            }

        }

        return otherNode;
    }
}


class ListNode206 {
    int val;
    ListNode next;
    ListNode206() {}
    ListNode206(int val) { this.val = val; }
    ListNode206(int val, ListNode next) { this.val = val; this.next = next; }
}



