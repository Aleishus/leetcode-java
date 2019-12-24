package heap;

import java.util.Arrays;

public class Solution_703 {


    int[] heap;
    int count = 0;
    int k;

    public Solution_703( int k, int[] nums ) {
        heap = new int[k];
        Arrays.fill(heap,Integer.MAX_VALUE);
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }


    private void swap( int[] num, int i, int j ) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

    private void buildMinHeap( int[] nums, int noLeaf ) {
        int left = 2 * noLeaf + 1;
        int right = left + 1;
        int lower = noLeaf;
        if (left < nums.length && nums[left] < nums[lower]) {
            lower = left;
        }
        if (right < nums.length && nums[right] < nums[lower]) {
            lower = right;
        }
        if (lower != noLeaf) {
            swap(nums, lower, noLeaf);
            buildMinHeap(nums, lower);
        }
    }


    public int add( int val ) {
        if (count < k) {
            heap[count++] = val;
            for (int i = count / 2; i >= 0; i--) {
                buildMinHeap(heap, i);
            }
        } else if (val > heap[0]) {
            heap[0] = val;
            buildMinHeap(heap, 0);
        }
        return heap[0];
    }
   //todo 效率不行
    public static void main( String[] args ) {
        Solution_703 h = new Solution_703(3, new int[]{4,5,8,2});
        System.out.println(h.add(3));
        System.out.println(h.add(5));
        System.out.println(h.add(10));
        System.out.println(h.add(9));
        System.out.println(h.add(4));
    }
}
