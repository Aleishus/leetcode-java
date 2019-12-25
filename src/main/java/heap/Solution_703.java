package heap;

import java.util.Arrays;

public class Solution_703 {


    int[] heap;
    int count = 0;
    int k;

    public Solution_703( int k, int[] nums ) {
        heap = new int[k];
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

    //下滤
    private void down( int[] nums, int noLeaf ) {
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
            down(nums, lower);
        }
    }

    //上过滤
    private void up(int[] nums,int noLeaf){
        if(noLeaf == 0){
            return;
        }
        int parent = (noLeaf-1)/2;
        if(nums[parent]>nums[noLeaf]){
            swap(nums,parent,noLeaf);
            up(nums,parent);
        }

    }


    public int add( int val ) {
        if (count < k) {
            heap[count++] = val;
            up(heap,count-1);
        } else if (val > heap[0]) {
            heap[0] = val;
            down(heap, 0);
        }
        return heap[0];
    }
   //todo 上滤用于组装 （大）小顶堆，元素在尾部添加， 下滤用于替换求最大，元素在头部添加
    public static void main( String[] args ) {
        Solution_703 h = new Solution_703(3, new int[]{4,5,8,2});
        System.out.println(h.add(3));
        System.out.println(h.add(5));
        System.out.println(h.add(10));
        System.out.println(h.add(9));
        System.out.println(h.add(4));
    }
}
