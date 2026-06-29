package leetcode;

import java.util.ArrayList;

public class MoreNode {

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(7);

        int[] result = solution.nextLargerNodes(head);

        for (int i : result) {
            System.out.println(i);
        }
    }

}

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

class Solution {

    public int[] nextLargerNodes(ListNode head) {
        // 记录当前值，为var，然后依次往后面找，找不到就返回0，可以定义一个方法来做(GetBigger)
        // 对于每一个节点，都使用一次这个方法，而且在使用方法之后，把数据存到数组里面
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head.next != null){
            int biggerNum = GetBigger(head);
            arrayList.add(biggerNum);
            head = head.next;
        }
        arrayList.add(0);
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    int GetBigger(ListNode head){
        ListNode point = head;
        int nowNum = head.val;
        while (point.next != null){
            point = point.next;
            if(nowNum < point.val){
                return point.val;
            }
        }

        return 0;
    }
}