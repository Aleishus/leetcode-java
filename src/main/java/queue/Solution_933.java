package queue;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_933 {

  int[] queue;
  int head;
  int rear;


  public Solution_933() {
    queue = new int[3000];
    head = 0;
    rear = -1;
  }


  public int ping(int t) {
    queue[++rear] = t;

    while (head != rear) {
      if (queue[rear] - queue[head] > 3000) {
        head++;
      } else {
        break;
      }
    }

    return rear - head + 1;
  }
}
