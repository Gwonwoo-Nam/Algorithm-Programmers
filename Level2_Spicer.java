import java.util.PriorityQueue;

public class Level2_Spicer {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int e : scoville) {
            pq.add(e);
        }
        while (pq.size() >= 2 && pq.peek() < K) { //최소값이 K이상 일 때까지 섞는다.
            pq.add(pq.poll() + 2 * pq.poll()); //가장 맵지않은 + 두번째로 맵지 않은 음식 조합을 집어넣기
            answer++;
        }
        if (pq.peek() < K) {
            return -1;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] scoville = {1, 2,3,9,10,12};
        System.out.println(solution(scoville, 7));

    }

}
