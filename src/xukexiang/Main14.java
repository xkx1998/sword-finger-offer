package xukexiang;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Main14 {
    /**
     * MyWay，将链表遍历一遍放到List里面
     * 然后再返回倒数第k个元素
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null && k > 0) return null;
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        if((list.size() > 0 && k <= 0) || (list.size() <= k)) return null;
        return list.get(list.size() - k);
    }
}
