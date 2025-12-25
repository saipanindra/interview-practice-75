public class NumberOfIslandsTester {
    public static void main(String[] args) {
        NumberOfIslands n = new NumberOfIslands();
        char[][] grid =  new char[][]{
            {'0','1','1','1','0'},
            {'0','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}};

        char[][] grid2 = new char[][]{
            {'1','1','0','0','1'},
            {'1','1','0','0','1'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}};
        System.out.println(n.numIslands(grid2));
    }
    
}
