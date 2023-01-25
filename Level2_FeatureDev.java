import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level2_FeatureDev {
    public static  int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i =0;i<progresses.length;i++) {
            int e = (100 - progresses[i])/speeds[i]; //완료일을 큐에 추가
            queue.add(e);
        }
        int max = queue.peek();//첫 값으로 시작
        int count = 0;
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            while (!queue.isEmpty() && queue.peek() <= max) {
                queue.remove();
                count++;
            }
            list.add(count);
            count = 0;
            if (queue.isEmpty()) {
                break;
            }
            max = queue.peek();
        }

        int[] answer = new int[list.size()];
        for (int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        System.out.println(Arrays.toString(solution(progresses,speeds)));


    }
}
