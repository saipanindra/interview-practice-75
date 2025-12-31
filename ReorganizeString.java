
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {

    public String reorganizeString(String s) {

        Map<Character, Integer> h = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++) {
            //h.computeIfPresent(s.charAt(i), (key, value) -> value++);
            h.merge(s.charAt(i), 1, Integer::sum);
        }


        PriorityQueue<HeapNodeForThisProblem> pq = new PriorityQueue<>((HeapNodeForThisProblem h1, HeapNodeForThisProblem h2) -> Integer.compare(h2.frequency, h1.frequency));
        for(Character key: h.keySet()) {
            pq.add(new HeapNodeForThisProblem(key, h.get(key)));

        }

        StringBuilder result = new StringBuilder(); 
        HeapNodeForThisProblem previous = null;
        while(!pq.isEmpty()) {

            HeapNodeForThisProblem mostFrequent  = pq.poll();
            result.append(mostFrequent.c);

            if (previous!= null) {
                pq.add(previous);
            }

            mostFrequent.frequency--;
            if (mostFrequent.frequency == 0) {
                previous = null;
            } else {
                previous = mostFrequent;
            }
        }

        if (pq.isEmpty() && previous != null) {
            return "";
        }

        return result.toString();


    }


    
}
class HeapNodeForThisProblem {
    Character c;
    Integer frequency;

    public HeapNodeForThisProblem(Character  c, int frequency) {
        this.c = c;
        this.frequency = frequency;
    }
    
}
