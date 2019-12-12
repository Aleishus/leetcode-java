package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MiddleNode {

    public ListNode middleNode( ListNode head ) {
        List<ListNode> ref = new ArrayList<>(50);
        while (head != null) {
            ref.add(head);
            head = head.next;
        }
        return ref.get(ref.size() / 2);
    }

    public ListNode middleNodeFast( ListNode head ) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
