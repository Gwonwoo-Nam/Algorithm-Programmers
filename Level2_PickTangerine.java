
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Level2_PickTangerine {
    public static int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> box = new HashMap<>();
        for (int e : tangerine) {
            if (box.containsKey(e)) {
                box.put(e, box.get(e) + 1);
            }
            else {
                box.put(e, 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Map.Entry e : box.entrySet()) {
            pq.add((Integer)e.getValue());
        }
        int count = 0;
        while (!pq.isEmpty()) {
            k -= pq.poll();
            count++;
            if (k <=0) {
                return count;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(6, tangerine));

    }
}
