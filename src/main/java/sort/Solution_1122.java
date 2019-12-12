package sort;

import java.util.Arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1122 {

    public int[] relativeSortArray( int[] arr1, int[] arr2 ) {
        Node[] root = new Node[arr2.length + 1];
        int[] map = new int[1001];
        for (int i = 0; i < arr2.length; i++) {
            map[arr2[i]] = i + 1;
        }
        L:
        for (int v : arr1) {
            Node n = new Node(v);
            if (map[v] != 0) {
                n.next = root[map[v] - 1];
                root[map[v] - 1] = n;
            } else {

                if (root[arr2.length] == null) {
                    root[arr2.length] = n;
                } else {
                    Node r = root[arr2.length];
                    if (n.val < r.val) {
                        n.next = r;
                        root[arr2.length] = n;
                    } else {
                        Node next = r.next;
                        while (next != null) {
                            if (n.val < next.val) {
                                r.next = n;
                                n.next = next;
                                continue L;
                            }
                            r = next;
                            next = next.next;
                        }
                        r.next = n;
                    }
                }
            }
        }
        int j = 0;
        for (int i = 0; i < root.length; i++) {
            while (root[i] != null) {
                arr1[j] = root[i].val;
                root[i] = root[i].next;
                j++;
            }
        }

        return arr1;

    }

    public int[] relativeSortArray1( int[] arr1, int[] arr2 ) {

        int[] mMap = new int[1000];
        int[] kMap = new int[1001];
        for (int i = 0; i < arr2.length; i++) {
            kMap[arr2[i]] = 1;
        }
        int m = 0;
        for (int v : arr1) {
            if (kMap[v] != 0) {
                kMap[v]++;
            } else {
                mMap[m] = v + 1;
                m++;
            }
        }

        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            int v = kMap[arr2[i]] - 1;
            for (int c = 0; c < v; c++) {
                arr1[j] = arr2[i];
                j++;
            }
        }

        int[] other = new int[arr1.length - j];
        System.arraycopy(mMap, 0, other, 0, other.length);
        Arrays.sort(other);
        for (int i = 0; i < other.length; i++) {
            arr1[j] = other[i] - 1;
            j++;
        }

        return arr1;

//todo 可以使用一个map  数组 解决  注意数组本身就是有序的
    }


    static class Node {

        public Node( int val ) {
            this.val = val;
        }

        Node next;
        int val;
    }


    public static void main( String[] args ) {
        int[] arr1 = {33, 22, 48, 4, 39, 36, 41, 47, 15, 45};
        int[] arr2 = {22, 33, 48, 4};

        System.out.println(Arrays.toString(new Solution_1122().relativeSortArray1(arr1, arr2)));

      /*  Node root = null;
        L:
        for (int i : arr1) {
            Node n = new Node(i);
            if (root == null) {
                root = n;
            } else if (n.val < root.val) {
                n.next = root;
                root = n;
            } else {
                Node par = root;
                Node nxt = root.next;
                while (nxt != null) {
                    if (n.val < nxt.val) {
                        par.next = n;
                        n.next = nxt;
                        continue L;
                    }
                    par = nxt;
                    nxt = nxt.next;
                }
                par.next = n;
            }
        }*/

    }

}
