package list;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class GetIntersectionnNode {

    //高级解法
    //https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/tu-jie-xiang-jiao-lian-biao-by-user7208t/

    public ListNode getIntersectionnNode( ListNode headA, ListNode headB ) {
        int l1 = 0, l2 = 0, rl1 = 0;
        ListNode h1 = headA, h2 = headB;
        while (h1 != null) {
            l1++;
            h1 = h1.next;
        }
        while (h2 != null) {
            l2++;
            h2 = h2.next;
        }
        if (l1 == 0 || l2 == 0) {
            return null;
        }

        ListNode tmp = null, rHead = null;
        h2 = headB;
        while (h2 != null) {
            rHead = h2;
            h2 = h2.next;
            rHead.next = tmp;
            tmp = rHead;
        }

        h1 = headA;
        while (h1 != null) {
            rl1++;
            h1 = h1.next;
        }
        int M = ( l1 + rl1 - 1 - l2 ) / 2;
        if (M < 0) {
            h1 = null;
        } else {
            int X = l1 - M;
            int i = 1;
            h1 = headA;
            while (h1 != null && i <= M) {
                h1 = h1.next;
                i++;
            }
            h2 = rHead;
            i = 1;
            while (h2 != null && i <= ( X - 1 )) {
                h2 = h2.next;
                i++;
            }

            if (h1.val != h2.val) {
                h1 = null;
            }
        }

        tmp = null;
        h2 = rHead;
        while (h2 != null) {
            headB = h2;
            h2 = h2.next;
            headB.next = tmp;
            tmp = headB;
        }
        return h1;
    }

    public static void main( String[] args ) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);

        ListNode r = new GetIntersectionnNode().getIntersectionnNode(two, one);
    }

}
