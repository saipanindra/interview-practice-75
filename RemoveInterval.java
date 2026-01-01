import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveInterval {

    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {

        List<List<Integer>> result = new ArrayList<>();

        for (int[] interval : intervals) {
            result.addAll(process(interval, toBeRemoved));
        }

        return result;
    }

    private List<List<Integer>> process(int[] interval, int[] toBeRemoved) {
        if (toBeRemoved[1] - 1 < interval[0] || toBeRemoved[0] > interval[1] - 1) {
            return new ArrayList<>(Arrays.asList(Arrays.asList(interval[0], interval[1])));
        }

        if (toBeRemoved[0] <= interval[0] && toBeRemoved[1] >= interval[1]) {
            return new ArrayList<>();
        }

        if (toBeRemoved[0] > interval[0] && toBeRemoved[1] >= interval[1]) {
            int x = interval[0];
            int y = toBeRemoved[0];
            toBeRemoved[0] = interval[1];
            return new ArrayList<>(Arrays.asList(Arrays.asList(x, y)));
        }
        if (toBeRemoved[0] <= interval[0] && toBeRemoved[1] >= interval[0]) {
            int x = toBeRemoved[1];
            int y = interval[1];
            toBeRemoved[1] = interval[0];
            return new ArrayList<>(Arrays.asList(Arrays.asList(x, y)));

        }
        if (toBeRemoved[0] > interval[0] && toBeRemoved[1] < interval[1]) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(interval[0], toBeRemoved[0]));
            result.add(Arrays.asList(toBeRemoved[1], interval[1]));
            toBeRemoved[0] = Integer.MIN_VALUE+1;
            toBeRemoved[1] = Integer.MIN_VALUE+2;
            return result;

        }
        return new ArrayList<>();

    }
}
