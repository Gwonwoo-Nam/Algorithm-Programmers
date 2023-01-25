public class Level2_DivideElectricity {

    public static boolean[] visited;

    public static int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < wires.length; i++) { //와이어의 커넥션을 순회하면서 끊음
            int leftTower = wires[i][0];
            int rightTower = wires[i][1];
            int leftcount = 0;
            int rightcount = 0;
            visited = new boolean[wires.length]; //참조한 커넥션의 정보
            visited[i] = true; //끊은 노드는 방문처리해서 다시 확인되지 않음.
            getConnections(n, leftTower, wires);
            for (int j = 0; j < visited.length; j++) {
                if (visited[j]) {
                    leftcount++;
                }
                visited[j] = false;
            }
            visited[i] = true; //끊은 노드는 방문처리해서 다시 확인되지 않음.
            getConnections(n, rightTower, wires);
            for (boolean visit : visited) {
                if (visit) {
                    rightcount++;
                }
            }
            answer = Math.min(answer, Math.abs(leftcount-rightcount));
        }
        return answer;
    }

    /**
     * 연결을 순회하면서 확인
     */
    public static void getConnections(int n, int currentTower, int[][] wires) {
        //현재 송전탑 정보를 인자로 받음
        for (int i = 0; i < wires.length; i++) { //연결을 순회하면서 현재 타워와 일치하는 연결을 찾는다.
            if ((currentTower == wires[i][0] && !visited[i])) { //방문하지 않은 연결된 노드로 이동
                visited[i] = true;
                getConnections(n, wires[i][1], wires); //i번째 노드로 이동
            }
            if ((currentTower == wires[i][1] && !visited[i])) {
                visited[i] = true;
                getConnections(n, wires[i][0], wires); //i번째 노드로 이동
            }
        }
    }

    public static void main(String[] args) {
        int[][] wires = {{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};
        System.out.println(solution(7, wires));
    }
}
