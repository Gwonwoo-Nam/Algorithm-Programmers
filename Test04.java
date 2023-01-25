import java.util.*;
public class Test04 {
    public static int solution(int num) {
        int answer = 0;

        for (int i=1;i<=num;i++) {
            String s = Integer.toString(i);
            if (s.contains("3") || s.contains("6") || s.contains("9")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(10));
    }
}
