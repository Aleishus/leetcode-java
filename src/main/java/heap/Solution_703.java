package heap;

public class Solution_703 {

  int k;
  int[] nums;
  int m;

  public Solution_703(int k, int[] nums) {
    this.k = k;
    this.nums = nums;
    this.m = nums.length / 2 - 1; // m 表示满二叉树最后一个非叶子节点
    for (int i = m; i >= 0; i--) {
      buildMaxHeap(nums, i);
    }

  }


  private void swap(int[] num, int i, int j) {
    int tmp = num[i];
    num[i] = num[j];
    num[j] = tmp;
  }


  private void buildMaxHeap(int[] nums, int noLeaf) {
    int left = 2 * noLeaf + 1;
    int right = left + 1;
    int big = noLeaf;
    if (nums[left] > nums[big]) {
      big = left;
    }
    if (right < nums.length && nums[right] > nums[big]) {
      big = right;
    }
    if (big != noLeaf) {
      swap(nums, big, noLeaf);
      if (big <= m) {
        buildMaxHeap(nums, big);
      }
    }
  }


  public int add(int val) {




    return nums[k - 1];

  }
}
