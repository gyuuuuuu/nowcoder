package org.ayu.list.reverse;

import org.ayu.list.ListNode;

import java.util.Stack;

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

    public static ListNode ReverseListByStack(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        stack.push(head);
        while (head.next != null) {
            stack.push(head.next);
            head = head.next;
        }
        var node = stack.pop();
        var result = node;

        while (!stack.isEmpty()) {
            node.next = stack.pop();
            node = node.next;
        }
        node.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode_1 = new ListNode(1);
        ListNode listNode_2 = new ListNode(2);
        ListNode listNode_3 = new ListNode(3);

        listNode_1.next = listNode_2;
        listNode_2.next = listNode_3;

        System.out.println(ReverseList(listNode_1));
        System.out.println(ReverseListByStack(listNode_1));
    }
}
