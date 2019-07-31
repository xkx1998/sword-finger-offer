package xukexiang;

import java.util.ArrayList;
import java.util.Stack;

public class Main03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        ListNode head = listNode;
        if (head == null) {
            return list;
        }

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
