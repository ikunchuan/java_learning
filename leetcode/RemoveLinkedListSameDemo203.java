package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveLinkedListSameDemo203 {

    public ListNode removeElements(ListNode head, int val) {

        // 初始化一个虚拟节点，连到第一个节点，这样不管要删除的是不是头节点，都是同样的操作
        ListNode fakeHead = new ListNode();
        fakeHead.next = head;

        // tail在front后面，如果front匹配，则把tail直接指向front后面的元素，然后front也指向自己后面的元素，就把刚刚的那个释放了
        ListNode front = head;
        ListNode tail = fakeHead;

        // 从head开始找，只要tail的next不为空就一直找，这样可以确保最后front到尾节点的时候，还可以进行一次查找
        while(tail.next != null){
            if(front.val == val) {
                tail.next = front.next;
                front = front.next;
            }else{
                front = front.next;
                tail = tail.next;
            }

        }

        return fakeHead;
    }

    public static void main(String[] args) {

    }

}
