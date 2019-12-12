package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates( ListNode head ) {
        ListNode tHead = head;
        ListNode pre = null;
        while (head != null) {
            if (pre == null) {
                pre = head;
            } else {
                if (pre.val == head.val) {
                    pre.next = head.next;
                } else {
                    pre = head;
                }
            }
            head = head.next;
        }
        return tHead;
    }
}
