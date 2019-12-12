package sort;

import java.util.Arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1030 {

    int head = 0;
    int rear = 0;

    public int[][] allCellsDistOrder( int R, int C, int r0, int c0 ) {
        int[][] queue = new int[R * C][2];
        int[][] map = new int[R][C];
        queue[rear][0] = r0;
        queue[rear][1] = c0;
        map[r0][c0] = 1;
        rear++;
        while (head != rear) {
            int[] q = queue[head++];
            int r = q[0];
            int c = q[1];

            if (c - 1 >= 0 && map[r][c - 1] == 0) {
                queue[rear][0] = r;
                queue[rear][1] = c - 1;
                map[r][c - 1] = 1;
                rear++;

            }

            if (c + 1 < C && map[r][c + 1] == 0) {
                queue[rear][0] = r;
                queue[rear][1] = c + 1;
                map[r][c + 1] = 1;
                rear++;

            }

            if (r - 1 >= 0 && map[r - 1][c] == 0) {
                queue[rear][0] = r - 1;
                queue[rear][1] = c;
                map[r - 1][c] = 1;
                rear++;

            }

            if (r + 1 < R && map[r + 1][c] == 0) {
                queue[rear][0] = r + 1;
                queue[rear][1] = c;
                map[r + 1][c] = 1;
                rear++;

            }

        }
        return queue;
    }

    //todo 4ms的解法学习下
    public int[][] allCellsDistOrderX(int R, int C, int r0, int c0) {
        int[][] ans=new int[R*C][2];
        ans[0][0]=r0;
        ans[0][1]=c0;
        int point_x=r0,point_y=c0;
        int order=1;
        while(order<R*C){
            point_x--;
            while(point_x<r0){
                if(point_x>=0&&point_y<=C-1){
                    ans[order][0]=point_x;
                    ans[order++][1]=point_y;
                }
                point_x++;
                point_y++;
            }
            while(point_y>c0){
                if(point_x<=R-1&&point_y<=C-1){
                    ans[order][0]=point_x;
                    ans[order++][1]=point_y;
                }
                point_x++;
                point_y--;
            }
            while(point_x>r0){
                if(point_x<=R-1&&point_y>=0){
                    ans[order][0]=point_x;
                    ans[order++][1]=point_y;
                }
                point_x--;
                point_y--;
            }
            while (point_y<c0){
                if(point_x>=0&&point_y>=0){
                    ans[order][0]=point_x;
                    ans[order++][1]=point_y;
                }
                point_x--;
                point_y++;
            }
        }
        return ans;
    }

    public static void main( String[] args ) {
        int[][] res = new Solution_1030().allCellsDistOrder(2, 3, 1, 2);
        for (int i = 0; i < res.length; i++) {
            System.out.printf("%s,", Arrays.toString(res[i]));
        }
    }
}
