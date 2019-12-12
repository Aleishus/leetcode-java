package list;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class RemoveElements {

    public ListNode removeElements( ListNode head, int val ) {
        ListNode pre = null;
        ListNode tHead = head;
        while (head != null) {
            if (head.val == val) {
                if (pre == null) {
                    head = head.next;
                    tHead = head;
                    continue;
                }
                pre.next = head.next;
            } else {
                pre = head;
            }
            head = head.next;
        }
        return tHead;
    }

    public static void main( String[] args ) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(1);
        one.next = two;
        two.next = three;
        ListNode r = new RemoveElements().removeElements(one, 1);
    }
}
