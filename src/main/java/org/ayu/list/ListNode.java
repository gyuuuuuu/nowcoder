package org.ayu.list;

public class ListNode {
    public int value;
    public ListNode next = null;

    public ListNode(int val) {
        this.value = val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value).append(", ");
        while (next != null) {
            sb.append(next.value).append(", ");
            next = next.next;
        }
        return sb.toString();
    }
}
