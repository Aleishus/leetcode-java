package list;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class IsPalindrome {

    public boolean isPalindrome( ListNode head ) {

        ListNode fastNode = head;
        ListNode slow = head;
        ListNode tmp = null;
        ListNode nHead = null;
        while (fastNode != null && fastNode.next != null) {
            slow = slow.next;
            fastNode = fastNode.next.next;
        }
        while (slow != null) {
            nHead = slow;
            slow = slow.next;
            nHead.next = tmp;
            tmp = nHead;
        }
        while (nHead != null) {
            if (head.val != nHead.val) {
                return false;
            }
            head = head.next;
            nHead = nHead.next;
        }

        return true;

    }

    public static void main( String[] args ) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(1);
        one.next = two;
        two.next = three;


        System.out.println(new IsPalindrome().isPalindrome(one));
    }


}
