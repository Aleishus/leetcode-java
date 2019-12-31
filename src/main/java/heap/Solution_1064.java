package heap;

public class Solution_1064 {

  public int lastStoneWeight(int[] stones) {

    int len = stones.length;
    //构构造大顶堆
    for (int i = stones.length / 2; i >= 0; i--) {
      down(stones, i);
    }
    int z = 0;
    while (len != 0) {
      int y = stones[0];
      stones[0] = 0;
      down(stones, 0);
      int x = stones[0];
      z = y - x;
      stones[0] = z;
      if (z == 0) {
        len -= 2;
        down(stones, 0);
      } else {
        len--;
        if (z < x) {
          down(stones, 0);
        }
      }

    }
    return z;

  }

//下滤
  private void down(int[] heap, int i) {
    int left = 2 * i + 1;
    int right = left + 1;
    int max = i;
    if (left < heap.length && heap[left] > heap[max]) {
      max = left;
    }
    if (right < heap.length && heap[right] > heap[max]) {
      max = right;
    }

    if (i != max) {
      swap(heap, max, i);
      down(heap, max);
    }
  }


  private void swap(int[] heap, int i, int j) {
    int tmp = heap[i];
    heap[i] = heap[j];
    heap[j] = tmp;
  }

  public static void main(String[] args) {
    int[] ss = {2, 7, 4, 1, 8, 1};
    Solution_1064 s = new Solution_1064();
    System.out.println(s.lastStoneWeight(ss));
  }
}
