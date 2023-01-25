import java.util.LinkedList;
import java.util.Queue;

public class Level2_TruckCrossingBridge {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> bridgeQueue = new LinkedList<>();
        Queue<Integer> weightQueue = new LinkedList<>();

        for (int e : truck_weights) {
            queue.add(e);//트럭 줄세우기
        }
        int time = 0;
        int totalWeight = 0;

        while (!queue.isEmpty() || !bridgeQueue.isEmpty()) {
            if (!bridgeQueue.isEmpty() && bridgeQueue.peek() == time) { //선입 트럭이 나갈 때가 되면
                bridgeQueue.poll(); //내보내준다.
                totalWeight -= weightQueue.poll(); //무게를 빼준다.
            }
            if (!queue.isEmpty() && totalWeight + queue.peek() <= weight) { //다음 트럭과 현재 무게의 합이 한도내면
                int FIweight = queue.poll();
                weightQueue.add(FIweight);
                totalWeight += FIweight; //다음 트럭을 다리에 올린다.
                bridgeQueue.add(bridge_length + time); //시간 + 건너는 시간으로 위치를 기록
            }
            time++;
        }

        return time;
    }

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(solution(bridge_length, weight, truck_weights));

    }

}
