import java.util.*;

public class Test01 {
    public static int solution(int[] stats) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < stats.length; i++) {
            if (s.isEmpty()) {
                answer++;
            } else if (s.peek() < stats[i]) {
                s.pop();
            } else {
                s.pop();
                answer++; //작은 값
            }
            s.push(stats[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] words = {5, 3, 4, 6, 2, 1};
        System.out.println(solution(words));
    }
}
/* if (stats[i] > max) {
                s.push(new int[]{i,stats[i]}); //인덱스 최대값 보관
            }

            for (int j=s.peek()[0];j<i;j++) {
                if (s.peek()[1] > stats[j]) {
                    answer++;
                    s.pop();
                    break;
                }
            }
            max = Math.min(stats[i],max);

            if (stats[i] < min) {
                min = Math.min(stats[i], min);
                answer++;
            }*/
