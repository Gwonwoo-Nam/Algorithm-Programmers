public class Level2_JumpAndTeleport {
    public static int solution(int n) {
        String s = Integer.toBinaryString(n);
        int count=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='1') {
                count++;
            }
        }
        return count;
    }
/*
    public static int solution(int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        visited[0] = true;
        queue.offer(new int[] {0, 0, 0}); //현재 숫자, 건전지 사용량
        while (true) {
            int[] temp = queue.poll();
            int number = temp[0];
            int k = temp[1];
            int energy = temp[2];

            if (number == n) {
                return k;
            }
            if (number + 1 <= n && visited[number + 1] == false && energy == 0) {
                visited[number + 1] = true; //방문 처리
                queue.offer(new int[] {number + 1, k + 1, 1}); //건전지 1 사용
            }
            if (2 * number <= n && visited[number * 2] == false) {
                queue.offer(new int[] {number * 2, k, 0}); //텔레포트
            }
        }
    }*/



    /*public static int minK = Integer.MAX_VALUE;

    public static int solution(int n) {
        boolean[] visited = new boolean[n + 1];

        visited[0] = true;
        recur(0,0, visited, n, true);
        return minK;
    }

    public static void recur(int number, int k, boolean[] visited, int n, boolean energy) {
        if (number == n) {
            minK = Math.min(minK, k);
            return ;
        }
        visited[number] = true;
        if (number + 1 <= n && visited[number + 1] == false && energy == true) {
             //방문 처리
            recur(number + 1, k + 1, visited, n, false); //건전지 1 사용
            visited[number + 1] = false;
        }
        if (2 * number <= n && visited[number * 2] == false) {
            recur(number * 2, k, visited, n, true); //텔레포트
            visited[number * 2] = false;
        }
    }*/

    public static void main(String[] args) {

        System.out.println(solution(5));
    }
}
