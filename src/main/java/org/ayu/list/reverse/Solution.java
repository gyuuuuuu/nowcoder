package org.ayu.list.reverse;

public class Solution {
    public static ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode pointer = null;
        ListNode newHead = head;
        while (head.next != null) {
            pointer = head.next;
            head.next = pointer.next;
            pointer.next = newHead;
            newHead = pointer;
        }
        return pointer;
    }

    public static void main(String[] args) {
        ListNode listNode_1 = new ListNode(1);
        ListNode listNode_2 = new ListNode(2);
        ListNode listNode_3 = new ListNode(3);

        listNode_1.next = listNode_2;
        listNode_2.next = listNode_3;

        System.out.println(ReverseList(listNode_1));
    }
}
