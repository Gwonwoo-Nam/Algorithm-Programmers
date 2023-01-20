import java.util.PriorityQueue;

public class Level2_DefenseGame {
    public static int solution(int n, int k, int[] enemy) {
        return isDefensable(n,k,enemy);

    }

    private static int isDefensable(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int round = 0; round < enemy.length; round++) {
            pq.add(enemy[round]);
            if (pq.size() > k) {
                n -= pq.poll();
            }
            if (n < 0)
                return round;
        }
        return enemy.length;
    }

    public static void main(String[] args) {

        int[] enemy = {4,2,4,5,3,3,1};
        System.out.println(solution(7, 3, enemy));

    }
}
