
import java.util.PriorityQueue;

public class KClosestFromOrigin
{
    public int[][] KClosest(int[][] points, int k) {
        PriorityQueue<HeapNode> pq = new PriorityQueue<>((HeapNode h1, HeapNode h2) -> Double.compare(h1.distanceFromOrigin, h2.distanceFromOrigin));

        for(int i = 0; i < points.length; i++) {
            pq.add(new HeapNode(i, points[i][0], points[i][1]));
        }

        int[][] results = new int[k][2];

        for(int i =0 ; i < k ;i++) {
            HeapNode min = pq.poll();
            results[i] = points[min.index];
        }

        return results;
    }
}

class HeapNode {
    int index;
    double distanceFromOrigin;
    HeapNode(int index, int x, int y) {
        this.index = index;
        distanceFromOrigin = distanceFromOrigin(x, y); 
    }
    private double distanceFromOrigin(int x, int y) {
        return Math.sqrt(Math.powExact(x, 2) + Math.powExact(y, 2));
    }


}
