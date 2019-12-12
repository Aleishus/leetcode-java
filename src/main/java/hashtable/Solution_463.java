package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_463 {

    public int islandPerimeter( int[][] grid ) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 1) {
                    int edge = 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        edge--;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        edge--;
                    }
                    if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                        edge--;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        edge--;
                    }

                    sum += edge;
                }

            }

        }
        return sum;

    }

    public static void main( String[] args ) {
        int[][] gird =

                {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};

        System.out.println(new Solution_463().islandPerimeter(gird));
    }

}
