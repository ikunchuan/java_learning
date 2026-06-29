package leetcode;

import java.util.HexFormat;

public class LinkedListDesign707 {

    public static void main(String[] args) {

    }

}


class MyLinkedList {

    // 链表节点
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val=val;
        }
        ListNode(){
        }
    }

    //size存储链表元素的个数
    private int size;
    //注意这里记录的是虚拟头结点
    private ListNode head;

    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    // 获取第n个节点的元素（从0开始）
    public int get(int index) {

        //如果index非法，返回-1
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode curr = head;

        while (index != 0){
            curr = curr.next;
            index--;
        }

        return curr.val;
    }

    // 添加头节点
    public void addAtHead(int val) {


    }

    // 添加尾节点
    public void addAtTail(int val) {


    }

    // 在第n个位置添加节点
    public void addAtIndex(int index, int val) {

    }

    // 删除第n个位置的节点
    public void deleteAtIndex(int index) {


    }
}

