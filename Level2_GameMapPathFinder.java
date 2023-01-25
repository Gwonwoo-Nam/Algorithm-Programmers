import java.util.LinkedList;
import java.util.Queue;

public class Level2_GameMapPathFinder {

    static int answer = -1;
    static int m;
    static int n;
    static boolean[][] visited;

    public static void recur(Queue<int[]> queue, int[][] maps) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            int x = temp[0];
            int y = temp[1];
            int distance = temp[2];


            if (x == m -1  && y == n-1) {
                answer = distance;
                return ;
            }

            for (int i = 0; i < 4; i++) {
                if (x+dx[i] < m && y+dy[i] < n && x+dx[i] >= 0 && y+dy[i] >= 0) { //이동할 곳이 맵의 범위 내에서
                    if (visited[x + dx[i]][y + dy[i]] == false && maps[x + dx[i]][y + dy[i]] == 1) { //방문한적이 없고 장애물이 아닌 경우
                        queue.add(new int[] {x + dx[i], y + dy[i], distance + 1}); //다음에 탐색할 Queue로 추가한다.
                        visited[x+dx[i]][y+dy[i]] = true;
                    }
                }
            }
        }
    }

    public static int solution(int[][] maps) {
        m = maps.length;
        n = maps[0].length;
        visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0, 1});
        visited[0][0] = true;
        recur(queue, maps);
        return answer;
    }

    public static void main(String[] args) {
        int[][] maps = {{1,1},{1,1}};
        System.out.println(solution(maps));
    }
}
