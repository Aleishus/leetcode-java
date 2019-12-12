package list;

import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class ReverseList {

    public ListNode reverseList( ListNode head ) {
        ListNode tmp = null;
        ListNode nHead = null;
        while (head != null) {
            nHead = head;
            head = head.next;
            nHead.next = tmp;
            tmp = nHead;

        }
        return nHead;
    }
}
