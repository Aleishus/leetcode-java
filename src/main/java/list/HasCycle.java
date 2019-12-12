package list;

import java.util.HashSet;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class HasCycle {

    //记录法
    public boolean hasCycle( ListNode head ) {

        Set<Integer> back = new HashSet<>(8);
        while (head != null) {
            if (back.contains(head.hashCode())) {
                return true;
            }
            back.add(head.hashCode());
            head = head.next;
        }

        return false;
    }


    //环形双指针追赶法
    public boolean hasCycleRun( ListNode head ) {
        ListNode fastHead = head;
        while (fastHead != null && fastHead.next != null) {
            head = head.next;
            fastHead = fastHead.next.next;
            if (fastHead != null && head.val == fastHead.val) {
                return true;
            }
        }

        return false;
    }

    public static void main( String[] args ) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = two;
        System.out.println(new HasCycle().hasCycleRun(one));
    }

}
