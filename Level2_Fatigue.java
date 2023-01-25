import java.util.Arrays;

public class Level2_Fatigue {

    static boolean[] visited;
    static int MAX = 0;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        visit(0, dungeons, k);
        return MAX;
    }

    public static void visit(int depth, int[][] dungeons, int k) {
        MAX = Math.max(depth, MAX);
        if (depth == dungeons.length) {
            return;
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (k >= dungeons[i][0] && !visited[i]) { //최소 피로도 이상
                visited[i] = true;
                visit(depth + 1, dungeons, k - dungeons[i][1]);
                visited[i] = false;
            }
        }
    }



    public static void main(String[] args) {
        int[][] dungeons = {{40, 20}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
        int k = 40;

        System.out.println(solution(k, dungeons));

    }
}
