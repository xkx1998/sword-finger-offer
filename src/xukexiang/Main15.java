package xukexiang;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Main15 {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode preNode = dummy.next;
        ListNode curNode = preNode.next;

        while(curNode != null) {
            preNode.next = curNode.next;
            curNode.next = dummy.next;
            dummy.next = curNode;
            curNode = preNode.next;
        }
        return dummy.next;
    }
}
