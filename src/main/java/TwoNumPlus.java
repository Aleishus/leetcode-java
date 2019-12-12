import java.math.BigInteger;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class TwoNumPlus {

    public ListNode addTwoNumbers( ListNode l1, ListNode l2 ) {
        StringBuilder sb1 = new StringBuilder(6);
        StringBuilder sb2 = new StringBuilder(6);
        visitList(l1, sb1);
        visitList(l2, sb2);
        BigInteger  x =  new BigInteger(sb1.toString());
        BigInteger y = new BigInteger(sb2.toString());
        BigInteger sum =  x.add(y);
        String rs = sum.toString();
        int len = rs.length() - 1;
        ListNode root = new ListNode(Character.getNumericValue(rs.charAt(len)));
        ListNode tmp = root ;
        for (int i = len - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(Character.getNumericValue(rs.charAt(i)));
            tmp.next = newNode;
            tmp = newNode ;

        }
        return root;
    }

    public static void visitList( ListNode n, StringBuilder sb ) {
        if (n != null && n.next != null) {
            visitList(n.next, sb);
        }
        sb.append(n.val);
    }



    public static void main( String... args ) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;

        TwoNumPlus twoNumPlus = new TwoNumPlus() ;
       ListNode res =  twoNumPlus.addTwoNumbers(n1,m1);



    }


    static class ListNode {

        int val;
        ListNode next;

        ListNode( int x ) {
            val = x;
        }
    }

}
