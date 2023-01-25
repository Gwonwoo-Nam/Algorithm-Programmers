import java.util.*;
public class Test02 {
    public static int solution(int[] stats) {
        int answer = 0;
        int flag = 0;
        Queue<Integer> s = new LinkedList<>();
        for (int i = 0; i < stats.length; i++) {
            if (s.isEmpty() || s.size() == 1) {
                s.add(stats[i]);
                continue;
            }
            int q1 = s.poll(); //먼 인덱스
            int q2 = s.peek(); //가까운 인덱스
            if (flag == 0 && q1 > q2) {
                flag = 1;
                answer++;
            } else if (flag ==0 && q1 == q2) {
                flag = 1;
                answer++;
                s.remove();
                s.add(q2+1); //새로 추가한 node 추가
            }
            if (q1 < q2 && stats[i] >= q2) { //세 숫자가 오름차순
                s.remove();
                s.add(q2-1); //새로 추가한 node 추가
                answer++;
            } else if (q1 > q2 && stats[i] <= q2) { //세 숫자가 내림차순
                s.remove();
                s.add(q2+1); //새로 추가한 node 추가
                answer++;
            }
            s.add(stats[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] words = {3,3,-1,3,2,2};
        System.out.println(solution(words));
    }
}
