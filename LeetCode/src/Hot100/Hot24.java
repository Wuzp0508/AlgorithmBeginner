package Hot100;

/**
 * 24. Swap Nodes in Pairs
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next, node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return pre.next;
    }
}

public class Hot24 {
    public static void main(String[] args) {

    }
}
