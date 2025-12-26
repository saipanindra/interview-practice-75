public class CountServersThatCommunicateTester {
    public static void main(String[] args) {
        CountServersThatCoummunicate c = new CountServersThatCoummunicate();
        int[][] grid = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(c.countServers(grid));
        int[][] grid2 = {{1,0},{1,1}};
        System.out.println(c.countServers(grid2));
        int[][] grid3 = {{1,0},{0,1}};
        System.out.println(c.countServers(grid3));
    }
    

}
