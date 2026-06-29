package leetcode;
import leetcode.ListNode;

public class LInkedListCycleDemo142 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {

        ListNode quickNode = head;
        ListNode slowNode = head;

        // 找到第一次相遇的那个点（在环里面）
        while(quickNode != null && quickNode.next != null){
            quickNode = quickNode.next.next;
            slowNode = slowNode.next;
            // 找到节点之后，用一个节点，从头开始，另一个节点，从相遇的地方开始，再碰到的地方就是环的入口
            if(quickNode == slowNode){
                ListNode node1 = quickNode;
                ListNode node2 = head;
                while (node1 != node2){
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }
        }

        return null;
    }
}
