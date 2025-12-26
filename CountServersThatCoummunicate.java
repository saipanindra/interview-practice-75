
public class CountServersThatCoummunicate {

    public int countServers(int[][] grid) {

        int[] rowCounter = new int[grid.length];
        int[] colCounter = new int[grid[0].length];

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    rowCounter[i]++;
                    colCounter[j]++;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && Math.max(rowCounter[i], colCounter[j]) > 1) {
                    result++;
                }
            }
            
        }
        return result;
    }
}
