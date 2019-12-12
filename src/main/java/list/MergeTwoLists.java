package list;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists( ListNode l1, ListNode l2 ) {

        ListNode tHead = null, cur = null;

        while (l1 != null && l2 != null) {

            cur = l1.val<=l2.val?l1:l2;
            if(tHead == null){
                tHead = cur;
            }



        }
        return tHead;
    }

    public static void main( String[] args ) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(4);
        one.next = two;
        two.next = three;

        ListNode one1 = new ListNode(1);
        ListNode two2 = new ListNode(3);
        ListNode three3 = new ListNode(4);
        one1.next = two2;
        two2.next = three3;
        ListNode r = new MergeTwoLists().mergeTwoLists(one, one1);


    }
}
