package arrays;

import java.util.Arrays;

public class Solution_26 {

  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }
    int prePos = 0; //最后一个不重复元素的位置
    int sumMove = 0;//移动次数总和
    int move = 0;
    for (int i = prePos + 1; i < nums.length - sumMove; i++) {
      if (nums[i] == nums[prePos]) {
        move++;
      } else {
        //把相同的覆盖
        //todo 这里是败笔，只需要移动一个元素即可，不需要整体移动，可以使用双指针解法
        for (int j = i, x = prePos + 1; j < nums.length - sumMove; j++, x++) {
          nums[x] = nums[j];
        }
        prePos++;
        sumMove += move;
        move = 0;
        i = prePos;
      }

    }

    return prePos + 1;

  }

  //双指针解法
  public int removeDuplicatesToDo(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }


  public static void main(String[] args) {
    int[] nums = {1, 1, 2};

    System.out.println(new Solution_26().removeDuplicates(nums));

    System.out.println(Arrays.toString(nums));
  }
}
