public class RemoveIntervalTest {
    public static void main(String[] args) {
        RemoveInterval r = new RemoveInterval();
        int[][] intervals = new int[][] {{-3, 1}, {2, 3}};
        int[] toBeRemoved = new int[]{-2, -1};
        r.removeInterval(intervals, toBeRemoved);
    }
    
}
