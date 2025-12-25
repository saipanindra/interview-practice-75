
class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int result = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                result += dfs(grid, i, j, visited);
                }
            }
        return result;
    }

    int dfs(char[][] grid, int i, int j, boolean[][] visited) {

        if (visited[i][j] == true) {
            return 0;
        }

        if (grid[i][j] == '0') {
            return 0;
        }

        visited[i][j] = true;
        if (i+1 < grid.length) {
            dfs(grid, i+1, j, visited);
        }
        if (j+1 < grid[0].length) {
            dfs(grid, i, j+1, visited);
        }
        if (i - 1 >= 0) {
            dfs(grid, i-1, j, visited);
        }
        if (j -1 >=0) {
            dfs(grid, i, j-1, visited);
        }
        return 1;
    }

}